package com.robinhood.shared.iac.herocards.p383ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.herocard.IacHeroCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BackendColorSupport.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"backgroundColor", "Landroidx/compose/ui/graphics/Color;", "Lcom/robinhood/models/db/herocard/IacHeroCard;", "(Lcom/robinhood/models/db/herocard/IacHeroCard;Landroidx/compose/runtime/Composer;I)J", "textColor", "ctaTextColor", "lib-iac-hero-cards_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.iac.herocards.ui.BackendColorSupportKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class BackendColorSupport {
    public static final long backgroundColor(IacHeroCard iacHeroCard, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(iacHeroCard, "<this>");
        composer.startReplaceGroup(-51114035);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-51114035, i, -1, "com.robinhood.shared.iac.herocards.ui.backgroundColor (BackendColorSupport.kt:9)");
        }
        long jM18896toComposeColorDefaultediJQMabo = SduiColors2.m18896toComposeColorDefaultediJQMabo(SduiColors2.toSduiThemedColor(iacHeroCard.getStyle().getBackgroundColor()), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21372getBg20d7_KjU(), composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM18896toComposeColorDefaultediJQMabo;
    }

    public static final long textColor(IacHeroCard iacHeroCard, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(iacHeroCard, "<this>");
        composer.startReplaceGroup(-1693466804);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1693466804, i, -1, "com.robinhood.shared.iac.herocards.ui.textColor (BackendColorSupport.kt:15)");
        }
        long jM18896toComposeColorDefaultediJQMabo = SduiColors2.m18896toComposeColorDefaultediJQMabo(SduiColors2.toSduiThemedColor(iacHeroCard.getStyle().getTextColor()), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM18896toComposeColorDefaultediJQMabo;
    }

    public static final long ctaTextColor(IacHeroCard iacHeroCard, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(iacHeroCard, "<this>");
        composer.startReplaceGroup(-1280817970);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1280817970, i, -1, "com.robinhood.shared.iac.herocards.ui.ctaTextColor (BackendColorSupport.kt:21)");
        }
        long jM18896toComposeColorDefaultediJQMabo = SduiColors2.m18896toComposeColorDefaultediJQMabo(SduiColors2.toSduiThemedColor(iacHeroCard.getStyle().getCtaTextColor()), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM18896toComposeColorDefaultediJQMabo;
    }
}
