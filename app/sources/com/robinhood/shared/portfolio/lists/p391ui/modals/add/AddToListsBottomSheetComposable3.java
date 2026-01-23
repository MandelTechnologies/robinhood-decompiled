package com.robinhood.shared.portfolio.lists.p391ui.modals.add;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.shared.portfolio.lists.p391ui.modals.create.CreateWatchlistRowComposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddToListsBottomSheetComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.add.ComposableSingletons$AddToListsBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class AddToListsBottomSheetComposable3 {
    public static final AddToListsBottomSheetComposable3 INSTANCE = new AddToListsBottomSheetComposable3();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$443588445 = ComposableLambda3.composableLambdaInstance(443588445, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.ComposableSingletons$AddToListsBottomSheetComposableKt$lambda$443588445$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(443588445, i, -1, "com.robinhood.shared.portfolio.lists.ui.modals.add.ComposableSingletons$AddToListsBottomSheetComposableKt.lambda$443588445.<anonymous> (AddToListsBottomSheetComposable.kt:115)");
            }
            CreateWatchlistRowComposable.CreateWatchlistRowComposable(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$443588445$lib_lists_ui_externalDebug() {
        return lambda$443588445;
    }
}
