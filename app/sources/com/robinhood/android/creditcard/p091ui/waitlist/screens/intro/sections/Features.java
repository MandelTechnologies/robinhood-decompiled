package com.robinhood.android.creditcard.p091ui.waitlist.screens.intro.sections;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: Features.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.ComposableSingletons$FeaturesKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class Features {
    public static final Features INSTANCE = new Features();

    /* renamed from: lambda$-1610813232, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8808lambda$1610813232 = ComposableLambda3.composableLambdaInstance(-1610813232, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.ComposableSingletons$FeaturesKt$lambda$-1610813232$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1610813232, i, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.ComposableSingletons$FeaturesKt.lambda$-1610813232.<anonymous> (Features.kt:132)");
            }
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, Features4.FAMILY_VIDEO_TITLE_TEST_TAG);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_family_subheader1, composer, 0), modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextL(), composer, 48, 0, 8124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1451921799 = ComposableLambda3.composableLambdaInstance(1451921799, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.ComposableSingletons$FeaturesKt$lambda$1451921799$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1451921799, i, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.ComposableSingletons$FeaturesKt.lambda$1451921799.<anonymous> (Features.kt:146)");
            }
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, Features4.FAMILY_KEY_VIDEO_TITLE_TEST_TAG);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_family_subheader2, composer, 0), modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextL(), composer, 48, 0, 8124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1610813232$feature_credit_card_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12896getLambda$1610813232$feature_credit_card_externalDebug() {
        return f8808lambda$1610813232;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1451921799$feature_credit_card_externalDebug() {
        return lambda$1451921799;
    }
}
