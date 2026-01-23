package com.robinhood.android.libdesignsystem.serverui.experimental.compose.dagger;

import android.content.Context;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.sdui.annotations.SduiComponentRendererIdl;
import com.robinhood.android.sdui.annotations.SduiEntryPoint;
import com.robinhood.hammer.android.EntryPoints;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: SduiDaggerComponentIdl.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"SduiDaggerComponentIdl", "", "ActionT", "component", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "parseAction", "Lkotlin/Function1;", "Lrh_server_driven_ui/v1/ActionDto;", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalPadding", "Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;", "(Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.dagger.SduiDaggerComponentIdlKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiDaggerComponentIdl {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiDaggerComponentIdl$lambda$0(UIComponentDto.ConcreteDto concreteDto, Function1 function1, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiDaggerComponentIdl(concreteDto, function1, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final <ActionT> void SduiDaggerComponentIdl(final UIComponentDto.ConcreteDto component, final Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final HorizontalPadding horizontalPadding2;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1388597782);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(parseAction) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            HorizontalPadding horizontalPadding3 = i5 != 0 ? HorizontalPadding.None : horizontalPadding;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1388597782, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.dagger.SduiDaggerComponentIdl (SduiDaggerComponentIdl.kt:23)");
            }
            SduiComponentRendererIdl sduiComponentRendererIdl = ((SduiEntryPoint) EntryPoints.applicationEntryPoint((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))).protoComponents().get(component.getClass());
            if (sduiComponentRendererIdl != null) {
                composerStartRestartGroup.startReplaceGroup(-1408081931);
                sduiComponentRendererIdl.Component(component, parseAction, modifier3, horizontalPadding3, composerStartRestartGroup, i3 & 8190);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1407990636);
                UtilKt.ComponentNotFound(component, (Modifier) null, composerStartRestartGroup, i3 & 14, 2);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            horizontalPadding2 = horizontalPadding3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            horizontalPadding2 = horizontalPadding;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.dagger.SduiDaggerComponentIdlKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiDaggerComponentIdl.SduiDaggerComponentIdl$lambda$0(component, parseAction, modifier2, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
