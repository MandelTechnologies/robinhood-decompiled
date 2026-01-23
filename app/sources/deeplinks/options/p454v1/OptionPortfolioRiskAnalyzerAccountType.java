package deeplinks.options.p454v1;

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
/* compiled from: OptionPortfolioRiskAnalyzerAccountType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerAccountType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACCOUNT_TYPE_UNSPECIFIED", "INDIVIDUAL", "IRA_ROTH", "IRA_TRADITIONAL", "JOINT_TENANCY_WITH_ROS", "Companion", "deeplinks.options_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class OptionPortfolioRiskAnalyzerAccountType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionPortfolioRiskAnalyzerAccountType[] $VALUES;
    public static final OptionPortfolioRiskAnalyzerAccountType ACCOUNT_TYPE_UNSPECIFIED;

    @JvmField
    public static final ProtoAdapter<OptionPortfolioRiskAnalyzerAccountType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final OptionPortfolioRiskAnalyzerAccountType INDIVIDUAL;
    public static final OptionPortfolioRiskAnalyzerAccountType IRA_ROTH;
    public static final OptionPortfolioRiskAnalyzerAccountType IRA_TRADITIONAL;
    public static final OptionPortfolioRiskAnalyzerAccountType JOINT_TENANCY_WITH_ROS;
    private final int value;

    private static final /* synthetic */ OptionPortfolioRiskAnalyzerAccountType[] $values() {
        return new OptionPortfolioRiskAnalyzerAccountType[]{ACCOUNT_TYPE_UNSPECIFIED, INDIVIDUAL, IRA_ROTH, IRA_TRADITIONAL, JOINT_TENANCY_WITH_ROS};
    }

    @JvmStatic
    public static final OptionPortfolioRiskAnalyzerAccountType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<OptionPortfolioRiskAnalyzerAccountType> getEntries() {
        return $ENTRIES;
    }

    private OptionPortfolioRiskAnalyzerAccountType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final OptionPortfolioRiskAnalyzerAccountType optionPortfolioRiskAnalyzerAccountType = new OptionPortfolioRiskAnalyzerAccountType("ACCOUNT_TYPE_UNSPECIFIED", 0, 0);
        ACCOUNT_TYPE_UNSPECIFIED = optionPortfolioRiskAnalyzerAccountType;
        INDIVIDUAL = new OptionPortfolioRiskAnalyzerAccountType("INDIVIDUAL", 1, 1);
        IRA_ROTH = new OptionPortfolioRiskAnalyzerAccountType("IRA_ROTH", 2, 2);
        IRA_TRADITIONAL = new OptionPortfolioRiskAnalyzerAccountType("IRA_TRADITIONAL", 3, 3);
        JOINT_TENANCY_WITH_ROS = new OptionPortfolioRiskAnalyzerAccountType("JOINT_TENANCY_WITH_ROS", 4, 4);
        OptionPortfolioRiskAnalyzerAccountType[] optionPortfolioRiskAnalyzerAccountTypeArr$values = $values();
        $VALUES = optionPortfolioRiskAnalyzerAccountTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionPortfolioRiskAnalyzerAccountTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionPortfolioRiskAnalyzerAccountType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<OptionPortfolioRiskAnalyzerAccountType>(orCreateKotlinClass, syntax, optionPortfolioRiskAnalyzerAccountType) { // from class: deeplinks.options.v1.OptionPortfolioRiskAnalyzerAccountType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public OptionPortfolioRiskAnalyzerAccountType fromValue(int value) {
                return OptionPortfolioRiskAnalyzerAccountType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: OptionPortfolioRiskAnalyzerAccountType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerAccountType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerAccountType;", "fromValue", "value", "", "deeplinks.options_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionPortfolioRiskAnalyzerAccountType fromValue(int value) {
            if (value == 0) {
                return OptionPortfolioRiskAnalyzerAccountType.ACCOUNT_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return OptionPortfolioRiskAnalyzerAccountType.INDIVIDUAL;
            }
            if (value == 2) {
                return OptionPortfolioRiskAnalyzerAccountType.IRA_ROTH;
            }
            if (value == 3) {
                return OptionPortfolioRiskAnalyzerAccountType.IRA_TRADITIONAL;
            }
            if (value != 4) {
                return null;
            }
            return OptionPortfolioRiskAnalyzerAccountType.JOINT_TENANCY_WITH_ROS;
        }
    }

    public static OptionPortfolioRiskAnalyzerAccountType valueOf(String str) {
        return (OptionPortfolioRiskAnalyzerAccountType) Enum.valueOf(OptionPortfolioRiskAnalyzerAccountType.class, str);
    }

    public static OptionPortfolioRiskAnalyzerAccountType[] values() {
        return (OptionPortfolioRiskAnalyzerAccountType[]) $VALUES.clone();
    }
}
