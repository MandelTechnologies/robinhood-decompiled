package androidx.camera.video;

/* loaded from: classes4.dex */
public class FallbackStrategy {
    static final FallbackStrategy NONE = new AutoValue_FallbackStrategy_RuleStrategy(Quality.NONE, 0);

    private FallbackStrategy() {
    }

    public static FallbackStrategy higherQualityOrLowerThan(Quality quality) {
        return new AutoValue_FallbackStrategy_RuleStrategy(quality, 1);
    }

    public static FallbackStrategy lowerQualityThan(Quality quality) {
        return new AutoValue_FallbackStrategy_RuleStrategy(quality, 4);
    }

    static abstract class RuleStrategy extends FallbackStrategy {
        abstract Quality getFallbackQuality();

        abstract int getFallbackRule();

        RuleStrategy() {
            super();
        }
    }
}
