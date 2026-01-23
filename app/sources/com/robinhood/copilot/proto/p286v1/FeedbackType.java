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
/* compiled from: FeedbackType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/FeedbackType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FEEDBACK_TYPE_UNSPECIFIED", "INSIGHT", "DIGEST", "TRADE_GENERATION", "PORTFOLIO_DIGEST", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FeedbackType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FeedbackType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<FeedbackType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final FeedbackType DIGEST;
    public static final FeedbackType FEEDBACK_TYPE_UNSPECIFIED;
    public static final FeedbackType INSIGHT;
    public static final FeedbackType PORTFOLIO_DIGEST;
    public static final FeedbackType TRADE_GENERATION;
    private final int value;

    private static final /* synthetic */ FeedbackType[] $values() {
        return new FeedbackType[]{FEEDBACK_TYPE_UNSPECIFIED, INSIGHT, DIGEST, TRADE_GENERATION, PORTFOLIO_DIGEST};
    }

    @JvmStatic
    public static final FeedbackType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<FeedbackType> getEntries() {
        return $ENTRIES;
    }

    private FeedbackType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final FeedbackType feedbackType = new FeedbackType("FEEDBACK_TYPE_UNSPECIFIED", 0, 0);
        FEEDBACK_TYPE_UNSPECIFIED = feedbackType;
        INSIGHT = new FeedbackType("INSIGHT", 1, 1);
        DIGEST = new FeedbackType("DIGEST", 2, 2);
        TRADE_GENERATION = new FeedbackType("TRADE_GENERATION", 3, 3);
        PORTFOLIO_DIGEST = new FeedbackType("PORTFOLIO_DIGEST", 4, 4);
        FeedbackType[] feedbackTypeArr$values = $values();
        $VALUES = feedbackTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(feedbackTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeedbackType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<FeedbackType>(orCreateKotlinClass, syntax, feedbackType) { // from class: com.robinhood.copilot.proto.v1.FeedbackType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public FeedbackType fromValue(int value) {
                return FeedbackType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: FeedbackType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/FeedbackType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/copilot/proto/v1/FeedbackType;", "fromValue", "value", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FeedbackType fromValue(int value) {
            if (value == 0) {
                return FeedbackType.FEEDBACK_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return FeedbackType.INSIGHT;
            }
            if (value == 2) {
                return FeedbackType.DIGEST;
            }
            if (value == 3) {
                return FeedbackType.TRADE_GENERATION;
            }
            if (value != 4) {
                return null;
            }
            return FeedbackType.PORTFOLIO_DIGEST;
        }
    }

    public static FeedbackType valueOf(String str) {
        return (FeedbackType) Enum.valueOf(FeedbackType.class, str);
    }

    public static FeedbackType[] values() {
        return (FeedbackType[]) $VALUES.clone();
    }
}
