package com.robinhood.android.options.comboorders.detail;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ComboOrderDetailComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt$lambda$2056932503$1 */
/* loaded from: classes11.dex */
final class C23026xd08fe0fb implements Function2<Composer, Integer, Unit> {
    public static final C23026xd08fe0fb INSTANCE = new C23026xd08fe0fb();

    C23026xd08fe0fb() {
    }

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
            ComposerKt.traceEventStart(2056932503, i, -1, "com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt.lambda$2056932503.<anonymous> (ComboOrderDetailComposable.kt:63)");
        }
        Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxSize$default(TestTag3.testTag(Modifier.INSTANCE, TestTags.LOADABLE), 0.0f, 1, null), C2002Dp.m7995constructorimpl(48), WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composer, 6), composer, 0).getBottom(), composer, 54, 0);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt$lambda$2056932503$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C23026xd08fe0fb.invoke$lambda$1$lambda$0((LazyListScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        LazyDslKt.LazyColumn(modifierM21622defaultHorizontalPaddingWMci_g0, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 805306368, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        ComposableSingletons$ComboOrderDetailComposableKt composableSingletons$ComboOrderDetailComposableKt = ComposableSingletons$ComboOrderDetailComposableKt.INSTANCE;
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$ComboOrderDetailComposableKt.getLambda$601616354$feature_combo_order_detail_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$ComboOrderDetailComposableKt.m16896getLambda$1887701749$feature_combo_order_detail_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$ComboOrderDetailComposableKt.getLambda$1922320298$feature_combo_order_detail_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$ComboOrderDetailComposableKt.getLambda$1437375049$feature_combo_order_detail_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$ComboOrderDetailComposableKt.getLambda$952429800$feature_combo_order_detail_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$ComboOrderDetailComposableKt.getLambda$467484551$feature_combo_order_detail_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$ComboOrderDetailComposableKt.m16895getLambda$17460698$feature_combo_order_detail_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$ComboOrderDetailComposableKt.m16898getLambda$502405947$feature_combo_order_detail_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$ComboOrderDetailComposableKt.m16901getLambda$987351196$feature_combo_order_detail_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$ComboOrderDetailComposableKt.m16893getLambda$1472296445$feature_combo_order_detail_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$ComboOrderDetailComposableKt.getLambda$1753558281$feature_combo_order_detail_externalDebug(), 3, null);
        return Unit.INSTANCE;
    }
}
