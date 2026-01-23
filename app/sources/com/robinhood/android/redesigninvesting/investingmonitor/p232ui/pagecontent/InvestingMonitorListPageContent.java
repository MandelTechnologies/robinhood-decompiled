package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.pagecontent;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.redesigninvesting.investingmonitor.model.InvestingMonitorAsset;
import com.robinhood.android.redesigninvesting.investingmonitor.model.InvestingMonitorPage;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.item.row.InvestingMonitorAssetRow;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.item.row.InvestingMonitorShimmerAssetRow;
import com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScope;
import com.robinhood.utils.compose.reorderable.ReorderableListState;
import com.robinhood.utils.compose.reorderable.ReorderableListStateKt;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: InvestingMonitorListPageContent.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a]\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032<\u0010\u0004\u001a8\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0002\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00052\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002"}, m3636d2 = {"ListPageContent", "", "page", "Lcom/robinhood/android/redesigninvesting/investingmonitor/model/InvestingMonitorPage;", "onAssetsReordered", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "", "Lcom/robinhood/android/redesigninvesting/investingmonitor/model/InvestingMonitorAsset;", "newAssetOrdered", "Lkotlinx/coroutines/Job;", "sortingInProgressListId", "Ljava/util/UUID;", "(Lcom/robinhood/android/redesigninvesting/investingmonitor/model/InvestingMonitorPage;Lkotlin/jvm/functions/Function2;Ljava/util/UUID;Landroidx/compose/runtime/Composer;I)V", "feature-investing-monitor_externalDebug", "wasSorting", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.pagecontent.InvestingMonitorListPageContentKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class InvestingMonitorListPageContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListPageContent$lambda$13(InvestingMonitorPage investingMonitorPage, Function2 function2, UUID uuid, int i, Composer composer, int i2) {
        ListPageContent(investingMonitorPage, function2, uuid, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ListPageContent(final InvestingMonitorPage page, final Function2<? super InvestingMonitorPage, ? super List<InvestingMonitorAsset>, ? extends Job> onAssetsReordered, final UUID uuid, Composer composer, final int i) {
        Object obj;
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(onAssetsReordered, "onAssetsReordered");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1039601809);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(page) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onAssetsReordered) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(uuid) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1039601809, i2, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.pagecontent.ListPageContent (InvestingMonitorListPageContent.kt:31)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            boolean zAreEqual = Intrinsics.areEqual(uuid, page.getCuratedList().getId());
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            int i3 = i2;
            ImmutableList3<InvestingMonitorAsset> assets = page.getAssets();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(page);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.pagecontent.InvestingMonitorListPageContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return InvestingMonitorListPageContent.ListPageContent$lambda$4$lambda$3(onAssetsReordered, page, (List) obj2, (Duration) obj3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            final ReorderableListState reorderableListStateM26636rememberReorderableListStateKVH2U2I = ReorderableListStateKt.m26636rememberReorderableListStateKVH2U2I(assets, (Function2) objRememberedValue2, Duration.INSTANCE.m28767getZEROUwyO8pc(), null, null, composerStartRestartGroup, 0, 24);
            Boolean boolValueOf = Boolean.valueOf(zAreEqual);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChanged = composerStartRestartGroup.changed(zAreEqual) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new InvestingMonitorListPageContent2(zAreEqual, lazyListStateRememberLazyListState, snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            ImmutableList3<InvestingMonitorAsset> assets2 = page.getAssets();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged2 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                obj = null;
                objRememberedValue4 = new InvestingMonitorListPageContent3(lazyListStateRememberLazyListState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                obj = null;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(assets2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
            if (zAreEqual) {
                composerStartRestartGroup.startReplaceGroup(232794423);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, obj);
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1161164373);
                for (int i4 = 0; i4 < 10; i4++) {
                    InvestingMonitorShimmerAssetRow.InvestingMonitorShimmerAssetRow(null, composerStartRestartGroup, 0, 1);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(233095154);
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChanged3 = composerStartRestartGroup.changed(reorderableListStateM26636rememberReorderableListStateKVH2U2I) | composerStartRestartGroup.changedInstance(page);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.pagecontent.InvestingMonitorListPageContentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return InvestingMonitorListPageContent.ListPageContent$lambda$12$lambda$11(reorderableListStateM26636rememberReorderableListStateKVH2U2I, page, (ReorderableLazyListScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                ReorderableLazyColumnKt.ReorderableLazyColumn(modifierFillMaxSize$default3, lazyListStateRememberLazyListState, null, false, null, null, null, false, (Function1) objRememberedValue5, composerStartRestartGroup, 6, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.pagecontent.InvestingMonitorListPageContentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return InvestingMonitorListPageContent.ListPageContent$lambda$13(page, onAssetsReordered, uuid, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ListPageContent$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job ListPageContent$lambda$4$lambda$3(Function2 function2, InvestingMonitorPage investingMonitorPage, List newAssetOrdered, Duration duration) {
        Intrinsics.checkNotNullParameter(newAssetOrdered, "newAssetOrdered");
        return (Job) function2.invoke(investingMonitorPage, newAssetOrdered);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListPageContent$lambda$12$lambda$11(ReorderableListState reorderableListState, final InvestingMonitorPage investingMonitorPage, ReorderableLazyListScope ReorderableLazyColumn) {
        Intrinsics.checkNotNullParameter(ReorderableLazyColumn, "$this$ReorderableLazyColumn");
        ReorderableListStateKt.reorderableItems$default(ReorderableLazyColumn, reorderableListState, "monitor-row", new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.pagecontent.InvestingMonitorListPageContentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return InvestingMonitorListPageContent.ListPageContent$lambda$12$lambda$11$lambda$10(((Integer) obj).intValue(), (InvestingMonitorAsset) obj2);
            }
        }, null, false, false, ComposableLambda3.composableLambdaInstance(795099079, true, new Function6<LazyItemScope, InvestingMonitorAsset, Integer, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.pagecontent.InvestingMonitorListPageContentKt$ListPageContent$4$1$2
            @Override // kotlin.jvm.functions.Function6
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, InvestingMonitorAsset investingMonitorAsset, Integer num, Boolean bool, Composer composer, Integer num2) {
                invoke(lazyItemScope, investingMonitorAsset, num.intValue(), bool.booleanValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope reorderableItems, InvestingMonitorAsset asset, int i, boolean z, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(reorderableItems, "$this$reorderableItems");
                Intrinsics.checkNotNullParameter(asset, "asset");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(795099079, i2, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.pagecontent.ListPageContent.<anonymous>.<anonymous>.<anonymous> (InvestingMonitorListPageContent.kt:80)");
                }
                InvestingMonitorAssetRow.InvestingMonitorAssetRow(asset, z, i, investingMonitorPage.getAssets().size(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, ((i2 >> 3) & 14) | 24576 | ((i2 >> 6) & 112) | (i2 & 896), 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 56, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ListPageContent$lambda$12$lambda$11$lambda$10(int i, InvestingMonitorAsset asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        return String.valueOf(asset.getMetadataId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ListPageContent$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
