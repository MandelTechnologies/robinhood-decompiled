package com.robinhood.android.transfers.p271ui.p272v2;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CreateTransferV2Composable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.v2.ComposableSingletons$CreateTransferV2ComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CreateTransferV2Composable {
    public static final CreateTransferV2Composable INSTANCE = new CreateTransferV2Composable();

    /* renamed from: lambda$-589898730, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9295lambda$589898730 = ComposableLambda3.composableLambdaInstance(-589898730, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.v2.ComposableSingletons$CreateTransferV2ComposableKt$lambda$-589898730$1
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
                ComposerKt.traceEventStart(-589898730, i, -1, "com.robinhood.android.transfers.ui.v2.ComposableSingletons$CreateTransferV2ComposableKt.lambda$-589898730.<anonymous> (CreateTransferV2Composable.kt:179)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-589898730$feature_transfers_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m19952getLambda$589898730$feature_transfers_externalRelease() {
        return f9295lambda$589898730;
    }
}
