package com.robinhood.android.recommendations.lib.p221ui.recurringhook.ordertype;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.recommendations.lib.C25982R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoSpannedText;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.text.Spans;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecommendationsRecurringHookOrderTypeSelectionContent.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\u0000\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\n\u001aG\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"RecurringHookOrderTypeSelectionContent", "", "onApplyRecommendationsSplitToRecurringOrder", "Lkotlin/Function0;", "onCreateNewOrder", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "showBottomSheet", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Card", "modifier", "Landroidx/compose/ui/Modifier;", "title", "", "subtitle", "imageRes", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "onClick", "Card-yrwZFoE", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;IJLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-lib-recommendations_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.recommendations.lib.ui.recurringhook.ordertype.RecommendationsRecurringHookOrderTypeSelectionContentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class RecommendationsRecurringHookOrderTypeSelectionContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Card_yrwZFoE$lambda$9(Modifier modifier, String str, String str2, int i, long j, Function0 function0, int i2, Composer composer, int i3) {
        m17796CardyrwZFoE(modifier, str, str2, i, j, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringHookOrderTypeSelectionContent$lambda$4(Function0 function0, Function0 function02, Screen screen, Context context, Function0 function03, int i, int i2, Composer composer, int i3) {
        RecurringHookOrderTypeSelectionContent(function0, function02, screen, context, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void RecurringHookOrderTypeSelectionContent(Function0<Unit> function0, Function0<Unit> function02, final Screen eventScreen, final Context eventContext, final Function0<Unit> showBottomSheet, Composer composer, final int i, final int i2) {
        int i3;
        final Function0<Unit> function03;
        final Function0<Unit> function04;
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        Intrinsics.checkNotNullParameter(showBottomSheet, "showBottomSheet");
        Composer composerStartRestartGroup = composer.startRestartGroup(896548134);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(eventScreen) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(eventContext) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(showBottomSheet) ? 16384 : 8192;
        }
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.recommendations.lib.ui.recurringhook.ordertype.RecommendationsRecurringHookOrderTypeSelectionContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (i5 != 0) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.recommendations.lib.ui.recurringhook.ordertype.RecommendationsRecurringHookOrderTypeSelectionContentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                function02 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
            }
            final Function0<Unit> function05 = function02;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(896548134, i3, -1, "com.robinhood.android.recommendations.lib.ui.recurringhook.ordertype.RecurringHookOrderTypeSelectionContent (RecommendationsRecurringHookOrderTypeSelectionContent.kt:44)");
            }
            final Function0<Unit> function06 = function0;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1953341745, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.lib.ui.recurringhook.ordertype.RecommendationsRecurringHookOrderTypeSelectionContentKt.RecurringHookOrderTypeSelectionContent.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1953341745, i6, -1, "com.robinhood.android.recommendations.lib.ui.recurringhook.ordertype.RecurringHookOrderTypeSelectionContent.<anonymous> (RecommendationsRecurringHookOrderTypeSelectionContent.kt:46)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(companion);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m5143paddingVpY3zN4(modifierNavigationBarsPadding, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM()), 0.0f, 1, null);
                    Screen screen = eventScreen;
                    Context context = eventContext;
                    Function0<Unit> function07 = function06;
                    Function0<Unit> function08 = function05;
                    final Function0<Unit> function09 = showBottomSheet;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25982R.string.recs_recurring_hook_order_type_selection_title, composer2, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getDisplayCapsuleMedium(), composer2, 0, 0, 8188);
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), 7, null);
                    composer2.startReplaceGroup(1249779136);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) StringResources_androidKt.stringResource(C25982R.string.recs_recurring_hook_order_type_selection_subtitle_start, composer2, 0));
                    String strStringResource = StringResources_androidKt.stringResource(C25982R.string.recs_recurring_hook_order_type_selection_subtitle_clickable, composer2, 0);
                    spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
                    Spans spans = Spans.INSTANCE;
                    final boolean z = true;
                    ClickableSpan clickableSpan = new ClickableSpan() { // from class: com.robinhood.android.recommendations.lib.ui.recurringhook.ordertype.RecommendationsRecurringHookOrderTypeSelectionContentKt$RecurringHookOrderTypeSelectionContent$3$invoke$lambda$2$lambda$1$$inlined$appendClickableSpan$default$1
                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public void updateDrawState(TextPaint textPaint) {
                            Intrinsics.checkNotNullParameter(textPaint, "textPaint");
                            textPaint.setColor(textPaint.linkColor);
                            textPaint.setUnderlineText(z);
                            if (z) {
                                textPaint.setTypeface(Typeface.DEFAULT_BOLD);
                            }
                        }

                        @Override // android.text.style.ClickableSpan
                        public void onClick(View widget) {
                            Intrinsics.checkNotNullParameter(widget, "widget");
                            function09.invoke();
                        }
                    };
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) strStringResource);
                    spannableStringBuilder.setSpan(clickableSpan, length, spannableStringBuilder.length(), 17);
                    spannableStringBuilder.append((CharSequence) StringResources_androidKt.stringResource(C25982R.string.recs_recurring_hook_order_type_selection_subtitle_end, composer2, 0));
                    SpannedString spannedString = new SpannedString(spannableStringBuilder);
                    composer2.endReplaceGroup();
                    BentoSpannedText.m21106BentoSpannedTextTHkziT8(spannedString, modifierM5146paddingqDBjuR0$default, null, null, C20690R.attr.textAppearanceRegularMedium, null, 0, 0, null, composer2, 0, 492);
                    Component.ComponentType componentType = Component.ComponentType.BUTTON;
                    RecommendationsRecurringHookOrderTypeSelectionContent.m17796CardyrwZFoE(SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.autoLogEvents$default(companion, new UserInteractionEventDescriptor(null, screen, UserInteractionEventData.Action.RECS_RECURRING_KEEP_LAST_ORDER, context, new Component(componentType, null, null, 6, null), null, 33, null), false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), 7, null), 0.0f, 1, null), StringResources_androidKt.stringResource(C25982R.string.recs_recurring_hook_order_type_selection_existing_split_title, composer2, 0), StringResources_androidKt.stringResource(C25982R.string.f4865x6ae99ef6, composer2, 0), C25982R.drawable.recs_recurring_hook_order_type_selection_existing_split_image, bentoTheme.getColors(composer2, i7).getXrayLight(), function07, composer2, 0);
                    RecommendationsRecurringHookOrderTypeSelectionContent.m17796CardyrwZFoE(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(companion, new UserInteractionEventDescriptor(null, screen, UserInteractionEventData.Action.RECS_RECURRING_START_FROM_SCRATCH, context, new Component(componentType, null, null, 6, null), null, 33, null), false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), 0.0f, 1, null), StringResources_androidKt.stringResource(C25982R.string.recs_recurring_hook_order_type_selection_new_order_title, composer2, 0), StringResources_androidKt.stringResource(C25982R.string.f4866x70cb4d23, composer2, 0), C25982R.drawable.recs_recurring_hook_order_type_new_order_image, bentoTheme.getColors(composer2, i7).getHydroLight(), function08, composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function03 = function06;
            function04 = function05;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function03 = function0;
            function04 = function02;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.lib.ui.recurringhook.ordertype.RecommendationsRecurringHookOrderTypeSelectionContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecommendationsRecurringHookOrderTypeSelectionContent.RecurringHookOrderTypeSelectionContent$lambda$4(function03, function04, eventScreen, eventContext, showBottomSheet, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Card-yrwZFoE, reason: not valid java name */
    public static final void m17796CardyrwZFoE(final Modifier modifier, final String str, final String str2, final int i, final long j, final Function0<Unit> function0, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1111159749);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1111159749, i3, -1, "com.robinhood.android.recommendations.lib.ui.recurringhook.ordertype.Card (RecommendationsRecurringHookOrderTypeSelectionContent.kt:125)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (458752 & i3) == 131072;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.recommendations.lib.ui.recurringhook.ordertype.RecommendationsRecurringHookOrderTypeSelectionContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RecommendationsRecurringHookOrderTypeSelectionContent.Card_yrwZFoE$lambda$6$lambda$5(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifier, false, null, null, (Function0) objRememberedValue, 7, null), null, true, false, false, true, false, null, 109, null), j, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4871backgroundbw27NRU);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierWeight$default = Row5.weight$default(row6, PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM(), 4, null), 1.4f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleSmall();
            Color.Companion companion4 = Color.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(companion4.m6716getBlack0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, ((i3 >> 3) & 14) | 384, 0, 8186);
            BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(companion4.m6716getBlack0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS(), composerStartRestartGroup, ((i3 >> 6) & 14) | 384, 0, 8186);
            composerStartRestartGroup.endNode();
            ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i3 >> 9) & 14), "Recurring hook card", AspectRatio3.aspectRatio$default(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), 1.0f, false, 2, null), companion.getCenterEnd(), ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 27696, 96);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.lib.ui.recurringhook.ordertype.RecommendationsRecurringHookOrderTypeSelectionContentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecommendationsRecurringHookOrderTypeSelectionContent.Card_yrwZFoE$lambda$9(modifier, str, str2, i, j, function0, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Card_yrwZFoE$lambda$6$lambda$5(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
