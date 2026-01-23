package com.robinhood.compose.bento.component;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoButton.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
final class ComposableSingletons$BentoButtonKt$lambda$1895745990$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$BentoButtonKt$lambda$1895745990$1 INSTANCE = new ComposableSingletons$BentoButtonKt$lambda$1895745990$1();

    ComposableSingletons$BentoButtonKt$lambda$1895745990$1() {
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1895745990, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$BentoButtonKt.lambda$1895745990.<anonymous> (BentoButton.kt:539)");
        }
        Arrangement arrangement = Arrangement.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, 6).m21592getMediumD9Ej5fM());
        Modifier.Companion companion = Modifier.INSTANCE;
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, companion2.getTop(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, 6).m21590getDefaultD9Ej5fM()), companion2.getStart(), composer, 0);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, companion);
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        float f = EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE;
        Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(f));
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append("Button ");
        int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61439, (DefaultConstructorMarker) null));
        try {
            builder.append("CTA");
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            BentoButtonState bentoButtonState = new BentoButtonState(builder.toAnnotatedString(), (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, false, false, (Color) null, (Color) null, (Color) null, (Color) null, (TextStyle) null, false, 2046, (DefaultConstructorMarker) null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoButtonKt$lambda$1895745990$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonKt.BentoButton(bentoButtonState, "test-cta-button", (Function0<Unit>) objRememberedValue, modifierM5174width3ABfNKs, composer, 3504, 0);
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.LOCK_16;
            BentoButtonState bentoButtonState2 = new BentoButtonState("Button CTA", new BentoButtons.Icon.Size16(serverToBentoAssetMapper2, null, 2, null), (BentoButtons.Type) null, false, false, (Color) null, (Color) null, (Color) null, (TextStyle) null, (Color) null, false, 2044, (DefaultConstructorMarker) null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoButtonKt$lambda$1895745990$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonKt.BentoButton(bentoButtonState2, "test-cta-button", (Function0<Unit>) objRememberedValue2, (Modifier) null, composer, 432, 8);
            BentoButtons.Icon.Position position = BentoButtons.Icon.Position.Trailing;
            BentoButtonState bentoButtonState3 = new BentoButtonState("Button CTA", new BentoButtons.Icon.Size16(serverToBentoAssetMapper2, position), (BentoButtons.Type) null, false, false, (Color) null, (Color) null, (Color) null, (TextStyle) null, Color.m6701boximpl(bentoTheme.getColors(composer, 6).getLumen()), false, 1532, (DefaultConstructorMarker) null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion4.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoButtonKt$lambda$1895745990$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            BentoButtonKt.BentoButton(bentoButtonState3, "test-cta-button", (Function0<Unit>) objRememberedValue3, (Modifier) null, composer, 432, 8);
            composer.endNode();
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, 6).m21590getDefaultD9Ej5fM()), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            Modifier modifierM5174width3ABfNKs2 = SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(f));
            composer.startReplaceGroup(-603788036);
            builder = new AnnotatedString.Builder(0, 1, null);
            builder.append("Button ");
            iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer, 6).getLumen(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.append("CTA");
                builder.pop(iPushStyle);
                AnnotatedString annotatedString = builder.toAnnotatedString();
                composer.endReplaceGroup();
                BentoButtonState bentoButtonState4 = new BentoButtonState(annotatedString, (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, false, false, (Color) null, (Color) null, (Color) null, (Color) null, (TextStyle) null, false, 2038, (DefaultConstructorMarker) null);
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue4 = composer.rememberedValue();
                if (objRememberedValue4 == companion4.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoButtonKt$lambda$1895745990$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                BentoButtonKt.BentoButton(bentoButtonState4, "test-cta-button", (Function0<Unit>) objRememberedValue4, modifierM5174width3ABfNKs2, composer, 3504, 0);
                BentoButtonState bentoButtonState5 = new BentoButtonState("Button CTA", new BentoButtons.Icon.Size16(serverToBentoAssetMapper2, null, 2, null), (BentoButtons.Type) null, false, false, (Color) null, (Color) null, (Color) null, (TextStyle) null, (Color) null, false, 2036, (DefaultConstructorMarker) null);
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue5 = composer.rememberedValue();
                if (objRememberedValue5 == companion4.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoButtonKt$lambda$1895745990$1$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceGroup();
                BentoButtonKt.BentoButton(bentoButtonState5, "test-cta-button", (Function0<Unit>) objRememberedValue5, (Modifier) null, composer, 432, 8);
                BentoButtonState bentoButtonState6 = new BentoButtonState("Button CTA", new BentoButtons.Icon.Size16(serverToBentoAssetMapper2, position), (BentoButtons.Type) null, false, false, (Color) null, (Color) null, (Color) null, (TextStyle) null, Color.m6701boximpl(bentoTheme.getColors(composer, 6).getLumen()), false, 1524, (DefaultConstructorMarker) null);
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue6 = composer.rememberedValue();
                if (objRememberedValue6 == companion4.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoButtonKt$lambda$1895745990$1$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue6);
                }
                composer.endReplaceGroup();
                BentoButtonKt.BentoButton(bentoButtonState6, "test-cta-button", (Function0<Unit>) objRememberedValue6, (Modifier) null, composer, 432, 8);
                composer.endNode();
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } finally {
            }
        } finally {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }
}
