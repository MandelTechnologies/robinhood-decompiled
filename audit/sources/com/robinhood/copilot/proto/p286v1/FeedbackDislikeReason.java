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
/* compiled from: FeedbackDislikeReason.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/FeedbackDislikeReason;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FEEDBACK_DISLIKE_REASON_UNSPECIFIED", "I_DIDNT_TRUST_THE_SOURCES", "INFORMATION_WAS_OUTDATED", "HARD_TO_FIND_WHAT_I_NEEDED", "MISSING_DATA_I_CARE_ABOUT", "SOME_INFORMATION_SEEMS_INACCURATE", "DISLIKE_OTHER", "HARD_TO_UNDERSTAND", "MISSING_INFORMATION_I_CARE_ABOUT", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FeedbackDislikeReason implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FeedbackDislikeReason[] $VALUES;

    @JvmField
    public static final ProtoAdapter<FeedbackDislikeReason> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final FeedbackDislikeReason DISLIKE_OTHER;
    public static final FeedbackDislikeReason FEEDBACK_DISLIKE_REASON_UNSPECIFIED;
    public static final FeedbackDislikeReason HARD_TO_FIND_WHAT_I_NEEDED;
    public static final FeedbackDislikeReason HARD_TO_UNDERSTAND;
    public static final FeedbackDislikeReason INFORMATION_WAS_OUTDATED;
    public static final FeedbackDislikeReason I_DIDNT_TRUST_THE_SOURCES;
    public static final FeedbackDislikeReason MISSING_DATA_I_CARE_ABOUT;
    public static final FeedbackDislikeReason MISSING_INFORMATION_I_CARE_ABOUT;
    public static final FeedbackDislikeReason SOME_INFORMATION_SEEMS_INACCURATE;
    private final int value;

    private static final /* synthetic */ FeedbackDislikeReason[] $values() {
        return new FeedbackDislikeReason[]{FEEDBACK_DISLIKE_REASON_UNSPECIFIED, I_DIDNT_TRUST_THE_SOURCES, INFORMATION_WAS_OUTDATED, HARD_TO_FIND_WHAT_I_NEEDED, MISSING_DATA_I_CARE_ABOUT, SOME_INFORMATION_SEEMS_INACCURATE, DISLIKE_OTHER, HARD_TO_UNDERSTAND, MISSING_INFORMATION_I_CARE_ABOUT};
    }

    @JvmStatic
    public static final FeedbackDislikeReason fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<FeedbackDislikeReason> getEntries() {
        return $ENTRIES;
    }

    private FeedbackDislikeReason(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final FeedbackDislikeReason feedbackDislikeReason = new FeedbackDislikeReason("FEEDBACK_DISLIKE_REASON_UNSPECIFIED", 0, 0);
        FEEDBACK_DISLIKE_REASON_UNSPECIFIED = feedbackDislikeReason;
        I_DIDNT_TRUST_THE_SOURCES = new FeedbackDislikeReason("I_DIDNT_TRUST_THE_SOURCES", 1, 1);
        INFORMATION_WAS_OUTDATED = new FeedbackDislikeReason("INFORMATION_WAS_OUTDATED", 2, 2);
        HARD_TO_FIND_WHAT_I_NEEDED = new FeedbackDislikeReason("HARD_TO_FIND_WHAT_I_NEEDED", 3, 3);
        MISSING_DATA_I_CARE_ABOUT = new FeedbackDislikeReason("MISSING_DATA_I_CARE_ABOUT", 4, 4);
        SOME_INFORMATION_SEEMS_INACCURATE = new FeedbackDislikeReason("SOME_INFORMATION_SEEMS_INACCURATE", 5, 5);
        DISLIKE_OTHER = new FeedbackDislikeReason("DISLIKE_OTHER", 6, 6);
        HARD_TO_UNDERSTAND = new FeedbackDislikeReason("HARD_TO_UNDERSTAND", 7, 7);
        MISSING_INFORMATION_I_CARE_ABOUT = new FeedbackDislikeReason("MISSING_INFORMATION_I_CARE_ABOUT", 8, 8);
        FeedbackDislikeReason[] feedbackDislikeReasonArr$values = $values();
        $VALUES = feedbackDislikeReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(feedbackDislikeReasonArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeedbackDislikeReason.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<FeedbackDislikeReason>(orCreateKotlinClass, syntax, feedbackDislikeReason) { // from class: com.robinhood.copilot.proto.v1.FeedbackDislikeReason$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public FeedbackDislikeReason fromValue(int value) {
                return FeedbackDislikeReason.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: FeedbackDislikeReason.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/FeedbackDislikeReason$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/copilot/proto/v1/FeedbackDislikeReason;", "fromValue", "value", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FeedbackDislikeReason fromValue(int value) {
            switch (value) {
                case 0:
                    return FeedbackDislikeReason.FEEDBACK_DISLIKE_REASON_UNSPECIFIED;
                case 1:
                    return FeedbackDislikeReason.I_DIDNT_TRUST_THE_SOURCES;
                case 2:
                    return FeedbackDislikeReason.INFORMATION_WAS_OUTDATED;
                case 3:
                    return FeedbackDislikeReason.HARD_TO_FIND_WHAT_I_NEEDED;
                case 4:
                    return FeedbackDislikeReason.MISSING_DATA_I_CARE_ABOUT;
                case 5:
                    return FeedbackDislikeReason.SOME_INFORMATION_SEEMS_INACCURATE;
                case 6:
                    return FeedbackDislikeReason.DISLIKE_OTHER;
                case 7:
                    return FeedbackDislikeReason.HARD_TO_UNDERSTAND;
                case 8:
                    return FeedbackDislikeReason.MISSING_INFORMATION_I_CARE_ABOUT;
                default:
                    return null;
            }
        }
    }

    public static FeedbackDislikeReason valueOf(String str) {
        return (FeedbackDislikeReason) Enum.valueOf(FeedbackDislikeReason.class, str);
    }

    public static FeedbackDislikeReason[] values() {
        return (FeedbackDislikeReason[]) $VALUES.clone();
    }
}
