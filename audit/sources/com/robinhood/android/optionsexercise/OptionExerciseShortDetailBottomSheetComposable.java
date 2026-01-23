package com.robinhood.android.optionsexercise;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionExerciseShortDetailBottomSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\b\"\u000e\u0010\t\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"OptionExerciseShortDetailBottomSheetComposable", "", "sharesToExercise", "", "sharesYouCanSell", "shortPosition", "dismissBottomSheet", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ShortDetailBottomSheetTitleTestTag", "ShortDetailBottomSheetSubtitleTestTag", "ShortDetailBottomSheetSharesToExerciseTestTag", "ShortDetailBottomSheetSharesYouCanSellTestTag", "ShortDetailBottomSheetShortPositionTestTag", "ShortDetailBottomSheetDismissButtonTestTag", "feature-options-exercise_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionsexercise.OptionExerciseShortDetailBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionExerciseShortDetailBottomSheetComposable {
    public static final String ShortDetailBottomSheetDismissButtonTestTag = "short_detail_bottom_sheet_dismiss_button_test_tag";
    public static final String ShortDetailBottomSheetSharesToExerciseTestTag = "shares_to_exercise_test_tag";
    public static final String ShortDetailBottomSheetSharesYouCanSellTestTag = "shares_you_can_sell_test_tag";
    public static final String ShortDetailBottomSheetShortPositionTestTag = "short_position_test_tag";
    public static final String ShortDetailBottomSheetSubtitleTestTag = "short_detail_bottom_sheet_subtitle_test_tag";
    public static final String ShortDetailBottomSheetTitleTestTag = "short_detail_bottom_sheet_title_test_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionExerciseShortDetailBottomSheetComposable$lambda$5(String str, String str2, String str3, Function0 function0, int i, Composer composer, int i2) {
        OptionExerciseShortDetailBottomSheetComposable(str, str2, str3, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void OptionExerciseShortDetailBottomSheetComposable(final String sharesToExercise, String sharesYouCanSell, final String shortPosition, Function0<Unit> dismissBottomSheet, Composer composer, final int i) {
        int i2;
        String str;
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(sharesToExercise, "sharesToExercise");
        Intrinsics.checkNotNullParameter(sharesYouCanSell, "sharesYouCanSell");
        Intrinsics.checkNotNullParameter(shortPosition, "shortPosition");
        Intrinsics.checkNotNullParameter(dismissBottomSheet, "dismissBottomSheet");
        Composer composerStartRestartGroup = composer.startRestartGroup(-207107221);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(sharesToExercise) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(sharesYouCanSell) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(shortPosition) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(dismissBottomSheet) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            str = sharesYouCanSell;
            function0 = dismissBottomSheet;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-207107221, i2, -1, "com.robinhood.android.optionsexercise.OptionExerciseShortDetailBottomSheetComposable (OptionExerciseShortDetailBottomSheetComposable.kt:32)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            Modifier modifierTestTag = TestTag3.testTag(companion, ShortDetailBottomSheetTitleTestTag);
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            int iM7919getCentere0LSkKk = companion3.m7919getCentere0LSkKk();
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C24704R.string.option_exercise_short_detail_bottom_sheet_title, composerStartRestartGroup, 0), modifierTestTag, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleSmall(), composerStartRestartGroup, 48, 0, 8120);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
            Modifier modifierTestTag2 = TestTag3.testTag(companion, ShortDetailBottomSheetSubtitleTestTag);
            int iM7919getCentere0LSkKk2 = companion3.m7919getCentere0LSkKk();
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C24704R.string.option_exercise_short_detail_bottom_sheet_subtitle, composerStartRestartGroup, 0), modifierTestTag2, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk2), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, 48, 0, 8120);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            Modifier modifierTestTag3 = TestTag3.testTag(companion, ShortDetailBottomSheetSharesToExerciseTestTag);
            AnnotatedString annotatedString = new AnnotatedString(StringResources_androidKt.stringResource(C24704R.string.f4813x9f6d0d0b, composerStartRestartGroup, 0), null, 2, null);
            BentoBaseRowState.Meta.SingleLine singleLine = new BentoBaseRowState.Meta.SingleLine(sharesToExercise);
            int i4 = BentoBaseRowState.Meta.SingleLine.$stable;
            BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(modifierTestTag3, null, annotatedString, null, null, singleLine, null, false, false, true, false, false, 0L, null, composerStartRestartGroup, (i4 << 15) | 805306374, 0, 15834);
            str = sharesYouCanSell;
            BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(TestTag3.testTag(companion, ShortDetailBottomSheetSharesYouCanSellTestTag), null, new AnnotatedString(StringResources_androidKt.stringResource(C24704R.string.f4814x9940a5fc, composerStartRestartGroup, 0), null, 2, null), null, null, new BentoBaseRowState.Meta.SingleLine(str), null, false, false, true, false, false, 0L, null, composerStartRestartGroup, (i4 << 15) | 805306374, 0, 15834);
            Modifier modifierTestTag4 = TestTag3.testTag(companion, ShortDetailBottomSheetShortPositionTestTag);
            composerStartRestartGroup.startReplaceGroup(488051265);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            composerStartRestartGroup.startReplaceGroup(488052460);
            FontWeight.Companion companion4 = FontWeight.INSTANCE;
            int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, companion4.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
            try {
                builder.append(StringResources_androidKt.stringResource(C24704R.string.option_exercise_short_detail_bottom_sheet_short_position_label, composerStartRestartGroup, 0));
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                composerStartRestartGroup.endReplaceGroup();
                AnnotatedString annotatedString2 = builder.toAnnotatedString();
                composerStartRestartGroup.endReplaceGroup();
                builder = new AnnotatedString.Builder(0, 1, null);
                iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, companion4.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                try {
                    builder.append(shortPosition);
                    builder.pop(iPushStyle);
                    BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(modifierTestTag4, null, annotatedString2, null, null, new BentoBaseRowState.Meta.SingleLine(builder.toAnnotatedString()), null, false, false, true, false, false, 0L, null, composerStartRestartGroup, (i4 << 15) | 805306374, 0, 15834);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                    function0 = dismissBottomSheet;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1793284972, true, new OptionExerciseShortDetailBottomSheetComposable2(function0), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } finally {
                }
            } finally {
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final String str2 = str;
            final Function0<Unit> function02 = function0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsexercise.OptionExerciseShortDetailBottomSheetComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionExerciseShortDetailBottomSheetComposable.OptionExerciseShortDetailBottomSheetComposable$lambda$5(sharesToExercise, str2, shortPosition, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
