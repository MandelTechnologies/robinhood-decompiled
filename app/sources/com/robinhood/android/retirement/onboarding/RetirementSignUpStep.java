package com.robinhood.android.retirement.onboarding;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RetirementSignUpStep.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/RetirementSignUpStep;", "", "<init>", "(Ljava/lang/String;I)V", "MATCH_RATE_SELECTION", "ACCOUNT_SELECTION", "ACCOUNT_DESCRIPTION", "AGREEMENTS", "Companion", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementSignUpStep {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RetirementSignUpStep[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final RetirementSignUpStep MATCH_RATE_SELECTION = new RetirementSignUpStep("MATCH_RATE_SELECTION", 0);
    public static final RetirementSignUpStep ACCOUNT_SELECTION = new RetirementSignUpStep("ACCOUNT_SELECTION", 1);
    public static final RetirementSignUpStep ACCOUNT_DESCRIPTION = new RetirementSignUpStep("ACCOUNT_DESCRIPTION", 2);
    public static final RetirementSignUpStep AGREEMENTS = new RetirementSignUpStep("AGREEMENTS", 3);

    private static final /* synthetic */ RetirementSignUpStep[] $values() {
        return new RetirementSignUpStep[]{MATCH_RATE_SELECTION, ACCOUNT_SELECTION, ACCOUNT_DESCRIPTION, AGREEMENTS};
    }

    public static EnumEntries<RetirementSignUpStep> getEntries() {
        return $ENTRIES;
    }

    private RetirementSignUpStep(String str, int i) {
    }

    static {
        RetirementSignUpStep[] retirementSignUpStepArr$values = $values();
        $VALUES = retirementSignUpStepArr$values;
        $ENTRIES = EnumEntries2.enumEntries(retirementSignUpStepArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: RetirementSignUpStep.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/RetirementSignUpStep$Companion;", "", "<init>", "()V", "selectionSteps", "", "Lcom/robinhood/android/retirement/onboarding/RetirementSignUpStep;", "getSelectionSteps", "()Ljava/util/List;", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<RetirementSignUpStep> getSelectionSteps() {
            return CollectionsKt.listOf((Object[]) new RetirementSignUpStep[]{RetirementSignUpStep.ACCOUNT_SELECTION, RetirementSignUpStep.ACCOUNT_DESCRIPTION, RetirementSignUpStep.AGREEMENTS});
        }
    }

    public static RetirementSignUpStep valueOf(String str) {
        return (RetirementSignUpStep) Enum.valueOf(RetirementSignUpStep.class, str);
    }

    public static RetirementSignUpStep[] values() {
        return (RetirementSignUpStep[]) $VALUES.clone();
    }
}
