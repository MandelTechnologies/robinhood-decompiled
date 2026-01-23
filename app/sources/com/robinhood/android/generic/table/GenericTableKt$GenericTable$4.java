package com.robinhood.android.generic.table;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GenericTable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
final class GenericTableKt$GenericTable$4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ boolean $animateItemPlacement;
    final /* synthetic */ SnapshotState<ImmutableList<C2002Dp>> $columnWidths$delegate;
    final /* synthetic */ Function6<T, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit> $displayCell;
    final /* synthetic */ Function3<Column5, Composer, Integer, Unit> $footerContent;
    final /* synthetic */ SnapshotState4<C2002Dp> $headerHeight$delegate;
    final /* synthetic */ ScrollState $horizontalScrollState;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<GenericRow<T>, Unit> $onRowClicked;
    final /* synthetic */ SnapshotState<C2002Dp> $rowHeight$delegate;
    final /* synthetic */ SnapshotState4<List<GenericRow<T>>> $rowsToDisplay$delegate;
    final /* synthetic */ StickyColumn $stickyColumnDetails;
    final /* synthetic */ SnapshotState<Boolean> $stickyColumnExpanded$delegate;
    final /* synthetic */ GenericTableData<T> $tableData;
    final /* synthetic */ LazyListState $verticalScrollState;

    /* JADX WARN: Multi-variable type inference failed */
    GenericTableKt$GenericTable$4(Modifier modifier, LazyListState lazyListState, SnapshotState4<C2002Dp> snapshotState4, Function6<? super T, ? super C2002Dp, ? super C2002Dp, ? super DisplayDetails, ? super Composer, ? super Integer, Unit> function6, GenericTableData<T> genericTableData, StickyColumn stickyColumn, ScrollState scrollState, SnapshotState4<? extends List<GenericRow<T>>> snapshotState42, boolean z, Function1<? super GenericRow<T>, Unit> function1, Function3<? super Column5, ? super Composer, ? super Integer, Unit> function3, SnapshotState<ImmutableList<C2002Dp>> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState<C2002Dp> snapshotState3) {
        this.$modifier = modifier;
        this.$verticalScrollState = lazyListState;
        this.$headerHeight$delegate = snapshotState4;
        this.$displayCell = function6;
        this.$tableData = genericTableData;
        this.$stickyColumnDetails = stickyColumn;
        this.$horizontalScrollState = scrollState;
        this.$rowsToDisplay$delegate = snapshotState42;
        this.$animateItemPlacement = z;
        this.$onRowClicked = function1;
        this.$footerContent = function3;
        this.$columnWidths$delegate = snapshotState;
        this.$stickyColumnExpanded$delegate = snapshotState2;
        this.$rowHeight$delegate = snapshotState3;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2128826377, i, -1, "com.robinhood.android.generic.table.GenericTable.<anonymous> (GenericTable.kt:132)");
        }
        Modifier modifier = this.$modifier;
        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
        Alignment.Horizontal start = Alignment.INSTANCE.getStart();
        LazyListState lazyListState = this.$verticalScrollState;
        final SnapshotState4<C2002Dp> snapshotState4 = this.$headerHeight$delegate;
        final Function6<T, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit> function6 = this.$displayCell;
        final GenericTableData<T> genericTableData = this.$tableData;
        final StickyColumn stickyColumn = this.$stickyColumnDetails;
        final ScrollState scrollState = this.$horizontalScrollState;
        final SnapshotState4<List<GenericRow<T>>> snapshotState42 = this.$rowsToDisplay$delegate;
        final boolean z = this.$animateItemPlacement;
        final Function1<GenericRow<T>, Unit> function1 = this.$onRowClicked;
        final Function3<Column5, Composer, Integer, Unit> function3 = this.$footerContent;
        final SnapshotState<ImmutableList<C2002Dp>> snapshotState = this.$columnWidths$delegate;
        final SnapshotState<Boolean> snapshotState2 = this.$stickyColumnExpanded$delegate;
        final SnapshotState<C2002Dp> snapshotState3 = this.$rowHeight$delegate;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, start, composer, 54);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifier);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        final Column6 column6 = Column6.INSTANCE;
        composer.startReplaceGroup(-1224400529);
        boolean zChanged = composer.changed(snapshotState4) | composer.changed(function6) | composer.changedInstance(genericTableData) | composer.changedInstance(stickyColumn) | composer.changed(scrollState) | composer.changed(snapshotState42) | composer.changed(z) | composer.changed(function1) | composer.changed(function3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function1() { // from class: com.robinhood.android.generic.table.GenericTableKt$GenericTable$4$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return GenericTableKt$GenericTable$4.invoke$lambda$9$lambda$8$lambda$7(function3, function6, genericTableData, stickyColumn, scrollState, snapshotState, snapshotState4, snapshotState2, snapshotState42, z, function1, snapshotState3, column6, (LazyListScope) obj2);
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue = obj;
        }
        composer.endReplaceGroup();
        LazyDslKt.LazyColumn(null, lazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 509);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8$lambda$7(final Function3 function3, final Function6 function6, GenericTableData genericTableData, final StickyColumn stickyColumn, final ScrollState scrollState, final SnapshotState snapshotState, SnapshotState4 snapshotState4, final SnapshotState snapshotState2, SnapshotState4 snapshotState42, final boolean z, final Function1 function1, final SnapshotState snapshotState3, final Column5 column5, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.stickyHeader$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1777455410, true, new GenericTableKt$GenericTable$4$1$1$1$1(function6, genericTableData, stickyColumn, scrollState, snapshotState, snapshotState4, snapshotState2)), 3, null);
        final List listGenericTable_9SxZPhU$lambda$13 = GenericTableKt.GenericTable_9SxZPhU$lambda$13(snapshotState42);
        final Function2 function2 = new Function2() { // from class: com.robinhood.android.generic.table.GenericTableKt$GenericTable$4$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return GenericTableKt$GenericTable$4.invoke$lambda$9$lambda$8$lambda$7$lambda$0(((Integer) obj).intValue(), (GenericRow) obj2);
            }
        };
        LazyColumn.items(listGenericTable_9SxZPhU$lambda$13.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.generic.table.GenericTableKt$GenericTable$4$invoke$lambda$9$lambda$8$lambda$7$$inlined$itemsIndexed$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function2.invoke(Integer.valueOf(i), listGenericTable_9SxZPhU$lambda$13.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.generic.table.GenericTableKt$GenericTable$4$invoke$lambda$9$lambda$8$lambda$7$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                listGenericTable_9SxZPhU$lambda$13.get(i);
                return null;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.generic.table.GenericTableKt$GenericTable$4$invoke$lambda$9$lambda$8$lambda$7$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:40:0x00e0  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                Modifier modifier;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                Object obj = listGenericTable_9SxZPhU$lambda$13.get(i);
                int i4 = i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                final GenericRow genericRow = (GenericRow) obj;
                composer.startReplaceGroup(919079949);
                ImmutableList immutableListGenericTable_9SxZPhU$lambda$2 = GenericTableKt.GenericTable_9SxZPhU$lambda$2(snapshotState);
                float fGenericTable_9SxZPhU$lambda$5 = GenericTableKt.GenericTable_9SxZPhU$lambda$5(snapshotState3);
                ImmutableList immutableList = extensions2.toImmutableList(genericRow.getCells());
                ImmutableList immutableList2 = extensions2.toImmutableList(genericRow.getChildRows());
                boolean rowExpanded = genericRow.getRowExpanded();
                composer.startReplaceGroup(1969330159);
                Modifier modifierZIndex = ZIndexModifier2.zIndex(Modifier.INSTANCE, 0.0f);
                if (z) {
                    modifierZIndex = LazyItemScope.animateItem$default(lazyItemScope, modifierZIndex, null, null, null, 7, null);
                }
                Modifier modifier2 = modifierZIndex;
                final Function1 function12 = function1;
                if (function12 != null) {
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged = composer.changed(function12) | composer.changedInstance(genericRow);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.generic.table.GenericTableKt$GenericTable$4$1$1$1$3$2$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function12.invoke(genericRow);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier2, false, null, null, (Function0) objRememberedValue, 7, null);
                    modifier = modifierM4893clickableXHw0xAI$default == null ? modifier2 : modifierM4893clickableXHw0xAI$default;
                }
                composer.endReplaceGroup();
                boolean zGenericTable_9SxZPhU$lambda$15 = GenericTableKt.GenericTable_9SxZPhU$lambda$15(snapshotState2);
                Function6 function62 = function6;
                StickyColumn stickyColumn2 = stickyColumn;
                ScrollState scrollState2 = scrollState;
                composer.startReplaceGroup(5004770);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final SnapshotState snapshotState5 = snapshotState2;
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.robinhood.android.generic.table.GenericTableKt$GenericTable$4$1$1$1$3$3$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            GenericTableKt.GenericTable_9SxZPhU$lambda$16(snapshotState5, !GenericTableKt.GenericTable_9SxZPhU$lambda$15(r0));
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                Row7.m14975GenericTableRowuS7v9H0(i, immutableListGenericTable_9SxZPhU$lambda$2, fGenericTable_9SxZPhU$lambda$5, function62, immutableList, stickyColumn2, scrollState2, zGenericTable_9SxZPhU$lambda$15, (Function0) objRememberedValue2, modifier, immutableList2, rowExpanded, null, composer, ((i4 >> 3) & 14) | 100663296, 0, 4096);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (function3 != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-446176663, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.generic.table.GenericTableKt$GenericTable$4$1$1$1$4$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-446176663, i, -1, "com.robinhood.android.generic.table.GenericTable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GenericTable.kt:186)");
                    }
                    function3.invoke(column5, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invoke$lambda$9$lambda$8$lambda$7$lambda$0(int i, GenericRow row) {
        Intrinsics.checkNotNullParameter(row, "row");
        return row.getKey();
    }
}
