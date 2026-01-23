package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.RecurringContextDto;
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

/* compiled from: RecurringContextDto.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\n<=>?@ABCDEB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bm\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u001aJj\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\rJ\b\u0010.\u001a\u00020\u0002H\u0016J\b\u0010/\u001a\u00020\rH\u0016J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\b\u00104\u001a\u000205H\u0016J\u0018\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000205H\u0016J\b\u0010;\u001a\u000205H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\u0018\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b+\u0010&R\u0011\u0010\u0019\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b,\u0010 ¨\u0006F"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$Surrogate;)V", "flow_type", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$FlowTypeDto;", "entry_point", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", Constants.REFERRER, "", "frequency", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$ScheduleFrequencyDto;", "source_of_funds", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$RecurringFundsSourceDto;", "amount", "", "asset_type", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$AssetTypeDto;", "upsell_type", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$UpsellTypeDto;", "percentage_of_direct_deposit", "direct_deposit_relationship_id", "(Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$FlowTypeDto;Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$ScheduleFrequencyDto;Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$RecurringFundsSourceDto;DLcom/robinhood/rosetta/eventlogging/RecurringContextDto$AssetTypeDto;Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$UpsellTypeDto;DLjava/lang/String;)V", "getFlow_type", "()Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$FlowTypeDto;", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", "getReferrer", "()Ljava/lang/String;", "getFrequency", "()Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$ScheduleFrequencyDto;", "getSource_of_funds", "()Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$RecurringFundsSourceDto;", "getAmount", "()D", "getAsset_type", "()Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$AssetTypeDto;", "getUpsell_type", "()Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$UpsellTypeDto;", "getPercentage_of_direct_deposit", "getDirect_deposit_relationship_id", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "FlowTypeDto", "EntryPointDto", "ScheduleFrequencyDto", "RecurringFundsSourceDto", "AssetTypeDto", "UpsellTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class RecurringContextDto implements Dto3<RecurringContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<RecurringContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<RecurringContextDto, RecurringContext>> binaryBase64Serializer$delegate;
    private static final RecurringContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ RecurringContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private RecurringContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final FlowTypeDto getFlow_type() {
        return this.surrogate.getFlow_type();
    }

    public final EntryPointDto getEntry_point() {
        return this.surrogate.getEntry_point();
    }

    public final String getReferrer() {
        return this.surrogate.getReferrer();
    }

    public final ScheduleFrequencyDto getFrequency() {
        return this.surrogate.getFrequency();
    }

    public final RecurringFundsSourceDto getSource_of_funds() {
        return this.surrogate.getSource_of_funds();
    }

    public final double getAmount() {
        return this.surrogate.getAmount();
    }

    public final AssetTypeDto getAsset_type() {
        return this.surrogate.getAsset_type();
    }

    public final UpsellTypeDto getUpsell_type() {
        return this.surrogate.getUpsell_type();
    }

    public final double getPercentage_of_direct_deposit() {
        return this.surrogate.getPercentage_of_direct_deposit();
    }

    public final String getDirect_deposit_relationship_id() {
        return this.surrogate.getDirect_deposit_relationship_id();
    }

    public /* synthetic */ RecurringContextDto(FlowTypeDto flowTypeDto, EntryPointDto entryPointDto, String str, ScheduleFrequencyDto scheduleFrequencyDto, RecurringFundsSourceDto recurringFundsSourceDto, double d, AssetTypeDto assetTypeDto, UpsellTypeDto upsellTypeDto, double d2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FlowTypeDto.INSTANCE.getZeroValue() : flowTypeDto, (i & 2) != 0 ? EntryPointDto.INSTANCE.getZeroValue() : entryPointDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? ScheduleFrequencyDto.INSTANCE.getZeroValue() : scheduleFrequencyDto, (i & 16) != 0 ? RecurringFundsSourceDto.INSTANCE.getZeroValue() : recurringFundsSourceDto, (i & 32) != 0 ? 0.0d : d, (i & 64) != 0 ? AssetTypeDto.INSTANCE.getZeroValue() : assetTypeDto, (i & 128) != 0 ? UpsellTypeDto.INSTANCE.getZeroValue() : upsellTypeDto, (i & 256) == 0 ? d2 : 0.0d, (i & 512) != 0 ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecurringContextDto(FlowTypeDto flow_type, EntryPointDto entry_point, String referrer, ScheduleFrequencyDto frequency, RecurringFundsSourceDto source_of_funds, double d, AssetTypeDto asset_type, UpsellTypeDto upsell_type, double d2, String direct_deposit_relationship_id) {
        this(new Surrogate(flow_type, entry_point, referrer, frequency, source_of_funds, d, asset_type, upsell_type, d2, direct_deposit_relationship_id));
        Intrinsics.checkNotNullParameter(flow_type, "flow_type");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(source_of_funds, "source_of_funds");
        Intrinsics.checkNotNullParameter(asset_type, "asset_type");
        Intrinsics.checkNotNullParameter(upsell_type, "upsell_type");
        Intrinsics.checkNotNullParameter(direct_deposit_relationship_id, "direct_deposit_relationship_id");
    }

    public static /* synthetic */ RecurringContextDto copy$default(RecurringContextDto recurringContextDto, FlowTypeDto flowTypeDto, EntryPointDto entryPointDto, String str, ScheduleFrequencyDto scheduleFrequencyDto, RecurringFundsSourceDto recurringFundsSourceDto, double d, AssetTypeDto assetTypeDto, UpsellTypeDto upsellTypeDto, double d2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            flowTypeDto = recurringContextDto.surrogate.getFlow_type();
        }
        if ((i & 2) != 0) {
            entryPointDto = recurringContextDto.surrogate.getEntry_point();
        }
        if ((i & 4) != 0) {
            str = recurringContextDto.surrogate.getReferrer();
        }
        if ((i & 8) != 0) {
            scheduleFrequencyDto = recurringContextDto.surrogate.getFrequency();
        }
        if ((i & 16) != 0) {
            recurringFundsSourceDto = recurringContextDto.surrogate.getSource_of_funds();
        }
        if ((i & 32) != 0) {
            d = recurringContextDto.surrogate.getAmount();
        }
        if ((i & 64) != 0) {
            assetTypeDto = recurringContextDto.surrogate.getAsset_type();
        }
        if ((i & 128) != 0) {
            upsellTypeDto = recurringContextDto.surrogate.getUpsell_type();
        }
        if ((i & 256) != 0) {
            d2 = recurringContextDto.surrogate.getPercentage_of_direct_deposit();
        }
        if ((i & 512) != 0) {
            str2 = recurringContextDto.surrogate.getDirect_deposit_relationship_id();
        }
        String str3 = str2;
        double d3 = d;
        ScheduleFrequencyDto scheduleFrequencyDto2 = scheduleFrequencyDto;
        RecurringFundsSourceDto recurringFundsSourceDto2 = recurringFundsSourceDto;
        String str4 = str;
        return recurringContextDto.copy(flowTypeDto, entryPointDto, str4, scheduleFrequencyDto2, recurringFundsSourceDto2, d3, assetTypeDto, upsellTypeDto, d2, str3);
    }

    public final RecurringContextDto copy(FlowTypeDto flow_type, EntryPointDto entry_point, String referrer, ScheduleFrequencyDto frequency, RecurringFundsSourceDto source_of_funds, double amount, AssetTypeDto asset_type, UpsellTypeDto upsell_type, double percentage_of_direct_deposit, String direct_deposit_relationship_id) {
        Intrinsics.checkNotNullParameter(flow_type, "flow_type");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(source_of_funds, "source_of_funds");
        Intrinsics.checkNotNullParameter(asset_type, "asset_type");
        Intrinsics.checkNotNullParameter(upsell_type, "upsell_type");
        Intrinsics.checkNotNullParameter(direct_deposit_relationship_id, "direct_deposit_relationship_id");
        return new RecurringContextDto(new Surrogate(flow_type, entry_point, referrer, frequency, source_of_funds, amount, asset_type, upsell_type, percentage_of_direct_deposit, direct_deposit_relationship_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public RecurringContext toProto() {
        return new RecurringContext((RecurringContext.FlowType) this.surrogate.getFlow_type().toProto(), (RecurringContext.EntryPoint) this.surrogate.getEntry_point().toProto(), this.surrogate.getReferrer(), (RecurringContext.ScheduleFrequency) this.surrogate.getFrequency().toProto(), (RecurringContext.RecurringFundsSource) this.surrogate.getSource_of_funds().toProto(), this.surrogate.getAmount(), (RecurringContext.AssetType) this.surrogate.getAsset_type().toProto(), (RecurringContext.UpsellType) this.surrogate.getUpsell_type().toProto(), this.surrogate.getPercentage_of_direct_deposit(), this.surrogate.getDirect_deposit_relationship_id(), null, 1024, null);
    }

    public String toString() {
        return "[RecurringContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof RecurringContextDto) && Intrinsics.areEqual(((RecurringContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: RecurringContextDto.kt */
    @Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 T2\u00020\u0001:\u0002STB\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0017\b\u0002\u0010\f\u001a\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\u0017\b\u0002\u0010\u0015\u001a\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018B{\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0017\u0010\u001dJ\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0007HÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003J\t\u0010?\u001a\u00020\u000bHÆ\u0003J\u0018\u0010@\u001a\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010HÆ\u0003J\t\u0010A\u001a\u00020\u0012HÆ\u0003J\t\u0010B\u001a\u00020\u0014HÆ\u0003J\u0018\u0010C\u001a\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010HÆ\u0003J\t\u0010D\u001a\u00020\u0007HÆ\u0003J\u008b\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0017\b\u0002\u0010\f\u001a\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0017\b\u0002\u0010\u0015\u001a\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u0007HÆ\u0001J\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020\u001aHÖ\u0001J\t\u0010J\u001a\u00020\u0007HÖ\u0001J%\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QH\u0001¢\u0006\u0002\bRR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010$R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010'R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010*R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010-R+\u0010\f\u001a\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001f\u001a\u0004\b/\u00100R\u001c\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u001f\u001a\u0004\b2\u00103R\u001c\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u001f\u001a\u0004\b5\u00106R+\u0010\u0015\u001a\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010\u001f\u001a\u0004\b8\u00100R\u001c\u0010\u0016\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010\u001f\u001a\u0004\b:\u0010'¨\u0006U"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$Surrogate;", "", "flow_type", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$FlowTypeDto;", "entry_point", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", Constants.REFERRER, "", "frequency", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$ScheduleFrequencyDto;", "source_of_funds", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$RecurringFundsSourceDto;", "amount", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "asset_type", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$AssetTypeDto;", "upsell_type", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$UpsellTypeDto;", "percentage_of_direct_deposit", "direct_deposit_relationship_id", "<init>", "(Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$FlowTypeDto;Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$ScheduleFrequencyDto;Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$RecurringFundsSourceDto;DLcom/robinhood/rosetta/eventlogging/RecurringContextDto$AssetTypeDto;Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$UpsellTypeDto;DLjava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/RecurringContextDto$FlowTypeDto;Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$ScheduleFrequencyDto;Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$RecurringFundsSourceDto;DLcom/robinhood/rosetta/eventlogging/RecurringContextDto$AssetTypeDto;Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$UpsellTypeDto;DLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getFlow_type$annotations", "()V", "getFlow_type", "()Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$FlowTypeDto;", "getEntry_point$annotations", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", "getReferrer$annotations", "getReferrer", "()Ljava/lang/String;", "getFrequency$annotations", "getFrequency", "()Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$ScheduleFrequencyDto;", "getSource_of_funds$annotations", "getSource_of_funds", "()Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$RecurringFundsSourceDto;", "getAmount$annotations", "getAmount", "()D", "getAsset_type$annotations", "getAsset_type", "()Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$AssetTypeDto;", "getUpsell_type$annotations", "getUpsell_type", "()Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$UpsellTypeDto;", "getPercentage_of_direct_deposit$annotations", "getPercentage_of_direct_deposit", "getDirect_deposit_relationship_id$annotations", "getDirect_deposit_relationship_id", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final double amount;
        private final AssetTypeDto asset_type;
        private final String direct_deposit_relationship_id;
        private final EntryPointDto entry_point;
        private final FlowTypeDto flow_type;
        private final ScheduleFrequencyDto frequency;
        private final double percentage_of_direct_deposit;
        private final String referrer;
        private final RecurringFundsSourceDto source_of_funds;
        private final UpsellTypeDto upsell_type;

        public Surrogate() {
            this((FlowTypeDto) null, (EntryPointDto) null, (String) null, (ScheduleFrequencyDto) null, (RecurringFundsSourceDto) null, 0.0d, (AssetTypeDto) null, (UpsellTypeDto) null, 0.0d, (String) null, 1023, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, FlowTypeDto flowTypeDto, EntryPointDto entryPointDto, String str, ScheduleFrequencyDto scheduleFrequencyDto, RecurringFundsSourceDto recurringFundsSourceDto, double d, AssetTypeDto assetTypeDto, UpsellTypeDto upsellTypeDto, double d2, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                flowTypeDto = surrogate.flow_type;
            }
            if ((i & 2) != 0) {
                entryPointDto = surrogate.entry_point;
            }
            if ((i & 4) != 0) {
                str = surrogate.referrer;
            }
            if ((i & 8) != 0) {
                scheduleFrequencyDto = surrogate.frequency;
            }
            if ((i & 16) != 0) {
                recurringFundsSourceDto = surrogate.source_of_funds;
            }
            if ((i & 32) != 0) {
                d = surrogate.amount;
            }
            if ((i & 64) != 0) {
                assetTypeDto = surrogate.asset_type;
            }
            if ((i & 128) != 0) {
                upsellTypeDto = surrogate.upsell_type;
            }
            if ((i & 256) != 0) {
                d2 = surrogate.percentage_of_direct_deposit;
            }
            if ((i & 512) != 0) {
                str2 = surrogate.direct_deposit_relationship_id;
            }
            String str3 = str2;
            double d3 = d;
            ScheduleFrequencyDto scheduleFrequencyDto2 = scheduleFrequencyDto;
            RecurringFundsSourceDto recurringFundsSourceDto2 = recurringFundsSourceDto;
            String str4 = str;
            return surrogate.copy(flowTypeDto, entryPointDto, str4, scheduleFrequencyDto2, recurringFundsSourceDto2, d3, assetTypeDto, upsellTypeDto, d2, str3);
        }

        @SerialName("amount")
        @JsonAnnotations2(names = {"amount"})
        public static /* synthetic */ void getAmount$annotations() {
        }

        @SerialName("assetType")
        @JsonAnnotations2(names = {"asset_type"})
        public static /* synthetic */ void getAsset_type$annotations() {
        }

        @SerialName("directDepositRelationshipId")
        @JsonAnnotations2(names = {"direct_deposit_relationship_id"})
        public static /* synthetic */ void getDirect_deposit_relationship_id$annotations() {
        }

        @SerialName("entryPoint")
        @JsonAnnotations2(names = {"entry_point"})
        public static /* synthetic */ void getEntry_point$annotations() {
        }

        @SerialName("flowType")
        @JsonAnnotations2(names = {"flow_type"})
        public static /* synthetic */ void getFlow_type$annotations() {
        }

        @SerialName("frequency")
        @JsonAnnotations2(names = {"frequency"})
        public static /* synthetic */ void getFrequency$annotations() {
        }

        @SerialName("percentageOfDirectDeposit")
        @JsonAnnotations2(names = {"percentage_of_direct_deposit"})
        public static /* synthetic */ void getPercentage_of_direct_deposit$annotations() {
        }

        @SerialName(Constants.REFERRER)
        @JsonAnnotations2(names = {Constants.REFERRER})
        public static /* synthetic */ void getReferrer$annotations() {
        }

        @SerialName("sourceOfFunds")
        @JsonAnnotations2(names = {"source_of_funds"})
        public static /* synthetic */ void getSource_of_funds$annotations() {
        }

        @SerialName("upsellType")
        @JsonAnnotations2(names = {"upsell_type"})
        public static /* synthetic */ void getUpsell_type$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final FlowTypeDto getFlow_type() {
            return this.flow_type;
        }

        /* renamed from: component10, reason: from getter */
        public final String getDirect_deposit_relationship_id() {
            return this.direct_deposit_relationship_id;
        }

        /* renamed from: component2, reason: from getter */
        public final EntryPointDto getEntry_point() {
            return this.entry_point;
        }

        /* renamed from: component3, reason: from getter */
        public final String getReferrer() {
            return this.referrer;
        }

        /* renamed from: component4, reason: from getter */
        public final ScheduleFrequencyDto getFrequency() {
            return this.frequency;
        }

        /* renamed from: component5, reason: from getter */
        public final RecurringFundsSourceDto getSource_of_funds() {
            return this.source_of_funds;
        }

        /* renamed from: component6, reason: from getter */
        public final double getAmount() {
            return this.amount;
        }

        /* renamed from: component7, reason: from getter */
        public final AssetTypeDto getAsset_type() {
            return this.asset_type;
        }

        /* renamed from: component8, reason: from getter */
        public final UpsellTypeDto getUpsell_type() {
            return this.upsell_type;
        }

        /* renamed from: component9, reason: from getter */
        public final double getPercentage_of_direct_deposit() {
            return this.percentage_of_direct_deposit;
        }

        public final Surrogate copy(FlowTypeDto flow_type, EntryPointDto entry_point, String referrer, ScheduleFrequencyDto frequency, RecurringFundsSourceDto source_of_funds, double amount, AssetTypeDto asset_type, UpsellTypeDto upsell_type, double percentage_of_direct_deposit, String direct_deposit_relationship_id) {
            Intrinsics.checkNotNullParameter(flow_type, "flow_type");
            Intrinsics.checkNotNullParameter(entry_point, "entry_point");
            Intrinsics.checkNotNullParameter(referrer, "referrer");
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            Intrinsics.checkNotNullParameter(source_of_funds, "source_of_funds");
            Intrinsics.checkNotNullParameter(asset_type, "asset_type");
            Intrinsics.checkNotNullParameter(upsell_type, "upsell_type");
            Intrinsics.checkNotNullParameter(direct_deposit_relationship_id, "direct_deposit_relationship_id");
            return new Surrogate(flow_type, entry_point, referrer, frequency, source_of_funds, amount, asset_type, upsell_type, percentage_of_direct_deposit, direct_deposit_relationship_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.flow_type == surrogate.flow_type && this.entry_point == surrogate.entry_point && Intrinsics.areEqual(this.referrer, surrogate.referrer) && this.frequency == surrogate.frequency && this.source_of_funds == surrogate.source_of_funds && Double.compare(this.amount, surrogate.amount) == 0 && this.asset_type == surrogate.asset_type && this.upsell_type == surrogate.upsell_type && Double.compare(this.percentage_of_direct_deposit, surrogate.percentage_of_direct_deposit) == 0 && Intrinsics.areEqual(this.direct_deposit_relationship_id, surrogate.direct_deposit_relationship_id);
        }

        public int hashCode() {
            return (((((((((((((((((this.flow_type.hashCode() * 31) + this.entry_point.hashCode()) * 31) + this.referrer.hashCode()) * 31) + this.frequency.hashCode()) * 31) + this.source_of_funds.hashCode()) * 31) + Double.hashCode(this.amount)) * 31) + this.asset_type.hashCode()) * 31) + this.upsell_type.hashCode()) * 31) + Double.hashCode(this.percentage_of_direct_deposit)) * 31) + this.direct_deposit_relationship_id.hashCode();
        }

        public String toString() {
            return "Surrogate(flow_type=" + this.flow_type + ", entry_point=" + this.entry_point + ", referrer=" + this.referrer + ", frequency=" + this.frequency + ", source_of_funds=" + this.source_of_funds + ", amount=" + this.amount + ", asset_type=" + this.asset_type + ", upsell_type=" + this.upsell_type + ", percentage_of_direct_deposit=" + this.percentage_of_direct_deposit + ", direct_deposit_relationship_id=" + this.direct_deposit_relationship_id + ")";
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return RecurringContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, FlowTypeDto flowTypeDto, EntryPointDto entryPointDto, String str, ScheduleFrequencyDto scheduleFrequencyDto, RecurringFundsSourceDto recurringFundsSourceDto, double d, AssetTypeDto assetTypeDto, UpsellTypeDto upsellTypeDto, double d2, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            this.flow_type = (i & 1) == 0 ? FlowTypeDto.INSTANCE.getZeroValue() : flowTypeDto;
            if ((i & 2) == 0) {
                this.entry_point = EntryPointDto.INSTANCE.getZeroValue();
            } else {
                this.entry_point = entryPointDto;
            }
            if ((i & 4) == 0) {
                this.referrer = "";
            } else {
                this.referrer = str;
            }
            if ((i & 8) == 0) {
                this.frequency = ScheduleFrequencyDto.INSTANCE.getZeroValue();
            } else {
                this.frequency = scheduleFrequencyDto;
            }
            if ((i & 16) == 0) {
                this.source_of_funds = RecurringFundsSourceDto.INSTANCE.getZeroValue();
            } else {
                this.source_of_funds = recurringFundsSourceDto;
            }
            if ((i & 32) == 0) {
                this.amount = 0.0d;
            } else {
                this.amount = d;
            }
            if ((i & 64) == 0) {
                this.asset_type = AssetTypeDto.INSTANCE.getZeroValue();
            } else {
                this.asset_type = assetTypeDto;
            }
            if ((i & 128) == 0) {
                this.upsell_type = UpsellTypeDto.INSTANCE.getZeroValue();
            } else {
                this.upsell_type = upsellTypeDto;
            }
            if ((i & 256) == 0) {
                this.percentage_of_direct_deposit = 0.0d;
            } else {
                this.percentage_of_direct_deposit = d2;
            }
            if ((i & 512) == 0) {
                this.direct_deposit_relationship_id = "";
            } else {
                this.direct_deposit_relationship_id = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.flow_type != FlowTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, FlowTypeDto.Serializer.INSTANCE, self.flow_type);
            }
            if (self.entry_point != EntryPointDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, EntryPointDto.Serializer.INSTANCE, self.entry_point);
            }
            if (!Intrinsics.areEqual(self.referrer, "")) {
                output.encodeStringElement(serialDesc, 2, self.referrer);
            }
            if (self.frequency != ScheduleFrequencyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, ScheduleFrequencyDto.Serializer.INSTANCE, self.frequency);
            }
            if (self.source_of_funds != RecurringFundsSourceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, RecurringFundsSourceDto.Serializer.INSTANCE, self.source_of_funds);
            }
            if (Double.compare(self.amount, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 5, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.amount));
            }
            if (self.asset_type != AssetTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, AssetTypeDto.Serializer.INSTANCE, self.asset_type);
            }
            if (self.upsell_type != UpsellTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, UpsellTypeDto.Serializer.INSTANCE, self.upsell_type);
            }
            if (Double.compare(self.percentage_of_direct_deposit, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 8, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.percentage_of_direct_deposit));
            }
            if (Intrinsics.areEqual(self.direct_deposit_relationship_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 9, self.direct_deposit_relationship_id);
        }

        public Surrogate(FlowTypeDto flow_type, EntryPointDto entry_point, String referrer, ScheduleFrequencyDto frequency, RecurringFundsSourceDto source_of_funds, double d, AssetTypeDto asset_type, UpsellTypeDto upsell_type, double d2, String direct_deposit_relationship_id) {
            Intrinsics.checkNotNullParameter(flow_type, "flow_type");
            Intrinsics.checkNotNullParameter(entry_point, "entry_point");
            Intrinsics.checkNotNullParameter(referrer, "referrer");
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            Intrinsics.checkNotNullParameter(source_of_funds, "source_of_funds");
            Intrinsics.checkNotNullParameter(asset_type, "asset_type");
            Intrinsics.checkNotNullParameter(upsell_type, "upsell_type");
            Intrinsics.checkNotNullParameter(direct_deposit_relationship_id, "direct_deposit_relationship_id");
            this.flow_type = flow_type;
            this.entry_point = entry_point;
            this.referrer = referrer;
            this.frequency = frequency;
            this.source_of_funds = source_of_funds;
            this.amount = d;
            this.asset_type = asset_type;
            this.upsell_type = upsell_type;
            this.percentage_of_direct_deposit = d2;
            this.direct_deposit_relationship_id = direct_deposit_relationship_id;
        }

        public final FlowTypeDto getFlow_type() {
            return this.flow_type;
        }

        public /* synthetic */ Surrogate(FlowTypeDto flowTypeDto, EntryPointDto entryPointDto, String str, ScheduleFrequencyDto scheduleFrequencyDto, RecurringFundsSourceDto recurringFundsSourceDto, double d, AssetTypeDto assetTypeDto, UpsellTypeDto upsellTypeDto, double d2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? FlowTypeDto.INSTANCE.getZeroValue() : flowTypeDto, (i & 2) != 0 ? EntryPointDto.INSTANCE.getZeroValue() : entryPointDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? ScheduleFrequencyDto.INSTANCE.getZeroValue() : scheduleFrequencyDto, (i & 16) != 0 ? RecurringFundsSourceDto.INSTANCE.getZeroValue() : recurringFundsSourceDto, (i & 32) != 0 ? 0.0d : d, (i & 64) != 0 ? AssetTypeDto.INSTANCE.getZeroValue() : assetTypeDto, (i & 128) != 0 ? UpsellTypeDto.INSTANCE.getZeroValue() : upsellTypeDto, (i & 256) == 0 ? d2 : 0.0d, (i & 512) != 0 ? "" : str2);
        }

        public final EntryPointDto getEntry_point() {
            return this.entry_point;
        }

        public final String getReferrer() {
            return this.referrer;
        }

        public final ScheduleFrequencyDto getFrequency() {
            return this.frequency;
        }

        public final RecurringFundsSourceDto getSource_of_funds() {
            return this.source_of_funds;
        }

        public final double getAmount() {
            return this.amount;
        }

        public final AssetTypeDto getAsset_type() {
            return this.asset_type;
        }

        public final UpsellTypeDto getUpsell_type() {
            return this.upsell_type;
        }

        public final double getPercentage_of_direct_deposit() {
            return this.percentage_of_direct_deposit;
        }

        public final String getDirect_deposit_relationship_id() {
            return this.direct_deposit_relationship_id;
        }
    }

    /* compiled from: RecurringContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto;", "Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/RecurringContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<RecurringContextDto, RecurringContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RecurringContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RecurringContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RecurringContextDto> getBinaryBase64Serializer() {
            return (KSerializer) RecurringContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<RecurringContext> getProtoAdapter() {
            return RecurringContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RecurringContextDto getZeroValue() {
            return RecurringContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RecurringContextDto fromProto(RecurringContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new RecurringContextDto(new Surrogate(FlowTypeDto.INSTANCE.fromProto(proto.getFlow_type()), EntryPointDto.INSTANCE.fromProto(proto.getEntry_point()), proto.getReferrer(), ScheduleFrequencyDto.INSTANCE.fromProto(proto.getFrequency()), RecurringFundsSourceDto.INSTANCE.fromProto(proto.getSource_of_funds()), proto.getAmount(), AssetTypeDto.INSTANCE.fromProto(proto.getAsset_type()), UpsellTypeDto.INSTANCE.fromProto(proto.getUpsell_type()), proto.getPercentage_of_direct_deposit(), proto.getDirect_deposit_relationship_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.RecurringContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new RecurringContextDto(null, null, null, null, null, 0.0d, null, null, 0.0d, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecurringContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$FlowTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$FlowType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "FLOW_TYPE_UNSPECIFIED", "CREATE", "EDIT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class FlowTypeDto implements Dto2<RecurringContext.FlowType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FlowTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<FlowTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<FlowTypeDto, RecurringContext.FlowType>> binaryBase64Serializer$delegate;
        public static final FlowTypeDto FLOW_TYPE_UNSPECIFIED = new FLOW_TYPE_UNSPECIFIED("FLOW_TYPE_UNSPECIFIED", 0);
        public static final FlowTypeDto CREATE = new CREATE("CREATE", 1);
        public static final FlowTypeDto EDIT = new EDIT("EDIT", 2);

        private static final /* synthetic */ FlowTypeDto[] $values() {
            return new FlowTypeDto[]{FLOW_TYPE_UNSPECIFIED, CREATE, EDIT};
        }

        public /* synthetic */ FlowTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<FlowTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.FlowTypeDto.FLOW_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$FlowTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$FlowType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FLOW_TYPE_UNSPECIFIED extends FlowTypeDto {
            FLOW_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.FlowType toProto() {
                return RecurringContext.FlowType.FLOW_TYPE_UNSPECIFIED;
            }
        }

        private FlowTypeDto(String str, int i) {
        }

        static {
            FlowTypeDto[] flowTypeDtoArr$values = $values();
            $VALUES = flowTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(flowTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.RecurringContextDto$FlowTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecurringContextDto.FlowTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.FlowTypeDto.CREATE", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$FlowTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$FlowType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CREATE extends FlowTypeDto {
            CREATE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.FlowType toProto() {
                return RecurringContext.FlowType.CREATE;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.FlowTypeDto.EDIT", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$FlowTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$FlowType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EDIT extends FlowTypeDto {
            EDIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.FlowType toProto() {
                return RecurringContext.FlowType.EDIT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$FlowTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$FlowTypeDto;", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$FlowType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$FlowTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<FlowTypeDto, RecurringContext.FlowType> {

            /* compiled from: RecurringContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[RecurringContext.FlowType.values().length];
                    try {
                        iArr[RecurringContext.FlowType.FLOW_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[RecurringContext.FlowType.CREATE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[RecurringContext.FlowType.EDIT.ordinal()] = 3;
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

            public final KSerializer<FlowTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<FlowTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<FlowTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) FlowTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<RecurringContext.FlowType> getProtoAdapter() {
                return RecurringContext.FlowType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FlowTypeDto getZeroValue() {
                return FlowTypeDto.FLOW_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FlowTypeDto fromProto(RecurringContext.FlowType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return FlowTypeDto.FLOW_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return FlowTypeDto.CREATE;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return FlowTypeDto.EDIT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$FlowTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$FlowTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<FlowTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<FlowTypeDto, RecurringContext.FlowType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.RecurringContext.FlowType", FlowTypeDto.getEntries(), FlowTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public FlowTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (FlowTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, FlowTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static FlowTypeDto valueOf(String str) {
            return (FlowTypeDto) Enum.valueOf(FlowTypeDto.class, str);
        }

        public static FlowTypeDto[] values() {
            return (FlowTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecurringContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001e\u001fB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ENTRY_POINT_UNSPECIFIED", "RECURRING_HUB", "RECURRING_RECEIPT_UPSELL", "COMMS", "EQUITY_SELECT_ORDER_KIND_PAGE", "EQUITY_ORDER_RECEIPT", EducationTourScreenNames.STOCK_DETAIL_PAGE_SCREEN, "DOLLAR_BASED_ORDER_ENTRY", "CRYPTO_DETAIL_PAGE", "CRYPTO_SELECT_ORDER_KIND_PAGE", "CRYPTO_ORDER_RECEIPT", "PAYCHECK_INVESTMENT_HUB", "PAYCHECK_INVESTMENT_NO_DD", "ORDER_RECEIPT", "SELECT_ORDER_KIND_PAGE", "CARD", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EntryPointDto implements Dto2<RecurringContext.EntryPoint>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPointDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EntryPointDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EntryPointDto, RecurringContext.EntryPoint>> binaryBase64Serializer$delegate;
        public static final EntryPointDto ENTRY_POINT_UNSPECIFIED = new ENTRY_POINT_UNSPECIFIED("ENTRY_POINT_UNSPECIFIED", 0);
        public static final EntryPointDto RECURRING_HUB = new RECURRING_HUB("RECURRING_HUB", 1);
        public static final EntryPointDto RECURRING_RECEIPT_UPSELL = new RECURRING_RECEIPT_UPSELL("RECURRING_RECEIPT_UPSELL", 2);
        public static final EntryPointDto COMMS = new COMMS("COMMS", 3);
        public static final EntryPointDto EQUITY_SELECT_ORDER_KIND_PAGE = new EQUITY_SELECT_ORDER_KIND_PAGE("EQUITY_SELECT_ORDER_KIND_PAGE", 4);
        public static final EntryPointDto EQUITY_ORDER_RECEIPT = new EQUITY_ORDER_RECEIPT("EQUITY_ORDER_RECEIPT", 5);
        public static final EntryPointDto STOCK_DETAIL_PAGE = new STOCK_DETAIL_PAGE(EducationTourScreenNames.STOCK_DETAIL_PAGE_SCREEN, 6);
        public static final EntryPointDto DOLLAR_BASED_ORDER_ENTRY = new DOLLAR_BASED_ORDER_ENTRY("DOLLAR_BASED_ORDER_ENTRY", 7);
        public static final EntryPointDto CRYPTO_DETAIL_PAGE = new CRYPTO_DETAIL_PAGE("CRYPTO_DETAIL_PAGE", 8);
        public static final EntryPointDto CRYPTO_SELECT_ORDER_KIND_PAGE = new CRYPTO_SELECT_ORDER_KIND_PAGE("CRYPTO_SELECT_ORDER_KIND_PAGE", 9);
        public static final EntryPointDto CRYPTO_ORDER_RECEIPT = new CRYPTO_ORDER_RECEIPT("CRYPTO_ORDER_RECEIPT", 10);
        public static final EntryPointDto PAYCHECK_INVESTMENT_HUB = new PAYCHECK_INVESTMENT_HUB("PAYCHECK_INVESTMENT_HUB", 11);
        public static final EntryPointDto PAYCHECK_INVESTMENT_NO_DD = new PAYCHECK_INVESTMENT_NO_DD("PAYCHECK_INVESTMENT_NO_DD", 12);
        public static final EntryPointDto ORDER_RECEIPT = new ORDER_RECEIPT("ORDER_RECEIPT", 13);
        public static final EntryPointDto SELECT_ORDER_KIND_PAGE = new SELECT_ORDER_KIND_PAGE("SELECT_ORDER_KIND_PAGE", 14);
        public static final EntryPointDto CARD = new CARD("CARD", 15);

        private static final /* synthetic */ EntryPointDto[] $values() {
            return new EntryPointDto[]{ENTRY_POINT_UNSPECIFIED, RECURRING_HUB, RECURRING_RECEIPT_UPSELL, COMMS, EQUITY_SELECT_ORDER_KIND_PAGE, EQUITY_ORDER_RECEIPT, STOCK_DETAIL_PAGE, DOLLAR_BASED_ORDER_ENTRY, CRYPTO_DETAIL_PAGE, CRYPTO_SELECT_ORDER_KIND_PAGE, CRYPTO_ORDER_RECEIPT, PAYCHECK_INVESTMENT_HUB, PAYCHECK_INVESTMENT_NO_DD, ORDER_RECEIPT, SELECT_ORDER_KIND_PAGE, CARD};
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

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.EntryPointDto.ENTRY_POINT_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ENTRY_POINT_UNSPECIFIED extends EntryPointDto {
            ENTRY_POINT_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.EntryPoint toProto() {
                return RecurringContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.RecurringContextDto$EntryPointDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecurringContextDto.EntryPointDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.EntryPointDto.RECURRING_HUB", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECURRING_HUB extends EntryPointDto {
            RECURRING_HUB(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.EntryPoint toProto() {
                return RecurringContext.EntryPoint.RECURRING_HUB;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.EntryPointDto.RECURRING_RECEIPT_UPSELL", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECURRING_RECEIPT_UPSELL extends EntryPointDto {
            RECURRING_RECEIPT_UPSELL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.EntryPoint toProto() {
                return RecurringContext.EntryPoint.RECURRING_RECEIPT_UPSELL;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.EntryPointDto.COMMS", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class COMMS extends EntryPointDto {
            COMMS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.EntryPoint toProto() {
                return RecurringContext.EntryPoint.COMMS;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.EntryPointDto.EQUITY_SELECT_ORDER_KIND_PAGE", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EQUITY_SELECT_ORDER_KIND_PAGE extends EntryPointDto {
            EQUITY_SELECT_ORDER_KIND_PAGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.EntryPoint toProto() {
                return RecurringContext.EntryPoint.EQUITY_SELECT_ORDER_KIND_PAGE;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.EntryPointDto.EQUITY_ORDER_RECEIPT", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EQUITY_ORDER_RECEIPT extends EntryPointDto {
            EQUITY_ORDER_RECEIPT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.EntryPoint toProto() {
                return RecurringContext.EntryPoint.EQUITY_ORDER_RECEIPT;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.EntryPointDto.STOCK_DETAIL_PAGE", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STOCK_DETAIL_PAGE extends EntryPointDto {
            STOCK_DETAIL_PAGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.EntryPoint toProto() {
                return RecurringContext.EntryPoint.STOCK_DETAIL_PAGE;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.EntryPointDto.DOLLAR_BASED_ORDER_ENTRY", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DOLLAR_BASED_ORDER_ENTRY extends EntryPointDto {
            DOLLAR_BASED_ORDER_ENTRY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.EntryPoint toProto() {
                return RecurringContext.EntryPoint.DOLLAR_BASED_ORDER_ENTRY;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.EntryPointDto.CRYPTO_DETAIL_PAGE", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CRYPTO_DETAIL_PAGE extends EntryPointDto {
            CRYPTO_DETAIL_PAGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.EntryPoint toProto() {
                return RecurringContext.EntryPoint.CRYPTO_DETAIL_PAGE;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.EntryPointDto.CRYPTO_SELECT_ORDER_KIND_PAGE", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CRYPTO_SELECT_ORDER_KIND_PAGE extends EntryPointDto {
            CRYPTO_SELECT_ORDER_KIND_PAGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.EntryPoint toProto() {
                return RecurringContext.EntryPoint.CRYPTO_SELECT_ORDER_KIND_PAGE;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.EntryPointDto.CRYPTO_ORDER_RECEIPT", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CRYPTO_ORDER_RECEIPT extends EntryPointDto {
            CRYPTO_ORDER_RECEIPT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.EntryPoint toProto() {
                return RecurringContext.EntryPoint.CRYPTO_ORDER_RECEIPT;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.EntryPointDto.PAYCHECK_INVESTMENT_HUB", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PAYCHECK_INVESTMENT_HUB extends EntryPointDto {
            PAYCHECK_INVESTMENT_HUB(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.EntryPoint toProto() {
                return RecurringContext.EntryPoint.PAYCHECK_INVESTMENT_HUB;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.EntryPointDto.PAYCHECK_INVESTMENT_NO_DD", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PAYCHECK_INVESTMENT_NO_DD extends EntryPointDto {
            PAYCHECK_INVESTMENT_NO_DD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.EntryPoint toProto() {
                return RecurringContext.EntryPoint.PAYCHECK_INVESTMENT_NO_DD;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.EntryPointDto.ORDER_RECEIPT", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ORDER_RECEIPT extends EntryPointDto {
            ORDER_RECEIPT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.EntryPoint toProto() {
                return RecurringContext.EntryPoint.ORDER_RECEIPT;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.EntryPointDto.SELECT_ORDER_KIND_PAGE", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SELECT_ORDER_KIND_PAGE extends EntryPointDto {
            SELECT_ORDER_KIND_PAGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.EntryPoint toProto() {
                return RecurringContext.EntryPoint.SELECT_ORDER_KIND_PAGE;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.EntryPointDto.CARD", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CARD extends EntryPointDto {
            CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.EntryPoint toProto() {
                return RecurringContext.EntryPoint.CARD;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EntryPointDto, RecurringContext.EntryPoint> {

            /* compiled from: RecurringContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[RecurringContext.EntryPoint.values().length];
                    try {
                        iArr[RecurringContext.EntryPoint.ENTRY_POINT_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[RecurringContext.EntryPoint.RECURRING_HUB.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[RecurringContext.EntryPoint.RECURRING_RECEIPT_UPSELL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[RecurringContext.EntryPoint.COMMS.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[RecurringContext.EntryPoint.EQUITY_SELECT_ORDER_KIND_PAGE.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[RecurringContext.EntryPoint.EQUITY_ORDER_RECEIPT.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[RecurringContext.EntryPoint.STOCK_DETAIL_PAGE.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[RecurringContext.EntryPoint.DOLLAR_BASED_ORDER_ENTRY.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[RecurringContext.EntryPoint.CRYPTO_DETAIL_PAGE.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[RecurringContext.EntryPoint.CRYPTO_SELECT_ORDER_KIND_PAGE.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[RecurringContext.EntryPoint.CRYPTO_ORDER_RECEIPT.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[RecurringContext.EntryPoint.PAYCHECK_INVESTMENT_HUB.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[RecurringContext.EntryPoint.PAYCHECK_INVESTMENT_NO_DD.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[RecurringContext.EntryPoint.ORDER_RECEIPT.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[RecurringContext.EntryPoint.SELECT_ORDER_KIND_PAGE.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[RecurringContext.EntryPoint.CARD.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
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
            public ProtoAdapter<RecurringContext.EntryPoint> getProtoAdapter() {
                return RecurringContext.EntryPoint.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryPointDto getZeroValue() {
                return EntryPointDto.ENTRY_POINT_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryPointDto fromProto(RecurringContext.EntryPoint proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return EntryPointDto.ENTRY_POINT_UNSPECIFIED;
                    case 2:
                        return EntryPointDto.RECURRING_HUB;
                    case 3:
                        return EntryPointDto.RECURRING_RECEIPT_UPSELL;
                    case 4:
                        return EntryPointDto.COMMS;
                    case 5:
                        return EntryPointDto.EQUITY_SELECT_ORDER_KIND_PAGE;
                    case 6:
                        return EntryPointDto.EQUITY_ORDER_RECEIPT;
                    case 7:
                        return EntryPointDto.STOCK_DETAIL_PAGE;
                    case 8:
                        return EntryPointDto.DOLLAR_BASED_ORDER_ENTRY;
                    case 9:
                        return EntryPointDto.CRYPTO_DETAIL_PAGE;
                    case 10:
                        return EntryPointDto.CRYPTO_SELECT_ORDER_KIND_PAGE;
                    case 11:
                        return EntryPointDto.CRYPTO_ORDER_RECEIPT;
                    case 12:
                        return EntryPointDto.PAYCHECK_INVESTMENT_HUB;
                    case 13:
                        return EntryPointDto.PAYCHECK_INVESTMENT_NO_DD;
                    case 14:
                        return EntryPointDto.ORDER_RECEIPT;
                    case 15:
                        return EntryPointDto.SELECT_ORDER_KIND_PAGE;
                    case 16:
                        return EntryPointDto.CARD;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$EntryPointDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<EntryPointDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EntryPointDto, RecurringContext.EntryPoint> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.RecurringContext.EntryPoint", EntryPointDto.getEntries(), EntryPointDto.INSTANCE.getZeroValue());

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
    /* compiled from: RecurringContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$ScheduleFrequencyDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$ScheduleFrequency;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SCHEDULE_FREQUENCY_UNSPECIFIED", "DAILY", "WEEKLY", "BIWEEKLY", "MONTHLY", "PAYCHECK", "ONCE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ScheduleFrequencyDto implements Dto2<RecurringContext.ScheduleFrequency>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ScheduleFrequencyDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ScheduleFrequencyDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ScheduleFrequencyDto, RecurringContext.ScheduleFrequency>> binaryBase64Serializer$delegate;
        public static final ScheduleFrequencyDto SCHEDULE_FREQUENCY_UNSPECIFIED = new SCHEDULE_FREQUENCY_UNSPECIFIED("SCHEDULE_FREQUENCY_UNSPECIFIED", 0);
        public static final ScheduleFrequencyDto DAILY = new DAILY("DAILY", 1);
        public static final ScheduleFrequencyDto WEEKLY = new WEEKLY("WEEKLY", 2);
        public static final ScheduleFrequencyDto BIWEEKLY = new BIWEEKLY("BIWEEKLY", 3);
        public static final ScheduleFrequencyDto MONTHLY = new MONTHLY("MONTHLY", 4);
        public static final ScheduleFrequencyDto PAYCHECK = new PAYCHECK("PAYCHECK", 5);
        public static final ScheduleFrequencyDto ONCE = new ONCE("ONCE", 6);

        private static final /* synthetic */ ScheduleFrequencyDto[] $values() {
            return new ScheduleFrequencyDto[]{SCHEDULE_FREQUENCY_UNSPECIFIED, DAILY, WEEKLY, BIWEEKLY, MONTHLY, PAYCHECK, ONCE};
        }

        public /* synthetic */ ScheduleFrequencyDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ScheduleFrequencyDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ScheduleFrequencyDto(String str, int i) {
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.ScheduleFrequencyDto.SCHEDULE_FREQUENCY_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$ScheduleFrequencyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$ScheduleFrequency;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SCHEDULE_FREQUENCY_UNSPECIFIED extends ScheduleFrequencyDto {
            SCHEDULE_FREQUENCY_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.ScheduleFrequency toProto() {
                return RecurringContext.ScheduleFrequency.SCHEDULE_FREQUENCY_UNSPECIFIED;
            }
        }

        static {
            ScheduleFrequencyDto[] scheduleFrequencyDtoArr$values = $values();
            $VALUES = scheduleFrequencyDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(scheduleFrequencyDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.RecurringContextDto$ScheduleFrequencyDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecurringContextDto.ScheduleFrequencyDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.ScheduleFrequencyDto.DAILY", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$ScheduleFrequencyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$ScheduleFrequency;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DAILY extends ScheduleFrequencyDto {
            DAILY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.ScheduleFrequency toProto() {
                return RecurringContext.ScheduleFrequency.DAILY;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.ScheduleFrequencyDto.WEEKLY", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$ScheduleFrequencyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$ScheduleFrequency;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WEEKLY extends ScheduleFrequencyDto {
            WEEKLY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.ScheduleFrequency toProto() {
                return RecurringContext.ScheduleFrequency.WEEKLY;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.ScheduleFrequencyDto.BIWEEKLY", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$ScheduleFrequencyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$ScheduleFrequency;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BIWEEKLY extends ScheduleFrequencyDto {
            BIWEEKLY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.ScheduleFrequency toProto() {
                return RecurringContext.ScheduleFrequency.BIWEEKLY;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.ScheduleFrequencyDto.MONTHLY", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$ScheduleFrequencyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$ScheduleFrequency;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MONTHLY extends ScheduleFrequencyDto {
            MONTHLY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.ScheduleFrequency toProto() {
                return RecurringContext.ScheduleFrequency.MONTHLY;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.ScheduleFrequencyDto.PAYCHECK", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$ScheduleFrequencyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$ScheduleFrequency;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PAYCHECK extends ScheduleFrequencyDto {
            PAYCHECK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.ScheduleFrequency toProto() {
                return RecurringContext.ScheduleFrequency.PAYCHECK;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.ScheduleFrequencyDto.ONCE", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$ScheduleFrequencyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$ScheduleFrequency;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ONCE extends ScheduleFrequencyDto {
            ONCE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.ScheduleFrequency toProto() {
                return RecurringContext.ScheduleFrequency.ONCE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$ScheduleFrequencyDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$ScheduleFrequencyDto;", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$ScheduleFrequency;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$ScheduleFrequencyDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ScheduleFrequencyDto, RecurringContext.ScheduleFrequency> {

            /* compiled from: RecurringContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[RecurringContext.ScheduleFrequency.values().length];
                    try {
                        iArr[RecurringContext.ScheduleFrequency.SCHEDULE_FREQUENCY_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[RecurringContext.ScheduleFrequency.DAILY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[RecurringContext.ScheduleFrequency.WEEKLY.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[RecurringContext.ScheduleFrequency.BIWEEKLY.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[RecurringContext.ScheduleFrequency.MONTHLY.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[RecurringContext.ScheduleFrequency.PAYCHECK.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[RecurringContext.ScheduleFrequency.ONCE.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ScheduleFrequencyDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ScheduleFrequencyDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ScheduleFrequencyDto> getBinaryBase64Serializer() {
                return (KSerializer) ScheduleFrequencyDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<RecurringContext.ScheduleFrequency> getProtoAdapter() {
                return RecurringContext.ScheduleFrequency.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ScheduleFrequencyDto getZeroValue() {
                return ScheduleFrequencyDto.SCHEDULE_FREQUENCY_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ScheduleFrequencyDto fromProto(RecurringContext.ScheduleFrequency proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return ScheduleFrequencyDto.SCHEDULE_FREQUENCY_UNSPECIFIED;
                    case 2:
                        return ScheduleFrequencyDto.DAILY;
                    case 3:
                        return ScheduleFrequencyDto.WEEKLY;
                    case 4:
                        return ScheduleFrequencyDto.BIWEEKLY;
                    case 5:
                        return ScheduleFrequencyDto.MONTHLY;
                    case 6:
                        return ScheduleFrequencyDto.PAYCHECK;
                    case 7:
                        return ScheduleFrequencyDto.ONCE;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$ScheduleFrequencyDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$ScheduleFrequencyDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ScheduleFrequencyDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ScheduleFrequencyDto, RecurringContext.ScheduleFrequency> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.RecurringContext.ScheduleFrequency", ScheduleFrequencyDto.getEntries(), ScheduleFrequencyDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ScheduleFrequencyDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ScheduleFrequencyDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ScheduleFrequencyDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ScheduleFrequencyDto valueOf(String str) {
            return (ScheduleFrequencyDto) Enum.valueOf(ScheduleFrequencyDto.class, str);
        }

        public static ScheduleFrequencyDto[] values() {
            return (ScheduleFrequencyDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecurringContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$RecurringFundsSourceDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$RecurringFundsSource;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "RECURRING_FUNDS_SOURCE_UNSPECIFIED", "BUYING_POWER", "ACH", "DIRECT_DEPOSIT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class RecurringFundsSourceDto implements Dto2<RecurringContext.RecurringFundsSource>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RecurringFundsSourceDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<RecurringFundsSourceDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<RecurringFundsSourceDto, RecurringContext.RecurringFundsSource>> binaryBase64Serializer$delegate;
        public static final RecurringFundsSourceDto RECURRING_FUNDS_SOURCE_UNSPECIFIED = new RECURRING_FUNDS_SOURCE_UNSPECIFIED("RECURRING_FUNDS_SOURCE_UNSPECIFIED", 0);
        public static final RecurringFundsSourceDto BUYING_POWER = new BUYING_POWER("BUYING_POWER", 1);
        public static final RecurringFundsSourceDto ACH = new ACH("ACH", 2);
        public static final RecurringFundsSourceDto DIRECT_DEPOSIT = new DIRECT_DEPOSIT("DIRECT_DEPOSIT", 3);

        private static final /* synthetic */ RecurringFundsSourceDto[] $values() {
            return new RecurringFundsSourceDto[]{RECURRING_FUNDS_SOURCE_UNSPECIFIED, BUYING_POWER, ACH, DIRECT_DEPOSIT};
        }

        public /* synthetic */ RecurringFundsSourceDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<RecurringFundsSourceDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private RecurringFundsSourceDto(String str, int i) {
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.RecurringFundsSourceDto.RECURRING_FUNDS_SOURCE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$RecurringFundsSourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$RecurringFundsSource;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECURRING_FUNDS_SOURCE_UNSPECIFIED extends RecurringFundsSourceDto {
            RECURRING_FUNDS_SOURCE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.RecurringFundsSource toProto() {
                return RecurringContext.RecurringFundsSource.RECURRING_FUNDS_SOURCE_UNSPECIFIED;
            }
        }

        static {
            RecurringFundsSourceDto[] recurringFundsSourceDtoArr$values = $values();
            $VALUES = recurringFundsSourceDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(recurringFundsSourceDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.RecurringContextDto$RecurringFundsSourceDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecurringContextDto.RecurringFundsSourceDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.RecurringFundsSourceDto.BUYING_POWER", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$RecurringFundsSourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$RecurringFundsSource;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BUYING_POWER extends RecurringFundsSourceDto {
            BUYING_POWER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.RecurringFundsSource toProto() {
                return RecurringContext.RecurringFundsSource.BUYING_POWER;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.RecurringFundsSourceDto.ACH", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$RecurringFundsSourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$RecurringFundsSource;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACH extends RecurringFundsSourceDto {
            ACH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.RecurringFundsSource toProto() {
                return RecurringContext.RecurringFundsSource.ACH;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.RecurringFundsSourceDto.DIRECT_DEPOSIT", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$RecurringFundsSourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$RecurringFundsSource;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DIRECT_DEPOSIT extends RecurringFundsSourceDto {
            DIRECT_DEPOSIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.RecurringFundsSource toProto() {
                return RecurringContext.RecurringFundsSource.DIRECT_DEPOSIT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$RecurringFundsSourceDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$RecurringFundsSourceDto;", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$RecurringFundsSource;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$RecurringFundsSourceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<RecurringFundsSourceDto, RecurringContext.RecurringFundsSource> {

            /* compiled from: RecurringContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[RecurringContext.RecurringFundsSource.values().length];
                    try {
                        iArr[RecurringContext.RecurringFundsSource.RECURRING_FUNDS_SOURCE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[RecurringContext.RecurringFundsSource.BUYING_POWER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[RecurringContext.RecurringFundsSource.ACH.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[RecurringContext.RecurringFundsSource.DIRECT_DEPOSIT.ordinal()] = 4;
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

            public final KSerializer<RecurringFundsSourceDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<RecurringFundsSourceDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<RecurringFundsSourceDto> getBinaryBase64Serializer() {
                return (KSerializer) RecurringFundsSourceDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<RecurringContext.RecurringFundsSource> getProtoAdapter() {
                return RecurringContext.RecurringFundsSource.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RecurringFundsSourceDto getZeroValue() {
                return RecurringFundsSourceDto.RECURRING_FUNDS_SOURCE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RecurringFundsSourceDto fromProto(RecurringContext.RecurringFundsSource proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return RecurringFundsSourceDto.RECURRING_FUNDS_SOURCE_UNSPECIFIED;
                }
                if (i == 2) {
                    return RecurringFundsSourceDto.BUYING_POWER;
                }
                if (i == 3) {
                    return RecurringFundsSourceDto.ACH;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return RecurringFundsSourceDto.DIRECT_DEPOSIT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$RecurringFundsSourceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$RecurringFundsSourceDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<RecurringFundsSourceDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<RecurringFundsSourceDto, RecurringContext.RecurringFundsSource> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.RecurringContext.RecurringFundsSource", RecurringFundsSourceDto.getEntries(), RecurringFundsSourceDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public RecurringFundsSourceDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (RecurringFundsSourceDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, RecurringFundsSourceDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static RecurringFundsSourceDto valueOf(String str) {
            return (RecurringFundsSourceDto) Enum.valueOf(RecurringFundsSourceDto.class, str);
        }

        public static RecurringFundsSourceDto[] values() {
            return (RecurringFundsSourceDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecurringContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$AssetTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$AssetType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ASSET_TYPE_UNSPECIFIED", "EQUITY", "CRYPTO", "BROKERAGE_CASH", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AssetTypeDto implements Dto2<RecurringContext.AssetType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AssetTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<AssetTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AssetTypeDto, RecurringContext.AssetType>> binaryBase64Serializer$delegate;
        public static final AssetTypeDto ASSET_TYPE_UNSPECIFIED = new ASSET_TYPE_UNSPECIFIED("ASSET_TYPE_UNSPECIFIED", 0);
        public static final AssetTypeDto EQUITY = new EQUITY("EQUITY", 1);
        public static final AssetTypeDto CRYPTO = new CRYPTO("CRYPTO", 2);
        public static final AssetTypeDto BROKERAGE_CASH = new BROKERAGE_CASH("BROKERAGE_CASH", 3);

        private static final /* synthetic */ AssetTypeDto[] $values() {
            return new AssetTypeDto[]{ASSET_TYPE_UNSPECIFIED, EQUITY, CRYPTO, BROKERAGE_CASH};
        }

        public /* synthetic */ AssetTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<AssetTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.AssetTypeDto.ASSET_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$AssetTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$AssetType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ASSET_TYPE_UNSPECIFIED extends AssetTypeDto {
            ASSET_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.AssetType toProto() {
                return RecurringContext.AssetType.ASSET_TYPE_UNSPECIFIED;
            }
        }

        private AssetTypeDto(String str, int i) {
        }

        static {
            AssetTypeDto[] assetTypeDtoArr$values = $values();
            $VALUES = assetTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(assetTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.RecurringContextDto$AssetTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecurringContextDto.AssetTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.AssetTypeDto.EQUITY", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$AssetTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$AssetType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EQUITY extends AssetTypeDto {
            EQUITY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.AssetType toProto() {
                return RecurringContext.AssetType.EQUITY;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.AssetTypeDto.CRYPTO", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$AssetTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$AssetType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CRYPTO extends AssetTypeDto {
            CRYPTO(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.AssetType toProto() {
                return RecurringContext.AssetType.CRYPTO;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.AssetTypeDto.BROKERAGE_CASH", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$AssetTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$AssetType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BROKERAGE_CASH extends AssetTypeDto {
            BROKERAGE_CASH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.AssetType toProto() {
                return RecurringContext.AssetType.BROKERAGE_CASH;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$AssetTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$AssetTypeDto;", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$AssetType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$AssetTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<AssetTypeDto, RecurringContext.AssetType> {

            /* compiled from: RecurringContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[RecurringContext.AssetType.values().length];
                    try {
                        iArr[RecurringContext.AssetType.ASSET_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[RecurringContext.AssetType.EQUITY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[RecurringContext.AssetType.CRYPTO.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[RecurringContext.AssetType.BROKERAGE_CASH.ordinal()] = 4;
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

            public final KSerializer<AssetTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AssetTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AssetTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) AssetTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<RecurringContext.AssetType> getProtoAdapter() {
                return RecurringContext.AssetType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AssetTypeDto getZeroValue() {
                return AssetTypeDto.ASSET_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AssetTypeDto fromProto(RecurringContext.AssetType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return AssetTypeDto.ASSET_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return AssetTypeDto.EQUITY;
                }
                if (i == 3) {
                    return AssetTypeDto.CRYPTO;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return AssetTypeDto.BROKERAGE_CASH;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$AssetTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$AssetTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<AssetTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<AssetTypeDto, RecurringContext.AssetType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.RecurringContext.AssetType", AssetTypeDto.getEntries(), AssetTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public AssetTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (AssetTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AssetTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static AssetTypeDto valueOf(String str) {
            return (AssetTypeDto) Enum.valueOf(AssetTypeDto.class, str);
        }

        public static AssetTypeDto[] values() {
            return (AssetTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecurringContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$UpsellTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$UpsellType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "UPSELL_TYPE_UNSPECIFIED", "AGGRESSIVE", "QUIET", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class UpsellTypeDto implements Dto2<RecurringContext.UpsellType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UpsellTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<UpsellTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<UpsellTypeDto, RecurringContext.UpsellType>> binaryBase64Serializer$delegate;
        public static final UpsellTypeDto UPSELL_TYPE_UNSPECIFIED = new UPSELL_TYPE_UNSPECIFIED("UPSELL_TYPE_UNSPECIFIED", 0);
        public static final UpsellTypeDto AGGRESSIVE = new AGGRESSIVE("AGGRESSIVE", 1);
        public static final UpsellTypeDto QUIET = new QUIET("QUIET", 2);

        private static final /* synthetic */ UpsellTypeDto[] $values() {
            return new UpsellTypeDto[]{UPSELL_TYPE_UNSPECIFIED, AGGRESSIVE, QUIET};
        }

        public /* synthetic */ UpsellTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<UpsellTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.UpsellTypeDto.UPSELL_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$UpsellTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$UpsellType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UPSELL_TYPE_UNSPECIFIED extends UpsellTypeDto {
            UPSELL_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.UpsellType toProto() {
                return RecurringContext.UpsellType.UPSELL_TYPE_UNSPECIFIED;
            }
        }

        private UpsellTypeDto(String str, int i) {
        }

        static {
            UpsellTypeDto[] upsellTypeDtoArr$values = $values();
            $VALUES = upsellTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(upsellTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.RecurringContextDto$UpsellTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecurringContextDto.UpsellTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.UpsellTypeDto.AGGRESSIVE", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$UpsellTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$UpsellType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class AGGRESSIVE extends UpsellTypeDto {
            AGGRESSIVE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.UpsellType toProto() {
                return RecurringContext.UpsellType.AGGRESSIVE;
            }
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecurringContextDto.UpsellTypeDto.QUIET", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$UpsellTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$UpsellType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class QUIET extends UpsellTypeDto {
            QUIET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringContext.UpsellType toProto() {
                return RecurringContext.UpsellType.QUIET;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$UpsellTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$UpsellTypeDto;", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$UpsellType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$UpsellTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<UpsellTypeDto, RecurringContext.UpsellType> {

            /* compiled from: RecurringContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[RecurringContext.UpsellType.values().length];
                    try {
                        iArr[RecurringContext.UpsellType.UPSELL_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[RecurringContext.UpsellType.AGGRESSIVE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[RecurringContext.UpsellType.QUIET.ordinal()] = 3;
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

            public final KSerializer<UpsellTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<UpsellTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<UpsellTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) UpsellTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<RecurringContext.UpsellType> getProtoAdapter() {
                return RecurringContext.UpsellType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public UpsellTypeDto getZeroValue() {
                return UpsellTypeDto.UPSELL_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public UpsellTypeDto fromProto(RecurringContext.UpsellType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return UpsellTypeDto.UPSELL_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return UpsellTypeDto.AGGRESSIVE;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return UpsellTypeDto.QUIET;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RecurringContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$UpsellTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$UpsellTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<UpsellTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<UpsellTypeDto, RecurringContext.UpsellType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.RecurringContext.UpsellType", UpsellTypeDto.getEntries(), UpsellTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public UpsellTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (UpsellTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, UpsellTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static UpsellTypeDto valueOf(String str) {
            return (UpsellTypeDto) Enum.valueOf(UpsellTypeDto.class, str);
        }

        public static UpsellTypeDto[] values() {
            return (UpsellTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: RecurringContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<RecurringContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.RecurringContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, RecurringContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public RecurringContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new RecurringContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: RecurringContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecurringContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.RecurringContextDto";
        }
    }
}
