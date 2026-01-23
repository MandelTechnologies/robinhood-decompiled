package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.paging.compose.LazyPagingItems;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiPaginatedList.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPaginatedListKt$SduiPaginatedList$2$1$2, reason: use source file name */
/* loaded from: classes8.dex */
final class SduiPaginatedList7 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ LazyPagingItems<UIComponent<ActionT>> $lazyPagingItems;

    SduiPaginatedList7(LazyPagingItems<UIComponent<ActionT>> lazyPagingItems) {
        this.$lazyPagingItems = lazyPagingItems;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(LazyPagingItems lazyPagingItems) {
        lazyPagingItems.retry();
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1971203057, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPaginatedList.<anonymous>.<anonymous>.<anonymous> (SduiPaginatedList.kt:74)");
        }
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.$lazyPagingItems);
        final LazyPagingItems<UIComponent<ActionT>> lazyPagingItems = this.$lazyPagingItems;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPaginatedListKt$SduiPaginatedList$2$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SduiPaginatedList7.invoke$lambda$1$lambda$0(lazyPagingItems);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        SduiPaginatedList5.RetryButton((Function0) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
