package com.robinhood.android.transfers.lib.validation;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransferValidator.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0006R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/TransferValidator;", "", "<init>", "()V", "checks", "", "Lcom/robinhood/android/transfers/lib/validation/TransferValidator$Step;", "", "Lcom/robinhood/android/transfers/lib/validation/TransferCheck;", "getError", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "input", "Lcom/robinhood/android/transfers/lib/validation/TransferValidationInput;", "step", "Step", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TransferValidator {
    private final Map<Step, List<TransferCheck>> checks = MapsKt.mapOf(Tuples4.m3642to(Step.REVIEW, CollectionsKt.listOf(new MaxAmountLimitCheck())), Tuples4.m3642to(Step.SUBMIT, CollectionsKt.listOf((Object[]) new TransferCheck[]{new PdtWarningCheck(), IraContributionCheck.INSTANCE, IraDistributionCheck.INSTANCE, MarginUpgradeMinDepositCheck.INSTANCE, new MarginMaxWithdrawalCheck(), LimitsHubCheck.INSTANCE, GoldApyMinDepositCheck.INSTANCE, RecurringDepositUpdateCheck.INSTANCE})));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TransferValidator.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/TransferValidator$Step;", "", "<init>", "(Ljava/lang/String;I)V", "REVIEW", "SUBMIT", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Step {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Step[] $VALUES;
        public static final Step REVIEW = new Step("REVIEW", 0);
        public static final Step SUBMIT = new Step("SUBMIT", 1);

        private static final /* synthetic */ Step[] $values() {
            return new Step[]{REVIEW, SUBMIT};
        }

        public static EnumEntries<Step> getEntries() {
            return $ENTRIES;
        }

        private Step(String str, int i) {
        }

        static {
            Step[] stepArr$values = $values();
            $VALUES = stepArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stepArr$values);
        }

        public static Step valueOf(String str) {
            return (Step) Enum.valueOf(Step.class, str);
        }

        public static Step[] values() {
            return (Step[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ ValidationFailure getError$default(TransferValidator transferValidator, TransferValidationInput transferValidationInput, Step step, int i, Object obj) {
        if ((i & 2) != 0) {
            step = Step.SUBMIT;
        }
        return transferValidator.getError(transferValidationInput, step);
    }

    public final ValidationFailure getError(TransferValidationInput input, Step step) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(step, "step");
        Iterator it = ((Iterable) MapsKt.getValue(this.checks, step)).iterator();
        while (it.hasNext()) {
            ValidationFailure validationFailureCheck = ((TransferCheck) it.next()).check(input);
            if (validationFailureCheck != null) {
                return validationFailureCheck;
            }
        }
        return null;
    }
}
