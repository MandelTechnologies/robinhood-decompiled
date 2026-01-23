package com.robinhood.android.onboarding.p205ui.usercreation.loading;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UserCreationLoadingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.onboarding.ui.usercreation.loading.ComposableSingletons$UserCreationLoadingFragmentKt$lambda$2086390927$1, reason: use source file name */
/* loaded from: classes10.dex */
final class UserCreationLoadingFragment6 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
    public static final UserCreationLoadingFragment6 INSTANCE = new UserCreationLoadingFragment6();

    UserCreationLoadingFragment6() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
        invoke(bentoButtonBar3, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(BentoButtonBarScreenLayout) : composer.changedInstance(BentoButtonBarScreenLayout) ? 4 : 2;
        }
        if ((i & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2086390927, i, -1, "com.robinhood.android.onboarding.ui.usercreation.loading.ComposableSingletons$UserCreationLoadingFragmentKt.lambda$2086390927.<anonymous> (UserCreationLoadingFragment.kt:82)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.onboarding.ui.usercreation.loading.ComposableSingletons$UserCreationLoadingFragmentKt$lambda$2086390927$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoButtonBarScreenLayout.PrimaryButtonOnly(null, null, (Function0) objRememberedValue, "--------", false, null, false, composer, (BentoButtonBar3.$stable << 21) | 3456 | ((i << 21) & 29360128), 115);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
