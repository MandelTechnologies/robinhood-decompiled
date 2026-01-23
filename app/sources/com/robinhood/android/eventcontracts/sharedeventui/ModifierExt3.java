package com.robinhood.android.eventcontracts.sharedeventui;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModifierExt.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\r\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"mirrorVertically", "Landroidx/compose/ui/Modifier;", "PreviewMirrorVerticallyModifier", "", "(Landroidx/compose/runtime/Composer;I)V", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.ModifierExtKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ModifierExt3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewMirrorVerticallyModifier$lambda$1(int i, Composer composer, int i2) {
        PreviewMirrorVerticallyModifier(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Modifier mirrorVertically(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return GraphicsLayerModifier6.graphicsLayer(modifier, new Function1() { // from class: com.robinhood.android.eventcontracts.sharedeventui.ModifierExtKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifierExt3.mirrorVertically$lambda$0((GraphicsLayerScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mirrorVertically$lambda$0(GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setScaleX(-1.0f);
        return Unit.INSTANCE;
    }

    private static final void PreviewMirrorVerticallyModifier(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(58203965);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(58203965, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.PreviewMirrorVerticallyModifier (ModifierExt.kt:18)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ModifierExt.INSTANCE.m14357getLambda$1129586555$lib_shared_event_ui_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.ModifierExtKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ModifierExt3.PreviewMirrorVerticallyModifier$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
