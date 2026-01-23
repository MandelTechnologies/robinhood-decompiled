package com.robinhood.shared.crypto.expandableButtonTray;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.theme.style.ExpandableButtonTrayStyle;
import com.robinhood.shared.crypto.expandableButtonTray.ExpandableButtonTrayState;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ColorDto;

/* compiled from: CryptoExpandableButtonTrayComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposableKt$ExpandableButtons$2$2, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoExpandableButtonTrayComposable4 implements Function3<Boolean, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<C2002Dp> $buttonHeight$delegate;
    final /* synthetic */ ColorDto $closeButtonTintOverride;
    final /* synthetic */ ExpandableButtonTrayState.ExpandButton $expandButton;
    final /* synthetic */ Density $localDensity;
    final /* synthetic */ ExpandableButtonTrayStyle $localStyles;
    final /* synthetic */ Function0<Unit> $onCollapse;
    final /* synthetic */ Function0<Unit> $onExpand;

    CryptoExpandableButtonTrayComposable4(ExpandableButtonTrayStyle expandableButtonTrayStyle, ColorDto colorDto, Function0<Unit> function0, ExpandableButtonTrayState.ExpandButton expandButton, Density density, Function0<Unit> function02, SnapshotState<C2002Dp> snapshotState) {
        this.$localStyles = expandableButtonTrayStyle;
        this.$closeButtonTintOverride = colorDto;
        this.$onCollapse = function0;
        this.$expandButton = expandButton;
        this.$localDensity = density;
        this.$onExpand = function02;
        this.$buttonHeight$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer, Integer num) {
        invoke(bool.booleanValue(), composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1978748516, i2, -1, "com.robinhood.shared.crypto.expandableButtonTray.ExpandableButtons.<anonymous>.<anonymous> (CryptoExpandableButtonTrayComposable.kt:266)");
        }
        if (z) {
            composer.startReplaceGroup(470946733);
            BentoIconButton4.Icon.StandardSize16 standardSize16 = new BentoIconButton4.Icon.StandardSize16(ServerToBentoAssetMapper2.CLOSE_16);
            String strStringResource = StringResources_androidKt.stringResource(C37676R.string.expandable_button_tray_close_content_desc, composer, 0);
            float fExpandableButtons$lambda$14 = CryptoExpandableButtonTrayComposable.ExpandableButtons$lambda$14(this.$buttonHeight$delegate);
            long jM21771getBgColor0d7_KjU = this.$localStyles.getColors().m21771getBgColor0d7_KjU();
            BentoIconButton4.Type type2 = BentoIconButton4.Type.Secondary;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ColorDto colorDto = this.$closeButtonTintOverride;
            composer.startReplaceGroup(-1093168748);
            Color composeColor = colorDto == null ? null : SduiColors2.toComposeColor(colorDto, composer, 0);
            composer.endReplaceGroup();
            ColorDto colorDto2 = this.$closeButtonTintOverride;
            composer.startReplaceGroup(-1093166028);
            Color composeColor2 = colorDto2 != null ? SduiColors2.toComposeColor(colorDto2, composer, 0) : null;
            composer.endReplaceGroup();
            BentoIconButton2.m20641BentoIconButtoncqYvz4g(this.$onCollapse, standardSize16, strStringResource, modifierFillMaxWidth$default, type2, false, composeColor, Color.m6701boximpl(jM21771getBgColor0d7_KjU), composeColor2, C2002Dp.m7993boximpl(fExpandableButtons$lambda$14), false, composer, (BentoIconButton4.Icon.StandardSize16.$stable << 3) | 27648, 0, 1056);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(471677651);
            ServerToBentoAssetMapper2 icon = this.$expandButton.getIcon();
            BentoButtons.Icon.Size16 size16 = icon != null ? new BentoButtons.Icon.Size16(icon, null, 2, null) : null;
            String string2 = StringResources6.getText(this.$expandButton.getLabel(), composer, StringResource.$stable).toString();
            boolean enabled = this.$expandButton.getEnabled();
            ColorDto backgroundColorOverride = this.$expandButton.getBackgroundColorOverride();
            composer.startReplaceGroup(-1093152780);
            Color composeColor3 = backgroundColorOverride == null ? null : SduiColors2.toComposeColor(backgroundColorOverride, composer, 0);
            composer.endReplaceGroup();
            ColorDto textColorOverride = this.$expandButton.getTextColorOverride();
            composer.startReplaceGroup(-1093149900);
            Color composeColor4 = textColorOverride == null ? null : SduiColors2.toComposeColor(textColorOverride, composer, 0);
            composer.endReplaceGroup();
            ColorDto borderColorOverride = this.$expandButton.getBorderColorOverride();
            composer.startReplaceGroup(-1093146892);
            Color composeColor5 = borderColorOverride == null ? null : SduiColors2.toComposeColor(borderColorOverride, composer, 0);
            composer.endReplaceGroup();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$localDensity);
            final Density density = this.$localDensity;
            final SnapshotState<C2002Dp> snapshotState = this.$buttonHeight$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposableKt$ExpandableButtons$2$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoExpandableButtonTrayComposable4.invoke$lambda$3$lambda$2(density, snapshotState, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8(this.$onExpand, string2, OnGloballyPositionedModifier3.onGloballyPositioned(modifierFillMaxWidth$default2, (Function1) objRememberedValue), size16, null, enabled, this.$expandButton.getLoading(), composeColor3, composeColor4, composeColor5, null, false, null, composer, BentoButtons.Icon.Size16.$stable << 9, 0, 7184);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(Density density, SnapshotState snapshotState, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        CryptoExpandableButtonTrayComposable.ExpandableButtons$lambda$15(snapshotState, density.mo5013toDpu2uoSUM((int) (coordinates.mo7241getSizeYbymL2g() & 4294967295L)));
        return Unit.INSTANCE;
    }
}
