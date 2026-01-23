package com.robinhood.utils.compose.reorderable;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.MaterialTheme;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: ReorderableListState.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u0095\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012<\u0010\u000b\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0002\u0010\f\u001a\u00020\b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u008d\u0002\u0010'\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0018\u001a\u00020\u001726\u0010\u001c\u001a2\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00170\u00032:\b\u0002\u0010\u001e\u001a4\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00032\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2V\u0010&\u001aR\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000e0\"¢\u0006\u0002\b%¢\u0006\u0004\b'\u0010(\u001a\u000f\u0010)\u001a\u00020\u000eH\u0003¢\u0006\u0004\b)\u0010*\"\u0017\u0010+\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00064²\u0006\u000e\u0010/\u001a\u00020\u001f8\n@\nX\u008a\u008e\u0002²\u0006\u001a\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00101\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002²\u0006\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020\u00170\u00048\n@\nX\u008a\u008e\u0002²\u0006\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020\u00170\u00048\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"T", "Lkotlinx/collections/immutable/ImmutableList;", "items", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "reorderedItems", "Lkotlin/time/Duration;", "delay", "Lkotlinx/coroutines/Job;", "onReorder", "reorderDebounceDelay", "Lkotlin/Function0;", "", "onReorderStart", "onReorderFinish", "Lcom/robinhood/utils/compose/reorderable/ReorderableListState;", "rememberReorderableListState-KVH2U2I", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function2;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/utils/compose/reorderable/ReorderableListState;", "rememberReorderableListState", "Lcom/robinhood/utils/compose/reorderable/ReorderableLazyListScope;", "reorderListState", "", "keyPrefix", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "key", "", "contentType", "", "animateDisplacementOffsets", "animateItemPlacement", "Lkotlin/Function4;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "isDragItem", "Lkotlin/ExtensionFunctionType;", "itemContent", "reorderableItems", "(Lcom/robinhood/utils/compose/reorderable/ReorderableLazyListScope;Lcom/robinhood/utils/compose/reorderable/ReorderableListState;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZLkotlin/jvm/functions/Function6;)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "DefaultReorderDebounceDelay", "J", "getDefaultReorderDebounceDelay", "()J", "isReorderActive", "localItems", "reorderJob", "list1", "list2", "lib-utils-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ReorderableListStateKt {
    private static final long DefaultReorderDebounceDelay;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Preview$lambda$29$lambda$28$lambda$26(int i, String item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Preview$lambda$29$lambda$28$lambda$27(int i, String item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$30(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: rememberReorderableListState-KVH2U2I, reason: not valid java name */
    public static final <T> ReorderableListState<T> m26636rememberReorderableListStateKVH2U2I(ImmutableList<? extends T> items, final Function2<? super List<? extends T>, ? super Duration, ? extends Job> onReorder, long j, Function0<Unit> function0, Function0<Unit> function02, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onReorder, "onReorder");
        composer.startReplaceGroup(-1289934958);
        final long j2 = (i2 & 4) != 0 ? DefaultReorderDebounceDelay : j;
        final Function0<Unit> function03 = (i2 & 8) != 0 ? null : function0;
        Function0<Unit> function04 = (i2 & 16) != 0 ? null : function02;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1289934958, i, -1, "com.robinhood.utils.compose.reorderable.rememberReorderableListState (ReorderableListState.kt:76)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotState3.mutableStateOf$default(items, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
        composer.endReplaceGroup();
        Boolean boolValueOf = Boolean.valueOf(rememberReorderableListState_KVH2U2I$lambda$1(snapshotState));
        composer.startReplaceGroup(-1746271574);
        int i3 = i & 14;
        boolean z = ((i3 ^ 6) > 4 && composer.changedInstance(items)) || (i & 6) == 4;
        Object objRememberedValue3 = composer.rememberedValue();
        if (z || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new ReorderableListStateKt$rememberReorderableListState$1$1(items, snapshotState, snapshotState2, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(items, boolValueOf, (Function2) objRememberedValue3, composer, i3);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
            composer.updateRememberedValue(objRememberedValue4);
        }
        final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue4;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(objRememberedValue5);
        }
        final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue5;
        composer.endReplaceGroup();
        ImmutableList immutableListRememberReorderableListState_KVH2U2I$lambda$4 = rememberReorderableListState_KVH2U2I$lambda$4(snapshotState2);
        composer.startReplaceGroup(-1746271574);
        boolean z2 = (((i & 7168) ^ 3072) > 2048 && composer.changed(function03)) || (i & 3072) == 2048;
        Object objRememberedValue6 = composer.rememberedValue();
        if (z2 || objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new Function0() { // from class: com.robinhood.utils.compose.reorderable.ReorderableListStateKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ReorderableListStateKt.rememberReorderableListState_KVH2U2I$lambda$11$lambda$10(function03, snapshotState3, snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue6);
        }
        Function0 function05 = (Function0) objRememberedValue6;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableListStateKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReorderableListStateKt.rememberReorderableListState_KVH2U2I$lambda$13$lambda$12(snapshotState2, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue7);
        }
        Function2 function2 = (Function2) objRememberedValue7;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = ((((i & 112) ^ 48) > 32 && composer.changed(onReorder)) || (i & 48) == 32) | composer.changedInstance(coroutineScope) | ((((i & 896) ^ 384) > 256 && composer.changed(j2)) || (i & 384) == 256) | ((((57344 & i) ^ 24576) > 16384 && composer.changed(function04)) || (i & 24576) == 16384);
        Object objRememberedValue8 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue8 == companion.getEmpty()) {
            final Function0<Unit> function06 = function04;
            Object obj = new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableListStateKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ReorderableListStateKt.rememberReorderableListState_KVH2U2I$lambda$15$lambda$14(coroutineScope, snapshotState2, onReorder, j2, function06, snapshotState, snapshotState3, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue8 = obj;
        }
        composer.endReplaceGroup();
        ReorderableListState<T> reorderableListState = new ReorderableListState<>(immutableListRememberReorderableListState_KVH2U2I$lambda$4, function05, function2, (Function2) objRememberedValue8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return reorderableListState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rememberReorderableListState_KVH2U2I$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final List<String> Preview$lambda$17(SnapshotState<List<String>> snapshotState) {
        return snapshotState.getValue();
    }

    private static final List<String> Preview$lambda$20(SnapshotState<List<String>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberReorderableListState_KVH2U2I$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImmutableList rememberReorderableListState_KVH2U2I$lambda$4(SnapshotState snapshotState) {
        return (ImmutableList) snapshotState.getValue();
    }

    private static final Job rememberReorderableListState_KVH2U2I$lambda$8(SnapshotState<Job> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberReorderableListState_KVH2U2I$lambda$11$lambda$10(Function0 function0, SnapshotState snapshotState, SnapshotState snapshotState2) {
        Job jobRememberReorderableListState_KVH2U2I$lambda$8 = rememberReorderableListState_KVH2U2I$lambda$8(snapshotState);
        if (jobRememberReorderableListState_KVH2U2I$lambda$8 != null) {
            Job.DefaultImpls.cancel$default(jobRememberReorderableListState_KVH2U2I$lambda$8, null, 1, null);
        }
        rememberReorderableListState_KVH2U2I$lambda$2(snapshotState2, true);
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberReorderableListState_KVH2U2I$lambda$13$lambda$12(SnapshotState snapshotState, int i, int i2) {
        snapshotState.setValue(extensions2.toImmutableList(Reorder.reorder(rememberReorderableListState_KVH2U2I$lambda$4(snapshotState), i, i2)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberReorderableListState_KVH2U2I$lambda$15$lambda$14(CoroutineScope coroutineScope, SnapshotState snapshotState, Function2 function2, long j, Function0 function0, SnapshotState snapshotState2, SnapshotState snapshotState3, int i, int i2) {
        snapshotState.setValue(extensions2.toImmutableList(Reorder.reorder(rememberReorderableListState_KVH2U2I$lambda$4(snapshotState), i, i2)));
        snapshotState3.setValue(BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ReorderableListStateKt$rememberReorderableListState$4$1$1(function2, j, function0, snapshotState, snapshotState2, snapshotState3, null), 3, null));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void reorderableItems$default(ReorderableLazyListScope reorderableLazyListScope, ReorderableListState reorderableListState, String str, Function2 function2, Function2 function22, boolean z, boolean z2, Function6 function6, int i, Object obj) {
        if ((i & 8) != 0) {
            function22 = new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableListStateKt.reorderableItems.1
                public final Void invoke(int i2, Object obj2) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        Function2 function23 = function22;
        if ((i & 16) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = false;
        }
        reorderableItems(reorderableLazyListScope, reorderableListState, str, function2, function23, z3, z2, function6);
    }

    public static final <T> void reorderableItems(ReorderableLazyListScope reorderableLazyListScope, ReorderableListState<T> reorderListState, String keyPrefix, Function2<? super Integer, ? super T, String> key, Function2<? super Integer, ? super T, ? extends Object> contentType, boolean z, boolean z2, Function6<? super LazyItemScope, ? super T, ? super Integer, ? super Boolean, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(reorderableLazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(reorderListState, "reorderListState");
        Intrinsics.checkNotNullParameter(keyPrefix, "keyPrefix");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        ReorderableLazyListScope.DefaultImpls.reorderableItems$default(reorderableLazyListScope, reorderListState.getItems(), keyPrefix, key, contentType, reorderListState.getOnDragStart(), null, reorderListState.getOnDragFinish(), z, z2, itemContent, 32, null);
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        DefaultReorderDebounceDelay = Duration3.toDuration(0, DurationUnitJvm.SECONDS);
    }

    public static final long getDefaultReorderDebounceDelay() {
        return DefaultReorderDebounceDelay;
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-47871615);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-47871615, i, -1, "com.robinhood.utils.compose.reorderable.Preview (ReorderableListState.kt:165)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(CollectionsKt.listOf((Object[]) new String[]{"One", "Two", "Three", "Four", "Five"}), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(CollectionsKt.listOf((Object[]) new String[]{"Six", "Seven", "Eight"}), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue3;
            ImmutableList immutableList = extensions2.toImmutableList(Preview$lambda$17(snapshotState));
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableListStateKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ReorderableListStateKt.Preview$lambda$23$lambda$22(coroutineScope, snapshotState, (List) obj, (Duration) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            final ReorderableListState reorderableListStateM26636rememberReorderableListStateKVH2U2I = m26636rememberReorderableListStateKVH2U2I(immutableList, (Function2) objRememberedValue4, 0L, null, null, composerStartRestartGroup, 0, 28);
            ImmutableList immutableList2 = extensions2.toImmutableList(Preview$lambda$20(snapshotState2));
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableListStateKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ReorderableListStateKt.Preview$lambda$25$lambda$24(coroutineScope, snapshotState2, (List) obj, (Duration) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            final ReorderableListState reorderableListStateM26636rememberReorderableListStateKVH2U2I2 = m26636rememberReorderableListStateKVH2U2I(immutableList2, (Function2) objRememberedValue5, 0L, null, null, composerStartRestartGroup, 0, 28);
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m5552getBackground0d7_KjU(), null, 2, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = composerStartRestartGroup.changed(reorderableListStateM26636rememberReorderableListStateKVH2U2I) | composerStartRestartGroup.changed(reorderableListStateM26636rememberReorderableListStateKVH2U2I2);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function1() { // from class: com.robinhood.utils.compose.reorderable.ReorderableListStateKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ReorderableListStateKt.Preview$lambda$29$lambda$28(reorderableListStateM26636rememberReorderableListStateKVH2U2I, reorderableListStateM26636rememberReorderableListStateKVH2U2I2, (ReorderableLazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            ReorderableLazyColumnKt.ReorderableLazyColumn(modifierM4872backgroundbw27NRU$default, null, null, false, null, null, null, false, (Function1) objRememberedValue6, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableListStateKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReorderableListStateKt.Preview$lambda$30(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job Preview$lambda$23$lambda$22(CoroutineScope coroutineScope, SnapshotState snapshotState, List reorderedItems, Duration duration) {
        Intrinsics.checkNotNullParameter(reorderedItems, "reorderedItems");
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ReorderableListStateKt$Preview$listState1$1$1$1(reorderedItems, snapshotState, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job Preview$lambda$25$lambda$24(CoroutineScope coroutineScope, SnapshotState snapshotState, List reorderedItems, Duration duration) {
        Intrinsics.checkNotNullParameter(reorderedItems, "reorderedItems");
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ReorderableListStateKt$Preview$listState2$1$1$1(reorderedItems, snapshotState, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$29$lambda$28(ReorderableListState reorderableListState, ReorderableListState reorderableListState2, ReorderableLazyListScope ReorderableLazyColumn) {
        Intrinsics.checkNotNullParameter(ReorderableLazyColumn, "$this$ReorderableLazyColumn");
        ComposableSingletons$ReorderableListStateKt composableSingletons$ReorderableListStateKt = ComposableSingletons$ReorderableListStateKt.INSTANCE;
        LazyListScope.item$default(ReorderableLazyColumn, null, null, composableSingletons$ReorderableListStateKt.m26609getLambda$478006897$lib_utils_compose_externalDebug(), 3, null);
        LazyListScope.item$default(ReorderableLazyColumn, null, null, composableSingletons$ReorderableListStateKt.m26610getLambda$699807240$lib_utils_compose_externalDebug(), 3, null);
        reorderableItems$default(ReorderableLazyColumn, reorderableListState, "List1", new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableListStateKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ReorderableListStateKt.Preview$lambda$29$lambda$28$lambda$26(((Integer) obj).intValue(), (String) obj2);
            }
        }, null, false, false, composableSingletons$ReorderableListStateKt.m26608getLambda$1780231965$lib_utils_compose_externalDebug(), 8, null);
        LazyListScope.item$default(ReorderableLazyColumn, null, null, composableSingletons$ReorderableListStateKt.m26607getLambda$1384037545$lib_utils_compose_externalDebug(), 3, null);
        reorderableItems$default(ReorderableLazyColumn, reorderableListState2, "List2", new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableListStateKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ReorderableListStateKt.Preview$lambda$29$lambda$28$lambda$27(((Integer) obj).intValue(), (String) obj2);
            }
        }, null, false, false, composableSingletons$ReorderableListStateKt.getLambda$1992352844$lib_utils_compose_externalDebug(), 8, null);
        return Unit.INSTANCE;
    }
}
