package com.robinhood.android.rhyrewards.p246ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.rhyrewards.p246ui.RhyProgressBar;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: RhyProgressBar.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0014\u0010\u0002\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/rhyrewards/ui/ProgressBarColors;", "", "progressBarBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "getProgressBarBackgroundColor", "(Landroidx/compose/runtime/Composer;I)J", "progressBarPendingColor", "getProgressBarPendingColor", "progressBarFillColor", "getProgressBarFillColor", "Companion", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhyrewards.ui.ProgressBarColors, reason: use source file name */
/* loaded from: classes5.dex */
public interface RhyProgressBar {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @JvmName
    long getProgressBarBackgroundColor(Composer composer, int i);

    @JvmName
    long getProgressBarFillColor(Composer composer, int i);

    @JvmName
    long getProgressBarPendingColor(Composer composer, int i);

    /* compiled from: RhyProgressBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhyrewards.ui.ProgressBarColors$DefaultImpls */
    public static final class DefaultImpls {
        @JvmName
        public static long getProgressBarBackgroundColor(RhyProgressBar rhyProgressBar, Composer composer, int i) {
            composer.startReplaceGroup(-1883696870);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1883696870, i, -1, "com.robinhood.android.rhyrewards.ui.ProgressBarColors.<get-progressBarBackgroundColor> (RhyProgressBar.kt:31)");
            }
            long jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return jM21373getBg30d7_KjU;
        }

        @JvmName
        public static long getProgressBarPendingColor(RhyProgressBar rhyProgressBar, Composer composer, int i) {
            composer.startReplaceGroup(-1892166142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1892166142, i, -1, "com.robinhood.android.rhyrewards.ui.ProgressBarColors.<get-progressBarPendingColor> (RhyProgressBar.kt:38)");
            }
            long jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return jM21427getFg30d7_KjU;
        }

        @JvmName
        public static long getProgressBarFillColor(RhyProgressBar rhyProgressBar, Composer composer, int i) {
            composer.startReplaceGroup(-1304451974);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1304451974, i, -1, "com.robinhood.android.rhyrewards.ui.ProgressBarColors.<get-progressBarFillColor> (RhyProgressBar.kt:45)");
            }
            long prime = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getPrime();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return prime;
        }
    }

    /* compiled from: RhyProgressBar.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhyrewards/ui/ProgressBarColors$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Lcom/robinhood/android/rhyrewards/ui/ProgressBarColors;", "getDefault", "()Lcom/robinhood/android/rhyrewards/ui/ProgressBarColors;", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhyrewards.ui.ProgressBarColors$Companion, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final RhyProgressBar default = new RhyProgressBar() { // from class: com.robinhood.android.rhyrewards.ui.ProgressBarColors$Companion$default$1
            @Override // com.robinhood.android.rhyrewards.p246ui.RhyProgressBar
            @JvmName
            public long getProgressBarBackgroundColor(Composer composer, int i) {
                return RhyProgressBar.DefaultImpls.getProgressBarBackgroundColor(this, composer, i);
            }

            @Override // com.robinhood.android.rhyrewards.p246ui.RhyProgressBar
            @JvmName
            public long getProgressBarFillColor(Composer composer, int i) {
                return RhyProgressBar.DefaultImpls.getProgressBarFillColor(this, composer, i);
            }

            @Override // com.robinhood.android.rhyrewards.p246ui.RhyProgressBar
            @JvmName
            public long getProgressBarPendingColor(Composer composer, int i) {
                return RhyProgressBar.DefaultImpls.getProgressBarPendingColor(this, composer, i);
            }
        };

        private Companion() {
        }

        public final RhyProgressBar getDefault() {
            return default;
        }
    }
}
