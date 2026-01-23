package com.robinhood.compose.bento.component.rows;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoSettingsRows;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoSettingsRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$BentoSettingsRowKt {
    public static final ComposableSingletons$BentoSettingsRowKt INSTANCE = new ComposableSingletons$BentoSettingsRowKt();

    /* renamed from: lambda$-668573611, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9340lambda$668573611 = ComposableLambda3.composableLambdaInstance(-668573611, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoSettingsRowKt$lambda$-668573611$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-668573611, i, -1, "com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoSettingsRowKt.lambda$-668573611.<anonymous> (BentoSettingsRow.kt:229)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            BentoText2.m20747BentoText38GnDrw("Stacked", PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer, 6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, 6).m21590getDefaultD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, 6).getDisplayCapsuleMedium(), composer, 6, 0, 8188);
            BentoText2.m20747BentoText38GnDrw("Enabled", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 6, 0, 16382);
            BentoSettingsRowKt.BentoSettingsRow((Modifier) null, "Label", "Value", (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) null, false, false, (Function0<Unit>) null, composer, 432, EnumC7081g.f2779x59907a3d);
            BentoSettingsRowKt.BentoSettingsRow((Modifier) null, "Label", "Value", (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) new BentoSettingsRows.EndElement.Metadata("Metadata", null, 2, null), false, false, (Function0<Unit>) null, composer, 432, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.QUESTION_24;
            BentoSettingsRowKt.BentoSettingsRow((Modifier) null, "Label", "Value", (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) new BentoSettingsRows.EndElement.Icon(serverToBentoAssetMapper2, null, 2, null), false, false, (Function0<Unit>) null, composer, 432, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
            BentoText2.m20747BentoText38GnDrw("Disabled", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 6, 0, 16382);
            BentoSettingsRowKt.BentoSettingsRow((Modifier) null, "Label", "Value", (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) null, false, false, (Function0<Unit>) null, composer, 197040, EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE);
            BentoSettingsRowKt.BentoSettingsRow((Modifier) null, "Label", "Value", (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) new BentoSettingsRows.EndElement.Metadata("Metadata", null, 2, null), false, false, (Function0<Unit>) null, composer, 197040, 201);
            BentoSettingsRowKt.BentoSettingsRow((Modifier) null, "Label", "Value", (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) new BentoSettingsRows.EndElement.Icon(serverToBentoAssetMapper2, null, 2, null), false, false, (Function0<Unit>) null, composer, 197040, 201);
            BentoText2.m20747BentoText38GnDrw("Text overflow", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 6, 0, 16382);
            BentoSettingsRowKt.BentoSettingsRow((Modifier) null, "Label text can overflow to a maximum of three lines before truncating. This is a label text that has overflowed to a maximum of three lines before truncating.", "Value text can overflow to a maximum of three lines before truncating. This is a value text that has overflowed to a maximum of three lines before truncating.", (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) null, false, false, (Function0<Unit>) null, composer, 0, EnumC7081g.f2779x59907a3d);
            BentoSettingsRowKt.BentoSettingsRow((Modifier) null, "Label text can overflow to a maximum of three lines before truncating. This is a label text that has overflowed to a maximum of three lines before truncating.", "Value text can overflow to a maximum of three lines before truncating. This is a value text that has overflowed to a maximum of three lines before truncating.", (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) new BentoSettingsRows.EndElement.Icon(serverToBentoAssetMapper2, null, 2, null), false, false, (Function0<Unit>) null, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
            BentoSettingsRowKt.BentoSettingsRow((Modifier) null, "Label text width shrinks as metadata text grows. Label text has a minimum width based on the device size.", "Value text width shrinks as metadata text grows. Value text has a minimum width based on the device size.", (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) new BentoSettingsRows.EndElement.Metadata("Metadata text size shrinks before truncating and cannot overflow lines.", null, 2, null), false, false, (Function0<Unit>) null, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
            BentoText2.m20747BentoText38GnDrw("Color", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 6, 0, 16382);
            BentoSettingsRowKt.BentoSettingsRow((Modifier) null, "Label", "Value", (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) new BentoSettingsRows.EndElement.Metadata("Verified", Color.m6701boximpl(bentoTheme.getColors(composer, 6).m21456getPositive0d7_KjU()), null), false, false, (Function0<Unit>) null, composer, 432, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
            BentoSettingsRowKt.BentoSettingsRow((Modifier) null, "Label", "Value", (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) new BentoSettingsRows.EndElement.Metadata("Invalid", Color.m6701boximpl(bentoTheme.getColors(composer, 6).m21452getNegative0d7_KjU()), null), false, false, (Function0<Unit>) null, composer, 432, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
            ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = ServerToBentoAssetMapper2.CLOSE_24;
            BentoSettingsRowKt.BentoSettingsRow((Modifier) null, "Label", "Value", (BentoSettingsRows.StartElement) new BentoSettingsRows.StartElement.Icon(serverToBentoAssetMapper22), (BentoSettingsRows.EndElement) null, false, false, (Function0<Unit>) null, composer, 432, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE);
            BentoSettingsRowKt.BentoSettingsRow((Modifier) null, "Label", "Value", (BentoSettingsRows.StartElement) new BentoSettingsRows.StartElement.Icon(serverToBentoAssetMapper22), (BentoSettingsRows.EndElement) null, false, false, (Function0<Unit>) null, composer, 197040, EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE);
            BentoSettingsRowKt.BentoSettingsRow((Modifier) null, "Label", "Value", (BentoSettingsRows.StartElement) new BentoSettingsRows.StartElement.CustomIcon24Dp(C20690R.drawable.ic_rds_camera_24dp), (BentoSettingsRows.EndElement) null, false, false, (Function0<Unit>) null, composer, 197040, EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE);
            ServerToBentoAssetMapper2 serverToBentoAssetMapper23 = ServerToBentoAssetMapper2.CARET_RIGHT_16;
            BentoSettingsRowKt.BentoSettingsRow((Modifier) null, "Label", "Value", (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) new BentoSettingsRows.EndElement.Icon(serverToBentoAssetMapper23, Color.m6701boximpl(bentoTheme.getColors(composer, 6).m21456getPositive0d7_KjU()), null), false, false, (Function0<Unit>) null, composer, 432, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
            BentoSettingsRowKt.BentoSettingsRow((Modifier) null, "Label", "Value", (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) new BentoSettingsRows.EndElement.Icon(serverToBentoAssetMapper23, Color.m6701boximpl(bentoTheme.getColors(composer, 6).m21452getNegative0d7_KjU()), null), false, false, (Function0<Unit>) null, composer, 432, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
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
    });
    private static Function2<Composer, Integer, Unit> lambda$1773217995 = ComposableLambda3.composableLambdaInstance(1773217995, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoSettingsRowKt$lambda$1773217995$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1773217995, i, -1, "com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoSettingsRowKt.lambda$1773217995.<anonymous> (BentoSettingsRow.kt:354)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            AnnotatedString annotatedString = new AnnotatedString("Stacked", null, 2, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            BentoText2.m20748BentoTextQnj7Zds(annotatedString, PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer, 6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, 6).m21590getDefaultD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composer, 6).getDisplayCapsuleMedium(), composer, 6, 0, 8188);
            BentoText2.m20747BentoText38GnDrw("Enabled", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 6, 0, 16382);
            BentoSettingsRowKt.BentoSettingsRow((Modifier) null, "Label", "Value", (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) null, false, false, (Function0<Unit>) null, composer, 432, EnumC7081g.f2779x59907a3d);
            BentoSettingsRowKt.BentoSettingsRow(new AnnotatedString("Label", null, 2, null), new AnnotatedString("Value", null, 2, null), (Modifier) null, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) new BentoSettingsRows.EndElement.Metadata("Metadata", null, 2, null), false, false, (Function0<Unit>) null, composer, 54, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
            AnnotatedString annotatedString2 = new AnnotatedString("Label", null, 2, null);
            AnnotatedString annotatedString3 = new AnnotatedString("Value", null, 2, null);
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.QUESTION_24;
            BentoSettingsRowKt.BentoSettingsRow(annotatedString2, annotatedString3, (Modifier) null, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) new BentoSettingsRows.EndElement.Icon(serverToBentoAssetMapper2, null, 2, null), false, false, (Function0<Unit>) null, composer, 54, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
            BentoText2.m20747BentoText38GnDrw("Disabled", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 6, 0, 16382);
            BentoSettingsRowKt.BentoSettingsRow(new AnnotatedString("Label", null, 2, null), new AnnotatedString("Value", null, 2, null), (Modifier) null, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) null, false, false, (Function0<Unit>) null, composer, 196662, EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
            BentoSettingsRowKt.BentoSettingsRow(new AnnotatedString("Label", null, 2, null), new AnnotatedString("Value", null, 2, null), (Modifier) null, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) new BentoSettingsRows.EndElement.Metadata("Metadata", null, 2, null), false, false, (Function0<Unit>) null, composer, 196662, 204);
            BentoSettingsRowKt.BentoSettingsRow(new AnnotatedString("Label", null, 2, null), new AnnotatedString("Value", null, 2, null), (Modifier) null, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) new BentoSettingsRows.EndElement.Icon(serverToBentoAssetMapper2, null, 2, null), false, false, (Function0<Unit>) null, composer, 196662, 204);
            BentoText2.m20747BentoText38GnDrw("Text overflow", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 6, 0, 16382);
            BentoSettingsRowKt.BentoSettingsRow(new AnnotatedString("Label text can overflow to a maximum of three lines before truncating. This is a label text that has overflowed to a maximum of three lines before truncating.", null, 2, null), new AnnotatedString("Value text can overflow to a maximum of three lines before truncating. This is a value text that has overflowed to a maximum of three lines before truncating.", null, 2, null), (Modifier) null, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) null, false, false, (Function0<Unit>) null, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            BentoSettingsRowKt.BentoSettingsRow(new AnnotatedString("Label text can overflow to a maximum of three lines before truncating. This is a label text that has overflowed to a maximum of three lines before truncating.", null, 2, null), new AnnotatedString("Value text can overflow to a maximum of three lines before truncating. This is a value text that has overflowed to a maximum of three lines before truncating.", null, 2, null), (Modifier) null, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) new BentoSettingsRows.EndElement.Icon(serverToBentoAssetMapper2, null, 2, null), false, false, (Function0<Unit>) null, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
            BentoSettingsRowKt.BentoSettingsRow(new AnnotatedString("Label text width shrinks as metadata text grows. Label text has a minimum width based on the device size.", null, 2, null), new AnnotatedString("Value text width shrinks as metadata text grows. Value text has a minimum width based on the device size.", null, 2, null), (Modifier) null, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) new BentoSettingsRows.EndElement.Metadata("Metadata text size shrinks before truncating and cannot overflow lines.", null, 2, null), false, false, (Function0<Unit>) null, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
            BentoText2.m20747BentoText38GnDrw("Color", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 6, 0, 16382);
            BentoSettingsRowKt.BentoSettingsRow(new AnnotatedString("Label", null, 2, null), new AnnotatedString("Value", null, 2, null), (Modifier) null, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) new BentoSettingsRows.EndElement.Metadata("Verified", Color.m6701boximpl(bentoTheme.getColors(composer, 6).m21456getPositive0d7_KjU()), null), false, false, (Function0<Unit>) null, composer, 54, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
            BentoSettingsRowKt.BentoSettingsRow(new AnnotatedString("Label", null, 2, null), new AnnotatedString("Value", null, 2, null), (Modifier) null, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) new BentoSettingsRows.EndElement.Metadata("Invalid", Color.m6701boximpl(bentoTheme.getColors(composer, 6).m21452getNegative0d7_KjU()), null), false, false, (Function0<Unit>) null, composer, 54, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
            AnnotatedString annotatedString4 = new AnnotatedString("Label", null, 2, null);
            AnnotatedString annotatedString5 = new AnnotatedString("Value", null, 2, null);
            ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = ServerToBentoAssetMapper2.CLOSE_24;
            BentoSettingsRowKt.BentoSettingsRow(annotatedString4, annotatedString5, (Modifier) null, (BentoSettingsRows.StartElement) new BentoSettingsRows.StartElement.Icon(serverToBentoAssetMapper22), (BentoSettingsRows.EndElement) null, false, false, (Function0<Unit>) null, composer, 54, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
            BentoSettingsRowKt.BentoSettingsRow(new AnnotatedString("Label", null, 2, null), new AnnotatedString("Value", null, 2, null), (Modifier) null, (BentoSettingsRows.StartElement) new BentoSettingsRows.StartElement.Icon(serverToBentoAssetMapper22), (BentoSettingsRows.EndElement) null, false, false, (Function0<Unit>) null, composer, 196662, EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE);
            AnnotatedString annotatedString6 = new AnnotatedString("Label", null, 2, null);
            AnnotatedString annotatedString7 = new AnnotatedString("Value", null, 2, null);
            ServerToBentoAssetMapper2 serverToBentoAssetMapper23 = ServerToBentoAssetMapper2.CARET_RIGHT_16;
            BentoSettingsRowKt.BentoSettingsRow(annotatedString6, annotatedString7, (Modifier) null, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) new BentoSettingsRows.EndElement.Icon(serverToBentoAssetMapper23, Color.m6701boximpl(bentoTheme.getColors(composer, 6).m21456getPositive0d7_KjU()), null), false, false, (Function0<Unit>) null, composer, 54, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
            BentoSettingsRowKt.BentoSettingsRow(new AnnotatedString("Label", null, 2, null), new AnnotatedString("Value", null, 2, null), (Modifier) null, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) new BentoSettingsRows.EndElement.Icon(serverToBentoAssetMapper23, Color.m6701boximpl(bentoTheme.getColors(composer, 6).m21452getNegative0d7_KjU()), null), false, false, (Function0<Unit>) null, composer, 54, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
            composer.startReplaceGroup(1312519245);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            FontWeight.Companion companion3 = FontWeight.INSTANCE;
            int iPushStyle = builder.pushStyle(new SpanStyle(0L, bentoTheme.getTypography(composer, 6).getTextS().m7662getFontSizeXSAIIZE(), companion3.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65529, (DefaultConstructorMarker) null));
            try {
                builder.append("Label");
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                iPushStyle = builder.pushStyle(new SpanStyle(0L, bentoTheme.getTypography(composer, 6).getTextM().m7662getFontSizeXSAIIZE(), companion3.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65529, (DefaultConstructorMarker) null));
                try {
                    builder.append("is bold");
                    builder.pop(iPushStyle);
                    AnnotatedString annotatedString8 = builder.toAnnotatedString();
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(1312539277);
                    builder = new AnnotatedString.Builder(0, 1, null);
                    iPushStyle = builder.pushStyle(new SpanStyle(0L, bentoTheme.getTypography(composer, 6).getTextS().m7662getFontSizeXSAIIZE(), companion3.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65529, (DefaultConstructorMarker) null));
                    try {
                        builder.append("Value");
                        builder.pop(iPushStyle);
                        iPushStyle = builder.pushStyle(new SpanStyle(0L, bentoTheme.getTypography(composer, 6).getTextM().m7662getFontSizeXSAIIZE(), companion3.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65529, (DefaultConstructorMarker) null));
                        try {
                            builder.append("is bold");
                            builder.pop(iPushStyle);
                            AnnotatedString annotatedString9 = builder.toAnnotatedString();
                            composer.endReplaceGroup();
                            BentoSettingsRowKt.BentoSettingsRow(annotatedString8, annotatedString9, (Modifier) null, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) null, false, false, (Function0<Unit>) null, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } finally {
                        }
                    } finally {
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
    });

    /* renamed from: lambda$-45883678, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9339lambda$45883678 = ComposableLambda3.composableLambdaInstance(-45883678, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoSettingsRowKt$lambda$-45883678$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-45883678, i, -1, "com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoSettingsRowKt.lambda$-45883678.<anonymous> (BentoSettingsRow.kt:514)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            BentoText2.m20747BentoText38GnDrw("Condensed", PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer, 6).m21592getMediumD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, 6).getDisplayCapsuleMedium(), composer, 6, 0, 8188);
            BentoText2.m20747BentoText38GnDrw("Enabled", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 6, 0, 16382);
            BentoSettingsRowKt.BentoCondensedSettingsRow(null, "Label", "Value", null, false, false, null, composer, 432, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE);
            BentoSettingsRowKt.BentoCondensedSettingsRow(null, "Label", "Value", null, false, false, null, composer, 432, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE);
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.QUESTION_16;
            BentoSettingsRowKt.BentoCondensedSettingsRow(null, "Label", "Value", serverToBentoAssetMapper2, false, false, null, composer, 3504, 113);
            BentoText2.m20747BentoText38GnDrw("Disabled", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 6, 0, 16382);
            BentoSettingsRowKt.BentoCondensedSettingsRow(null, "Label", "Value", null, false, false, null, composer, 25008, 105);
            BentoSettingsRowKt.BentoCondensedSettingsRow(null, "Label", "Value", null, false, false, null, composer, 25008, 105);
            BentoSettingsRowKt.BentoCondensedSettingsRow(null, "Label", "Value", serverToBentoAssetMapper2, false, false, null, composer, 28080, 97);
            BentoText2.m20747BentoText38GnDrw("Text overflow", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 6, 0, 16382);
            BentoSettingsRowKt.BentoCondensedSettingsRow(null, "Label text width shrinks as metadata text grows. Label text has a minimum width based on the device size.", "Value text size shrinks before truncating and cannot overflow lines.", null, false, false, null, composer, 384, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE);
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
    });

    /* renamed from: getLambda$-45883678$lib_compose_bento_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m21036getLambda$45883678$lib_compose_bento_externalRelease() {
        return f9339lambda$45883678;
    }

    /* renamed from: getLambda$-668573611$lib_compose_bento_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m21037getLambda$668573611$lib_compose_bento_externalRelease() {
        return f9340lambda$668573611;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1773217995$lib_compose_bento_externalRelease() {
        return lambda$1773217995;
    }
}
