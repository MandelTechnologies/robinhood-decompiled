package com.truelayer.payments.p419ui.components.inputs;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MaterialTheme2;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.truelayer.payments.p419ui.components.EncircledProviderImage4;
import com.truelayer.payments.p419ui.screens.formflows.model.SelectOption;
import com.truelayer.payments.p419ui.theme.Spacing;
import com.truelayer.payments.p419ui.utils.TestTags;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SelectOptionItem.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aD\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052#\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"SelectOptionItem", "", "modifier", "Landroidx/compose/ui/Modifier;", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "Lcom/truelayer/payments/ui/screens/formflows/model/SelectOption;", "onSelect", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "value", "(Landroidx/compose/ui/Modifier;Lcom/truelayer/payments/ui/screens/formflows/model/SelectOption;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "SelectOptionItemPreview", "(Landroidx/compose/runtime/Composer;I)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.components.inputs.SelectOptionItemKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class SelectOptionItem4 {
    public static final void SelectOptionItem(Modifier modifier, final SelectOption option, final Function1<? super SelectOption, Unit> onSelect, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(onSelect, "onSelect");
        Composer composerStartRestartGroup = composer.startRestartGroup(1761449569);
        final Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1761449569, i, -1, "com.truelayer.payments.ui.components.inputs.SelectOptionItem (SelectOptionItem.kt:27)");
        }
        CornerBasedShape medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getMedium();
        CardDefaults cardDefaults = CardDefaults.INSTANCE;
        Color.Companion companion = Color.INSTANCE;
        CardKt.Card(new Function0<Unit>() { // from class: com.truelayer.payments.ui.components.inputs.SelectOptionItemKt.SelectOptionItem.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                onSelect.invoke(option);
            }
        }, TestTag3.testTag(SizeKt.fillMaxWidth$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(modifier2, 0.0f, C2002Dp.m7995constructorimpl(72), 1, null), 0.0f, 1, null), TestTags.SELECT_OPTION_ROW), false, medium, cardDefaults.m5729cardColorsro_MJ88(companion.m6725getTransparent0d7_KjU(), 0L, companion.m6725getTransparent0d7_KjU(), 0L, composerStartRestartGroup, (CardDefaults.$stable << 12) | 390, 10), null, null, null, ComposableLambda3.composableLambda(composerStartRestartGroup, -1987913716, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.SelectOptionItemKt.SelectOptionItem.2
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer2, Integer num) {
                invoke(column5, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Column5 Card, Composer composer2, int i3) {
                Intrinsics.checkNotNullParameter(Card, "$this$Card");
                if ((i3 & 81) != 16 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1987913716, i3, -1, "com.truelayer.payments.ui.components.inputs.SelectOptionItem.<anonymous> (SelectOptionItem.kt:39)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Spacing spacing = Spacing.INSTANCE;
                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion2, spacing.m27177getREGULARD9Ej5fM());
                    SelectOption selectOption = option;
                    composer2.startReplaceableGroup(693286680);
                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion3.getTop(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM5142padding3ABfNKs);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Row6 row6 = Row6.INSTANCE;
                    Modifier modifierAlign = row6.align(companion2, companion3.getCenterVertically());
                    float fM7995constructorimpl = C2002Dp.m7995constructorimpl(56);
                    String imageUrl = selectOption.getImageUrl();
                    if (imageUrl == null) {
                        imageUrl = "";
                    }
                    EncircledProviderImage4.m27039EncircledProviderImageRfXq3Jk(modifierAlign, fM7995constructorimpl, selectOption.getExtendedImageUrl(), imageUrl, SelectOptionItem.INSTANCE.m27053getLambda1$payments_ui_release(), null, composer2, 24624, 32);
                    TextKt.m6028Text4IGK_g(selectOption.getLabel(), PaddingKt.m5144paddingVpY3zN4$default(row6.align(companion2, companion3.getCenterVertically()), spacing.m27177getREGULARD9Ej5fM(), 0.0f, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyLarge(), composer2, 0, 0, 65532);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.SelectOptionItemKt.SelectOptionItem.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    SelectOptionItem4.SelectOptionItem(modifier2, option, onSelect, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final void SelectOptionItemPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(894951414);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(894951414, i, -1, "com.truelayer.payments.ui.components.inputs.SelectOptionItemPreview (SelectOptionItem.kt:62)");
            }
            MaterialTheme2.MaterialTheme(null, null, null, SelectOptionItem.INSTANCE.m27054getLambda2$payments_ui_release(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.SelectOptionItemKt.SelectOptionItemPreview.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    SelectOptionItem4.SelectOptionItemPreview(composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
