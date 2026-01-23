package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.common.Currency;
import com.robinhood.rosetta.common.CurrencyDto;
import com.robinhood.rosetta.eventlogging.BooleanDto;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.MAXTransferContextDto;
import com.robinhood.rosetta.eventlogging.MoneyDto;
import com.robinhood.rosetta.eventlogging.TransferContext;
import com.robinhood.rosetta.eventlogging.TransferContextDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: MAXTransferContextDto.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 [2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000eZ[\\]^_`abcdefgB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bá\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010\"\u001a\u00020\t\u0012\b\b\u0002\u0010#\u001a\u00020\t\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010'\u001a\u00020(¢\u0006\u0004\b\u0006\u0010)JÞ\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020\t2\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010'\u001a\u00020(J\b\u0010L\u001a\u00020\u0002H\u0016J\b\u0010M\u001a\u00020\tH\u0016J\u0013\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010QH\u0096\u0002J\b\u0010R\u001a\u00020SH\u0016J\u0018\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020SH\u0016J\b\u0010Y\u001a\u00020SH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b0\u0010/R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b9\u0010+R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0013\u0010 \u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0011\u0010\"\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bD\u0010+R\u0011\u0010#\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bE\u0010+R\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0013\u0010&\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bH\u0010-R\u0011\u0010'\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006h"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$Surrogate;)V", "id", "", "amount", "Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "source_account", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;", "sink_account", "frequency", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;", "ira_contribution_data", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRAContributionDataDto;", "entry_point", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "ira_distribution_data", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRADistributionDataDto;", "session_id", "ach_transfer_data", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$ACHTransferDataDto;", "deposit_suggestions", "", "ira_roth_conversion_data", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRARothConversionDataDto;", "transfer_limit_validation_error", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto;", "currency_conversion_data", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto;", "locality", "entry_point_logging_identifier", "transfer_v2_direction", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferV2DirectionDto;", "selected_pill_amount", "transfer_method", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferMethodDto;", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MoneyDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRAContributionDataDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRADistributionDataDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$ACHTransferDataDto;Ljava/util/List;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRARothConversionDataDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferV2DirectionDto;Lcom/robinhood/rosetta/eventlogging/MoneyDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferMethodDto;)V", "getId", "()Ljava/lang/String;", "getAmount", "()Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "getSource_account", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;", "getSink_account", "getFrequency", "()Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;", "getIra_contribution_data", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRAContributionDataDto;", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "getIra_distribution_data", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRADistributionDataDto;", "getSession_id", "getAch_transfer_data", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$ACHTransferDataDto;", "getDeposit_suggestions", "()Ljava/util/List;", "getIra_roth_conversion_data", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRARothConversionDataDto;", "getTransfer_limit_validation_error", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto;", "getCurrency_conversion_data", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto;", "getLocality", "getEntry_point_logging_identifier", "getTransfer_v2_direction", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferV2DirectionDto;", "getSelected_pill_amount", "getTransfer_method", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferMethodDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "TransferAccountDto", "ACHTransferDataDto", "IRAContributionDataDto", "IRADistributionDataDto", "IRARothConversionDataDto", "TransferLimitValidationErrorDto", "CurrencyConversionDataDto", "EntryPointDto", "TransferV2DirectionDto", "TransferMethodDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes19.dex */
public final class MAXTransferContextDto implements Dto3<MAXTransferContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MAXTransferContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MAXTransferContextDto, MAXTransferContext>> binaryBase64Serializer$delegate;
    private static final MAXTransferContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MAXTransferContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MAXTransferContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final MoneyDto getAmount() {
        return this.surrogate.getAmount();
    }

    public final TransferAccountDto getSource_account() {
        return this.surrogate.getSource_account();
    }

    public final TransferAccountDto getSink_account() {
        return this.surrogate.getSink_account();
    }

    public final TransferContextDto.FrequencyDto getFrequency() {
        return this.surrogate.getFrequency();
    }

    public final IRAContributionDataDto getIra_contribution_data() {
        return this.surrogate.getIra_contribution_data();
    }

    public final EntryPointDto getEntry_point() {
        return this.surrogate.getEntry_point();
    }

    public final IRADistributionDataDto getIra_distribution_data() {
        return this.surrogate.getIra_distribution_data();
    }

    public final String getSession_id() {
        return this.surrogate.getSession_id();
    }

    public final ACHTransferDataDto getAch_transfer_data() {
        return this.surrogate.getAch_transfer_data();
    }

    public final java.util.List<MoneyDto> getDeposit_suggestions() {
        return this.surrogate.getDeposit_suggestions();
    }

    public final IRARothConversionDataDto getIra_roth_conversion_data() {
        return this.surrogate.getIra_roth_conversion_data();
    }

    public final TransferLimitValidationErrorDto getTransfer_limit_validation_error() {
        return this.surrogate.getTransfer_limit_validation_error();
    }

    public final CurrencyConversionDataDto getCurrency_conversion_data() {
        return this.surrogate.getCurrency_conversion_data();
    }

    public final String getLocality() {
        return this.surrogate.getLocality();
    }

    public final String getEntry_point_logging_identifier() {
        return this.surrogate.getEntry_point_logging_identifier();
    }

    public final TransferV2DirectionDto getTransfer_v2_direction() {
        return this.surrogate.getTransfer_v2_direction();
    }

    public final MoneyDto getSelected_pill_amount() {
        return this.surrogate.getSelected_pill_amount();
    }

    public final TransferMethodDto getTransfer_method() {
        return this.surrogate.getTransfer_method();
    }

    public /* synthetic */ MAXTransferContextDto(String str, MoneyDto moneyDto, TransferAccountDto transferAccountDto, TransferAccountDto transferAccountDto2, TransferContextDto.FrequencyDto frequencyDto, IRAContributionDataDto iRAContributionDataDto, EntryPointDto entryPointDto, IRADistributionDataDto iRADistributionDataDto, String str2, ACHTransferDataDto aCHTransferDataDto, java.util.List list, IRARothConversionDataDto iRARothConversionDataDto, TransferLimitValidationErrorDto transferLimitValidationErrorDto, CurrencyConversionDataDto currencyConversionDataDto, String str3, String str4, TransferV2DirectionDto transferV2DirectionDto, MoneyDto moneyDto2, TransferMethodDto transferMethodDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : moneyDto, (i & 4) != 0 ? null : transferAccountDto, (i & 8) != 0 ? null : transferAccountDto2, (i & 16) != 0 ? TransferContextDto.FrequencyDto.INSTANCE.getZeroValue() : frequencyDto, (i & 32) != 0 ? null : iRAContributionDataDto, (i & 64) != 0 ? EntryPointDto.INSTANCE.getZeroValue() : entryPointDto, (i & 128) != 0 ? null : iRADistributionDataDto, (i & 256) != 0 ? "" : str2, (i & 512) != 0 ? null : aCHTransferDataDto, (i & 1024) != 0 ? CollectionsKt.emptyList() : list, (i & 2048) != 0 ? null : iRARothConversionDataDto, (i & 4096) != 0 ? null : transferLimitValidationErrorDto, (i & 8192) != 0 ? null : currencyConversionDataDto, (i & 16384) != 0 ? "" : str3, (i & 32768) == 0 ? str4 : "", (i & 65536) != 0 ? TransferV2DirectionDto.INSTANCE.getZeroValue() : transferV2DirectionDto, (i & 131072) != 0 ? null : moneyDto2, (i & 262144) != 0 ? TransferMethodDto.INSTANCE.getZeroValue() : transferMethodDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MAXTransferContextDto(String id, MoneyDto moneyDto, TransferAccountDto transferAccountDto, TransferAccountDto transferAccountDto2, TransferContextDto.FrequencyDto frequency, IRAContributionDataDto iRAContributionDataDto, EntryPointDto entry_point, IRADistributionDataDto iRADistributionDataDto, String session_id, ACHTransferDataDto aCHTransferDataDto, java.util.List<MoneyDto> deposit_suggestions, IRARothConversionDataDto iRARothConversionDataDto, TransferLimitValidationErrorDto transferLimitValidationErrorDto, CurrencyConversionDataDto currencyConversionDataDto, String locality, String entry_point_logging_identifier, TransferV2DirectionDto transfer_v2_direction, MoneyDto moneyDto2, TransferMethodDto transfer_method) {
        this(new Surrogate(id, moneyDto, transferAccountDto, transferAccountDto2, frequency, iRAContributionDataDto, entry_point, iRADistributionDataDto, session_id, aCHTransferDataDto, deposit_suggestions, iRARothConversionDataDto, transferLimitValidationErrorDto, currencyConversionDataDto, locality, entry_point_logging_identifier, transfer_v2_direction, moneyDto2, transfer_method));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(deposit_suggestions, "deposit_suggestions");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(entry_point_logging_identifier, "entry_point_logging_identifier");
        Intrinsics.checkNotNullParameter(transfer_v2_direction, "transfer_v2_direction");
        Intrinsics.checkNotNullParameter(transfer_method, "transfer_method");
    }

    public static /* synthetic */ MAXTransferContextDto copy$default(MAXTransferContextDto mAXTransferContextDto, String str, MoneyDto moneyDto, TransferAccountDto transferAccountDto, TransferAccountDto transferAccountDto2, TransferContextDto.FrequencyDto frequencyDto, IRAContributionDataDto iRAContributionDataDto, EntryPointDto entryPointDto, IRADistributionDataDto iRADistributionDataDto, String str2, ACHTransferDataDto aCHTransferDataDto, java.util.List list, IRARothConversionDataDto iRARothConversionDataDto, TransferLimitValidationErrorDto transferLimitValidationErrorDto, CurrencyConversionDataDto currencyConversionDataDto, String str3, String str4, TransferV2DirectionDto transferV2DirectionDto, MoneyDto moneyDto2, TransferMethodDto transferMethodDto, int i, Object obj) {
        TransferMethodDto transfer_method;
        MoneyDto moneyDto3;
        String id = (i & 1) != 0 ? mAXTransferContextDto.surrogate.getId() : str;
        MoneyDto amount = (i & 2) != 0 ? mAXTransferContextDto.surrogate.getAmount() : moneyDto;
        TransferAccountDto source_account = (i & 4) != 0 ? mAXTransferContextDto.surrogate.getSource_account() : transferAccountDto;
        TransferAccountDto sink_account = (i & 8) != 0 ? mAXTransferContextDto.surrogate.getSink_account() : transferAccountDto2;
        TransferContextDto.FrequencyDto frequency = (i & 16) != 0 ? mAXTransferContextDto.surrogate.getFrequency() : frequencyDto;
        IRAContributionDataDto ira_contribution_data = (i & 32) != 0 ? mAXTransferContextDto.surrogate.getIra_contribution_data() : iRAContributionDataDto;
        EntryPointDto entry_point = (i & 64) != 0 ? mAXTransferContextDto.surrogate.getEntry_point() : entryPointDto;
        IRADistributionDataDto ira_distribution_data = (i & 128) != 0 ? mAXTransferContextDto.surrogate.getIra_distribution_data() : iRADistributionDataDto;
        String session_id = (i & 256) != 0 ? mAXTransferContextDto.surrogate.getSession_id() : str2;
        ACHTransferDataDto ach_transfer_data = (i & 512) != 0 ? mAXTransferContextDto.surrogate.getAch_transfer_data() : aCHTransferDataDto;
        java.util.List deposit_suggestions = (i & 1024) != 0 ? mAXTransferContextDto.surrogate.getDeposit_suggestions() : list;
        IRARothConversionDataDto ira_roth_conversion_data = (i & 2048) != 0 ? mAXTransferContextDto.surrogate.getIra_roth_conversion_data() : iRARothConversionDataDto;
        TransferLimitValidationErrorDto transfer_limit_validation_error = (i & 4096) != 0 ? mAXTransferContextDto.surrogate.getTransfer_limit_validation_error() : transferLimitValidationErrorDto;
        CurrencyConversionDataDto currency_conversion_data = (i & 8192) != 0 ? mAXTransferContextDto.surrogate.getCurrency_conversion_data() : currencyConversionDataDto;
        String str5 = id;
        String locality = (i & 16384) != 0 ? mAXTransferContextDto.surrogate.getLocality() : str3;
        String entry_point_logging_identifier = (i & 32768) != 0 ? mAXTransferContextDto.surrogate.getEntry_point_logging_identifier() : str4;
        TransferV2DirectionDto transfer_v2_direction = (i & 65536) != 0 ? mAXTransferContextDto.surrogate.getTransfer_v2_direction() : transferV2DirectionDto;
        MoneyDto selected_pill_amount = (i & 131072) != 0 ? mAXTransferContextDto.surrogate.getSelected_pill_amount() : moneyDto2;
        if ((i & 262144) != 0) {
            moneyDto3 = selected_pill_amount;
            transfer_method = mAXTransferContextDto.surrogate.getTransfer_method();
        } else {
            transfer_method = transferMethodDto;
            moneyDto3 = selected_pill_amount;
        }
        return mAXTransferContextDto.copy(str5, amount, source_account, sink_account, frequency, ira_contribution_data, entry_point, ira_distribution_data, session_id, ach_transfer_data, deposit_suggestions, ira_roth_conversion_data, transfer_limit_validation_error, currency_conversion_data, locality, entry_point_logging_identifier, transfer_v2_direction, moneyDto3, transfer_method);
    }

    public final MAXTransferContextDto copy(String id, MoneyDto amount, TransferAccountDto source_account, TransferAccountDto sink_account, TransferContextDto.FrequencyDto frequency, IRAContributionDataDto ira_contribution_data, EntryPointDto entry_point, IRADistributionDataDto ira_distribution_data, String session_id, ACHTransferDataDto ach_transfer_data, java.util.List<MoneyDto> deposit_suggestions, IRARothConversionDataDto ira_roth_conversion_data, TransferLimitValidationErrorDto transfer_limit_validation_error, CurrencyConversionDataDto currency_conversion_data, String locality, String entry_point_logging_identifier, TransferV2DirectionDto transfer_v2_direction, MoneyDto selected_pill_amount, TransferMethodDto transfer_method) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(deposit_suggestions, "deposit_suggestions");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(entry_point_logging_identifier, "entry_point_logging_identifier");
        Intrinsics.checkNotNullParameter(transfer_v2_direction, "transfer_v2_direction");
        Intrinsics.checkNotNullParameter(transfer_method, "transfer_method");
        return new MAXTransferContextDto(new Surrogate(id, amount, source_account, sink_account, frequency, ira_contribution_data, entry_point, ira_distribution_data, session_id, ach_transfer_data, deposit_suggestions, ira_roth_conversion_data, transfer_limit_validation_error, currency_conversion_data, locality, entry_point_logging_identifier, transfer_v2_direction, selected_pill_amount, transfer_method));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public MAXTransferContext toProto() {
        String id = this.surrogate.getId();
        MoneyDto amount = this.surrogate.getAmount();
        Money proto = amount != null ? amount.toProto() : null;
        TransferAccountDto source_account = this.surrogate.getSource_account();
        MAXTransferContext.TransferAccount proto2 = source_account != null ? source_account.toProto() : null;
        TransferAccountDto sink_account = this.surrogate.getSink_account();
        MAXTransferContext.TransferAccount proto3 = sink_account != null ? sink_account.toProto() : null;
        TransferContext.Frequency frequency = (TransferContext.Frequency) this.surrogate.getFrequency().toProto();
        IRAContributionDataDto ira_contribution_data = this.surrogate.getIra_contribution_data();
        MAXTransferContext.IRAContributionData proto4 = ira_contribution_data != null ? ira_contribution_data.toProto() : null;
        MAXTransferContext.EntryPoint entryPoint = (MAXTransferContext.EntryPoint) this.surrogate.getEntry_point().toProto();
        IRADistributionDataDto ira_distribution_data = this.surrogate.getIra_distribution_data();
        MAXTransferContext.IRADistributionData proto5 = ira_distribution_data != null ? ira_distribution_data.toProto() : null;
        String session_id = this.surrogate.getSession_id();
        ACHTransferDataDto ach_transfer_data = this.surrogate.getAch_transfer_data();
        MAXTransferContext.ACHTransferData proto6 = ach_transfer_data != null ? ach_transfer_data.toProto() : null;
        java.util.List<MoneyDto> deposit_suggestions = this.surrogate.getDeposit_suggestions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(deposit_suggestions, 10));
        Iterator<T> it = deposit_suggestions.iterator();
        while (it.hasNext()) {
            arrayList.add(((MoneyDto) it.next()).toProto());
        }
        IRARothConversionDataDto ira_roth_conversion_data = this.surrogate.getIra_roth_conversion_data();
        MAXTransferContext.IRARothConversionData proto7 = ira_roth_conversion_data != null ? ira_roth_conversion_data.toProto() : null;
        TransferLimitValidationErrorDto transfer_limit_validation_error = this.surrogate.getTransfer_limit_validation_error();
        MAXTransferContext.TransferLimitValidationError proto8 = transfer_limit_validation_error != null ? transfer_limit_validation_error.toProto() : null;
        CurrencyConversionDataDto currency_conversion_data = this.surrogate.getCurrency_conversion_data();
        MAXTransferContext.CurrencyConversionData proto9 = currency_conversion_data != null ? currency_conversion_data.toProto() : null;
        String locality = this.surrogate.getLocality();
        String entry_point_logging_identifier = this.surrogate.getEntry_point_logging_identifier();
        MAXTransferContext.TransferV2Direction transferV2Direction = (MAXTransferContext.TransferV2Direction) this.surrogate.getTransfer_v2_direction().toProto();
        MoneyDto selected_pill_amount = this.surrogate.getSelected_pill_amount();
        return new MAXTransferContext(id, proto, proto2, proto3, frequency, proto4, entryPoint, proto5, session_id, proto6, arrayList, proto7, proto8, proto9, locality, entry_point_logging_identifier, transferV2Direction, selected_pill_amount != null ? selected_pill_amount.toProto() : null, (MAXTransferContext.TransferMethod) this.surrogate.getTransfer_method().toProto(), null, 524288, null);
    }

    public String toString() {
        return "[MAXTransferContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MAXTransferContextDto) && Intrinsics.areEqual(((MAXTransferContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: MAXTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\bK\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \u0081\u00012\u00020\u0001:\u0004\u0080\u0001\u0081\u0001Bß\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010!\u001a\u00020\"¢\u0006\u0004\b#\u0010$Bß\u0001\b\u0010\u0012\u0006\u0010%\u001a\u00020&\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\u0010'\u001a\u0004\u0018\u00010(¢\u0006\u0004\b#\u0010)J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010c\u001a\u00020\nHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010e\u001a\u00020\u000eHÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u001fHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010q\u001a\u00020\"HÆ\u0003Já\u0001\u0010r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010!\u001a\u00020\"HÆ\u0001J\u0013\u0010s\u001a\u00020t2\b\u0010u\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010v\u001a\u00020&HÖ\u0001J\t\u0010w\u001a\u00020\u0003HÖ\u0001J%\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020\u00002\u0006\u0010{\u001a\u00020|2\u0006\u0010}\u001a\u00020~H\u0001¢\u0006\u0002\b\u007fR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010+\u001a\u0004\b/\u00100R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010+\u001a\u0004\b2\u00103R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010+\u001a\u0004\b5\u00103R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010+\u001a\u0004\b7\u00108R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010+\u001a\u0004\b:\u0010;R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010+\u001a\u0004\b=\u0010>R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010+\u001a\u0004\b@\u0010AR\u001c\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010+\u001a\u0004\bC\u0010-R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010+\u001a\u0004\bE\u0010FR\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u0010+\u001a\u0004\bH\u0010IR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bJ\u0010+\u001a\u0004\bK\u0010LR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bM\u0010+\u001a\u0004\bN\u0010OR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bP\u0010+\u001a\u0004\bQ\u0010RR\u001c\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bS\u0010+\u001a\u0004\bT\u0010-R\u001c\u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bU\u0010+\u001a\u0004\bV\u0010-R\u001c\u0010\u001e\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bW\u0010+\u001a\u0004\bX\u0010YR\u001e\u0010 \u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bZ\u0010+\u001a\u0004\b[\u00100R\u001c\u0010!\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\\\u0010+\u001a\u0004\b]\u0010^¨\u0006\u0082\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$Surrogate;", "", "id", "", "amount", "Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "source_account", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;", "sink_account", "frequency", "Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;", "ira_contribution_data", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRAContributionDataDto;", "entry_point", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "ira_distribution_data", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRADistributionDataDto;", "session_id", "ach_transfer_data", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$ACHTransferDataDto;", "deposit_suggestions", "", "ira_roth_conversion_data", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRARothConversionDataDto;", "transfer_limit_validation_error", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto;", "currency_conversion_data", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto;", "locality", "entry_point_logging_identifier", "transfer_v2_direction", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferV2DirectionDto;", "selected_pill_amount", "transfer_method", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferMethodDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MoneyDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRAContributionDataDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRADistributionDataDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$ACHTransferDataDto;Ljava/util/List;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRARothConversionDataDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferV2DirectionDto;Lcom/robinhood/rosetta/eventlogging/MoneyDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferMethodDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/MoneyDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRAContributionDataDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRADistributionDataDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$ACHTransferDataDto;Ljava/util/List;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRARothConversionDataDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferV2DirectionDto;Lcom/robinhood/rosetta/eventlogging/MoneyDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferMethodDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getAmount$annotations", "getAmount", "()Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "getSource_account$annotations", "getSource_account", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;", "getSink_account$annotations", "getSink_account", "getFrequency$annotations", "getFrequency", "()Lcom/robinhood/rosetta/eventlogging/TransferContextDto$FrequencyDto;", "getIra_contribution_data$annotations", "getIra_contribution_data", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRAContributionDataDto;", "getEntry_point$annotations", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "getIra_distribution_data$annotations", "getIra_distribution_data", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRADistributionDataDto;", "getSession_id$annotations", "getSession_id", "getAch_transfer_data$annotations", "getAch_transfer_data", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$ACHTransferDataDto;", "getDeposit_suggestions$annotations", "getDeposit_suggestions", "()Ljava/util/List;", "getIra_roth_conversion_data$annotations", "getIra_roth_conversion_data", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRARothConversionDataDto;", "getTransfer_limit_validation_error$annotations", "getTransfer_limit_validation_error", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto;", "getCurrency_conversion_data$annotations", "getCurrency_conversion_data", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto;", "getLocality$annotations", "getLocality", "getEntry_point_logging_identifier$annotations", "getEntry_point_logging_identifier", "getTransfer_v2_direction$annotations", "getTransfer_v2_direction", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferV2DirectionDto;", "getSelected_pill_amount$annotations", "getSelected_pill_amount", "getTransfer_method$annotations", "getTransfer_method", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferMethodDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final ACHTransferDataDto ach_transfer_data;
        private final MoneyDto amount;
        private final CurrencyConversionDataDto currency_conversion_data;
        private final java.util.List<MoneyDto> deposit_suggestions;
        private final EntryPointDto entry_point;
        private final String entry_point_logging_identifier;
        private final TransferContextDto.FrequencyDto frequency;
        private final String id;
        private final IRAContributionDataDto ira_contribution_data;
        private final IRADistributionDataDto ira_distribution_data;
        private final IRARothConversionDataDto ira_roth_conversion_data;
        private final String locality;
        private final MoneyDto selected_pill_amount;
        private final String session_id;
        private final TransferAccountDto sink_account;
        private final TransferAccountDto source_account;
        private final TransferLimitValidationErrorDto transfer_limit_validation_error;
        private final TransferMethodDto transfer_method;
        private final TransferV2DirectionDto transfer_v2_direction;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContextDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MAXTransferContextDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null, null, null};

        public Surrogate() {
            this((String) null, (MoneyDto) null, (TransferAccountDto) null, (TransferAccountDto) null, (TransferContextDto.FrequencyDto) null, (IRAContributionDataDto) null, (EntryPointDto) null, (IRADistributionDataDto) null, (String) null, (ACHTransferDataDto) null, (java.util.List) null, (IRARothConversionDataDto) null, (TransferLimitValidationErrorDto) null, (CurrencyConversionDataDto) null, (String) null, (String) null, (TransferV2DirectionDto) null, (MoneyDto) null, (TransferMethodDto) null, 524287, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(MoneyDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, MoneyDto moneyDto, TransferAccountDto transferAccountDto, TransferAccountDto transferAccountDto2, TransferContextDto.FrequencyDto frequencyDto, IRAContributionDataDto iRAContributionDataDto, EntryPointDto entryPointDto, IRADistributionDataDto iRADistributionDataDto, String str2, ACHTransferDataDto aCHTransferDataDto, java.util.List list, IRARothConversionDataDto iRARothConversionDataDto, TransferLimitValidationErrorDto transferLimitValidationErrorDto, CurrencyConversionDataDto currencyConversionDataDto, String str3, String str4, TransferV2DirectionDto transferV2DirectionDto, MoneyDto moneyDto2, TransferMethodDto transferMethodDto, int i, Object obj) {
            TransferMethodDto transferMethodDto2;
            MoneyDto moneyDto3;
            String str5 = (i & 1) != 0 ? surrogate.id : str;
            MoneyDto moneyDto4 = (i & 2) != 0 ? surrogate.amount : moneyDto;
            TransferAccountDto transferAccountDto3 = (i & 4) != 0 ? surrogate.source_account : transferAccountDto;
            TransferAccountDto transferAccountDto4 = (i & 8) != 0 ? surrogate.sink_account : transferAccountDto2;
            TransferContextDto.FrequencyDto frequencyDto2 = (i & 16) != 0 ? surrogate.frequency : frequencyDto;
            IRAContributionDataDto iRAContributionDataDto2 = (i & 32) != 0 ? surrogate.ira_contribution_data : iRAContributionDataDto;
            EntryPointDto entryPointDto2 = (i & 64) != 0 ? surrogate.entry_point : entryPointDto;
            IRADistributionDataDto iRADistributionDataDto2 = (i & 128) != 0 ? surrogate.ira_distribution_data : iRADistributionDataDto;
            String str6 = (i & 256) != 0 ? surrogate.session_id : str2;
            ACHTransferDataDto aCHTransferDataDto2 = (i & 512) != 0 ? surrogate.ach_transfer_data : aCHTransferDataDto;
            java.util.List list2 = (i & 1024) != 0 ? surrogate.deposit_suggestions : list;
            IRARothConversionDataDto iRARothConversionDataDto2 = (i & 2048) != 0 ? surrogate.ira_roth_conversion_data : iRARothConversionDataDto;
            TransferLimitValidationErrorDto transferLimitValidationErrorDto2 = (i & 4096) != 0 ? surrogate.transfer_limit_validation_error : transferLimitValidationErrorDto;
            CurrencyConversionDataDto currencyConversionDataDto2 = (i & 8192) != 0 ? surrogate.currency_conversion_data : currencyConversionDataDto;
            String str7 = str5;
            String str8 = (i & 16384) != 0 ? surrogate.locality : str3;
            String str9 = (i & 32768) != 0 ? surrogate.entry_point_logging_identifier : str4;
            TransferV2DirectionDto transferV2DirectionDto2 = (i & 65536) != 0 ? surrogate.transfer_v2_direction : transferV2DirectionDto;
            MoneyDto moneyDto5 = (i & 131072) != 0 ? surrogate.selected_pill_amount : moneyDto2;
            if ((i & 262144) != 0) {
                moneyDto3 = moneyDto5;
                transferMethodDto2 = surrogate.transfer_method;
            } else {
                transferMethodDto2 = transferMethodDto;
                moneyDto3 = moneyDto5;
            }
            return surrogate.copy(str7, moneyDto4, transferAccountDto3, transferAccountDto4, frequencyDto2, iRAContributionDataDto2, entryPointDto2, iRADistributionDataDto2, str6, aCHTransferDataDto2, list2, iRARothConversionDataDto2, transferLimitValidationErrorDto2, currencyConversionDataDto2, str8, str9, transferV2DirectionDto2, moneyDto3, transferMethodDto2);
        }

        @SerialName("achTransferData")
        @JsonAnnotations2(names = {"ach_transfer_data"})
        public static /* synthetic */ void getAch_transfer_data$annotations() {
        }

        @SerialName("amount")
        @JsonAnnotations2(names = {"amount"})
        public static /* synthetic */ void getAmount$annotations() {
        }

        @SerialName("currencyConversionData")
        @JsonAnnotations2(names = {"currency_conversion_data"})
        public static /* synthetic */ void getCurrency_conversion_data$annotations() {
        }

        @SerialName("depositSuggestions")
        @JsonAnnotations2(names = {"deposit_suggestions"})
        public static /* synthetic */ void getDeposit_suggestions$annotations() {
        }

        @SerialName("entryPoint")
        @JsonAnnotations2(names = {"entry_point"})
        public static /* synthetic */ void getEntry_point$annotations() {
        }

        @SerialName("entryPointLoggingIdentifier")
        @JsonAnnotations2(names = {"entry_point_logging_identifier"})
        public static /* synthetic */ void getEntry_point_logging_identifier$annotations() {
        }

        @SerialName("frequency")
        @JsonAnnotations2(names = {"frequency"})
        public static /* synthetic */ void getFrequency$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("iraContributionData")
        @JsonAnnotations2(names = {"ira_contribution_data"})
        public static /* synthetic */ void getIra_contribution_data$annotations() {
        }

        @SerialName("iraDistributionData")
        @JsonAnnotations2(names = {"ira_distribution_data"})
        public static /* synthetic */ void getIra_distribution_data$annotations() {
        }

        @SerialName("iraRothConversionData")
        @JsonAnnotations2(names = {"ira_roth_conversion_data"})
        public static /* synthetic */ void getIra_roth_conversion_data$annotations() {
        }

        @SerialName("locality")
        @JsonAnnotations2(names = {"locality"})
        public static /* synthetic */ void getLocality$annotations() {
        }

        @SerialName("selectedPillAmount")
        @JsonAnnotations2(names = {"selected_pill_amount"})
        public static /* synthetic */ void getSelected_pill_amount$annotations() {
        }

        @SerialName("sessionId")
        @JsonAnnotations2(names = {"session_id"})
        public static /* synthetic */ void getSession_id$annotations() {
        }

        @SerialName(CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT)
        @JsonAnnotations2(names = {"sink_account"})
        public static /* synthetic */ void getSink_account$annotations() {
        }

        @SerialName(CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT)
        @JsonAnnotations2(names = {"source_account"})
        public static /* synthetic */ void getSource_account$annotations() {
        }

        @SerialName("transferLimitValidationError")
        @JsonAnnotations2(names = {"transfer_limit_validation_error"})
        public static /* synthetic */ void getTransfer_limit_validation_error$annotations() {
        }

        @SerialName("transferMethod")
        @JsonAnnotations2(names = {"transfer_method"})
        public static /* synthetic */ void getTransfer_method$annotations() {
        }

        @SerialName("transferV2Direction")
        @JsonAnnotations2(names = {"transfer_v2_direction"})
        public static /* synthetic */ void getTransfer_v2_direction$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final ACHTransferDataDto getAch_transfer_data() {
            return this.ach_transfer_data;
        }

        public final java.util.List<MoneyDto> component11() {
            return this.deposit_suggestions;
        }

        /* renamed from: component12, reason: from getter */
        public final IRARothConversionDataDto getIra_roth_conversion_data() {
            return this.ira_roth_conversion_data;
        }

        /* renamed from: component13, reason: from getter */
        public final TransferLimitValidationErrorDto getTransfer_limit_validation_error() {
            return this.transfer_limit_validation_error;
        }

        /* renamed from: component14, reason: from getter */
        public final CurrencyConversionDataDto getCurrency_conversion_data() {
            return this.currency_conversion_data;
        }

        /* renamed from: component15, reason: from getter */
        public final String getLocality() {
            return this.locality;
        }

        /* renamed from: component16, reason: from getter */
        public final String getEntry_point_logging_identifier() {
            return this.entry_point_logging_identifier;
        }

        /* renamed from: component17, reason: from getter */
        public final TransferV2DirectionDto getTransfer_v2_direction() {
            return this.transfer_v2_direction;
        }

        /* renamed from: component18, reason: from getter */
        public final MoneyDto getSelected_pill_amount() {
            return this.selected_pill_amount;
        }

        /* renamed from: component19, reason: from getter */
        public final TransferMethodDto getTransfer_method() {
            return this.transfer_method;
        }

        /* renamed from: component2, reason: from getter */
        public final MoneyDto getAmount() {
            return this.amount;
        }

        /* renamed from: component3, reason: from getter */
        public final TransferAccountDto getSource_account() {
            return this.source_account;
        }

        /* renamed from: component4, reason: from getter */
        public final TransferAccountDto getSink_account() {
            return this.sink_account;
        }

        /* renamed from: component5, reason: from getter */
        public final TransferContextDto.FrequencyDto getFrequency() {
            return this.frequency;
        }

        /* renamed from: component6, reason: from getter */
        public final IRAContributionDataDto getIra_contribution_data() {
            return this.ira_contribution_data;
        }

        /* renamed from: component7, reason: from getter */
        public final EntryPointDto getEntry_point() {
            return this.entry_point;
        }

        /* renamed from: component8, reason: from getter */
        public final IRADistributionDataDto getIra_distribution_data() {
            return this.ira_distribution_data;
        }

        /* renamed from: component9, reason: from getter */
        public final String getSession_id() {
            return this.session_id;
        }

        public final Surrogate copy(String id, MoneyDto amount, TransferAccountDto source_account, TransferAccountDto sink_account, TransferContextDto.FrequencyDto frequency, IRAContributionDataDto ira_contribution_data, EntryPointDto entry_point, IRADistributionDataDto ira_distribution_data, String session_id, ACHTransferDataDto ach_transfer_data, java.util.List<MoneyDto> deposit_suggestions, IRARothConversionDataDto ira_roth_conversion_data, TransferLimitValidationErrorDto transfer_limit_validation_error, CurrencyConversionDataDto currency_conversion_data, String locality, String entry_point_logging_identifier, TransferV2DirectionDto transfer_v2_direction, MoneyDto selected_pill_amount, TransferMethodDto transfer_method) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            Intrinsics.checkNotNullParameter(entry_point, "entry_point");
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            Intrinsics.checkNotNullParameter(deposit_suggestions, "deposit_suggestions");
            Intrinsics.checkNotNullParameter(locality, "locality");
            Intrinsics.checkNotNullParameter(entry_point_logging_identifier, "entry_point_logging_identifier");
            Intrinsics.checkNotNullParameter(transfer_v2_direction, "transfer_v2_direction");
            Intrinsics.checkNotNullParameter(transfer_method, "transfer_method");
            return new Surrogate(id, amount, source_account, sink_account, frequency, ira_contribution_data, entry_point, ira_distribution_data, session_id, ach_transfer_data, deposit_suggestions, ira_roth_conversion_data, transfer_limit_validation_error, currency_conversion_data, locality, entry_point_logging_identifier, transfer_v2_direction, selected_pill_amount, transfer_method);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.amount, surrogate.amount) && Intrinsics.areEqual(this.source_account, surrogate.source_account) && Intrinsics.areEqual(this.sink_account, surrogate.sink_account) && this.frequency == surrogate.frequency && Intrinsics.areEqual(this.ira_contribution_data, surrogate.ira_contribution_data) && this.entry_point == surrogate.entry_point && Intrinsics.areEqual(this.ira_distribution_data, surrogate.ira_distribution_data) && Intrinsics.areEqual(this.session_id, surrogate.session_id) && Intrinsics.areEqual(this.ach_transfer_data, surrogate.ach_transfer_data) && Intrinsics.areEqual(this.deposit_suggestions, surrogate.deposit_suggestions) && Intrinsics.areEqual(this.ira_roth_conversion_data, surrogate.ira_roth_conversion_data) && Intrinsics.areEqual(this.transfer_limit_validation_error, surrogate.transfer_limit_validation_error) && Intrinsics.areEqual(this.currency_conversion_data, surrogate.currency_conversion_data) && Intrinsics.areEqual(this.locality, surrogate.locality) && Intrinsics.areEqual(this.entry_point_logging_identifier, surrogate.entry_point_logging_identifier) && this.transfer_v2_direction == surrogate.transfer_v2_direction && Intrinsics.areEqual(this.selected_pill_amount, surrogate.selected_pill_amount) && this.transfer_method == surrogate.transfer_method;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            MoneyDto moneyDto = this.amount;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            TransferAccountDto transferAccountDto = this.source_account;
            int iHashCode3 = (iHashCode2 + (transferAccountDto == null ? 0 : transferAccountDto.hashCode())) * 31;
            TransferAccountDto transferAccountDto2 = this.sink_account;
            int iHashCode4 = (((iHashCode3 + (transferAccountDto2 == null ? 0 : transferAccountDto2.hashCode())) * 31) + this.frequency.hashCode()) * 31;
            IRAContributionDataDto iRAContributionDataDto = this.ira_contribution_data;
            int iHashCode5 = (((iHashCode4 + (iRAContributionDataDto == null ? 0 : iRAContributionDataDto.hashCode())) * 31) + this.entry_point.hashCode()) * 31;
            IRADistributionDataDto iRADistributionDataDto = this.ira_distribution_data;
            int iHashCode6 = (((iHashCode5 + (iRADistributionDataDto == null ? 0 : iRADistributionDataDto.hashCode())) * 31) + this.session_id.hashCode()) * 31;
            ACHTransferDataDto aCHTransferDataDto = this.ach_transfer_data;
            int iHashCode7 = (((iHashCode6 + (aCHTransferDataDto == null ? 0 : aCHTransferDataDto.hashCode())) * 31) + this.deposit_suggestions.hashCode()) * 31;
            IRARothConversionDataDto iRARothConversionDataDto = this.ira_roth_conversion_data;
            int iHashCode8 = (iHashCode7 + (iRARothConversionDataDto == null ? 0 : iRARothConversionDataDto.hashCode())) * 31;
            TransferLimitValidationErrorDto transferLimitValidationErrorDto = this.transfer_limit_validation_error;
            int iHashCode9 = (iHashCode8 + (transferLimitValidationErrorDto == null ? 0 : transferLimitValidationErrorDto.hashCode())) * 31;
            CurrencyConversionDataDto currencyConversionDataDto = this.currency_conversion_data;
            int iHashCode10 = (((((((iHashCode9 + (currencyConversionDataDto == null ? 0 : currencyConversionDataDto.hashCode())) * 31) + this.locality.hashCode()) * 31) + this.entry_point_logging_identifier.hashCode()) * 31) + this.transfer_v2_direction.hashCode()) * 31;
            MoneyDto moneyDto2 = this.selected_pill_amount;
            return ((iHashCode10 + (moneyDto2 != null ? moneyDto2.hashCode() : 0)) * 31) + this.transfer_method.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", amount=" + this.amount + ", source_account=" + this.source_account + ", sink_account=" + this.sink_account + ", frequency=" + this.frequency + ", ira_contribution_data=" + this.ira_contribution_data + ", entry_point=" + this.entry_point + ", ira_distribution_data=" + this.ira_distribution_data + ", session_id=" + this.session_id + ", ach_transfer_data=" + this.ach_transfer_data + ", deposit_suggestions=" + this.deposit_suggestions + ", ira_roth_conversion_data=" + this.ira_roth_conversion_data + ", transfer_limit_validation_error=" + this.transfer_limit_validation_error + ", currency_conversion_data=" + this.currency_conversion_data + ", locality=" + this.locality + ", entry_point_logging_identifier=" + this.entry_point_logging_identifier + ", transfer_v2_direction=" + this.transfer_v2_direction + ", selected_pill_amount=" + this.selected_pill_amount + ", transfer_method=" + this.transfer_method + ")";
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MAXTransferContextDto$Surrogate$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, MoneyDto moneyDto, TransferAccountDto transferAccountDto, TransferAccountDto transferAccountDto2, TransferContextDto.FrequencyDto frequencyDto, IRAContributionDataDto iRAContributionDataDto, EntryPointDto entryPointDto, IRADistributionDataDto iRADistributionDataDto, String str2, ACHTransferDataDto aCHTransferDataDto, java.util.List list, IRARothConversionDataDto iRARothConversionDataDto, TransferLimitValidationErrorDto transferLimitValidationErrorDto, CurrencyConversionDataDto currencyConversionDataDto, String str3, String str4, TransferV2DirectionDto transferV2DirectionDto, MoneyDto moneyDto2, TransferMethodDto transferMethodDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.amount = null;
            } else {
                this.amount = moneyDto;
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
                this.frequency = TransferContextDto.FrequencyDto.INSTANCE.getZeroValue();
            } else {
                this.frequency = frequencyDto;
            }
            if ((i & 32) == 0) {
                this.ira_contribution_data = null;
            } else {
                this.ira_contribution_data = iRAContributionDataDto;
            }
            if ((i & 64) == 0) {
                this.entry_point = EntryPointDto.INSTANCE.getZeroValue();
            } else {
                this.entry_point = entryPointDto;
            }
            if ((i & 128) == 0) {
                this.ira_distribution_data = null;
            } else {
                this.ira_distribution_data = iRADistributionDataDto;
            }
            if ((i & 256) == 0) {
                this.session_id = "";
            } else {
                this.session_id = str2;
            }
            if ((i & 512) == 0) {
                this.ach_transfer_data = null;
            } else {
                this.ach_transfer_data = aCHTransferDataDto;
            }
            if ((i & 1024) == 0) {
                this.deposit_suggestions = CollectionsKt.emptyList();
            } else {
                this.deposit_suggestions = list;
            }
            if ((i & 2048) == 0) {
                this.ira_roth_conversion_data = null;
            } else {
                this.ira_roth_conversion_data = iRARothConversionDataDto;
            }
            if ((i & 4096) == 0) {
                this.transfer_limit_validation_error = null;
            } else {
                this.transfer_limit_validation_error = transferLimitValidationErrorDto;
            }
            if ((i & 8192) == 0) {
                this.currency_conversion_data = null;
            } else {
                this.currency_conversion_data = currencyConversionDataDto;
            }
            if ((i & 16384) == 0) {
                this.locality = "";
            } else {
                this.locality = str3;
            }
            if ((32768 & i) == 0) {
                this.entry_point_logging_identifier = "";
            } else {
                this.entry_point_logging_identifier = str4;
            }
            this.transfer_v2_direction = (65536 & i) == 0 ? TransferV2DirectionDto.INSTANCE.getZeroValue() : transferV2DirectionDto;
            if ((131072 & i) == 0) {
                this.selected_pill_amount = null;
            } else {
                this.selected_pill_amount = moneyDto2;
            }
            this.transfer_method = (i & 262144) == 0 ? TransferMethodDto.INSTANCE.getZeroValue() : transferMethodDto;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            MoneyDto moneyDto = self.amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            TransferAccountDto transferAccountDto = self.source_account;
            if (transferAccountDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, TransferAccountDto.Serializer.INSTANCE, transferAccountDto);
            }
            TransferAccountDto transferAccountDto2 = self.sink_account;
            if (transferAccountDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, TransferAccountDto.Serializer.INSTANCE, transferAccountDto2);
            }
            if (self.frequency != TransferContextDto.FrequencyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, TransferContextDto.FrequencyDto.Serializer.INSTANCE, self.frequency);
            }
            IRAContributionDataDto iRAContributionDataDto = self.ira_contribution_data;
            if (iRAContributionDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, IRAContributionDataDto.Serializer.INSTANCE, iRAContributionDataDto);
            }
            if (self.entry_point != EntryPointDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, EntryPointDto.Serializer.INSTANCE, self.entry_point);
            }
            IRADistributionDataDto iRADistributionDataDto = self.ira_distribution_data;
            if (iRADistributionDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, IRADistributionDataDto.Serializer.INSTANCE, iRADistributionDataDto);
            }
            if (!Intrinsics.areEqual(self.session_id, "")) {
                output.encodeStringElement(serialDesc, 8, self.session_id);
            }
            ACHTransferDataDto aCHTransferDataDto = self.ach_transfer_data;
            if (aCHTransferDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, ACHTransferDataDto.Serializer.INSTANCE, aCHTransferDataDto);
            }
            if (!Intrinsics.areEqual(self.deposit_suggestions, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 10, lazyArr[10].getValue(), self.deposit_suggestions);
            }
            IRARothConversionDataDto iRARothConversionDataDto = self.ira_roth_conversion_data;
            if (iRARothConversionDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, IRARothConversionDataDto.Serializer.INSTANCE, iRARothConversionDataDto);
            }
            TransferLimitValidationErrorDto transferLimitValidationErrorDto = self.transfer_limit_validation_error;
            if (transferLimitValidationErrorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, TransferLimitValidationErrorDto.Serializer.INSTANCE, transferLimitValidationErrorDto);
            }
            CurrencyConversionDataDto currencyConversionDataDto = self.currency_conversion_data;
            if (currencyConversionDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, CurrencyConversionDataDto.Serializer.INSTANCE, currencyConversionDataDto);
            }
            if (!Intrinsics.areEqual(self.locality, "")) {
                output.encodeStringElement(serialDesc, 14, self.locality);
            }
            if (!Intrinsics.areEqual(self.entry_point_logging_identifier, "")) {
                output.encodeStringElement(serialDesc, 15, self.entry_point_logging_identifier);
            }
            if (self.transfer_v2_direction != TransferV2DirectionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 16, TransferV2DirectionDto.Serializer.INSTANCE, self.transfer_v2_direction);
            }
            MoneyDto moneyDto2 = self.selected_pill_amount;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            if (self.transfer_method != TransferMethodDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 18, TransferMethodDto.Serializer.INSTANCE, self.transfer_method);
            }
        }

        public Surrogate(String id, MoneyDto moneyDto, TransferAccountDto transferAccountDto, TransferAccountDto transferAccountDto2, TransferContextDto.FrequencyDto frequency, IRAContributionDataDto iRAContributionDataDto, EntryPointDto entry_point, IRADistributionDataDto iRADistributionDataDto, String session_id, ACHTransferDataDto aCHTransferDataDto, java.util.List<MoneyDto> deposit_suggestions, IRARothConversionDataDto iRARothConversionDataDto, TransferLimitValidationErrorDto transferLimitValidationErrorDto, CurrencyConversionDataDto currencyConversionDataDto, String locality, String entry_point_logging_identifier, TransferV2DirectionDto transfer_v2_direction, MoneyDto moneyDto2, TransferMethodDto transfer_method) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            Intrinsics.checkNotNullParameter(entry_point, "entry_point");
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            Intrinsics.checkNotNullParameter(deposit_suggestions, "deposit_suggestions");
            Intrinsics.checkNotNullParameter(locality, "locality");
            Intrinsics.checkNotNullParameter(entry_point_logging_identifier, "entry_point_logging_identifier");
            Intrinsics.checkNotNullParameter(transfer_v2_direction, "transfer_v2_direction");
            Intrinsics.checkNotNullParameter(transfer_method, "transfer_method");
            this.id = id;
            this.amount = moneyDto;
            this.source_account = transferAccountDto;
            this.sink_account = transferAccountDto2;
            this.frequency = frequency;
            this.ira_contribution_data = iRAContributionDataDto;
            this.entry_point = entry_point;
            this.ira_distribution_data = iRADistributionDataDto;
            this.session_id = session_id;
            this.ach_transfer_data = aCHTransferDataDto;
            this.deposit_suggestions = deposit_suggestions;
            this.ira_roth_conversion_data = iRARothConversionDataDto;
            this.transfer_limit_validation_error = transferLimitValidationErrorDto;
            this.currency_conversion_data = currencyConversionDataDto;
            this.locality = locality;
            this.entry_point_logging_identifier = entry_point_logging_identifier;
            this.transfer_v2_direction = transfer_v2_direction;
            this.selected_pill_amount = moneyDto2;
            this.transfer_method = transfer_method;
        }

        public /* synthetic */ Surrogate(String str, MoneyDto moneyDto, TransferAccountDto transferAccountDto, TransferAccountDto transferAccountDto2, TransferContextDto.FrequencyDto frequencyDto, IRAContributionDataDto iRAContributionDataDto, EntryPointDto entryPointDto, IRADistributionDataDto iRADistributionDataDto, String str2, ACHTransferDataDto aCHTransferDataDto, java.util.List list, IRARothConversionDataDto iRARothConversionDataDto, TransferLimitValidationErrorDto transferLimitValidationErrorDto, CurrencyConversionDataDto currencyConversionDataDto, String str3, String str4, TransferV2DirectionDto transferV2DirectionDto, MoneyDto moneyDto2, TransferMethodDto transferMethodDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : moneyDto, (i & 4) != 0 ? null : transferAccountDto, (i & 8) != 0 ? null : transferAccountDto2, (i & 16) != 0 ? TransferContextDto.FrequencyDto.INSTANCE.getZeroValue() : frequencyDto, (i & 32) != 0 ? null : iRAContributionDataDto, (i & 64) != 0 ? EntryPointDto.INSTANCE.getZeroValue() : entryPointDto, (i & 128) != 0 ? null : iRADistributionDataDto, (i & 256) != 0 ? "" : str2, (i & 512) != 0 ? null : aCHTransferDataDto, (i & 1024) != 0 ? CollectionsKt.emptyList() : list, (i & 2048) != 0 ? null : iRARothConversionDataDto, (i & 4096) != 0 ? null : transferLimitValidationErrorDto, (i & 8192) != 0 ? null : currencyConversionDataDto, (i & 16384) != 0 ? "" : str3, (i & 32768) == 0 ? str4 : "", (i & 65536) != 0 ? TransferV2DirectionDto.INSTANCE.getZeroValue() : transferV2DirectionDto, (i & 131072) != 0 ? null : moneyDto2, (i & 262144) != 0 ? TransferMethodDto.INSTANCE.getZeroValue() : transferMethodDto);
        }

        public final String getId() {
            return this.id;
        }

        public final MoneyDto getAmount() {
            return this.amount;
        }

        public final TransferAccountDto getSource_account() {
            return this.source_account;
        }

        public final TransferAccountDto getSink_account() {
            return this.sink_account;
        }

        public final TransferContextDto.FrequencyDto getFrequency() {
            return this.frequency;
        }

        public final IRAContributionDataDto getIra_contribution_data() {
            return this.ira_contribution_data;
        }

        public final EntryPointDto getEntry_point() {
            return this.entry_point;
        }

        public final IRADistributionDataDto getIra_distribution_data() {
            return this.ira_distribution_data;
        }

        public final String getSession_id() {
            return this.session_id;
        }

        public final ACHTransferDataDto getAch_transfer_data() {
            return this.ach_transfer_data;
        }

        public final java.util.List<MoneyDto> getDeposit_suggestions() {
            return this.deposit_suggestions;
        }

        public final IRARothConversionDataDto getIra_roth_conversion_data() {
            return this.ira_roth_conversion_data;
        }

        public final TransferLimitValidationErrorDto getTransfer_limit_validation_error() {
            return this.transfer_limit_validation_error;
        }

        public final CurrencyConversionDataDto getCurrency_conversion_data() {
            return this.currency_conversion_data;
        }

        public final String getLocality() {
            return this.locality;
        }

        public final String getEntry_point_logging_identifier() {
            return this.entry_point_logging_identifier;
        }

        public final TransferV2DirectionDto getTransfer_v2_direction() {
            return this.transfer_v2_direction;
        }

        public final MoneyDto getSelected_pill_amount() {
            return this.selected_pill_amount;
        }

        public final TransferMethodDto getTransfer_method() {
            return this.transfer_method;
        }
    }

    /* compiled from: MAXTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<MAXTransferContextDto, MAXTransferContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MAXTransferContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MAXTransferContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MAXTransferContextDto> getBinaryBase64Serializer() {
            return (KSerializer) MAXTransferContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MAXTransferContext> getProtoAdapter() {
            return MAXTransferContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MAXTransferContextDto getZeroValue() {
            return MAXTransferContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MAXTransferContextDto fromProto(MAXTransferContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            Money amount = proto.getAmount();
            MoneyDto moneyDtoFromProto = amount != null ? MoneyDto.INSTANCE.fromProto(amount) : null;
            MAXTransferContext.TransferAccount source_account = proto.getSource_account();
            TransferAccountDto transferAccountDtoFromProto = source_account != null ? TransferAccountDto.INSTANCE.fromProto(source_account) : null;
            MAXTransferContext.TransferAccount sink_account = proto.getSink_account();
            TransferAccountDto transferAccountDtoFromProto2 = sink_account != null ? TransferAccountDto.INSTANCE.fromProto(sink_account) : null;
            TransferContextDto.FrequencyDto frequencyDtoFromProto = TransferContextDto.FrequencyDto.INSTANCE.fromProto(proto.getFrequency());
            MAXTransferContext.IRAContributionData ira_contribution_data = proto.getIra_contribution_data();
            IRAContributionDataDto iRAContributionDataDtoFromProto = ira_contribution_data != null ? IRAContributionDataDto.INSTANCE.fromProto(ira_contribution_data) : null;
            EntryPointDto entryPointDtoFromProto = EntryPointDto.INSTANCE.fromProto(proto.getEntry_point());
            MAXTransferContext.IRADistributionData ira_distribution_data = proto.getIra_distribution_data();
            IRADistributionDataDto iRADistributionDataDtoFromProto = ira_distribution_data != null ? IRADistributionDataDto.INSTANCE.fromProto(ira_distribution_data) : null;
            String session_id = proto.getSession_id();
            MAXTransferContext.ACHTransferData ach_transfer_data = proto.getAch_transfer_data();
            ACHTransferDataDto aCHTransferDataDtoFromProto = ach_transfer_data != null ? ACHTransferDataDto.INSTANCE.fromProto(ach_transfer_data) : null;
            java.util.List<Money> deposit_suggestions = proto.getDeposit_suggestions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(deposit_suggestions, 10));
            Iterator<T> it = deposit_suggestions.iterator();
            while (it.hasNext()) {
                arrayList.add(MoneyDto.INSTANCE.fromProto((Money) it.next()));
            }
            MAXTransferContext.IRARothConversionData ira_roth_conversion_data = proto.getIra_roth_conversion_data();
            IRARothConversionDataDto iRARothConversionDataDtoFromProto = ira_roth_conversion_data != null ? IRARothConversionDataDto.INSTANCE.fromProto(ira_roth_conversion_data) : null;
            MAXTransferContext.TransferLimitValidationError transfer_limit_validation_error = proto.getTransfer_limit_validation_error();
            TransferLimitValidationErrorDto transferLimitValidationErrorDtoFromProto = transfer_limit_validation_error != null ? TransferLimitValidationErrorDto.INSTANCE.fromProto(transfer_limit_validation_error) : null;
            MAXTransferContext.CurrencyConversionData currency_conversion_data = proto.getCurrency_conversion_data();
            CurrencyConversionDataDto currencyConversionDataDtoFromProto = currency_conversion_data != null ? CurrencyConversionDataDto.INSTANCE.fromProto(currency_conversion_data) : null;
            String locality = proto.getLocality();
            String entry_point_logging_identifier = proto.getEntry_point_logging_identifier();
            MoneyDto moneyDto = moneyDtoFromProto;
            TransferV2DirectionDto transferV2DirectionDtoFromProto = TransferV2DirectionDto.INSTANCE.fromProto(proto.getTransfer_v2_direction());
            Money selected_pill_amount = proto.getSelected_pill_amount();
            return new MAXTransferContextDto(new Surrogate(id, moneyDto, transferAccountDtoFromProto, transferAccountDtoFromProto2, frequencyDtoFromProto, iRAContributionDataDtoFromProto, entryPointDtoFromProto, iRADistributionDataDtoFromProto, session_id, aCHTransferDataDtoFromProto, arrayList, iRARothConversionDataDtoFromProto, transferLimitValidationErrorDtoFromProto, currencyConversionDataDtoFromProto, locality, entry_point_logging_identifier, transferV2DirectionDtoFromProto, selected_pill_amount != null ? MoneyDto.INSTANCE.fromProto(selected_pill_amount) : null, TransferMethodDto.INSTANCE.fromProto(proto.getTransfer_method())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MAXTransferContextDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new MAXTransferContextDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MAXTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006*+,-./B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0011J:\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\tJ\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013¨\u00060"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$Surrogate;)V", "account_id", "", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;", "ach_transfer_account_metadata", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$ACHTransferAccountMetadataDto;", "currency", "Lcom/robinhood/rosetta/common/CurrencyDto;", "masked_account_id", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$ACHTransferAccountMetadataDto;Lcom/robinhood/rosetta/common/CurrencyDto;Ljava/lang/String;)V", "getAccount_id", "()Ljava/lang/String;", "getAccount_type", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;", "getAch_transfer_account_metadata", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$ACHTransferAccountMetadataDto;", "getCurrency", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getMasked_account_id", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "TransferAccountTypeDto", "ACHTransferAccountMetadataDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TransferAccountDto implements Dto3<MAXTransferContext.TransferAccount>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<TransferAccountDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TransferAccountDto, MAXTransferContext.TransferAccount>> binaryBase64Serializer$delegate;
        private static final TransferAccountDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ TransferAccountDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private TransferAccountDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getAccount_id() {
            return this.surrogate.getAccount_id();
        }

        public final TransferAccountTypeDto getAccount_type() {
            return this.surrogate.getAccount_type();
        }

        public final ACHTransferAccountMetadataDto getAch_transfer_account_metadata() {
            return this.surrogate.getAch_transfer_account_metadata();
        }

        public final CurrencyDto getCurrency() {
            return this.surrogate.getCurrency();
        }

        public final String getMasked_account_id() {
            return this.surrogate.getMasked_account_id();
        }

        public /* synthetic */ TransferAccountDto(String str, TransferAccountTypeDto transferAccountTypeDto, ACHTransferAccountMetadataDto aCHTransferAccountMetadataDto, CurrencyDto currencyDto, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TransferAccountTypeDto.INSTANCE.getZeroValue() : transferAccountTypeDto, (i & 4) != 0 ? null : aCHTransferAccountMetadataDto, (i & 8) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto, (i & 16) != 0 ? "" : str2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TransferAccountDto(String account_id, TransferAccountTypeDto account_type, ACHTransferAccountMetadataDto aCHTransferAccountMetadataDto, CurrencyDto currency, String masked_account_id) {
            this(new Surrogate(account_id, account_type, aCHTransferAccountMetadataDto, currency, masked_account_id));
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(masked_account_id, "masked_account_id");
        }

        public static /* synthetic */ TransferAccountDto copy$default(TransferAccountDto transferAccountDto, String str, TransferAccountTypeDto transferAccountTypeDto, ACHTransferAccountMetadataDto aCHTransferAccountMetadataDto, CurrencyDto currencyDto, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = transferAccountDto.surrogate.getAccount_id();
            }
            if ((i & 2) != 0) {
                transferAccountTypeDto = transferAccountDto.surrogate.getAccount_type();
            }
            if ((i & 4) != 0) {
                aCHTransferAccountMetadataDto = transferAccountDto.surrogate.getAch_transfer_account_metadata();
            }
            if ((i & 8) != 0) {
                currencyDto = transferAccountDto.surrogate.getCurrency();
            }
            if ((i & 16) != 0) {
                str2 = transferAccountDto.surrogate.getMasked_account_id();
            }
            String str3 = str2;
            ACHTransferAccountMetadataDto aCHTransferAccountMetadataDto2 = aCHTransferAccountMetadataDto;
            return transferAccountDto.copy(str, transferAccountTypeDto, aCHTransferAccountMetadataDto2, currencyDto, str3);
        }

        public final TransferAccountDto copy(String account_id, TransferAccountTypeDto account_type, ACHTransferAccountMetadataDto ach_transfer_account_metadata, CurrencyDto currency, String masked_account_id) {
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(masked_account_id, "masked_account_id");
            return new TransferAccountDto(new Surrogate(account_id, account_type, ach_transfer_account_metadata, currency, masked_account_id));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public MAXTransferContext.TransferAccount toProto() {
            String account_id = this.surrogate.getAccount_id();
            MAXTransferContext.TransferAccount.TransferAccountType transferAccountType = (MAXTransferContext.TransferAccount.TransferAccountType) this.surrogate.getAccount_type().toProto();
            ACHTransferAccountMetadataDto ach_transfer_account_metadata = this.surrogate.getAch_transfer_account_metadata();
            return new MAXTransferContext.TransferAccount(account_id, transferAccountType, ach_transfer_account_metadata != null ? ach_transfer_account_metadata.toProto() : null, (Currency) this.surrogate.getCurrency().toProto(), this.surrogate.getMasked_account_id(), null, 32, null);
        }

        public String toString() {
            return "[TransferAccountDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof TransferAccountDto) && Intrinsics.areEqual(((TransferAccountDto) other).surrogate, this.surrogate);
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
        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000245B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J=\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u000eHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J%\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0001¢\u0006\u0002\b3R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0015¨\u00066"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$Surrogate;", "", "account_id", "", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;", "ach_transfer_account_metadata", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$ACHTransferAccountMetadataDto;", "currency", "Lcom/robinhood/rosetta/common/CurrencyDto;", "masked_account_id", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$ACHTransferAccountMetadataDto;Lcom/robinhood/rosetta/common/CurrencyDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$ACHTransferAccountMetadataDto;Lcom/robinhood/rosetta/common/CurrencyDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAccount_id$annotations", "()V", "getAccount_id", "()Ljava/lang/String;", "getAccount_type$annotations", "getAccount_type", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;", "getAch_transfer_account_metadata$annotations", "getAch_transfer_account_metadata", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$ACHTransferAccountMetadataDto;", "getCurrency$annotations", "getCurrency", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getMasked_account_id$annotations", "getMasked_account_id", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String account_id;
            private final TransferAccountTypeDto account_type;
            private final ACHTransferAccountMetadataDto ach_transfer_account_metadata;
            private final CurrencyDto currency;
            private final String masked_account_id;

            public Surrogate() {
                this((String) null, (TransferAccountTypeDto) null, (ACHTransferAccountMetadataDto) null, (CurrencyDto) null, (String) null, 31, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, TransferAccountTypeDto transferAccountTypeDto, ACHTransferAccountMetadataDto aCHTransferAccountMetadataDto, CurrencyDto currencyDto, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = surrogate.account_id;
                }
                if ((i & 2) != 0) {
                    transferAccountTypeDto = surrogate.account_type;
                }
                if ((i & 4) != 0) {
                    aCHTransferAccountMetadataDto = surrogate.ach_transfer_account_metadata;
                }
                if ((i & 8) != 0) {
                    currencyDto = surrogate.currency;
                }
                if ((i & 16) != 0) {
                    str2 = surrogate.masked_account_id;
                }
                String str3 = str2;
                ACHTransferAccountMetadataDto aCHTransferAccountMetadataDto2 = aCHTransferAccountMetadataDto;
                return surrogate.copy(str, transferAccountTypeDto, aCHTransferAccountMetadataDto2, currencyDto, str3);
            }

            @SerialName("accountId")
            @JsonAnnotations2(names = {"account_id"})
            public static /* synthetic */ void getAccount_id$annotations() {
            }

            @SerialName("accountType")
            @JsonAnnotations2(names = {InstantCashConstants.ACCOUNT_TYPE_KEY})
            public static /* synthetic */ void getAccount_type$annotations() {
            }

            @SerialName("achTransferAccountMetadata")
            @JsonAnnotations2(names = {"ach_transfer_account_metadata"})
            public static /* synthetic */ void getAch_transfer_account_metadata$annotations() {
            }

            @SerialName("currency")
            @JsonAnnotations2(names = {"currency"})
            public static /* synthetic */ void getCurrency$annotations() {
            }

            @SerialName("maskedAccountId")
            @JsonAnnotations2(names = {"masked_account_id"})
            public static /* synthetic */ void getMasked_account_id$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccount_id() {
                return this.account_id;
            }

            /* renamed from: component2, reason: from getter */
            public final TransferAccountTypeDto getAccount_type() {
                return this.account_type;
            }

            /* renamed from: component3, reason: from getter */
            public final ACHTransferAccountMetadataDto getAch_transfer_account_metadata() {
                return this.ach_transfer_account_metadata;
            }

            /* renamed from: component4, reason: from getter */
            public final CurrencyDto getCurrency() {
                return this.currency;
            }

            /* renamed from: component5, reason: from getter */
            public final String getMasked_account_id() {
                return this.masked_account_id;
            }

            public final Surrogate copy(String account_id, TransferAccountTypeDto account_type, ACHTransferAccountMetadataDto ach_transfer_account_metadata, CurrencyDto currency, String masked_account_id) {
                Intrinsics.checkNotNullParameter(account_id, "account_id");
                Intrinsics.checkNotNullParameter(account_type, "account_type");
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(masked_account_id, "masked_account_id");
                return new Surrogate(account_id, account_type, ach_transfer_account_metadata, currency, masked_account_id);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.account_id, surrogate.account_id) && this.account_type == surrogate.account_type && Intrinsics.areEqual(this.ach_transfer_account_metadata, surrogate.ach_transfer_account_metadata) && this.currency == surrogate.currency && Intrinsics.areEqual(this.masked_account_id, surrogate.masked_account_id);
            }

            public int hashCode() {
                int iHashCode = ((this.account_id.hashCode() * 31) + this.account_type.hashCode()) * 31;
                ACHTransferAccountMetadataDto aCHTransferAccountMetadataDto = this.ach_transfer_account_metadata;
                return ((((iHashCode + (aCHTransferAccountMetadataDto == null ? 0 : aCHTransferAccountMetadataDto.hashCode())) * 31) + this.currency.hashCode()) * 31) + this.masked_account_id.hashCode();
            }

            public String toString() {
                return "Surrogate(account_id=" + this.account_id + ", account_type=" + this.account_type + ", ach_transfer_account_metadata=" + this.ach_transfer_account_metadata + ", currency=" + this.currency + ", masked_account_id=" + this.masked_account_id + ")";
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return MAXTransferContextDto$TransferAccountDto$Surrogate$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, TransferAccountTypeDto transferAccountTypeDto, ACHTransferAccountMetadataDto aCHTransferAccountMetadataDto, CurrencyDto currencyDto, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.account_id = "";
                } else {
                    this.account_id = str;
                }
                if ((i & 2) == 0) {
                    this.account_type = TransferAccountTypeDto.INSTANCE.getZeroValue();
                } else {
                    this.account_type = transferAccountTypeDto;
                }
                if ((i & 4) == 0) {
                    this.ach_transfer_account_metadata = null;
                } else {
                    this.ach_transfer_account_metadata = aCHTransferAccountMetadataDto;
                }
                if ((i & 8) == 0) {
                    this.currency = CurrencyDto.INSTANCE.getZeroValue();
                } else {
                    this.currency = currencyDto;
                }
                if ((i & 16) == 0) {
                    this.masked_account_id = "";
                } else {
                    this.masked_account_id = str2;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.account_id, "")) {
                    output.encodeStringElement(serialDesc, 0, self.account_id);
                }
                if (self.account_type != TransferAccountTypeDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 1, TransferAccountTypeDto.Serializer.INSTANCE, self.account_type);
                }
                ACHTransferAccountMetadataDto aCHTransferAccountMetadataDto = self.ach_transfer_account_metadata;
                if (aCHTransferAccountMetadataDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, ACHTransferAccountMetadataDto.Serializer.INSTANCE, aCHTransferAccountMetadataDto);
                }
                if (self.currency != CurrencyDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 3, CurrencyDto.Serializer.INSTANCE, self.currency);
                }
                if (Intrinsics.areEqual(self.masked_account_id, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 4, self.masked_account_id);
            }

            public Surrogate(String account_id, TransferAccountTypeDto account_type, ACHTransferAccountMetadataDto aCHTransferAccountMetadataDto, CurrencyDto currency, String masked_account_id) {
                Intrinsics.checkNotNullParameter(account_id, "account_id");
                Intrinsics.checkNotNullParameter(account_type, "account_type");
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(masked_account_id, "masked_account_id");
                this.account_id = account_id;
                this.account_type = account_type;
                this.ach_transfer_account_metadata = aCHTransferAccountMetadataDto;
                this.currency = currency;
                this.masked_account_id = masked_account_id;
            }

            public /* synthetic */ Surrogate(String str, TransferAccountTypeDto transferAccountTypeDto, ACHTransferAccountMetadataDto aCHTransferAccountMetadataDto, CurrencyDto currencyDto, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TransferAccountTypeDto.INSTANCE.getZeroValue() : transferAccountTypeDto, (i & 4) != 0 ? null : aCHTransferAccountMetadataDto, (i & 8) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto, (i & 16) != 0 ? "" : str2);
            }

            public final String getAccount_id() {
                return this.account_id;
            }

            public final TransferAccountTypeDto getAccount_type() {
                return this.account_type;
            }

            public final ACHTransferAccountMetadataDto getAch_transfer_account_metadata() {
                return this.ach_transfer_account_metadata;
            }

            public final CurrencyDto getCurrency() {
                return this.currency;
            }

            public final String getMasked_account_id() {
                return this.masked_account_id;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<TransferAccountDto, MAXTransferContext.TransferAccount> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TransferAccountDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TransferAccountDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TransferAccountDto> getBinaryBase64Serializer() {
                return (KSerializer) TransferAccountDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<MAXTransferContext.TransferAccount> getProtoAdapter() {
                return MAXTransferContext.TransferAccount.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TransferAccountDto getZeroValue() {
                return TransferAccountDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TransferAccountDto fromProto(MAXTransferContext.TransferAccount proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                String account_id = proto.getAccount_id();
                TransferAccountTypeDto transferAccountTypeDtoFromProto = TransferAccountTypeDto.INSTANCE.fromProto(proto.getAccount_type());
                MAXTransferContext.TransferAccount.ACHTransferAccountMetadata ach_transfer_account_metadata = proto.getAch_transfer_account_metadata();
                return new TransferAccountDto(new Surrogate(account_id, transferAccountTypeDtoFromProto, ach_transfer_account_metadata != null ? ACHTransferAccountMetadataDto.INSTANCE.fromProto(ach_transfer_account_metadata) : null, CurrencyDto.INSTANCE.fromProto(proto.getCurrency()), proto.getMasked_account_id()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContextDto$TransferAccountDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MAXTransferContextDto.TransferAccountDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new TransferAccountDto(null, null, null, null, null, 31, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001b\u001cB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TRANSFER_ACCOUNT_TYPE_UNSPECIFIED", "ACH", "RHS", "RHY", "RHY_BANKING", "IRA_TRADITIONAL", "IRA_ROTH", "DCF", "UK_BANK_ACCOUNT", "APPLE_PAY_DCF", "JOINT_TENANCY_WITH_ROS", "OUTGOING_WIRE_ACCOUNT", "I18N_BANK_ACCOUNT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class TransferAccountTypeDto implements Dto2<MAXTransferContext.TransferAccount.TransferAccountType>, Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ TransferAccountTypeDto[] $VALUES;

            @JvmField
            public static final Parcelable.Creator<TransferAccountTypeDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<TransferAccountTypeDto, MAXTransferContext.TransferAccount.TransferAccountType>> binaryBase64Serializer$delegate;
            public static final TransferAccountTypeDto TRANSFER_ACCOUNT_TYPE_UNSPECIFIED = new TRANSFER_ACCOUNT_TYPE_UNSPECIFIED("TRANSFER_ACCOUNT_TYPE_UNSPECIFIED", 0);
            public static final TransferAccountTypeDto ACH = new ACH("ACH", 1);
            public static final TransferAccountTypeDto RHS = new RHS("RHS", 2);
            public static final TransferAccountTypeDto RHY = new RHY("RHY", 3);
            public static final TransferAccountTypeDto RHY_BANKING = new RHY_BANKING("RHY_BANKING", 4);
            public static final TransferAccountTypeDto IRA_TRADITIONAL = new IRA_TRADITIONAL("IRA_TRADITIONAL", 5);
            public static final TransferAccountTypeDto IRA_ROTH = new IRA_ROTH("IRA_ROTH", 6);
            public static final TransferAccountTypeDto DCF = new DCF("DCF", 7);
            public static final TransferAccountTypeDto UK_BANK_ACCOUNT = new UK_BANK_ACCOUNT("UK_BANK_ACCOUNT", 8);
            public static final TransferAccountTypeDto APPLE_PAY_DCF = new APPLE_PAY_DCF("APPLE_PAY_DCF", 9);
            public static final TransferAccountTypeDto JOINT_TENANCY_WITH_ROS = new JOINT_TENANCY_WITH_ROS("JOINT_TENANCY_WITH_ROS", 10);
            public static final TransferAccountTypeDto OUTGOING_WIRE_ACCOUNT = new OUTGOING_WIRE_ACCOUNT("OUTGOING_WIRE_ACCOUNT", 11);
            public static final TransferAccountTypeDto I18N_BANK_ACCOUNT = new I18N_BANK_ACCOUNT("I18N_BANK_ACCOUNT", 12);

            private static final /* synthetic */ TransferAccountTypeDto[] $values() {
                return new TransferAccountTypeDto[]{TRANSFER_ACCOUNT_TYPE_UNSPECIFIED, ACH, RHS, RHY, RHY_BANKING, IRA_TRADITIONAL, IRA_ROTH, DCF, UK_BANK_ACCOUNT, APPLE_PAY_DCF, JOINT_TENANCY_WITH_ROS, OUTGOING_WIRE_ACCOUNT, I18N_BANK_ACCOUNT};
            }

            public /* synthetic */ TransferAccountTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i);
            }

            public static EnumEntries<TransferAccountTypeDto> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private TransferAccountTypeDto(String str, int i) {
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferAccountDto.TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class TRANSFER_ACCOUNT_TYPE_UNSPECIFIED extends TransferAccountTypeDto {
                TRANSFER_ACCOUNT_TYPE_UNSPECIFIED(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public MAXTransferContext.TransferAccount.TransferAccountType toProto() {
                    return MAXTransferContext.TransferAccount.TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED;
                }
            }

            static {
                TransferAccountTypeDto[] transferAccountTypeDtoArr$values = $values();
                $VALUES = transferAccountTypeDtoArr$values;
                $ENTRIES = EnumEntries2.enumEntries(transferAccountTypeDtoArr$values);
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MAXTransferContextDto.TransferAccountDto.TransferAccountTypeDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferAccountDto.TransferAccountTypeDto.ACH", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class ACH extends TransferAccountTypeDto {
                ACH(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public MAXTransferContext.TransferAccount.TransferAccountType toProto() {
                    return MAXTransferContext.TransferAccount.TransferAccountType.ACH;
                }
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferAccountDto.TransferAccountTypeDto.RHS", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class RHS extends TransferAccountTypeDto {
                RHS(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public MAXTransferContext.TransferAccount.TransferAccountType toProto() {
                    return MAXTransferContext.TransferAccount.TransferAccountType.RHS;
                }
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferAccountDto.TransferAccountTypeDto.RHY", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class RHY extends TransferAccountTypeDto {
                RHY(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public MAXTransferContext.TransferAccount.TransferAccountType toProto() {
                    return MAXTransferContext.TransferAccount.TransferAccountType.RHY;
                }
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferAccountDto.TransferAccountTypeDto.RHY_BANKING", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            static final class RHY_BANKING extends TransferAccountTypeDto {
                RHY_BANKING(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public MAXTransferContext.TransferAccount.TransferAccountType toProto() {
                    return MAXTransferContext.TransferAccount.TransferAccountType.RHY_BANKING;
                }
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferAccountDto.TransferAccountTypeDto.IRA_TRADITIONAL", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class IRA_TRADITIONAL extends TransferAccountTypeDto {
                IRA_TRADITIONAL(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public MAXTransferContext.TransferAccount.TransferAccountType toProto() {
                    return MAXTransferContext.TransferAccount.TransferAccountType.IRA_TRADITIONAL;
                }
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferAccountDto.TransferAccountTypeDto.IRA_ROTH", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class IRA_ROTH extends TransferAccountTypeDto {
                IRA_ROTH(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public MAXTransferContext.TransferAccount.TransferAccountType toProto() {
                    return MAXTransferContext.TransferAccount.TransferAccountType.IRA_ROTH;
                }
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferAccountDto.TransferAccountTypeDto.DCF", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class DCF extends TransferAccountTypeDto {
                DCF(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public MAXTransferContext.TransferAccount.TransferAccountType toProto() {
                    return MAXTransferContext.TransferAccount.TransferAccountType.DCF;
                }
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferAccountDto.TransferAccountTypeDto.UK_BANK_ACCOUNT", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class UK_BANK_ACCOUNT extends TransferAccountTypeDto {
                UK_BANK_ACCOUNT(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public MAXTransferContext.TransferAccount.TransferAccountType toProto() {
                    return MAXTransferContext.TransferAccount.TransferAccountType.UK_BANK_ACCOUNT;
                }
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferAccountDto.TransferAccountTypeDto.APPLE_PAY_DCF", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class APPLE_PAY_DCF extends TransferAccountTypeDto {
                APPLE_PAY_DCF(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public MAXTransferContext.TransferAccount.TransferAccountType toProto() {
                    return MAXTransferContext.TransferAccount.TransferAccountType.APPLE_PAY_DCF;
                }
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferAccountDto.TransferAccountTypeDto.JOINT_TENANCY_WITH_ROS", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class JOINT_TENANCY_WITH_ROS extends TransferAccountTypeDto {
                JOINT_TENANCY_WITH_ROS(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public MAXTransferContext.TransferAccount.TransferAccountType toProto() {
                    return MAXTransferContext.TransferAccount.TransferAccountType.JOINT_TENANCY_WITH_ROS;
                }
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferAccountDto.TransferAccountTypeDto.OUTGOING_WIRE_ACCOUNT", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class OUTGOING_WIRE_ACCOUNT extends TransferAccountTypeDto {
                OUTGOING_WIRE_ACCOUNT(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public MAXTransferContext.TransferAccount.TransferAccountType toProto() {
                    return MAXTransferContext.TransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT;
                }
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferAccountDto.TransferAccountTypeDto.I18N_BANK_ACCOUNT", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            static final class I18N_BANK_ACCOUNT extends TransferAccountTypeDto {
                I18N_BANK_ACCOUNT(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public MAXTransferContext.TransferAccount.TransferAccountType toProto() {
                    return MAXTransferContext.TransferAccount.TransferAccountType.I18N_BANK_ACCOUNT;
                }
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto2.Creator<TransferAccountTypeDto, MAXTransferContext.TransferAccount.TransferAccountType> {

                /* compiled from: MAXTransferContextDto.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* loaded from: classes26.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[MAXTransferContext.TransferAccount.TransferAccountType.values().length];
                        try {
                            iArr[MAXTransferContext.TransferAccount.TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[MAXTransferContext.TransferAccount.TransferAccountType.ACH.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[MAXTransferContext.TransferAccount.TransferAccountType.RHS.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[MAXTransferContext.TransferAccount.TransferAccountType.RHY.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[MAXTransferContext.TransferAccount.TransferAccountType.RHY_BANKING.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[MAXTransferContext.TransferAccount.TransferAccountType.IRA_TRADITIONAL.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[MAXTransferContext.TransferAccount.TransferAccountType.IRA_ROTH.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        try {
                            iArr[MAXTransferContext.TransferAccount.TransferAccountType.DCF.ordinal()] = 8;
                        } catch (NoSuchFieldError unused8) {
                        }
                        try {
                            iArr[MAXTransferContext.TransferAccount.TransferAccountType.UK_BANK_ACCOUNT.ordinal()] = 9;
                        } catch (NoSuchFieldError unused9) {
                        }
                        try {
                            iArr[MAXTransferContext.TransferAccount.TransferAccountType.APPLE_PAY_DCF.ordinal()] = 10;
                        } catch (NoSuchFieldError unused10) {
                        }
                        try {
                            iArr[MAXTransferContext.TransferAccount.TransferAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 11;
                        } catch (NoSuchFieldError unused11) {
                        }
                        try {
                            iArr[MAXTransferContext.TransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT.ordinal()] = 12;
                        } catch (NoSuchFieldError unused12) {
                        }
                        try {
                            iArr[MAXTransferContext.TransferAccount.TransferAccountType.I18N_BANK_ACCOUNT.ordinal()] = 13;
                        } catch (NoSuchFieldError unused13) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<TransferAccountTypeDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<TransferAccountTypeDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<TransferAccountTypeDto> getBinaryBase64Serializer() {
                    return (KSerializer) TransferAccountTypeDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<MAXTransferContext.TransferAccount.TransferAccountType> getProtoAdapter() {
                    return MAXTransferContext.TransferAccount.TransferAccountType.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TransferAccountTypeDto getZeroValue() {
                    return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TransferAccountTypeDto fromProto(MAXTransferContext.TransferAccount.TransferAccountType proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                        case 1:
                            return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED;
                        case 2:
                            return TransferAccountTypeDto.ACH;
                        case 3:
                            return TransferAccountTypeDto.RHS;
                        case 4:
                            return TransferAccountTypeDto.RHY;
                        case 5:
                            return TransferAccountTypeDto.RHY_BANKING;
                        case 6:
                            return TransferAccountTypeDto.IRA_TRADITIONAL;
                        case 7:
                            return TransferAccountTypeDto.IRA_ROTH;
                        case 8:
                            return TransferAccountTypeDto.DCF;
                        case 9:
                            return TransferAccountTypeDto.UK_BANK_ACCOUNT;
                        case 10:
                            return TransferAccountTypeDto.APPLE_PAY_DCF;
                        case 11:
                            return TransferAccountTypeDto.JOINT_TENANCY_WITH_ROS;
                        case 12:
                            return TransferAccountTypeDto.OUTGOING_WIRE_ACCOUNT;
                        case 13:
                            return TransferAccountTypeDto.I18N_BANK_ACCOUNT;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$TransferAccountTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public static final class Serializer implements KSerializer<TransferAccountTypeDto> {
                public static final Serializer INSTANCE = new Serializer();
                private final /* synthetic */ EnumDtoSerializer<TransferAccountTypeDto, MAXTransferContext.TransferAccount.TransferAccountType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.MAXTransferContext.TransferAccount.TransferAccountType", TransferAccountTypeDto.getEntries(), TransferAccountTypeDto.INSTANCE.getZeroValue());

                @Override // kotlinx.serialization.KSerializer2
                public TransferAccountTypeDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return (TransferAccountTypeDto) this.$$delegate_0.deserialize(decoder);
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return this.$$delegate_0.getDescriptor();
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, TransferAccountTypeDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.$$delegate_0.serialize(encoder, (Enum) value);
                }

                private Serializer() {
                }
            }

            public static TransferAccountTypeDto valueOf(String str) {
                return (TransferAccountTypeDto) Enum.valueOf(TransferAccountTypeDto.class, str);
            }

            public static TransferAccountTypeDto[] values() {
                return (TransferAccountTypeDto[]) $VALUES.clone();
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001c\u001d\u001e\u001fB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0010\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\tJ\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\u000b¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$ACHTransferAccountMetadataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$ACHTransferAccountMetadata;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$ACHTransferAccountMetadataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$ACHTransferAccountMetadataDto$Surrogate;)V", "is_instant_eligible", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "(Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class ACHTransferAccountMetadataDto implements Dto3<MAXTransferContext.TransferAccount.ACHTransferAccountMetadata>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<ACHTransferAccountMetadataDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<ACHTransferAccountMetadataDto, MAXTransferContext.TransferAccount.ACHTransferAccountMetadata>> binaryBase64Serializer$delegate;
            private static final ACHTransferAccountMetadataDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ ACHTransferAccountMetadataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private ACHTransferAccountMetadataDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final BooleanDto is_instant_eligible() {
                return this.surrogate.is_instant_eligible();
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public ACHTransferAccountMetadataDto(BooleanDto is_instant_eligible) {
                this(new Surrogate(is_instant_eligible));
                Intrinsics.checkNotNullParameter(is_instant_eligible, "is_instant_eligible");
            }

            public /* synthetic */ ACHTransferAccountMetadataDto(BooleanDto booleanDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto);
            }

            public static /* synthetic */ ACHTransferAccountMetadataDto copy$default(ACHTransferAccountMetadataDto aCHTransferAccountMetadataDto, BooleanDto booleanDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    booleanDto = aCHTransferAccountMetadataDto.surrogate.is_instant_eligible();
                }
                return aCHTransferAccountMetadataDto.copy(booleanDto);
            }

            public final ACHTransferAccountMetadataDto copy(BooleanDto is_instant_eligible) {
                Intrinsics.checkNotNullParameter(is_instant_eligible, "is_instant_eligible");
                return new ACHTransferAccountMetadataDto(new Surrogate(is_instant_eligible));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.TransferAccount.ACHTransferAccountMetadata toProto() {
                return new MAXTransferContext.TransferAccount.ACHTransferAccountMetadata((Boolean) this.surrogate.is_instant_eligible().toProto(), null, 2, null);
            }

            public String toString() {
                return "[ACHTransferAccountMetadataDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof ACHTransferAccountMetadataDto) && Intrinsics.areEqual(((ACHTransferAccountMetadataDto) other).surrogate, this.surrogate);
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
            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J%\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0001¢\u0006\u0002\b\u001dR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\u0002\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$ACHTransferAccountMetadataDto$Surrogate;", "", "is_instant_eligible", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/BooleanDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "is_instant_eligible$annotations", "()V", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final BooleanDto is_instant_eligible;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((BooleanDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, BooleanDto booleanDto, int i, Object obj) {
                    if ((i & 1) != 0) {
                        booleanDto = surrogate.is_instant_eligible;
                    }
                    return surrogate.copy(booleanDto);
                }

                @SerialName("isInstantEligible")
                @JsonAnnotations2(names = {"is_instant_eligible"})
                public static /* synthetic */ void is_instant_eligible$annotations() {
                }

                /* renamed from: component1, reason: from getter */
                public final BooleanDto getIs_instant_eligible() {
                    return this.is_instant_eligible;
                }

                public final Surrogate copy(BooleanDto is_instant_eligible) {
                    Intrinsics.checkNotNullParameter(is_instant_eligible, "is_instant_eligible");
                    return new Surrogate(is_instant_eligible);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Surrogate) && this.is_instant_eligible == ((Surrogate) other).is_instant_eligible;
                }

                public int hashCode() {
                    return this.is_instant_eligible.hashCode();
                }

                public String toString() {
                    return "Surrogate(is_instant_eligible=" + this.is_instant_eligible + ")";
                }

                /* compiled from: MAXTransferContextDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$ACHTransferAccountMetadataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$ACHTransferAccountMetadataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C36746xb2dd9fd8.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, BooleanDto booleanDto, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.is_instant_eligible = BooleanDto.INSTANCE.getZeroValue();
                    } else {
                        this.is_instant_eligible = booleanDto;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (self.is_instant_eligible != BooleanDto.INSTANCE.getZeroValue()) {
                        output.encodeSerializableElement(serialDesc, 0, BooleanDto.Serializer.INSTANCE, self.is_instant_eligible);
                    }
                }

                public Surrogate(BooleanDto is_instant_eligible) {
                    Intrinsics.checkNotNullParameter(is_instant_eligible, "is_instant_eligible");
                    this.is_instant_eligible = is_instant_eligible;
                }

                public final BooleanDto is_instant_eligible() {
                    return this.is_instant_eligible;
                }

                public /* synthetic */ Surrogate(BooleanDto booleanDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto);
                }
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$ACHTransferAccountMetadataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$ACHTransferAccountMetadataDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$ACHTransferAccountMetadata;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$ACHTransferAccountMetadataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<ACHTransferAccountMetadataDto, MAXTransferContext.TransferAccount.ACHTransferAccountMetadata> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<ACHTransferAccountMetadataDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<ACHTransferAccountMetadataDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<ACHTransferAccountMetadataDto> getBinaryBase64Serializer() {
                    return (KSerializer) ACHTransferAccountMetadataDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<MAXTransferContext.TransferAccount.ACHTransferAccountMetadata> getProtoAdapter() {
                    return MAXTransferContext.TransferAccount.ACHTransferAccountMetadata.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ACHTransferAccountMetadataDto getZeroValue() {
                    return ACHTransferAccountMetadataDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ACHTransferAccountMetadataDto fromProto(MAXTransferContext.TransferAccount.ACHTransferAccountMetadata proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new ACHTransferAccountMetadataDto(new Surrogate(BooleanDto.INSTANCE.fromProto(proto.getIs_instant_eligible())), null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContextDto$TransferAccountDto$ACHTransferAccountMetadataDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MAXTransferContextDto.TransferAccountDto.ACHTransferAccountMetadataDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new ACHTransferAccountMetadataDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$ACHTransferAccountMetadataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$ACHTransferAccountMetadataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$ACHTransferAccountMetadataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public static final class Serializer implements KSerializer<ACHTransferAccountMetadataDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.MAXTransferContext.TransferAccount.ACHTransferAccountMetadata", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, ACHTransferAccountMetadataDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public ACHTransferAccountMetadataDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new ACHTransferAccountMetadataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$ACHTransferAccountMetadataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4191_7)
                public final String provideIntoMap() {
                    return "com.robinhood.rosetta.eventlogging.MAXTransferContextDto$TransferAccountDto$ACHTransferAccountMetadataDto";
                }
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<TransferAccountDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.MAXTransferContext.TransferAccount", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TransferAccountDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public TransferAccountDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new TransferAccountDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferAccountDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4187_3)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.MAXTransferContextDto$TransferAccountDto";
            }
        }
    }

    /* compiled from: MAXTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001e\u001f !B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\fJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\rR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\rR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\r¨\u0006\""}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$ACHTransferDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$ACHTransferData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$ACHTransferDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$ACHTransferDataDto$Surrogate;)V", "is_instant_transfer", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "is_instant_transfer_caused_by_default", "is_instant_transfer_caused_by_upsell", "(Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ACHTransferDataDto implements Dto3<MAXTransferContext.ACHTransferData>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ACHTransferDataDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ACHTransferDataDto, MAXTransferContext.ACHTransferData>> binaryBase64Serializer$delegate;
        private static final ACHTransferDataDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ACHTransferDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ACHTransferDataDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final BooleanDto is_instant_transfer() {
            return this.surrogate.is_instant_transfer();
        }

        public final BooleanDto is_instant_transfer_caused_by_default() {
            return this.surrogate.is_instant_transfer_caused_by_default();
        }

        public final BooleanDto is_instant_transfer_caused_by_upsell() {
            return this.surrogate.is_instant_transfer_caused_by_upsell();
        }

        public /* synthetic */ ACHTransferDataDto(BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 2) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto2, (i & 4) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto3);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ACHTransferDataDto(BooleanDto is_instant_transfer, BooleanDto is_instant_transfer_caused_by_default, BooleanDto is_instant_transfer_caused_by_upsell) {
            this(new Surrogate(is_instant_transfer, is_instant_transfer_caused_by_default, is_instant_transfer_caused_by_upsell));
            Intrinsics.checkNotNullParameter(is_instant_transfer, "is_instant_transfer");
            Intrinsics.checkNotNullParameter(is_instant_transfer_caused_by_default, "is_instant_transfer_caused_by_default");
            Intrinsics.checkNotNullParameter(is_instant_transfer_caused_by_upsell, "is_instant_transfer_caused_by_upsell");
        }

        public static /* synthetic */ ACHTransferDataDto copy$default(ACHTransferDataDto aCHTransferDataDto, BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, int i, Object obj) {
            if ((i & 1) != 0) {
                booleanDto = aCHTransferDataDto.surrogate.is_instant_transfer();
            }
            if ((i & 2) != 0) {
                booleanDto2 = aCHTransferDataDto.surrogate.is_instant_transfer_caused_by_default();
            }
            if ((i & 4) != 0) {
                booleanDto3 = aCHTransferDataDto.surrogate.is_instant_transfer_caused_by_upsell();
            }
            return aCHTransferDataDto.copy(booleanDto, booleanDto2, booleanDto3);
        }

        public final ACHTransferDataDto copy(BooleanDto is_instant_transfer, BooleanDto is_instant_transfer_caused_by_default, BooleanDto is_instant_transfer_caused_by_upsell) {
            Intrinsics.checkNotNullParameter(is_instant_transfer, "is_instant_transfer");
            Intrinsics.checkNotNullParameter(is_instant_transfer_caused_by_default, "is_instant_transfer_caused_by_default");
            Intrinsics.checkNotNullParameter(is_instant_transfer_caused_by_upsell, "is_instant_transfer_caused_by_upsell");
            return new ACHTransferDataDto(new Surrogate(is_instant_transfer, is_instant_transfer_caused_by_default, is_instant_transfer_caused_by_upsell));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public MAXTransferContext.ACHTransferData toProto() {
            return new MAXTransferContext.ACHTransferData((Boolean) this.surrogate.is_instant_transfer().toProto(), (Boolean) this.surrogate.is_instant_transfer_caused_by_default().toProto(), (Boolean) this.surrogate.is_instant_transfer_caused_by_upsell().toProto(), null, 8, null);
        }

        public String toString() {
            return "[ACHTransferDataDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ACHTransferDataDto) && Intrinsics.areEqual(((ACHTransferDataDto) other).surrogate, this.surrogate);
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
        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002$%B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u0002\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0004\u0010\u000fR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$ACHTransferDataDto$Surrogate;", "", "is_instant_transfer", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "is_instant_transfer_caused_by_default", "is_instant_transfer_caused_by_upsell", "<init>", "(Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "is_instant_transfer$annotations", "()V", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "is_instant_transfer_caused_by_default$annotations", "is_instant_transfer_caused_by_upsell$annotations", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final BooleanDto is_instant_transfer;
            private final BooleanDto is_instant_transfer_caused_by_default;
            private final BooleanDto is_instant_transfer_caused_by_upsell;

            public Surrogate() {
                this((BooleanDto) null, (BooleanDto) null, (BooleanDto) null, 7, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, int i, Object obj) {
                if ((i & 1) != 0) {
                    booleanDto = surrogate.is_instant_transfer;
                }
                if ((i & 2) != 0) {
                    booleanDto2 = surrogate.is_instant_transfer_caused_by_default;
                }
                if ((i & 4) != 0) {
                    booleanDto3 = surrogate.is_instant_transfer_caused_by_upsell;
                }
                return surrogate.copy(booleanDto, booleanDto2, booleanDto3);
            }

            @SerialName("isInstantTransfer")
            @JsonAnnotations2(names = {"is_instant_transfer"})
            public static /* synthetic */ void is_instant_transfer$annotations() {
            }

            @SerialName("isInstantTransferCausedByDefault")
            @JsonAnnotations2(names = {"is_instant_transfer_caused_by_default"})
            public static /* synthetic */ void is_instant_transfer_caused_by_default$annotations() {
            }

            @SerialName("isInstantTransferCausedByUpsell")
            @JsonAnnotations2(names = {"is_instant_transfer_caused_by_upsell"})
            public static /* synthetic */ void is_instant_transfer_caused_by_upsell$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final BooleanDto getIs_instant_transfer() {
                return this.is_instant_transfer;
            }

            /* renamed from: component2, reason: from getter */
            public final BooleanDto getIs_instant_transfer_caused_by_default() {
                return this.is_instant_transfer_caused_by_default;
            }

            /* renamed from: component3, reason: from getter */
            public final BooleanDto getIs_instant_transfer_caused_by_upsell() {
                return this.is_instant_transfer_caused_by_upsell;
            }

            public final Surrogate copy(BooleanDto is_instant_transfer, BooleanDto is_instant_transfer_caused_by_default, BooleanDto is_instant_transfer_caused_by_upsell) {
                Intrinsics.checkNotNullParameter(is_instant_transfer, "is_instant_transfer");
                Intrinsics.checkNotNullParameter(is_instant_transfer_caused_by_default, "is_instant_transfer_caused_by_default");
                Intrinsics.checkNotNullParameter(is_instant_transfer_caused_by_upsell, "is_instant_transfer_caused_by_upsell");
                return new Surrogate(is_instant_transfer, is_instant_transfer_caused_by_default, is_instant_transfer_caused_by_upsell);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return this.is_instant_transfer == surrogate.is_instant_transfer && this.is_instant_transfer_caused_by_default == surrogate.is_instant_transfer_caused_by_default && this.is_instant_transfer_caused_by_upsell == surrogate.is_instant_transfer_caused_by_upsell;
            }

            public int hashCode() {
                return (((this.is_instant_transfer.hashCode() * 31) + this.is_instant_transfer_caused_by_default.hashCode()) * 31) + this.is_instant_transfer_caused_by_upsell.hashCode();
            }

            public String toString() {
                return "Surrogate(is_instant_transfer=" + this.is_instant_transfer + ", is_instant_transfer_caused_by_default=" + this.is_instant_transfer_caused_by_default + ", is_instant_transfer_caused_by_upsell=" + this.is_instant_transfer_caused_by_upsell + ")";
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$ACHTransferDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$ACHTransferDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return MAXTransferContextDto$ACHTransferDataDto$Surrogate$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, SerializationConstructorMarker serializationConstructorMarker) {
                this.is_instant_transfer = (i & 1) == 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto;
                if ((i & 2) == 0) {
                    this.is_instant_transfer_caused_by_default = BooleanDto.INSTANCE.getZeroValue();
                } else {
                    this.is_instant_transfer_caused_by_default = booleanDto2;
                }
                if ((i & 4) == 0) {
                    this.is_instant_transfer_caused_by_upsell = BooleanDto.INSTANCE.getZeroValue();
                } else {
                    this.is_instant_transfer_caused_by_upsell = booleanDto3;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                BooleanDto booleanDto = self.is_instant_transfer;
                BooleanDto.Companion companion = BooleanDto.INSTANCE;
                if (booleanDto != companion.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 0, BooleanDto.Serializer.INSTANCE, self.is_instant_transfer);
                }
                if (self.is_instant_transfer_caused_by_default != companion.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 1, BooleanDto.Serializer.INSTANCE, self.is_instant_transfer_caused_by_default);
                }
                if (self.is_instant_transfer_caused_by_upsell != companion.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 2, BooleanDto.Serializer.INSTANCE, self.is_instant_transfer_caused_by_upsell);
                }
            }

            public Surrogate(BooleanDto is_instant_transfer, BooleanDto is_instant_transfer_caused_by_default, BooleanDto is_instant_transfer_caused_by_upsell) {
                Intrinsics.checkNotNullParameter(is_instant_transfer, "is_instant_transfer");
                Intrinsics.checkNotNullParameter(is_instant_transfer_caused_by_default, "is_instant_transfer_caused_by_default");
                Intrinsics.checkNotNullParameter(is_instant_transfer_caused_by_upsell, "is_instant_transfer_caused_by_upsell");
                this.is_instant_transfer = is_instant_transfer;
                this.is_instant_transfer_caused_by_default = is_instant_transfer_caused_by_default;
                this.is_instant_transfer_caused_by_upsell = is_instant_transfer_caused_by_upsell;
            }

            public final BooleanDto is_instant_transfer() {
                return this.is_instant_transfer;
            }

            public /* synthetic */ Surrogate(BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 2) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto2, (i & 4) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto3);
            }

            public final BooleanDto is_instant_transfer_caused_by_default() {
                return this.is_instant_transfer_caused_by_default;
            }

            public final BooleanDto is_instant_transfer_caused_by_upsell() {
                return this.is_instant_transfer_caused_by_upsell;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$ACHTransferDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$ACHTransferDataDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$ACHTransferData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$ACHTransferDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<ACHTransferDataDto, MAXTransferContext.ACHTransferData> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ACHTransferDataDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ACHTransferDataDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ACHTransferDataDto> getBinaryBase64Serializer() {
                return (KSerializer) ACHTransferDataDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<MAXTransferContext.ACHTransferData> getProtoAdapter() {
                return MAXTransferContext.ACHTransferData.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ACHTransferDataDto getZeroValue() {
                return ACHTransferDataDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ACHTransferDataDto fromProto(MAXTransferContext.ACHTransferData proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                BooleanDto.Companion companion = BooleanDto.INSTANCE;
                return new ACHTransferDataDto(new Surrogate(companion.fromProto(proto.getIs_instant_transfer()), companion.fromProto(proto.getIs_instant_transfer_caused_by_default()), companion.fromProto(proto.getIs_instant_transfer_caused_by_upsell())), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContextDto$ACHTransferDataDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MAXTransferContextDto.ACHTransferDataDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ACHTransferDataDto(null, null, null, 7, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$ACHTransferDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$ACHTransferDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$ACHTransferDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ACHTransferDataDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.MAXTransferContext.ACHTransferData", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ACHTransferDataDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ACHTransferDataDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ACHTransferDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$ACHTransferDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4186_2)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.MAXTransferContextDto$ACHTransferDataDto";
            }
        }
    }

    /* compiled from: MAXTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f !\"B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u000bH\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\b\u0010\u001e\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRAContributionDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$IRAContributionData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRAContributionDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRAContributionDataDto$Surrogate;)V", "contribution_type", "", "tax_year", "", "(Ljava/lang/String;I)V", "getContribution_type", "()Ljava/lang/String;", "getTax_year", "()I", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class IRAContributionDataDto implements Dto3<MAXTransferContext.IRAContributionData>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<IRAContributionDataDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<IRAContributionDataDto, MAXTransferContext.IRAContributionData>> binaryBase64Serializer$delegate;
        private static final IRAContributionDataDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ IRAContributionDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private IRAContributionDataDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getContribution_type() {
            return this.surrogate.getContribution_type();
        }

        public final int getTax_year() {
            return this.surrogate.getTax_year();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public IRAContributionDataDto(String contribution_type, int i) {
            this(new Surrogate(contribution_type, i));
            Intrinsics.checkNotNullParameter(contribution_type, "contribution_type");
        }

        public /* synthetic */ IRAContributionDataDto(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
        }

        public static /* synthetic */ IRAContributionDataDto copy$default(IRAContributionDataDto iRAContributionDataDto, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = iRAContributionDataDto.surrogate.getContribution_type();
            }
            if ((i2 & 2) != 0) {
                i = iRAContributionDataDto.surrogate.getTax_year();
            }
            return iRAContributionDataDto.copy(str, i);
        }

        public final IRAContributionDataDto copy(String contribution_type, int tax_year) {
            Intrinsics.checkNotNullParameter(contribution_type, "contribution_type");
            return new IRAContributionDataDto(new Surrogate(contribution_type, tax_year));
        }

        @Override // com.robinhood.idl.Dto
        public MAXTransferContext.IRAContributionData toProto() {
            return new MAXTransferContext.IRAContributionData(this.surrogate.getContribution_type(), this.surrogate.getTax_year(), null, 4, null);
        }

        public String toString() {
            return "[IRAContributionDataDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof IRAContributionDataDto) && Intrinsics.areEqual(((IRAContributionDataDto) other).surrogate, this.surrogate);
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
        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 '2\u00020\u0001:\u0002&'B*\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\u0004\b\t\u0010\nB-\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0018\u0010\u0017\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J,\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\b%R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R+\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015¨\u0006("}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRAContributionDataDto$Surrogate;", "", "contribution_type", "", "tax_year", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "<init>", "(Ljava/lang/String;I)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContribution_type$annotations", "()V", "getContribution_type", "()Ljava/lang/String;", "getTax_year$annotations", "getTax_year", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String contribution_type;
            private final int tax_year;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((String) null, 0, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = surrogate.contribution_type;
                }
                if ((i2 & 2) != 0) {
                    i = surrogate.tax_year;
                }
                return surrogate.copy(str, i);
            }

            @SerialName("contributionType")
            @JsonAnnotations2(names = {"contribution_type"})
            public static /* synthetic */ void getContribution_type$annotations() {
            }

            @SerialName("taxYear")
            @JsonAnnotations2(names = {"tax_year"})
            public static /* synthetic */ void getTax_year$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getContribution_type() {
                return this.contribution_type;
            }

            /* renamed from: component2, reason: from getter */
            public final int getTax_year() {
                return this.tax_year;
            }

            public final Surrogate copy(String contribution_type, int tax_year) {
                Intrinsics.checkNotNullParameter(contribution_type, "contribution_type");
                return new Surrogate(contribution_type, tax_year);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.contribution_type, surrogate.contribution_type) && this.tax_year == surrogate.tax_year;
            }

            public int hashCode() {
                return (this.contribution_type.hashCode() * 31) + Integer.hashCode(this.tax_year);
            }

            public String toString() {
                return "Surrogate(contribution_type=" + this.contribution_type + ", tax_year=" + this.tax_year + ")";
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRAContributionDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRAContributionDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return C36738xbe62a7d8.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
                this.contribution_type = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.tax_year = 0;
                } else {
                    this.tax_year = i2;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.contribution_type, "")) {
                    output.encodeStringElement(serialDesc, 0, self.contribution_type);
                }
                int i = self.tax_year;
                if (i != 0) {
                    output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
                }
            }

            public Surrogate(String contribution_type, int i) {
                Intrinsics.checkNotNullParameter(contribution_type, "contribution_type");
                this.contribution_type = contribution_type;
                this.tax_year = i;
            }

            public final String getContribution_type() {
                return this.contribution_type;
            }

            public /* synthetic */ Surrogate(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
            }

            public final int getTax_year() {
                return this.tax_year;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRAContributionDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRAContributionDataDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$IRAContributionData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRAContributionDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<IRAContributionDataDto, MAXTransferContext.IRAContributionData> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<IRAContributionDataDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<IRAContributionDataDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<IRAContributionDataDto> getBinaryBase64Serializer() {
                return (KSerializer) IRAContributionDataDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<MAXTransferContext.IRAContributionData> getProtoAdapter() {
                return MAXTransferContext.IRAContributionData.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public IRAContributionDataDto getZeroValue() {
                return IRAContributionDataDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public IRAContributionDataDto fromProto(MAXTransferContext.IRAContributionData proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new IRAContributionDataDto(new Surrogate(proto.getContribution_type(), proto.getTax_year()), (DefaultConstructorMarker) null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContextDto$IRAContributionDataDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MAXTransferContextDto.IRAContributionDataDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new IRAContributionDataDto(0 == true ? 1 : 0, 0, 3, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRAContributionDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRAContributionDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRAContributionDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<IRAContributionDataDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.MAXTransferContext.IRAContributionData", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, IRAContributionDataDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public IRAContributionDataDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new IRAContributionDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRAContributionDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4185_1)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.MAXTransferContextDto$IRAContributionDataDto";
            }
        }
    }

    /* compiled from: MAXTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004&'()B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000fJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\tJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRADistributionDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$IRADistributionData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRADistributionDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRADistributionDataDto$Surrogate;)V", "distribution_type", "", "state", "state_tax_rate", "", "federal_tax_rate", "masked_state", "(Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;)V", "getDistribution_type", "()Ljava/lang/String;", "getState", "getState_tax_rate", "()D", "getFederal_tax_rate", "getMasked_state", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class IRADistributionDataDto implements Dto3<MAXTransferContext.IRADistributionData>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<IRADistributionDataDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<IRADistributionDataDto, MAXTransferContext.IRADistributionData>> binaryBase64Serializer$delegate;
        private static final IRADistributionDataDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ IRADistributionDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private IRADistributionDataDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getDistribution_type() {
            return this.surrogate.getDistribution_type();
        }

        public final String getState() {
            return this.surrogate.getState();
        }

        public final double getState_tax_rate() {
            return this.surrogate.getState_tax_rate();
        }

        public final double getFederal_tax_rate() {
            return this.surrogate.getFederal_tax_rate();
        }

        public final String getMasked_state() {
            return this.surrogate.getMasked_state();
        }

        public /* synthetic */ IRADistributionDataDto(String str, String str2, double d, double d2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? 0.0d : d2, (i & 16) != 0 ? "" : str3);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public IRADistributionDataDto(String distribution_type, String state, double d, double d2, String masked_state) {
            this(new Surrogate(distribution_type, state, d, d2, masked_state));
            Intrinsics.checkNotNullParameter(distribution_type, "distribution_type");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(masked_state, "masked_state");
        }

        public static /* synthetic */ IRADistributionDataDto copy$default(IRADistributionDataDto iRADistributionDataDto, String str, String str2, double d, double d2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = iRADistributionDataDto.surrogate.getDistribution_type();
            }
            if ((i & 2) != 0) {
                str2 = iRADistributionDataDto.surrogate.getState();
            }
            if ((i & 4) != 0) {
                d = iRADistributionDataDto.surrogate.getState_tax_rate();
            }
            if ((i & 8) != 0) {
                d2 = iRADistributionDataDto.surrogate.getFederal_tax_rate();
            }
            if ((i & 16) != 0) {
                str3 = iRADistributionDataDto.surrogate.getMasked_state();
            }
            String str4 = str3;
            double d3 = d2;
            return iRADistributionDataDto.copy(str, str2, d, d3, str4);
        }

        public final IRADistributionDataDto copy(String distribution_type, String state, double state_tax_rate, double federal_tax_rate, String masked_state) {
            Intrinsics.checkNotNullParameter(distribution_type, "distribution_type");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(masked_state, "masked_state");
            return new IRADistributionDataDto(new Surrogate(distribution_type, state, state_tax_rate, federal_tax_rate, masked_state));
        }

        @Override // com.robinhood.idl.Dto
        public MAXTransferContext.IRADistributionData toProto() {
            return new MAXTransferContext.IRADistributionData(this.surrogate.getDistribution_type(), this.surrogate.getState(), this.surrogate.getState_tax_rate(), this.surrogate.getFederal_tax_rate(), this.surrogate.getMasked_state(), null, 32, null);
        }

        public String toString() {
            return "[IRADistributionDataDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof IRADistributionDataDto) && Intrinsics.areEqual(((IRADistributionDataDto) other).surrogate, this.surrogate);
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
        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000234BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0018\u0010\"\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\u0018\u0010#\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003JY\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\u0017\b\u0002\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u000fHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J%\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\b2R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R+\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR+\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016¨\u00065"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRADistributionDataDto$Surrogate;", "", "distribution_type", "", "state", "state_tax_rate", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "federal_tax_rate", "masked_state", "<init>", "(Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;DDLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDistribution_type$annotations", "()V", "getDistribution_type", "()Ljava/lang/String;", "getState$annotations", "getState", "getState_tax_rate$annotations", "getState_tax_rate", "()D", "getFederal_tax_rate$annotations", "getFederal_tax_rate", "getMasked_state$annotations", "getMasked_state", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String distribution_type;
            private final double federal_tax_rate;
            private final String masked_state;
            private final String state;
            private final double state_tax_rate;

            public Surrogate() {
                this((String) null, (String) null, 0.0d, 0.0d, (String) null, 31, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, double d, double d2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = surrogate.distribution_type;
                }
                if ((i & 2) != 0) {
                    str2 = surrogate.state;
                }
                if ((i & 4) != 0) {
                    d = surrogate.state_tax_rate;
                }
                if ((i & 8) != 0) {
                    d2 = surrogate.federal_tax_rate;
                }
                if ((i & 16) != 0) {
                    str3 = surrogate.masked_state;
                }
                String str4 = str3;
                double d3 = d2;
                return surrogate.copy(str, str2, d, d3, str4);
            }

            @SerialName("distributionType")
            @JsonAnnotations2(names = {"distribution_type"})
            public static /* synthetic */ void getDistribution_type$annotations() {
            }

            @SerialName("federalTaxRate")
            @JsonAnnotations2(names = {"federal_tax_rate"})
            public static /* synthetic */ void getFederal_tax_rate$annotations() {
            }

            @SerialName("maskedState")
            @JsonAnnotations2(names = {"masked_state"})
            public static /* synthetic */ void getMasked_state$annotations() {
            }

            @SerialName("state")
            @JsonAnnotations2(names = {"state"})
            public static /* synthetic */ void getState$annotations() {
            }

            @SerialName("stateTaxRate")
            @JsonAnnotations2(names = {"state_tax_rate"})
            public static /* synthetic */ void getState_tax_rate$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getDistribution_type() {
                return this.distribution_type;
            }

            /* renamed from: component2, reason: from getter */
            public final String getState() {
                return this.state;
            }

            /* renamed from: component3, reason: from getter */
            public final double getState_tax_rate() {
                return this.state_tax_rate;
            }

            /* renamed from: component4, reason: from getter */
            public final double getFederal_tax_rate() {
                return this.federal_tax_rate;
            }

            /* renamed from: component5, reason: from getter */
            public final String getMasked_state() {
                return this.masked_state;
            }

            public final Surrogate copy(String distribution_type, String state, double state_tax_rate, double federal_tax_rate, String masked_state) {
                Intrinsics.checkNotNullParameter(distribution_type, "distribution_type");
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(masked_state, "masked_state");
                return new Surrogate(distribution_type, state, state_tax_rate, federal_tax_rate, masked_state);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.distribution_type, surrogate.distribution_type) && Intrinsics.areEqual(this.state, surrogate.state) && Double.compare(this.state_tax_rate, surrogate.state_tax_rate) == 0 && Double.compare(this.federal_tax_rate, surrogate.federal_tax_rate) == 0 && Intrinsics.areEqual(this.masked_state, surrogate.masked_state);
            }

            public int hashCode() {
                return (((((((this.distribution_type.hashCode() * 31) + this.state.hashCode()) * 31) + Double.hashCode(this.state_tax_rate)) * 31) + Double.hashCode(this.federal_tax_rate)) * 31) + this.masked_state.hashCode();
            }

            public String toString() {
                return "Surrogate(distribution_type=" + this.distribution_type + ", state=" + this.state + ", state_tax_rate=" + this.state_tax_rate + ", federal_tax_rate=" + this.federal_tax_rate + ", masked_state=" + this.masked_state + ")";
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRADistributionDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRADistributionDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return C36740x2d5401e4.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, String str2, double d, double d2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.distribution_type = "";
                } else {
                    this.distribution_type = str;
                }
                if ((i & 2) == 0) {
                    this.state = "";
                } else {
                    this.state = str2;
                }
                if ((i & 4) == 0) {
                    this.state_tax_rate = 0.0d;
                } else {
                    this.state_tax_rate = d;
                }
                if ((i & 8) == 0) {
                    this.federal_tax_rate = 0.0d;
                } else {
                    this.federal_tax_rate = d2;
                }
                if ((i & 16) == 0) {
                    this.masked_state = "";
                } else {
                    this.masked_state = str3;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.distribution_type, "")) {
                    output.encodeStringElement(serialDesc, 0, self.distribution_type);
                }
                if (!Intrinsics.areEqual(self.state, "")) {
                    output.encodeStringElement(serialDesc, 1, self.state);
                }
                if (Double.compare(self.state_tax_rate, 0.0d) != 0) {
                    output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.state_tax_rate));
                }
                if (Double.compare(self.federal_tax_rate, 0.0d) != 0) {
                    output.encodeSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.federal_tax_rate));
                }
                if (Intrinsics.areEqual(self.masked_state, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 4, self.masked_state);
            }

            public Surrogate(String distribution_type, String state, double d, double d2, String masked_state) {
                Intrinsics.checkNotNullParameter(distribution_type, "distribution_type");
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(masked_state, "masked_state");
                this.distribution_type = distribution_type;
                this.state = state;
                this.state_tax_rate = d;
                this.federal_tax_rate = d2;
                this.masked_state = masked_state;
            }

            public /* synthetic */ Surrogate(String str, String str2, double d, double d2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? 0.0d : d2, (i & 16) != 0 ? "" : str3);
            }

            public final String getDistribution_type() {
                return this.distribution_type;
            }

            public final String getState() {
                return this.state;
            }

            public final double getState_tax_rate() {
                return this.state_tax_rate;
            }

            public final double getFederal_tax_rate() {
                return this.federal_tax_rate;
            }

            public final String getMasked_state() {
                return this.masked_state;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRADistributionDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRADistributionDataDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$IRADistributionData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRADistributionDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<IRADistributionDataDto, MAXTransferContext.IRADistributionData> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<IRADistributionDataDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<IRADistributionDataDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<IRADistributionDataDto> getBinaryBase64Serializer() {
                return (KSerializer) IRADistributionDataDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<MAXTransferContext.IRADistributionData> getProtoAdapter() {
                return MAXTransferContext.IRADistributionData.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public IRADistributionDataDto getZeroValue() {
                return IRADistributionDataDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public IRADistributionDataDto fromProto(MAXTransferContext.IRADistributionData proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new IRADistributionDataDto(new Surrogate(proto.getDistribution_type(), proto.getState(), proto.getState_tax_rate(), proto.getFederal_tax_rate(), proto.getMasked_state()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContextDto$IRADistributionDataDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MAXTransferContextDto.IRADistributionDataDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new IRADistributionDataDto(null, null, 0.0d, 0.0d, null, 31, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRADistributionDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRADistributionDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRADistributionDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<IRADistributionDataDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.MAXTransferContext.IRADistributionData", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, IRADistributionDataDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public IRADistributionDataDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new IRADistributionDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRADistributionDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4191_7)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.MAXTransferContextDto$IRADistributionDataDto";
            }
        }
    }

    /* compiled from: MAXTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001c\u001d\u001e\u001fB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0010\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\tH\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\tH\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRARothConversionDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$IRARothConversionData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRARothConversionDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRARothConversionDataDto$Surrogate;)V", "tax_year", "", "(I)V", "getTax_year", "()I", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class IRARothConversionDataDto implements Dto3<MAXTransferContext.IRARothConversionData>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<IRARothConversionDataDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<IRARothConversionDataDto, MAXTransferContext.IRARothConversionData>> binaryBase64Serializer$delegate;
        private static final IRARothConversionDataDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ IRARothConversionDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private IRARothConversionDataDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final int getTax_year() {
            return this.surrogate.getTax_year();
        }

        public IRARothConversionDataDto(int i) {
            this(new Surrogate(i));
        }

        public /* synthetic */ IRARothConversionDataDto(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }

        public static /* synthetic */ IRARothConversionDataDto copy$default(IRARothConversionDataDto iRARothConversionDataDto, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = iRARothConversionDataDto.surrogate.getTax_year();
            }
            return iRARothConversionDataDto.copy(i);
        }

        public final IRARothConversionDataDto copy(int tax_year) {
            return new IRARothConversionDataDto(new Surrogate(tax_year));
        }

        @Override // com.robinhood.idl.Dto
        public MAXTransferContext.IRARothConversionData toProto() {
            return new MAXTransferContext.IRARothConversionData(this.surrogate.getTax_year(), null, 2, null);
        }

        public String toString() {
            return "[IRARothConversionDataDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof IRARothConversionDataDto) && Intrinsics.areEqual(((IRARothConversionDataDto) other).surrogate, this.surrogate);
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
        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B \u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006¢\u0006\u0004\b\u0007\u0010\bB#\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\fJ\u0018\u0010\u0011\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\"\u0010\u0012\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J%\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRARothConversionDataDto$Surrogate;", "", "tax_year", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "<init>", "(I)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTax_year$annotations", "()V", "getTax_year", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final int tax_year;

            public Surrogate() {
                this(0, 1, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = surrogate.tax_year;
                }
                return surrogate.copy(i);
            }

            @SerialName("taxYear")
            @JsonAnnotations2(names = {"tax_year"})
            public static /* synthetic */ void getTax_year$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final int getTax_year() {
                return this.tax_year;
            }

            public final Surrogate copy(int tax_year) {
                return new Surrogate(tax_year);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && this.tax_year == ((Surrogate) other).tax_year;
            }

            public int hashCode() {
                return Integer.hashCode(this.tax_year);
            }

            public String toString() {
                return "Surrogate(tax_year=" + this.tax_year + ")";
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRARothConversionDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRARothConversionDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return C36742x7287f6a1.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, int i2, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.tax_year = 0;
                } else {
                    this.tax_year = i2;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                int i = self.tax_year;
                if (i != 0) {
                    output.encodeSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
                }
            }

            public Surrogate(int i) {
                this.tax_year = i;
            }

            public /* synthetic */ Surrogate(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? 0 : i);
            }

            public final int getTax_year() {
                return this.tax_year;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRARothConversionDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRARothConversionDataDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$IRARothConversionData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRARothConversionDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<IRARothConversionDataDto, MAXTransferContext.IRARothConversionData> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<IRARothConversionDataDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<IRARothConversionDataDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<IRARothConversionDataDto> getBinaryBase64Serializer() {
                return (KSerializer) IRARothConversionDataDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<MAXTransferContext.IRARothConversionData> getProtoAdapter() {
                return MAXTransferContext.IRARothConversionData.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public IRARothConversionDataDto getZeroValue() {
                return IRARothConversionDataDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public IRARothConversionDataDto fromProto(MAXTransferContext.IRARothConversionData proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new IRARothConversionDataDto(new Surrogate(proto.getTax_year()), null);
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion companion = new Companion(defaultConstructorMarker);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContextDto$IRARothConversionDataDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MAXTransferContextDto.IRARothConversionDataDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new IRARothConversionDataDto(0, 1, defaultConstructorMarker);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRARothConversionDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRARothConversionDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRARothConversionDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<IRARothConversionDataDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.MAXTransferContext.IRARothConversionData", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, IRARothConversionDataDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public IRARothConversionDataDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new IRARothConversionDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$IRARothConversionDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4186_2)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.MAXTransferContextDto$IRARothConversionDataDto";
            }
        }
    }

    /* compiled from: MAXTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005*+,-.B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u0011JL\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bJ\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015¨\u0006/"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferLimitValidationError;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$Surrogate;)V", "error_type", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto;", "total_amount", "", "remaining_amount", "total_count", "remaining_count", "max_amount", "min_amount", "(Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getError_type", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto;", "getTotal_amount", "()Ljava/lang/String;", "getRemaining_amount", "getTotal_count", "getRemaining_count", "getMax_amount", "getMin_amount", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "LimitErrorTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TransferLimitValidationErrorDto implements Dto3<MAXTransferContext.TransferLimitValidationError>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<TransferLimitValidationErrorDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TransferLimitValidationErrorDto, MAXTransferContext.TransferLimitValidationError>> binaryBase64Serializer$delegate;
        private static final TransferLimitValidationErrorDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ TransferLimitValidationErrorDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private TransferLimitValidationErrorDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final LimitErrorTypeDto getError_type() {
            return this.surrogate.getError_type();
        }

        public final String getTotal_amount() {
            return this.surrogate.getTotal_amount();
        }

        public final String getRemaining_amount() {
            return this.surrogate.getRemaining_amount();
        }

        public final String getTotal_count() {
            return this.surrogate.getTotal_count();
        }

        public final String getRemaining_count() {
            return this.surrogate.getRemaining_count();
        }

        public final String getMax_amount() {
            return this.surrogate.getMax_amount();
        }

        public final String getMin_amount() {
            return this.surrogate.getMin_amount();
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ TransferLimitValidationErrorDto(com.robinhood.rosetta.eventlogging.MAXTransferContextDto.TransferLimitValidationErrorDto.LimitErrorTypeDto r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r1 = this;
                r10 = r9 & 1
                if (r10 == 0) goto La
                com.robinhood.rosetta.eventlogging.MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto$Companion r2 = com.robinhood.rosetta.eventlogging.MAXTransferContextDto.TransferLimitValidationErrorDto.LimitErrorTypeDto.INSTANCE
                com.robinhood.rosetta.eventlogging.MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto r2 = r2.getZeroValue()
            La:
                r10 = r9 & 2
                java.lang.String r0 = ""
                if (r10 == 0) goto L11
                r3 = r0
            L11:
                r10 = r9 & 4
                if (r10 == 0) goto L16
                r4 = r0
            L16:
                r10 = r9 & 8
                if (r10 == 0) goto L1b
                r5 = r0
            L1b:
                r10 = r9 & 16
                if (r10 == 0) goto L20
                r6 = r0
            L20:
                r10 = r9 & 32
                if (r10 == 0) goto L25
                r7 = r0
            L25:
                r9 = r9 & 64
                if (r9 == 0) goto L32
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L3a
            L32:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L3a:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.MAXTransferContextDto.TransferLimitValidationErrorDto.<init>(com.robinhood.rosetta.eventlogging.MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TransferLimitValidationErrorDto(LimitErrorTypeDto error_type, String total_amount, String remaining_amount, String total_count, String remaining_count, String max_amount, String min_amount) {
            this(new Surrogate(error_type, total_amount, remaining_amount, total_count, remaining_count, max_amount, min_amount));
            Intrinsics.checkNotNullParameter(error_type, "error_type");
            Intrinsics.checkNotNullParameter(total_amount, "total_amount");
            Intrinsics.checkNotNullParameter(remaining_amount, "remaining_amount");
            Intrinsics.checkNotNullParameter(total_count, "total_count");
            Intrinsics.checkNotNullParameter(remaining_count, "remaining_count");
            Intrinsics.checkNotNullParameter(max_amount, "max_amount");
            Intrinsics.checkNotNullParameter(min_amount, "min_amount");
        }

        public static /* synthetic */ TransferLimitValidationErrorDto copy$default(TransferLimitValidationErrorDto transferLimitValidationErrorDto, LimitErrorTypeDto limitErrorTypeDto, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                limitErrorTypeDto = transferLimitValidationErrorDto.surrogate.getError_type();
            }
            if ((i & 2) != 0) {
                str = transferLimitValidationErrorDto.surrogate.getTotal_amount();
            }
            if ((i & 4) != 0) {
                str2 = transferLimitValidationErrorDto.surrogate.getRemaining_amount();
            }
            if ((i & 8) != 0) {
                str3 = transferLimitValidationErrorDto.surrogate.getTotal_count();
            }
            if ((i & 16) != 0) {
                str4 = transferLimitValidationErrorDto.surrogate.getRemaining_count();
            }
            if ((i & 32) != 0) {
                str5 = transferLimitValidationErrorDto.surrogate.getMax_amount();
            }
            if ((i & 64) != 0) {
                str6 = transferLimitValidationErrorDto.surrogate.getMin_amount();
            }
            String str7 = str5;
            String str8 = str6;
            String str9 = str4;
            String str10 = str2;
            return transferLimitValidationErrorDto.copy(limitErrorTypeDto, str, str10, str3, str9, str7, str8);
        }

        public final TransferLimitValidationErrorDto copy(LimitErrorTypeDto error_type, String total_amount, String remaining_amount, String total_count, String remaining_count, String max_amount, String min_amount) {
            Intrinsics.checkNotNullParameter(error_type, "error_type");
            Intrinsics.checkNotNullParameter(total_amount, "total_amount");
            Intrinsics.checkNotNullParameter(remaining_amount, "remaining_amount");
            Intrinsics.checkNotNullParameter(total_count, "total_count");
            Intrinsics.checkNotNullParameter(remaining_count, "remaining_count");
            Intrinsics.checkNotNullParameter(max_amount, "max_amount");
            Intrinsics.checkNotNullParameter(min_amount, "min_amount");
            return new TransferLimitValidationErrorDto(new Surrogate(error_type, total_amount, remaining_amount, total_count, remaining_count, max_amount, min_amount));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public MAXTransferContext.TransferLimitValidationError toProto() {
            return new MAXTransferContext.TransferLimitValidationError((MAXTransferContext.TransferLimitValidationError.LimitErrorType) this.surrogate.getError_type().toProto(), this.surrogate.getTotal_amount(), this.surrogate.getRemaining_amount(), this.surrogate.getTotal_count(), this.surrogate.getRemaining_count(), this.surrogate.getMax_amount(), this.surrogate.getMin_amount(), null, 128, null);
        }

        public String toString() {
            return "[TransferLimitValidationErrorDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof TransferLimitValidationErrorDto) && Intrinsics.areEqual(((TransferLimitValidationErrorDto) other).surrogate, this.surrogate);
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
        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 92\u00020\u0001:\u000289BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003JO\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u000eHÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001J%\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0001¢\u0006\u0002\b7R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0018R\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0018R\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0018¨\u0006:"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$Surrogate;", "", "error_type", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto;", "total_amount", "", "remaining_amount", "total_count", "remaining_count", "max_amount", "min_amount", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getError_type$annotations", "()V", "getError_type", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto;", "getTotal_amount$annotations", "getTotal_amount", "()Ljava/lang/String;", "getRemaining_amount$annotations", "getRemaining_amount", "getTotal_count$annotations", "getTotal_count", "getRemaining_count$annotations", "getRemaining_count", "getMax_amount$annotations", "getMax_amount", "getMin_amount$annotations", "getMin_amount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final LimitErrorTypeDto error_type;
            private final String max_amount;
            private final String min_amount;
            private final String remaining_amount;
            private final String remaining_count;
            private final String total_amount;
            private final String total_count;

            public Surrogate() {
                this((LimitErrorTypeDto) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, LimitErrorTypeDto limitErrorTypeDto, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
                if ((i & 1) != 0) {
                    limitErrorTypeDto = surrogate.error_type;
                }
                if ((i & 2) != 0) {
                    str = surrogate.total_amount;
                }
                if ((i & 4) != 0) {
                    str2 = surrogate.remaining_amount;
                }
                if ((i & 8) != 0) {
                    str3 = surrogate.total_count;
                }
                if ((i & 16) != 0) {
                    str4 = surrogate.remaining_count;
                }
                if ((i & 32) != 0) {
                    str5 = surrogate.max_amount;
                }
                if ((i & 64) != 0) {
                    str6 = surrogate.min_amount;
                }
                String str7 = str5;
                String str8 = str6;
                String str9 = str4;
                String str10 = str2;
                return surrogate.copy(limitErrorTypeDto, str, str10, str3, str9, str7, str8);
            }

            @SerialName("errorType")
            @JsonAnnotations2(names = {"error_type"})
            public static /* synthetic */ void getError_type$annotations() {
            }

            @SerialName("maxAmount")
            @JsonAnnotations2(names = {"max_amount"})
            public static /* synthetic */ void getMax_amount$annotations() {
            }

            @SerialName("minAmount")
            @JsonAnnotations2(names = {"min_amount"})
            public static /* synthetic */ void getMin_amount$annotations() {
            }

            @SerialName("remainingAmount")
            @JsonAnnotations2(names = {"remaining_amount"})
            public static /* synthetic */ void getRemaining_amount$annotations() {
            }

            @SerialName("remainingCount")
            @JsonAnnotations2(names = {"remaining_count"})
            public static /* synthetic */ void getRemaining_count$annotations() {
            }

            @SerialName("totalAmount")
            @JsonAnnotations2(names = {"total_amount"})
            public static /* synthetic */ void getTotal_amount$annotations() {
            }

            @SerialName("totalCount")
            @JsonAnnotations2(names = {"total_count"})
            public static /* synthetic */ void getTotal_count$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final LimitErrorTypeDto getError_type() {
                return this.error_type;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTotal_amount() {
                return this.total_amount;
            }

            /* renamed from: component3, reason: from getter */
            public final String getRemaining_amount() {
                return this.remaining_amount;
            }

            /* renamed from: component4, reason: from getter */
            public final String getTotal_count() {
                return this.total_count;
            }

            /* renamed from: component5, reason: from getter */
            public final String getRemaining_count() {
                return this.remaining_count;
            }

            /* renamed from: component6, reason: from getter */
            public final String getMax_amount() {
                return this.max_amount;
            }

            /* renamed from: component7, reason: from getter */
            public final String getMin_amount() {
                return this.min_amount;
            }

            public final Surrogate copy(LimitErrorTypeDto error_type, String total_amount, String remaining_amount, String total_count, String remaining_count, String max_amount, String min_amount) {
                Intrinsics.checkNotNullParameter(error_type, "error_type");
                Intrinsics.checkNotNullParameter(total_amount, "total_amount");
                Intrinsics.checkNotNullParameter(remaining_amount, "remaining_amount");
                Intrinsics.checkNotNullParameter(total_count, "total_count");
                Intrinsics.checkNotNullParameter(remaining_count, "remaining_count");
                Intrinsics.checkNotNullParameter(max_amount, "max_amount");
                Intrinsics.checkNotNullParameter(min_amount, "min_amount");
                return new Surrogate(error_type, total_amount, remaining_amount, total_count, remaining_count, max_amount, min_amount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return this.error_type == surrogate.error_type && Intrinsics.areEqual(this.total_amount, surrogate.total_amount) && Intrinsics.areEqual(this.remaining_amount, surrogate.remaining_amount) && Intrinsics.areEqual(this.total_count, surrogate.total_count) && Intrinsics.areEqual(this.remaining_count, surrogate.remaining_count) && Intrinsics.areEqual(this.max_amount, surrogate.max_amount) && Intrinsics.areEqual(this.min_amount, surrogate.min_amount);
            }

            public int hashCode() {
                return (((((((((((this.error_type.hashCode() * 31) + this.total_amount.hashCode()) * 31) + this.remaining_amount.hashCode()) * 31) + this.total_count.hashCode()) * 31) + this.remaining_count.hashCode()) * 31) + this.max_amount.hashCode()) * 31) + this.min_amount.hashCode();
            }

            public String toString() {
                return "Surrogate(error_type=" + this.error_type + ", total_amount=" + this.total_amount + ", remaining_amount=" + this.remaining_amount + ", total_count=" + this.total_count + ", remaining_count=" + this.remaining_count + ", max_amount=" + this.max_amount + ", min_amount=" + this.min_amount + ")";
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return C36750xbc36c181.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, LimitErrorTypeDto limitErrorTypeDto, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
                this.error_type = (i & 1) == 0 ? LimitErrorTypeDto.INSTANCE.getZeroValue() : limitErrorTypeDto;
                if ((i & 2) == 0) {
                    this.total_amount = "";
                } else {
                    this.total_amount = str;
                }
                if ((i & 4) == 0) {
                    this.remaining_amount = "";
                } else {
                    this.remaining_amount = str2;
                }
                if ((i & 8) == 0) {
                    this.total_count = "";
                } else {
                    this.total_count = str3;
                }
                if ((i & 16) == 0) {
                    this.remaining_count = "";
                } else {
                    this.remaining_count = str4;
                }
                if ((i & 32) == 0) {
                    this.max_amount = "";
                } else {
                    this.max_amount = str5;
                }
                if ((i & 64) == 0) {
                    this.min_amount = "";
                } else {
                    this.min_amount = str6;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (self.error_type != LimitErrorTypeDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 0, LimitErrorTypeDto.Serializer.INSTANCE, self.error_type);
                }
                if (!Intrinsics.areEqual(self.total_amount, "")) {
                    output.encodeStringElement(serialDesc, 1, self.total_amount);
                }
                if (!Intrinsics.areEqual(self.remaining_amount, "")) {
                    output.encodeStringElement(serialDesc, 2, self.remaining_amount);
                }
                if (!Intrinsics.areEqual(self.total_count, "")) {
                    output.encodeStringElement(serialDesc, 3, self.total_count);
                }
                if (!Intrinsics.areEqual(self.remaining_count, "")) {
                    output.encodeStringElement(serialDesc, 4, self.remaining_count);
                }
                if (!Intrinsics.areEqual(self.max_amount, "")) {
                    output.encodeStringElement(serialDesc, 5, self.max_amount);
                }
                if (Intrinsics.areEqual(self.min_amount, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 6, self.min_amount);
            }

            public Surrogate(LimitErrorTypeDto error_type, String total_amount, String remaining_amount, String total_count, String remaining_count, String max_amount, String min_amount) {
                Intrinsics.checkNotNullParameter(error_type, "error_type");
                Intrinsics.checkNotNullParameter(total_amount, "total_amount");
                Intrinsics.checkNotNullParameter(remaining_amount, "remaining_amount");
                Intrinsics.checkNotNullParameter(total_count, "total_count");
                Intrinsics.checkNotNullParameter(remaining_count, "remaining_count");
                Intrinsics.checkNotNullParameter(max_amount, "max_amount");
                Intrinsics.checkNotNullParameter(min_amount, "min_amount");
                this.error_type = error_type;
                this.total_amount = total_amount;
                this.remaining_amount = remaining_amount;
                this.total_count = total_count;
                this.remaining_count = remaining_count;
                this.max_amount = max_amount;
                this.min_amount = min_amount;
            }

            public final LimitErrorTypeDto getError_type() {
                return this.error_type;
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ Surrogate(com.robinhood.rosetta.eventlogging.MAXTransferContextDto.TransferLimitValidationErrorDto.LimitErrorTypeDto r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
                /*
                    r1 = this;
                    r10 = r9 & 1
                    if (r10 == 0) goto La
                    com.robinhood.rosetta.eventlogging.MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto$Companion r2 = com.robinhood.rosetta.eventlogging.MAXTransferContextDto.TransferLimitValidationErrorDto.LimitErrorTypeDto.INSTANCE
                    com.robinhood.rosetta.eventlogging.MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto r2 = r2.getZeroValue()
                La:
                    r10 = r9 & 2
                    java.lang.String r0 = ""
                    if (r10 == 0) goto L11
                    r3 = r0
                L11:
                    r10 = r9 & 4
                    if (r10 == 0) goto L16
                    r4 = r0
                L16:
                    r10 = r9 & 8
                    if (r10 == 0) goto L1b
                    r5 = r0
                L1b:
                    r10 = r9 & 16
                    if (r10 == 0) goto L20
                    r6 = r0
                L20:
                    r10 = r9 & 32
                    if (r10 == 0) goto L25
                    r7 = r0
                L25:
                    r9 = r9 & 64
                    if (r9 == 0) goto L32
                    r10 = r0
                    r8 = r6
                    r9 = r7
                    r6 = r4
                    r7 = r5
                    r4 = r2
                    r5 = r3
                    r3 = r1
                    goto L3a
                L32:
                    r10 = r8
                    r9 = r7
                    r7 = r5
                    r8 = r6
                    r5 = r3
                    r6 = r4
                    r3 = r1
                    r4 = r2
                L3a:
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.MAXTransferContextDto.TransferLimitValidationErrorDto.Surrogate.<init>(com.robinhood.rosetta.eventlogging.MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            public final String getTotal_amount() {
                return this.total_amount;
            }

            public final String getRemaining_amount() {
                return this.remaining_amount;
            }

            public final String getTotal_count() {
                return this.total_count;
            }

            public final String getRemaining_count() {
                return this.remaining_count;
            }

            public final String getMax_amount() {
                return this.max_amount;
            }

            public final String getMin_amount() {
                return this.min_amount;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferLimitValidationError;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<TransferLimitValidationErrorDto, MAXTransferContext.TransferLimitValidationError> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TransferLimitValidationErrorDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TransferLimitValidationErrorDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TransferLimitValidationErrorDto> getBinaryBase64Serializer() {
                return (KSerializer) TransferLimitValidationErrorDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<MAXTransferContext.TransferLimitValidationError> getProtoAdapter() {
                return MAXTransferContext.TransferLimitValidationError.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TransferLimitValidationErrorDto getZeroValue() {
                return TransferLimitValidationErrorDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TransferLimitValidationErrorDto fromProto(MAXTransferContext.TransferLimitValidationError proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new TransferLimitValidationErrorDto(new Surrogate(LimitErrorTypeDto.INSTANCE.fromProto(proto.getError_type()), proto.getTotal_amount(), proto.getRemaining_amount(), proto.getTotal_count(), proto.getRemaining_count(), proto.getMax_amount(), proto.getMin_amount()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContextDto$TransferLimitValidationErrorDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MAXTransferContextDto.TransferLimitValidationErrorDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new TransferLimitValidationErrorDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferLimitValidationError$LimitErrorType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "LIMIT_ERROR_TYPE_UNSPECIFIED", "AMOUNT", "COUNT", "MAX_TRANSFER", "MIN_TRANSFER", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class LimitErrorTypeDto implements Dto2<MAXTransferContext.TransferLimitValidationError.LimitErrorType>, Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ LimitErrorTypeDto[] $VALUES;

            @JvmField
            public static final Parcelable.Creator<LimitErrorTypeDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<LimitErrorTypeDto, MAXTransferContext.TransferLimitValidationError.LimitErrorType>> binaryBase64Serializer$delegate;
            public static final LimitErrorTypeDto LIMIT_ERROR_TYPE_UNSPECIFIED = new LIMIT_ERROR_TYPE_UNSPECIFIED("LIMIT_ERROR_TYPE_UNSPECIFIED", 0);
            public static final LimitErrorTypeDto AMOUNT = new AMOUNT("AMOUNT", 1);
            public static final LimitErrorTypeDto COUNT = new COUNT("COUNT", 2);
            public static final LimitErrorTypeDto MAX_TRANSFER = new MAX_TRANSFER("MAX_TRANSFER", 3);
            public static final LimitErrorTypeDto MIN_TRANSFER = new MIN_TRANSFER("MIN_TRANSFER", 4);

            private static final /* synthetic */ LimitErrorTypeDto[] $values() {
                return new LimitErrorTypeDto[]{LIMIT_ERROR_TYPE_UNSPECIFIED, AMOUNT, COUNT, MAX_TRANSFER, MIN_TRANSFER};
            }

            public /* synthetic */ LimitErrorTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i);
            }

            public static EnumEntries<LimitErrorTypeDto> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private LimitErrorTypeDto(String str, int i) {
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferLimitValidationErrorDto.LimitErrorTypeDto.LIMIT_ERROR_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferLimitValidationError$LimitErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class LIMIT_ERROR_TYPE_UNSPECIFIED extends LimitErrorTypeDto {
                LIMIT_ERROR_TYPE_UNSPECIFIED(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public MAXTransferContext.TransferLimitValidationError.LimitErrorType toProto() {
                    return MAXTransferContext.TransferLimitValidationError.LimitErrorType.LIMIT_ERROR_TYPE_UNSPECIFIED;
                }
            }

            static {
                LimitErrorTypeDto[] limitErrorTypeDtoArr$values = $values();
                $VALUES = limitErrorTypeDtoArr$values;
                $ENTRIES = EnumEntries2.enumEntries(limitErrorTypeDtoArr$values);
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MAXTransferContextDto.TransferLimitValidationErrorDto.LimitErrorTypeDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferLimitValidationErrorDto.LimitErrorTypeDto.AMOUNT", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferLimitValidationError$LimitErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class AMOUNT extends LimitErrorTypeDto {
                AMOUNT(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public MAXTransferContext.TransferLimitValidationError.LimitErrorType toProto() {
                    return MAXTransferContext.TransferLimitValidationError.LimitErrorType.AMOUNT;
                }
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferLimitValidationErrorDto.LimitErrorTypeDto.COUNT", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferLimitValidationError$LimitErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class COUNT extends LimitErrorTypeDto {
                COUNT(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public MAXTransferContext.TransferLimitValidationError.LimitErrorType toProto() {
                    return MAXTransferContext.TransferLimitValidationError.LimitErrorType.COUNT;
                }
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferLimitValidationErrorDto.LimitErrorTypeDto.MAX_TRANSFER", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferLimitValidationError$LimitErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class MAX_TRANSFER extends LimitErrorTypeDto {
                MAX_TRANSFER(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public MAXTransferContext.TransferLimitValidationError.LimitErrorType toProto() {
                    return MAXTransferContext.TransferLimitValidationError.LimitErrorType.MAX_TRANSFER;
                }
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferLimitValidationErrorDto.LimitErrorTypeDto.MIN_TRANSFER", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferLimitValidationError$LimitErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class MIN_TRANSFER extends LimitErrorTypeDto {
                MIN_TRANSFER(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public MAXTransferContext.TransferLimitValidationError.LimitErrorType toProto() {
                    return MAXTransferContext.TransferLimitValidationError.LimitErrorType.MIN_TRANSFER;
                }
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferLimitValidationError$LimitErrorType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto2.Creator<LimitErrorTypeDto, MAXTransferContext.TransferLimitValidationError.LimitErrorType> {

                /* compiled from: MAXTransferContextDto.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* loaded from: classes26.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[MAXTransferContext.TransferLimitValidationError.LimitErrorType.values().length];
                        try {
                            iArr[MAXTransferContext.TransferLimitValidationError.LimitErrorType.LIMIT_ERROR_TYPE_UNSPECIFIED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[MAXTransferContext.TransferLimitValidationError.LimitErrorType.AMOUNT.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[MAXTransferContext.TransferLimitValidationError.LimitErrorType.COUNT.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[MAXTransferContext.TransferLimitValidationError.LimitErrorType.MAX_TRANSFER.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[MAXTransferContext.TransferLimitValidationError.LimitErrorType.MIN_TRANSFER.ordinal()] = 5;
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

                public final KSerializer<LimitErrorTypeDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<LimitErrorTypeDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<LimitErrorTypeDto> getBinaryBase64Serializer() {
                    return (KSerializer) LimitErrorTypeDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<MAXTransferContext.TransferLimitValidationError.LimitErrorType> getProtoAdapter() {
                    return MAXTransferContext.TransferLimitValidationError.LimitErrorType.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public LimitErrorTypeDto getZeroValue() {
                    return LimitErrorTypeDto.LIMIT_ERROR_TYPE_UNSPECIFIED;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public LimitErrorTypeDto fromProto(MAXTransferContext.TransferLimitValidationError.LimitErrorType proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                    if (i == 1) {
                        return LimitErrorTypeDto.LIMIT_ERROR_TYPE_UNSPECIFIED;
                    }
                    if (i == 2) {
                        return LimitErrorTypeDto.AMOUNT;
                    }
                    if (i == 3) {
                        return LimitErrorTypeDto.COUNT;
                    }
                    if (i == 4) {
                        return LimitErrorTypeDto.MAX_TRANSFER;
                    }
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return LimitErrorTypeDto.MIN_TRANSFER;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$LimitErrorTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public static final class Serializer implements KSerializer<LimitErrorTypeDto> {
                public static final Serializer INSTANCE = new Serializer();
                private final /* synthetic */ EnumDtoSerializer<LimitErrorTypeDto, MAXTransferContext.TransferLimitValidationError.LimitErrorType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.MAXTransferContext.TransferLimitValidationError.LimitErrorType", LimitErrorTypeDto.getEntries(), LimitErrorTypeDto.INSTANCE.getZeroValue());

                @Override // kotlinx.serialization.KSerializer2
                public LimitErrorTypeDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return (LimitErrorTypeDto) this.$$delegate_0.deserialize(decoder);
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return this.$$delegate_0.getDescriptor();
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, LimitErrorTypeDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.$$delegate_0.serialize(encoder, (Enum) value);
                }

                private Serializer() {
                }
            }

            public static LimitErrorTypeDto valueOf(String str) {
                return (LimitErrorTypeDto) Enum.valueOf(LimitErrorTypeDto.class, str);
            }

            public static LimitErrorTypeDto[] values() {
                return (LimitErrorTypeDto[]) $VALUES.clone();
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<TransferLimitValidationErrorDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.MAXTransferContext.TransferLimitValidationError", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TransferLimitValidationErrorDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public TransferLimitValidationErrorDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new TransferLimitValidationErrorDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferLimitValidationErrorDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4192_8)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.MAXTransferContextDto$TransferLimitValidationErrorDto";
            }
        }
    }

    /* compiled from: MAXTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004$%&'B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000eJ.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001dH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010¨\u0006("}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$CurrencyConversionData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto$Surrogate;)V", "target_amount", "", "target_currency_code", "Lcom/robinhood/rosetta/common/CurrencyDto;", "target_fx_rate", "target_fx_rate_id", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/CurrencyDto;Ljava/lang/String;Ljava/lang/String;)V", "getTarget_amount", "()Ljava/lang/String;", "getTarget_currency_code", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getTarget_fx_rate", "getTarget_fx_rate_id", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CurrencyConversionDataDto implements Dto3<MAXTransferContext.CurrencyConversionData>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<CurrencyConversionDataDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CurrencyConversionDataDto, MAXTransferContext.CurrencyConversionData>> binaryBase64Serializer$delegate;
        private static final CurrencyConversionDataDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ CurrencyConversionDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CurrencyConversionDataDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getTarget_amount() {
            return this.surrogate.getTarget_amount();
        }

        public final CurrencyDto getTarget_currency_code() {
            return this.surrogate.getTarget_currency_code();
        }

        public final String getTarget_fx_rate() {
            return this.surrogate.getTarget_fx_rate();
        }

        public final String getTarget_fx_rate_id() {
            return this.surrogate.getTarget_fx_rate_id();
        }

        public /* synthetic */ CurrencyConversionDataDto(String str, CurrencyDto currencyDto, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public CurrencyConversionDataDto(String target_amount, CurrencyDto target_currency_code, String target_fx_rate, String target_fx_rate_id) {
            this(new Surrogate(target_amount, target_currency_code, target_fx_rate, target_fx_rate_id));
            Intrinsics.checkNotNullParameter(target_amount, "target_amount");
            Intrinsics.checkNotNullParameter(target_currency_code, "target_currency_code");
            Intrinsics.checkNotNullParameter(target_fx_rate, "target_fx_rate");
            Intrinsics.checkNotNullParameter(target_fx_rate_id, "target_fx_rate_id");
        }

        public static /* synthetic */ CurrencyConversionDataDto copy$default(CurrencyConversionDataDto currencyConversionDataDto, String str, CurrencyDto currencyDto, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = currencyConversionDataDto.surrogate.getTarget_amount();
            }
            if ((i & 2) != 0) {
                currencyDto = currencyConversionDataDto.surrogate.getTarget_currency_code();
            }
            if ((i & 4) != 0) {
                str2 = currencyConversionDataDto.surrogate.getTarget_fx_rate();
            }
            if ((i & 8) != 0) {
                str3 = currencyConversionDataDto.surrogate.getTarget_fx_rate_id();
            }
            return currencyConversionDataDto.copy(str, currencyDto, str2, str3);
        }

        public final CurrencyConversionDataDto copy(String target_amount, CurrencyDto target_currency_code, String target_fx_rate, String target_fx_rate_id) {
            Intrinsics.checkNotNullParameter(target_amount, "target_amount");
            Intrinsics.checkNotNullParameter(target_currency_code, "target_currency_code");
            Intrinsics.checkNotNullParameter(target_fx_rate, "target_fx_rate");
            Intrinsics.checkNotNullParameter(target_fx_rate_id, "target_fx_rate_id");
            return new CurrencyConversionDataDto(new Surrogate(target_amount, target_currency_code, target_fx_rate, target_fx_rate_id));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public MAXTransferContext.CurrencyConversionData toProto() {
            return new MAXTransferContext.CurrencyConversionData(this.surrogate.getTarget_amount(), (Currency) this.surrogate.getTarget_currency_code().toProto(), this.surrogate.getTarget_fx_rate(), this.surrogate.getTarget_fx_rate_id(), null, 16, null);
        }

        public String toString() {
            return "[CurrencyConversionDataDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof CurrencyConversionDataDto) && Intrinsics.areEqual(((CurrencyConversionDataDto) other).surrogate, this.surrogate);
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
        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 -2\u00020\u0001:\u0002,-B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J1\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u000bHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J%\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto$Surrogate;", "", "target_amount", "", "target_currency_code", "Lcom/robinhood/rosetta/common/CurrencyDto;", "target_fx_rate", "target_fx_rate_id", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/CurrencyDto;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/common/CurrencyDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTarget_amount$annotations", "()V", "getTarget_amount", "()Ljava/lang/String;", "getTarget_currency_code$annotations", "getTarget_currency_code", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getTarget_fx_rate$annotations", "getTarget_fx_rate", "getTarget_fx_rate_id$annotations", "getTarget_fx_rate_id", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String target_amount;
            private final CurrencyDto target_currency_code;
            private final String target_fx_rate;
            private final String target_fx_rate_id;

            public Surrogate() {
                this((String) null, (CurrencyDto) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, CurrencyDto currencyDto, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = surrogate.target_amount;
                }
                if ((i & 2) != 0) {
                    currencyDto = surrogate.target_currency_code;
                }
                if ((i & 4) != 0) {
                    str2 = surrogate.target_fx_rate;
                }
                if ((i & 8) != 0) {
                    str3 = surrogate.target_fx_rate_id;
                }
                return surrogate.copy(str, currencyDto, str2, str3);
            }

            @SerialName("targetAmount")
            @JsonAnnotations2(names = {"target_amount"})
            public static /* synthetic */ void getTarget_amount$annotations() {
            }

            @SerialName("targetCurrencyCode")
            @JsonAnnotations2(names = {"target_currency_code"})
            public static /* synthetic */ void getTarget_currency_code$annotations() {
            }

            @SerialName("targetFxRate")
            @JsonAnnotations2(names = {"target_fx_rate"})
            public static /* synthetic */ void getTarget_fx_rate$annotations() {
            }

            @SerialName("targetFxRateId")
            @JsonAnnotations2(names = {"target_fx_rate_id"})
            public static /* synthetic */ void getTarget_fx_rate_id$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getTarget_amount() {
                return this.target_amount;
            }

            /* renamed from: component2, reason: from getter */
            public final CurrencyDto getTarget_currency_code() {
                return this.target_currency_code;
            }

            /* renamed from: component3, reason: from getter */
            public final String getTarget_fx_rate() {
                return this.target_fx_rate;
            }

            /* renamed from: component4, reason: from getter */
            public final String getTarget_fx_rate_id() {
                return this.target_fx_rate_id;
            }

            public final Surrogate copy(String target_amount, CurrencyDto target_currency_code, String target_fx_rate, String target_fx_rate_id) {
                Intrinsics.checkNotNullParameter(target_amount, "target_amount");
                Intrinsics.checkNotNullParameter(target_currency_code, "target_currency_code");
                Intrinsics.checkNotNullParameter(target_fx_rate, "target_fx_rate");
                Intrinsics.checkNotNullParameter(target_fx_rate_id, "target_fx_rate_id");
                return new Surrogate(target_amount, target_currency_code, target_fx_rate, target_fx_rate_id);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.target_amount, surrogate.target_amount) && this.target_currency_code == surrogate.target_currency_code && Intrinsics.areEqual(this.target_fx_rate, surrogate.target_fx_rate) && Intrinsics.areEqual(this.target_fx_rate_id, surrogate.target_fx_rate_id);
            }

            public int hashCode() {
                return (((((this.target_amount.hashCode() * 31) + this.target_currency_code.hashCode()) * 31) + this.target_fx_rate.hashCode()) * 31) + this.target_fx_rate_id.hashCode();
            }

            public String toString() {
                return "Surrogate(target_amount=" + this.target_amount + ", target_currency_code=" + this.target_currency_code + ", target_fx_rate=" + this.target_fx_rate + ", target_fx_rate_id=" + this.target_fx_rate_id + ")";
            }

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return C36736xce81820f.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, CurrencyDto currencyDto, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.target_amount = "";
                } else {
                    this.target_amount = str;
                }
                if ((i & 2) == 0) {
                    this.target_currency_code = CurrencyDto.INSTANCE.getZeroValue();
                } else {
                    this.target_currency_code = currencyDto;
                }
                if ((i & 4) == 0) {
                    this.target_fx_rate = "";
                } else {
                    this.target_fx_rate = str2;
                }
                if ((i & 8) == 0) {
                    this.target_fx_rate_id = "";
                } else {
                    this.target_fx_rate_id = str3;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.target_amount, "")) {
                    output.encodeStringElement(serialDesc, 0, self.target_amount);
                }
                if (self.target_currency_code != CurrencyDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 1, CurrencyDto.Serializer.INSTANCE, self.target_currency_code);
                }
                if (!Intrinsics.areEqual(self.target_fx_rate, "")) {
                    output.encodeStringElement(serialDesc, 2, self.target_fx_rate);
                }
                if (Intrinsics.areEqual(self.target_fx_rate_id, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 3, self.target_fx_rate_id);
            }

            public Surrogate(String target_amount, CurrencyDto target_currency_code, String target_fx_rate, String target_fx_rate_id) {
                Intrinsics.checkNotNullParameter(target_amount, "target_amount");
                Intrinsics.checkNotNullParameter(target_currency_code, "target_currency_code");
                Intrinsics.checkNotNullParameter(target_fx_rate, "target_fx_rate");
                Intrinsics.checkNotNullParameter(target_fx_rate_id, "target_fx_rate_id");
                this.target_amount = target_amount;
                this.target_currency_code = target_currency_code;
                this.target_fx_rate = target_fx_rate;
                this.target_fx_rate_id = target_fx_rate_id;
            }

            public /* synthetic */ Surrogate(String str, CurrencyDto currencyDto, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
            }

            public final String getTarget_amount() {
                return this.target_amount;
            }

            public final CurrencyDto getTarget_currency_code() {
                return this.target_currency_code;
            }

            public final String getTarget_fx_rate() {
                return this.target_fx_rate;
            }

            public final String getTarget_fx_rate_id() {
                return this.target_fx_rate_id;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$CurrencyConversionData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<CurrencyConversionDataDto, MAXTransferContext.CurrencyConversionData> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CurrencyConversionDataDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CurrencyConversionDataDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CurrencyConversionDataDto> getBinaryBase64Serializer() {
                return (KSerializer) CurrencyConversionDataDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<MAXTransferContext.CurrencyConversionData> getProtoAdapter() {
                return MAXTransferContext.CurrencyConversionData.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CurrencyConversionDataDto getZeroValue() {
                return CurrencyConversionDataDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CurrencyConversionDataDto fromProto(MAXTransferContext.CurrencyConversionData proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new CurrencyConversionDataDto(new Surrogate(proto.getTarget_amount(), CurrencyDto.INSTANCE.fromProto(proto.getTarget_currency_code()), proto.getTarget_fx_rate(), proto.getTarget_fx_rate_id()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContextDto$CurrencyConversionDataDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MAXTransferContextDto.CurrencyConversionDataDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new CurrencyConversionDataDto(null, null, null, null, 15, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<CurrencyConversionDataDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.MAXTransferContext.CurrencyConversionData", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CurrencyConversionDataDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public CurrencyConversionDataDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new CurrencyConversionDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$CurrencyConversionDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4184_0)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.MAXTransferContextDto$CurrencyConversionDataDto";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MAXTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0003\b\u008f\u0001\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u009a\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0004\u009a\u0001\u009b\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0093\u0001\u001a\u00030\u0094\u00012\b\u0010\u0095\u0001\u001a\u00030\u0096\u00012\b\u0010\u0097\u0001\u001a\u00030\u0098\u0001H\u0016J\n\u0010\u0099\u0001\u001a\u00030\u0098\u0001H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001¨\u0006\u009c\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ENTRY_POINT_UNSPECIFIED", "FTR_DCF_LINKING", "MAINTENANCE_CALL", "MAINTENANCE_CALL_WARNING", "DAY_TRADE_CALL", "TRANSFER_HUB", "RECURRING_TRANSFER_HUB", "SPENDING_HOME", "SPENDING_HOME_WITH_ACTION_BAR", "RHY_RECURRING_MARKETING_PUSH", "RHY_RECURRING_MARKETING_EMAIL", "RHY_RECURRING_MARKETING_INBOX", "RHS_RECURRING_UPSELL", "RHY_RECURRING_UPSELL", "BUYING_POWER_BREAKDOWN", "MARGIN_HUB", "SPENDING_INCENTIVE", "OPTIONS_TRADING_FLOW", "EQUITIES_TRADING_FLOW", "INVEST_FLOW", "RETIREMENT_CONTRIBUTION_HUB", "RETIREMENT_UNFUNDED_DASHBOARD", "BUYING_POWER_DETAIL", "RETIREMENT_FUNDING_METHODS", "EQUITY_ORDER_CONFIRMATION_FUNDING_UPSELL", "CRYPTO_ORDER_CONFIRMATION_FUNDING_UPSELL", "RETIREMENT_FUNDED_DASHBOARD", "P2P_PAY_FLOW", "LINK_DEBIT_CARD", "MENU_OF_OPTIONS", "GOLD_SETTINGS", "GOLD_WELCOME", "RETIREMENT_GOLD_MATCH_PROMO", "GOLD_RET_PROMO_BOTTOM_SHEET", "POST_TRADE_FLOW_PDT", "RETIREMENT_UNFUNDED_LEARN_AND_EARN_EDUCATION_LESSON", "RFP_DECLINED_INBOX", "RFP_DECLINED_EMAIL", "RFP_EXPIRED_INBOX", "RFP_EXPIRED_EMAIL", "RFP_FAILED_INBOX", "RFP_FAILED_EMAIL", "RECOMMENDATIONS_FOR_RETIREMENT", "OUTGOING_WIRE", "RECURRING_DEPOSIT_UPSELL", "FEATURE_DISCOVERY", "CARD", "GOLD_BOOSTED_APY_FEATURE_DISCOVERY", "GOLD_BOOSTED_APY_CARD", "GOLD_BOOSTED_APY_ACCOUNT_BANNER", "GOLD_BOOSTED_APY_BOTTOM_SHEET", "GOLD_BOOSTED_APY_CASH_SECTION", "GOLD_BOOSTED_APY_EMAIL", "GOLD_BOOSTED_APY_PUSH", "RESURRECTIONS_M2_UPSELL", "GOLD_RETIREMENT_TAX_SEASON_ACCOUNT_BANNER", "M3A_CHURNED_ZERO_VARIANT1", "M3A_CHURNED_ZERO_VARIANT2", "M3B_INACTIVE_VARIANT1", "M3B_INACTIVE_VARIANT2", "GOLD_OPT_IN_UPGRADE_WELCOME", "AUC_APY_AUTO_BOOST_ALERT_SHEET", "NUX_CHECKLIST", "RETIREMENT_SETTINGS", "DISABLE_MARGIN_FAILURE", "INSTANT_DEPOSITS_CARD", "SWEEP_ONBOARDING", "GOLD_WELCOME_DEPOSIT_HOOK", "SWEEP_HUB", "WATCHLIST_SWEEP_SECTION", "GOLD_DEPOSIT_BOOST_EDUCATION", "PATHFINDER_RHY_DEACTIVATION", "PATHFINDER_RHS_DEACTIVATION", "GOLD_HUB_TRACKER_SWEEP", "GOLD_HUB_CARD_DEPOSIT_BOOST", "GOLD_HUB_CARD_SWEEP_ACTIVE", "GOLD_HUB_CARD_INSTANT", "GOLD_HUB_FEATURE_SWEEP_JOINT_ACTIVE", "GOLD_HUB_FEATURE_DEPOSIT_BOOST", "DEPOSIT_BOOST_HUB_DEFICIT_BANNER", "DEPOSIT_BOOST_HUB_CTA", "DEPOSIT_BOOST_EDUCATION_MODAL", "PATHFINDER_ACCOUNT_CLOSURE_IRA", "PATHFINDER_ACCOUNT_CLOSURE", "PDT_DEPOSIT_FUNDS", "DEBIT_CARD_LINKING_SUCCESS", "TRANSFER_MONEY_FORM", "IRA_TRANSFER_FORM", "RETIREMENT_CONTRIBUTION_CARD", "MENU_OF_OPTIONS_JOINT_ACCOUNT", "GOLD_SWEEP_HUB", "NOT_ENOUGH_BUYING_POWER", "EQUITY_DAY_TRADE_REASON_PDT", "PATHFINDER_SASSY_DEPOSIT_ABOVE_MARGIN_MAINTENANCE", "MARGIN_SETTINGS", "JOINT_ACCOUNT_FUNDING_METHODS", "MAINTENANCE_CALL_WITH_FUTURES", "BLACK_WIDOW", "ONE_PERCENT_MAX_AWARENESS_BOTTOMSHEET", "GOLD_SWEEP_SPLASH_DEPOSIT_ROW", "CREDIT_CARD_APP", "CREDIT_CARD_APP_BOOSTED_CASH_BACK", "GOLD_BOOSTED_APY_TRANSFER_HUB", "GOLD_DOWNGRADE_PREVENTION", "CREDIT_CARD_APP_AUC_CLI", "INCENTIVE_PRE_DEPOSIT", "INCENTIVE_POST_DEPOSIT", "LEGEND_EQUITY_TRADING_FLOW", "LEGEND_OPTIONS_TRADING_FLOW", "LEGEND_CRYPTO_TRADING_FLOW", "LEGEND_SIDEBAR_DEPOSIT", "LEGEND_SIDEBAR_TRANSFERS", "LEGEND_ACCOUNT_WIDGET", "ADVISORY_DASHBOARD_DEPOSIT_BUTTON", "CREDIT_CARD_APP_PREMIUM_CREDIT_LIMITS", "ADVISORY_DASHBOARD_RECURRING_DEPOSIT_BUTTON", "ROTH_CONVERSION", "GOLD_WELCOME_NATIVE", "CRYPTO_ORDER_CHECK", "EQUITY_ORDER_CHECK", "FUTURES_ORDER_CHECK", "OPTIONS_ORDER_CHECK", "GOLD_BOOSTED_APY_REWARD_CENTER_OFFER", "MANAGED_ACCOUNT_ONBOARDING_FLOW", "ADVISORY_FUTURE_PROJECTION", "BROKERAGE_ACCOUNT_OVERVIEW", "TRANSFER_HUB_DEPOSIT", "TRANSFER_HUB_WITHDRAW", "LEGEND_FUTURES_TRADING_FLOW", "INDIVIDUAL_ACCOUNT_ONBOARDING_FLOW", "INDIVIDUAL_ACCOUNT_NUX_FLOW", "SHORT_SELL_ENABLEMENT", "CUSTODIAL_ACCOUNT_ONBOARDING_FLOW", "CUSTODIAL_ACCOUNT_NUX_FLOW", "MARGIN_ONBOARDING", "STRATEGIES_AUTO_SELECT", "ISA_CONTRIBUTION", "EVENT_CONTRACTS_ORDER_CHECK", "DIRECT_IPO_ORDER_CHECK", "INDIVIDUAL_ACCOUNT_DASHBOARD_FOOTER", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EntryPointDto implements Dto2<MAXTransferContext.EntryPoint>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPointDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EntryPointDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EntryPointDto, MAXTransferContext.EntryPoint>> binaryBase64Serializer$delegate;
        public static final EntryPointDto ENTRY_POINT_UNSPECIFIED = new ENTRY_POINT_UNSPECIFIED("ENTRY_POINT_UNSPECIFIED", 0);
        public static final EntryPointDto FTR_DCF_LINKING = new FTR_DCF_LINKING("FTR_DCF_LINKING", 1);
        public static final EntryPointDto MAINTENANCE_CALL = new MAINTENANCE_CALL("MAINTENANCE_CALL", 2);
        public static final EntryPointDto MAINTENANCE_CALL_WARNING = new MAINTENANCE_CALL_WARNING("MAINTENANCE_CALL_WARNING", 3);
        public static final EntryPointDto DAY_TRADE_CALL = new DAY_TRADE_CALL("DAY_TRADE_CALL", 4);
        public static final EntryPointDto TRANSFER_HUB = new TRANSFER_HUB("TRANSFER_HUB", 5);
        public static final EntryPointDto RECURRING_TRANSFER_HUB = new RECURRING_TRANSFER_HUB("RECURRING_TRANSFER_HUB", 6);
        public static final EntryPointDto SPENDING_HOME = new SPENDING_HOME("SPENDING_HOME", 7);
        public static final EntryPointDto SPENDING_HOME_WITH_ACTION_BAR = new SPENDING_HOME_WITH_ACTION_BAR("SPENDING_HOME_WITH_ACTION_BAR", 8);
        public static final EntryPointDto RHY_RECURRING_MARKETING_PUSH = new RHY_RECURRING_MARKETING_PUSH("RHY_RECURRING_MARKETING_PUSH", 9);
        public static final EntryPointDto RHY_RECURRING_MARKETING_EMAIL = new RHY_RECURRING_MARKETING_EMAIL("RHY_RECURRING_MARKETING_EMAIL", 10);
        public static final EntryPointDto RHY_RECURRING_MARKETING_INBOX = new RHY_RECURRING_MARKETING_INBOX("RHY_RECURRING_MARKETING_INBOX", 11);
        public static final EntryPointDto RHS_RECURRING_UPSELL = new RHS_RECURRING_UPSELL("RHS_RECURRING_UPSELL", 12);
        public static final EntryPointDto RHY_RECURRING_UPSELL = new RHY_RECURRING_UPSELL("RHY_RECURRING_UPSELL", 13);
        public static final EntryPointDto BUYING_POWER_BREAKDOWN = new BUYING_POWER_BREAKDOWN("BUYING_POWER_BREAKDOWN", 14);
        public static final EntryPointDto MARGIN_HUB = new MARGIN_HUB("MARGIN_HUB", 15);
        public static final EntryPointDto SPENDING_INCENTIVE = new SPENDING_INCENTIVE("SPENDING_INCENTIVE", 16);
        public static final EntryPointDto OPTIONS_TRADING_FLOW = new OPTIONS_TRADING_FLOW("OPTIONS_TRADING_FLOW", 17);
        public static final EntryPointDto EQUITIES_TRADING_FLOW = new EQUITIES_TRADING_FLOW("EQUITIES_TRADING_FLOW", 18);
        public static final EntryPointDto INVEST_FLOW = new INVEST_FLOW("INVEST_FLOW", 19);
        public static final EntryPointDto RETIREMENT_CONTRIBUTION_HUB = new RETIREMENT_CONTRIBUTION_HUB("RETIREMENT_CONTRIBUTION_HUB", 20);
        public static final EntryPointDto RETIREMENT_UNFUNDED_DASHBOARD = new RETIREMENT_UNFUNDED_DASHBOARD("RETIREMENT_UNFUNDED_DASHBOARD", 21);
        public static final EntryPointDto BUYING_POWER_DETAIL = new BUYING_POWER_DETAIL("BUYING_POWER_DETAIL", 22);
        public static final EntryPointDto RETIREMENT_FUNDING_METHODS = new RETIREMENT_FUNDING_METHODS("RETIREMENT_FUNDING_METHODS", 23);
        public static final EntryPointDto EQUITY_ORDER_CONFIRMATION_FUNDING_UPSELL = new EQUITY_ORDER_CONFIRMATION_FUNDING_UPSELL("EQUITY_ORDER_CONFIRMATION_FUNDING_UPSELL", 24);
        public static final EntryPointDto CRYPTO_ORDER_CONFIRMATION_FUNDING_UPSELL = new CRYPTO_ORDER_CONFIRMATION_FUNDING_UPSELL("CRYPTO_ORDER_CONFIRMATION_FUNDING_UPSELL", 25);
        public static final EntryPointDto RETIREMENT_FUNDED_DASHBOARD = new RETIREMENT_FUNDED_DASHBOARD("RETIREMENT_FUNDED_DASHBOARD", 26);
        public static final EntryPointDto P2P_PAY_FLOW = new P2P_PAY_FLOW("P2P_PAY_FLOW", 27);
        public static final EntryPointDto LINK_DEBIT_CARD = new LINK_DEBIT_CARD("LINK_DEBIT_CARD", 28);
        public static final EntryPointDto MENU_OF_OPTIONS = new MENU_OF_OPTIONS("MENU_OF_OPTIONS", 29);
        public static final EntryPointDto GOLD_SETTINGS = new GOLD_SETTINGS("GOLD_SETTINGS", 30);
        public static final EntryPointDto GOLD_WELCOME = new GOLD_WELCOME("GOLD_WELCOME", 31);
        public static final EntryPointDto RETIREMENT_GOLD_MATCH_PROMO = new RETIREMENT_GOLD_MATCH_PROMO("RETIREMENT_GOLD_MATCH_PROMO", 32);
        public static final EntryPointDto GOLD_RET_PROMO_BOTTOM_SHEET = new GOLD_RET_PROMO_BOTTOM_SHEET("GOLD_RET_PROMO_BOTTOM_SHEET", 33);
        public static final EntryPointDto POST_TRADE_FLOW_PDT = new POST_TRADE_FLOW_PDT("POST_TRADE_FLOW_PDT", 34);
        public static final EntryPointDto RETIREMENT_UNFUNDED_LEARN_AND_EARN_EDUCATION_LESSON = new RETIREMENT_UNFUNDED_LEARN_AND_EARN_EDUCATION_LESSON("RETIREMENT_UNFUNDED_LEARN_AND_EARN_EDUCATION_LESSON", 35);
        public static final EntryPointDto RFP_DECLINED_INBOX = new RFP_DECLINED_INBOX("RFP_DECLINED_INBOX", 36);
        public static final EntryPointDto RFP_DECLINED_EMAIL = new RFP_DECLINED_EMAIL("RFP_DECLINED_EMAIL", 37);
        public static final EntryPointDto RFP_EXPIRED_INBOX = new RFP_EXPIRED_INBOX("RFP_EXPIRED_INBOX", 38);
        public static final EntryPointDto RFP_EXPIRED_EMAIL = new RFP_EXPIRED_EMAIL("RFP_EXPIRED_EMAIL", 39);
        public static final EntryPointDto RFP_FAILED_INBOX = new RFP_FAILED_INBOX("RFP_FAILED_INBOX", 40);
        public static final EntryPointDto RFP_FAILED_EMAIL = new RFP_FAILED_EMAIL("RFP_FAILED_EMAIL", 41);
        public static final EntryPointDto RECOMMENDATIONS_FOR_RETIREMENT = new RECOMMENDATIONS_FOR_RETIREMENT("RECOMMENDATIONS_FOR_RETIREMENT", 42);
        public static final EntryPointDto OUTGOING_WIRE = new OUTGOING_WIRE("OUTGOING_WIRE", 43);
        public static final EntryPointDto RECURRING_DEPOSIT_UPSELL = new RECURRING_DEPOSIT_UPSELL("RECURRING_DEPOSIT_UPSELL", 44);
        public static final EntryPointDto FEATURE_DISCOVERY = new FEATURE_DISCOVERY("FEATURE_DISCOVERY", 45);
        public static final EntryPointDto CARD = new CARD("CARD", 46);
        public static final EntryPointDto GOLD_BOOSTED_APY_FEATURE_DISCOVERY = new GOLD_BOOSTED_APY_FEATURE_DISCOVERY("GOLD_BOOSTED_APY_FEATURE_DISCOVERY", 47);
        public static final EntryPointDto GOLD_BOOSTED_APY_CARD = new GOLD_BOOSTED_APY_CARD("GOLD_BOOSTED_APY_CARD", 48);
        public static final EntryPointDto GOLD_BOOSTED_APY_ACCOUNT_BANNER = new GOLD_BOOSTED_APY_ACCOUNT_BANNER("GOLD_BOOSTED_APY_ACCOUNT_BANNER", 49);
        public static final EntryPointDto GOLD_BOOSTED_APY_BOTTOM_SHEET = new GOLD_BOOSTED_APY_BOTTOM_SHEET("GOLD_BOOSTED_APY_BOTTOM_SHEET", 50);
        public static final EntryPointDto GOLD_BOOSTED_APY_CASH_SECTION = new GOLD_BOOSTED_APY_CASH_SECTION("GOLD_BOOSTED_APY_CASH_SECTION", 51);
        public static final EntryPointDto GOLD_BOOSTED_APY_EMAIL = new GOLD_BOOSTED_APY_EMAIL("GOLD_BOOSTED_APY_EMAIL", 52);
        public static final EntryPointDto GOLD_BOOSTED_APY_PUSH = new GOLD_BOOSTED_APY_PUSH("GOLD_BOOSTED_APY_PUSH", 53);
        public static final EntryPointDto RESURRECTIONS_M2_UPSELL = new RESURRECTIONS_M2_UPSELL("RESURRECTIONS_M2_UPSELL", 54);
        public static final EntryPointDto GOLD_RETIREMENT_TAX_SEASON_ACCOUNT_BANNER = new GOLD_RETIREMENT_TAX_SEASON_ACCOUNT_BANNER("GOLD_RETIREMENT_TAX_SEASON_ACCOUNT_BANNER", 55);
        public static final EntryPointDto M3A_CHURNED_ZERO_VARIANT1 = new M3A_CHURNED_ZERO_VARIANT1("M3A_CHURNED_ZERO_VARIANT1", 56);
        public static final EntryPointDto M3A_CHURNED_ZERO_VARIANT2 = new M3A_CHURNED_ZERO_VARIANT2("M3A_CHURNED_ZERO_VARIANT2", 57);
        public static final EntryPointDto M3B_INACTIVE_VARIANT1 = new M3B_INACTIVE_VARIANT1("M3B_INACTIVE_VARIANT1", 58);
        public static final EntryPointDto M3B_INACTIVE_VARIANT2 = new M3B_INACTIVE_VARIANT2("M3B_INACTIVE_VARIANT2", 59);
        public static final EntryPointDto GOLD_OPT_IN_UPGRADE_WELCOME = new GOLD_OPT_IN_UPGRADE_WELCOME("GOLD_OPT_IN_UPGRADE_WELCOME", 60);
        public static final EntryPointDto AUC_APY_AUTO_BOOST_ALERT_SHEET = new AUC_APY_AUTO_BOOST_ALERT_SHEET("AUC_APY_AUTO_BOOST_ALERT_SHEET", 61);
        public static final EntryPointDto NUX_CHECKLIST = new NUX_CHECKLIST("NUX_CHECKLIST", 62);
        public static final EntryPointDto RETIREMENT_SETTINGS = new RETIREMENT_SETTINGS("RETIREMENT_SETTINGS", 63);
        public static final EntryPointDto DISABLE_MARGIN_FAILURE = new DISABLE_MARGIN_FAILURE("DISABLE_MARGIN_FAILURE", 64);
        public static final EntryPointDto INSTANT_DEPOSITS_CARD = new INSTANT_DEPOSITS_CARD("INSTANT_DEPOSITS_CARD", 65);
        public static final EntryPointDto SWEEP_ONBOARDING = new SWEEP_ONBOARDING("SWEEP_ONBOARDING", 66);
        public static final EntryPointDto GOLD_WELCOME_DEPOSIT_HOOK = new GOLD_WELCOME_DEPOSIT_HOOK("GOLD_WELCOME_DEPOSIT_HOOK", 67);
        public static final EntryPointDto SWEEP_HUB = new SWEEP_HUB("SWEEP_HUB", 68);
        public static final EntryPointDto WATCHLIST_SWEEP_SECTION = new WATCHLIST_SWEEP_SECTION("WATCHLIST_SWEEP_SECTION", 69);
        public static final EntryPointDto GOLD_DEPOSIT_BOOST_EDUCATION = new GOLD_DEPOSIT_BOOST_EDUCATION("GOLD_DEPOSIT_BOOST_EDUCATION", 70);
        public static final EntryPointDto PATHFINDER_RHY_DEACTIVATION = new PATHFINDER_RHY_DEACTIVATION("PATHFINDER_RHY_DEACTIVATION", 71);
        public static final EntryPointDto PATHFINDER_RHS_DEACTIVATION = new PATHFINDER_RHS_DEACTIVATION("PATHFINDER_RHS_DEACTIVATION", 72);
        public static final EntryPointDto GOLD_HUB_TRACKER_SWEEP = new GOLD_HUB_TRACKER_SWEEP("GOLD_HUB_TRACKER_SWEEP", 73);
        public static final EntryPointDto GOLD_HUB_CARD_DEPOSIT_BOOST = new GOLD_HUB_CARD_DEPOSIT_BOOST("GOLD_HUB_CARD_DEPOSIT_BOOST", 74);
        public static final EntryPointDto GOLD_HUB_CARD_SWEEP_ACTIVE = new GOLD_HUB_CARD_SWEEP_ACTIVE("GOLD_HUB_CARD_SWEEP_ACTIVE", 75);
        public static final EntryPointDto GOLD_HUB_CARD_INSTANT = new GOLD_HUB_CARD_INSTANT("GOLD_HUB_CARD_INSTANT", 76);
        public static final EntryPointDto GOLD_HUB_FEATURE_SWEEP_JOINT_ACTIVE = new GOLD_HUB_FEATURE_SWEEP_JOINT_ACTIVE("GOLD_HUB_FEATURE_SWEEP_JOINT_ACTIVE", 77);
        public static final EntryPointDto GOLD_HUB_FEATURE_DEPOSIT_BOOST = new GOLD_HUB_FEATURE_DEPOSIT_BOOST("GOLD_HUB_FEATURE_DEPOSIT_BOOST", 78);
        public static final EntryPointDto DEPOSIT_BOOST_HUB_DEFICIT_BANNER = new DEPOSIT_BOOST_HUB_DEFICIT_BANNER("DEPOSIT_BOOST_HUB_DEFICIT_BANNER", 79);
        public static final EntryPointDto DEPOSIT_BOOST_HUB_CTA = new DEPOSIT_BOOST_HUB_CTA("DEPOSIT_BOOST_HUB_CTA", 80);
        public static final EntryPointDto DEPOSIT_BOOST_EDUCATION_MODAL = new DEPOSIT_BOOST_EDUCATION_MODAL("DEPOSIT_BOOST_EDUCATION_MODAL", 81);
        public static final EntryPointDto PATHFINDER_ACCOUNT_CLOSURE_IRA = new PATHFINDER_ACCOUNT_CLOSURE_IRA("PATHFINDER_ACCOUNT_CLOSURE_IRA", 82);
        public static final EntryPointDto PATHFINDER_ACCOUNT_CLOSURE = new PATHFINDER_ACCOUNT_CLOSURE("PATHFINDER_ACCOUNT_CLOSURE", 83);
        public static final EntryPointDto PDT_DEPOSIT_FUNDS = new PDT_DEPOSIT_FUNDS("PDT_DEPOSIT_FUNDS", 84);
        public static final EntryPointDto DEBIT_CARD_LINKING_SUCCESS = new DEBIT_CARD_LINKING_SUCCESS("DEBIT_CARD_LINKING_SUCCESS", 85);
        public static final EntryPointDto TRANSFER_MONEY_FORM = new TRANSFER_MONEY_FORM("TRANSFER_MONEY_FORM", 86);
        public static final EntryPointDto IRA_TRANSFER_FORM = new IRA_TRANSFER_FORM("IRA_TRANSFER_FORM", 87);
        public static final EntryPointDto RETIREMENT_CONTRIBUTION_CARD = new RETIREMENT_CONTRIBUTION_CARD("RETIREMENT_CONTRIBUTION_CARD", 88);
        public static final EntryPointDto MENU_OF_OPTIONS_JOINT_ACCOUNT = new MENU_OF_OPTIONS_JOINT_ACCOUNT("MENU_OF_OPTIONS_JOINT_ACCOUNT", 89);
        public static final EntryPointDto GOLD_SWEEP_HUB = new GOLD_SWEEP_HUB("GOLD_SWEEP_HUB", 90);
        public static final EntryPointDto NOT_ENOUGH_BUYING_POWER = new NOT_ENOUGH_BUYING_POWER("NOT_ENOUGH_BUYING_POWER", 91);
        public static final EntryPointDto EQUITY_DAY_TRADE_REASON_PDT = new EQUITY_DAY_TRADE_REASON_PDT("EQUITY_DAY_TRADE_REASON_PDT", 92);
        public static final EntryPointDto PATHFINDER_SASSY_DEPOSIT_ABOVE_MARGIN_MAINTENANCE = new PATHFINDER_SASSY_DEPOSIT_ABOVE_MARGIN_MAINTENANCE("PATHFINDER_SASSY_DEPOSIT_ABOVE_MARGIN_MAINTENANCE", 93);
        public static final EntryPointDto MARGIN_SETTINGS = new MARGIN_SETTINGS("MARGIN_SETTINGS", 94);
        public static final EntryPointDto JOINT_ACCOUNT_FUNDING_METHODS = new JOINT_ACCOUNT_FUNDING_METHODS("JOINT_ACCOUNT_FUNDING_METHODS", 95);
        public static final EntryPointDto MAINTENANCE_CALL_WITH_FUTURES = new MAINTENANCE_CALL_WITH_FUTURES("MAINTENANCE_CALL_WITH_FUTURES", 96);
        public static final EntryPointDto BLACK_WIDOW = new BLACK_WIDOW("BLACK_WIDOW", 97);
        public static final EntryPointDto ONE_PERCENT_MAX_AWARENESS_BOTTOMSHEET = new ONE_PERCENT_MAX_AWARENESS_BOTTOMSHEET("ONE_PERCENT_MAX_AWARENESS_BOTTOMSHEET", 98);
        public static final EntryPointDto GOLD_SWEEP_SPLASH_DEPOSIT_ROW = new GOLD_SWEEP_SPLASH_DEPOSIT_ROW("GOLD_SWEEP_SPLASH_DEPOSIT_ROW", 99);
        public static final EntryPointDto CREDIT_CARD_APP = new CREDIT_CARD_APP("CREDIT_CARD_APP", 100);
        public static final EntryPointDto CREDIT_CARD_APP_BOOSTED_CASH_BACK = new CREDIT_CARD_APP_BOOSTED_CASH_BACK("CREDIT_CARD_APP_BOOSTED_CASH_BACK", 101);
        public static final EntryPointDto GOLD_BOOSTED_APY_TRANSFER_HUB = new GOLD_BOOSTED_APY_TRANSFER_HUB("GOLD_BOOSTED_APY_TRANSFER_HUB", 102);
        public static final EntryPointDto GOLD_DOWNGRADE_PREVENTION = new GOLD_DOWNGRADE_PREVENTION("GOLD_DOWNGRADE_PREVENTION", 103);
        public static final EntryPointDto CREDIT_CARD_APP_AUC_CLI = new CREDIT_CARD_APP_AUC_CLI("CREDIT_CARD_APP_AUC_CLI", 104);
        public static final EntryPointDto INCENTIVE_PRE_DEPOSIT = new INCENTIVE_PRE_DEPOSIT("INCENTIVE_PRE_DEPOSIT", 105);
        public static final EntryPointDto INCENTIVE_POST_DEPOSIT = new INCENTIVE_POST_DEPOSIT("INCENTIVE_POST_DEPOSIT", 106);
        public static final EntryPointDto LEGEND_EQUITY_TRADING_FLOW = new LEGEND_EQUITY_TRADING_FLOW("LEGEND_EQUITY_TRADING_FLOW", 107);
        public static final EntryPointDto LEGEND_OPTIONS_TRADING_FLOW = new LEGEND_OPTIONS_TRADING_FLOW("LEGEND_OPTIONS_TRADING_FLOW", 108);
        public static final EntryPointDto LEGEND_CRYPTO_TRADING_FLOW = new LEGEND_CRYPTO_TRADING_FLOW("LEGEND_CRYPTO_TRADING_FLOW", 109);
        public static final EntryPointDto LEGEND_SIDEBAR_DEPOSIT = new LEGEND_SIDEBAR_DEPOSIT("LEGEND_SIDEBAR_DEPOSIT", 110);
        public static final EntryPointDto LEGEND_SIDEBAR_TRANSFERS = new LEGEND_SIDEBAR_TRANSFERS("LEGEND_SIDEBAR_TRANSFERS", 111);
        public static final EntryPointDto LEGEND_ACCOUNT_WIDGET = new LEGEND_ACCOUNT_WIDGET("LEGEND_ACCOUNT_WIDGET", 112);
        public static final EntryPointDto ADVISORY_DASHBOARD_DEPOSIT_BUTTON = new ADVISORY_DASHBOARD_DEPOSIT_BUTTON("ADVISORY_DASHBOARD_DEPOSIT_BUTTON", 113);
        public static final EntryPointDto CREDIT_CARD_APP_PREMIUM_CREDIT_LIMITS = new CREDIT_CARD_APP_PREMIUM_CREDIT_LIMITS("CREDIT_CARD_APP_PREMIUM_CREDIT_LIMITS", 114);
        public static final EntryPointDto ADVISORY_DASHBOARD_RECURRING_DEPOSIT_BUTTON = new ADVISORY_DASHBOARD_RECURRING_DEPOSIT_BUTTON("ADVISORY_DASHBOARD_RECURRING_DEPOSIT_BUTTON", 115);
        public static final EntryPointDto ROTH_CONVERSION = new ROTH_CONVERSION("ROTH_CONVERSION", 116);
        public static final EntryPointDto GOLD_WELCOME_NATIVE = new GOLD_WELCOME_NATIVE("GOLD_WELCOME_NATIVE", 117);
        public static final EntryPointDto CRYPTO_ORDER_CHECK = new CRYPTO_ORDER_CHECK("CRYPTO_ORDER_CHECK", 118);
        public static final EntryPointDto EQUITY_ORDER_CHECK = new EQUITY_ORDER_CHECK("EQUITY_ORDER_CHECK", 119);
        public static final EntryPointDto FUTURES_ORDER_CHECK = new FUTURES_ORDER_CHECK("FUTURES_ORDER_CHECK", 120);
        public static final EntryPointDto OPTIONS_ORDER_CHECK = new OPTIONS_ORDER_CHECK("OPTIONS_ORDER_CHECK", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE);
        public static final EntryPointDto GOLD_BOOSTED_APY_REWARD_CENTER_OFFER = new GOLD_BOOSTED_APY_REWARD_CENTER_OFFER("GOLD_BOOSTED_APY_REWARD_CENTER_OFFER", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
        public static final EntryPointDto MANAGED_ACCOUNT_ONBOARDING_FLOW = new MANAGED_ACCOUNT_ONBOARDING_FLOW("MANAGED_ACCOUNT_ONBOARDING_FLOW", 123);
        public static final EntryPointDto ADVISORY_FUTURE_PROJECTION = new ADVISORY_FUTURE_PROJECTION("ADVISORY_FUTURE_PROJECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
        public static final EntryPointDto BROKERAGE_ACCOUNT_OVERVIEW = new BROKERAGE_ACCOUNT_OVERVIEW("BROKERAGE_ACCOUNT_OVERVIEW", 125);
        public static final EntryPointDto TRANSFER_HUB_DEPOSIT = new TRANSFER_HUB_DEPOSIT("TRANSFER_HUB_DEPOSIT", EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        public static final EntryPointDto TRANSFER_HUB_WITHDRAW = new TRANSFER_HUB_WITHDRAW("TRANSFER_HUB_WITHDRAW", EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
        public static final EntryPointDto LEGEND_FUTURES_TRADING_FLOW = new LEGEND_FUTURES_TRADING_FLOW("LEGEND_FUTURES_TRADING_FLOW", 128);
        public static final EntryPointDto INDIVIDUAL_ACCOUNT_ONBOARDING_FLOW = new INDIVIDUAL_ACCOUNT_ONBOARDING_FLOW("INDIVIDUAL_ACCOUNT_ONBOARDING_FLOW", EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
        public static final EntryPointDto INDIVIDUAL_ACCOUNT_NUX_FLOW = new INDIVIDUAL_ACCOUNT_NUX_FLOW("INDIVIDUAL_ACCOUNT_NUX_FLOW", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
        public static final EntryPointDto SHORT_SELL_ENABLEMENT = new SHORT_SELL_ENABLEMENT("SHORT_SELL_ENABLEMENT", 131);
        public static final EntryPointDto CUSTODIAL_ACCOUNT_ONBOARDING_FLOW = new CUSTODIAL_ACCOUNT_ONBOARDING_FLOW("CUSTODIAL_ACCOUNT_ONBOARDING_FLOW", EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE);
        public static final EntryPointDto CUSTODIAL_ACCOUNT_NUX_FLOW = new CUSTODIAL_ACCOUNT_NUX_FLOW("CUSTODIAL_ACCOUNT_NUX_FLOW", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE);
        public static final EntryPointDto MARGIN_ONBOARDING = new MARGIN_ONBOARDING("MARGIN_ONBOARDING", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE);
        public static final EntryPointDto STRATEGIES_AUTO_SELECT = new STRATEGIES_AUTO_SELECT("STRATEGIES_AUTO_SELECT", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE);
        public static final EntryPointDto ISA_CONTRIBUTION = new ISA_CONTRIBUTION("ISA_CONTRIBUTION", 136);
        public static final EntryPointDto EVENT_CONTRACTS_ORDER_CHECK = new EVENT_CONTRACTS_ORDER_CHECK("EVENT_CONTRACTS_ORDER_CHECK", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE);
        public static final EntryPointDto DIRECT_IPO_ORDER_CHECK = new DIRECT_IPO_ORDER_CHECK("DIRECT_IPO_ORDER_CHECK", EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE);
        public static final EntryPointDto INDIVIDUAL_ACCOUNT_DASHBOARD_FOOTER = new INDIVIDUAL_ACCOUNT_DASHBOARD_FOOTER("INDIVIDUAL_ACCOUNT_DASHBOARD_FOOTER", EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE);

        private static final /* synthetic */ EntryPointDto[] $values() {
            return new EntryPointDto[]{ENTRY_POINT_UNSPECIFIED, FTR_DCF_LINKING, MAINTENANCE_CALL, MAINTENANCE_CALL_WARNING, DAY_TRADE_CALL, TRANSFER_HUB, RECURRING_TRANSFER_HUB, SPENDING_HOME, SPENDING_HOME_WITH_ACTION_BAR, RHY_RECURRING_MARKETING_PUSH, RHY_RECURRING_MARKETING_EMAIL, RHY_RECURRING_MARKETING_INBOX, RHS_RECURRING_UPSELL, RHY_RECURRING_UPSELL, BUYING_POWER_BREAKDOWN, MARGIN_HUB, SPENDING_INCENTIVE, OPTIONS_TRADING_FLOW, EQUITIES_TRADING_FLOW, INVEST_FLOW, RETIREMENT_CONTRIBUTION_HUB, RETIREMENT_UNFUNDED_DASHBOARD, BUYING_POWER_DETAIL, RETIREMENT_FUNDING_METHODS, EQUITY_ORDER_CONFIRMATION_FUNDING_UPSELL, CRYPTO_ORDER_CONFIRMATION_FUNDING_UPSELL, RETIREMENT_FUNDED_DASHBOARD, P2P_PAY_FLOW, LINK_DEBIT_CARD, MENU_OF_OPTIONS, GOLD_SETTINGS, GOLD_WELCOME, RETIREMENT_GOLD_MATCH_PROMO, GOLD_RET_PROMO_BOTTOM_SHEET, POST_TRADE_FLOW_PDT, RETIREMENT_UNFUNDED_LEARN_AND_EARN_EDUCATION_LESSON, RFP_DECLINED_INBOX, RFP_DECLINED_EMAIL, RFP_EXPIRED_INBOX, RFP_EXPIRED_EMAIL, RFP_FAILED_INBOX, RFP_FAILED_EMAIL, RECOMMENDATIONS_FOR_RETIREMENT, OUTGOING_WIRE, RECURRING_DEPOSIT_UPSELL, FEATURE_DISCOVERY, CARD, GOLD_BOOSTED_APY_FEATURE_DISCOVERY, GOLD_BOOSTED_APY_CARD, GOLD_BOOSTED_APY_ACCOUNT_BANNER, GOLD_BOOSTED_APY_BOTTOM_SHEET, GOLD_BOOSTED_APY_CASH_SECTION, GOLD_BOOSTED_APY_EMAIL, GOLD_BOOSTED_APY_PUSH, RESURRECTIONS_M2_UPSELL, GOLD_RETIREMENT_TAX_SEASON_ACCOUNT_BANNER, M3A_CHURNED_ZERO_VARIANT1, M3A_CHURNED_ZERO_VARIANT2, M3B_INACTIVE_VARIANT1, M3B_INACTIVE_VARIANT2, GOLD_OPT_IN_UPGRADE_WELCOME, AUC_APY_AUTO_BOOST_ALERT_SHEET, NUX_CHECKLIST, RETIREMENT_SETTINGS, DISABLE_MARGIN_FAILURE, INSTANT_DEPOSITS_CARD, SWEEP_ONBOARDING, GOLD_WELCOME_DEPOSIT_HOOK, SWEEP_HUB, WATCHLIST_SWEEP_SECTION, GOLD_DEPOSIT_BOOST_EDUCATION, PATHFINDER_RHY_DEACTIVATION, PATHFINDER_RHS_DEACTIVATION, GOLD_HUB_TRACKER_SWEEP, GOLD_HUB_CARD_DEPOSIT_BOOST, GOLD_HUB_CARD_SWEEP_ACTIVE, GOLD_HUB_CARD_INSTANT, GOLD_HUB_FEATURE_SWEEP_JOINT_ACTIVE, GOLD_HUB_FEATURE_DEPOSIT_BOOST, DEPOSIT_BOOST_HUB_DEFICIT_BANNER, DEPOSIT_BOOST_HUB_CTA, DEPOSIT_BOOST_EDUCATION_MODAL, PATHFINDER_ACCOUNT_CLOSURE_IRA, PATHFINDER_ACCOUNT_CLOSURE, PDT_DEPOSIT_FUNDS, DEBIT_CARD_LINKING_SUCCESS, TRANSFER_MONEY_FORM, IRA_TRANSFER_FORM, RETIREMENT_CONTRIBUTION_CARD, MENU_OF_OPTIONS_JOINT_ACCOUNT, GOLD_SWEEP_HUB, NOT_ENOUGH_BUYING_POWER, EQUITY_DAY_TRADE_REASON_PDT, PATHFINDER_SASSY_DEPOSIT_ABOVE_MARGIN_MAINTENANCE, MARGIN_SETTINGS, JOINT_ACCOUNT_FUNDING_METHODS, MAINTENANCE_CALL_WITH_FUTURES, BLACK_WIDOW, ONE_PERCENT_MAX_AWARENESS_BOTTOMSHEET, GOLD_SWEEP_SPLASH_DEPOSIT_ROW, CREDIT_CARD_APP, CREDIT_CARD_APP_BOOSTED_CASH_BACK, GOLD_BOOSTED_APY_TRANSFER_HUB, GOLD_DOWNGRADE_PREVENTION, CREDIT_CARD_APP_AUC_CLI, INCENTIVE_PRE_DEPOSIT, INCENTIVE_POST_DEPOSIT, LEGEND_EQUITY_TRADING_FLOW, LEGEND_OPTIONS_TRADING_FLOW, LEGEND_CRYPTO_TRADING_FLOW, LEGEND_SIDEBAR_DEPOSIT, LEGEND_SIDEBAR_TRANSFERS, LEGEND_ACCOUNT_WIDGET, ADVISORY_DASHBOARD_DEPOSIT_BUTTON, CREDIT_CARD_APP_PREMIUM_CREDIT_LIMITS, ADVISORY_DASHBOARD_RECURRING_DEPOSIT_BUTTON, ROTH_CONVERSION, GOLD_WELCOME_NATIVE, CRYPTO_ORDER_CHECK, EQUITY_ORDER_CHECK, FUTURES_ORDER_CHECK, OPTIONS_ORDER_CHECK, GOLD_BOOSTED_APY_REWARD_CENTER_OFFER, MANAGED_ACCOUNT_ONBOARDING_FLOW, ADVISORY_FUTURE_PROJECTION, BROKERAGE_ACCOUNT_OVERVIEW, TRANSFER_HUB_DEPOSIT, TRANSFER_HUB_WITHDRAW, LEGEND_FUTURES_TRADING_FLOW, INDIVIDUAL_ACCOUNT_ONBOARDING_FLOW, INDIVIDUAL_ACCOUNT_NUX_FLOW, SHORT_SELL_ENABLEMENT, CUSTODIAL_ACCOUNT_ONBOARDING_FLOW, CUSTODIAL_ACCOUNT_NUX_FLOW, MARGIN_ONBOARDING, STRATEGIES_AUTO_SELECT, ISA_CONTRIBUTION, EVENT_CONTRACTS_ORDER_CHECK, DIRECT_IPO_ORDER_CHECK, INDIVIDUAL_ACCOUNT_DASHBOARD_FOOTER};
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

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.ENTRY_POINT_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ENTRY_POINT_UNSPECIFIED extends EntryPointDto {
            ENTRY_POINT_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContextDto$EntryPointDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MAXTransferContextDto.EntryPointDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.FTR_DCF_LINKING", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FTR_DCF_LINKING extends EntryPointDto {
            FTR_DCF_LINKING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.FTR_DCF_LINKING;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.MAINTENANCE_CALL", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MAINTENANCE_CALL extends EntryPointDto {
            MAINTENANCE_CALL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.MAINTENANCE_CALL;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.MAINTENANCE_CALL_WARNING", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MAINTENANCE_CALL_WARNING extends EntryPointDto {
            MAINTENANCE_CALL_WARNING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.MAINTENANCE_CALL_WARNING;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.DAY_TRADE_CALL", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DAY_TRADE_CALL extends EntryPointDto {
            DAY_TRADE_CALL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.DAY_TRADE_CALL;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.TRANSFER_HUB", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRANSFER_HUB extends EntryPointDto {
            TRANSFER_HUB(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.TRANSFER_HUB;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.RECURRING_TRANSFER_HUB", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECURRING_TRANSFER_HUB extends EntryPointDto {
            RECURRING_TRANSFER_HUB(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.RECURRING_TRANSFER_HUB;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.SPENDING_HOME", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SPENDING_HOME extends EntryPointDto {
            SPENDING_HOME(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.SPENDING_HOME;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.SPENDING_HOME_WITH_ACTION_BAR", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SPENDING_HOME_WITH_ACTION_BAR extends EntryPointDto {
            SPENDING_HOME_WITH_ACTION_BAR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.SPENDING_HOME_WITH_ACTION_BAR;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.RHY_RECURRING_MARKETING_PUSH", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RHY_RECURRING_MARKETING_PUSH extends EntryPointDto {
            RHY_RECURRING_MARKETING_PUSH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.RHY_RECURRING_MARKETING_PUSH;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.RHY_RECURRING_MARKETING_EMAIL", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RHY_RECURRING_MARKETING_EMAIL extends EntryPointDto {
            RHY_RECURRING_MARKETING_EMAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.RHY_RECURRING_MARKETING_EMAIL;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.RHY_RECURRING_MARKETING_INBOX", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RHY_RECURRING_MARKETING_INBOX extends EntryPointDto {
            RHY_RECURRING_MARKETING_INBOX(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.RHY_RECURRING_MARKETING_INBOX;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.RHS_RECURRING_UPSELL", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RHS_RECURRING_UPSELL extends EntryPointDto {
            RHS_RECURRING_UPSELL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.RHS_RECURRING_UPSELL;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.RHY_RECURRING_UPSELL", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RHY_RECURRING_UPSELL extends EntryPointDto {
            RHY_RECURRING_UPSELL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.RHY_RECURRING_UPSELL;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.BUYING_POWER_BREAKDOWN", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BUYING_POWER_BREAKDOWN extends EntryPointDto {
            BUYING_POWER_BREAKDOWN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.BUYING_POWER_BREAKDOWN;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.MARGIN_HUB", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MARGIN_HUB extends EntryPointDto {
            MARGIN_HUB(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.MARGIN_HUB;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.SPENDING_INCENTIVE", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SPENDING_INCENTIVE extends EntryPointDto {
            SPENDING_INCENTIVE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.SPENDING_INCENTIVE;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.OPTIONS_TRADING_FLOW", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS_TRADING_FLOW extends EntryPointDto {
            OPTIONS_TRADING_FLOW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.OPTIONS_TRADING_FLOW;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.EQUITIES_TRADING_FLOW", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EQUITIES_TRADING_FLOW extends EntryPointDto {
            EQUITIES_TRADING_FLOW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.EQUITIES_TRADING_FLOW;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.INVEST_FLOW", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INVEST_FLOW extends EntryPointDto {
            INVEST_FLOW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.INVEST_FLOW;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.RETIREMENT_CONTRIBUTION_HUB", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RETIREMENT_CONTRIBUTION_HUB extends EntryPointDto {
            RETIREMENT_CONTRIBUTION_HUB(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.RETIREMENT_CONTRIBUTION_HUB;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.RETIREMENT_UNFUNDED_DASHBOARD", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RETIREMENT_UNFUNDED_DASHBOARD extends EntryPointDto {
            RETIREMENT_UNFUNDED_DASHBOARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.RETIREMENT_UNFUNDED_DASHBOARD;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.BUYING_POWER_DETAIL", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BUYING_POWER_DETAIL extends EntryPointDto {
            BUYING_POWER_DETAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.BUYING_POWER_DETAIL;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.RETIREMENT_FUNDING_METHODS", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RETIREMENT_FUNDING_METHODS extends EntryPointDto {
            RETIREMENT_FUNDING_METHODS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.RETIREMENT_FUNDING_METHODS;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.EQUITY_ORDER_CONFIRMATION_FUNDING_UPSELL", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EQUITY_ORDER_CONFIRMATION_FUNDING_UPSELL extends EntryPointDto {
            EQUITY_ORDER_CONFIRMATION_FUNDING_UPSELL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.EQUITY_ORDER_CONFIRMATION_FUNDING_UPSELL;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.CRYPTO_ORDER_CONFIRMATION_FUNDING_UPSELL", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CRYPTO_ORDER_CONFIRMATION_FUNDING_UPSELL extends EntryPointDto {
            CRYPTO_ORDER_CONFIRMATION_FUNDING_UPSELL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.CRYPTO_ORDER_CONFIRMATION_FUNDING_UPSELL;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.RETIREMENT_FUNDED_DASHBOARD", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RETIREMENT_FUNDED_DASHBOARD extends EntryPointDto {
            RETIREMENT_FUNDED_DASHBOARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.RETIREMENT_FUNDED_DASHBOARD;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.P2P_PAY_FLOW", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class P2P_PAY_FLOW extends EntryPointDto {
            P2P_PAY_FLOW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.P2P_PAY_FLOW;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.LINK_DEBIT_CARD", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LINK_DEBIT_CARD extends EntryPointDto {
            LINK_DEBIT_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.LINK_DEBIT_CARD;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.MENU_OF_OPTIONS", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MENU_OF_OPTIONS extends EntryPointDto {
            MENU_OF_OPTIONS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.MENU_OF_OPTIONS;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_SETTINGS", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_SETTINGS extends EntryPointDto {
            GOLD_SETTINGS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_SETTINGS;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_WELCOME", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_WELCOME extends EntryPointDto {
            GOLD_WELCOME(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_WELCOME;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.RETIREMENT_GOLD_MATCH_PROMO", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RETIREMENT_GOLD_MATCH_PROMO extends EntryPointDto {
            RETIREMENT_GOLD_MATCH_PROMO(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.RETIREMENT_GOLD_MATCH_PROMO;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_RET_PROMO_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_RET_PROMO_BOTTOM_SHEET extends EntryPointDto {
            GOLD_RET_PROMO_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_RET_PROMO_BOTTOM_SHEET;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.POST_TRADE_FLOW_PDT", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class POST_TRADE_FLOW_PDT extends EntryPointDto {
            POST_TRADE_FLOW_PDT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.POST_TRADE_FLOW_PDT;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.RETIREMENT_UNFUNDED_LEARN_AND_EARN_EDUCATION_LESSON", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RETIREMENT_UNFUNDED_LEARN_AND_EARN_EDUCATION_LESSON extends EntryPointDto {
            RETIREMENT_UNFUNDED_LEARN_AND_EARN_EDUCATION_LESSON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.RETIREMENT_UNFUNDED_LEARN_AND_EARN_EDUCATION_LESSON;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.RFP_DECLINED_INBOX", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RFP_DECLINED_INBOX extends EntryPointDto {
            RFP_DECLINED_INBOX(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.RFP_DECLINED_INBOX;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.RFP_DECLINED_EMAIL", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RFP_DECLINED_EMAIL extends EntryPointDto {
            RFP_DECLINED_EMAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.RFP_DECLINED_EMAIL;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.RFP_EXPIRED_INBOX", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RFP_EXPIRED_INBOX extends EntryPointDto {
            RFP_EXPIRED_INBOX(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.RFP_EXPIRED_INBOX;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.RFP_EXPIRED_EMAIL", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RFP_EXPIRED_EMAIL extends EntryPointDto {
            RFP_EXPIRED_EMAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.RFP_EXPIRED_EMAIL;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.RFP_FAILED_INBOX", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RFP_FAILED_INBOX extends EntryPointDto {
            RFP_FAILED_INBOX(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.RFP_FAILED_INBOX;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.RFP_FAILED_EMAIL", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RFP_FAILED_EMAIL extends EntryPointDto {
            RFP_FAILED_EMAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.RFP_FAILED_EMAIL;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.RECOMMENDATIONS_FOR_RETIREMENT", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECOMMENDATIONS_FOR_RETIREMENT extends EntryPointDto {
            RECOMMENDATIONS_FOR_RETIREMENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.RECOMMENDATIONS_FOR_RETIREMENT;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.OUTGOING_WIRE", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OUTGOING_WIRE extends EntryPointDto {
            OUTGOING_WIRE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.OUTGOING_WIRE;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.RECURRING_DEPOSIT_UPSELL", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECURRING_DEPOSIT_UPSELL extends EntryPointDto {
            RECURRING_DEPOSIT_UPSELL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.RECURRING_DEPOSIT_UPSELL;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.FEATURE_DISCOVERY", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FEATURE_DISCOVERY extends EntryPointDto {
            FEATURE_DISCOVERY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.FEATURE_DISCOVERY;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.CARD", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CARD extends EntryPointDto {
            CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.CARD;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_BOOSTED_APY_FEATURE_DISCOVERY", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_BOOSTED_APY_FEATURE_DISCOVERY extends EntryPointDto {
            GOLD_BOOSTED_APY_FEATURE_DISCOVERY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_BOOSTED_APY_FEATURE_DISCOVERY;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_BOOSTED_APY_CARD", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_BOOSTED_APY_CARD extends EntryPointDto {
            GOLD_BOOSTED_APY_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_BOOSTED_APY_CARD;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_BOOSTED_APY_ACCOUNT_BANNER", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_BOOSTED_APY_ACCOUNT_BANNER extends EntryPointDto {
            GOLD_BOOSTED_APY_ACCOUNT_BANNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_BOOSTED_APY_ACCOUNT_BANNER;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_BOOSTED_APY_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_BOOSTED_APY_BOTTOM_SHEET extends EntryPointDto {
            GOLD_BOOSTED_APY_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_BOOSTED_APY_BOTTOM_SHEET;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_BOOSTED_APY_CASH_SECTION", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_BOOSTED_APY_CASH_SECTION extends EntryPointDto {
            GOLD_BOOSTED_APY_CASH_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_BOOSTED_APY_CASH_SECTION;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_BOOSTED_APY_EMAIL", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_BOOSTED_APY_EMAIL extends EntryPointDto {
            GOLD_BOOSTED_APY_EMAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_BOOSTED_APY_EMAIL;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_BOOSTED_APY_PUSH", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_BOOSTED_APY_PUSH extends EntryPointDto {
            GOLD_BOOSTED_APY_PUSH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_BOOSTED_APY_PUSH;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.RESURRECTIONS_M2_UPSELL", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RESURRECTIONS_M2_UPSELL extends EntryPointDto {
            RESURRECTIONS_M2_UPSELL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.RESURRECTIONS_M2_UPSELL;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_RETIREMENT_TAX_SEASON_ACCOUNT_BANNER", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_RETIREMENT_TAX_SEASON_ACCOUNT_BANNER extends EntryPointDto {
            GOLD_RETIREMENT_TAX_SEASON_ACCOUNT_BANNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_RETIREMENT_TAX_SEASON_ACCOUNT_BANNER;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.M3A_CHURNED_ZERO_VARIANT1", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class M3A_CHURNED_ZERO_VARIANT1 extends EntryPointDto {
            M3A_CHURNED_ZERO_VARIANT1(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.M3A_CHURNED_ZERO_VARIANT1;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.M3A_CHURNED_ZERO_VARIANT2", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class M3A_CHURNED_ZERO_VARIANT2 extends EntryPointDto {
            M3A_CHURNED_ZERO_VARIANT2(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.M3A_CHURNED_ZERO_VARIANT2;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.M3B_INACTIVE_VARIANT1", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class M3B_INACTIVE_VARIANT1 extends EntryPointDto {
            M3B_INACTIVE_VARIANT1(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.M3B_INACTIVE_VARIANT1;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.M3B_INACTIVE_VARIANT2", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class M3B_INACTIVE_VARIANT2 extends EntryPointDto {
            M3B_INACTIVE_VARIANT2(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.M3B_INACTIVE_VARIANT2;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_OPT_IN_UPGRADE_WELCOME", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_OPT_IN_UPGRADE_WELCOME extends EntryPointDto {
            GOLD_OPT_IN_UPGRADE_WELCOME(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_OPT_IN_UPGRADE_WELCOME;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.AUC_APY_AUTO_BOOST_ALERT_SHEET", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class AUC_APY_AUTO_BOOST_ALERT_SHEET extends EntryPointDto {
            AUC_APY_AUTO_BOOST_ALERT_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.AUC_APY_AUTO_BOOST_ALERT_SHEET;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.NUX_CHECKLIST", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NUX_CHECKLIST extends EntryPointDto {
            NUX_CHECKLIST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.NUX_CHECKLIST;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.RETIREMENT_SETTINGS", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RETIREMENT_SETTINGS extends EntryPointDto {
            RETIREMENT_SETTINGS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.RETIREMENT_SETTINGS;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.DISABLE_MARGIN_FAILURE", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DISABLE_MARGIN_FAILURE extends EntryPointDto {
            DISABLE_MARGIN_FAILURE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.DISABLE_MARGIN_FAILURE;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.INSTANT_DEPOSITS_CARD", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INSTANT_DEPOSITS_CARD extends EntryPointDto {
            INSTANT_DEPOSITS_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.INSTANT_DEPOSITS_CARD;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.SWEEP_ONBOARDING", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SWEEP_ONBOARDING extends EntryPointDto {
            SWEEP_ONBOARDING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.SWEEP_ONBOARDING;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_WELCOME_DEPOSIT_HOOK", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_WELCOME_DEPOSIT_HOOK extends EntryPointDto {
            GOLD_WELCOME_DEPOSIT_HOOK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_WELCOME_DEPOSIT_HOOK;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.SWEEP_HUB", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SWEEP_HUB extends EntryPointDto {
            SWEEP_HUB(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.SWEEP_HUB;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.WATCHLIST_SWEEP_SECTION", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WATCHLIST_SWEEP_SECTION extends EntryPointDto {
            WATCHLIST_SWEEP_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.WATCHLIST_SWEEP_SECTION;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_DEPOSIT_BOOST_EDUCATION", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_DEPOSIT_BOOST_EDUCATION extends EntryPointDto {
            GOLD_DEPOSIT_BOOST_EDUCATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_DEPOSIT_BOOST_EDUCATION;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.PATHFINDER_RHY_DEACTIVATION", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PATHFINDER_RHY_DEACTIVATION extends EntryPointDto {
            PATHFINDER_RHY_DEACTIVATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.PATHFINDER_RHY_DEACTIVATION;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.PATHFINDER_RHS_DEACTIVATION", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PATHFINDER_RHS_DEACTIVATION extends EntryPointDto {
            PATHFINDER_RHS_DEACTIVATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.PATHFINDER_RHS_DEACTIVATION;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_HUB_TRACKER_SWEEP", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_HUB_TRACKER_SWEEP extends EntryPointDto {
            GOLD_HUB_TRACKER_SWEEP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_HUB_TRACKER_SWEEP;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_HUB_CARD_DEPOSIT_BOOST", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_HUB_CARD_DEPOSIT_BOOST extends EntryPointDto {
            GOLD_HUB_CARD_DEPOSIT_BOOST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_HUB_CARD_DEPOSIT_BOOST;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_HUB_CARD_SWEEP_ACTIVE", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_HUB_CARD_SWEEP_ACTIVE extends EntryPointDto {
            GOLD_HUB_CARD_SWEEP_ACTIVE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_HUB_CARD_SWEEP_ACTIVE;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_HUB_CARD_INSTANT", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_HUB_CARD_INSTANT extends EntryPointDto {
            GOLD_HUB_CARD_INSTANT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_HUB_CARD_INSTANT;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_HUB_FEATURE_SWEEP_JOINT_ACTIVE", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_HUB_FEATURE_SWEEP_JOINT_ACTIVE extends EntryPointDto {
            GOLD_HUB_FEATURE_SWEEP_JOINT_ACTIVE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_HUB_FEATURE_SWEEP_JOINT_ACTIVE;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_HUB_FEATURE_DEPOSIT_BOOST", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_HUB_FEATURE_DEPOSIT_BOOST extends EntryPointDto {
            GOLD_HUB_FEATURE_DEPOSIT_BOOST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_HUB_FEATURE_DEPOSIT_BOOST;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.DEPOSIT_BOOST_HUB_DEFICIT_BANNER", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEPOSIT_BOOST_HUB_DEFICIT_BANNER extends EntryPointDto {
            DEPOSIT_BOOST_HUB_DEFICIT_BANNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.DEPOSIT_BOOST_HUB_DEFICIT_BANNER;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.DEPOSIT_BOOST_HUB_CTA", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEPOSIT_BOOST_HUB_CTA extends EntryPointDto {
            DEPOSIT_BOOST_HUB_CTA(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.DEPOSIT_BOOST_HUB_CTA;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.DEPOSIT_BOOST_EDUCATION_MODAL", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEPOSIT_BOOST_EDUCATION_MODAL extends EntryPointDto {
            DEPOSIT_BOOST_EDUCATION_MODAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.DEPOSIT_BOOST_EDUCATION_MODAL;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.PATHFINDER_ACCOUNT_CLOSURE_IRA", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PATHFINDER_ACCOUNT_CLOSURE_IRA extends EntryPointDto {
            PATHFINDER_ACCOUNT_CLOSURE_IRA(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.PATHFINDER_ACCOUNT_CLOSURE_IRA;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.PATHFINDER_ACCOUNT_CLOSURE", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PATHFINDER_ACCOUNT_CLOSURE extends EntryPointDto {
            PATHFINDER_ACCOUNT_CLOSURE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.PATHFINDER_ACCOUNT_CLOSURE;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.PDT_DEPOSIT_FUNDS", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PDT_DEPOSIT_FUNDS extends EntryPointDto {
            PDT_DEPOSIT_FUNDS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.PDT_DEPOSIT_FUNDS;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.DEBIT_CARD_LINKING_SUCCESS", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEBIT_CARD_LINKING_SUCCESS extends EntryPointDto {
            DEBIT_CARD_LINKING_SUCCESS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.DEBIT_CARD_LINKING_SUCCESS;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.TRANSFER_MONEY_FORM", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRANSFER_MONEY_FORM extends EntryPointDto {
            TRANSFER_MONEY_FORM(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.TRANSFER_MONEY_FORM;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.IRA_TRANSFER_FORM", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IRA_TRANSFER_FORM extends EntryPointDto {
            IRA_TRANSFER_FORM(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.IRA_TRANSFER_FORM;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.RETIREMENT_CONTRIBUTION_CARD", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RETIREMENT_CONTRIBUTION_CARD extends EntryPointDto {
            RETIREMENT_CONTRIBUTION_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.RETIREMENT_CONTRIBUTION_CARD;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.MENU_OF_OPTIONS_JOINT_ACCOUNT", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MENU_OF_OPTIONS_JOINT_ACCOUNT extends EntryPointDto {
            MENU_OF_OPTIONS_JOINT_ACCOUNT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.MENU_OF_OPTIONS_JOINT_ACCOUNT;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_SWEEP_HUB", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_SWEEP_HUB extends EntryPointDto {
            GOLD_SWEEP_HUB(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_SWEEP_HUB;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.NOT_ENOUGH_BUYING_POWER", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NOT_ENOUGH_BUYING_POWER extends EntryPointDto {
            NOT_ENOUGH_BUYING_POWER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.NOT_ENOUGH_BUYING_POWER;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.EQUITY_DAY_TRADE_REASON_PDT", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EQUITY_DAY_TRADE_REASON_PDT extends EntryPointDto {
            EQUITY_DAY_TRADE_REASON_PDT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.EQUITY_DAY_TRADE_REASON_PDT;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.PATHFINDER_SASSY_DEPOSIT_ABOVE_MARGIN_MAINTENANCE", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PATHFINDER_SASSY_DEPOSIT_ABOVE_MARGIN_MAINTENANCE extends EntryPointDto {
            PATHFINDER_SASSY_DEPOSIT_ABOVE_MARGIN_MAINTENANCE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.PATHFINDER_SASSY_DEPOSIT_ABOVE_MARGIN_MAINTENANCE;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.MARGIN_SETTINGS", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MARGIN_SETTINGS extends EntryPointDto {
            MARGIN_SETTINGS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.MARGIN_SETTINGS;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.JOINT_ACCOUNT_FUNDING_METHODS", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class JOINT_ACCOUNT_FUNDING_METHODS extends EntryPointDto {
            JOINT_ACCOUNT_FUNDING_METHODS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.JOINT_ACCOUNT_FUNDING_METHODS;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.MAINTENANCE_CALL_WITH_FUTURES", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MAINTENANCE_CALL_WITH_FUTURES extends EntryPointDto {
            MAINTENANCE_CALL_WITH_FUTURES(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.MAINTENANCE_CALL_WITH_FUTURES;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.BLACK_WIDOW", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BLACK_WIDOW extends EntryPointDto {
            BLACK_WIDOW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.BLACK_WIDOW;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.ONE_PERCENT_MAX_AWARENESS_BOTTOMSHEET", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ONE_PERCENT_MAX_AWARENESS_BOTTOMSHEET extends EntryPointDto {
            ONE_PERCENT_MAX_AWARENESS_BOTTOMSHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.ONE_PERCENT_MAX_AWARENESS_BOTTOMSHEET;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_SWEEP_SPLASH_DEPOSIT_ROW", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_SWEEP_SPLASH_DEPOSIT_ROW extends EntryPointDto {
            GOLD_SWEEP_SPLASH_DEPOSIT_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_SWEEP_SPLASH_DEPOSIT_ROW;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.CREDIT_CARD_APP", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CREDIT_CARD_APP extends EntryPointDto {
            CREDIT_CARD_APP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.CREDIT_CARD_APP;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.CREDIT_CARD_APP_BOOSTED_CASH_BACK", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CREDIT_CARD_APP_BOOSTED_CASH_BACK extends EntryPointDto {
            CREDIT_CARD_APP_BOOSTED_CASH_BACK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.CREDIT_CARD_APP_BOOSTED_CASH_BACK;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_BOOSTED_APY_TRANSFER_HUB", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_BOOSTED_APY_TRANSFER_HUB extends EntryPointDto {
            GOLD_BOOSTED_APY_TRANSFER_HUB(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_BOOSTED_APY_TRANSFER_HUB;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_DOWNGRADE_PREVENTION", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_DOWNGRADE_PREVENTION extends EntryPointDto {
            GOLD_DOWNGRADE_PREVENTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_DOWNGRADE_PREVENTION;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.CREDIT_CARD_APP_AUC_CLI", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CREDIT_CARD_APP_AUC_CLI extends EntryPointDto {
            CREDIT_CARD_APP_AUC_CLI(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.CREDIT_CARD_APP_AUC_CLI;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.INCENTIVE_PRE_DEPOSIT", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INCENTIVE_PRE_DEPOSIT extends EntryPointDto {
            INCENTIVE_PRE_DEPOSIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.INCENTIVE_PRE_DEPOSIT;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.INCENTIVE_POST_DEPOSIT", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INCENTIVE_POST_DEPOSIT extends EntryPointDto {
            INCENTIVE_POST_DEPOSIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.INCENTIVE_POST_DEPOSIT;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.LEGEND_EQUITY_TRADING_FLOW", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LEGEND_EQUITY_TRADING_FLOW extends EntryPointDto {
            LEGEND_EQUITY_TRADING_FLOW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.LEGEND_EQUITY_TRADING_FLOW;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.LEGEND_OPTIONS_TRADING_FLOW", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LEGEND_OPTIONS_TRADING_FLOW extends EntryPointDto {
            LEGEND_OPTIONS_TRADING_FLOW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.LEGEND_OPTIONS_TRADING_FLOW;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.LEGEND_CRYPTO_TRADING_FLOW", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LEGEND_CRYPTO_TRADING_FLOW extends EntryPointDto {
            LEGEND_CRYPTO_TRADING_FLOW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.LEGEND_CRYPTO_TRADING_FLOW;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.LEGEND_SIDEBAR_DEPOSIT", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LEGEND_SIDEBAR_DEPOSIT extends EntryPointDto {
            LEGEND_SIDEBAR_DEPOSIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.LEGEND_SIDEBAR_DEPOSIT;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.LEGEND_SIDEBAR_TRANSFERS", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LEGEND_SIDEBAR_TRANSFERS extends EntryPointDto {
            LEGEND_SIDEBAR_TRANSFERS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.LEGEND_SIDEBAR_TRANSFERS;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.LEGEND_ACCOUNT_WIDGET", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LEGEND_ACCOUNT_WIDGET extends EntryPointDto {
            LEGEND_ACCOUNT_WIDGET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.LEGEND_ACCOUNT_WIDGET;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.ADVISORY_DASHBOARD_DEPOSIT_BUTTON", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class ADVISORY_DASHBOARD_DEPOSIT_BUTTON extends EntryPointDto {
            ADVISORY_DASHBOARD_DEPOSIT_BUTTON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.ADVISORY_DASHBOARD_DEPOSIT_BUTTON;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.CREDIT_CARD_APP_PREMIUM_CREDIT_LIMITS", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class CREDIT_CARD_APP_PREMIUM_CREDIT_LIMITS extends EntryPointDto {
            CREDIT_CARD_APP_PREMIUM_CREDIT_LIMITS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.CREDIT_CARD_APP_PREMIUM_CREDIT_LIMITS;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.ADVISORY_DASHBOARD_RECURRING_DEPOSIT_BUTTON", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class ADVISORY_DASHBOARD_RECURRING_DEPOSIT_BUTTON extends EntryPointDto {
            ADVISORY_DASHBOARD_RECURRING_DEPOSIT_BUTTON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.ADVISORY_DASHBOARD_RECURRING_DEPOSIT_BUTTON;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.ROTH_CONVERSION", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class ROTH_CONVERSION extends EntryPointDto {
            ROTH_CONVERSION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.ROTH_CONVERSION;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_WELCOME_NATIVE", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class GOLD_WELCOME_NATIVE extends EntryPointDto {
            GOLD_WELCOME_NATIVE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_WELCOME_NATIVE;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.CRYPTO_ORDER_CHECK", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class CRYPTO_ORDER_CHECK extends EntryPointDto {
            CRYPTO_ORDER_CHECK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.CRYPTO_ORDER_CHECK;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.EQUITY_ORDER_CHECK", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class EQUITY_ORDER_CHECK extends EntryPointDto {
            EQUITY_ORDER_CHECK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.EQUITY_ORDER_CHECK;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.FUTURES_ORDER_CHECK", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class FUTURES_ORDER_CHECK extends EntryPointDto {
            FUTURES_ORDER_CHECK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.FUTURES_ORDER_CHECK;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.OPTIONS_ORDER_CHECK", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class OPTIONS_ORDER_CHECK extends EntryPointDto {
            OPTIONS_ORDER_CHECK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.OPTIONS_ORDER_CHECK;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.GOLD_BOOSTED_APY_REWARD_CENTER_OFFER", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class GOLD_BOOSTED_APY_REWARD_CENTER_OFFER extends EntryPointDto {
            GOLD_BOOSTED_APY_REWARD_CENTER_OFFER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.GOLD_BOOSTED_APY_REWARD_CENTER_OFFER;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.MANAGED_ACCOUNT_ONBOARDING_FLOW", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class MANAGED_ACCOUNT_ONBOARDING_FLOW extends EntryPointDto {
            MANAGED_ACCOUNT_ONBOARDING_FLOW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.MANAGED_ACCOUNT_ONBOARDING_FLOW;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.ADVISORY_FUTURE_PROJECTION", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class ADVISORY_FUTURE_PROJECTION extends EntryPointDto {
            ADVISORY_FUTURE_PROJECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.ADVISORY_FUTURE_PROJECTION;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.BROKERAGE_ACCOUNT_OVERVIEW", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class BROKERAGE_ACCOUNT_OVERVIEW extends EntryPointDto {
            BROKERAGE_ACCOUNT_OVERVIEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.BROKERAGE_ACCOUNT_OVERVIEW;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.TRANSFER_HUB_DEPOSIT", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class TRANSFER_HUB_DEPOSIT extends EntryPointDto {
            TRANSFER_HUB_DEPOSIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.TRANSFER_HUB_DEPOSIT;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.TRANSFER_HUB_WITHDRAW", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class TRANSFER_HUB_WITHDRAW extends EntryPointDto {
            TRANSFER_HUB_WITHDRAW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.TRANSFER_HUB_WITHDRAW;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.LEGEND_FUTURES_TRADING_FLOW", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class LEGEND_FUTURES_TRADING_FLOW extends EntryPointDto {
            LEGEND_FUTURES_TRADING_FLOW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.LEGEND_FUTURES_TRADING_FLOW;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.INDIVIDUAL_ACCOUNT_ONBOARDING_FLOW", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class INDIVIDUAL_ACCOUNT_ONBOARDING_FLOW extends EntryPointDto {
            INDIVIDUAL_ACCOUNT_ONBOARDING_FLOW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.INDIVIDUAL_ACCOUNT_ONBOARDING_FLOW;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.INDIVIDUAL_ACCOUNT_NUX_FLOW", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class INDIVIDUAL_ACCOUNT_NUX_FLOW extends EntryPointDto {
            INDIVIDUAL_ACCOUNT_NUX_FLOW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.INDIVIDUAL_ACCOUNT_NUX_FLOW;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.SHORT_SELL_ENABLEMENT", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class SHORT_SELL_ENABLEMENT extends EntryPointDto {
            SHORT_SELL_ENABLEMENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.SHORT_SELL_ENABLEMENT;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.CUSTODIAL_ACCOUNT_ONBOARDING_FLOW", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class CUSTODIAL_ACCOUNT_ONBOARDING_FLOW extends EntryPointDto {
            CUSTODIAL_ACCOUNT_ONBOARDING_FLOW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.CUSTODIAL_ACCOUNT_ONBOARDING_FLOW;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.CUSTODIAL_ACCOUNT_NUX_FLOW", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class CUSTODIAL_ACCOUNT_NUX_FLOW extends EntryPointDto {
            CUSTODIAL_ACCOUNT_NUX_FLOW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.CUSTODIAL_ACCOUNT_NUX_FLOW;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.MARGIN_ONBOARDING", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class MARGIN_ONBOARDING extends EntryPointDto {
            MARGIN_ONBOARDING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.MARGIN_ONBOARDING;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.STRATEGIES_AUTO_SELECT", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class STRATEGIES_AUTO_SELECT extends EntryPointDto {
            STRATEGIES_AUTO_SELECT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.STRATEGIES_AUTO_SELECT;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.ISA_CONTRIBUTION", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class ISA_CONTRIBUTION extends EntryPointDto {
            ISA_CONTRIBUTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.ISA_CONTRIBUTION;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.EVENT_CONTRACTS_ORDER_CHECK", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class EVENT_CONTRACTS_ORDER_CHECK extends EntryPointDto {
            EVENT_CONTRACTS_ORDER_CHECK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.EVENT_CONTRACTS_ORDER_CHECK;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.DIRECT_IPO_ORDER_CHECK", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class DIRECT_IPO_ORDER_CHECK extends EntryPointDto {
            DIRECT_IPO_ORDER_CHECK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.DIRECT_IPO_ORDER_CHECK;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.EntryPointDto.INDIVIDUAL_ACCOUNT_DASHBOARD_FOOTER", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class INDIVIDUAL_ACCOUNT_DASHBOARD_FOOTER extends EntryPointDto {
            INDIVIDUAL_ACCOUNT_DASHBOARD_FOOTER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.EntryPoint toProto() {
                return MAXTransferContext.EntryPoint.INDIVIDUAL_ACCOUNT_DASHBOARD_FOOTER;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EntryPointDto, MAXTransferContext.EntryPoint> {

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[MAXTransferContext.EntryPoint.values().length];
                    try {
                        iArr[MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.FTR_DCF_LINKING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.MAINTENANCE_CALL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.MAINTENANCE_CALL_WARNING.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.DAY_TRADE_CALL.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.TRANSFER_HUB.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.RECURRING_TRANSFER_HUB.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.SPENDING_HOME.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.SPENDING_HOME_WITH_ACTION_BAR.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.RHY_RECURRING_MARKETING_PUSH.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.RHY_RECURRING_MARKETING_EMAIL.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.RHY_RECURRING_MARKETING_INBOX.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.RHS_RECURRING_UPSELL.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.RHY_RECURRING_UPSELL.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.BUYING_POWER_BREAKDOWN.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.MARGIN_HUB.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.SPENDING_INCENTIVE.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.OPTIONS_TRADING_FLOW.ordinal()] = 18;
                    } catch (NoSuchFieldError unused18) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.EQUITIES_TRADING_FLOW.ordinal()] = 19;
                    } catch (NoSuchFieldError unused19) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.INVEST_FLOW.ordinal()] = 20;
                    } catch (NoSuchFieldError unused20) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.RETIREMENT_CONTRIBUTION_HUB.ordinal()] = 21;
                    } catch (NoSuchFieldError unused21) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.RETIREMENT_UNFUNDED_DASHBOARD.ordinal()] = 22;
                    } catch (NoSuchFieldError unused22) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.BUYING_POWER_DETAIL.ordinal()] = 23;
                    } catch (NoSuchFieldError unused23) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.RETIREMENT_FUNDING_METHODS.ordinal()] = 24;
                    } catch (NoSuchFieldError unused24) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.EQUITY_ORDER_CONFIRMATION_FUNDING_UPSELL.ordinal()] = 25;
                    } catch (NoSuchFieldError unused25) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.CRYPTO_ORDER_CONFIRMATION_FUNDING_UPSELL.ordinal()] = 26;
                    } catch (NoSuchFieldError unused26) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.RETIREMENT_FUNDED_DASHBOARD.ordinal()] = 27;
                    } catch (NoSuchFieldError unused27) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.P2P_PAY_FLOW.ordinal()] = 28;
                    } catch (NoSuchFieldError unused28) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.LINK_DEBIT_CARD.ordinal()] = 29;
                    } catch (NoSuchFieldError unused29) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.MENU_OF_OPTIONS.ordinal()] = 30;
                    } catch (NoSuchFieldError unused30) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_SETTINGS.ordinal()] = 31;
                    } catch (NoSuchFieldError unused31) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_WELCOME.ordinal()] = 32;
                    } catch (NoSuchFieldError unused32) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.RETIREMENT_GOLD_MATCH_PROMO.ordinal()] = 33;
                    } catch (NoSuchFieldError unused33) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_RET_PROMO_BOTTOM_SHEET.ordinal()] = 34;
                    } catch (NoSuchFieldError unused34) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.POST_TRADE_FLOW_PDT.ordinal()] = 35;
                    } catch (NoSuchFieldError unused35) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.RETIREMENT_UNFUNDED_LEARN_AND_EARN_EDUCATION_LESSON.ordinal()] = 36;
                    } catch (NoSuchFieldError unused36) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.RFP_DECLINED_INBOX.ordinal()] = 37;
                    } catch (NoSuchFieldError unused37) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.RFP_DECLINED_EMAIL.ordinal()] = 38;
                    } catch (NoSuchFieldError unused38) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.RFP_EXPIRED_INBOX.ordinal()] = 39;
                    } catch (NoSuchFieldError unused39) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.RFP_EXPIRED_EMAIL.ordinal()] = 40;
                    } catch (NoSuchFieldError unused40) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.RFP_FAILED_INBOX.ordinal()] = 41;
                    } catch (NoSuchFieldError unused41) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.RFP_FAILED_EMAIL.ordinal()] = 42;
                    } catch (NoSuchFieldError unused42) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.RECOMMENDATIONS_FOR_RETIREMENT.ordinal()] = 43;
                    } catch (NoSuchFieldError unused43) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.OUTGOING_WIRE.ordinal()] = 44;
                    } catch (NoSuchFieldError unused44) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.RECURRING_DEPOSIT_UPSELL.ordinal()] = 45;
                    } catch (NoSuchFieldError unused45) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.FEATURE_DISCOVERY.ordinal()] = 46;
                    } catch (NoSuchFieldError unused46) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.CARD.ordinal()] = 47;
                    } catch (NoSuchFieldError unused47) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_BOOSTED_APY_FEATURE_DISCOVERY.ordinal()] = 48;
                    } catch (NoSuchFieldError unused48) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_BOOSTED_APY_CARD.ordinal()] = 49;
                    } catch (NoSuchFieldError unused49) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_BOOSTED_APY_ACCOUNT_BANNER.ordinal()] = 50;
                    } catch (NoSuchFieldError unused50) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_BOOSTED_APY_BOTTOM_SHEET.ordinal()] = 51;
                    } catch (NoSuchFieldError unused51) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_BOOSTED_APY_CASH_SECTION.ordinal()] = 52;
                    } catch (NoSuchFieldError unused52) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_BOOSTED_APY_EMAIL.ordinal()] = 53;
                    } catch (NoSuchFieldError unused53) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_BOOSTED_APY_PUSH.ordinal()] = 54;
                    } catch (NoSuchFieldError unused54) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.RESURRECTIONS_M2_UPSELL.ordinal()] = 55;
                    } catch (NoSuchFieldError unused55) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_RETIREMENT_TAX_SEASON_ACCOUNT_BANNER.ordinal()] = 56;
                    } catch (NoSuchFieldError unused56) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.M3A_CHURNED_ZERO_VARIANT1.ordinal()] = 57;
                    } catch (NoSuchFieldError unused57) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.M3A_CHURNED_ZERO_VARIANT2.ordinal()] = 58;
                    } catch (NoSuchFieldError unused58) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.M3B_INACTIVE_VARIANT1.ordinal()] = 59;
                    } catch (NoSuchFieldError unused59) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.M3B_INACTIVE_VARIANT2.ordinal()] = 60;
                    } catch (NoSuchFieldError unused60) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_OPT_IN_UPGRADE_WELCOME.ordinal()] = 61;
                    } catch (NoSuchFieldError unused61) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.AUC_APY_AUTO_BOOST_ALERT_SHEET.ordinal()] = 62;
                    } catch (NoSuchFieldError unused62) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.NUX_CHECKLIST.ordinal()] = 63;
                    } catch (NoSuchFieldError unused63) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.RETIREMENT_SETTINGS.ordinal()] = 64;
                    } catch (NoSuchFieldError unused64) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.DISABLE_MARGIN_FAILURE.ordinal()] = 65;
                    } catch (NoSuchFieldError unused65) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.INSTANT_DEPOSITS_CARD.ordinal()] = 66;
                    } catch (NoSuchFieldError unused66) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.SWEEP_ONBOARDING.ordinal()] = 67;
                    } catch (NoSuchFieldError unused67) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_WELCOME_DEPOSIT_HOOK.ordinal()] = 68;
                    } catch (NoSuchFieldError unused68) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.SWEEP_HUB.ordinal()] = 69;
                    } catch (NoSuchFieldError unused69) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.WATCHLIST_SWEEP_SECTION.ordinal()] = 70;
                    } catch (NoSuchFieldError unused70) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_DEPOSIT_BOOST_EDUCATION.ordinal()] = 71;
                    } catch (NoSuchFieldError unused71) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.PATHFINDER_RHY_DEACTIVATION.ordinal()] = 72;
                    } catch (NoSuchFieldError unused72) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.PATHFINDER_RHS_DEACTIVATION.ordinal()] = 73;
                    } catch (NoSuchFieldError unused73) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_HUB_TRACKER_SWEEP.ordinal()] = 74;
                    } catch (NoSuchFieldError unused74) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_HUB_CARD_DEPOSIT_BOOST.ordinal()] = 75;
                    } catch (NoSuchFieldError unused75) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_HUB_CARD_SWEEP_ACTIVE.ordinal()] = 76;
                    } catch (NoSuchFieldError unused76) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_HUB_CARD_INSTANT.ordinal()] = 77;
                    } catch (NoSuchFieldError unused77) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_HUB_FEATURE_SWEEP_JOINT_ACTIVE.ordinal()] = 78;
                    } catch (NoSuchFieldError unused78) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_HUB_FEATURE_DEPOSIT_BOOST.ordinal()] = 79;
                    } catch (NoSuchFieldError unused79) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.DEPOSIT_BOOST_HUB_DEFICIT_BANNER.ordinal()] = 80;
                    } catch (NoSuchFieldError unused80) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.DEPOSIT_BOOST_HUB_CTA.ordinal()] = 81;
                    } catch (NoSuchFieldError unused81) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.DEPOSIT_BOOST_EDUCATION_MODAL.ordinal()] = 82;
                    } catch (NoSuchFieldError unused82) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.PATHFINDER_ACCOUNT_CLOSURE_IRA.ordinal()] = 83;
                    } catch (NoSuchFieldError unused83) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.PATHFINDER_ACCOUNT_CLOSURE.ordinal()] = 84;
                    } catch (NoSuchFieldError unused84) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.PDT_DEPOSIT_FUNDS.ordinal()] = 85;
                    } catch (NoSuchFieldError unused85) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.DEBIT_CARD_LINKING_SUCCESS.ordinal()] = 86;
                    } catch (NoSuchFieldError unused86) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.TRANSFER_MONEY_FORM.ordinal()] = 87;
                    } catch (NoSuchFieldError unused87) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.IRA_TRANSFER_FORM.ordinal()] = 88;
                    } catch (NoSuchFieldError unused88) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.RETIREMENT_CONTRIBUTION_CARD.ordinal()] = 89;
                    } catch (NoSuchFieldError unused89) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.MENU_OF_OPTIONS_JOINT_ACCOUNT.ordinal()] = 90;
                    } catch (NoSuchFieldError unused90) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_SWEEP_HUB.ordinal()] = 91;
                    } catch (NoSuchFieldError unused91) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.NOT_ENOUGH_BUYING_POWER.ordinal()] = 92;
                    } catch (NoSuchFieldError unused92) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.EQUITY_DAY_TRADE_REASON_PDT.ordinal()] = 93;
                    } catch (NoSuchFieldError unused93) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.PATHFINDER_SASSY_DEPOSIT_ABOVE_MARGIN_MAINTENANCE.ordinal()] = 94;
                    } catch (NoSuchFieldError unused94) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.MARGIN_SETTINGS.ordinal()] = 95;
                    } catch (NoSuchFieldError unused95) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.JOINT_ACCOUNT_FUNDING_METHODS.ordinal()] = 96;
                    } catch (NoSuchFieldError unused96) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.MAINTENANCE_CALL_WITH_FUTURES.ordinal()] = 97;
                    } catch (NoSuchFieldError unused97) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.BLACK_WIDOW.ordinal()] = 98;
                    } catch (NoSuchFieldError unused98) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.ONE_PERCENT_MAX_AWARENESS_BOTTOMSHEET.ordinal()] = 99;
                    } catch (NoSuchFieldError unused99) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_SWEEP_SPLASH_DEPOSIT_ROW.ordinal()] = 100;
                    } catch (NoSuchFieldError unused100) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.CREDIT_CARD_APP.ordinal()] = 101;
                    } catch (NoSuchFieldError unused101) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.CREDIT_CARD_APP_BOOSTED_CASH_BACK.ordinal()] = 102;
                    } catch (NoSuchFieldError unused102) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_BOOSTED_APY_TRANSFER_HUB.ordinal()] = 103;
                    } catch (NoSuchFieldError unused103) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_DOWNGRADE_PREVENTION.ordinal()] = 104;
                    } catch (NoSuchFieldError unused104) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.CREDIT_CARD_APP_AUC_CLI.ordinal()] = 105;
                    } catch (NoSuchFieldError unused105) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.INCENTIVE_PRE_DEPOSIT.ordinal()] = 106;
                    } catch (NoSuchFieldError unused106) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.INCENTIVE_POST_DEPOSIT.ordinal()] = 107;
                    } catch (NoSuchFieldError unused107) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.LEGEND_EQUITY_TRADING_FLOW.ordinal()] = 108;
                    } catch (NoSuchFieldError unused108) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.LEGEND_OPTIONS_TRADING_FLOW.ordinal()] = 109;
                    } catch (NoSuchFieldError unused109) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.LEGEND_CRYPTO_TRADING_FLOW.ordinal()] = 110;
                    } catch (NoSuchFieldError unused110) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.LEGEND_SIDEBAR_DEPOSIT.ordinal()] = 111;
                    } catch (NoSuchFieldError unused111) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.LEGEND_SIDEBAR_TRANSFERS.ordinal()] = 112;
                    } catch (NoSuchFieldError unused112) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.LEGEND_ACCOUNT_WIDGET.ordinal()] = 113;
                    } catch (NoSuchFieldError unused113) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.ADVISORY_DASHBOARD_DEPOSIT_BUTTON.ordinal()] = 114;
                    } catch (NoSuchFieldError unused114) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.CREDIT_CARD_APP_PREMIUM_CREDIT_LIMITS.ordinal()] = 115;
                    } catch (NoSuchFieldError unused115) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.ADVISORY_DASHBOARD_RECURRING_DEPOSIT_BUTTON.ordinal()] = 116;
                    } catch (NoSuchFieldError unused116) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.ROTH_CONVERSION.ordinal()] = 117;
                    } catch (NoSuchFieldError unused117) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_WELCOME_NATIVE.ordinal()] = 118;
                    } catch (NoSuchFieldError unused118) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.CRYPTO_ORDER_CHECK.ordinal()] = 119;
                    } catch (NoSuchFieldError unused119) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.EQUITY_ORDER_CHECK.ordinal()] = 120;
                    } catch (NoSuchFieldError unused120) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.FUTURES_ORDER_CHECK.ordinal()] = 121;
                    } catch (NoSuchFieldError unused121) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.OPTIONS_ORDER_CHECK.ordinal()] = 122;
                    } catch (NoSuchFieldError unused122) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.GOLD_BOOSTED_APY_REWARD_CENTER_OFFER.ordinal()] = 123;
                    } catch (NoSuchFieldError unused123) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.MANAGED_ACCOUNT_ONBOARDING_FLOW.ordinal()] = 124;
                    } catch (NoSuchFieldError unused124) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.ADVISORY_FUTURE_PROJECTION.ordinal()] = 125;
                    } catch (NoSuchFieldError unused125) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.BROKERAGE_ACCOUNT_OVERVIEW.ordinal()] = 126;
                    } catch (NoSuchFieldError unused126) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.TRANSFER_HUB_DEPOSIT.ordinal()] = 127;
                    } catch (NoSuchFieldError unused127) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.TRANSFER_HUB_WITHDRAW.ordinal()] = 128;
                    } catch (NoSuchFieldError unused128) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.LEGEND_FUTURES_TRADING_FLOW.ordinal()] = 129;
                    } catch (NoSuchFieldError unused129) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.INDIVIDUAL_ACCOUNT_ONBOARDING_FLOW.ordinal()] = 130;
                    } catch (NoSuchFieldError unused130) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.INDIVIDUAL_ACCOUNT_NUX_FLOW.ordinal()] = 131;
                    } catch (NoSuchFieldError unused131) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.SHORT_SELL_ENABLEMENT.ordinal()] = 132;
                    } catch (NoSuchFieldError unused132) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.CUSTODIAL_ACCOUNT_ONBOARDING_FLOW.ordinal()] = 133;
                    } catch (NoSuchFieldError unused133) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.CUSTODIAL_ACCOUNT_NUX_FLOW.ordinal()] = 134;
                    } catch (NoSuchFieldError unused134) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.MARGIN_ONBOARDING.ordinal()] = 135;
                    } catch (NoSuchFieldError unused135) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.STRATEGIES_AUTO_SELECT.ordinal()] = 136;
                    } catch (NoSuchFieldError unused136) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.ISA_CONTRIBUTION.ordinal()] = 137;
                    } catch (NoSuchFieldError unused137) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.EVENT_CONTRACTS_ORDER_CHECK.ordinal()] = 138;
                    } catch (NoSuchFieldError unused138) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.DIRECT_IPO_ORDER_CHECK.ordinal()] = 139;
                    } catch (NoSuchFieldError unused139) {
                    }
                    try {
                        iArr[MAXTransferContext.EntryPoint.INDIVIDUAL_ACCOUNT_DASHBOARD_FOOTER.ordinal()] = 140;
                    } catch (NoSuchFieldError unused140) {
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
            public ProtoAdapter<MAXTransferContext.EntryPoint> getProtoAdapter() {
                return MAXTransferContext.EntryPoint.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryPointDto getZeroValue() {
                return EntryPointDto.ENTRY_POINT_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryPointDto fromProto(MAXTransferContext.EntryPoint proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return EntryPointDto.ENTRY_POINT_UNSPECIFIED;
                    case 2:
                        return EntryPointDto.FTR_DCF_LINKING;
                    case 3:
                        return EntryPointDto.MAINTENANCE_CALL;
                    case 4:
                        return EntryPointDto.MAINTENANCE_CALL_WARNING;
                    case 5:
                        return EntryPointDto.DAY_TRADE_CALL;
                    case 6:
                        return EntryPointDto.TRANSFER_HUB;
                    case 7:
                        return EntryPointDto.RECURRING_TRANSFER_HUB;
                    case 8:
                        return EntryPointDto.SPENDING_HOME;
                    case 9:
                        return EntryPointDto.SPENDING_HOME_WITH_ACTION_BAR;
                    case 10:
                        return EntryPointDto.RHY_RECURRING_MARKETING_PUSH;
                    case 11:
                        return EntryPointDto.RHY_RECURRING_MARKETING_EMAIL;
                    case 12:
                        return EntryPointDto.RHY_RECURRING_MARKETING_INBOX;
                    case 13:
                        return EntryPointDto.RHS_RECURRING_UPSELL;
                    case 14:
                        return EntryPointDto.RHY_RECURRING_UPSELL;
                    case 15:
                        return EntryPointDto.BUYING_POWER_BREAKDOWN;
                    case 16:
                        return EntryPointDto.MARGIN_HUB;
                    case 17:
                        return EntryPointDto.SPENDING_INCENTIVE;
                    case 18:
                        return EntryPointDto.OPTIONS_TRADING_FLOW;
                    case 19:
                        return EntryPointDto.EQUITIES_TRADING_FLOW;
                    case 20:
                        return EntryPointDto.INVEST_FLOW;
                    case 21:
                        return EntryPointDto.RETIREMENT_CONTRIBUTION_HUB;
                    case 22:
                        return EntryPointDto.RETIREMENT_UNFUNDED_DASHBOARD;
                    case 23:
                        return EntryPointDto.BUYING_POWER_DETAIL;
                    case 24:
                        return EntryPointDto.RETIREMENT_FUNDING_METHODS;
                    case 25:
                        return EntryPointDto.EQUITY_ORDER_CONFIRMATION_FUNDING_UPSELL;
                    case 26:
                        return EntryPointDto.CRYPTO_ORDER_CONFIRMATION_FUNDING_UPSELL;
                    case 27:
                        return EntryPointDto.RETIREMENT_FUNDED_DASHBOARD;
                    case 28:
                        return EntryPointDto.P2P_PAY_FLOW;
                    case 29:
                        return EntryPointDto.LINK_DEBIT_CARD;
                    case 30:
                        return EntryPointDto.MENU_OF_OPTIONS;
                    case 31:
                        return EntryPointDto.GOLD_SETTINGS;
                    case 32:
                        return EntryPointDto.GOLD_WELCOME;
                    case 33:
                        return EntryPointDto.RETIREMENT_GOLD_MATCH_PROMO;
                    case 34:
                        return EntryPointDto.GOLD_RET_PROMO_BOTTOM_SHEET;
                    case 35:
                        return EntryPointDto.POST_TRADE_FLOW_PDT;
                    case 36:
                        return EntryPointDto.RETIREMENT_UNFUNDED_LEARN_AND_EARN_EDUCATION_LESSON;
                    case 37:
                        return EntryPointDto.RFP_DECLINED_INBOX;
                    case 38:
                        return EntryPointDto.RFP_DECLINED_EMAIL;
                    case 39:
                        return EntryPointDto.RFP_EXPIRED_INBOX;
                    case 40:
                        return EntryPointDto.RFP_EXPIRED_EMAIL;
                    case 41:
                        return EntryPointDto.RFP_FAILED_INBOX;
                    case 42:
                        return EntryPointDto.RFP_FAILED_EMAIL;
                    case 43:
                        return EntryPointDto.RECOMMENDATIONS_FOR_RETIREMENT;
                    case 44:
                        return EntryPointDto.OUTGOING_WIRE;
                    case 45:
                        return EntryPointDto.RECURRING_DEPOSIT_UPSELL;
                    case 46:
                        return EntryPointDto.FEATURE_DISCOVERY;
                    case 47:
                        return EntryPointDto.CARD;
                    case 48:
                        return EntryPointDto.GOLD_BOOSTED_APY_FEATURE_DISCOVERY;
                    case 49:
                        return EntryPointDto.GOLD_BOOSTED_APY_CARD;
                    case 50:
                        return EntryPointDto.GOLD_BOOSTED_APY_ACCOUNT_BANNER;
                    case 51:
                        return EntryPointDto.GOLD_BOOSTED_APY_BOTTOM_SHEET;
                    case 52:
                        return EntryPointDto.GOLD_BOOSTED_APY_CASH_SECTION;
                    case 53:
                        return EntryPointDto.GOLD_BOOSTED_APY_EMAIL;
                    case 54:
                        return EntryPointDto.GOLD_BOOSTED_APY_PUSH;
                    case 55:
                        return EntryPointDto.RESURRECTIONS_M2_UPSELL;
                    case 56:
                        return EntryPointDto.GOLD_RETIREMENT_TAX_SEASON_ACCOUNT_BANNER;
                    case 57:
                        return EntryPointDto.M3A_CHURNED_ZERO_VARIANT1;
                    case 58:
                        return EntryPointDto.M3A_CHURNED_ZERO_VARIANT2;
                    case 59:
                        return EntryPointDto.M3B_INACTIVE_VARIANT1;
                    case 60:
                        return EntryPointDto.M3B_INACTIVE_VARIANT2;
                    case 61:
                        return EntryPointDto.GOLD_OPT_IN_UPGRADE_WELCOME;
                    case 62:
                        return EntryPointDto.AUC_APY_AUTO_BOOST_ALERT_SHEET;
                    case 63:
                        return EntryPointDto.NUX_CHECKLIST;
                    case 64:
                        return EntryPointDto.RETIREMENT_SETTINGS;
                    case 65:
                        return EntryPointDto.DISABLE_MARGIN_FAILURE;
                    case 66:
                        return EntryPointDto.INSTANT_DEPOSITS_CARD;
                    case 67:
                        return EntryPointDto.SWEEP_ONBOARDING;
                    case SDK_ASSET_ICON_HOME_VALUE:
                        return EntryPointDto.GOLD_WELCOME_DEPOSIT_HOOK;
                    case 69:
                        return EntryPointDto.SWEEP_HUB;
                    case 70:
                        return EntryPointDto.WATCHLIST_SWEEP_SECTION;
                    case SDK_ASSET_ICON_GUIDE_VALUE:
                        return EntryPointDto.GOLD_DEPOSIT_BOOST_EDUCATION;
                    case SDK_ASSET_ICON_GLOBE_VALUE:
                        return EntryPointDto.PATHFINDER_RHY_DEACTIVATION;
                    case 73:
                        return EntryPointDto.PATHFINDER_RHS_DEACTIVATION;
                    case 74:
                        return EntryPointDto.GOLD_HUB_TRACKER_SWEEP;
                    case 75:
                        return EntryPointDto.GOLD_HUB_CARD_DEPOSIT_BOOST;
                    case 76:
                        return EntryPointDto.GOLD_HUB_CARD_SWEEP_ACTIVE;
                    case 77:
                        return EntryPointDto.GOLD_HUB_CARD_INSTANT;
                    case 78:
                        return EntryPointDto.GOLD_HUB_FEATURE_SWEEP_JOINT_ACTIVE;
                    case 79:
                        return EntryPointDto.GOLD_HUB_FEATURE_DEPOSIT_BOOST;
                    case 80:
                        return EntryPointDto.DEPOSIT_BOOST_HUB_DEFICIT_BANNER;
                    case 81:
                        return EntryPointDto.DEPOSIT_BOOST_HUB_CTA;
                    case 82:
                        return EntryPointDto.DEPOSIT_BOOST_EDUCATION_MODAL;
                    case 83:
                        return EntryPointDto.PATHFINDER_ACCOUNT_CLOSURE_IRA;
                    case 84:
                        return EntryPointDto.PATHFINDER_ACCOUNT_CLOSURE;
                    case 85:
                        return EntryPointDto.PDT_DEPOSIT_FUNDS;
                    case 86:
                        return EntryPointDto.DEBIT_CARD_LINKING_SUCCESS;
                    case 87:
                        return EntryPointDto.TRANSFER_MONEY_FORM;
                    case 88:
                        return EntryPointDto.IRA_TRANSFER_FORM;
                    case 89:
                        return EntryPointDto.RETIREMENT_CONTRIBUTION_CARD;
                    case 90:
                        return EntryPointDto.MENU_OF_OPTIONS_JOINT_ACCOUNT;
                    case 91:
                        return EntryPointDto.GOLD_SWEEP_HUB;
                    case 92:
                        return EntryPointDto.NOT_ENOUGH_BUYING_POWER;
                    case 93:
                        return EntryPointDto.EQUITY_DAY_TRADE_REASON_PDT;
                    case 94:
                        return EntryPointDto.PATHFINDER_SASSY_DEPOSIT_ABOVE_MARGIN_MAINTENANCE;
                    case 95:
                        return EntryPointDto.MARGIN_SETTINGS;
                    case 96:
                        return EntryPointDto.JOINT_ACCOUNT_FUNDING_METHODS;
                    case 97:
                        return EntryPointDto.MAINTENANCE_CALL_WITH_FUTURES;
                    case 98:
                        return EntryPointDto.BLACK_WIDOW;
                    case 99:
                        return EntryPointDto.ONE_PERCENT_MAX_AWARENESS_BOTTOMSHEET;
                    case 100:
                        return EntryPointDto.GOLD_SWEEP_SPLASH_DEPOSIT_ROW;
                    case 101:
                        return EntryPointDto.CREDIT_CARD_APP;
                    case 102:
                        return EntryPointDto.CREDIT_CARD_APP_BOOSTED_CASH_BACK;
                    case 103:
                        return EntryPointDto.GOLD_BOOSTED_APY_TRANSFER_HUB;
                    case 104:
                        return EntryPointDto.GOLD_DOWNGRADE_PREVENTION;
                    case 105:
                        return EntryPointDto.CREDIT_CARD_APP_AUC_CLI;
                    case 106:
                        return EntryPointDto.INCENTIVE_PRE_DEPOSIT;
                    case 107:
                        return EntryPointDto.INCENTIVE_POST_DEPOSIT;
                    case 108:
                        return EntryPointDto.LEGEND_EQUITY_TRADING_FLOW;
                    case 109:
                        return EntryPointDto.LEGEND_OPTIONS_TRADING_FLOW;
                    case 110:
                        return EntryPointDto.LEGEND_CRYPTO_TRADING_FLOW;
                    case 111:
                        return EntryPointDto.LEGEND_SIDEBAR_DEPOSIT;
                    case 112:
                        return EntryPointDto.LEGEND_SIDEBAR_TRANSFERS;
                    case 113:
                        return EntryPointDto.LEGEND_ACCOUNT_WIDGET;
                    case 114:
                        return EntryPointDto.ADVISORY_DASHBOARD_DEPOSIT_BUTTON;
                    case 115:
                        return EntryPointDto.CREDIT_CARD_APP_PREMIUM_CREDIT_LIMITS;
                    case 116:
                        return EntryPointDto.ADVISORY_DASHBOARD_RECURRING_DEPOSIT_BUTTON;
                    case 117:
                        return EntryPointDto.ROTH_CONVERSION;
                    case 118:
                        return EntryPointDto.GOLD_WELCOME_NATIVE;
                    case 119:
                        return EntryPointDto.CRYPTO_ORDER_CHECK;
                    case 120:
                        return EntryPointDto.EQUITY_ORDER_CHECK;
                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE:
                        return EntryPointDto.FUTURES_ORDER_CHECK;
                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                        return EntryPointDto.OPTIONS_ORDER_CHECK;
                    case 123:
                        return EntryPointDto.GOLD_BOOSTED_APY_REWARD_CENTER_OFFER;
                    case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                        return EntryPointDto.MANAGED_ACCOUNT_ONBOARDING_FLOW;
                    case 125:
                        return EntryPointDto.ADVISORY_FUTURE_PROJECTION;
                    case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                        return EntryPointDto.BROKERAGE_ACCOUNT_OVERVIEW;
                    case SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE:
                        return EntryPointDto.TRANSFER_HUB_DEPOSIT;
                    case 128:
                        return EntryPointDto.TRANSFER_HUB_WITHDRAW;
                    case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                        return EntryPointDto.LEGEND_FUTURES_TRADING_FLOW;
                    case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                        return EntryPointDto.INDIVIDUAL_ACCOUNT_ONBOARDING_FLOW;
                    case 131:
                        return EntryPointDto.INDIVIDUAL_ACCOUNT_NUX_FLOW;
                    case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                        return EntryPointDto.SHORT_SELL_ENABLEMENT;
                    case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                        return EntryPointDto.CUSTODIAL_ACCOUNT_ONBOARDING_FLOW;
                    case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                        return EntryPointDto.CUSTODIAL_ACCOUNT_NUX_FLOW;
                    case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
                        return EntryPointDto.MARGIN_ONBOARDING;
                    case 136:
                        return EntryPointDto.STRATEGIES_AUTO_SELECT;
                    case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                        return EntryPointDto.ISA_CONTRIBUTION;
                    case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                        return EntryPointDto.EVENT_CONTRACTS_ORDER_CHECK;
                    case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                        return EntryPointDto.DIRECT_IPO_ORDER_CHECK;
                    case SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE:
                        return EntryPointDto.INDIVIDUAL_ACCOUNT_DASHBOARD_FOOTER;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$EntryPointDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<EntryPointDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EntryPointDto, MAXTransferContext.EntryPoint> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.MAXTransferContext.EntryPoint", EntryPointDto.getEntries(), EntryPointDto.INSTANCE.getZeroValue());

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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MAXTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferV2DirectionDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferV2Direction;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TRANSFER_V2_DIRECTION_UNSPECIFIED", "DEPOSIT", "WITHDRAWAL", "XENT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TransferV2DirectionDto implements Dto2<MAXTransferContext.TransferV2Direction>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TransferV2DirectionDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<TransferV2DirectionDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TransferV2DirectionDto, MAXTransferContext.TransferV2Direction>> binaryBase64Serializer$delegate;
        public static final TransferV2DirectionDto TRANSFER_V2_DIRECTION_UNSPECIFIED = new TRANSFER_V2_DIRECTION_UNSPECIFIED("TRANSFER_V2_DIRECTION_UNSPECIFIED", 0);
        public static final TransferV2DirectionDto DEPOSIT = new DEPOSIT("DEPOSIT", 1);
        public static final TransferV2DirectionDto WITHDRAWAL = new WITHDRAWAL("WITHDRAWAL", 2);
        public static final TransferV2DirectionDto XENT = new XENT("XENT", 3);

        private static final /* synthetic */ TransferV2DirectionDto[] $values() {
            return new TransferV2DirectionDto[]{TRANSFER_V2_DIRECTION_UNSPECIFIED, DEPOSIT, WITHDRAWAL, XENT};
        }

        public /* synthetic */ TransferV2DirectionDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<TransferV2DirectionDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private TransferV2DirectionDto(String str, int i) {
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferV2DirectionDto.TRANSFER_V2_DIRECTION_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferV2DirectionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferV2Direction;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRANSFER_V2_DIRECTION_UNSPECIFIED extends TransferV2DirectionDto {
            TRANSFER_V2_DIRECTION_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.TransferV2Direction toProto() {
                return MAXTransferContext.TransferV2Direction.TRANSFER_V2_DIRECTION_UNSPECIFIED;
            }
        }

        static {
            TransferV2DirectionDto[] transferV2DirectionDtoArr$values = $values();
            $VALUES = transferV2DirectionDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(transferV2DirectionDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContextDto$TransferV2DirectionDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MAXTransferContextDto.TransferV2DirectionDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferV2DirectionDto.DEPOSIT", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferV2DirectionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferV2Direction;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEPOSIT extends TransferV2DirectionDto {
            DEPOSIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.TransferV2Direction toProto() {
                return MAXTransferContext.TransferV2Direction.DEPOSIT;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferV2DirectionDto.WITHDRAWAL", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferV2DirectionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferV2Direction;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WITHDRAWAL extends TransferV2DirectionDto {
            WITHDRAWAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.TransferV2Direction toProto() {
                return MAXTransferContext.TransferV2Direction.WITHDRAWAL;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferV2DirectionDto.XENT", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferV2DirectionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferV2Direction;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class XENT extends TransferV2DirectionDto {
            XENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.TransferV2Direction toProto() {
                return MAXTransferContext.TransferV2Direction.XENT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferV2DirectionDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferV2DirectionDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferV2Direction;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferV2DirectionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<TransferV2DirectionDto, MAXTransferContext.TransferV2Direction> {

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[MAXTransferContext.TransferV2Direction.values().length];
                    try {
                        iArr[MAXTransferContext.TransferV2Direction.TRANSFER_V2_DIRECTION_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[MAXTransferContext.TransferV2Direction.DEPOSIT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[MAXTransferContext.TransferV2Direction.WITHDRAWAL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[MAXTransferContext.TransferV2Direction.XENT.ordinal()] = 4;
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

            public final KSerializer<TransferV2DirectionDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TransferV2DirectionDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TransferV2DirectionDto> getBinaryBase64Serializer() {
                return (KSerializer) TransferV2DirectionDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<MAXTransferContext.TransferV2Direction> getProtoAdapter() {
                return MAXTransferContext.TransferV2Direction.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TransferV2DirectionDto getZeroValue() {
                return TransferV2DirectionDto.TRANSFER_V2_DIRECTION_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TransferV2DirectionDto fromProto(MAXTransferContext.TransferV2Direction proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return TransferV2DirectionDto.TRANSFER_V2_DIRECTION_UNSPECIFIED;
                }
                if (i == 2) {
                    return TransferV2DirectionDto.DEPOSIT;
                }
                if (i == 3) {
                    return TransferV2DirectionDto.WITHDRAWAL;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return TransferV2DirectionDto.XENT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferV2DirectionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferV2DirectionDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<TransferV2DirectionDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<TransferV2DirectionDto, MAXTransferContext.TransferV2Direction> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.MAXTransferContext.TransferV2Direction", TransferV2DirectionDto.getEntries(), TransferV2DirectionDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public TransferV2DirectionDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (TransferV2DirectionDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TransferV2DirectionDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static TransferV2DirectionDto valueOf(String str) {
            return (TransferV2DirectionDto) Enum.valueOf(TransferV2DirectionDto.class, str);
        }

        public static TransferV2DirectionDto[] values() {
            return (TransferV2DirectionDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MAXTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferMethodDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferMethod;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TRANSFER_METHOD_UNSPECIFIED", "ACH", "WIRE", "FAST", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* loaded from: classes26.dex */
    public static final class TransferMethodDto implements Dto2<MAXTransferContext.TransferMethod>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TransferMethodDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<TransferMethodDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TransferMethodDto, MAXTransferContext.TransferMethod>> binaryBase64Serializer$delegate;
        public static final TransferMethodDto TRANSFER_METHOD_UNSPECIFIED = new TRANSFER_METHOD_UNSPECIFIED("TRANSFER_METHOD_UNSPECIFIED", 0);
        public static final TransferMethodDto ACH = new ACH("ACH", 1);
        public static final TransferMethodDto WIRE = new WIRE("WIRE", 2);
        public static final TransferMethodDto FAST = new FAST("FAST", 3);

        private static final /* synthetic */ TransferMethodDto[] $values() {
            return new TransferMethodDto[]{TRANSFER_METHOD_UNSPECIFIED, ACH, WIRE, FAST};
        }

        public /* synthetic */ TransferMethodDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<TransferMethodDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferMethodDto.TRANSFER_METHOD_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferMethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferMethod;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRANSFER_METHOD_UNSPECIFIED extends TransferMethodDto {
            TRANSFER_METHOD_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.TransferMethod toProto() {
                return MAXTransferContext.TransferMethod.TRANSFER_METHOD_UNSPECIFIED;
            }
        }

        private TransferMethodDto(String str, int i) {
        }

        static {
            TransferMethodDto[] transferMethodDtoArr$values = $values();
            $VALUES = transferMethodDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(transferMethodDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MAXTransferContextDto$TransferMethodDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MAXTransferContextDto.TransferMethodDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferMethodDto.ACH", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferMethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferMethod;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACH extends TransferMethodDto {
            ACH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.TransferMethod toProto() {
                return MAXTransferContext.TransferMethod.ACH;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferMethodDto.WIRE", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferMethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferMethod;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WIRE extends TransferMethodDto {
            WIRE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.TransferMethod toProto() {
                return MAXTransferContext.TransferMethod.WIRE;
            }
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/MAXTransferContextDto.TransferMethodDto.FAST", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferMethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferMethod;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FAST extends TransferMethodDto {
            FAST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MAXTransferContext.TransferMethod toProto() {
                return MAXTransferContext.TransferMethod.FAST;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferMethodDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferMethodDto;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferMethod;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferMethodDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<TransferMethodDto, MAXTransferContext.TransferMethod> {

            /* compiled from: MAXTransferContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[MAXTransferContext.TransferMethod.values().length];
                    try {
                        iArr[MAXTransferContext.TransferMethod.TRANSFER_METHOD_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[MAXTransferContext.TransferMethod.ACH.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[MAXTransferContext.TransferMethod.WIRE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[MAXTransferContext.TransferMethod.FAST.ordinal()] = 4;
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

            public final KSerializer<TransferMethodDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TransferMethodDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TransferMethodDto> getBinaryBase64Serializer() {
                return (KSerializer) TransferMethodDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<MAXTransferContext.TransferMethod> getProtoAdapter() {
                return MAXTransferContext.TransferMethod.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TransferMethodDto getZeroValue() {
                return TransferMethodDto.TRANSFER_METHOD_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TransferMethodDto fromProto(MAXTransferContext.TransferMethod proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return TransferMethodDto.TRANSFER_METHOD_UNSPECIFIED;
                }
                if (i == 2) {
                    return TransferMethodDto.ACH;
                }
                if (i == 3) {
                    return TransferMethodDto.WIRE;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return TransferMethodDto.FAST;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: MAXTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferMethodDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$TransferMethodDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TransferMethodDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<TransferMethodDto, MAXTransferContext.TransferMethod> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.MAXTransferContext.TransferMethod", TransferMethodDto.getEntries(), TransferMethodDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public TransferMethodDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (TransferMethodDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TransferMethodDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static TransferMethodDto valueOf(String str) {
            return (TransferMethodDto) Enum.valueOf(TransferMethodDto.class, str);
        }

        public static TransferMethodDto[] values() {
            return (TransferMethodDto[]) $VALUES.clone();
        }
    }

    /* compiled from: MAXTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<MAXTransferContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.MAXTransferContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MAXTransferContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MAXTransferContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MAXTransferContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MAXTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MAXTransferContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.MAXTransferContextDto";
        }
    }
}
