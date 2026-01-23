package com.robinhood.android.options.p208ui.bottomsheet;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.options.C22993R;
import com.robinhood.android.options.p208ui.bottomsheet.LateCloseBottomSheetDialogFragment;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsLateCloseBottomSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"OptionsLateCloseBottomSheetComposable", "", "args", "Lcom/robinhood/android/options/ui/bottomsheet/LateCloseBottomSheetDialogFragment$Args;", "onGotItTapped", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "onLearnMoreTapped", "(Lcom/robinhood/android/options/ui/bottomsheet/LateCloseBottomSheetDialogFragment$Args;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-options-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.ui.bottomsheet.OptionsLateCloseBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsLateCloseBottomSheetComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsLateCloseBottomSheetComposable$lambda$0(LateCloseBottomSheetDialogFragment.Args args, Function0 function0, Modifier modifier, Function0 function02, int i, int i2, Composer composer, int i3) {
        OptionsLateCloseBottomSheetComposable(args, function0, modifier, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void OptionsLateCloseBottomSheetComposable(final LateCloseBottomSheetDialogFragment.Args args, final Function0<Unit> onGotItTapped, final Modifier modifier, final Function0<Unit> onLearnMoreTapped, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(onGotItTapped, "onGotItTapped");
        Intrinsics.checkNotNullParameter(onLearnMoreTapped, "onLearnMoreTapped");
        Composer composerStartRestartGroup = composer.startRestartGroup(-628863318);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onGotItTapped) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onLearnMoreTapped) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-628863318, i3, -1, "com.robinhood.android.options.ui.bottomsheet.OptionsLateCloseBottomSheetComposable (OptionsLateCloseBottomSheetComposable.kt:23)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(315544117, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.ui.bottomsheet.OptionsLateCloseBottomSheetComposableKt.OptionsLateCloseBottomSheetComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    int i6;
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(315544117, i5, -1, "com.robinhood.android.options.ui.bottomsheet.OptionsLateCloseBottomSheetComposable.<anonymous> (OptionsLateCloseBottomSheetComposable.kt:25)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM());
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    LateCloseBottomSheetDialogFragment.Args args2 = args;
                    Function0<Unit> function0 = onGotItTapped;
                    Function0<Unit> function02 = onLearnMoreTapped;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5145paddingqDBjuR0);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    String strStringResource = StringResources_androidKt.stringResource(C22993R.string.options_late_close_info_title, composer2, 0);
                    TextStyle displayCapsuleSmall = bentoTheme.getTypography(composer2, i7).getDisplayCapsuleSmall();
                    TextAlign.Companion companion3 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierFillMaxWidth$default2, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composer2, 48, 0, 8124);
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    int i8 = C22993R.string.options_late_close_info_description;
                    String symbol = args2.getSymbol();
                    composer2.startReplaceGroup(-593633615);
                    if (symbol == null) {
                        i6 = 0;
                        symbol = StringResources_androidKt.stringResource(C22993R.string.options_late_close_info_default_symbol, composer2, 0);
                    } else {
                        i6 = 0;
                    }
                    composer2.endReplaceGroup();
                    String lateCloseTimeString = args2.getLateCloseTimeString();
                    composer2.startReplaceGroup(-593629630);
                    if (lateCloseTimeString == null) {
                        lateCloseTimeString = StringResources_androidKt.stringResource(C22993R.string.options_late_close_info_default_late_close, composer2, i6);
                    }
                    composer2.endReplaceGroup();
                    Long extensionTimeInMinutes = args2.getExtensionTimeInMinutes();
                    String string2 = extensionTimeInMinutes != null ? extensionTimeInMinutes.toString() : null;
                    composer2.startReplaceGroup(-593625093);
                    if (string2 == null) {
                        string2 = StringResources_androidKt.stringResource(C22993R.string.options_late_close_info_default_extension_in_minutes, composer2, i6);
                    }
                    composer2.endReplaceGroup();
                    String selloutTimeString = args2.getSelloutTimeString();
                    composer2.startReplaceGroup(-593619806);
                    if (selloutTimeString == null) {
                        selloutTimeString = StringResources_androidKt.stringResource(C22993R.string.options_late_close_info_default_sellout_time, composer2, i6);
                    }
                    composer2.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i8, new Object[]{symbol, lateCloseTimeString, string2, selloutTimeString}, composer2, i6), modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextM(), composer2, 0, 0, 8124);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C22993R.string.options_late_close_info_disclosure, composer2, 0), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextS(), composer2, 0, 0, 8120);
                    BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_label_got_it, composer2, 0), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composer2, 24576, 0, 8168);
                    BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C22993R.string.options_late_close_info_view_list_cta, composer2, 0), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composer2, 24576, 0, 8168);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.ui.bottomsheet.OptionsLateCloseBottomSheetComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsLateCloseBottomSheetComposable.OptionsLateCloseBottomSheetComposable$lambda$0(args, onGotItTapped, modifier2, onLearnMoreTapped, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
