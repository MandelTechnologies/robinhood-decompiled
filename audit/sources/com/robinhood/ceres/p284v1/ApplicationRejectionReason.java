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
/* compiled from: ApplicationRejectionReason.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001aB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ApplicationRejectionReason;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "APPLICATION_REJECTION_REASON_UNSPECIFIED", "FUNDING_REQUIREMENT_NOT_MET", "TRADING_EXPERIENCE_NOT_MET", "FIRST_APPLICATION_MANUALLY_REJECTED_WITHIN_60_DAYS", "MULTIPLE_APPLICATIONS_MANUALLY_REJECTED_WITHIN_180_DAYS", "INVALID_TAX_WITHHOLDING_CATEGORY", "MANUALLY_REJECTED", "TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_60_DAYS", "TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_30_DAYS", "NOT_A_US_CITIZEN", "AGE_TRADING_EXPERIENCE_INCONSISTENCY", "REJECTION_REASON_REGULATORY_QUESTIONS_HAVE_YES_ANSWER", "FIVE_APPLICATIONS_REJECTED_WITHIN_30_DAYS", "RISK_TOLERANCE_REQUIREMENT_NOT_MET", "SOURCE_OF_FUNDS_REQUIREMENT_NOT_MET", "EXPERIENCE_SCORE_UNDER_5", "APPROPRIATENESS_SCORE_UNDER_35", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ApplicationRejectionReason implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ApplicationRejectionReason[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ApplicationRejectionReason> ADAPTER;
    public static final ApplicationRejectionReason AGE_TRADING_EXPERIENCE_INCONSISTENCY;
    public static final ApplicationRejectionReason APPLICATION_REJECTION_REASON_UNSPECIFIED;
    public static final ApplicationRejectionReason APPROPRIATENESS_SCORE_UNDER_35;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ApplicationRejectionReason EXPERIENCE_SCORE_UNDER_5;
    public static final ApplicationRejectionReason FIRST_APPLICATION_MANUALLY_REJECTED_WITHIN_60_DAYS;
    public static final ApplicationRejectionReason FIVE_APPLICATIONS_REJECTED_WITHIN_30_DAYS;
    public static final ApplicationRejectionReason FUNDING_REQUIREMENT_NOT_MET;
    public static final ApplicationRejectionReason INVALID_TAX_WITHHOLDING_CATEGORY;
    public static final ApplicationRejectionReason MANUALLY_REJECTED;
    public static final ApplicationRejectionReason MULTIPLE_APPLICATIONS_MANUALLY_REJECTED_WITHIN_180_DAYS;
    public static final ApplicationRejectionReason NOT_A_US_CITIZEN;
    public static final ApplicationRejectionReason REJECTION_REASON_REGULATORY_QUESTIONS_HAVE_YES_ANSWER;
    public static final ApplicationRejectionReason RISK_TOLERANCE_REQUIREMENT_NOT_MET;
    public static final ApplicationRejectionReason SOURCE_OF_FUNDS_REQUIREMENT_NOT_MET;
    public static final ApplicationRejectionReason TRADING_EXPERIENCE_NOT_MET;
    public static final ApplicationRejectionReason TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_30_DAYS;
    public static final ApplicationRejectionReason TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_60_DAYS;
    private final int value;

    private static final /* synthetic */ ApplicationRejectionReason[] $values() {
        return new ApplicationRejectionReason[]{APPLICATION_REJECTION_REASON_UNSPECIFIED, FUNDING_REQUIREMENT_NOT_MET, TRADING_EXPERIENCE_NOT_MET, FIRST_APPLICATION_MANUALLY_REJECTED_WITHIN_60_DAYS, MULTIPLE_APPLICATIONS_MANUALLY_REJECTED_WITHIN_180_DAYS, INVALID_TAX_WITHHOLDING_CATEGORY, MANUALLY_REJECTED, TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_60_DAYS, TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_30_DAYS, NOT_A_US_CITIZEN, AGE_TRADING_EXPERIENCE_INCONSISTENCY, REJECTION_REASON_REGULATORY_QUESTIONS_HAVE_YES_ANSWER, FIVE_APPLICATIONS_REJECTED_WITHIN_30_DAYS, RISK_TOLERANCE_REQUIREMENT_NOT_MET, SOURCE_OF_FUNDS_REQUIREMENT_NOT_MET, EXPERIENCE_SCORE_UNDER_5, APPROPRIATENESS_SCORE_UNDER_35};
    }

    @JvmStatic
    public static final ApplicationRejectionReason fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ApplicationRejectionReason> getEntries() {
        return $ENTRIES;
    }

    private ApplicationRejectionReason(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ApplicationRejectionReason applicationRejectionReason = new ApplicationRejectionReason("APPLICATION_REJECTION_REASON_UNSPECIFIED", 0, 0);
        APPLICATION_REJECTION_REASON_UNSPECIFIED = applicationRejectionReason;
        FUNDING_REQUIREMENT_NOT_MET = new ApplicationRejectionReason("FUNDING_REQUIREMENT_NOT_MET", 1, 1);
        TRADING_EXPERIENCE_NOT_MET = new ApplicationRejectionReason("TRADING_EXPERIENCE_NOT_MET", 2, 2);
        FIRST_APPLICATION_MANUALLY_REJECTED_WITHIN_60_DAYS = new ApplicationRejectionReason("FIRST_APPLICATION_MANUALLY_REJECTED_WITHIN_60_DAYS", 3, 3);
        MULTIPLE_APPLICATIONS_MANUALLY_REJECTED_WITHIN_180_DAYS = new ApplicationRejectionReason("MULTIPLE_APPLICATIONS_MANUALLY_REJECTED_WITHIN_180_DAYS", 4, 4);
        INVALID_TAX_WITHHOLDING_CATEGORY = new ApplicationRejectionReason("INVALID_TAX_WITHHOLDING_CATEGORY", 5, 5);
        MANUALLY_REJECTED = new ApplicationRejectionReason("MANUALLY_REJECTED", 6, 6);
        TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_60_DAYS = new ApplicationRejectionReason("TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_60_DAYS", 7, 7);
        TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_30_DAYS = new ApplicationRejectionReason("TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_30_DAYS", 8, 8);
        NOT_A_US_CITIZEN = new ApplicationRejectionReason("NOT_A_US_CITIZEN", 9, 9);
        AGE_TRADING_EXPERIENCE_INCONSISTENCY = new ApplicationRejectionReason("AGE_TRADING_EXPERIENCE_INCONSISTENCY", 10, 10);
        REJECTION_REASON_REGULATORY_QUESTIONS_HAVE_YES_ANSWER = new ApplicationRejectionReason("REJECTION_REASON_REGULATORY_QUESTIONS_HAVE_YES_ANSWER", 11, 11);
        FIVE_APPLICATIONS_REJECTED_WITHIN_30_DAYS = new ApplicationRejectionReason("FIVE_APPLICATIONS_REJECTED_WITHIN_30_DAYS", 12, 12);
        RISK_TOLERANCE_REQUIREMENT_NOT_MET = new ApplicationRejectionReason("RISK_TOLERANCE_REQUIREMENT_NOT_MET", 13, 13);
        SOURCE_OF_FUNDS_REQUIREMENT_NOT_MET = new ApplicationRejectionReason("SOURCE_OF_FUNDS_REQUIREMENT_NOT_MET", 14, 14);
        EXPERIENCE_SCORE_UNDER_5 = new ApplicationRejectionReason("EXPERIENCE_SCORE_UNDER_5", 15, 15);
        APPROPRIATENESS_SCORE_UNDER_35 = new ApplicationRejectionReason("APPROPRIATENESS_SCORE_UNDER_35", 16, 16);
        ApplicationRejectionReason[] applicationRejectionReasonArr$values = $values();
        $VALUES = applicationRejectionReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(applicationRejectionReasonArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ApplicationRejectionReason.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ApplicationRejectionReason>(orCreateKotlinClass, syntax, applicationRejectionReason) { // from class: com.robinhood.ceres.v1.ApplicationRejectionReason$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ApplicationRejectionReason fromValue(int value) {
                return ApplicationRejectionReason.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ApplicationRejectionReason.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ApplicationRejectionReason$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/ApplicationRejectionReason;", "fromValue", "value", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ApplicationRejectionReason fromValue(int value) {
            switch (value) {
                case 0:
                    return ApplicationRejectionReason.APPLICATION_REJECTION_REASON_UNSPECIFIED;
                case 1:
                    return ApplicationRejectionReason.FUNDING_REQUIREMENT_NOT_MET;
                case 2:
                    return ApplicationRejectionReason.TRADING_EXPERIENCE_NOT_MET;
                case 3:
                    return ApplicationRejectionReason.FIRST_APPLICATION_MANUALLY_REJECTED_WITHIN_60_DAYS;
                case 4:
                    return ApplicationRejectionReason.MULTIPLE_APPLICATIONS_MANUALLY_REJECTED_WITHIN_180_DAYS;
                case 5:
                    return ApplicationRejectionReason.INVALID_TAX_WITHHOLDING_CATEGORY;
                case 6:
                    return ApplicationRejectionReason.MANUALLY_REJECTED;
                case 7:
                    return ApplicationRejectionReason.TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_60_DAYS;
                case 8:
                    return ApplicationRejectionReason.TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_30_DAYS;
                case 9:
                    return ApplicationRejectionReason.NOT_A_US_CITIZEN;
                case 10:
                    return ApplicationRejectionReason.AGE_TRADING_EXPERIENCE_INCONSISTENCY;
                case 11:
                    return ApplicationRejectionReason.REJECTION_REASON_REGULATORY_QUESTIONS_HAVE_YES_ANSWER;
                case 12:
                    return ApplicationRejectionReason.FIVE_APPLICATIONS_REJECTED_WITHIN_30_DAYS;
                case 13:
                    return ApplicationRejectionReason.RISK_TOLERANCE_REQUIREMENT_NOT_MET;
                case 14:
                    return ApplicationRejectionReason.SOURCE_OF_FUNDS_REQUIREMENT_NOT_MET;
                case 15:
                    return ApplicationRejectionReason.EXPERIENCE_SCORE_UNDER_5;
                case 16:
                    return ApplicationRejectionReason.APPROPRIATENESS_SCORE_UNDER_35;
                default:
                    return null;
            }
        }
    }

    public static ApplicationRejectionReason valueOf(String str) {
        return (ApplicationRejectionReason) Enum.valueOf(ApplicationRejectionReason.class, str);
    }

    public static ApplicationRejectionReason[] values() {
        return (ApplicationRejectionReason[]) $VALUES.clone();
    }
}
