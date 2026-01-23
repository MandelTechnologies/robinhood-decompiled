package com.robinhood.ceres.p284v1;

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
/* compiled from: ManualReviewTrigger.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ManualReviewTrigger;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MANUAL_REVIEW_TRIGGER_UNSPECIFIED", "SOURCE_OF_FUNDS_FROM_OTHER", "REGULATORY_QUESTIONS_HAVE_YES_ANSWER", "RED_FLAG_FUNDING_REQUIREMENT", "RED_FLAG_TRADING_EXPERIENCE", "RED_FLAG_AGE_TRADING_EXPERIENCE_INCONSISTENCY", "RED_FLAG_MANUAL_REJECTION_WITHIN_3_YEARS", "GLOBAL_MANUAL_REVIEW_ENFORCED", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ManualReviewTrigger implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ManualReviewTrigger[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ManualReviewTrigger> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ManualReviewTrigger GLOBAL_MANUAL_REVIEW_ENFORCED;
    public static final ManualReviewTrigger MANUAL_REVIEW_TRIGGER_UNSPECIFIED;
    public static final ManualReviewTrigger RED_FLAG_AGE_TRADING_EXPERIENCE_INCONSISTENCY;
    public static final ManualReviewTrigger RED_FLAG_FUNDING_REQUIREMENT;
    public static final ManualReviewTrigger RED_FLAG_MANUAL_REJECTION_WITHIN_3_YEARS;
    public static final ManualReviewTrigger RED_FLAG_TRADING_EXPERIENCE;
    public static final ManualReviewTrigger REGULATORY_QUESTIONS_HAVE_YES_ANSWER;
    public static final ManualReviewTrigger SOURCE_OF_FUNDS_FROM_OTHER;
    private final int value;

    private static final /* synthetic */ ManualReviewTrigger[] $values() {
        return new ManualReviewTrigger[]{MANUAL_REVIEW_TRIGGER_UNSPECIFIED, SOURCE_OF_FUNDS_FROM_OTHER, REGULATORY_QUESTIONS_HAVE_YES_ANSWER, RED_FLAG_FUNDING_REQUIREMENT, RED_FLAG_TRADING_EXPERIENCE, RED_FLAG_AGE_TRADING_EXPERIENCE_INCONSISTENCY, RED_FLAG_MANUAL_REJECTION_WITHIN_3_YEARS, GLOBAL_MANUAL_REVIEW_ENFORCED};
    }

    @JvmStatic
    public static final ManualReviewTrigger fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ManualReviewTrigger> getEntries() {
        return $ENTRIES;
    }

    private ManualReviewTrigger(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ManualReviewTrigger manualReviewTrigger = new ManualReviewTrigger("MANUAL_REVIEW_TRIGGER_UNSPECIFIED", 0, 0);
        MANUAL_REVIEW_TRIGGER_UNSPECIFIED = manualReviewTrigger;
        SOURCE_OF_FUNDS_FROM_OTHER = new ManualReviewTrigger("SOURCE_OF_FUNDS_FROM_OTHER", 1, 1);
        REGULATORY_QUESTIONS_HAVE_YES_ANSWER = new ManualReviewTrigger("REGULATORY_QUESTIONS_HAVE_YES_ANSWER", 2, 2);
        RED_FLAG_FUNDING_REQUIREMENT = new ManualReviewTrigger("RED_FLAG_FUNDING_REQUIREMENT", 3, 3);
        RED_FLAG_TRADING_EXPERIENCE = new ManualReviewTrigger("RED_FLAG_TRADING_EXPERIENCE", 4, 4);
        RED_FLAG_AGE_TRADING_EXPERIENCE_INCONSISTENCY = new ManualReviewTrigger("RED_FLAG_AGE_TRADING_EXPERIENCE_INCONSISTENCY", 5, 5);
        RED_FLAG_MANUAL_REJECTION_WITHIN_3_YEARS = new ManualReviewTrigger("RED_FLAG_MANUAL_REJECTION_WITHIN_3_YEARS", 6, 6);
        GLOBAL_MANUAL_REVIEW_ENFORCED = new ManualReviewTrigger("GLOBAL_MANUAL_REVIEW_ENFORCED", 7, 7);
        ManualReviewTrigger[] manualReviewTriggerArr$values = $values();
        $VALUES = manualReviewTriggerArr$values;
        $ENTRIES = EnumEntries2.enumEntries(manualReviewTriggerArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ManualReviewTrigger.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ManualReviewTrigger>(orCreateKotlinClass, syntax, manualReviewTrigger) { // from class: com.robinhood.ceres.v1.ManualReviewTrigger$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ManualReviewTrigger fromValue(int value) {
                return ManualReviewTrigger.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ManualReviewTrigger.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ManualReviewTrigger$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/ManualReviewTrigger;", "fromValue", "value", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ManualReviewTrigger fromValue(int value) {
            switch (value) {
                case 0:
                    return ManualReviewTrigger.MANUAL_REVIEW_TRIGGER_UNSPECIFIED;
                case 1:
                    return ManualReviewTrigger.SOURCE_OF_FUNDS_FROM_OTHER;
                case 2:
                    return ManualReviewTrigger.REGULATORY_QUESTIONS_HAVE_YES_ANSWER;
                case 3:
                    return ManualReviewTrigger.RED_FLAG_FUNDING_REQUIREMENT;
                case 4:
                    return ManualReviewTrigger.RED_FLAG_TRADING_EXPERIENCE;
                case 5:
                    return ManualReviewTrigger.RED_FLAG_AGE_TRADING_EXPERIENCE_INCONSISTENCY;
                case 6:
                    return ManualReviewTrigger.RED_FLAG_MANUAL_REJECTION_WITHIN_3_YEARS;
                case 7:
                    return ManualReviewTrigger.GLOBAL_MANUAL_REVIEW_ENFORCED;
                default:
                    return null;
            }
        }
    }

    public static ManualReviewTrigger valueOf(String str) {
        return (ManualReviewTrigger) Enum.valueOf(ManualReviewTrigger.class, str);
    }

    public static ManualReviewTrigger[] values() {
        return (ManualReviewTrigger[]) $VALUES.clone();
    }
}
