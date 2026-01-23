package com.robinhood.shared.portfolio.lists.p391ui;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.common.portfolio.position.SwipeAnimationPreview;
import com.robinhood.android.common.portfolio.unified.DisplayType;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListDuxo7;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListState;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListViewState;
import com.robinhood.shared.portfolio.lists.p391ui.UtilsKt;
import com.robinhood.shared.portfolio.lists.p391ui.bottomsheet.ReorderCuratedListBottomSheet3;
import com.robinhood.utils.compose.reorderable.ReorderableListState;
import com.robinhood.utils.compose.reorderable.ReorderableListStateKt;
import com.robinhood.utils.resource.StringResource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.time.Duration;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.Job;

/* compiled from: Utils.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010\r\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, m3636d2 = {"streamAndRememberCuratedListState", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListState;", "accountNumber", "", "curatedListDuxo", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDuxo;", "shouldShowListRows", "", "source", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListSource;", "(Ljava/lang/String;Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDuxo;ZLcom/robinhood/shared/portfolio/lists/ui/CuratedListSource;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/shared/portfolio/lists/ui/CuratedListState;", "lib-lists-ui_externalDebug", "showHeaderReorderBottomSheet", "showErrorAlert", "errorAlertTitle", "viewState", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class UtilsKt {
    public static final CuratedListState streamAndRememberCuratedListState(final String str, CuratedListDuxo curatedListDuxo, boolean z, CuratedListSource curatedListSource, Composer composer, int i, int i2) {
        final CuratedListDuxo curatedListDuxo2;
        final SnapshotState snapshotState;
        SnapshotState snapshotState2;
        final SnapshotState snapshotState3;
        CuratedListState loaded;
        SnapshotState snapshotState4;
        SnapshotState snapshotState5;
        int i3;
        final SnapshotState snapshotState6;
        composer.startReplaceGroup(-959284064);
        int i4 = -1633490746;
        if ((i2 & 2) != 0) {
            composer.startReplaceGroup(-747520797);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CuratedListDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 0, 0);
            composer.endReplaceableGroup();
            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
            final Lifecycle lifecycle = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(baseDuxo) | composer.changedInstance(lifecycle);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.portfolio.lists.ui.UtilsKt$streamAndRememberCuratedListState$$inlined$duxo$1
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                        lifecycle.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle2 = lifecycle;
                        return new DisposableEffectResult() { // from class: com.robinhood.shared.portfolio.lists.ui.UtilsKt$streamAndRememberCuratedListState$$inlined$duxo$1.1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                lifecycle2.removeObserver(duxoLifecycleObserver);
                            }
                        };
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, 0);
            composer.endReplaceGroup();
            curatedListDuxo2 = (CuratedListDuxo) baseDuxo;
        } else {
            curatedListDuxo2 = curatedListDuxo;
        }
        final boolean z2 = (i2 & 4) != 0 ? true : z;
        final CuratedListSource curatedListSource2 = (i2 & 8) != 0 ? CuratedListSource.UNSPECIFIED : curatedListSource;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-959284064, i, -1, "com.robinhood.shared.portfolio.lists.ui.streamAndRememberCuratedListState (Utils.kt:41)");
        }
        Boolean boolValueOf = Boolean.valueOf(z2);
        composer.startReplaceGroup(-1224400529);
        int i5 = i & 14;
        int i6 = i5 ^ 6;
        boolean zChangedInstance2 = composer.changedInstance(curatedListDuxo2) | ((i6 > 4 && composer.changed(str)) || (i & 6) == 4) | ((((i & 896) ^ 384) > 256 && composer.changed(z2)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(curatedListSource2.ordinal())) || (i & 3072) == 2048);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.UtilsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UtilsKt.streamAndRememberCuratedListState$lambda$2$lambda$1(curatedListDuxo2, str, z2, curatedListSource2, (LifecycleResumePauseEffectScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        int i7 = i >> 3;
        LifecycleEffectKt.LifecycleResumeEffect(str, boolValueOf, curatedListSource2, null, (Function1) objRememberedValue2, composer, (i7 & 896) | (i7 & 112) | i5, 8);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        SnapshotState snapshotState7 = (SnapshotState) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue4);
        }
        SnapshotState snapshotState8 = (SnapshotState) objRememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = SnapshotState3.mutableStateOf$default("", null, 2, null);
            composer.updateRememberedValue(objRememberedValue5);
        }
        final SnapshotState snapshotState9 = (SnapshotState) objRememberedValue5;
        composer.endReplaceGroup();
        LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer, 0, 3);
        final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        CuratedListViewState curatedListViewStateStreamAndRememberCuratedListState$lambda$12 = streamAndRememberCuratedListState$lambda$12(FlowExtKt.collectAsStateWithLifecycle(curatedListDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7));
        composer.startReplaceGroup(1546018197);
        if (curatedListViewStateStreamAndRememberCuratedListState$lambda$12 instanceof CuratedListViewState.Loading) {
            loaded = CuratedListState.Loading.INSTANCE;
            snapshotState5 = snapshotState8;
            snapshotState2 = snapshotState9;
            snapshotState4 = snapshotState7;
        } else {
            if (!(curatedListViewStateStreamAndRememberCuratedListState$lambda$12 instanceof CuratedListViewState.Loaded)) {
                throw new NoWhenBranchMatchedException();
            }
            CuratedListViewState.Loaded loaded2 = (CuratedListViewState.Loaded) curatedListViewStateStreamAndRememberCuratedListState$lambda$12;
            ImmutableList<CuratedListDuxo7> curatedList = loaded2.getCuratedList();
            long jM28767getZEROUwyO8pc = Duration.INSTANCE.m28767getZEROUwyO8pc();
            ImmutableList<CuratedListDuxo7> curatedList2 = loaded2.getCuratedList();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(curatedListDuxo2);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function2() { // from class: com.robinhood.shared.portfolio.lists.ui.UtilsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UtilsKt.streamAndRememberCuratedListState$lambda$14$lambda$13(curatedListDuxo2, (List) obj, (Duration) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            ReorderableListState reorderableListStateM26636rememberReorderableListStateKVH2U2I = ReorderableListStateKt.m26636rememberReorderableListStateKVH2U2I(curatedList2, (Function2) objRememberedValue6, jM28767getZEROUwyO8pc, null, null, composer, 0, 24);
            Composer composer2 = composer;
            composer2.startReplaceGroup(1546040642);
            ImmutableList<CuratedListDuxo7> curatedList3 = loaded2.getCuratedList();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(curatedList3, 10)), 16));
            for (final CuratedListDuxo7 curatedListDuxo7 : curatedList3) {
                UUID id = curatedListDuxo7.getId();
                long jM28767getZEROUwyO8pc2 = Duration.INSTANCE.m28767getZEROUwyO8pc();
                ImmutableList immutableList = extensions2.toImmutableList(curatedListDuxo7 instanceof CuratedListDuxo7.WatchlistItem ? ((CuratedListDuxo7.WatchlistItem) curatedListDuxo7).getWatchlistItems() : CollectionsKt.emptyList());
                composer2.startReplaceGroup(i4);
                boolean zChangedInstance4 = composer2.changedInstance(curatedListDuxo2) | composer2.changedInstance(curatedListDuxo7);
                Object objRememberedValue7 = composer2.rememberedValue();
                if (zChangedInstance4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function2() { // from class: com.robinhood.shared.portfolio.lists.ui.UtilsKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return UtilsKt.streamAndRememberCuratedListState$lambda$17$lambda$16$lambda$15(curatedListDuxo2, curatedListDuxo7, (List) obj, (Duration) obj2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceGroup();
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                Tuples2 tuples2M3642to = Tuples4.m3642to(id, ReorderableListStateKt.m26636rememberReorderableListStateKVH2U2I(immutableList, (Function2) objRememberedValue7, jM28767getZEROUwyO8pc2, null, null, composer, 0, 24));
                linkedHashMap2.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                composer2 = composer;
                linkedHashMap = linkedHashMap2;
                i4 = -1633490746;
            }
            LinkedHashMap linkedHashMap3 = linkedHashMap;
            Composer composer3 = composer2;
            composer3.endReplaceGroup();
            Map<UUID, DisplayType> curatedListViewModes = loaded2.getCuratedListViewModes();
            composer3.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composer3.changedInstance(curatedListDuxo2);
            Object objRememberedValue8 = composer3.rememberedValue();
            if (zChangedInstance5 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new UtilsKt$streamAndRememberCuratedListState$state$3$1(curatedListDuxo2);
                composer3.updateRememberedValue(objRememberedValue8);
            }
            KFunction kFunction = (KFunction) objRememberedValue8;
            composer3.endReplaceGroup();
            composer3.startReplaceGroup(5004770);
            boolean zChangedInstance6 = composer3.changedInstance(curatedListDuxo2);
            Object objRememberedValue9 = composer3.rememberedValue();
            if (zChangedInstance6 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new UtilsKt$streamAndRememberCuratedListState$state$4$1(curatedListDuxo2);
                composer3.updateRememberedValue(objRememberedValue9);
            }
            KFunction kFunction2 = (KFunction) objRememberedValue9;
            composer3.endReplaceGroup();
            boolean zIsSwipeToBuyEnabled = loaded2.isSwipeToBuyEnabled();
            SwipeAnimationPreview swipeAnimationPreview = loaded2.getSwipeAnimationPreview();
            composer3.startReplaceGroup(5004770);
            boolean zChangedInstance7 = composer3.changedInstance(curatedListDuxo2);
            Object objRememberedValue10 = composer3.rememberedValue();
            if (zChangedInstance7 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue10 = new UtilsKt$streamAndRememberCuratedListState$state$5$1(curatedListDuxo2);
                composer3.updateRememberedValue(objRememberedValue10);
            }
            KFunction kFunction3 = (KFunction) objRememberedValue10;
            composer3.endReplaceGroup();
            composer3.startReplaceGroup(5004770);
            boolean zChangedInstance8 = composer3.changedInstance(curatedListDuxo2);
            Object objRememberedValue11 = composer3.rememberedValue();
            if (zChangedInstance8 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue11 = new UtilsKt$streamAndRememberCuratedListState$state$6$1(curatedListDuxo2);
                composer3.updateRememberedValue(objRememberedValue11);
            }
            KFunction kFunction4 = (KFunction) objRememberedValue11;
            composer3.endReplaceGroup();
            StringResource swipeTooltip = loaded2.getSwipeTooltip();
            composer3.startReplaceGroup(5004770);
            boolean zChangedInstance9 = composer3.changedInstance(curatedListDuxo2);
            Object objRememberedValue12 = composer3.rememberedValue();
            if (zChangedInstance9 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue12 = new UtilsKt$streamAndRememberCuratedListState$state$7$1(curatedListDuxo2);
                composer3.updateRememberedValue(objRememberedValue12);
            }
            KFunction kFunction5 = (KFunction) objRememberedValue12;
            composer3.endReplaceGroup();
            composer3.startReplaceGroup(5004770);
            boolean zChangedInstance10 = composer3.changedInstance(curatedListDuxo2);
            Object objRememberedValue13 = composer3.rememberedValue();
            if (zChangedInstance10 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue13 = new UtilsKt$streamAndRememberCuratedListState$state$8$1(curatedListDuxo2);
                composer3.updateRememberedValue(objRememberedValue13);
            }
            KFunction kFunction6 = (KFunction) objRememberedValue13;
            composer3.endReplaceGroup();
            composer3.startReplaceGroup(5004770);
            boolean zChangedInstance11 = composer3.changedInstance(curatedListDuxo2);
            Object objRememberedValue14 = composer3.rememberedValue();
            if (zChangedInstance11 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue14 = new Function2() { // from class: com.robinhood.shared.portfolio.lists.ui.UtilsKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UtilsKt.streamAndRememberCuratedListState$lambda$25$lambda$24(curatedListDuxo2, (UUID) obj, ((Boolean) obj2).booleanValue());
                    }
                };
                composer3.updateRememberedValue(objRememberedValue14);
            }
            Function2 function2 = (Function2) objRememberedValue14;
            composer3.endReplaceGroup();
            Function2 function22 = (Function2) kFunction;
            Function2 function23 = (Function2) kFunction2;
            composer3.startReplaceGroup(-1224400529);
            boolean zChangedInstance12 = composer3.changedInstance(curatedListDuxo2) | ((i6 > 4 && composer3.changed(str)) || (i & 6) == 4) | composer3.changedInstance(context);
            Object objRememberedValue15 = composer3.rememberedValue();
            if (zChangedInstance12 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                final CuratedListDuxo curatedListDuxo3 = curatedListDuxo2;
                snapshotState = snapshotState8;
                Object obj = new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.UtilsKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return UtilsKt.streamAndRememberCuratedListState$lambda$28$lambda$27(curatedListDuxo3, str, context, snapshotState9, snapshotState, (CuratedListItem) obj2);
                    }
                };
                snapshotState2 = snapshotState9;
                composer3.updateRememberedValue(obj);
                objRememberedValue15 = obj;
            } else {
                snapshotState = snapshotState8;
                snapshotState2 = snapshotState9;
            }
            Function1 function1 = (Function1) objRememberedValue15;
            composer3.endReplaceGroup();
            composer3.startReplaceGroup(5004770);
            Object objRememberedValue16 = composer3.rememberedValue();
            if (objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                snapshotState3 = snapshotState7;
                objRememberedValue16 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.UtilsKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UtilsKt.streamAndRememberCuratedListState$lambda$30$lambda$29(snapshotState3);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue16);
            } else {
                snapshotState3 = snapshotState7;
            }
            composer3.endReplaceGroup();
            snapshotState4 = snapshotState3;
            snapshotState5 = snapshotState;
            loaded = new CuratedListState.Loaded(reorderableListStateM26636rememberReorderableListStateKVH2U2I, curatedListViewModes, function2, function22, function23, function1, linkedHashMap3, curatedList, (Function0) objRememberedValue16, str, zIsSwipeToBuyEnabled, swipeAnimationPreview, (Function0) kFunction3, (Function0) kFunction4, swipeTooltip, (Function0) kFunction5, (Function0) kFunction6);
        }
        CuratedListState curatedListState = loaded;
        composer.endReplaceGroup();
        Composer composer4 = composer;
        composer4.startReplaceGroup(1546121625);
        if ((curatedListState instanceof CuratedListState.Loaded) && streamAndRememberCuratedListState$lambda$4(snapshotState4)) {
            i3 = 5004770;
            composer4.startReplaceGroup(5004770);
            Object objRememberedValue17 = composer4.rememberedValue();
            if (objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                final SnapshotState snapshotState10 = snapshotState4;
                objRememberedValue17 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.UtilsKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UtilsKt.streamAndRememberCuratedListState$lambda$32$lambda$31(snapshotState10);
                    }
                };
                composer4.updateRememberedValue(objRememberedValue17);
            }
            composer4.endReplaceGroup();
            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue17, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(2008396756, true, new C394233(curatedListState, lazyListStateRememberLazyListState), composer4, 54), composer, 1572870, 62);
            composer4 = composer;
        } else {
            i3 = 5004770;
        }
        composer4.endReplaceGroup();
        if (streamAndRememberCuratedListState$lambda$7(snapshotState5)) {
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer4.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.ALERT, "watchlist_swipe_to_trade_alert", null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierAutoLogEvents$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer4.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor);
            } else {
                composer4.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(C39419R.string.watchlist_buy_error_alert_title, composer4, 0);
            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(streamAndRememberCuratedListState$lambda$10(snapshotState2));
            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_okay, composer4, 0);
            composer4.startReplaceGroup(i3);
            Object objRememberedValue18 = composer4.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue18 == companion3.getEmpty()) {
                snapshotState6 = snapshotState5;
                objRememberedValue18 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.UtilsKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UtilsKt.streamAndRememberCuratedListState$lambda$37$lambda$34$lambda$33(snapshotState6);
                    }
                };
                composer4.updateRememberedValue(objRememberedValue18);
            } else {
                snapshotState6 = snapshotState5;
            }
            composer4.endReplaceGroup();
            BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue18);
            composer4.startReplaceGroup(i3);
            Object objRememberedValue19 = composer4.rememberedValue();
            if (objRememberedValue19 == companion3.getEmpty()) {
                objRememberedValue19 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.UtilsKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UtilsKt.streamAndRememberCuratedListState$lambda$37$lambda$36$lambda$35(snapshotState6);
                    }
                };
                composer4.updateRememberedValue(objRememberedValue19);
            }
            composer4.endReplaceGroup();
            BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, null, null, false, null, (Function0) objRememberedValue19, composer, (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296 | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            composer.endNode();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return curatedListState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult streamAndRememberCuratedListState$lambda$2$lambda$1(CuratedListDuxo curatedListDuxo, String str, boolean z, CuratedListSource curatedListSource, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = curatedListDuxo.bind(str, z, curatedListSource);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.shared.portfolio.lists.ui.UtilsKt$streamAndRememberCuratedListState$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    private static final void streamAndRememberCuratedListState$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void streamAndRememberCuratedListState$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job streamAndRememberCuratedListState$lambda$14$lambda$13(CuratedListDuxo curatedListDuxo, List reorderedItems, Duration duration) {
        Intrinsics.checkNotNullParameter(reorderedItems, "reorderedItems");
        return curatedListDuxo.onReorderFinished$lib_lists_ui_externalDebug(reorderedItems);
    }

    private static final String streamAndRememberCuratedListState$lambda$10(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final CuratedListViewState streamAndRememberCuratedListState$lambda$12(SnapshotState4<? extends CuratedListViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean streamAndRememberCuratedListState$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean streamAndRememberCuratedListState$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job streamAndRememberCuratedListState$lambda$17$lambda$16$lambda$15(CuratedListDuxo curatedListDuxo, CuratedListDuxo7 curatedListDuxo7, List reorderedItems, Duration duration) {
        Intrinsics.checkNotNullParameter(reorderedItems, "reorderedItems");
        Intrinsics.checkNotNull(curatedListDuxo7, "null cannot be cast to non-null type com.robinhood.shared.portfolio.lists.ui.UiCuratedListItem.WatchlistItem");
        return curatedListDuxo.m25596onWatchlistItemsReorderedSxA4cEA$lib_lists_ui_externalDebug(((CuratedListDuxo7.WatchlistItem) curatedListDuxo7).getWatchlist(), reorderedItems, duration.getRawValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit streamAndRememberCuratedListState$lambda$25$lambda$24(CuratedListDuxo curatedListDuxo, UUID watchlistId, boolean z) {
        Intrinsics.checkNotNullParameter(watchlistId, "watchlistId");
        curatedListDuxo.onWatchlistExpandToggle(watchlistId, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit streamAndRememberCuratedListState$lambda$30$lambda$29(SnapshotState snapshotState) {
        streamAndRememberCuratedListState$lambda$5(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit streamAndRememberCuratedListState$lambda$28$lambda$27(CuratedListDuxo curatedListDuxo, String str, Context context, final SnapshotState snapshotState, final SnapshotState snapshotState2, CuratedListItem curatedListItem) {
        Intrinsics.checkNotNullParameter(curatedListItem, "curatedListItem");
        curatedListDuxo.onWatchListItemBuy$lib_lists_ui_externalDebug(curatedListItem, str, context, new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.UtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UtilsKt.streamAndRememberCuratedListState$lambda$28$lambda$27$lambda$26(snapshotState, snapshotState2, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit streamAndRememberCuratedListState$lambda$28$lambda$27$lambda$26(SnapshotState snapshotState, SnapshotState snapshotState2, String str) {
        if (str == null) {
            str = "";
        }
        snapshotState.setValue(str);
        streamAndRememberCuratedListState$lambda$8(snapshotState2, true);
        return Unit.INSTANCE;
    }

    /* compiled from: Utils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.UtilsKt$streamAndRememberCuratedListState$3 */
    static final class C394233 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ LazyListState $listState;
        final /* synthetic */ CuratedListState $state;

        C394233(CuratedListState curatedListState, LazyListState lazyListState) {
            this.$state = curatedListState;
            this.$listState = lazyListState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 6) == 0) {
                i |= (i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2008396756, i, -1, "com.robinhood.shared.portfolio.lists.ui.streamAndRememberCuratedListState.<anonymous> (Utils.kt:131)");
            }
            CuratedListState.Loaded loaded = (CuratedListState.Loaded) this.$state;
            composer.startReplaceGroup(5004770);
            boolean z = (i & 14) == 4 || ((i & 8) != 0 && composer.changedInstance(RhModalBottomSheet));
            Object objRememberedValue = composer.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.UtilsKt$streamAndRememberCuratedListState$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UtilsKt.C394233.invoke$lambda$1$lambda$0(RhModalBottomSheet);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            ReorderCuratedListBottomSheet3.ReorderCuratedListBottomSheet(loaded, (Function0) objRememberedValue, this.$listState, null, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(RhModalBottomSheet5 rhModalBottomSheet5) {
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit streamAndRememberCuratedListState$lambda$32$lambda$31(SnapshotState snapshotState) {
        streamAndRememberCuratedListState$lambda$5(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit streamAndRememberCuratedListState$lambda$37$lambda$34$lambda$33(SnapshotState snapshotState) {
        streamAndRememberCuratedListState$lambda$8(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit streamAndRememberCuratedListState$lambda$37$lambda$36$lambda$35(SnapshotState snapshotState) {
        streamAndRememberCuratedListState$lambda$8(snapshotState, false);
        return Unit.INSTANCE;
    }
}
