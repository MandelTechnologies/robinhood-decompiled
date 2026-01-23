package com.robinhood.android.mcw.mcwquickconversion;

import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.material3.RippleKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.mcw.mcwquickconversion.models.UiEvent;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: QuickConversionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.mcw.mcwquickconversion.QuickConversionComposableKt$QuickConversionComposable$2$2, reason: use source file name */
/* loaded from: classes8.dex */
final class QuickConversionComposable4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ String $fxRate;
    final /* synthetic */ String $fxRateFee;
    final /* synthetic */ Function1<UiEvent, Unit> $onEvent;

    /* JADX WARN: Multi-variable type inference failed */
    QuickConversionComposable4(String str, EventLogger eventLogger, Function1<? super UiEvent, Unit> function1, String str2) {
        this.$fxRate = str;
        this.$eventLogger = eventLogger;
        this.$onEvent = function1;
        this.$fxRateFee = str2;
    }

    public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
        String strStringResource;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1138581405, i, -1, "com.robinhood.android.mcw.mcwquickconversion.QuickConversionComposable.<anonymous>.<anonymous> (QuickConversionComposable.kt:164)");
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
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        IndicationNodeFactory indicationNodeFactoryM5937rippleH2RKhps$default = RippleKt.m5937rippleH2RKhps$default(false, 0.0f, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), 3, null);
        composer.startReplaceGroup(-1746271574);
        boolean zChanged = composer.changed(this.$fxRate) | composer.changedInstance(this.$eventLogger) | composer.changed(this.$onEvent);
        final String str = this.$fxRate;
        final EventLogger eventLogger = this.$eventLogger;
        final Function1<UiEvent, Unit> function1 = this.$onEvent;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.mcw.mcwquickconversion.QuickConversionComposableKt$QuickConversionComposable$2$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return QuickConversionComposable4.invoke$lambda$2$lambda$1(str, eventLogger, function1);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(companion, interactionSource3, indicationNodeFactoryM5937rippleH2RKhps$default, false, null, null, (Function0) objRememberedValue2, 28, null);
        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM());
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        String str2 = this.$fxRate;
        String str3 = this.$fxRateFee;
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
        if (str2 == null || str3 == null) {
            composer.startReplaceGroup(-152811433);
            strStringResource = StringResources_androidKt.stringResource(C21790R.string.fx_rate_placeholder, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-152933883);
            strStringResource = StringResources_androidKt.stringResource(C21790R.string.fx_rate_disclaimer, new Object[]{str2, str3}, composer, 0);
            composer.endReplaceGroup();
        }
        BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8186);
        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16), null, bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), null, null, false, composer, BentoIcon4.Size16.$stable | 48, 56);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(String str, EventLogger eventLogger, Function1 function1) {
        if (str != null) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, null, new Component(Component.ComponentType.INFO_TAG, "currency_conversion_fx_rate_info_button", null, 4, null), null, null, false, 59, null);
            function1.invoke(UiEvent.FxRate.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
