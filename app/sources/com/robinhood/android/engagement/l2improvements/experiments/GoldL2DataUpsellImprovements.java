package com.robinhood.android.engagement.l2improvements.experiments;

import com.robinhood.enums.RhEnum;
import com.robinhood.experiments.Experiment;
import com.robinhood.models.p320db.KaizenExperiment;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* compiled from: GoldL2DataUpsellImprovements.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2DataUpsellImprovements;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2DataUpsellImprovements$Variant;", "<init>", "()V", "Variant", "lib-l2-improvements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class GoldL2DataUpsellImprovements extends Experiment<Variant> {
    public static final GoldL2DataUpsellImprovements INSTANCE = new GoldL2DataUpsellImprovements();

    private GoldL2DataUpsellImprovements() {
        super("acq-gold-l2-data-upsell-improvements", null, 2, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GoldL2DataUpsellImprovements.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2DataUpsellImprovements$Variant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CONTROL", "CARET", "CONTENT_V1", "CONTENT_V2", "GOLD_ICON_DARK_MODE", "LOTTIE_V1", "LOTTIE_V2", "hasGoldL2UpsellImprovements", "", "instrumentCaretGoldDarkModeColor", "Companion", "lib-l2-improvements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Variant implements RhEnum<Variant> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Variant[] $VALUES;
        private final String serverValue;
        public static final Variant CONTROL = new Variant("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL);
        public static final Variant CARET = new Variant("CARET", 1, "caret");
        public static final Variant CONTENT_V1 = new Variant("CONTENT_V1", 2, "content-v1");
        public static final Variant CONTENT_V2 = new Variant("CONTENT_V2", 3, "content-v2");
        public static final Variant GOLD_ICON_DARK_MODE = new Variant("GOLD_ICON_DARK_MODE", 4, "gold-icon-dark-mode");
        public static final Variant LOTTIE_V1 = new Variant("LOTTIE_V1", 5, "lottie-v1");
        public static final Variant LOTTIE_V2 = new Variant("LOTTIE_V2", 6, "lottie-v2");

        private static final /* synthetic */ Variant[] $values() {
            return new Variant[]{CONTROL, CARET, CONTENT_V1, CONTENT_V2, GOLD_ICON_DARK_MODE, LOTTIE_V1, LOTTIE_V2};
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

        public final boolean hasGoldL2UpsellImprovements() {
            return this != CONTROL;
        }

        public final boolean instrumentCaretGoldDarkModeColor() {
            return !CollectionsKt.listOf((Object[]) new Variant[]{CONTROL, CARET}).contains(this);
        }

        public static Variant valueOf(String str) {
            return (Variant) Enum.valueOf(Variant.class, str);
        }

        public static Variant[] values() {
            return (Variant[]) $VALUES.clone();
        }
    }
}
