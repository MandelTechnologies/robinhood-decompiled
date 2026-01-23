package com.robinhood.android.futures.eventbrackets.screen.tournament.navigator;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: EventsTournamentBracketNavigator.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.EventsTournamentBracketNavigatorKt$InfiniteCircularList$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EventsTournamentBracketNavigator2 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ Alignment $contentAlignment;
    final /* synthetic */ boolean $isSelectable;
    final /* synthetic */ float $itemHalfHeight;
    final /* synthetic */ float $itemHeight;
    final /* synthetic */ int $latestSelectedIndex;
    final /* synthetic */ Function1<Integer, Unit> $onSelectedIndexChange;
    final /* synthetic */ ImmutableList<String> $options;

    /* JADX WARN: Multi-variable type inference failed */
    EventsTournamentBracketNavigator2(ImmutableList<String> immutableList, float f, float f2, int i, Function1<? super Integer, Unit> function1, Alignment alignment, boolean z) {
        this.$options = immutableList;
        this.$itemHeight = f;
        this.$itemHalfHeight = f2;
        this.$latestSelectedIndex = i;
        this.$onSelectedIndexChange = function1;
        this.$contentAlignment = alignment;
        this.$isSelectable = z;
    }

    public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
        int i3;
        long jM21373getBg30d7_KjU;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((i2 & 48) == 0) {
            i3 = i2 | (composer.changed(i) ? 32 : 16);
        } else {
            i3 = i2;
        }
        if ((i3 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1992659388, i3, -1, "com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.InfiniteCircularList.<anonymous>.<anonymous>.<anonymous> (EventsTournamentBracketNavigator.kt:218)");
        }
        final int size = i % this.$options.size();
        String str = this.$options.get(size);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, this.$itemHeight), 0.0f, 1, null);
        composer.startReplaceGroup(-1224400529);
        boolean zChanged = composer.changed(this.$itemHalfHeight) | composer.changed(this.$latestSelectedIndex) | composer.changed(size) | composer.changed(this.$onSelectedIndexChange);
        final float f = this.$itemHalfHeight;
        final int i4 = this.$latestSelectedIndex;
        final Function1<Integer, Unit> function1 = this.$onSelectedIndexChange;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.navigator.EventsTournamentBracketNavigatorKt$InfiniteCircularList$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EventsTournamentBracketNavigator2.invoke$lambda$1$lambda$0(f, i4, size, function1, (LayoutCoordinates) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierFillMaxWidth$default, (Function1) objRememberedValue);
        Alignment alignment = this.$contentAlignment;
        boolean z = this.$isSelectable;
        int i5 = this.$latestSelectedIndex;
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment, false);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierOnGloballyPositioned);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i6 = BentoTheme.$stable;
        TextStyle textM = bentoTheme.getTypography(composer, i6).getTextM();
        if (z && size == i5) {
            composer.startReplaceGroup(1738200576);
            jM21373getBg30d7_KjU = bentoTheme.getColors(composer, i6).m21425getFg0d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1738274015);
            jM21373getBg30d7_KjU = bentoTheme.getColors(composer, i6).m21373getBg30d7_KjU();
            composer.endReplaceGroup();
        }
        TextKt.m6028Text4IGK_g(str, null, jM21373getBg30d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textM, composer, 0, 0, 65530);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(float f, int i, int i2, Function1 function1, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (LayoutCoordinates2.positionInParent(coordinates) & 4294967295L)) - f;
        float fMo7241getSizeYbymL2g = (coordinates.getParentCoordinates() != null ? (int) (r10.mo7241getSizeYbymL2g() & 4294967295L) : 0) / 2.0f;
        if (fIntBitsToFloat > fMo7241getSizeYbymL2g - f && fIntBitsToFloat < fMo7241getSizeYbymL2g + f && i != i2) {
            function1.invoke(Integer.valueOf(i2));
        }
        return Unit.INSTANCE;
    }
}
