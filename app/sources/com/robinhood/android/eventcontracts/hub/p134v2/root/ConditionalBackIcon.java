package com.robinhood.android.eventcontracts.hub.p134v2.root;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.NavControllers;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: ConditionalBackIcon.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"ConditionalBackIcon", "", "Lcom/robinhood/compose/bento/component/BentoAppBarScope;", "(Lcom/robinhood/compose/bento/component/BentoAppBarScope;Landroidx/compose/runtime/Composer;I)V", "feature-hub-v2_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.ConditionalBackIconKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ConditionalBackIcon {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConditionalBackIcon$lambda$2(BentoAppBarScope bentoAppBarScope, int i, Composer composer, int i2) {
        ConditionalBackIcon(bentoAppBarScope, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ConditionalBackIcon(BentoAppBarScope bentoAppBarScope, Composer composer, final int i) {
        int i2;
        final BentoAppBarScope bentoAppBarScope2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(bentoAppBarScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(2108197732);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(bentoAppBarScope) : composerStartRestartGroup.changedInstance(bentoAppBarScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2108197732, i2, -1, "com.robinhood.android.eventcontracts.hub.v2.root.ConditionalBackIcon (ConditionalBackIcon.kt:9)");
            }
            OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
            OnBackPressedDispatcher onBackPressedDispatcher = current != null ? current.getOnBackPressedDispatcher() : null;
            if (NavControllers.destinationBackStack(((LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator())).getNavController()).size() <= 1) {
                composerStartRestartGroup.startReplaceGroup(12290112);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(onBackPressedDispatcher);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ConditionalBackIcon2(onBackPressedDispatcher);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                bentoAppBarScope2 = bentoAppBarScope;
                bentoAppBarScope2.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) ((KFunction) objRememberedValue), composer2, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 7);
                composer2.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(12357506);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(onBackPressedDispatcher);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new ConditionalBackIcon3(onBackPressedDispatcher);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                bentoAppBarScope2 = bentoAppBarScope;
                bentoAppBarScope2.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) ((KFunction) objRememberedValue2), composerStartRestartGroup, ((i2 << 12) & 57344) | (BentoAppBarScope.$stable << 12), 7);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            bentoAppBarScope2 = bentoAppBarScope;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.ConditionalBackIconKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConditionalBackIcon.ConditionalBackIcon$lambda$2(bentoAppBarScope2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConditionalBackIcon$onBackClick(OnBackPressedDispatcher onBackPressedDispatcher) {
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.onBackPressed();
        }
    }
}
