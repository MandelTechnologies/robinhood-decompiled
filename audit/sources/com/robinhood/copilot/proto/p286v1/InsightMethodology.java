package com.robinhood.copilot.proto.p286v1;

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
/* compiled from: InsightMethodology.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightMethodology;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INSIGHT_METHODOLOGY_UNSPECIFIED", "IMPLIED_VOL_RANGE", "IMPLIED_EARNINGS_BASED_MOVE", "ANALYST_CONSENSUS", "RELATIVE_VALUATION", "MOMENTUM_BASED_1_MONTH", "MOMENTUM_BASED_3_MONTH", "MOMENTUM_BASED_6_MONTH", "MOMENTUM_BASED_9_MONTH", "MOMENTUM_BASED_12_MONTH", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class InsightMethodology implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InsightMethodology[] $VALUES;

    @JvmField
    public static final ProtoAdapter<InsightMethodology> ADAPTER;
    public static final InsightMethodology ANALYST_CONSENSUS;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final InsightMethodology IMPLIED_EARNINGS_BASED_MOVE;
    public static final InsightMethodology IMPLIED_VOL_RANGE;
    public static final InsightMethodology INSIGHT_METHODOLOGY_UNSPECIFIED;
    public static final InsightMethodology MOMENTUM_BASED_12_MONTH;
    public static final InsightMethodology MOMENTUM_BASED_1_MONTH;
    public static final InsightMethodology MOMENTUM_BASED_3_MONTH;
    public static final InsightMethodology MOMENTUM_BASED_6_MONTH;
    public static final InsightMethodology MOMENTUM_BASED_9_MONTH;
    public static final InsightMethodology RELATIVE_VALUATION;
    private final int value;

    private static final /* synthetic */ InsightMethodology[] $values() {
        return new InsightMethodology[]{INSIGHT_METHODOLOGY_UNSPECIFIED, IMPLIED_VOL_RANGE, IMPLIED_EARNINGS_BASED_MOVE, ANALYST_CONSENSUS, RELATIVE_VALUATION, MOMENTUM_BASED_1_MONTH, MOMENTUM_BASED_3_MONTH, MOMENTUM_BASED_6_MONTH, MOMENTUM_BASED_9_MONTH, MOMENTUM_BASED_12_MONTH};
    }

    @JvmStatic
    public static final InsightMethodology fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<InsightMethodology> getEntries() {
        return $ENTRIES;
    }

    private InsightMethodology(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final InsightMethodology insightMethodology = new InsightMethodology("INSIGHT_METHODOLOGY_UNSPECIFIED", 0, 0);
        INSIGHT_METHODOLOGY_UNSPECIFIED = insightMethodology;
        IMPLIED_VOL_RANGE = new InsightMethodology("IMPLIED_VOL_RANGE", 1, 1);
        IMPLIED_EARNINGS_BASED_MOVE = new InsightMethodology("IMPLIED_EARNINGS_BASED_MOVE", 2, 2);
        ANALYST_CONSENSUS = new InsightMethodology("ANALYST_CONSENSUS", 3, 3);
        RELATIVE_VALUATION = new InsightMethodology("RELATIVE_VALUATION", 4, 4);
        MOMENTUM_BASED_1_MONTH = new InsightMethodology("MOMENTUM_BASED_1_MONTH", 5, 5);
        MOMENTUM_BASED_3_MONTH = new InsightMethodology("MOMENTUM_BASED_3_MONTH", 6, 6);
        MOMENTUM_BASED_6_MONTH = new InsightMethodology("MOMENTUM_BASED_6_MONTH", 7, 7);
        MOMENTUM_BASED_9_MONTH = new InsightMethodology("MOMENTUM_BASED_9_MONTH", 8, 8);
        MOMENTUM_BASED_12_MONTH = new InsightMethodology("MOMENTUM_BASED_12_MONTH", 9, 9);
        InsightMethodology[] insightMethodologyArr$values = $values();
        $VALUES = insightMethodologyArr$values;
        $ENTRIES = EnumEntries2.enumEntries(insightMethodologyArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InsightMethodology.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<InsightMethodology>(orCreateKotlinClass, syntax, insightMethodology) { // from class: com.robinhood.copilot.proto.v1.InsightMethodology$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public InsightMethodology fromValue(int value) {
                return InsightMethodology.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: InsightMethodology.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightMethodology$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/copilot/proto/v1/InsightMethodology;", "fromValue", "value", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InsightMethodology fromValue(int value) {
            switch (value) {
                case 0:
                    return InsightMethodology.INSIGHT_METHODOLOGY_UNSPECIFIED;
                case 1:
                    return InsightMethodology.IMPLIED_VOL_RANGE;
                case 2:
                    return InsightMethodology.IMPLIED_EARNINGS_BASED_MOVE;
                case 3:
                    return InsightMethodology.ANALYST_CONSENSUS;
                case 4:
                    return InsightMethodology.RELATIVE_VALUATION;
                case 5:
                    return InsightMethodology.MOMENTUM_BASED_1_MONTH;
                case 6:
                    return InsightMethodology.MOMENTUM_BASED_3_MONTH;
                case 7:
                    return InsightMethodology.MOMENTUM_BASED_6_MONTH;
                case 8:
                    return InsightMethodology.MOMENTUM_BASED_9_MONTH;
                case 9:
                    return InsightMethodology.MOMENTUM_BASED_12_MONTH;
                default:
                    return null;
            }
        }
    }

    public static InsightMethodology valueOf(String str) {
        return (InsightMethodology) Enum.valueOf(InsightMethodology.class, str);
    }

    public static InsightMethodology[] values() {
        return (InsightMethodology[]) $VALUES.clone();
    }
}
