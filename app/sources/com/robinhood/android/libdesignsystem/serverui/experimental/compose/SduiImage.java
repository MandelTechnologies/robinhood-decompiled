package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.libdesignsystem.serverui.experimental.RemoteImageRendererIdl;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.ImageDto;

/* compiled from: SduiImage.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"SduiImage", "", "component", "Lrh_server_driven_ui/v1/ImageDto;", "modifier", "Landroidx/compose/ui/Modifier;", "showDebugBorders", "", "(Lrh_server_driven_ui/v1/ImageDto;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiImageKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiImage {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiImage$lambda$0(ImageDto imageDto, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        SduiImage(imageDto, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void SduiImage(final ImageDto component, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final boolean z2;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(912856120);
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
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            boolean z3 = i5 != 0 ? false : z;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(912856120, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiImage (SduiImage.kt:12)");
            }
            ImageDto.SourceDto source = component.getSource();
            ImageDto.SourceDto.ConcreteDto concrete = source != null ? source.getConcrete() : null;
            if (concrete instanceof ImageDto.SourceDto.ConcreteDto.Icon) {
                composerStartRestartGroup.startReplaceGroup(1081410548);
                SduiIcon2.SduiIcon(((ImageDto.SourceDto.ConcreteDto.Icon) concrete).getValue(), modifier3, composerStartRestartGroup, i3 & 112, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (concrete instanceof ImageDto.SourceDto.ConcreteDto.Pictogram) {
                composerStartRestartGroup.startReplaceGroup(1081415289);
                SduiPictogram2.SduiPictogram(((ImageDto.SourceDto.ConcreteDto.Pictogram) concrete).getValue(), modifier3, composerStartRestartGroup, i3 & 112, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (concrete instanceof ImageDto.SourceDto.ConcreteDto.Remote) {
                composerStartRestartGroup.startReplaceGroup(1081420190);
                RemoteImageRendererIdl.SduiRemoteImage(((ImageDto.SourceDto.ConcreteDto.Remote) concrete).getValue(), component.getContent_mode(), modifier3, z3, composerStartRestartGroup, (i3 << 3) & 8064, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (concrete != null) {
                    composerStartRestartGroup.startReplaceGroup(1081407846);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-835505272);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            z2 = z3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            z2 = z;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiImageKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiImage.SduiImage$lambda$0(component, modifier2, z2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
