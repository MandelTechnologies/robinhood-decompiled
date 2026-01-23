package com.robinhood.android.libdesignsystem.serverui.experimental.page;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GenericActionStandardPageFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.page.GenericActionStandardPageFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class GenericActionStandardPageFragment4 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
    final /* synthetic */ GenericActionStandardPageFragment this$0;

    GenericActionStandardPageFragment4(GenericActionStandardPageFragment genericActionStandardPageFragment) {
        this.this$0 = genericActionStandardPageFragment;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
        invoke(bentoAppBarScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
        }
        if ((i & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1358741471, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.page.GenericActionStandardPageFragment.ComposeContent.<anonymous>.<anonymous> (GenericActionStandardPageFragment.kt:62)");
        }
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.this$0);
        final GenericActionStandardPageFragment genericActionStandardPageFragment = this.this$0;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.page.GenericActionStandardPageFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GenericActionStandardPageFragment4.invoke$lambda$1$lambda$0(genericActionStandardPageFragment);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(GenericActionStandardPageFragment genericActionStandardPageFragment) {
        genericActionStandardPageFragment.requireBaseActivity().onBackPressed();
        return Unit.INSTANCE;
    }
}
