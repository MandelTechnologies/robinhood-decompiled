package com.robinhood.android.rhyrewards.p246ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.rhyrewards.p246ui.StepGauge4;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: StepGauge.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010R\u0014\u0010\u0002\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/rhyrewards/ui/StepGaugeColors;", "", "gaugeBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "getGaugeBackgroundColor", "(Landroidx/compose/runtime/Composer;I)J", "gaugeBorderColor", "getGaugeBorderColor", "gaugePendingColor", "getGaugePendingColor", "gaugeFillColor", "getGaugeFillColor", "gaugeCoveredDashColor", "getGaugeCoveredDashColor", "gaugeUncoveredDashColor", "getGaugeUncoveredDashColor", "Companion", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhyrewards.ui.StepGaugeColors, reason: use source file name */
/* loaded from: classes5.dex */
public interface StepGauge4 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @JvmName
    long getGaugeBackgroundColor(Composer composer, int i);

    @JvmName
    long getGaugeBorderColor(Composer composer, int i);

    @JvmName
    long getGaugeCoveredDashColor(Composer composer, int i);

    @JvmName
    long getGaugeFillColor(Composer composer, int i);

    @JvmName
    long getGaugePendingColor(Composer composer, int i);

    @JvmName
    long getGaugeUncoveredDashColor(Composer composer, int i);

    /* compiled from: StepGauge.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhyrewards.ui.StepGaugeColors$DefaultImpls */
    public static final class DefaultImpls {
        @JvmName
        public static long getGaugeBackgroundColor(StepGauge4 stepGauge4, Composer composer, int i) {
            composer.startReplaceGroup(1789465643);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1789465643, i, -1, "com.robinhood.android.rhyrewards.ui.StepGaugeColors.<get-gaugeBackgroundColor> (StepGauge.kt:38)");
            }
            long jM21372getBg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21372getBg20d7_KjU();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return jM21372getBg20d7_KjU;
        }

        @JvmName
        public static long getGaugeBorderColor(StepGauge4 stepGauge4, Composer composer, int i) {
            long jM21426getFg20d7_KjU;
            composer.startReplaceGroup(-1202756501);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1202756501, i, -1, "com.robinhood.android.rhyrewards.ui.StepGaugeColors.<get-gaugeBorderColor> (StepGauge.kt:46)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            if (bentoTheme.getColors(composer, i2).getIsDay()) {
                composer.startReplaceGroup(1593307979);
                jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1593357610);
                jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return jM21426getFg20d7_KjU;
        }

        @JvmName
        public static long getGaugePendingColor(StepGauge4 stepGauge4, Composer composer, int i) {
            long jM21427getFg30d7_KjU;
            composer.startReplaceGroup(-1375418679);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1375418679, i, -1, "com.robinhood.android.rhyrewards.ui.StepGaugeColors.<get-gaugePendingColor> (StepGauge.kt:57)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            if (bentoTheme.getColors(composer, i2).getIsDay()) {
                composer.startReplaceGroup(-1109783476);
                jM21427getFg30d7_KjU = bentoTheme.getColors(composer, i2).getIon();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1109732884);
                jM21427getFg30d7_KjU = bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU();
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return jM21427getFg30d7_KjU;
        }

        @JvmName
        public static long getGaugeFillColor(StepGauge4 stepGauge4, Composer composer, int i) {
            composer.startReplaceGroup(158970571);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(158970571, i, -1, "com.robinhood.android.rhyrewards.ui.StepGaugeColors.<get-gaugeFillColor> (StepGauge.kt:68)");
            }
            long prime = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getPrime();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return prime;
        }

        @JvmName
        public static long getGaugeCoveredDashColor(StepGauge4 stepGauge4, Composer composer, int i) {
            long jM21371getBg0d7_KjU;
            composer.startReplaceGroup(-2011707929);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2011707929, i, -1, "com.robinhood.android.rhyrewards.ui.StepGaugeColors.<get-gaugeCoveredDashColor> (StepGauge.kt:78)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            if (bentoTheme.getColors(composer, i2).getIsDay()) {
                composer.startReplaceGroup(1182814287);
                jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1182863887);
                jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU();
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return jM21371getBg0d7_KjU;
        }

        @JvmName
        public static long getGaugeUncoveredDashColor(StepGauge4 stepGauge4, Composer composer, int i) {
            long jM21426getFg20d7_KjU;
            composer.startReplaceGroup(-1702360935);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1702360935, i, -1, "com.robinhood.android.rhyrewards.ui.StepGaugeColors.<get-gaugeUncoveredDashColor> (StepGauge.kt:93)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            if (bentoTheme.getColors(composer, i2).getIsDay()) {
                composer.startReplaceGroup(-60704675);
                jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-60655044);
                jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return jM21426getFg20d7_KjU;
        }
    }

    /* compiled from: StepGauge.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhyrewards/ui/StepGaugeColors$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Lcom/robinhood/android/rhyrewards/ui/StepGaugeColors;", "getDefault", "()Lcom/robinhood/android/rhyrewards/ui/StepGaugeColors;", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhyrewards.ui.StepGaugeColors$Companion, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final StepGauge4 default = new StepGauge4() { // from class: com.robinhood.android.rhyrewards.ui.StepGaugeColors$Companion$default$1
            @Override // com.robinhood.android.rhyrewards.p246ui.StepGauge4
            @JvmName
            public long getGaugeBackgroundColor(Composer composer, int i) {
                return StepGauge4.DefaultImpls.getGaugeBackgroundColor(this, composer, i);
            }

            @Override // com.robinhood.android.rhyrewards.p246ui.StepGauge4
            @JvmName
            public long getGaugeBorderColor(Composer composer, int i) {
                return StepGauge4.DefaultImpls.getGaugeBorderColor(this, composer, i);
            }

            @Override // com.robinhood.android.rhyrewards.p246ui.StepGauge4
            @JvmName
            public long getGaugeCoveredDashColor(Composer composer, int i) {
                return StepGauge4.DefaultImpls.getGaugeCoveredDashColor(this, composer, i);
            }

            @Override // com.robinhood.android.rhyrewards.p246ui.StepGauge4
            @JvmName
            public long getGaugeFillColor(Composer composer, int i) {
                return StepGauge4.DefaultImpls.getGaugeFillColor(this, composer, i);
            }

            @Override // com.robinhood.android.rhyrewards.p246ui.StepGauge4
            @JvmName
            public long getGaugePendingColor(Composer composer, int i) {
                return StepGauge4.DefaultImpls.getGaugePendingColor(this, composer, i);
            }

            @Override // com.robinhood.android.rhyrewards.p246ui.StepGauge4
            @JvmName
            public long getGaugeUncoveredDashColor(Composer composer, int i) {
                return StepGauge4.DefaultImpls.getGaugeUncoveredDashColor(this, composer, i);
            }
        };

        private Companion() {
        }

        public final StepGauge4 getDefault() {
            return default;
        }
    }
}
