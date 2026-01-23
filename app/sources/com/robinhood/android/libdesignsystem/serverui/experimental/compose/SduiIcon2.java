package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.shared.serverui.utils.IconKt;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.theme.SduiColors;
import com.robinhood.compose.theme.SduiColors3;
import com.robinhood.models.serverdriven.experimental.api.ButtonIcon;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.IconImage;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ButtonDto;
import rh_server_driven_ui.p531v1.IconDto;
import rh_server_driven_ui.p531v1.ImageDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: SduiIcon.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a/\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u001c\u0010\t\u001a\u0004\u0018\u00010\n*\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000e\u001a\f\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\u0011\u001a\f\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u0011\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00122\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0013\u001a\f\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\u0014\u001a\f\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u0014¨\u0006\u0015"}, m3636d2 = {"SduiIcon", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/IconImage;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/IconImage;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "toBentoIcon", "Lcom/robinhood/compose/bento/component/BentoIcons;", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/models/serverdriven/experimental/api/ButtonIcon;", "Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto;", "Lcom/robinhood/android/shared/serverui/utils/AnyButtonIcon;", "toBentoAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "Lrh_server_driven_ui/v1/ImageDto$SourceDto$ImageIconDto;", "(Lrh_server_driven_ui/v1/ImageDto$SourceDto$ImageIconDto;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lrh_server_driven_ui/v1/IconDto;", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIconKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiIcon2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiIcon$lambda$0(IconImage iconImage, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiIcon(iconImage, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiIcon$lambda$1(IconImage iconImage, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiIcon(iconImage, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiIcon$lambda$2(ImageDto.SourceDto.ImageIconDto imageIconDto, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiIcon(imageIconDto, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiIcon$lambda$3(ImageDto.SourceDto.ImageIconDto imageIconDto, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiIcon(imageIconDto, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final <ActionT extends Parcelable> void SduiIcon(final IconImage<? extends ActionT> component, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2097749244);
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
            final Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2097749244, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIcon (SduiIcon.kt:23)");
            }
            BentoIcon4 bentoIcon = toBentoIcon(component.getIcon());
            if (bentoIcon == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIconKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SduiIcon2.SduiIcon$lambda$0(component, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            ThemedColor tint_color = component.getTint_color();
            composerStartRestartGroup.startReplaceGroup(-1597352524);
            Color composeColor = tint_color == null ? null : SduiColors2.toComposeColor(tint_color, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1597353176);
            long fg = composeColor == null ? ((SduiColors) composerStartRestartGroup.consume(SduiColors3.getLocalSduiColors())).getFg(composerStartRestartGroup, 0) : composeColor.getValue();
            composerStartRestartGroup.endReplaceGroup();
            BentoIcon2.m20644BentoIconFU0evQE(bentoIcon, null, fg, modifier2, null, false, composerStartRestartGroup, BentoIcon4.$stable | 48 | ((i3 << 6) & 7168), 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIconKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiIcon2.SduiIcon$lambda$1(component, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final BentoIcon4 toBentoIcon(UiObject<ButtonIcon, ButtonDto.ButtonIconDto> uiObject) {
        Intrinsics.checkNotNullParameter(uiObject, "<this>");
        if (uiObject instanceof UiObject.Legacy) {
            return toBentoIcon(((ButtonIcon) ((UiObject.Legacy) uiObject).getValue()).getIcon());
        }
        if (uiObject instanceof UiObject.Idl) {
            return toBentoIcon(((ButtonDto.ButtonIconDto) ((UiObject.Idl) uiObject).getValue()).getIcon());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ServerToBentoAssetMapper2 toBentoAsset(Icon icon) {
        Intrinsics.checkNotNullParameter(icon, "<this>");
        return ServerToBentoAssetMapper2.INSTANCE.fromServerValue(icon.getServerValue());
    }

    public static final BentoIcon4 toBentoIcon(Icon icon) {
        Intrinsics.checkNotNullParameter(icon, "<this>");
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(icon.getServerValue());
        if (serverToBentoAssetMapper2FromServerValue != null) {
            return BentoIcon4.INSTANCE.toBentoIcon(serverToBentoAssetMapper2FromServerValue);
        }
        return null;
    }

    public static final void SduiIcon(final ImageDto.SourceDto.ImageIconDto component, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-50923453);
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
            final Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-50923453, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIcon (SduiIcon.kt:46)");
            }
            BentoIcon4 bentoIcon = toBentoIcon(component.getIcon());
            if (bentoIcon == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIconKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SduiIcon2.SduiIcon$lambda$2(component, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            ThemedColorDto color = component.getColor();
            composerStartRestartGroup.startReplaceGroup(-1692789421);
            Color composeColor = color == null ? null : SduiColors2.toComposeColor(color, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1692789918);
            long fg = composeColor == null ? ((SduiColors) composerStartRestartGroup.consume(SduiColors3.getLocalSduiColors())).getFg(composerStartRestartGroup, 0) : composeColor.getValue();
            composerStartRestartGroup.endReplaceGroup();
            BentoIcon2.m20644BentoIconFU0evQE(bentoIcon, null, fg, modifier2, null, false, composerStartRestartGroup, BentoIcon4.$stable | 48 | ((i3 << 6) & 7168), 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIconKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiIcon2.SduiIcon$lambda$3(component, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final ServerToBentoAssetMapper2 toBentoAsset(IconDto iconDto) {
        Intrinsics.checkNotNullParameter(iconDto, "<this>");
        return ServerToBentoAssetMapper2.INSTANCE.fromServerValue(IconKt.getServerValue(iconDto));
    }

    public static final BentoIcon4 toBentoIcon(IconDto iconDto) {
        Intrinsics.checkNotNullParameter(iconDto, "<this>");
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(IconKt.getServerValue(iconDto));
        if (serverToBentoAssetMapper2FromServerValue != null) {
            return BentoIcon4.INSTANCE.toBentoIcon(serverToBentoAssetMapper2FromServerValue);
        }
        return null;
    }
}
