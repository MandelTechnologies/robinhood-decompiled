package com.robinhood.android.eventcontracts.hub.p134v2.root.navbar;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NavBarComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.navbar.ComposableSingletons$NavBarComposableKt$lambda$-1704186676$1, reason: use source file name */
/* loaded from: classes3.dex */
final class NavBarComposable2 implements Function2<Composer, Integer, Unit> {
    public static final NavBarComposable2 INSTANCE = new NavBarComposable2();

    NavBarComposable2() {
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
            ComposerKt.traceEventStart(-1704186676, i, -1, "com.robinhood.android.eventcontracts.hub.v2.root.navbar.ComposableSingletons$NavBarComposableKt.lambda$-1704186676.<anonymous> (NavBarComposable.kt:42)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.navbar.ComposableSingletons$NavBarComposableKt$lambda$-1704186676$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CategoryItem.CategoryItem("           ", (Function0) objRememberedValue, null, false, false, false, composer, 3126, 52);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
