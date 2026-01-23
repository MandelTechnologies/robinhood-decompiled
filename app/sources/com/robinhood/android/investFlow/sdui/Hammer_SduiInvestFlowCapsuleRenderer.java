package com.robinhood.android.investFlow.sdui;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.sdui.annotations.SduiComponentRenderer;
import com.robinhood.hammer.core.internal.RhGenerated;
import com.robinhood.models.serverdriven.experimental.api.InvestFlowCapsule;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hammer_SduiInvestFlowCapsuleRenderer.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/investFlow/sdui/Hammer_SduiInvestFlowCapsuleRenderer;", "Lcom/robinhood/android/sdui/annotations/SduiComponentRenderer;", "<init>", "()V", "Component", "", "component", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalPadding", "Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;", "(Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;I)V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class Hammer_SduiInvestFlowCapsuleRenderer implements SduiComponentRenderer {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Component$lambda$0(Hammer_SduiInvestFlowCapsuleRenderer hammer_SduiInvestFlowCapsuleRenderer, UIComponent uIComponent, Modifier modifier, HorizontalPadding horizontalPadding, int i, Composer composer, int i2) {
        hammer_SduiInvestFlowCapsuleRenderer.Component(uIComponent, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.sdui.annotations.SduiComponentRenderer
    public void Component(final UIComponent<?> component, final Modifier modifier, final HorizontalPadding horizontalPadding, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        Composer composerStartRestartGroup = composer.startRestartGroup(-981269504);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-981269504, i2, -1, "com.robinhood.android.investFlow.sdui.Hammer_SduiInvestFlowCapsuleRenderer.Component (Hammer_SduiInvestFlowCapsuleRenderer.kt:28)");
            }
            SduiInvestFlowCapsule2.SduiInvestFlowCapsule((InvestFlowCapsule) component, modifier, composerStartRestartGroup, i2 & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investFlow.sdui.Hammer_SduiInvestFlowCapsuleRenderer$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Hammer_SduiInvestFlowCapsuleRenderer.Component$lambda$0(this.f$0, component, modifier, horizontalPadding, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
