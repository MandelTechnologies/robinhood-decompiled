package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.MAXTransferContextDto;
import com.robinhood.rosetta.eventlogging.MoneyDto;
import com.robinhood.rosetta.eventlogging.QueuedDepositContext;
import com.robinhood.rosetta.eventlogging.QueuedDepositContextDto;
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

/* compiled from: QueuedDepositContextDto.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006234567B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BY\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0006\u0010\u0015JV\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\b\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020\u000bH\u0016J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020+H\u0016J\u0018\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020+H\u0016J\b\u00101\u001a\u00020+H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u00068"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$Surrogate;)V", "amount", "Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "locality", "", "source_account", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;", "sink_account", "currency_conversion_data", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto;", "additional_data", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$AdditionalDataDto;", "entry_point", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$EntryPointDto;", "(Lcom/robinhood/rosetta/eventlogging/MoneyDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto;Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$AdditionalDataDto;Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$EntryPointDto;)V", "getAmount", "()Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "getLocality", "()Ljava/lang/String;", "getSource_account", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;", "getSink_account", "getCurrency_conversion_data", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto;", "getAdditional_data", "()Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$AdditionalDataDto;", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$EntryPointDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "EntryPointDto", "AdditionalDataDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class QueuedDepositContextDto implements Dto3<QueuedDepositContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<QueuedDepositContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<QueuedDepositContextDto, QueuedDepositContext>> binaryBase64Serializer$delegate;
    private static final QueuedDepositContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ QueuedDepositContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private QueuedDepositContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MoneyDto getAmount() {
        return this.surrogate.getAmount();
    }

    public final String getLocality() {
        return this.surrogate.getLocality();
    }

    public final MAXTransferContextDto.TransferAccountDto getSource_account() {
        return this.surrogate.getSource_account();
    }

    public final MAXTransferContextDto.TransferAccountDto getSink_account() {
        return this.surrogate.getSink_account();
    }

    public final MAXTransferContextDto.CurrencyConversionDataDto getCurrency_conversion_data() {
        return this.surrogate.getCurrency_conversion_data();
    }

    public final AdditionalDataDto getAdditional_data() {
        return this.surrogate.getAdditional_data();
    }

    public final EntryPointDto getEntry_point() {
        return this.surrogate.getEntry_point();
    }

    public /* synthetic */ QueuedDepositContextDto(MoneyDto moneyDto, String str, MAXTransferContextDto.TransferAccountDto transferAccountDto, MAXTransferContextDto.TransferAccountDto transferAccountDto2, MAXTransferContextDto.CurrencyConversionDataDto currencyConversionDataDto, AdditionalDataDto additionalDataDto, EntryPointDto entryPointDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : moneyDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : transferAccountDto, (i & 8) != 0 ? null : transferAccountDto2, (i & 16) != 0 ? null : currencyConversionDataDto, (i & 32) != 0 ? null : additionalDataDto, (i & 64) != 0 ? EntryPointDto.INSTANCE.getZeroValue() : entryPointDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueuedDepositContextDto(MoneyDto moneyDto, String locality, MAXTransferContextDto.TransferAccountDto transferAccountDto, MAXTransferContextDto.TransferAccountDto transferAccountDto2, MAXTransferContextDto.CurrencyConversionDataDto currencyConversionDataDto, AdditionalDataDto additionalDataDto, EntryPointDto entry_point) {
        this(new Surrogate(moneyDto, locality, transferAccountDto, transferAccountDto2, currencyConversionDataDto, additionalDataDto, entry_point));
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
    }

    public static /* synthetic */ QueuedDepositContextDto copy$default(QueuedDepositContextDto queuedDepositContextDto, MoneyDto moneyDto, String str, MAXTransferContextDto.TransferAccountDto transferAccountDto, MAXTransferContextDto.TransferAccountDto transferAccountDto2, MAXTransferContextDto.CurrencyConversionDataDto currencyConversionDataDto, AdditionalDataDto additionalDataDto, EntryPointDto entryPointDto, int i, Object obj) {
        if ((i & 1) != 0) {
            moneyDto = queuedDepositContextDto.surrogate.getAmount();
        }
        if ((i & 2) != 0) {
            str = queuedDepositContextDto.surrogate.getLocality();
        }
        if ((i & 4) != 0) {
            transferAccountDto = queuedDepositContextDto.surrogate.getSource_account();
        }
        if ((i & 8) != 0) {
            transferAccountDto2 = queuedDepositContextDto.surrogate.getSink_account();
        }
        if ((i & 16) != 0) {
            currencyConversionDataDto = queuedDepositContextDto.surrogate.getCurrency_conversion_data();
        }
        if ((i & 32) != 0) {
            additionalDataDto = queuedDepositContextDto.surrogate.getAdditional_data();
        }
        if ((i & 64) != 0) {
            entryPointDto = queuedDepositContextDto.surrogate.getEntry_point();
        }
        AdditionalDataDto additionalDataDto2 = additionalDataDto;
        EntryPointDto entryPointDto2 = entryPointDto;
        MAXTransferContextDto.CurrencyConversionDataDto currencyConversionDataDto2 = currencyConversionDataDto;
        MAXTransferContextDto.TransferAccountDto transferAccountDto3 = transferAccountDto;
        return queuedDepositContextDto.copy(moneyDto, str, transferAccountDto3, transferAccountDto2, currencyConversionDataDto2, additionalDataDto2, entryPointDto2);
    }

    public final QueuedDepositContextDto copy(MoneyDto amount, String locality, MAXTransferContextDto.TransferAccountDto source_account, MAXTransferContextDto.TransferAccountDto sink_account, MAXTransferContextDto.CurrencyConversionDataDto currency_conversion_data, AdditionalDataDto additional_data, EntryPointDto entry_point) {
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        return new QueuedDepositContextDto(new Surrogate(amount, locality, source_account, sink_account, currency_conversion_data, additional_data, entry_point));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public QueuedDepositContext toProto() {
        MoneyDto amount = this.surrogate.getAmount();
        Money proto = amount != null ? amount.toProto() : null;
        String locality = this.surrogate.getLocality();
        MAXTransferContextDto.TransferAccountDto source_account = this.surrogate.getSource_account();
        MAXTransferContext.TransferAccount proto2 = source_account != null ? source_account.toProto() : null;
        MAXTransferContextDto.TransferAccountDto sink_account = this.surrogate.getSink_account();
        MAXTransferContext.TransferAccount proto3 = sink_account != null ? sink_account.toProto() : null;
        MAXTransferContextDto.CurrencyConversionDataDto currency_conversion_data = this.surrogate.getCurrency_conversion_data();
        MAXTransferContext.CurrencyConversionData proto4 = currency_conversion_data != null ? currency_conversion_data.toProto() : null;
        AdditionalDataDto additional_data = this.surrogate.getAdditional_data();
        return new QueuedDepositContext(proto, locality, proto2, proto3, proto4, additional_data != null ? additional_data.toProto() : null, (QueuedDepositContext.EntryPoint) this.surrogate.getEntry_point().toProto(), null, 128, null);
    }

    public String toString() {
        return "[QueuedDepositContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof QueuedDepositContextDto) && Intrinsics.areEqual(((QueuedDepositContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: QueuedDepositContextDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 A2\u00020\u0001:\u0002@ABW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010Ba\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00101\u001a\u00020\u000eHÆ\u0003JY\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0012HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001J%\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0001¢\u0006\u0002\b?R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u001fR\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010$R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010'R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010*¨\u0006B"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$Surrogate;", "", "amount", "Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "locality", "", "source_account", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;", "sink_account", "currency_conversion_data", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto;", "additional_data", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$AdditionalDataDto;", "entry_point", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$EntryPointDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MoneyDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto;Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$AdditionalDataDto;Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$EntryPointDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/MoneyDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto;Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$AdditionalDataDto;Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$EntryPointDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAmount$annotations", "()V", "getAmount", "()Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "getLocality$annotations", "getLocality", "()Ljava/lang/String;", "getSource_account$annotations", "getSource_account", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;", "getSink_account$annotations", "getSink_account", "getCurrency_conversion_data$annotations", "getCurrency_conversion_data", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto;", "getAdditional_data$annotations", "getAdditional_data", "()Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$AdditionalDataDto;", "getEntry_point$annotations", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$EntryPointDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AdditionalDataDto additional_data;
        private final MoneyDto amount;
        private final MAXTransferContextDto.CurrencyConversionDataDto currency_conversion_data;
        private final EntryPointDto entry_point;
        private final String locality;
        private final MAXTransferContextDto.TransferAccountDto sink_account;
        private final MAXTransferContextDto.TransferAccountDto source_account;

        public Surrogate() {
            this((MoneyDto) null, (String) null, (MAXTransferContextDto.TransferAccountDto) null, (MAXTransferContextDto.TransferAccountDto) null, (MAXTransferContextDto.CurrencyConversionDataDto) null, (AdditionalDataDto) null, (EntryPointDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, MoneyDto moneyDto, String str, MAXTransferContextDto.TransferAccountDto transferAccountDto, MAXTransferContextDto.TransferAccountDto transferAccountDto2, MAXTransferContextDto.CurrencyConversionDataDto currencyConversionDataDto, AdditionalDataDto additionalDataDto, EntryPointDto entryPointDto, int i, Object obj) {
            if ((i & 1) != 0) {
                moneyDto = surrogate.amount;
            }
            if ((i & 2) != 0) {
                str = surrogate.locality;
            }
            if ((i & 4) != 0) {
                transferAccountDto = surrogate.source_account;
            }
            if ((i & 8) != 0) {
                transferAccountDto2 = surrogate.sink_account;
            }
            if ((i & 16) != 0) {
                currencyConversionDataDto = surrogate.currency_conversion_data;
            }
            if ((i & 32) != 0) {
                additionalDataDto = surrogate.additional_data;
            }
            if ((i & 64) != 0) {
                entryPointDto = surrogate.entry_point;
            }
            AdditionalDataDto additionalDataDto2 = additionalDataDto;
            EntryPointDto entryPointDto2 = entryPointDto;
            MAXTransferContextDto.CurrencyConversionDataDto currencyConversionDataDto2 = currencyConversionDataDto;
            MAXTransferContextDto.TransferAccountDto transferAccountDto3 = transferAccountDto;
            return surrogate.copy(moneyDto, str, transferAccountDto3, transferAccountDto2, currencyConversionDataDto2, additionalDataDto2, entryPointDto2);
        }

        @SerialName("additionalData")
        @JsonAnnotations2(names = {"additional_data"})
        public static /* synthetic */ void getAdditional_data$annotations() {
        }

        @SerialName("amount")
        @JsonAnnotations2(names = {"amount"})
        public static /* synthetic */ void getAmount$annotations() {
        }

        @SerialName("currencyConversionData")
        @JsonAnnotations2(names = {"currency_conversion_data"})
        public static /* synthetic */ void getCurrency_conversion_data$annotations() {
        }

        @SerialName("entryPoint")
        @JsonAnnotations2(names = {"entry_point"})
        public static /* synthetic */ void getEntry_point$annotations() {
        }

        @SerialName("locality")
        @JsonAnnotations2(names = {"locality"})
        public static /* synthetic */ void getLocality$annotations() {
        }

        @SerialName(CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT)
        @JsonAnnotations2(names = {"sink_account"})
        public static /* synthetic */ void getSink_account$annotations() {
        }

        @SerialName(CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT)
        @JsonAnnotations2(names = {"source_account"})
        public static /* synthetic */ void getSource_account$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final MoneyDto getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLocality() {
            return this.locality;
        }

        /* renamed from: component3, reason: from getter */
        public final MAXTransferContextDto.TransferAccountDto getSource_account() {
            return this.source_account;
        }

        /* renamed from: component4, reason: from getter */
        public final MAXTransferContextDto.TransferAccountDto getSink_account() {
            return this.sink_account;
        }

        /* renamed from: component5, reason: from getter */
        public final MAXTransferContextDto.CurrencyConversionDataDto getCurrency_conversion_data() {
            return this.currency_conversion_data;
        }

        /* renamed from: component6, reason: from getter */
        public final AdditionalDataDto getAdditional_data() {
            return this.additional_data;
        }

        /* renamed from: component7, reason: from getter */
        public final EntryPointDto getEntry_point() {
            return this.entry_point;
        }

        public final Surrogate copy(MoneyDto amount, String locality, MAXTransferContextDto.TransferAccountDto source_account, MAXTransferContextDto.TransferAccountDto sink_account, MAXTransferContextDto.CurrencyConversionDataDto currency_conversion_data, AdditionalDataDto additional_data, EntryPointDto entry_point) {
            Intrinsics.checkNotNullParameter(locality, "locality");
            Intrinsics.checkNotNullParameter(entry_point, "entry_point");
            return new Surrogate(amount, locality, source_account, sink_account, currency_conversion_data, additional_data, entry_point);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.amount, surrogate.amount) && Intrinsics.areEqual(this.locality, surrogate.locality) && Intrinsics.areEqual(this.source_account, surrogate.source_account) && Intrinsics.areEqual(this.sink_account, surrogate.sink_account) && Intrinsics.areEqual(this.currency_conversion_data, surrogate.currency_conversion_data) && Intrinsics.areEqual(this.additional_data, surrogate.additional_data) && this.entry_point == surrogate.entry_point;
        }

        public int hashCode() {
            MoneyDto moneyDto = this.amount;
            int iHashCode = (((moneyDto == null ? 0 : moneyDto.hashCode()) * 31) + this.locality.hashCode()) * 31;
            MAXTransferContextDto.TransferAccountDto transferAccountDto = this.source_account;
            int iHashCode2 = (iHashCode + (transferAccountDto == null ? 0 : transferAccountDto.hashCode())) * 31;
            MAXTransferContextDto.TransferAccountDto transferAccountDto2 = this.sink_account;
            int iHashCode3 = (iHashCode2 + (transferAccountDto2 == null ? 0 : transferAccountDto2.hashCode())) * 31;
            MAXTransferContextDto.CurrencyConversionDataDto currencyConversionDataDto = this.currency_conversion_data;
            int iHashCode4 = (iHashCode3 + (currencyConversionDataDto == null ? 0 : currencyConversionDataDto.hashCode())) * 31;
            AdditionalDataDto additionalDataDto = this.additional_data;
            return ((iHashCode4 + (additionalDataDto != null ? additionalDataDto.hashCode() : 0)) * 31) + this.entry_point.hashCode();
        }

        public String toString() {
            return "Surrogate(amount=" + this.amount + ", locality=" + this.locality + ", source_account=" + this.source_account + ", sink_account=" + this.sink_account + ", currency_conversion_data=" + this.currency_conversion_data + ", additional_data=" + this.additional_data + ", entry_point=" + this.entry_point + ")";
        }

        /* compiled from: QueuedDepositContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return QueuedDepositContextDto3.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MoneyDto moneyDto, String str, MAXTransferContextDto.TransferAccountDto transferAccountDto, MAXTransferContextDto.TransferAccountDto transferAccountDto2, MAXTransferContextDto.CurrencyConversionDataDto currencyConversionDataDto, AdditionalDataDto additionalDataDto, EntryPointDto entryPointDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.amount = null;
            } else {
                this.amount = moneyDto;
            }
            if ((i & 2) == 0) {
                this.locality = "";
            } else {
                this.locality = str;
            }
            if ((i & 4) == 0) {
                this.source_account = null;
            } else {
                this.source_account = transferAccountDto;
            }
            if ((i & 8) == 0) {
                this.sink_account = null;
            } else {
                this.sink_account = transferAccountDto2;
            }
            if ((i & 16) == 0) {
                this.currency_conversion_data = null;
            } else {
                this.currency_conversion_data = currencyConversionDataDto;
            }
            if ((i & 32) == 0) {
                this.additional_data = null;
            } else {
                this.additional_data = additionalDataDto;
            }
            if ((i & 64) == 0) {
                this.entry_point = EntryPointDto.INSTANCE.getZeroValue();
            } else {
                this.entry_point = entryPointDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            MoneyDto moneyDto = self.amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (!Intrinsics.areEqual(self.locality, "")) {
                output.encodeStringElement(serialDesc, 1, self.locality);
            }
            MAXTransferContextDto.TransferAccountDto transferAccountDto = self.source_account;
            if (transferAccountDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MAXTransferContextDto.TransferAccountDto.Serializer.INSTANCE, transferAccountDto);
            }
            MAXTransferContextDto.TransferAccountDto transferAccountDto2 = self.sink_account;
            if (transferAccountDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MAXTransferContextDto.TransferAccountDto.Serializer.INSTANCE, transferAccountDto2);
            }
            MAXTransferContextDto.CurrencyConversionDataDto currencyConversionDataDto = self.currency_conversion_data;
            if (currencyConversionDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, MAXTransferContextDto.CurrencyConversionDataDto.Serializer.INSTANCE, currencyConversionDataDto);
            }
            AdditionalDataDto additionalDataDto = self.additional_data;
            if (additionalDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, AdditionalDataDto.Serializer.INSTANCE, additionalDataDto);
            }
            if (self.entry_point != EntryPointDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, EntryPointDto.Serializer.INSTANCE, self.entry_point);
            }
        }

        public Surrogate(MoneyDto moneyDto, String locality, MAXTransferContextDto.TransferAccountDto transferAccountDto, MAXTransferContextDto.TransferAccountDto transferAccountDto2, MAXTransferContextDto.CurrencyConversionDataDto currencyConversionDataDto, AdditionalDataDto additionalDataDto, EntryPointDto entry_point) {
            Intrinsics.checkNotNullParameter(locality, "locality");
            Intrinsics.checkNotNullParameter(entry_point, "entry_point");
            this.amount = moneyDto;
            this.locality = locality;
            this.source_account = transferAccountDto;
            this.sink_account = transferAccountDto2;
            this.currency_conversion_data = currencyConversionDataDto;
            this.additional_data = additionalDataDto;
            this.entry_point = entry_point;
        }

        public final MoneyDto getAmount() {
            return this.amount;
        }

        public final String getLocality() {
            return this.locality;
        }

        public /* synthetic */ Surrogate(MoneyDto moneyDto, String str, MAXTransferContextDto.TransferAccountDto transferAccountDto, MAXTransferContextDto.TransferAccountDto transferAccountDto2, MAXTransferContextDto.CurrencyConversionDataDto currencyConversionDataDto, AdditionalDataDto additionalDataDto, EntryPointDto entryPointDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : moneyDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : transferAccountDto, (i & 8) != 0 ? null : transferAccountDto2, (i & 16) != 0 ? null : currencyConversionDataDto, (i & 32) != 0 ? null : additionalDataDto, (i & 64) != 0 ? EntryPointDto.INSTANCE.getZeroValue() : entryPointDto);
        }

        public final MAXTransferContextDto.TransferAccountDto getSource_account() {
            return this.source_account;
        }

        public final MAXTransferContextDto.TransferAccountDto getSink_account() {
            return this.sink_account;
        }

        public final MAXTransferContextDto.CurrencyConversionDataDto getCurrency_conversion_data() {
            return this.currency_conversion_data;
        }

        public final AdditionalDataDto getAdditional_data() {
            return this.additional_data;
        }

        public final EntryPointDto getEntry_point() {
            return this.entry_point;
        }
    }

    /* compiled from: QueuedDepositContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto;", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<QueuedDepositContextDto, QueuedDepositContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<QueuedDepositContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<QueuedDepositContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<QueuedDepositContextDto> getBinaryBase64Serializer() {
            return (KSerializer) QueuedDepositContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<QueuedDepositContext> getProtoAdapter() {
            return QueuedDepositContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public QueuedDepositContextDto getZeroValue() {
            return QueuedDepositContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public QueuedDepositContextDto fromProto(QueuedDepositContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Money amount = proto.getAmount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = amount != null ? MoneyDto.INSTANCE.fromProto(amount) : null;
            String locality = proto.getLocality();
            MAXTransferContext.TransferAccount source_account = proto.getSource_account();
            MAXTransferContextDto.TransferAccountDto transferAccountDtoFromProto = source_account != null ? MAXTransferContextDto.TransferAccountDto.INSTANCE.fromProto(source_account) : null;
            MAXTransferContext.TransferAccount sink_account = proto.getSink_account();
            MAXTransferContextDto.TransferAccountDto transferAccountDtoFromProto2 = sink_account != null ? MAXTransferContextDto.TransferAccountDto.INSTANCE.fromProto(sink_account) : null;
            MAXTransferContext.CurrencyConversionData currency_conversion_data = proto.getCurrency_conversion_data();
            MAXTransferContextDto.CurrencyConversionDataDto currencyConversionDataDtoFromProto = currency_conversion_data != null ? MAXTransferContextDto.CurrencyConversionDataDto.INSTANCE.fromProto(currency_conversion_data) : null;
            QueuedDepositContext.AdditionalData additional_data = proto.getAdditional_data();
            return new QueuedDepositContextDto(new Surrogate(moneyDtoFromProto, locality, transferAccountDtoFromProto, transferAccountDtoFromProto2, currencyConversionDataDtoFromProto, additional_data != null ? AdditionalDataDto.INSTANCE.fromProto(additional_data) : null, EntryPointDto.INSTANCE.fromProto(proto.getEntry_point())), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.QueuedDepositContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QueuedDepositContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new QueuedDepositContextDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: QueuedDepositContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$EntryPointDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$EntryPoint;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ENTRY_POINT_UNSPECIFIED", "POST_ONBOARDING", "TRANSFER_FUND_DEEPLINK", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EntryPointDto implements Dto2<QueuedDepositContext.EntryPoint>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPointDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EntryPointDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EntryPointDto ENTRY_POINT_UNSPECIFIED = new ENTRY_POINT_UNSPECIFIED("ENTRY_POINT_UNSPECIFIED", 0);
        public static final EntryPointDto POST_ONBOARDING = new POST_ONBOARDING("POST_ONBOARDING", 1);
        public static final EntryPointDto TRANSFER_FUND_DEEPLINK = new TRANSFER_FUND_DEEPLINK("TRANSFER_FUND_DEEPLINK", 2);
        private static final Lazy<BinaryBase64DtoSerializer<EntryPointDto, QueuedDepositContext.EntryPoint>> binaryBase64Serializer$delegate;

        private static final /* synthetic */ EntryPointDto[] $values() {
            return new EntryPointDto[]{ENTRY_POINT_UNSPECIFIED, POST_ONBOARDING, TRANSFER_FUND_DEEPLINK};
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

        /* compiled from: QueuedDepositContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/QueuedDepositContextDto.EntryPointDto.ENTRY_POINT_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ENTRY_POINT_UNSPECIFIED extends EntryPointDto {
            ENTRY_POINT_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public QueuedDepositContext.EntryPoint toProto() {
                return QueuedDepositContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.QueuedDepositContextDto$EntryPointDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return QueuedDepositContextDto.EntryPointDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: QueuedDepositContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/QueuedDepositContextDto.EntryPointDto.POST_ONBOARDING", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class POST_ONBOARDING extends EntryPointDto {
            POST_ONBOARDING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public QueuedDepositContext.EntryPoint toProto() {
                return QueuedDepositContext.EntryPoint.POST_ONBOARDING;
            }
        }

        /* compiled from: QueuedDepositContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/QueuedDepositContextDto.EntryPointDto.TRANSFER_FUND_DEEPLINK", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRANSFER_FUND_DEEPLINK extends EntryPointDto {
            TRANSFER_FUND_DEEPLINK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public QueuedDepositContext.EntryPoint toProto() {
                return QueuedDepositContext.EntryPoint.TRANSFER_FUND_DEEPLINK;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: QueuedDepositContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$EntryPointDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$EntryPointDto;", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$EntryPoint;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$EntryPointDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EntryPointDto, QueuedDepositContext.EntryPoint> {

            /* compiled from: QueuedDepositContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[QueuedDepositContext.EntryPoint.values().length];
                    try {
                        iArr[QueuedDepositContext.EntryPoint.ENTRY_POINT_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[QueuedDepositContext.EntryPoint.POST_ONBOARDING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[QueuedDepositContext.EntryPoint.TRANSFER_FUND_DEEPLINK.ordinal()] = 3;
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
            public ProtoAdapter<QueuedDepositContext.EntryPoint> getProtoAdapter() {
                return QueuedDepositContext.EntryPoint.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryPointDto getZeroValue() {
                return EntryPointDto.ENTRY_POINT_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryPointDto fromProto(QueuedDepositContext.EntryPoint proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return EntryPointDto.ENTRY_POINT_UNSPECIFIED;
                }
                if (i == 2) {
                    return EntryPointDto.POST_ONBOARDING;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return EntryPointDto.TRANSFER_FUND_DEEPLINK;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: QueuedDepositContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$EntryPointDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$EntryPointDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<EntryPointDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EntryPointDto, QueuedDepositContext.EntryPoint> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.QueuedDepositContext.EntryPoint", EntryPointDto.getEntries(), EntryPointDto.INSTANCE.getZeroValue());

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

    /* compiled from: QueuedDepositContextDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001c\u001d\u001e\u001fB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0010\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$AdditionalDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$AdditionalData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$AdditionalDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$AdditionalDataDto$Surrogate;)V", "mandate_status", "", "(Ljava/lang/String;)V", "getMandate_status", "()Ljava/lang/String;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AdditionalDataDto implements Dto3<QueuedDepositContext.AdditionalData>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<AdditionalDataDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AdditionalDataDto, QueuedDepositContext.AdditionalData>> binaryBase64Serializer$delegate;
        private static final AdditionalDataDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ AdditionalDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private AdditionalDataDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getMandate_status() {
            return this.surrogate.getMandate_status();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdditionalDataDto(String mandate_status) {
            this(new Surrogate(mandate_status));
            Intrinsics.checkNotNullParameter(mandate_status, "mandate_status");
        }

        public /* synthetic */ AdditionalDataDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        public static /* synthetic */ AdditionalDataDto copy$default(AdditionalDataDto additionalDataDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = additionalDataDto.surrogate.getMandate_status();
            }
            return additionalDataDto.copy(str);
        }

        public final AdditionalDataDto copy(String mandate_status) {
            Intrinsics.checkNotNullParameter(mandate_status, "mandate_status");
            return new AdditionalDataDto(new Surrogate(mandate_status));
        }

        @Override // com.robinhood.idl.Dto
        public QueuedDepositContext.AdditionalData toProto() {
            return new QueuedDepositContext.AdditionalData(this.surrogate.getMandate_status(), null, 2, null);
        }

        public String toString() {
            return "[AdditionalDataDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof AdditionalDataDto) && Intrinsics.areEqual(((AdditionalDataDto) other).surrogate, this.surrogate);
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
        /* compiled from: QueuedDepositContextDto.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J%\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0001¢\u0006\u0002\b\u001dR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$AdditionalDataDto$Surrogate;", "", "mandate_status", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMandate_status$annotations", "()V", "getMandate_status", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String mandate_status;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = surrogate.mandate_status;
                }
                return surrogate.copy(str);
            }

            @SerialName("mandateStatus")
            @JsonAnnotations2(names = {"mandate_status"})
            public static /* synthetic */ void getMandate_status$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getMandate_status() {
                return this.mandate_status;
            }

            public final Surrogate copy(String mandate_status) {
                Intrinsics.checkNotNullParameter(mandate_status, "mandate_status");
                return new Surrogate(mandate_status);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && Intrinsics.areEqual(this.mandate_status, ((Surrogate) other).mandate_status);
            }

            public int hashCode() {
                return this.mandate_status.hashCode();
            }

            public String toString() {
                return "Surrogate(mandate_status=" + this.mandate_status + ")";
            }

            /* compiled from: QueuedDepositContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$AdditionalDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$AdditionalDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return QueuedDepositContextDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.mandate_status = "";
                } else {
                    this.mandate_status = str;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (Intrinsics.areEqual(self.mandate_status, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 0, self.mandate_status);
            }

            public Surrogate(String mandate_status) {
                Intrinsics.checkNotNullParameter(mandate_status, "mandate_status");
                this.mandate_status = mandate_status;
            }

            public final String getMandate_status() {
                return this.mandate_status;
            }

            public /* synthetic */ Surrogate(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        /* compiled from: QueuedDepositContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$AdditionalDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$AdditionalDataDto;", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$AdditionalData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$AdditionalDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<AdditionalDataDto, QueuedDepositContext.AdditionalData> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AdditionalDataDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AdditionalDataDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AdditionalDataDto> getBinaryBase64Serializer() {
                return (KSerializer) AdditionalDataDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<QueuedDepositContext.AdditionalData> getProtoAdapter() {
                return QueuedDepositContext.AdditionalData.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AdditionalDataDto getZeroValue() {
                return AdditionalDataDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AdditionalDataDto fromProto(QueuedDepositContext.AdditionalData proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new AdditionalDataDto(new Surrogate(proto.getMandate_status()), null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.QueuedDepositContextDto$AdditionalDataDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return QueuedDepositContextDto.AdditionalDataDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new AdditionalDataDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: QueuedDepositContextDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$AdditionalDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$AdditionalDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$AdditionalDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<AdditionalDataDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.QueuedDepositContext.AdditionalData", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AdditionalDataDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public AdditionalDataDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new AdditionalDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: QueuedDepositContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$AdditionalDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4188_4)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.QueuedDepositContextDto$AdditionalDataDto";
            }
        }
    }

    /* compiled from: QueuedDepositContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<QueuedDepositContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.QueuedDepositContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, QueuedDepositContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public QueuedDepositContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new QueuedDepositContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: QueuedDepositContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QueuedDepositContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.QueuedDepositContextDto";
        }
    }
}
