package com.robinhood.android.eventcontracts.sharedeventui.navbar;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CategoryItem.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.navbar.ComposableSingletons$CategoryItemKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class CategoryItem6 {
    public static final CategoryItem6 INSTANCE = new CategoryItem6();

    /* renamed from: lambda$-587516737, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8962lambda$587516737 = ComposableLambda3.composableLambdaInstance(-587516737, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.navbar.ComposableSingletons$CategoryItemKt$lambda$-587516737$1
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
                ComposerKt.traceEventStart(-587516737, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.navbar.ComposableSingletons$CategoryItemKt.lambda$-587516737.<anonymous> (CategoryItem.kt:135)");
            }
            CategoryItem2.FancyCategoryItem("Featured", null, composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-587516737$lib_shared_event_ui_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14410getLambda$587516737$lib_shared_event_ui_externalDebug() {
        return f8962lambda$587516737;
    }
}
