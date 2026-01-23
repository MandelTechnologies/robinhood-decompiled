package yoda.service.insight;

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
/* compiled from: InsightType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lyoda/service/insight/InsightType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INSIGHT_TYPE_UNSPECIFIED", "INSIGHT_TYPE_MARKET_INSIGHT", "INSIGHT_TYPE_PORTFOLIO_UPDATE", "INSIGHT_TYPE_GENERAL", "INSIGHT_TYPE_QUARTERLY_REVIEW", "Companion", "yoda.v1.insight_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class InsightType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InsightType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<InsightType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final InsightType INSIGHT_TYPE_GENERAL;
    public static final InsightType INSIGHT_TYPE_MARKET_INSIGHT;
    public static final InsightType INSIGHT_TYPE_PORTFOLIO_UPDATE;
    public static final InsightType INSIGHT_TYPE_QUARTERLY_REVIEW;
    public static final InsightType INSIGHT_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ InsightType[] $values() {
        return new InsightType[]{INSIGHT_TYPE_UNSPECIFIED, INSIGHT_TYPE_MARKET_INSIGHT, INSIGHT_TYPE_PORTFOLIO_UPDATE, INSIGHT_TYPE_GENERAL, INSIGHT_TYPE_QUARTERLY_REVIEW};
    }

    @JvmStatic
    public static final InsightType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<InsightType> getEntries() {
        return $ENTRIES;
    }

    private InsightType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final InsightType insightType = new InsightType("INSIGHT_TYPE_UNSPECIFIED", 0, 0);
        INSIGHT_TYPE_UNSPECIFIED = insightType;
        INSIGHT_TYPE_MARKET_INSIGHT = new InsightType("INSIGHT_TYPE_MARKET_INSIGHT", 1, 1);
        INSIGHT_TYPE_PORTFOLIO_UPDATE = new InsightType("INSIGHT_TYPE_PORTFOLIO_UPDATE", 2, 2);
        INSIGHT_TYPE_GENERAL = new InsightType("INSIGHT_TYPE_GENERAL", 3, 3);
        INSIGHT_TYPE_QUARTERLY_REVIEW = new InsightType("INSIGHT_TYPE_QUARTERLY_REVIEW", 4, 4);
        InsightType[] insightTypeArr$values = $values();
        $VALUES = insightTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(insightTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InsightType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<InsightType>(orCreateKotlinClass, syntax, insightType) { // from class: yoda.service.insight.InsightType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public InsightType fromValue(int value) {
                return InsightType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: InsightType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lyoda/service/insight/InsightType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lyoda/service/insight/InsightType;", "fromValue", "value", "", "yoda.v1.insight_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InsightType fromValue(int value) {
            if (value == 0) {
                return InsightType.INSIGHT_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return InsightType.INSIGHT_TYPE_MARKET_INSIGHT;
            }
            if (value == 2) {
                return InsightType.INSIGHT_TYPE_PORTFOLIO_UPDATE;
            }
            if (value == 3) {
                return InsightType.INSIGHT_TYPE_GENERAL;
            }
            if (value != 4) {
                return null;
            }
            return InsightType.INSIGHT_TYPE_QUARTERLY_REVIEW;
        }
    }

    public static InsightType valueOf(String str) {
        return (InsightType) Enum.valueOf(InsightType.class, str);
    }

    public static InsightType[] values() {
        return (InsightType[]) $VALUES.clone();
    }
}
