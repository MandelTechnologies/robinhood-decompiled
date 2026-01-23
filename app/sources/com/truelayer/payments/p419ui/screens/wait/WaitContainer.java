package com.truelayer.payments.p419ui.screens.wait;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.utils.UiText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: WaitContainer.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.wait.ComposableSingletons$WaitContainerKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class WaitContainer {
    public static final WaitContainer INSTANCE = new WaitContainer();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9632lambda1 = ComposableLambda3.composableLambdaInstance(-1283541898, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.wait.ComposableSingletons$WaitContainerKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1283541898, i, -1, "com.truelayer.payments.ui.screens.wait.ComposableSingletons$WaitContainerKt.lambda-1.<anonymous> (WaitContainer.kt:190)");
                }
                WaitContainerView5.WaitContainerView(new UiText.StringResource(C42830R.string.wait_screen_message, new Object[0]), "", null, new Legals(StringResources_androidKt.stringResource(C42830R.string.terms, composer, 0), null), null, composer, 4536, 16);
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
    public final Function2<Composer, Integer, Unit> m27153getLambda1$payments_ui_release() {
        return f9632lambda1;
    }
}
