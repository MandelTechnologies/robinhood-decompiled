package com.robinhood.android.dashboard.lib.mcw.fxswitcherftux;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.dashboard.lib.C13691R;
import com.robinhood.compose.bento.component.BentoText2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FxSwitcherFtux.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.ComposableSingletons$FxSwitcherFtuxKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class FxSwitcherFtux {
    public static final FxSwitcherFtux INSTANCE = new FxSwitcherFtux();

    /* renamed from: lambda$-1604700078, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8867lambda$1604700078 = ComposableLambda3.composableLambdaInstance(-1604700078, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.ComposableSingletons$FxSwitcherFtuxKt$lambda$-1604700078$1
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
                ComposerKt.traceEventStart(-1604700078, i, -1, "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.ComposableSingletons$FxSwitcherFtuxKt.lambda$-1604700078.<anonymous> (FxSwitcherFtux.kt:138)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C13691R.string.fx_switcher_ftux_appbar_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function4<AnimatedContentScope, String, Composer, Integer, Unit> lambda$1224524262 = ComposableLambda3.composableLambdaInstance(1224524262, false, new Function4<AnimatedContentScope, String, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.ComposableSingletons$FxSwitcherFtuxKt$lambda$1224524262$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, String str, Composer composer, Integer num) {
            invoke(animatedContentScope, str, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope AnimatedContent, String targetText, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            Intrinsics.checkNotNullParameter(targetText, "targetText");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1224524262, i, -1, "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.ComposableSingletons$FxSwitcherFtuxKt.lambda$1224524262.<anonymous> (FxSwitcherFtux.kt:265)");
            }
            BentoText2.m20747BentoText38GnDrw(targetText, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer, (i >> 3) & 14, 0, 16318);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1604700078$lib_account_home_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13213getLambda$1604700078$lib_account_home_externalDebug() {
        return f8867lambda$1604700078;
    }

    public final Function4<AnimatedContentScope, String, Composer, Integer, Unit> getLambda$1224524262$lib_account_home_externalDebug() {
        return lambda$1224524262;
    }
}
