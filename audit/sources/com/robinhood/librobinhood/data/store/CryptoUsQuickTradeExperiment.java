package com.robinhood.librobinhood.data.store;

import com.robinhood.enums.RhEnum;
import com.robinhood.experiments.Experiment;
import com.robinhood.models.p320db.KaizenExperiment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* compiled from: CryptoExperimentsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoUsQuickTradeExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/librobinhood/data/store/CryptoUsQuickTradeExperiment$Variant;", "<init>", "()V", "Variant", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoUsQuickTradeExperiment extends Experiment<Variant> {
    public static final CryptoUsQuickTradeExperiment INSTANCE = new CryptoUsQuickTradeExperiment();

    private CryptoUsQuickTradeExperiment() {
        super("crypto-us-quick-trade", null, 2, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoExperimentsStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0015B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0014\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\rj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoUsQuickTradeExperiment$Variant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "swipeToSubmit", "", "updatedEdu", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZ)V", "getServerValue", "()Ljava/lang/String;", "getSwipeToSubmit", "()Z", "getUpdatedEdu", "CONTROL", "SWIPE_TO_SUBMIT_CONTROL_EDU", "SWIPE_TO_SUBMIT_UPDATED_EDU", "TAP_TO_SUBMIT_CONTROL_EDU", "TAP_TO_SUBMIT_UPDATED_EDU", "isEnabled", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Variant implements RhEnum<Variant> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Variant[] $VALUES;
        private final String serverValue;
        private final boolean swipeToSubmit;
        private final boolean updatedEdu;
        public static final Variant CONTROL = new Variant("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL, false, false);
        public static final Variant SWIPE_TO_SUBMIT_CONTROL_EDU = new Variant("SWIPE_TO_SUBMIT_CONTROL_EDU", 1, "swipe-to-submit-control-edu", true, false);
        public static final Variant SWIPE_TO_SUBMIT_UPDATED_EDU = new Variant("SWIPE_TO_SUBMIT_UPDATED_EDU", 2, "swipe-to-submit-updated-edu", true, true);
        public static final Variant TAP_TO_SUBMIT_CONTROL_EDU = new Variant("TAP_TO_SUBMIT_CONTROL_EDU", 3, "tap-to-submit-control-edu", false, false);
        public static final Variant TAP_TO_SUBMIT_UPDATED_EDU = new Variant("TAP_TO_SUBMIT_UPDATED_EDU", 4, "tap-to-submit-updated-edu", false, true);

        private static final /* synthetic */ Variant[] $values() {
            return new Variant[]{CONTROL, SWIPE_TO_SUBMIT_CONTROL_EDU, SWIPE_TO_SUBMIT_UPDATED_EDU, TAP_TO_SUBMIT_CONTROL_EDU, TAP_TO_SUBMIT_UPDATED_EDU};
        }

        public static EnumEntries<Variant> getEntries() {
            return $ENTRIES;
        }

        private Variant(String str, int i, String str2, boolean z, boolean z2) {
            this.serverValue = str2;
            this.swipeToSubmit = z;
            this.updatedEdu = z2;
        }

        @Override // com.robinhood.enums.RhEnum
        public String getServerValue() {
            return this.serverValue;
        }

        public final boolean getSwipeToSubmit() {
            return this.swipeToSubmit;
        }

        public final boolean getUpdatedEdu() {
            return this.updatedEdu;
        }

        static {
            Variant[] variantArr$values = $values();
            $VALUES = variantArr$values;
            $ENTRIES = EnumEntries2.enumEntries(variantArr$values);
            INSTANCE = new Companion(null);
        }

        public final boolean isEnabled() {
            return this != CONTROL;
        }

        public static Variant valueOf(String str) {
            return (Variant) Enum.valueOf(Variant.class, str);
        }

        public static Variant[] values() {
            return (Variant[]) $VALUES.clone();
        }
    }
}
