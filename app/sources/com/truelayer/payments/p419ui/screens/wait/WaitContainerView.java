package com.truelayer.payments.p419ui.screens.wait;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.p419ui.utils.UiText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: WaitContainerView.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.wait.ComposableSingletons$WaitContainerViewKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class WaitContainerView {
    public static final WaitContainerView INSTANCE = new WaitContainerView();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9633lambda1 = ComposableLambda3.composableLambdaInstance(1893165445, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.wait.ComposableSingletons$WaitContainerViewKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1893165445, i, -1, "com.truelayer.payments.ui.screens.wait.ComposableSingletons$WaitContainerViewKt.lambda-1.<anonymous> (WaitContainerView.kt:48)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9634lambda2 = ComposableLambda3.composableLambdaInstance(1882152897, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.wait.ComposableSingletons$WaitContainerViewKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1882152897, i, -1, "com.truelayer.payments.ui.screens.wait.ComposableSingletons$WaitContainerViewKt.lambda-2.<anonymous> (WaitContainerView.kt:48)");
            }
            AppBarKt.TopAppBar(WaitContainerView.INSTANCE.m27154getLambda1$payments_ui_release(), null, null, null, null, null, null, composer, 6, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function3<UiText, Composer, Integer, Unit> f9635lambda3 = ComposableLambda3.composableLambdaInstance(-2010798138, false, new Function3<UiText, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.wait.ComposableSingletons$WaitContainerViewKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(UiText uiText, Composer composer, Integer num) {
            invoke(uiText, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(UiText uiText, Composer composer, int i) {
            int i2;
            if ((i & 14) == 0) {
                i2 = i | (composer.changed(uiText) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 91) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2010798138, i2, -1, "com.truelayer.payments.ui.screens.wait.ComposableSingletons$WaitContainerViewKt.lambda-3.<anonymous> (WaitContainerView.kt:89)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                composer.startReplaceableGroup(525761412);
                String strAsString = uiText != null ? uiText.asString(composer, i2 & 14) : null;
                composer.endReplaceableGroup();
                if (strAsString == null) {
                    strAsString = "";
                }
                TextKt.m6028Text4IGK_g(strAsString, modifierFillMaxWidth$default, 0L, 0L, null, null, null, 0L, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 48, 0, 65020);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27154getLambda1$payments_ui_release() {
        return f9633lambda1;
    }

    /* renamed from: getLambda-2$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27155getLambda2$payments_ui_release() {
        return f9634lambda2;
    }

    /* renamed from: getLambda-3$payments_ui_release, reason: not valid java name */
    public final Function3<UiText, Composer, Integer, Unit> m27156getLambda3$payments_ui_release() {
        return f9635lambda3;
    }
}
