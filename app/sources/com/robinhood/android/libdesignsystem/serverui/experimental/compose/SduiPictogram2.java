package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.foundation.ImageKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.extensions.PictogramDtos;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.ImageDto;
import rh_server_driven_ui.p531v1.PictogramDto;

/* compiled from: SduiPictogram.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0000¨\u0006\n"}, m3636d2 = {"SduiPictogram", "", "component", "Lrh_server_driven_ui/v1/ImageDto$SourceDto$ImagePictogramDto;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lrh_server_driven_ui/v1/ImageDto$SourceDto$ImagePictogramDto;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "toPictogramAsset", "Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;", "Lrh_server_driven_ui/v1/PictogramDto;", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPictogramKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiPictogram2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiPictogram$lambda$0(ImageDto.SourceDto.ImagePictogramDto imagePictogramDto, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiPictogram(imagePictogramDto, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void SduiPictogram(final ImageDto.SourceDto.ImagePictogramDto component, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(1653431950);
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
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1653431950, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPictogram (SduiPictogram.kt:12)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(toPictogramAsset(component.getPictogram()).getResourceId(), composerStartRestartGroup, 0), (String) null, modifier2, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 896) | 48, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPictogramKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiPictogram2.SduiPictogram$lambda$0(component, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final ServerToBentoAssetMapper3 toPictogramAsset(PictogramDto pictogramDto) {
        Intrinsics.checkNotNullParameter(pictogramDto, "<this>");
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(PictogramDtos.getServerValue(pictogramDto));
        return serverToBentoAssetMapper3FromServerValue == null ? ServerToBentoAssetMapper3.UNKNOWN : serverToBentoAssetMapper3FromServerValue;
    }
}
