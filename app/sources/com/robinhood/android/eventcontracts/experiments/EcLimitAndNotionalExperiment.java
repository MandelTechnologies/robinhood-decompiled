package com.robinhood.android.eventcontracts.experiments;

import com.robinhood.enums.RhEnum;
import com.robinhood.experiments.Experiment;
import com.robinhood.models.p320db.KaizenExperiment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EcLimitAndNotionalExperiment.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/experiments/EcLimitAndNotionalExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/android/eventcontracts/experiments/EcLimitAndNotionalExperiment$Variant;", "<init>", "()V", "Variant", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EcLimitAndNotionalExperiment extends Experiment<Variant> {
    public static final EcLimitAndNotionalExperiment INSTANCE = new EcLimitAndNotionalExperiment();

    private EcLimitAndNotionalExperiment() {
        super("event-contracts-limit-and-notional-buy", null, 2, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EcLimitAndNotionalExperiment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/experiments/EcLimitAndNotionalExperiment$Variant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CONTROL", "NOTIONAL_DEFAULT", "SHARE_BASED_GTD", "SHARE_BASED_IOC", "isInTreatmentExperience", "", "Companion", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Variant implements RhEnum<Variant> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Variant[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String serverValue;
        public static final Variant CONTROL = new Variant("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL);
        public static final Variant NOTIONAL_DEFAULT = new Variant("NOTIONAL_DEFAULT", 1, "notional-default");
        public static final Variant SHARE_BASED_GTD = new Variant("SHARE_BASED_GTD", 2, "share-based-gtd");
        public static final Variant SHARE_BASED_IOC = new Variant("SHARE_BASED_IOC", 3, "share-based-ioc");

        private static final /* synthetic */ Variant[] $values() {
            return new Variant[]{CONTROL, NOTIONAL_DEFAULT, SHARE_BASED_GTD, SHARE_BASED_IOC};
        }

        public static EnumEntries<Variant> getEntries() {
            return $ENTRIES;
        }

        private Variant(String str, int i, String str2) {
            this.serverValue = str2;
        }

        @Override // com.robinhood.enums.RhEnum
        public String getServerValue() {
            return this.serverValue;
        }

        static {
            Variant[] variantArr$values = $values();
            $VALUES = variantArr$values;
            $ENTRIES = EnumEntries2.enumEntries(variantArr$values);
            INSTANCE = new Companion(null);
        }

        public final boolean isInTreatmentExperience() {
            return this == NOTIONAL_DEFAULT || this == SHARE_BASED_GTD || this == SHARE_BASED_IOC;
        }

        /* compiled from: EcLimitAndNotionalExperiment.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/experiments/EcLimitAndNotionalExperiment$Variant$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/android/eventcontracts/experiments/EcLimitAndNotionalExperiment$Variant;", "<init>", "()V", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion extends RhEnum.Converter.Defaulted<Variant> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
                super((Enum[]) Variant.getEntries().toArray(new Variant[0]), Variant.CONTROL, false, 4, null);
            }
        }

        public static Variant valueOf(String str) {
            return (Variant) Enum.valueOf(Variant.class, str);
        }

        public static Variant[] values() {
            return (Variant[]) $VALUES.clone();
        }
    }
}
