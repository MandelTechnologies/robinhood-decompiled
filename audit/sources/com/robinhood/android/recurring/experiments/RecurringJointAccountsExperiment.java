package com.robinhood.android.recurring.experiments;

import com.robinhood.enums.RhEnum;
import com.robinhood.experiments.Experiment;
import com.robinhood.models.p320db.KaizenExperiment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecurringJointAccountsExperiment.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/recurring/experiments/RecurringJointAccountsExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/android/recurring/experiments/RecurringJointAccountsExperiment$Variants;", "<init>", "()V", "isMemberAboveHoldout", "", "Variants", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class RecurringJointAccountsExperiment extends Experiment<Variants> {
    public static final RecurringJointAccountsExperiment INSTANCE = new RecurringJointAccountsExperiment();

    private RecurringJointAccountsExperiment() {
        super("recurring-in-joint-accounts", null, 2, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecurringJointAccountsExperiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/recurring/experiments/RecurringJointAccountsExperiment$Variants;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CONTROL", "MEMBER_HOLDOUT", "MEMBER", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Variants implements RhEnum<Variants> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Variants[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String serverValue;
        public static final Variants CONTROL = new Variants("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL);
        public static final Variants MEMBER_HOLDOUT = new Variants("MEMBER_HOLDOUT", 1, "member-holdout");
        public static final Variants MEMBER = new Variants("MEMBER", 2, KaizenExperiment.VARIATION_MEMBER);

        private static final /* synthetic */ Variants[] $values() {
            return new Variants[]{CONTROL, MEMBER_HOLDOUT, MEMBER};
        }

        public static EnumEntries<Variants> getEntries() {
            return $ENTRIES;
        }

        private Variants(String str, int i, String str2) {
            this.serverValue = str2;
        }

        @Override // com.robinhood.enums.RhEnum
        public String getServerValue() {
            return this.serverValue;
        }

        static {
            Variants[] variantsArr$values = $values();
            $VALUES = variantsArr$values;
            $ENTRIES = EnumEntries2.enumEntries(variantsArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: RecurringJointAccountsExperiment.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/recurring/experiments/RecurringJointAccountsExperiment$Variants$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/android/recurring/experiments/RecurringJointAccountsExperiment$Variants;", "<init>", "()V", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion extends RhEnum.Converter.Defaulted<Variants> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
                super((Enum[]) Variants.getEntries().toArray(new Variants[0]), Variants.CONTROL, false, 4, null);
            }
        }

        public static Variants valueOf(String str) {
            return (Variants) Enum.valueOf(Variants.class, str);
        }

        public static Variants[] values() {
            return (Variants[]) $VALUES.clone();
        }
    }

    public final boolean isMemberAboveHoldout(Variants variants) {
        Intrinsics.checkNotNullParameter(variants, "<this>");
        return variants == Variants.MEMBER;
    }
}
