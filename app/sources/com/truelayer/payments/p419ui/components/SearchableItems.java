package com.truelayer.payments.p419ui.components;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchableItems.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.components.ComposableSingletons$SearchableItemsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class SearchableItems {
    public static final SearchableItems INSTANCE = new SearchableItems();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<LazyItemScope, Composer, Integer, Unit> f9565lambda1 = ComposableLambda3.composableLambdaInstance(341148301, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.ComposableSingletons$SearchableItemsKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(341148301, i, -1, "com.truelayer.payments.ui.components.ComposableSingletons$SearchableItemsKt.lambda-1.<anonymous> (SearchableItems.kt:123)");
            }
            ItemDivider.ItemDivider(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m27035getLambda1$payments_ui_release() {
        return f9565lambda1;
    }
}
