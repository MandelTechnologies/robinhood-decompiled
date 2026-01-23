package com.robinhood.shared.crypto.p375ui.trade.view;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p355ui.ServerDrivenAlert;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoOrderHeaderComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderHeaderComposableKt$CryptoOrderHeaderComposable$1$2, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoOrderHeaderComposable6 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Function0<Unit> $infoIconOnClick;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ CryptoOrderHeaderState $state;

    CryptoOrderHeaderComposable6(CryptoOrderHeaderState cryptoOrderHeaderState, Function0<Unit> function0, Navigator navigator, Context context) {
        this.$state = cryptoOrderHeaderState;
        this.$infoIconOnClick = function0;
        this.$navigator = navigator;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(Function0 function0, CryptoOrderHeaderState cryptoOrderHeaderState, Navigator navigator, Context context) {
        if (function0 != null) {
            function0.invoke();
        } else {
            ServerDrivenAlert powerInfoAlert = cryptoOrderHeaderState.getPowerInfoAlert();
            if (powerInfoAlert != null) {
                Navigator.DefaultImpls.createDialogFragment$default(navigator, new LegacyDialogFragmentKey.ClientComponentAlertSheet(powerInfoAlert, true, true, 0, 8, (DefaultConstructorMarker) null), null, 2, null).show(BaseContexts.requireActivityBaseContext(context).getSupportFragmentManager(), "crypto-buying-power-info");
            }
        }
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String string2;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1140711623, i, -1, "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderHeaderComposable.<anonymous>.<anonymous> (CryptoOrderHeaderComposable.kt:62)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = InteractionSource2.MutableInteractionSource();
            composer.updateRememberedValue(objRememberedValue);
        }
        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
        composer.endReplaceGroup();
        boolean z = (this.$state.getPowerText() == null || (this.$state.getPowerInfoAlert() == null && this.$infoIconOnClick == null)) ? false : true;
        composer.startReplaceGroup(-1224400529);
        boolean zChanged = composer.changed(this.$infoIconOnClick) | composer.changedInstance(this.$state) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
        final Function0<Unit> function0 = this.$infoIconOnClick;
        final CryptoOrderHeaderState cryptoOrderHeaderState = this.$state;
        final Navigator navigator = this.$navigator;
        final Context context = this.$context;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderHeaderComposableKt$CryptoOrderHeaderComposable$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoOrderHeaderComposable6.invoke$lambda$3$lambda$2(function0, cryptoOrderHeaderState, navigator, context);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(companion, interactionSource3, null, z, null, null, (Function0) objRememberedValue2, 24, null);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        Arrangement arrangement = Arrangement.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM());
        CryptoOrderHeaderState cryptoOrderHeaderState2 = this.$state;
        Function0<Unit> function02 = this.$infoIconOnClick;
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer, 48);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4891clickableO2vRcR0$default);
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        StringResource powerText = cryptoOrderHeaderState2.getPowerText();
        composer.startReplaceGroup(-1804519874);
        CharSequence text = powerText == null ? null : StringResources6.getText(powerText, composer, StringResource.$stable);
        composer.endReplaceGroup();
        if (text == null || (string2 = text.toString()) == null) {
            string2 = "----------------------";
        }
        BentoText2.m20747BentoText38GnDrw(string2, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8186);
        composer.startReplaceGroup(-1804513359);
        if (cryptoOrderHeaderState2.getPowerText() != null && (cryptoOrderHeaderState2.getPowerInfoAlert() != null || function02 != null)) {
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), null, bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), null, null, false, composer, BentoIcon4.Size16.$stable | 48, 56);
        }
        composer.endReplaceGroup();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
