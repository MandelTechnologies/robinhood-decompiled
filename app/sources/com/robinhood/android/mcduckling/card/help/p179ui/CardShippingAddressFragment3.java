package com.robinhood.android.mcduckling.card.help.p179ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CardShippingAddressFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.mcduckling.card.help.ui.ComposableSingletons$CardShippingAddressFragmentKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class CardShippingAddressFragment3 {
    public static final CardShippingAddressFragment3 INSTANCE = new CardShippingAddressFragment3();

    /* renamed from: lambda$-1883004057, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9113lambda$1883004057 = ComposableLambda3.composableLambdaInstance(-1883004057, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcduckling.card.help.ui.ComposableSingletons$CardShippingAddressFragmentKt$lambda$-1883004057$1
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
                ComposerKt.traceEventStart(-1883004057, i, -1, "com.robinhood.android.mcduckling.card.help.ui.ComposableSingletons$CardShippingAddressFragmentKt.lambda$-1883004057.<anonymous> (CardShippingAddressFragment.kt:48)");
            }
            BentoText2.m20747BentoText38GnDrw("--- -------- --\n----- ----- -- -----", null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getDisplayNibSmall(), composer, 6, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-2013356297, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9114lambda$2013356297 = ComposableLambda3.composableLambdaInstance(-2013356297, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcduckling.card.help.ui.ComposableSingletons$CardShippingAddressFragmentKt$lambda$-2013356297$1
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
                ComposerKt.traceEventStart(-2013356297, i, -1, "com.robinhood.android.mcduckling.card.help.ui.ComposableSingletons$CardShippingAddressFragmentKt.lambda$-2013356297.<anonymous> (CardShippingAddressFragment.kt:47)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, CardShippingAddressFragment3.INSTANCE.m16487getLambda$1883004057$feature_mcduckling_help_externalDebug(), composer, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$864804783 = ComposableLambda3.composableLambdaInstance(864804783, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcduckling.card.help.ui.ComposableSingletons$CardShippingAddressFragmentKt$lambda$864804783$1
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
                ComposerKt.traceEventStart(864804783, i, -1, "com.robinhood.android.mcduckling.card.help.ui.ComposableSingletons$CardShippingAddressFragmentKt.lambda$864804783.<anonymous> (CardShippingAddressFragment.kt:46)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CardShippingAddressFragment3.INSTANCE.m16488getLambda$2013356297$feature_mcduckling_help_externalDebug(), composer, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1883004057$feature_mcduckling_help_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m16487getLambda$1883004057$feature_mcduckling_help_externalDebug() {
        return f9113lambda$1883004057;
    }

    /* renamed from: getLambda$-2013356297$feature_mcduckling_help_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m16488getLambda$2013356297$feature_mcduckling_help_externalDebug() {
        return f9114lambda$2013356297;
    }

    public final Function2<Composer, Integer, Unit> getLambda$864804783$feature_mcduckling_help_externalDebug() {
        return lambda$864804783;
    }
}
