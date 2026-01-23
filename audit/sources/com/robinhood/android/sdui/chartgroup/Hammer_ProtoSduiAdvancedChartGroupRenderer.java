package com.robinhood.android.sdui.chartgroup;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.sdui.annotations.SduiComponentRendererIdl;
import com.robinhood.hammer.core.internal.RhGenerated;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: Hammer_ProtoSduiAdvancedChartGroupRenderer.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JR\u0010\u0004\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\b2%\u0010\t\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0006\u0012\u0004\u0018\u0001H\u00060\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/sdui/chartgroup/Hammer_ProtoSduiAdvancedChartGroupRenderer;", "Lcom/robinhood/android/sdui/annotations/SduiComponentRendererIdl;", "<init>", "()V", "Component", "", "ActionT", "component", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "parseAction", "Lkotlin/Function1;", "Lrh_server_driven_ui/v1/ActionDto;", "Lkotlin/ParameterName;", "name", "actionDto", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalPadding", "Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;", "(Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;I)V", "lib-sdui-charts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class Hammer_ProtoSduiAdvancedChartGroupRenderer implements SduiComponentRendererIdl {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Component$lambda$0(Hammer_ProtoSduiAdvancedChartGroupRenderer hammer_ProtoSduiAdvancedChartGroupRenderer, UIComponentDto.ConcreteDto concreteDto, Function1 function1, Modifier modifier, HorizontalPadding horizontalPadding, int i, Composer composer, int i2) {
        hammer_ProtoSduiAdvancedChartGroupRenderer.Component(concreteDto, function1, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.sdui.annotations.SduiComponentRendererIdl
    public <ActionT> void Component(final UIComponentDto.ConcreteDto component, final Function1<? super ActionDto, ? extends ActionT> parseAction, final Modifier modifier, final HorizontalPadding horizontalPadding, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2091436914);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 131) != 130 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2091436914, i2, -1, "com.robinhood.android.sdui.chartgroup.Hammer_ProtoSduiAdvancedChartGroupRenderer.Component (Hammer_ProtoSduiAdvancedChartGroupRenderer.kt:29)");
            }
            SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup((UIComponentDto.ConcreteDto.ChartGroup) component, modifier, null, null, null, null, null, null, null, composerStartRestartGroup, (i2 >> 3) & 112, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.Hammer_ProtoSduiAdvancedChartGroupRenderer$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Hammer_ProtoSduiAdvancedChartGroupRenderer.Component$lambda$0(this.f$0, component, parseAction, modifier, horizontalPadding, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
