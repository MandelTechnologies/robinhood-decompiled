package com.robinhood.android.generic.table;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: GenericTable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
final class GenericTableKt$GenericTable$4$1$1$1$1 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<ImmutableList<C2002Dp>> $columnWidths$delegate;
    final /* synthetic */ Function6<T, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit> $displayCell;
    final /* synthetic */ SnapshotState4<C2002Dp> $headerHeight$delegate;
    final /* synthetic */ ScrollState $horizontalScrollState;
    final /* synthetic */ StickyColumn $stickyColumnDetails;
    final /* synthetic */ SnapshotState<Boolean> $stickyColumnExpanded$delegate;
    final /* synthetic */ GenericTableData<T> $tableData;

    /* JADX WARN: Multi-variable type inference failed */
    GenericTableKt$GenericTable$4$1$1$1$1(Function6<? super T, ? super C2002Dp, ? super C2002Dp, ? super DisplayDetails, ? super Composer, ? super Integer, Unit> function6, GenericTableData<T> genericTableData, StickyColumn stickyColumn, ScrollState scrollState, SnapshotState<ImmutableList<C2002Dp>> snapshotState, SnapshotState4<C2002Dp> snapshotState4, SnapshotState<Boolean> snapshotState2) {
        this.$displayCell = function6;
        this.$tableData = genericTableData;
        this.$stickyColumnDetails = stickyColumn;
        this.$horizontalScrollState = scrollState;
        this.$columnWidths$delegate = snapshotState;
        this.$headerHeight$delegate = snapshotState4;
        this.$stickyColumnExpanded$delegate = snapshotState2;
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
            ComposerKt.traceEventStart(-1777455410, i2, -1, "com.robinhood.android.generic.table.GenericTable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GenericTable.kt:142)");
        }
        ImmutableList immutableListGenericTable_9SxZPhU$lambda$2 = GenericTableKt.GenericTable_9SxZPhU$lambda$2(this.$columnWidths$delegate);
        float fGenericTable_9SxZPhU$lambda$9 = GenericTableKt.GenericTable_9SxZPhU$lambda$9(this.$headerHeight$delegate);
        Function6<T, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit> function6 = this.$displayCell;
        ImmutableList headers = this.$tableData.getHeaders();
        StickyColumn stickyColumn = this.$stickyColumnDetails;
        ScrollState scrollState = this.$horizontalScrollState;
        boolean zGenericTable_9SxZPhU$lambda$15 = GenericTableKt.GenericTable_9SxZPhU$lambda$15(this.$stickyColumnExpanded$delegate);
        composer.startReplaceGroup(5004770);
        final SnapshotState<Boolean> snapshotState = this.$stickyColumnExpanded$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.generic.table.GenericTableKt$GenericTable$4$1$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GenericTableKt$GenericTable$4$1$1$1$1.invoke$lambda$1$lambda$0(snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Row7.m14975GenericTableRowuS7v9H0(0, immutableListGenericTable_9SxZPhU$lambda$2, fGenericTable_9SxZPhU$lambda$9, function6, headers, stickyColumn, scrollState, zGenericTable_9SxZPhU$lambda$15, (Function0) objRememberedValue, null, null, false, null, composer, 100663302, 0, 7680);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
        GenericTableKt.GenericTable_9SxZPhU$lambda$16(snapshotState, !GenericTableKt.GenericTable_9SxZPhU$lambda$15(snapshotState));
        return Unit.INSTANCE;
    }
}
