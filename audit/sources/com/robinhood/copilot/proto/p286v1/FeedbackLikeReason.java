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
/* compiled from: FeedbackLikeReason.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/FeedbackLikeReason;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FEEDBACK_LIKE_REASON_UNSPECIFIED", "SOURCES_FELT_TRUSTWORTHY", "INFORMATION_WAS_UP_TO_DATE", "EASY_TO_FIND_WHAT_I_NEEDED", "INCLUDED_DATA_I_CARE_ABOUT", "LIKE_OTHER", "EASY_TO_UNDERSTAND", "INFORMATION_SEEMS_ACCURATE", "INCLUDED_INFORMATION_I_CARE_ABOUT", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FeedbackLikeReason implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FeedbackLikeReason[] $VALUES;

    @JvmField
    public static final ProtoAdapter<FeedbackLikeReason> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final FeedbackLikeReason EASY_TO_FIND_WHAT_I_NEEDED;
    public static final FeedbackLikeReason EASY_TO_UNDERSTAND;
    public static final FeedbackLikeReason FEEDBACK_LIKE_REASON_UNSPECIFIED;
    public static final FeedbackLikeReason INCLUDED_DATA_I_CARE_ABOUT;
    public static final FeedbackLikeReason INCLUDED_INFORMATION_I_CARE_ABOUT;
    public static final FeedbackLikeReason INFORMATION_SEEMS_ACCURATE;
    public static final FeedbackLikeReason INFORMATION_WAS_UP_TO_DATE;
    public static final FeedbackLikeReason LIKE_OTHER;
    public static final FeedbackLikeReason SOURCES_FELT_TRUSTWORTHY;
    private final int value;

    private static final /* synthetic */ FeedbackLikeReason[] $values() {
        return new FeedbackLikeReason[]{FEEDBACK_LIKE_REASON_UNSPECIFIED, SOURCES_FELT_TRUSTWORTHY, INFORMATION_WAS_UP_TO_DATE, EASY_TO_FIND_WHAT_I_NEEDED, INCLUDED_DATA_I_CARE_ABOUT, LIKE_OTHER, EASY_TO_UNDERSTAND, INFORMATION_SEEMS_ACCURATE, INCLUDED_INFORMATION_I_CARE_ABOUT};
    }

    @JvmStatic
    public static final FeedbackLikeReason fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<FeedbackLikeReason> getEntries() {
        return $ENTRIES;
    }

    private FeedbackLikeReason(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final FeedbackLikeReason feedbackLikeReason = new FeedbackLikeReason("FEEDBACK_LIKE_REASON_UNSPECIFIED", 0, 0);
        FEEDBACK_LIKE_REASON_UNSPECIFIED = feedbackLikeReason;
        SOURCES_FELT_TRUSTWORTHY = new FeedbackLikeReason("SOURCES_FELT_TRUSTWORTHY", 1, 1);
        INFORMATION_WAS_UP_TO_DATE = new FeedbackLikeReason("INFORMATION_WAS_UP_TO_DATE", 2, 2);
        EASY_TO_FIND_WHAT_I_NEEDED = new FeedbackLikeReason("EASY_TO_FIND_WHAT_I_NEEDED", 3, 3);
        INCLUDED_DATA_I_CARE_ABOUT = new FeedbackLikeReason("INCLUDED_DATA_I_CARE_ABOUT", 4, 4);
        LIKE_OTHER = new FeedbackLikeReason("LIKE_OTHER", 5, 5);
        EASY_TO_UNDERSTAND = new FeedbackLikeReason("EASY_TO_UNDERSTAND", 6, 6);
        INFORMATION_SEEMS_ACCURATE = new FeedbackLikeReason("INFORMATION_SEEMS_ACCURATE", 7, 7);
        INCLUDED_INFORMATION_I_CARE_ABOUT = new FeedbackLikeReason("INCLUDED_INFORMATION_I_CARE_ABOUT", 8, 8);
        FeedbackLikeReason[] feedbackLikeReasonArr$values = $values();
        $VALUES = feedbackLikeReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(feedbackLikeReasonArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeedbackLikeReason.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<FeedbackLikeReason>(orCreateKotlinClass, syntax, feedbackLikeReason) { // from class: com.robinhood.copilot.proto.v1.FeedbackLikeReason$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public FeedbackLikeReason fromValue(int value) {
                return FeedbackLikeReason.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: FeedbackLikeReason.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/FeedbackLikeReason$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/copilot/proto/v1/FeedbackLikeReason;", "fromValue", "value", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FeedbackLikeReason fromValue(int value) {
            switch (value) {
                case 0:
                    return FeedbackLikeReason.FEEDBACK_LIKE_REASON_UNSPECIFIED;
                case 1:
                    return FeedbackLikeReason.SOURCES_FELT_TRUSTWORTHY;
                case 2:
                    return FeedbackLikeReason.INFORMATION_WAS_UP_TO_DATE;
                case 3:
                    return FeedbackLikeReason.EASY_TO_FIND_WHAT_I_NEEDED;
                case 4:
                    return FeedbackLikeReason.INCLUDED_DATA_I_CARE_ABOUT;
                case 5:
                    return FeedbackLikeReason.LIKE_OTHER;
                case 6:
                    return FeedbackLikeReason.EASY_TO_UNDERSTAND;
                case 7:
                    return FeedbackLikeReason.INFORMATION_SEEMS_ACCURATE;
                case 8:
                    return FeedbackLikeReason.INCLUDED_INFORMATION_I_CARE_ABOUT;
                default:
                    return null;
            }
        }
    }

    public static FeedbackLikeReason valueOf(String str) {
        return (FeedbackLikeReason) Enum.valueOf(FeedbackLikeReason.class, str);
    }

    public static FeedbackLikeReason[] values() {
        return (FeedbackLikeReason[]) $VALUES.clone();
    }
}
