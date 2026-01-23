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
/* compiled from: InsightSentiment.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightSentiment;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INSIGHT_SENTIMENT_UNSPECIFIED", "INSIGHT_SENTIMENT_BULLISH", "INSIGHT_SENTIMENT_BEARISH", "INSIGHT_SENTIMENT_NEUTRAL", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class InsightSentiment implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InsightSentiment[] $VALUES;

    @JvmField
    public static final ProtoAdapter<InsightSentiment> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final InsightSentiment INSIGHT_SENTIMENT_BEARISH;
    public static final InsightSentiment INSIGHT_SENTIMENT_BULLISH;
    public static final InsightSentiment INSIGHT_SENTIMENT_NEUTRAL;
    public static final InsightSentiment INSIGHT_SENTIMENT_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ InsightSentiment[] $values() {
        return new InsightSentiment[]{INSIGHT_SENTIMENT_UNSPECIFIED, INSIGHT_SENTIMENT_BULLISH, INSIGHT_SENTIMENT_BEARISH, INSIGHT_SENTIMENT_NEUTRAL};
    }

    @JvmStatic
    public static final InsightSentiment fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<InsightSentiment> getEntries() {
        return $ENTRIES;
    }

    private InsightSentiment(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final InsightSentiment insightSentiment = new InsightSentiment("INSIGHT_SENTIMENT_UNSPECIFIED", 0, 0);
        INSIGHT_SENTIMENT_UNSPECIFIED = insightSentiment;
        INSIGHT_SENTIMENT_BULLISH = new InsightSentiment("INSIGHT_SENTIMENT_BULLISH", 1, 1);
        INSIGHT_SENTIMENT_BEARISH = new InsightSentiment("INSIGHT_SENTIMENT_BEARISH", 2, 2);
        INSIGHT_SENTIMENT_NEUTRAL = new InsightSentiment("INSIGHT_SENTIMENT_NEUTRAL", 3, 3);
        InsightSentiment[] insightSentimentArr$values = $values();
        $VALUES = insightSentimentArr$values;
        $ENTRIES = EnumEntries2.enumEntries(insightSentimentArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InsightSentiment.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<InsightSentiment>(orCreateKotlinClass, syntax, insightSentiment) { // from class: com.robinhood.copilot.proto.v1.InsightSentiment$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public InsightSentiment fromValue(int value) {
                return InsightSentiment.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: InsightSentiment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightSentiment$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/copilot/proto/v1/InsightSentiment;", "fromValue", "value", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InsightSentiment fromValue(int value) {
            if (value == 0) {
                return InsightSentiment.INSIGHT_SENTIMENT_UNSPECIFIED;
            }
            if (value == 1) {
                return InsightSentiment.INSIGHT_SENTIMENT_BULLISH;
            }
            if (value == 2) {
                return InsightSentiment.INSIGHT_SENTIMENT_BEARISH;
            }
            if (value != 3) {
                return null;
            }
            return InsightSentiment.INSIGHT_SENTIMENT_NEUTRAL;
        }
    }

    public static InsightSentiment valueOf(String str) {
        return (InsightSentiment) Enum.valueOf(InsightSentiment.class, str);
    }

    public static InsightSentiment[] values() {
        return (InsightSentiment[]) $VALUES.clone();
    }
}
