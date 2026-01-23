package com.robinhood.android.generic.table;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: Row.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.generic.table.RowKt$GenericTableRow$1$1$2, reason: use source file name */
/* loaded from: classes10.dex */
final class Row8 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ ImmutableList<GenericChildRow<T>> $childRows;
    final /* synthetic */ ImmutableList<C2002Dp> $columnWidths;
    final /* synthetic */ Function6<T, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit> $displayCell;
    final /* synthetic */ ScrollState $horizontalScrollState;
    final /* synthetic */ Function1<GenericChildRow<?>, Unit> $onChildRowClicked;
    final /* synthetic */ float $rowHeight;

    /* JADX WARN: Multi-variable type inference failed */
    Row8(ImmutableList<GenericChildRow<T>> immutableList, Function1<? super GenericChildRow<?>, Unit> function1, ImmutableList<C2002Dp> immutableList2, float f, Function6<? super T, ? super C2002Dp, ? super C2002Dp, ? super DisplayDetails, ? super Composer, ? super Integer, Unit> function6, ScrollState scrollState) {
        this.$childRows = immutableList;
        this.$onChildRowClicked = function1;
        this.$columnWidths = immutableList2;
        this.$rowHeight = f;
        this.$displayCell = function6;
        this.$horizontalScrollState = scrollState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Modifier modifierM4893clickableXHw0xAI$default;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(70845300, i, -1, "com.robinhood.android.generic.table.GenericTableRow.<anonymous>.<anonymous>.<anonymous> (Row.kt:78)");
        }
        List list = this.$childRows;
        final Function1<GenericChildRow<?>, Unit> function1 = this.$onChildRowClicked;
        ImmutableList<C2002Dp> immutableList = this.$columnWidths;
        float f = this.$rowHeight;
        Function6<T, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit> function6 = this.$displayCell;
        ScrollState scrollState = this.$horizontalScrollState;
        Modifier.Companion companion = Modifier.INSTANCE;
        int i2 = 0;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
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
        composer2.startReplaceGroup(1250636947);
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final GenericChildRow genericChildRow = (GenericChildRow) obj;
            composer2.startReplaceGroup(1250642684);
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21372getBg20d7_KjU(), null, 2, null);
            if (function1 != null) {
                composer2.startReplaceGroup(-1633490746);
                boolean zChanged = composer2.changed(function1) | composer2.changedInstance(genericChildRow);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.generic.table.RowKt$GenericTableRow$1$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Row8.invoke$lambda$7$lambda$6$lambda$2$lambda$1$lambda$0(function1, genericChildRow);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM4872backgroundbw27NRU$default, false, null, null, (Function0) objRememberedValue, 7, null);
                if (modifierM4893clickableXHw0xAI$default == null) {
                    modifierM4893clickableXHw0xAI$default = modifierM4872backgroundbw27NRU$default;
                }
            }
            composer2.endReplaceGroup();
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, i2);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, i2);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM4893clickableXHw0xAI$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            composer2.startReplaceGroup(-2090886895);
            int i5 = 0;
            for (Object obj2 : genericChildRow.getCells()) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                GenericCell genericCell = (GenericCell) obj2;
                Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(Modifier.INSTANCE, immutableList.get(i5).getValue(), f);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM5171sizeVpY3zN4);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ScrollState scrollState2 = scrollState;
                function6.invoke(genericCell, C2002Dp.m7993boximpl(f), immutableList.get(i5), new DisplayDetails(i3, i5, false, false, scrollState2), composer2, 0);
                composer.endNode();
                composer2 = composer;
                scrollState = scrollState2;
                i5 = i6;
            }
            composer.endReplaceGroup();
            composer.endNode();
            composer2 = composer;
            i2 = 0;
            i3 = i4;
        }
        composer.endReplaceGroup();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6$lambda$2$lambda$1$lambda$0(Function1 function1, GenericChildRow genericChildRow) {
        if (function1 != null) {
            function1.invoke(genericChildRow);
        }
        return Unit.INSTANCE;
    }
}
