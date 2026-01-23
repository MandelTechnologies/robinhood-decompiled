package com.robinhood.shared.update.password;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdatePasswordSuccessComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"UpdatePasswordSuccessComposable", "", "onContinueClicked", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-update-password_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.update.password.UpdatePasswordSuccessComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class UpdatePasswordSuccessComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdatePasswordSuccessComposable$lambda$0(Function0 function0, int i, Composer composer, int i2) {
        UpdatePasswordSuccessComposable(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void UpdatePasswordSuccessComposable(final Function0<Unit> onContinueClicked, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1777131862);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onContinueClicked) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1777131862, i2, -1, "com.robinhood.shared.update.password.UpdatePasswordSuccessComposable (UpdatePasswordSuccessComposable.kt:23)");
            }
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), false, ComposableLambda3.rememberComposableLambda(-889434347, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.shared.update.password.UpdatePasswordSuccessComposableKt.UpdatePasswordSuccessComposable.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i3) {
                    int i4;
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i3 & 6) == 0) {
                        i4 = ((i3 & 8) == 0 ? composer2.changed(BentoButtonBarScreenLayout) : composer2.changedInstance(BentoButtonBarScreenLayout) ? 4 : 2) | i3;
                    } else {
                        i4 = i3;
                    }
                    if ((i4 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-889434347, i4, -1, "com.robinhood.shared.update.password.UpdatePasswordSuccessComposable.<anonymous> (UpdatePasswordSuccessComposable.kt:27)");
                    }
                    BentoButtonBarScreenLayout.PrimaryButtonOnly(null, null, onContinueClicked, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer2, 0), false, null, false, composer2, (BentoButtonBar3.$stable << 21) | ((i4 << 21) & 29360128), 115);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), UpdatePasswordSuccessComposable.INSTANCE.m26394getLambda$1269539646$feature_update_password_externalDebug(), composerStartRestartGroup, 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.update.password.UpdatePasswordSuccessComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdatePasswordSuccessComposable3.UpdatePasswordSuccessComposable$lambda$0(onContinueClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
