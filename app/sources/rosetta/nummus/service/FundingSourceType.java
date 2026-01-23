package rosetta.nummus.service;

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
/* compiled from: FundingSourceType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lrosetta/nummus/service/FundingSourceType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FUNDING_SOURCE_TYPE__UNSPECIFIED", "FUNDING_SOURCE_TYPE_RHS_BROKERAGE_ACCOUNT", "FUNDING_SOURCE_TYPE_RHY_SPENDING_ACCOUNT", "FUNDING_SOURCE_TYPE_RHCE_ACCOUNT", "Companion", "rosetta.nummus.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class FundingSourceType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FundingSourceType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<FundingSourceType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final FundingSourceType FUNDING_SOURCE_TYPE_RHCE_ACCOUNT;
    public static final FundingSourceType FUNDING_SOURCE_TYPE_RHS_BROKERAGE_ACCOUNT;
    public static final FundingSourceType FUNDING_SOURCE_TYPE_RHY_SPENDING_ACCOUNT;
    public static final FundingSourceType FUNDING_SOURCE_TYPE__UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ FundingSourceType[] $values() {
        return new FundingSourceType[]{FUNDING_SOURCE_TYPE__UNSPECIFIED, FUNDING_SOURCE_TYPE_RHS_BROKERAGE_ACCOUNT, FUNDING_SOURCE_TYPE_RHY_SPENDING_ACCOUNT, FUNDING_SOURCE_TYPE_RHCE_ACCOUNT};
    }

    @JvmStatic
    public static final FundingSourceType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<FundingSourceType> getEntries() {
        return $ENTRIES;
    }

    private FundingSourceType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final FundingSourceType fundingSourceType = new FundingSourceType("FUNDING_SOURCE_TYPE__UNSPECIFIED", 0, 0);
        FUNDING_SOURCE_TYPE__UNSPECIFIED = fundingSourceType;
        FUNDING_SOURCE_TYPE_RHS_BROKERAGE_ACCOUNT = new FundingSourceType("FUNDING_SOURCE_TYPE_RHS_BROKERAGE_ACCOUNT", 1, 1);
        FUNDING_SOURCE_TYPE_RHY_SPENDING_ACCOUNT = new FundingSourceType("FUNDING_SOURCE_TYPE_RHY_SPENDING_ACCOUNT", 2, 2);
        FUNDING_SOURCE_TYPE_RHCE_ACCOUNT = new FundingSourceType("FUNDING_SOURCE_TYPE_RHCE_ACCOUNT", 3, 3);
        FundingSourceType[] fundingSourceTypeArr$values = $values();
        $VALUES = fundingSourceTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(fundingSourceTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FundingSourceType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<FundingSourceType>(orCreateKotlinClass, syntax, fundingSourceType) { // from class: rosetta.nummus.service.FundingSourceType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public FundingSourceType fromValue(int value) {
                return FundingSourceType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: FundingSourceType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/nummus/service/FundingSourceType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/nummus/service/FundingSourceType;", "fromValue", "value", "", "rosetta.nummus.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FundingSourceType fromValue(int value) {
            if (value == 0) {
                return FundingSourceType.FUNDING_SOURCE_TYPE__UNSPECIFIED;
            }
            if (value == 1) {
                return FundingSourceType.FUNDING_SOURCE_TYPE_RHS_BROKERAGE_ACCOUNT;
            }
            if (value == 2) {
                return FundingSourceType.FUNDING_SOURCE_TYPE_RHY_SPENDING_ACCOUNT;
            }
            if (value != 3) {
                return null;
            }
            return FundingSourceType.FUNDING_SOURCE_TYPE_RHCE_ACCOUNT;
        }
    }

    public static FundingSourceType valueOf(String str) {
        return (FundingSourceType) Enum.valueOf(FundingSourceType.class, str);
    }

    public static FundingSourceType[] values() {
        return (FundingSourceType[]) $VALUES.clone();
    }
}
