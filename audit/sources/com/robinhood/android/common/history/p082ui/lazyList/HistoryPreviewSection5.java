package com.robinhood.android.common.history.p082ui.lazyList;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItems5;
import com.robinhood.android.common.history.p082ui.ComposableSingletons$HistoryRowsKt;
import com.robinhood.android.common.history.p082ui.HistoryRowsKt;
import com.robinhood.android.common.history.p082ui.lazyList.HistoryPreviewListItemsState;
import com.robinhood.android.common.history.p082ui.lazyList.HistoryPreviewListViewState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.duxo.DuxosKt;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HistoryPreviewSection.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0097\u0001\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072\u001b\b\u0002\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a<\u0010\u0014\u001a\u00020\u0006*\u00020\u000f2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u001a\u001a\u00020\u000b*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001d\u001a\u00020\u001b8\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListParams;", "params", "", "compensateForCaret", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "Lkotlin/ExtensionFunctionType;", "header", Footer.f10637type, "emptyContent", "", "keyPrefix", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListDuxo;", "duxo", "Landroidx/compose/foundation/lazy/LazyListScope;", "historyPreviewSection", "(Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListParams;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListDuxo;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function1;", "", "itemCount", "loadingState", "(Landroidx/compose/foundation/lazy/LazyListScope;Lkotlin/jvm/functions/Function3;ILjava/lang/String;)V", "observeHistoryPreviewItemCount", "(Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListParams;Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListDuxo;Landroidx/compose/runtime/Composer;II)I", "getDuxoKey", "(Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListParams;)Ljava/lang/String;", "duxoKey", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListViewState;", "viewState", "state", "lib-history-row_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.history.ui.lazyList.HistoryPreviewSectionKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class HistoryPreviewSection5 {
    /* JADX WARN: Removed duplicated region for block: B:118:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0204 A[PHI: r5
      0x0204: PHI (r5v19 boolean) = (r5v17 boolean), (r5v20 boolean) binds: [B:96:0x0202, B:92:0x01fb] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Function1<LazyListScope, Unit> historyPreviewSection(final HistoryPreviewListParams params, boolean z, Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> function32, Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> function33, String str, HistoryPreviewListDuxo historyPreviewListDuxo, Composer composer, int i, int i2) {
        int i3;
        int i4;
        final HistoryPreviewListDuxo historyPreviewListDuxo2;
        Composer composer2;
        final boolean z2;
        int i5;
        int i6;
        Object objRememberedValue;
        Composer composer3 = composer;
        Intrinsics.checkNotNullParameter(params, "params");
        composer3.startReplaceGroup(312573193);
        final Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> lambda$120580325$lib_history_row_externalDebug = (i2 & 4) != 0 ? HistoryPreviewSection.INSTANCE.getLambda$120580325$lib_history_row_externalDebug() : function3;
        Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> lambda$1896893555$lib_history_row_externalDebug = (i2 & 8) != 0 ? HistoryPreviewSection.INSTANCE.getLambda$1896893555$lib_history_row_externalDebug() : function32;
        Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> function34 = (i2 & 16) != 0 ? null : function33;
        final String str2 = (i2 & 32) != 0 ? "history_preview_" : str;
        if ((i2 & 64) != 0) {
            String duxoKey = getDuxoKey(params);
            composer3.startReplaceGroup(-747520797);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer3, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composer3, 0);
            composer3.startReplaceableGroup(1729797275);
            i3 = -1633490746;
            i4 = 0;
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(HistoryPreviewListDuxo.class), current, duxoKey, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 0, 0);
            Composer composer4 = composer;
            composer4.endReplaceableGroup();
            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
            final Lifecycle lifecycle = ((LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composer4.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer4.changedInstance(baseDuxo) | composer4.changedInstance(lifecycle);
            Object objRememberedValue2 = composer4.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.common.history.ui.lazyList.HistoryPreviewSectionKt$historyPreviewSection$$inlined$duxo$1
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                        lifecycle.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle2 = lifecycle;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.common.history.ui.lazyList.HistoryPreviewSectionKt$historyPreviewSection$$inlined$duxo$1.1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                lifecycle2.removeObserver(duxoLifecycleObserver);
                            }
                        };
                    }
                };
                composer4.updateRememberedValue(objRememberedValue2);
            }
            composer4.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer4, 0);
            composer4.endReplaceGroup();
            historyPreviewListDuxo2 = (HistoryPreviewListDuxo) baseDuxo;
            composer2 = composer4;
        } else {
            i3 = -1633490746;
            i4 = 0;
            historyPreviewListDuxo2 = historyPreviewListDuxo;
            composer2 = composer3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(312573193, i, -1, "com.robinhood.android.common.history.ui.lazyList.historyPreviewSection (HistoryPreviewSection.kt:56)");
        }
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(historyPreviewListDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
        Composer composer5 = composer2;
        composer5.startReplaceGroup(i3);
        boolean zChangedInstance2 = composer5.changedInstance(historyPreviewListDuxo2) | composer5.changedInstance(params);
        Object objRememberedValue3 = composer5.rememberedValue();
        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new HistoryPreviewSection6(historyPreviewListDuxo2, params, null);
            composer5.updateRememberedValue(objRememberedValue3);
        }
        composer5.endReplaceGroup();
        EffectsKt.LaunchedEffect(params, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer5, i & 14);
        HistoryPreviewListViewState historyPreviewListViewStateHistoryPreviewSection$lambda$0 = historyPreviewSection$lambda$0(snapshotState4CollectAsStateWithLifecycle);
        if (historyPreviewListViewStateHistoryPreviewSection$lambda$0 instanceof HistoryPreviewListViewState.Loading) {
            composer5.startReplaceGroup(380062583);
            composer5.startReplaceGroup(-1224400529);
            int i7 = (composer5.changedInstance(params) ? 1 : 0) | (((((i & 896) ^ 384) <= 256 || !composer5.changed(lambda$120580325$lib_history_row_externalDebug)) && (i & 384) != 256) ? i4 : 1) | (((((i & 458752) ^ 196608) <= 131072 || !composer5.changed(str2)) && (i & 196608) != 131072) ? i4 : 1) | (composer5.changedInstance(historyPreviewListDuxo2) ? 1 : 0);
            Object objRememberedValue4 = composer5.rememberedValue();
            if (i7 != 0 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.common.history.ui.lazyList.HistoryPreviewSectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HistoryPreviewSection5.historyPreviewSection$lambda$3$lambda$2(params, lambda$120580325$lib_history_row_externalDebug, str2, historyPreviewListDuxo2, (LazyListScope) obj);
                    }
                };
                composer5.updateRememberedValue(objRememberedValue4);
            }
            Function1<LazyListScope, Unit> function1 = (Function1) objRememberedValue4;
            composer5.endReplaceGroup();
            composer5.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer5.endReplaceGroup();
            return function1;
        }
        if (!(historyPreviewListViewStateHistoryPreviewSection$lambda$0 instanceof HistoryPreviewListViewState.Ready)) {
            composer5.startReplaceGroup(-264834973);
            composer5.endReplaceGroup();
            throw new NoWhenBranchMatchedException();
        }
        composer5.startReplaceGroup(380605703);
        final LazyPagingItems lazyPagingItemsCollectAsLazyPagingItems = LazyPagingItems5.collectAsLazyPagingItems(((HistoryPreviewListViewState.Ready) historyPreviewListViewStateHistoryPreviewSection$lambda$0).getHistoryPager().getFlow(), null, composer5, i4, 1);
        composer5.startReplaceGroup(-1224400529);
        int i8 = (composer5.changedInstance(lazyPagingItemsCollectAsLazyPagingItems) ? 1 : 0) | (composer5.changedInstance(params) ? 1 : 0) | (((((i & 896) ^ 384) <= 256 || !composer5.changed(lambda$120580325$lib_history_row_externalDebug)) && (i & 384) != 256) ? i4 : 1) | (((((i & 7168) ^ 3072) <= 2048 || !composer5.changed(lambda$1896893555$lib_history_row_externalDebug)) && (i & 3072) != 2048) ? i4 : 1);
        if (((i & 112) ^ 48) > 32) {
            z2 = z;
            if (composer5.changed(z2)) {
                i5 = 1;
            }
            int i9 = i8 | i5 | (((((i & 458752) ^ 196608) > 131072 || !composer5.changed(str2)) && (i & 196608) != 131072) ? i4 : 1) | (composer5.changedInstance(historyPreviewListDuxo2) ? 1 : 0);
            if ((((57344 & i) ^ 24576) <= 16384 && composer5.changed(function34)) || (i & 24576) == 16384) {
            }
            i6 = i9 | i4;
            objRememberedValue = composer5.rememberedValue();
            if (i6 == 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final HistoryPreviewListDuxo historyPreviewListDuxo3 = historyPreviewListDuxo2;
                final Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> function35 = lambda$120580325$lib_history_row_externalDebug;
                final Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> function36 = lambda$1896893555$lib_history_row_externalDebug;
                final Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> function37 = function34;
                final String str3 = str2;
                Function1 function12 = new Function1() { // from class: com.robinhood.android.common.history.ui.lazyList.HistoryPreviewSectionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HistoryPreviewSection5.historyPreviewSection$lambda$5$lambda$4(lazyPagingItemsCollectAsLazyPagingItems, params, function35, function36, z2, str3, historyPreviewListDuxo3, function37, (LazyListScope) obj);
                    }
                };
                composer5.updateRememberedValue(function12);
                objRememberedValue = function12;
            }
            Function1<LazyListScope, Unit> function13 = (Function1) objRememberedValue;
            composer5.endReplaceGroup();
            composer5.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer5.endReplaceGroup();
            return function13;
        }
        z2 = z;
        if ((i & 48) != 32) {
            i5 = i4;
        }
        int i92 = i8 | i5 | (((((i & 458752) ^ 196608) > 131072 || !composer5.changed(str2)) && (i & 196608) != 131072) ? i4 : 1) | (composer5.changedInstance(historyPreviewListDuxo2) ? 1 : 0);
        i4 = ((57344 & i) ^ 24576) <= 16384 ? 1 : 1;
        i6 = i92 | i4;
        objRememberedValue = composer5.rememberedValue();
        if (i6 == 0) {
            final HistoryPreviewListDuxo historyPreviewListDuxo32 = historyPreviewListDuxo2;
            final Function3 function352 = lambda$120580325$lib_history_row_externalDebug;
            final Function3 function362 = lambda$1896893555$lib_history_row_externalDebug;
            final Function3 function372 = function34;
            final String str32 = str2;
            Function1 function122 = new Function1() { // from class: com.robinhood.android.common.history.ui.lazyList.HistoryPreviewSectionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HistoryPreviewSection5.historyPreviewSection$lambda$5$lambda$4(lazyPagingItemsCollectAsLazyPagingItems, params, function352, function362, z2, str32, historyPreviewListDuxo32, function372, (LazyListScope) obj);
                }
            };
            composer5.updateRememberedValue(function122);
            objRememberedValue = function122;
        }
        Function1<LazyListScope, Unit> function132 = (Function1) objRememberedValue;
        composer5.endReplaceGroup();
        composer5.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        composer5.endReplaceGroup();
        return function132;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit historyPreviewSection$lambda$3$lambda$2(HistoryPreviewListParams historyPreviewListParams, Function3 function3, String str, HistoryPreviewListDuxo historyPreviewListDuxo, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        if (historyPreviewListParams.getShowLoadingItems()) {
            loadingState(lazyListScope, function3, historyPreviewListParams.getCount(), str);
            historyPreviewListDuxo.setListItemsState(new HistoryPreviewListItemsState.Loading(historyPreviewListParams.getCount()));
        } else {
            historyPreviewListDuxo.setListItemsState(HistoryPreviewListItemsState.EmptyWithoutContent.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit historyPreviewSection$lambda$5$lambda$4(LazyPagingItems lazyPagingItems, HistoryPreviewListParams historyPreviewListParams, Function3 function3, Function3 function32, boolean z, String str, HistoryPreviewListDuxo historyPreviewListDuxo, Function3 function33, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        if (lazyPagingItems.getItemCount() <= 0) {
            if (Intrinsics.areEqual(lazyPagingItems.getLoadState().getRefresh(), LoadState.Loading.INSTANCE) && historyPreviewListParams.getShowLoadingItems()) {
                loadingState(lazyListScope, function3, historyPreviewListParams.getCount(), str);
                historyPreviewListDuxo.setListItemsState(new HistoryPreviewListItemsState.Loading(historyPreviewListParams.getCount()));
            } else if (function33 != null) {
                LazyListScope.item$default(lazyListScope, str + "header", null, function3, 2, null);
                LazyListScope.item$default(lazyListScope, null, null, function33, 3, null);
                historyPreviewListDuxo.setListItemsState(HistoryPreviewListItemsState.EmptyWithContent.INSTANCE);
            } else {
                historyPreviewListDuxo.setListItemsState(HistoryPreviewListItemsState.EmptyWithoutContent.INSTANCE);
            }
        } else {
            HistoryRowsKt.historySection(lazyListScope, lazyPagingItems, (120 & 2) != 0 ? ComposableSingletons$HistoryRowsKt.INSTANCE.getLambda$345760199$lib_history_row_externalDebug() : function3, (120 & 4) != 0 ? ComposableSingletons$HistoryRowsKt.INSTANCE.getLambda$1027653753$lib_history_row_externalDebug() : function32, (120 & 8) != 0 ? 5 : historyPreviewListParams.getCount(), (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? true : z, (120 & 64) == 0 ? false : false, (120 & 128) != 0 ? "history_section_" : str);
            historyPreviewListDuxo.setListItemsState(new HistoryPreviewListItemsState.Loaded(historyPreviewListParams.getCount(), lazyPagingItems.getItemCount()));
        }
        return Unit.INSTANCE;
    }

    private static final HistoryPreviewListViewState historyPreviewSection$lambda$0(SnapshotState4<? extends HistoryPreviewListViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final HistoryPreviewListViewState observeHistoryPreviewItemCount$lambda$7(SnapshotState4<? extends HistoryPreviewListViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final void loadingState(LazyListScope lazyListScope, Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> function3, int i, final String str) {
        LazyListScope.item$default(lazyListScope, str + "header", null, function3, 2, null);
        LazyListScope.items$default(lazyListScope, i, new Function1() { // from class: com.robinhood.android.common.history.ui.lazyList.HistoryPreviewSectionKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryPreviewSection5.loadingState$lambda$6(str, ((Integer) obj).intValue());
            }
        }, null, HistoryPreviewSection.INSTANCE.getLambda$1195327807$lib_history_row_externalDebug(), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadingState$lambda$6(String str, int i) {
        return str + "preview_" + i;
    }

    public static final int observeHistoryPreviewItemCount(HistoryPreviewListParams params, HistoryPreviewListDuxo historyPreviewListDuxo, Composer composer, int i, int i2) {
        Composer composer2;
        CreationExtras defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(params, "params");
        composer.startReplaceGroup(419481973);
        if ((i2 & 2) != 0) {
            String duxoKey = getDuxoKey(params);
            composer.startReplaceGroup(-747520797);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composer, 0);
            composer.startReplaceableGroup(1729797275);
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(HistoryPreviewListDuxo.class), current, duxoKey, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composer, 0, 0);
            composer2 = composer;
            composer2.endReplaceableGroup();
            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
            final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composer2.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.common.history.ui.lazyList.HistoryPreviewSectionKt$observeHistoryPreviewItemCount$$inlined$duxo$1
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                        lifecycle.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle2 = lifecycle;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.common.history.ui.lazyList.HistoryPreviewSectionKt$observeHistoryPreviewItemCount$$inlined$duxo$1.1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                lifecycle2.removeObserver(duxoLifecycleObserver);
                            }
                        };
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 0);
            composer2.endReplaceGroup();
            historyPreviewListDuxo = (HistoryPreviewListDuxo) baseDuxo;
        } else {
            composer2 = composer;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(419481973, i, -1, "com.robinhood.android.common.history.ui.lazyList.observeHistoryPreviewItemCount (HistoryPreviewSection.kt:159)");
        }
        int itemCount = observeHistoryPreviewItemCount$lambda$7(FlowExtKt.collectAsStateWithLifecycle(historyPreviewListDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7)).getItemCount();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceGroup();
        return itemCount;
    }

    private static final String getDuxoKey(HistoryPreviewListParams historyPreviewListParams) {
        return historyPreviewListParams.toString();
    }
}
