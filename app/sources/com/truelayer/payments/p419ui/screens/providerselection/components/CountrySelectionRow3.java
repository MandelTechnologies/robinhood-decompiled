package com.truelayer.payments.p419ui.screens.providerselection.components;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckCircle;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MaterialTheme2;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsProperties;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
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
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.p419ui.components.FlagImage3;
import com.truelayer.payments.p419ui.models.Country;
import com.truelayer.payments.p419ui.theme.ModifiersKt;
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

/* compiled from: CountrySelectionRow.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"CountrySelectionRow", "", PlaceTypes.COUNTRY, "Lcom/truelayer/payments/ui/models/Country;", "selected", "", "onClick", "Lkotlin/Function1;", "(Lcom/truelayer/payments/ui/models/Country;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CountrySelectionRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.providerselection.components.CountrySelectionRowKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CountrySelectionRow3 {
    public static final void CountrySelectionRow(final Country country, final boolean z, final Function1<? super Country, Unit> onClick, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1869964762);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1869964762, i, -1, "com.truelayer.payments.ui.screens.providerselection.components.CountrySelectionRow (CountrySelectionRow.kt:38)");
        }
        CardDefaults cardDefaults = CardDefaults.INSTANCE;
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
        int i2 = CardDefaults.$stable;
        CardElevation cardElevationM5730cardElevationaqJV_2Y = cardDefaults.m5730cardElevationaqJV_2Y(fM7995constructorimpl, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (i2 << 18) | 6, 62);
        Color.Companion companion = Color.INSTANCE;
        CardColors cardColorsM5729cardColorsro_MJ88 = cardDefaults.m5729cardColorsro_MJ88(companion.m6725getTransparent0d7_KjU(), 0L, companion.m6725getTransparent0d7_KjU(), 0L, composerStartRestartGroup, (i2 << 12) | 390, 10);
        CornerBasedShape medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getMedium();
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(72), 1, null), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(1951108549);
        boolean z2 = (((i & 112) ^ 48) > 32 && composerStartRestartGroup.changed(z)) || (i & 48) == 32;
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.CountrySelectionRowKt$CountrySelectionRow$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semantics) {
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    semantics.set(SemanticsProperties.INSTANCE.getSelected(), Boolean.valueOf(z));
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CardKt.Card(new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.CountrySelectionRowKt.CountrySelectionRow.2
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
                onClick.invoke(country);
            }
        }, TestTag3.testTag(SemanticsModifier6.semantics$default(modifierFillMaxWidth$default, false, (Function1) objRememberedValue, 1, null), TestTags.COUNTRY_ROW), false, medium, cardColorsM5729cardColorsro_MJ88, cardElevationM5730cardElevationaqJV_2Y, null, null, ComposableLambda3.composableLambda(composerStartRestartGroup, -1603409253, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.CountrySelectionRowKt.CountrySelectionRow.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        ComposerKt.traceEventStart(-1603409253, i3, -1, "com.truelayer.payments.ui.screens.providerselection.components.CountrySelectionRow.<anonymous> (CountrySelectionRow.kt:55)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Spacing spacing = Spacing.INSTANCE;
                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion2, spacing.m27177getREGULARD9Ej5fM());
                    Country country2 = country;
                    boolean z3 = z;
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
                    FlagImage3.FlagImage(row6.align(ModifiersKt.m27165circlesqb8OZA$default(SizeKt.m5169size3ABfNKs(companion2, C2002Dp.m7995constructorimpl(40)), 0L, 0.0f, null, 7, null), companion3.getCenterVertically()), country2, null, null, null, composer2, 64, 28);
                    String displayName = country2.getDisplayName();
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i4 = MaterialTheme.$stable;
                    TextKt.m6028Text4IGK_g(displayName, PaddingKt.m5144paddingVpY3zN4$default(row6.align(companion2, companion3.getCenterVertically()), spacing.m27177getREGULARD9Ej5fM(), 0.0f, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i4).getBodyLarge(), composer2, 0, 0, 65532);
                    composer2.startReplaceableGroup(1013185916);
                    if (z3) {
                        Spacer2.Spacer(Row5.weight$default(row6, companion2, 1.0f, false, 2, null), composer2, 0);
                        ImageKt.Image(CheckCircle.getCheckCircle(Icons.Filled.INSTANCE), (String) null, row6.align(SizeKt.m5169size3ABfNKs(companion2, C2002Dp.m7995constructorimpl(20)), companion3.getCenterVertically()), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, materialTheme.getColorScheme(composer2, i4).getPrimary(), 0, 2, null), composer2, 48, 56);
                    }
                    composer2.endReplaceableGroup();
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
        }), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.CountrySelectionRowKt.CountrySelectionRow.4
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
                    CountrySelectionRow3.CountrySelectionRow(country, z, onClick, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void CountrySelectionRowPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1222812143);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1222812143, i, -1, "com.truelayer.payments.ui.screens.providerselection.components.CountrySelectionRowPreview (CountrySelectionRow.kt:90)");
            }
            MaterialTheme2.MaterialTheme(null, null, null, CountrySelectionRow.INSTANCE.m27117getLambda1$payments_ui_release(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.CountrySelectionRowKt.CountrySelectionRowPreview.1
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
                    CountrySelectionRow3.CountrySelectionRowPreview(composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
