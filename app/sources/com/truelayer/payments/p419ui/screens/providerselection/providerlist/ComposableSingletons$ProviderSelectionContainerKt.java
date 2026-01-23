package com.truelayer.payments.p419ui.screens.providerselection.providerlist;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.DeleteForever;
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

/* compiled from: ProviderSelectionContainer.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$ProviderSelectionContainerKt {
    public static final ComposableSingletons$ProviderSelectionContainerKt INSTANCE = new ComposableSingletons$ProviderSelectionContainerKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9614lambda1 = ComposableLambda3.composableLambdaInstance(-504554649, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ComposableSingletons$ProviderSelectionContainerKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-504554649, i, -1, "com.truelayer.payments.ui.screens.providerselection.providerlist.ComposableSingletons$ProviderSelectionContainerKt.lambda-1.<anonymous> (ProviderSelectionContainer.kt:325)");
                }
                IconKt.m5872Iconww6aTOc(DeleteForever.getDeleteForever(Icons.Filled.INSTANCE), StringResources_androidKt.stringResource(C42830R.string.clear_previously_used_banks, composer, 0), (Modifier) null, 0L, composer, 0, 12);
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
    public final Function2<Composer, Integer, Unit> m27125getLambda1$payments_ui_release() {
        return f9614lambda1;
    }
}
