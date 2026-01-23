package com.robinhood.android.beneficiaries.p067ui.individualflow;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeneficiaryCreateStep.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStep;", "", "<init>", "(Ljava/lang/String;I)V", "NAME", "RELATIONSHIP", "RELATIONSHIP_AGREEMENT", "DOB", "EMAIL", "ADDITIONAL_ACCOUNTS", "segmentIndex", "", "getSegmentIndex", "()I", "segmentProgress", "", "getSegmentProgress", "()F", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BeneficiaryCreateStep {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BeneficiaryCreateStep[] $VALUES;
    private static final float SEGMENT_PROGRESS_EXTRA_FRACTION = 0.7f;
    private static final float SEGMENT_PROGRESS_FRACTION = 0.3f;
    public static final BeneficiaryCreateStep NAME = new BeneficiaryCreateStep("NAME", 0);
    public static final BeneficiaryCreateStep RELATIONSHIP = new BeneficiaryCreateStep("RELATIONSHIP", 1);
    public static final BeneficiaryCreateStep RELATIONSHIP_AGREEMENT = new BeneficiaryCreateStep("RELATIONSHIP_AGREEMENT", 2);
    public static final BeneficiaryCreateStep DOB = new BeneficiaryCreateStep("DOB", 3);
    public static final BeneficiaryCreateStep EMAIL = new BeneficiaryCreateStep("EMAIL", 4);
    public static final BeneficiaryCreateStep ADDITIONAL_ACCOUNTS = new BeneficiaryCreateStep("ADDITIONAL_ACCOUNTS", 5);

    /* compiled from: BeneficiaryCreateStep.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BeneficiaryCreateStep.values().length];
            try {
                iArr[BeneficiaryCreateStep.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeneficiaryCreateStep.RELATIONSHIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeneficiaryCreateStep.RELATIONSHIP_AGREEMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BeneficiaryCreateStep.DOB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BeneficiaryCreateStep.EMAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BeneficiaryCreateStep.ADDITIONAL_ACCOUNTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ BeneficiaryCreateStep[] $values() {
        return new BeneficiaryCreateStep[]{NAME, RELATIONSHIP, RELATIONSHIP_AGREEMENT, DOB, EMAIL, ADDITIONAL_ACCOUNTS};
    }

    public static EnumEntries<BeneficiaryCreateStep> getEntries() {
        return $ENTRIES;
    }

    private BeneficiaryCreateStep(String str, int i) {
    }

    static {
        BeneficiaryCreateStep[] beneficiaryCreateStepArr$values = $values();
        $VALUES = beneficiaryCreateStepArr$values;
        $ENTRIES = EnumEntries2.enumEntries(beneficiaryCreateStepArr$values);
        INSTANCE = new Companion(null);
    }

    public final int getSegmentIndex() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return 0;
            case 2:
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 4;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final float getSegmentProgress() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                return 0.3f;
            case 3:
                return SEGMENT_PROGRESS_EXTRA_FRACTION;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static BeneficiaryCreateStep valueOf(String str) {
        return (BeneficiaryCreateStep) Enum.valueOf(BeneficiaryCreateStep.class, str);
    }

    public static BeneficiaryCreateStep[] values() {
        return (BeneficiaryCreateStep[]) $VALUES.clone();
    }
}
