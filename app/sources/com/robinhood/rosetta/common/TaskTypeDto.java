package com.robinhood.rosetta.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TaskTypeDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001c\u001dB\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rosetta/common/TaskTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/common/TaskType;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "TASK_TYPE_UNSPECIFIED", "SICKLE_SYNC_MARGIN_UPDATES", "SICKLE_SYNC_MARGIN_CALLS", "SICKLE_SYNC_MARGIN_UPDATES_V1", "SICKLE_SYNC_PRELIM_RESTRICTIONS", "SICKLE_GK_NIGHTLY_SYNC", "SICKLE_MTM", "YODA_ADVISORY_FEE", "FUTURES_INTER_ENTITY_CASH_TRANSFER", "SWAPS_EOD", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public abstract class TaskTypeDto implements Dto2<TaskType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TaskTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<TaskTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TaskTypeDto, TaskType>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final TaskTypeDto TASK_TYPE_UNSPECIFIED = new TaskTypeDto("TASK_TYPE_UNSPECIFIED", 0) { // from class: com.robinhood.rosetta.common.TaskTypeDto.TASK_TYPE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TaskType toProto() {
            return TaskType.TASK_TYPE_UNSPECIFIED;
        }
    };
    public static final TaskTypeDto SICKLE_SYNC_MARGIN_UPDATES = new TaskTypeDto("SICKLE_SYNC_MARGIN_UPDATES", 1) { // from class: com.robinhood.rosetta.common.TaskTypeDto.SICKLE_SYNC_MARGIN_UPDATES
        {
            String str = "sickle_sync_margin_updates";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TaskType toProto() {
            return TaskType.SICKLE_SYNC_MARGIN_UPDATES;
        }
    };
    public static final TaskTypeDto SICKLE_SYNC_MARGIN_CALLS = new TaskTypeDto("SICKLE_SYNC_MARGIN_CALLS", 2) { // from class: com.robinhood.rosetta.common.TaskTypeDto.SICKLE_SYNC_MARGIN_CALLS
        {
            String str = "sickle_sync_margin_calls";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TaskType toProto() {
            return TaskType.SICKLE_SYNC_MARGIN_CALLS;
        }
    };
    public static final TaskTypeDto SICKLE_SYNC_MARGIN_UPDATES_V1 = new TaskTypeDto("SICKLE_SYNC_MARGIN_UPDATES_V1", 3) { // from class: com.robinhood.rosetta.common.TaskTypeDto.SICKLE_SYNC_MARGIN_UPDATES_V1
        {
            String str = "sickle_sync_margin_updates_v1";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TaskType toProto() {
            return TaskType.SICKLE_SYNC_MARGIN_UPDATES_V1;
        }
    };
    public static final TaskTypeDto SICKLE_SYNC_PRELIM_RESTRICTIONS = new TaskTypeDto("SICKLE_SYNC_PRELIM_RESTRICTIONS", 4) { // from class: com.robinhood.rosetta.common.TaskTypeDto.SICKLE_SYNC_PRELIM_RESTRICTIONS
        {
            String str = "sickle_sync_prelim_restrictions";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TaskType toProto() {
            return TaskType.SICKLE_SYNC_PRELIM_RESTRICTIONS;
        }
    };
    public static final TaskTypeDto SICKLE_GK_NIGHTLY_SYNC = new TaskTypeDto("SICKLE_GK_NIGHTLY_SYNC", 5) { // from class: com.robinhood.rosetta.common.TaskTypeDto.SICKLE_GK_NIGHTLY_SYNC
        {
            String str = "sickle_gk_nightly_sync";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TaskType toProto() {
            return TaskType.SICKLE_GK_NIGHTLY_SYNC;
        }
    };
    public static final TaskTypeDto SICKLE_MTM = new TaskTypeDto("SICKLE_MTM", 6) { // from class: com.robinhood.rosetta.common.TaskTypeDto.SICKLE_MTM
        {
            String str = "sickle_mtm";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TaskType toProto() {
            return TaskType.SICKLE_MTM;
        }
    };
    public static final TaskTypeDto YODA_ADVISORY_FEE = new TaskTypeDto("YODA_ADVISORY_FEE", 7) { // from class: com.robinhood.rosetta.common.TaskTypeDto.YODA_ADVISORY_FEE
        {
            String str = "yoda_advisory_fee";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TaskType toProto() {
            return TaskType.YODA_ADVISORY_FEE;
        }
    };
    public static final TaskTypeDto FUTURES_INTER_ENTITY_CASH_TRANSFER = new TaskTypeDto("FUTURES_INTER_ENTITY_CASH_TRANSFER", 8) { // from class: com.robinhood.rosetta.common.TaskTypeDto.FUTURES_INTER_ENTITY_CASH_TRANSFER
        {
            String str = "futures_inter_entity_cash_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TaskType toProto() {
            return TaskType.FUTURES_INTER_ENTITY_CASH_TRANSFER;
        }
    };
    public static final TaskTypeDto SWAPS_EOD = new TaskTypeDto("SWAPS_EOD", 9) { // from class: com.robinhood.rosetta.common.TaskTypeDto.SWAPS_EOD
        {
            String str = "swaps_eod";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TaskType toProto() {
            return TaskType.SWAPS_EOD;
        }
    };

    private static final /* synthetic */ TaskTypeDto[] $values() {
        return new TaskTypeDto[]{TASK_TYPE_UNSPECIFIED, SICKLE_SYNC_MARGIN_UPDATES, SICKLE_SYNC_MARGIN_CALLS, SICKLE_SYNC_MARGIN_UPDATES_V1, SICKLE_SYNC_PRELIM_RESTRICTIONS, SICKLE_GK_NIGHTLY_SYNC, SICKLE_MTM, YODA_ADVISORY_FEE, FUTURES_INTER_ENTITY_CASH_TRANSFER, SWAPS_EOD};
    }

    public /* synthetic */ TaskTypeDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<TaskTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TaskTypeDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        TaskTypeDto[] taskTypeDtoArr$values = $values();
        $VALUES = taskTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(taskTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.common.TaskTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaskTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: TaskTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/common/TaskTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/common/TaskTypeDto;", "Lcom/robinhood/rosetta/common/TaskType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/common/TaskTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<TaskTypeDto, TaskType> {

        /* compiled from: TaskTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TaskType.values().length];
                try {
                    iArr[TaskType.TASK_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TaskType.SICKLE_SYNC_MARGIN_UPDATES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TaskType.SICKLE_SYNC_MARGIN_CALLS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TaskType.SICKLE_SYNC_MARGIN_UPDATES_V1.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[TaskType.SICKLE_SYNC_PRELIM_RESTRICTIONS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[TaskType.SICKLE_GK_NIGHTLY_SYNC.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[TaskType.SICKLE_MTM.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[TaskType.YODA_ADVISORY_FEE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[TaskType.FUTURES_INTER_ENTITY_CASH_TRANSFER.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[TaskType.SWAPS_EOD.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TaskTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaskTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaskTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) TaskTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TaskType> getProtoAdapter() {
            return TaskType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaskTypeDto getZeroValue() {
            return TaskTypeDto.TASK_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaskTypeDto fromProto(TaskType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return TaskTypeDto.TASK_TYPE_UNSPECIFIED;
                case 2:
                    return TaskTypeDto.SICKLE_SYNC_MARGIN_UPDATES;
                case 3:
                    return TaskTypeDto.SICKLE_SYNC_MARGIN_CALLS;
                case 4:
                    return TaskTypeDto.SICKLE_SYNC_MARGIN_UPDATES_V1;
                case 5:
                    return TaskTypeDto.SICKLE_SYNC_PRELIM_RESTRICTIONS;
                case 6:
                    return TaskTypeDto.SICKLE_GK_NIGHTLY_SYNC;
                case 7:
                    return TaskTypeDto.SICKLE_MTM;
                case 8:
                    return TaskTypeDto.YODA_ADVISORY_FEE;
                case 9:
                    return TaskTypeDto.FUTURES_INTER_ENTITY_CASH_TRANSFER;
                case 10:
                    return TaskTypeDto.SWAPS_EOD;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TaskTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/common/TaskTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/common/TaskTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<TaskTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<TaskTypeDto, TaskType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.common.TaskType", TaskTypeDto.getEntries(), TaskTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public TaskTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (TaskTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TaskTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static TaskTypeDto valueOf(String str) {
        return (TaskTypeDto) Enum.valueOf(TaskTypeDto.class, str);
    }

    public static TaskTypeDto[] values() {
        return (TaskTypeDto[]) $VALUES.clone();
    }
}
