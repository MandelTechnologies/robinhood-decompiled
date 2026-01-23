package com.truelayer.payments.p419ui.screens.providerselection.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import com.truelayer.payments.core.domain.payments.ProviderAvailability;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.components.EncircledProviderImage4;
import com.truelayer.payments.p419ui.screens.providerselection.PaymentProviderViewData;
import com.truelayer.payments.p419ui.theme.Spacing;
import com.truelayer.payments.p419ui.theme.Theme5;
import com.truelayer.payments.p419ui.utils.TestTags;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProviderSelectionRow.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"ProviderSelectionRow", "", "provider", "Lcom/truelayer/payments/ui/screens/providerselection/PaymentProviderViewData;", "onClick", "Lkotlin/Function1;", "onDisabledClick", "enabled", "", "(Lcom/truelayer/payments/ui/screens/providerselection/PaymentProviderViewData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "ProviderSelectionRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.providerselection.components.ProviderSelectionRowKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ProviderSelectionRow3 {
    public static final void ProviderSelectionRow(final PaymentProviderViewData provider, final Function1<? super PaymentProviderViewData, Unit> onClick, final Function1<? super PaymentProviderViewData, Unit> onDisabledClick, boolean z, Composer composer, final int i, final int i2) {
        boolean zIsAvailable;
        int i3;
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onDisabledClick, "onDisabledClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1284290543);
        if ((i2 & 8) != 0) {
            ProviderAvailability availability = provider.getAvailability();
            zIsAvailable = availability != null ? availability.isAvailable() : true;
            i3 = i & (-7169);
        } else {
            zIsAvailable = z;
            i3 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1284290543, i3, -1, "com.truelayer.payments.ui.screens.providerselection.components.ProviderSelectionRow (ProviderSelectionRow.kt:36)");
        }
        float f = zIsAvailable ? 1.0f : 0.48f;
        final boolean z2 = zIsAvailable;
        CardDefaults cardDefaults = CardDefaults.INSTANCE;
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
        int i4 = CardDefaults.$stable;
        CardElevation cardElevationM5730cardElevationaqJV_2Y = cardDefaults.m5730cardElevationaqJV_2Y(fM7995constructorimpl, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (i4 << 18) | 6, 62);
        Color.Companion companion = Color.INSTANCE;
        int i5 = (i4 << 12) | 390;
        final float f2 = f;
        CardKt.Card(new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.ProviderSelectionRowKt.ProviderSelectionRow.1
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
                if (z2) {
                    onClick.invoke(provider);
                } else {
                    onDisabledClick.invoke(provider);
                }
            }
        }, TestTag3.testTag(SizeKt.fillMaxWidth$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(88), 1, null), 0.0f, 1, null), TestTags.PROVIDER_ROW), false, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getMedium(), cardDefaults.m5729cardColorsro_MJ88(companion.m6725getTransparent0d7_KjU(), 0L, companion.m6725getTransparent0d7_KjU(), 0L, composerStartRestartGroup, i5, 10), cardElevationM5730cardElevationaqJV_2Y, null, null, ComposableLambda3.composableLambda(composerStartRestartGroup, -1178466554, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.ProviderSelectionRowKt.ProviderSelectionRow.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer2, Integer num) {
                invoke(column5, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Column5 Card, Composer composer2, int i6) {
                Intrinsics.checkNotNullParameter(Card, "$this$Card");
                if ((i6 & 81) == 16 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1178466554, i6, -1, "com.truelayer.payments.ui.screens.providerselection.components.ProviderSelectionRow.<anonymous> (ProviderSelectionRow.kt:57)");
                }
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Spacing spacing = Spacing.INSTANCE;
                Modifier modifierAlpha = Alpha.alpha(PaddingKt.m5142padding3ABfNKs(companion2, spacing.m27177getREGULARD9Ej5fM()), f2);
                PaymentProviderViewData paymentProviderViewData = provider;
                composer2.startReplaceableGroup(693286680);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Horizontal start = arrangement.getStart();
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion3.getTop(), composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlpha);
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
                EncircledProviderImage4.m27040EncircledProviderImageuFdPcIQ(row6.align(companion2, companion3.getCenterVertically()), 0.0f, paymentProviderViewData, composer2, 512, 2);
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(row6.align(companion2, companion3.getCenterVertically()), spacing.m27177getREGULARD9Ej5fM(), 0.0f, 2, null);
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM5144paddingVpY3zN4$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                Column6 column6 = Column6.INSTANCE;
                String displayName = paymentProviderViewData.getDisplayName();
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i7 = MaterialTheme.$stable;
                TextKt.m6028Text4IGK_g(displayName, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i7).getBodyLarge(), composer2, 0, 0, 65534);
                ProviderAvailability availability2 = paymentProviderViewData.getAvailability();
                composer2.startReplaceableGroup(-913222185);
                if (availability2 != null) {
                    composer2.startReplaceableGroup(-527649006);
                    if (availability2.getRecommendedStatus() == ProviderAvailability.Status.Unhealthy) {
                        TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(C42830R.string.bank_temporarily_unavailable, composer2, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i7).getBodyLarge(), composer2, 0, 0, 65534);
                    }
                    composer2.endReplaceableGroup();
                }
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, 100663344, EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.ProviderSelectionRowKt.ProviderSelectionRow.3
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

                public final void invoke(Composer composer2, int i6) {
                    ProviderSelectionRow3.ProviderSelectionRow(provider, onClick, onDisabledClick, z2, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final void ProviderSelectionRowPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1354494117);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1354494117, i, -1, "com.truelayer.payments.ui.screens.providerselection.components.ProviderSelectionRowPreview (ProviderSelectionRow.kt:90)");
            }
            Theme5.Theme(null, false, null, ProviderSelectionRow.INSTANCE.m27118getLambda1$payments_ui_release(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.ProviderSelectionRowKt.ProviderSelectionRowPreview.1
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
                    ProviderSelectionRow3.ProviderSelectionRowPreview(composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
