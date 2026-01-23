package com.robinhood.shared.crypto.p375ui.staking;

import android.os.Parcelable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIcon2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiText2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.CryptoDemeterDataRowCondensed;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.RenderableText;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiCryptoStakingDataRowCondensed.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.staking.SduiCryptoStakingDataRowCondensedKt$SduiCryptoStakingDataRowCondensed$2$2$1 */
/* loaded from: classes6.dex */
public final class C38620x23e8379e implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ CryptoDemeterDataRowCondensed<ActionT> $component;
    final /* synthetic */ RenderableText $subtitle;

    /* JADX WARN: Multi-variable type inference failed */
    public C38620x23e8379e(CryptoDemeterDataRowCondensed<? extends ActionT> cryptoDemeterDataRowCondensed, RenderableText renderableText) {
        this.$component = cryptoDemeterDataRowCondensed;
        this.$subtitle = renderableText;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1687310603, i, -1, "com.robinhood.shared.crypto.ui.staking.SduiCryptoStakingDataRowCondensed.<anonymous>.<anonymous>.<anonymous> (SduiCryptoStakingDataRowCondensed.kt:81)");
        }
        Parcelable subtitle_tap_action = this.$component.getSubtitle_tap_action();
        Float subtitle_trailing_icon_spacing = this.$component.getSubtitle_trailing_icon_spacing();
        C2002Dp c2002DpM7993boximpl = subtitle_trailing_icon_spacing != null ? C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(subtitle_trailing_icon_spacing.floatValue())) : null;
        RenderableText renderableText = this.$subtitle;
        TextStyle subtitle_text_style = this.$component.getSubtitle_text_style();
        ThemedColor subtitle_text_color = this.$component.getSubtitle_text_color();
        Icon subtitle_trailing_icon = this.$component.getSubtitle_trailing_icon();
        ThemedColor subtitle_trailing_icon_color = this.$component.getSubtitle_trailing_icon_color();
        long jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU();
        composer.startReplaceGroup(1386949870);
        Modifier modifierThen = UtilKt.onClickModifierWithNoIndication(subtitle_tap_action, composer, 0).then(Modifier.INSTANCE);
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(c2002DpM7993boximpl != null ? c2002DpM7993boximpl.getValue() : C2002Dp.m7995constructorimpl(0)), Alignment.INSTANCE.getCenterVertically(), composer, 48);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierThen);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        SduiText2.SduiText(SduiCryptoStakingDataRowCondensedKt.generateText(renderableText, subtitle_text_style, subtitle_text_color), (Modifier) null, composer, 0, 2);
        BentoIcon4 bentoIcon = subtitle_trailing_icon != null ? SduiIcon2.toBentoIcon(subtitle_trailing_icon) : null;
        composer.startReplaceGroup(938164764);
        if (bentoIcon != null) {
            composer.startReplaceGroup(938169090);
            Color composeColor = subtitle_trailing_icon_color == null ? null : SduiColors2.toComposeColor(subtitle_trailing_icon_color, composer, 0);
            composer.endReplaceGroup();
            if (composeColor != null) {
                jM21426getFg20d7_KjU = composeColor.getValue();
            }
            BentoIcon2.m20644BentoIconFU0evQE(bentoIcon, null, jM21426getFg20d7_KjU, null, null, false, composer, BentoIcon4.$stable | 48, 56);
        }
        composer.endReplaceGroup();
        composer.endNode();
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
