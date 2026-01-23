package com.robinhood.android.options.comboorders.detail;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ComboOrderDetailComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt$lambda$-2131860978$1 */
/* loaded from: classes11.dex */
final class C23018xa8a55330 implements Function3<PaddingValues, Composer, Integer, Unit> {
    public static final C23018xa8a55330 INSTANCE = new C23018xa8a55330();

    C23018xa8a55330() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
        invoke(paddingValues, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PaddingValues contentPadding, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(contentPadding) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2131860978, i2, -1, "com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt.lambda$-2131860978.<anonymous> (ComboOrderDetailComposable.kt:194)");
        }
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt$lambda$-2131860978$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C23018xa8a55330.invoke$lambda$1$lambda$0((LazyListScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, contentPadding, false, null, null, null, false, null, (Function1) objRememberedValue, composer, ((i2 << 6) & 896) | 805306374, 506);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        ComposableSingletons$ComboOrderDetailComposableKt composableSingletons$ComboOrderDetailComposableKt = ComposableSingletons$ComboOrderDetailComposableKt.INSTANCE;
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$ComboOrderDetailComposableKt.m16894getLambda$1708953575$feature_combo_order_detail_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$ComboOrderDetailComposableKt.m16899getLambda$755710078$feature_combo_order_detail_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$ComboOrderDetailComposableKt.m16900getLambda$926549535$feature_combo_order_detail_externalDebug(), 3, null);
        return Unit.INSTANCE;
    }
}
