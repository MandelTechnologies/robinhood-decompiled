package com.robinhood.android.libdesignsystem.serverui.experimental.compose.dagger;

import android.content.Context;
import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.sdui.annotations.SduiComponentRenderer;
import com.robinhood.android.sdui.annotations.SduiEntryPoint;
import com.robinhood.hammer.android.EntryPoints;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiDaggerComponent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"SduiDaggerComponent", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalPadding", "Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;", "(Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.dagger.SduiDaggerComponentKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiDaggerComponent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiDaggerComponent$lambda$0(UIComponent uIComponent, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiDaggerComponent(uIComponent, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final <ActionT extends Parcelable> void SduiDaggerComponent(final UIComponent<? extends ActionT> component, Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final HorizontalPadding horizontalPadding2;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1619889706);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (i5 != 0) {
                horizontalPadding = HorizontalPadding.None;
            }
            HorizontalPadding horizontalPadding3 = horizontalPadding;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1619889706, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.dagger.SduiDaggerComponent (SduiDaggerComponent.kt:21)");
            }
            SduiComponentRenderer sduiComponentRenderer = ((SduiEntryPoint) EntryPoints.applicationEntryPoint((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))).jsonComponents().get(component.getClass());
            if (sduiComponentRenderer != null) {
                composerStartRestartGroup.startReplaceGroup(118655906);
                sduiComponentRenderer.Component(component, modifier3, horizontalPadding3, composerStartRestartGroup, i3 & 1022);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(118734336);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.dagger.SduiDaggerComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiDaggerComponent.SduiDaggerComponent$lambda$0(component, modifier2, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
