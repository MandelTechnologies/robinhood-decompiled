package com.robinhood.utils.compose;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.view.compose.BackHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HideBottomSheetOnBackPress.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"HideBottomSheetOnBackPress", "", "sheetState", "Landroidx/compose/material/ModalBottomSheetState;", "onBackPressDismiss", "Lkotlin/Function0;", "(Landroidx/compose/material/ModalBottomSheetState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-utils-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.compose.HideBottomSheetOnBackPressKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class HideBottomSheetOnBackPress {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HideBottomSheetOnBackPress$lambda$4(ModalBottomSheetState modalBottomSheetState, Function0 function0, int i, int i2, Composer composer, int i3) {
        HideBottomSheetOnBackPress(modalBottomSheetState, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void HideBottomSheetOnBackPress(final ModalBottomSheetState sheetState, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1332272404);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(sheetState) : composerStartRestartGroup.changedInstance(sheetState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.utils.compose.HideBottomSheetOnBackPressKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1332272404, i3, -1, "com.robinhood.utils.compose.HideBottomSheetOnBackPress (HideBottomSheetOnBackPress.kt:17)");
            }
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
            boolean zIsVisible = sheetState.isVisible();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = ((i3 & 14) == 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(sheetState))) | composerStartRestartGroup.changedInstance(coroutineScope) | ((i3 & 112) == 32);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.utils.compose.HideBottomSheetOnBackPressKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HideBottomSheetOnBackPress.HideBottomSheetOnBackPress$lambda$3$lambda$2(coroutineScope, function0, sheetState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            BackHandler.BackHandler(zIsVisible, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.utils.compose.HideBottomSheetOnBackPressKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HideBottomSheetOnBackPress.HideBottomSheetOnBackPress$lambda$4(sheetState, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HideBottomSheetOnBackPress$lambda$3$lambda$2(CoroutineScope coroutineScope, Function0 function0, ModalBottomSheetState modalBottomSheetState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new HideBottomSheetOnBackPress2(modalBottomSheetState, null), 3, null);
        function0.invoke();
        return Unit.INSTANCE;
    }
}
