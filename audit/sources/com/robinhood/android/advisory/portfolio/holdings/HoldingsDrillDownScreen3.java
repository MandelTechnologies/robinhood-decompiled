package com.robinhood.android.advisory.portfolio.holdings;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.compose.bento.component.BentoChip;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HoldingsDrillDownScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$1$1$1$1$1$2, reason: use source file name */
/* loaded from: classes7.dex */
final class HoldingsDrillDownScreen3 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotIntState2 $selectedTabIndex$delegate;
    final /* synthetic */ HoldingsDrillDownViewState $viewState;

    HoldingsDrillDownScreen3(HoldingsDrillDownViewState holdingsDrillDownViewState, SnapshotIntState2 snapshotIntState2) {
        this.$viewState = holdingsDrillDownViewState;
        this.$selectedTabIndex$delegate = snapshotIntState2;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-270674018, i, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HoldingsDrillDownScreen.kt:167)");
        }
        boolean z = false;
        Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierHorizontalScroll$default, bentoTheme.getSpacing(composer2, i2).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i2).m21592getMediumD9Ej5fM(), 2, null);
        HoldingsDrillDownViewState holdingsDrillDownViewState = this.$viewState;
        final SnapshotIntState2 snapshotIntState2 = this.$selectedTabIndex$delegate;
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        composer2.startReplaceGroup(-1163299783);
        final int i3 = 0;
        for (HoldingsDrillDownViewState3 holdingsDrillDownViewState3 : holdingsDrillDownViewState.getClassificationTabs()) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            HoldingsDrillDownViewState3 holdingsDrillDownViewState32 = holdingsDrillDownViewState3;
            String string2 = StringResource2.getString(holdingsDrillDownViewState32.getName(), composer2, StringResource.$stable);
            boolean z2 = i3 == snapshotIntState2.getIntValue() ? true : z;
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.CHIP, holdingsDrillDownViewState32.getLoggingIdentifier(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null), 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 11, null);
            composer2.startReplaceGroup(-1633490746);
            boolean zChanged = composer2.changed(i3);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$1$1$1$1$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HoldingsDrillDownScreen3.invoke$lambda$3$lambda$2$lambda$1$lambda$0(i3, snapshotIntState2);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            BentoChip.BentoSelectionChip((Function0) objRememberedValue, modifierM5146paddingqDBjuR0$default2, false, z2, null, string2, composer2, 0, 20);
            composer2 = composer;
            i3 = i4;
            z = z;
        }
        composer.endReplaceGroup();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(int i, SnapshotIntState2 snapshotIntState2) {
        snapshotIntState2.setIntValue(i);
        return Unit.INSTANCE;
    }
}
