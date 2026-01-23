package com.robinhood.android.generic.table.layout;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.generic.table.DisplayDetails;
import com.robinhood.android.generic.table.GenericCell;
import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.android.generic.table.Row7;
import com.robinhood.android.generic.table.StickyColumn;
import com.robinhood.android.generic.table.layout.GenericTableLayoutContent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: GenericTableLayout.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
final class GenericTableLayoutKt$GenericTableLayout$2$1$1$1$2$1 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ Boolean $expanded;
    final /* synthetic */ SnapshotStateMap<String, Boolean> $expandedState;
    final /* synthetic */ float $headerHeight;
    final /* synthetic */ ScrollState $horizontalScrollState;
    final /* synthetic */ GenericTableData<? extends GenericCell> $tableData;
    final /* synthetic */ TableSizing $tableSize;
    final /* synthetic */ GenericTableLayoutContent.Table<?> $this_with;

    GenericTableLayoutKt$GenericTableLayout$2$1$1$1$2$1(TableSizing tableSizing, float f, GenericTableLayoutContent.Table<?> table, GenericTableData<? extends GenericCell> genericTableData, ScrollState scrollState, Boolean bool, SnapshotStateMap<String, Boolean> snapshotStateMap) {
        this.$tableSize = tableSizing;
        this.$headerHeight = f;
        this.$this_with = table;
        this.$tableData = genericTableData;
        this.$horizontalScrollState = scrollState;
        this.$expanded = bool;
        this.$expandedState = snapshotStateMap;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope stickyHeader, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(stickyHeader, "$this$stickyHeader");
        if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-798198586, i2, -1, "com.robinhood.android.generic.table.layout.GenericTableLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GenericTableLayout.kt:144)");
        }
        ImmutableList<C2002Dp> columnWidths = this.$tableSize.getColumnWidths();
        float f = this.$headerHeight;
        Function6<GenericCell, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit> displayCell = this.$this_with.getDisplayCell();
        ImmutableList<T> headers = this.$tableData.getHeaders();
        StickyColumn stickyColumnDetails = this.$this_with.getStickyColumnDetails();
        ScrollState scrollState = this.$horizontalScrollState;
        boolean zBooleanValue = this.$expanded.booleanValue();
        composer.startReplaceGroup(-1746271574);
        boolean zChanged = composer.changed(this.$expandedState) | composer.changedInstance(this.$this_with) | composer.changed(this.$expanded);
        final SnapshotStateMap<String, Boolean> snapshotStateMap = this.$expandedState;
        final GenericTableLayoutContent.Table<?> table = this.$this_with;
        final Boolean bool = this.$expanded;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.generic.table.layout.GenericTableLayoutKt$GenericTableLayout$2$1$1$1$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GenericTableLayoutKt$GenericTableLayout$2$1$1$1$2$1.invoke$lambda$1$lambda$0(snapshotStateMap, table, bool);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Row7.m14975GenericTableRowuS7v9H0(0, columnWidths, f, displayCell, headers, stickyColumnDetails, scrollState, zBooleanValue, (Function0) objRememberedValue, null, null, false, null, composer, 6, 0, 7680);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotStateMap snapshotStateMap, GenericTableLayoutContent.Table table, Boolean bool) {
        snapshotStateMap.put(table.getTableId(), Boolean.valueOf(!bool.booleanValue()));
        return Unit.INSTANCE;
    }
}
