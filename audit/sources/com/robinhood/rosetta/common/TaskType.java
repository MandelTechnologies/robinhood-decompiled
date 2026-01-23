package com.robinhood.rosetta.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TaskType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/common/TaskType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TASK_TYPE_UNSPECIFIED", "SICKLE_SYNC_MARGIN_UPDATES", "SICKLE_SYNC_MARGIN_CALLS", "SICKLE_SYNC_MARGIN_UPDATES_V1", "SICKLE_SYNC_PRELIM_RESTRICTIONS", "SICKLE_GK_NIGHTLY_SYNC", "SICKLE_MTM", "YODA_ADVISORY_FEE", "FUTURES_INTER_ENTITY_CASH_TRANSFER", "SWAPS_EOD", "Companion", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class TaskType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TaskType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<TaskType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TaskType FUTURES_INTER_ENTITY_CASH_TRANSFER;
    public static final TaskType SICKLE_GK_NIGHTLY_SYNC;
    public static final TaskType SICKLE_MTM;
    public static final TaskType SICKLE_SYNC_MARGIN_CALLS;
    public static final TaskType SICKLE_SYNC_MARGIN_UPDATES;
    public static final TaskType SICKLE_SYNC_MARGIN_UPDATES_V1;
    public static final TaskType SICKLE_SYNC_PRELIM_RESTRICTIONS;
    public static final TaskType SWAPS_EOD;
    public static final TaskType TASK_TYPE_UNSPECIFIED;
    public static final TaskType YODA_ADVISORY_FEE;
    private final int value;

    private static final /* synthetic */ TaskType[] $values() {
        return new TaskType[]{TASK_TYPE_UNSPECIFIED, SICKLE_SYNC_MARGIN_UPDATES, SICKLE_SYNC_MARGIN_CALLS, SICKLE_SYNC_MARGIN_UPDATES_V1, SICKLE_SYNC_PRELIM_RESTRICTIONS, SICKLE_GK_NIGHTLY_SYNC, SICKLE_MTM, YODA_ADVISORY_FEE, FUTURES_INTER_ENTITY_CASH_TRANSFER, SWAPS_EOD};
    }

    @JvmStatic
    public static final TaskType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<TaskType> getEntries() {
        return $ENTRIES;
    }

    private TaskType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final TaskType taskType = new TaskType("TASK_TYPE_UNSPECIFIED", 0, 0);
        TASK_TYPE_UNSPECIFIED = taskType;
        SICKLE_SYNC_MARGIN_UPDATES = new TaskType("SICKLE_SYNC_MARGIN_UPDATES", 1, 1);
        SICKLE_SYNC_MARGIN_CALLS = new TaskType("SICKLE_SYNC_MARGIN_CALLS", 2, 2);
        SICKLE_SYNC_MARGIN_UPDATES_V1 = new TaskType("SICKLE_SYNC_MARGIN_UPDATES_V1", 3, 3);
        SICKLE_SYNC_PRELIM_RESTRICTIONS = new TaskType("SICKLE_SYNC_PRELIM_RESTRICTIONS", 4, 4);
        SICKLE_GK_NIGHTLY_SYNC = new TaskType("SICKLE_GK_NIGHTLY_SYNC", 5, 8);
        SICKLE_MTM = new TaskType("SICKLE_MTM", 6, 9);
        YODA_ADVISORY_FEE = new TaskType("YODA_ADVISORY_FEE", 7, 5);
        FUTURES_INTER_ENTITY_CASH_TRANSFER = new TaskType("FUTURES_INTER_ENTITY_CASH_TRANSFER", 8, 6);
        SWAPS_EOD = new TaskType("SWAPS_EOD", 9, 7);
        TaskType[] taskTypeArr$values = $values();
        $VALUES = taskTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(taskTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaskType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TaskType>(orCreateKotlinClass, syntax, taskType) { // from class: com.robinhood.rosetta.common.TaskType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TaskType fromValue(int value) {
                return TaskType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TaskType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/common/TaskType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/common/TaskType;", "fromValue", "value", "", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TaskType fromValue(int value) {
            switch (value) {
                case 0:
                    return TaskType.TASK_TYPE_UNSPECIFIED;
                case 1:
                    return TaskType.SICKLE_SYNC_MARGIN_UPDATES;
                case 2:
                    return TaskType.SICKLE_SYNC_MARGIN_CALLS;
                case 3:
                    return TaskType.SICKLE_SYNC_MARGIN_UPDATES_V1;
                case 4:
                    return TaskType.SICKLE_SYNC_PRELIM_RESTRICTIONS;
                case 5:
                    return TaskType.YODA_ADVISORY_FEE;
                case 6:
                    return TaskType.FUTURES_INTER_ENTITY_CASH_TRANSFER;
                case 7:
                    return TaskType.SWAPS_EOD;
                case 8:
                    return TaskType.SICKLE_GK_NIGHTLY_SYNC;
                case 9:
                    return TaskType.SICKLE_MTM;
                default:
                    return null;
            }
        }
    }

    public static TaskType valueOf(String str) {
        return (TaskType) Enum.valueOf(TaskType.class, str);
    }

    public static TaskType[] values() {
        return (TaskType[]) $VALUES.clone();
    }
}
