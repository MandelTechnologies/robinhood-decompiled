package com.robinhood.android.redesign.accounttab.p228ui;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.redesign.accounttab.C26320R;
import com.robinhood.android.redesign.accounttab.analytics.AccountTabAnalytics;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountSelectorTabsRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
final class AccountSelectorTabsRowKt$AddAccountButton$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ float $buttonPadding;
    final /* synthetic */ float $containerHeight;
    final /* synthetic */ float $easedAlpha;
    final /* synthetic */ HapticFeedback $haptic;
    final /* synthetic */ Function0<Unit> $onAccountAddClicked;

    AccountSelectorTabsRowKt$AddAccountButton$1(float f, float f2, float f3, HapticFeedback hapticFeedback, Function0<Unit> function0) {
        this.$containerHeight = f;
        this.$easedAlpha = f2;
        this.$buttonPadding = f3;
        this.$haptic = hapticFeedback;
        this.$onAccountAddClicked = function0;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1318064546, i, -1, "com.robinhood.android.redesign.accounttab.ui.AddAccountButton.<anonymous> (AccountSelectorTabsRow.kt:764)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(companion, this.$containerHeight);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierM5156height3ABfNKs, this.$buttonPadding, C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM() * this.$easedAlpha));
        float f = this.$easedAlpha;
        final HapticFeedback hapticFeedback = this.$haptic;
        final Function0<Unit> function0 = this.$onAccountAddClicked;
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5143paddingVpY3zN4);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Alpha.alpha(BoxScopeInstance.INSTANCE.align(companion, companion2.getCenter()), f), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, AccountTabAnalytics.IDENTIFIER_ADD_ACCOUNT, null, 4, null), null, 47, null), false, false, false, true, false, null, 108, null);
        BentoIconButton4.Icon.StandardSize16 standardSize16 = new BentoIconButton4.Icon.StandardSize16(ServerToBentoAssetMapper2.PLUS_16);
        String strStringResource = StringResources_androidKt.stringResource(C26320R.string.add_account_description, composer, 0);
        BentoIconButton4.Type type2 = BentoIconButton4.Type.Secondary;
        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU();
        long jM21427getFg30d7_KjU = bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(hapticFeedback) | composer.changed(function0);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$AddAccountButton$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountSelectorTabsRowKt$AddAccountButton$1.invoke$lambda$2$lambda$1$lambda$0(hapticFeedback, function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue, standardSize16, strStringResource, modifierAutoLogEvents$default, type2, false, null, Color.m6701boximpl(jM21371getBg0d7_KjU), Color.m6701boximpl(jM21427getFg30d7_KjU), null, false, composer, (BentoIconButton4.Icon.StandardSize16.$stable << 3) | 24576, 0, 1632);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(HapticFeedback hapticFeedback, Function0 function0) {
        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
        function0.invoke();
        return Unit.INSTANCE;
    }
}
