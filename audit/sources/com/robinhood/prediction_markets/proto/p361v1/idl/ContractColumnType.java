package com.robinhood.prediction_markets.proto.p361v1.idl;

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
/* compiled from: ContractColumnType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CONTRACT_COLUMN_TYPE_UNSPECIFIED", "CONTRACT_COLUMN_TYPE_YES_NO", "CONTRACT_COLUMN_TYPE_ALTERNATE_STRIKE", "CONTRACT_COLUMN_TYPE_PREPACK", "CONTRACT_COLUMN_TYPE_PROPS", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ContractColumnType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContractColumnType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ContractColumnType> ADAPTER;
    public static final ContractColumnType CONTRACT_COLUMN_TYPE_ALTERNATE_STRIKE;
    public static final ContractColumnType CONTRACT_COLUMN_TYPE_PREPACK;
    public static final ContractColumnType CONTRACT_COLUMN_TYPE_PROPS;
    public static final ContractColumnType CONTRACT_COLUMN_TYPE_UNSPECIFIED;
    public static final ContractColumnType CONTRACT_COLUMN_TYPE_YES_NO;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ ContractColumnType[] $values() {
        return new ContractColumnType[]{CONTRACT_COLUMN_TYPE_UNSPECIFIED, CONTRACT_COLUMN_TYPE_YES_NO, CONTRACT_COLUMN_TYPE_ALTERNATE_STRIKE, CONTRACT_COLUMN_TYPE_PREPACK, CONTRACT_COLUMN_TYPE_PROPS};
    }

    @JvmStatic
    public static final ContractColumnType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ContractColumnType> getEntries() {
        return $ENTRIES;
    }

    private ContractColumnType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ContractColumnType contractColumnType = new ContractColumnType("CONTRACT_COLUMN_TYPE_UNSPECIFIED", 0, 0);
        CONTRACT_COLUMN_TYPE_UNSPECIFIED = contractColumnType;
        CONTRACT_COLUMN_TYPE_YES_NO = new ContractColumnType("CONTRACT_COLUMN_TYPE_YES_NO", 1, 1);
        CONTRACT_COLUMN_TYPE_ALTERNATE_STRIKE = new ContractColumnType("CONTRACT_COLUMN_TYPE_ALTERNATE_STRIKE", 2, 2);
        CONTRACT_COLUMN_TYPE_PREPACK = new ContractColumnType("CONTRACT_COLUMN_TYPE_PREPACK", 3, 3);
        CONTRACT_COLUMN_TYPE_PROPS = new ContractColumnType("CONTRACT_COLUMN_TYPE_PROPS", 4, 4);
        ContractColumnType[] contractColumnTypeArr$values = $values();
        $VALUES = contractColumnTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(contractColumnTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ContractColumnType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ContractColumnType>(orCreateKotlinClass, syntax, contractColumnType) { // from class: com.robinhood.prediction_markets.proto.v1.idl.ContractColumnType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ContractColumnType fromValue(int value) {
                return ContractColumnType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ContractColumnType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnType;", "fromValue", "value", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ContractColumnType fromValue(int value) {
            if (value == 0) {
                return ContractColumnType.CONTRACT_COLUMN_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return ContractColumnType.CONTRACT_COLUMN_TYPE_YES_NO;
            }
            if (value == 2) {
                return ContractColumnType.CONTRACT_COLUMN_TYPE_ALTERNATE_STRIKE;
            }
            if (value == 3) {
                return ContractColumnType.CONTRACT_COLUMN_TYPE_PREPACK;
            }
            if (value != 4) {
                return null;
            }
            return ContractColumnType.CONTRACT_COLUMN_TYPE_PROPS;
        }
    }

    public static ContractColumnType valueOf(String str) {
        return (ContractColumnType) Enum.valueOf(ContractColumnType.class, str);
    }

    public static ContractColumnType[] values() {
        return (ContractColumnType[]) $VALUES.clone();
    }
}
