package com.robinhood.android.gold.hub;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.RippleKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHubFeature;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.mediaservice.ImageDensityUrl;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoPogContent;
import com.robinhood.compose.bento.component.BentoPogDefaults;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogState;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.style.PogStyle;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.models.serverdriven.experimental.api.GoldHubAction;
import com.robinhood.models.serverdriven.experimental.api.TextButton;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GoldHubComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
final class GoldHubComposableKt$Feature$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SduiActionHandler<GoldHubAction> $actionHandler;
    final /* synthetic */ boolean $active;
    final /* synthetic */ ApiGoldHubFeature $this_with;

    /* JADX WARN: Multi-variable type inference failed */
    GoldHubComposableKt$Feature$1$1(boolean z, ApiGoldHubFeature apiGoldHubFeature, SduiActionHandler<? super GoldHubAction> sduiActionHandler) {
        this.$active = z;
        this.$this_with = apiGoldHubFeature;
        this.$actionHandler = sduiActionHandler;
    }

    public final void invoke(Composer composer, int i) {
        Modifier modifierM4871backgroundbw27NRU;
        PogStyle.PogColors defaultColors;
        Unit unit;
        SduiActionHandler<GoldHubAction> sduiActionHandler;
        Modifier.Companion companion;
        ApiGoldHubFeature apiGoldHubFeature;
        boolean z;
        BentoTheme bentoTheme;
        int i2;
        int i3;
        Unit unit2;
        Composer composer2 = composer;
        if ((i & 3) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-624073728, i, -1, "com.robinhood.android.gold.hub.Feature.<anonymous>.<anonymous> (GoldHubComposable.kt:701)");
        }
        Modifier.Companion companion2 = Modifier.INSTANCE;
        if (this.$active) {
            composer2.startReplaceGroup(1133119801);
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            modifierM4871backgroundbw27NRU = BorderKt.m4876borderxT4_qwU(companion2, fM7995constructorimpl, bentoTheme2.getColors(composer2, i4).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composer2, i4).m21593getSmallD9Ej5fM()));
            composer2.endReplaceGroup();
        } else {
            composer2.startReplaceGroup(1133419075);
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(companion2, bentoTheme3.getColors(composer2, i5).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme3.getSpacing(composer2, i5).m21593getSmallD9Ej5fM()));
            composer2.endReplaceGroup();
        }
        Modifier modifierThen = companion2.then(modifierM4871backgroundbw27NRU);
        BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
        int i6 = BentoTheme.$stable;
        Modifier modifierClip = Clip.clip(modifierThen, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme4.getSpacing(composer2, i6).m21593getSmallD9Ej5fM()));
        boolean z2 = (this.$this_with.getCta() == null && this.$this_with.getDeeplink() == null) ? false : true;
        IndicationNodeFactory indicationNodeFactoryM5624rippleH2RKhps$default = RippleKt.m5624rippleH2RKhps$default(false, 0.0f, bentoTheme4.getColors(composer2, i6).m21425getFg0d7_KjU(), 3, null);
        composer2.startReplaceGroup(1849434622);
        Object objRememberedValue = composer2.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = InteractionSource2.MutableInteractionSource();
            composer2.updateRememberedValue(objRememberedValue);
        }
        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer2.changedInstance(this.$this_with) | composer2.changedInstance(this.$actionHandler);
        final ApiGoldHubFeature apiGoldHubFeature2 = this.$this_with;
        final SduiActionHandler<GoldHubAction> sduiActionHandler2 = this.$actionHandler;
        Object objRememberedValue2 = composer2.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$Feature$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GoldHubComposableKt$Feature$1$1.invoke$lambda$4$lambda$3(apiGoldHubFeature2, sduiActionHandler2);
                }
            };
            composer2.updateRememberedValue(objRememberedValue2);
        }
        composer2.endReplaceGroup();
        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(UtilKt.autoLogEvents(ClickableKt.m4891clickableO2vRcR0$default(modifierClip, interactionSource3, indicationNodeFactoryM5624rippleH2RKhps$default, z2, null, null, (Function0) objRememberedValue2, 24, null), this.$this_with.getCta() != null ? Component.ComponentType.LINK_BUTTON : Component.ComponentType.ROW, this.$this_with.getId(), false, composer2, 0, 4), bentoTheme4.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM());
        Alignment.Companion companion4 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion4.getCenterVertically();
        ApiGoldHubFeature apiGoldHubFeature3 = this.$this_with;
        boolean z3 = this.$active;
        SduiActionHandler<GoldHubAction> sduiActionHandler3 = this.$actionHandler;
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer2, 48);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs);
        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion5.getConstructor();
        if (composer2.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor);
        } else {
            composer2.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        BentoPogContent.RemoteImage remoteImage = new BentoPogContent.RemoteImage(new ImageDensityUrl(apiGoldHubFeature3.getImagePath(), null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext()))).getUrl(), null, null, 6, null);
        if (bentoTheme4.getColors(composer2, i6).getIsDay() || z3) {
            composer2.startReplaceGroup(479201753);
            defaultColors = BentoPogDefaults.INSTANCE.getDefaultColors(composer2, BentoPogDefaults.$stable);
            composer2.endReplaceGroup();
        } else {
            composer2.startReplaceGroup(479288801);
            defaultColors = new PogStyle.PogColors(bentoTheme4.getColors(composer2, i6).getNova(), bentoTheme4.getColors(composer2, i6).m21373getBg30d7_KjU(), bentoTheme4.getColors(composer2, i6).m21427getFg30d7_KjU(), bentoTheme4.getColors(composer2, i6).m21373getBg30d7_KjU(), bentoTheme4.getColors(composer2, i6).m21426getFg20d7_KjU(), null);
            composer2.endReplaceGroup();
        }
        BentoPogKt.BentoPog(new BentoPogState(remoteImage, defaultColors, null, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), null, composer2, BentoPogState.$stable, 2);
        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, bentoTheme4.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM()), composer2, 0);
        Modifier modifierWeight$default = Row5.weight$default(row6, companion2, 1.0f, false, 2, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer2, 0);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
        if (composer2.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor2);
        } else {
            composer2.useNode();
        }
        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        String subtitle = apiGoldHubFeature3.getSubtitle();
        composer2.startReplaceGroup(423122729);
        if (subtitle == null) {
            bentoTheme = bentoTheme4;
            i2 = i6;
            apiGoldHubFeature = apiGoldHubFeature3;
            z = z3;
            sduiActionHandler = sduiActionHandler3;
            unit = null;
            companion = companion2;
        } else {
            unit = null;
            sduiActionHandler = sduiActionHandler3;
            companion = companion2;
            apiGoldHubFeature = apiGoldHubFeature3;
            z = z3;
            bentoTheme = bentoTheme4;
            i2 = i6;
            BentoText2.m20747BentoText38GnDrw(subtitle, null, Color.m6701boximpl(bentoTheme4.getColors(composer2, i6).m21426getFg20d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composer2, i6).getTextS(), composer2, 24576, 0, 8170);
            Unit unit3 = Unit.INSTANCE;
        }
        composer2.endReplaceGroup();
        int i7 = i2;
        BentoText2.m20747BentoText38GnDrw(apiGoldHubFeature.getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i2).getTextM(), composer2, 0, 0, 8190);
        if (z || apiGoldHubFeature.getCta() != null) {
            composer2.startReplaceGroup(232360676);
            i3 = i7;
            BentoText2.m20747BentoText38GnDrw(apiGoldHubFeature.getContentMarkdown(), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextS(), composer2, 0, 0, 8186);
            composer2.endReplaceGroup();
        } else {
            composer2.startReplaceGroup(232632360);
            BentoMarkdownText2.BentoMarkdownText(apiGoldHubFeature.getContentMarkdown(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i7).getTextS(), 0, bentoTheme.getColors(composer2, i7).m21426getFg20d7_KjU(), bentoTheme.getColors(composer2, i7).m21426getFg20d7_KjU(), false, composer2, BentoMarkdownText.$stable << 15, 18), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 26);
            composer2 = composer;
            composer2.endReplaceGroup();
            i3 = i7;
        }
        composer2.endNode();
        int i8 = i3;
        Modifier.Companion companion6 = companion;
        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion6, bentoTheme.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM()), composer2, 0);
        TextButton<GoldHubAction> cta = apiGoldHubFeature.getCta();
        composer2.startReplaceGroup(15526293);
        if (cta == null) {
            unit2 = unit;
        } else {
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, bentoTheme.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM()), composer2, 0);
            ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(cta);
            HorizontalPadding horizontalPadding = HorizontalPadding.None;
            composer2.startReplaceGroup(-1772220517);
            SduiColumns.SduiColumn(immutableList3PersistentListOf, GoldHubAction.class, companion6, null, sduiActionHandler, horizontalPadding, arrangement.getTop(), companion4.getStart(), false, composer2, 100859904, 0);
            companion6 = companion6;
            composer2.endReplaceGroup();
            unit2 = Unit.INSTANCE;
        }
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(15526500);
        if (unit2 == null && apiGoldHubFeature.getDeeplink() != null) {
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, bentoTheme.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM()), composer2, 0);
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), null, bentoTheme.getColors(composer2, i8).m21427getFg30d7_KjU(), null, null, false, composer2, BentoIcon4.Size16.$stable | 48, 56);
            Unit unit4 = Unit.INSTANCE;
        }
        composer.endReplaceGroup();
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
    public static final Unit invoke$lambda$4$lambda$3(ApiGoldHubFeature apiGoldHubFeature, SduiActionHandler sduiActionHandler) {
        TextButton<GoldHubAction> cta = apiGoldHubFeature.getCta();
        if (cta != null) {
            sduiActionHandler.mo15941handle(cta.getAction());
        } else {
            String deeplink = apiGoldHubFeature.getDeeplink();
            if (deeplink != null) {
                sduiActionHandler.mo15941handle(new GoldHubAction.Deeplink(new DeeplinkAction(deeplink)));
            }
        }
        return Unit.INSTANCE;
    }
}
