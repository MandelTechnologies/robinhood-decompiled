package com.truelayer.payments.p419ui.components.toolbars;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.Search2;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.p419ui.C42830R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: SearchBar.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$SearchBarKt {
    public static final ComposableSingletons$SearchBarKt INSTANCE = new ComposableSingletons$SearchBarKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9574lambda1 = ComposableLambda3.composableLambdaInstance(-1045229321, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.ComposableSingletons$SearchBarKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1045229321, i, -1, "com.truelayer.payments.ui.components.toolbars.ComposableSingletons$SearchBarKt.lambda-1.<anonymous> (SearchBar.kt:145)");
                }
                IconKt.m5872Iconww6aTOc(Search2.getSearch(Icons.Filled.INSTANCE), StringResources_androidKt.stringResource(C42830R.string.search, composer, 0), (Modifier) null, 0L, composer, 0, 12);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9575lambda2 = ComposableLambda3.composableLambdaInstance(-1495255495, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.ComposableSingletons$SearchBarKt$lambda-2$1
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
                ComposerKt.traceEventStart(-1495255495, i, -1, "com.truelayer.payments.ui.components.toolbars.ComposableSingletons$SearchBarKt.lambda-2.<anonymous> (SearchBar.kt:157)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27069getLambda1$payments_ui_release() {
        return f9574lambda1;
    }

    /* renamed from: getLambda-2$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27070getLambda2$payments_ui_release() {
        return f9575lambda2;
    }
}
