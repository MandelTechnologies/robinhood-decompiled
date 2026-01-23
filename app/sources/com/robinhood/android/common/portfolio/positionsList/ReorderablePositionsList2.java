package com.robinhood.android.common.portfolio.positionsList;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState4;
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
import com.robinhood.android.common.portfolio.position.DisplayPositionListItem;
import com.robinhood.android.common.portfolio.position.LazyPositionsList;
import com.robinhood.android.common.portfolio.position.ReorderablePositions2;
import com.robinhood.android.common.portfolio.positionsList.PositionsListViewState;
import com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.util.ShimmerOverlay;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.serverdriven.experimental.api.AccountPositionAction;
import com.robinhood.models.serverdriven.experimental.api.AssetHomeAssetType;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScope;
import com.robinhood.utils.compose.reorderable.ReorderableListState;
import com.robinhood.utils.compose.reorderable.ReorderableListStateKt;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.time.Duration;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.Job;

/* compiled from: ReorderablePositionsList.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a]\u0010\r\u001a\u00020\u000e2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u0013\u001a\"\u0010\u0014\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u001a\u0087\u0001\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\t2\u001b\b\u0002\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001c¢\u0006\u0002\b\u001d2!\b\u0002\u0010\u001e\u001a\u001b\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001f¢\u0006\u0002\b\u001d2!\b\u0002\u0010!\u001a\u001b\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001f¢\u0006\u0002\b\u001d\"\u0018\u0010\"\u001a\u00020\t*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006$²\u0006\n\u0010%\u001a\u00020&X\u008a\u0084\u0002²\u0006\n\u0010%\u001a\u00020&X\u008a\u0084\u0002"}, m3636d2 = {"streamAndRememberPositionsListState", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListState;", "accountNumber", "", "positionInstrumentType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "positionsLocation", "Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "reorderEnabled", "", "positionsListDuxo", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListDuxo;", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;Lcom/robinhood/android/models/portfolio/api/PositionsLocation;ZLcom/robinhood/android/common/portfolio/positionsList/PositionsListDuxo;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/android/common/portfolio/positionsList/PositionsListState;", "observePositionsListItemCount", "", "loadingCount", "emptyCount", "headerOverrideCount", "footerOverrideCount", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;Lcom/robinhood/android/models/portfolio/api/PositionsLocation;IILjava/lang/Integer;Ljava/lang/Integer;Lcom/robinhood/android/common/portfolio/positionsList/PositionsListDuxo;Landroidx/compose/runtime/Composer;II)I", "buildPositionListDuxoKey", "positionsList", "", "Lcom/robinhood/utils/compose/reorderable/ReorderableLazyListScope;", "keyPrefix", "positionsListState", "allowSortOptionsSelection", "loadingContent", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "headerContentOverride", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyListScope;", "footerContentOverride", "isReorderable", "(Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;)Z", "feature-lib-portfolio_externalDebug", "state", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsListKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class ReorderablePositionsList2 {

    /* compiled from: ReorderablePositionsList.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsListKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PositionInstrumentType.values().length];
            try {
                iArr[PositionInstrumentType.EQUITY_LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PositionInstrumentType.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PositionInstrumentType.EQUITY_PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PositionInstrumentType.CRYPTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PositionInstrumentType.CRYPTO_TOKENIZED_STOCKS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PositionInstrumentType.CRYPTO_PERPETUALS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PositionInstrumentType.OPTIONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PositionInstrumentType.OPTIONS_PENDING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PositionInstrumentType.COMBO_ORDERS_PENDING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PositionInstrumentType.PSP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PositionInstrumentType.FUTURES.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PositionInstrumentType.FUTURES_PENDING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PositionInstrumentType.EVENT_CONTRACT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PositionInstrumentType.EVENT_CONTRACT_PENDING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[PositionInstrumentType.UNKNOWN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ReorderablePositionsList streamAndRememberPositionsListState(final String str, final PositionInstrumentType positionInstrumentType, final PositionsLocation positionsLocation, boolean z, PositionsListDuxo positionsListDuxo, Composer composer, int i, int i2) {
        final PositionsListDuxo positionsListDuxo2;
        Composer composer2;
        ReorderablePositionsList fixedOrder;
        Intrinsics.checkNotNullParameter(positionInstrumentType, "positionInstrumentType");
        Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
        composer.startReplaceGroup(1076942626);
        boolean zIsReorderable = (i2 & 8) != 0 ? isReorderable(positionInstrumentType) : z;
        int i3 = 0;
        if ((i2 & 16) != 0) {
            String strBuildPositionListDuxoKey = buildPositionListDuxoKey(str, positionInstrumentType, positionsLocation);
            composer.startReplaceGroup(-747520797);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PositionsListDuxo.class), current, strBuildPositionListDuxoKey, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 0, 0);
            composer.endReplaceableGroup();
            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
            final Lifecycle lifecycle = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(baseDuxo) | composer.changedInstance(lifecycle);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsListKt$streamAndRememberPositionsListState$$inlined$duxo$1
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                        lifecycle.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle2 = lifecycle;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsListKt$streamAndRememberPositionsListState$$inlined$duxo$1.1
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
            positionsListDuxo2 = (PositionsListDuxo) baseDuxo;
        } else {
            positionsListDuxo2 = positionsListDuxo;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1076942626, i, -1, "com.robinhood.android.common.portfolio.positionsList.streamAndRememberPositionsListState (ReorderablePositionsList.kt:41)");
        }
        composer.startReplaceGroup(-1224400529);
        boolean z2 = true;
        boolean zChangedInstance2 = composer.changedInstance(positionsListDuxo2) | ((((i & 14) ^ 6) > 4 && composer.changed(str)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(positionInstrumentType.ordinal())) || (i & 48) == 32);
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(positionsLocation.ordinal())) && (i & 384) != 256) {
            z2 = false;
        }
        boolean z3 = zChangedInstance2 | z2;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsListKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ReorderablePositionsList2.streamAndRememberPositionsListState$lambda$2$lambda$1(positionsListDuxo2, str, positionInstrumentType, positionsLocation, (LifecycleResumePauseEffectScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        LifecycleEffectKt.LifecycleResumeEffect(str, positionInstrumentType, positionsLocation, null, (Function1) objRememberedValue2, composer, i & 1022, 8);
        PositionsListViewState positionsListViewStateStreamAndRememberPositionsListState$lambda$3 = streamAndRememberPositionsListState$lambda$3(FlowExtKt.collectAsStateWithLifecycle(positionsListDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7));
        if (Intrinsics.areEqual(positionsListViewStateStreamAndRememberPositionsListState$lambda$3, PositionsListViewState.Unbound.INSTANCE) || Intrinsics.areEqual(positionsListViewStateStreamAndRememberPositionsListState$lambda$3, PositionsListViewState.Loading.INSTANCE)) {
            composer2 = composer;
            fixedOrder = ReorderablePositionsList.Loading.INSTANCE;
        } else {
            if (!(positionsListViewStateStreamAndRememberPositionsListState$lambda$3 instanceof PositionsListViewState.Ready)) {
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-145218312);
            PositionsListViewState.Ready ready = (PositionsListViewState.Ready) positionsListViewStateStreamAndRememberPositionsListState$lambda$3;
            if (ready.getItems().isEmpty()) {
                UIComponent<AccountPositionAction> header = ready.getHeader();
                UIComponent<AccountPositionAction> footer = ready.getFooter();
                boolean shouldHeaderShimmer = ready.getShouldHeaderShimmer();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composer.changedInstance(positionsListDuxo2);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new ReorderablePositionsList5(positionsListDuxo2);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                ReorderablePositionsList.Empty empty = new ReorderablePositionsList.Empty(header, footer, shouldHeaderShimmer, (Function1) ((KFunction) objRememberedValue3));
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return empty;
            }
            composer.endReplaceGroup();
            ImmutableList<PositionsV2.PositionListItemV2> items = ready.getItems();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
            for (PositionsV2.PositionListItemV2 positionListItemV2 : items) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(new DisplayPositionListItem(positionListItemV2, ready.getActiveDisplayType(), i3));
                i3 = i4;
            }
            ImmutableList immutableList = extensions2.toImmutableList(arrayList);
            if (zIsReorderable) {
                composer.startReplaceGroup(-205898894);
                UIComponent<AccountPositionAction> header2 = ready.getHeader();
                UIComponent<AccountPositionAction> footer2 = ready.getFooter();
                boolean shouldHeaderShimmer2 = ready.getShouldHeaderShimmer();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance4 = composer.changedInstance(positionsListDuxo2);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new ReorderablePositionsList6(positionsListDuxo2);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                Function1 function1 = (Function1) ((KFunction) objRememberedValue4);
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance5 = composer.changedInstance(positionsListDuxo2);
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function2() { // from class: com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsListKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ReorderablePositionsList2.streamAndRememberPositionsListState$lambda$8$lambda$7(positionsListDuxo2, (List) obj, (Duration) obj2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                Function2 function2 = (Function2) objRememberedValue5;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance6 = composer.changedInstance(positionsListDuxo2);
                Object objRememberedValue6 = composer.rememberedValue();
                if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsListKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ReorderablePositionsList2.streamAndRememberPositionsListState$lambda$10$lambda$9(positionsListDuxo2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue6);
                }
                Function0 function0 = (Function0) objRememberedValue6;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance7 = composer.changedInstance(positionsListDuxo2);
                Object objRememberedValue7 = composer.rememberedValue();
                if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsListKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ReorderablePositionsList2.streamAndRememberPositionsListState$lambda$12$lambda$11(positionsListDuxo2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue7);
                }
                composer.endReplaceGroup();
                ReorderableListState reorderableListStateM26636rememberReorderableListStateKVH2U2I = ReorderableListStateKt.m26636rememberReorderableListStateKVH2U2I(immutableList, function2, 0L, function0, (Function0) objRememberedValue7, composer, 0, 4);
                boolean reorderPending = ready.getReorderPending();
                boolean animateItemPlacement = ready.getAnimateItemPlacement();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance8 = composer.changedInstance(positionsListDuxo2);
                Object objRememberedValue8 = composer.rememberedValue();
                if (zChangedInstance8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new Function0() { // from class: com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsListKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ReorderablePositionsList2.streamAndRememberPositionsListState$lambda$14$lambda$13(positionsListDuxo2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue8);
                }
                composer.endReplaceGroup();
                composer2 = composer;
                fixedOrder = new ReorderablePositionsList.Ready.Reorderable(header2, footer2, positionsLocation, shouldHeaderShimmer2, function1, positionInstrumentType, reorderableListStateM26636rememberReorderableListStateKVH2U2I, reorderPending, animateItemPlacement, (Function0) objRememberedValue8);
                composer2.endReplaceGroup();
            } else {
                composer2 = composer;
                composer2.startReplaceGroup(-204573303);
                UIComponent<AccountPositionAction> header3 = ready.getHeader();
                UIComponent<AccountPositionAction> footer3 = ready.getFooter();
                boolean shouldHeaderShimmer3 = ready.getShouldHeaderShimmer();
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance9 = composer2.changedInstance(positionsListDuxo2);
                Object objRememberedValue9 = composer2.rememberedValue();
                if (zChangedInstance9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = new ReorderablePositionsList7(positionsListDuxo2);
                    composer2.updateRememberedValue(objRememberedValue9);
                }
                composer2.endReplaceGroup();
                fixedOrder = new ReorderablePositionsList.Ready.FixedOrder(header3, footer3, positionsLocation, shouldHeaderShimmer3, (Function1) ((KFunction) objRememberedValue9), immutableList);
                composer2.endReplaceGroup();
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceGroup();
        return fixedOrder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult streamAndRememberPositionsListState$lambda$2$lambda$1(PositionsListDuxo positionsListDuxo, String str, PositionInstrumentType positionInstrumentType, PositionsLocation positionsLocation, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Disposable disposableBind = positionsListDuxo.bind(str, positionInstrumentType, positionsLocation);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsListKt$streamAndRememberPositionsListState$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                disposableBind.dispose();
            }
        };
    }

    private static final PositionsListViewState observePositionsListItemCount$lambda$16(SnapshotState4<? extends PositionsListViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final PositionsListViewState streamAndRememberPositionsListState$lambda$3(SnapshotState4<? extends PositionsListViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit streamAndRememberPositionsListState$lambda$10$lambda$9(PositionsListDuxo positionsListDuxo) {
        positionsListDuxo.onReorderStart();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job streamAndRememberPositionsListState$lambda$8$lambda$7(PositionsListDuxo positionsListDuxo, List positionItems, Duration duration) {
        Intrinsics.checkNotNullParameter(positionItems, "positionItems");
        List list = positionItems;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((DisplayPositionListItem) it.next()).getPosition());
        }
        return positionsListDuxo.m12335onReorderHG0u8IE(arrayList, duration.getRawValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit streamAndRememberPositionsListState$lambda$12$lambda$11(PositionsListDuxo positionsListDuxo) {
        positionsListDuxo.onReorderFinish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit streamAndRememberPositionsListState$lambda$14$lambda$13(PositionsListDuxo positionsListDuxo) {
        positionsListDuxo.onSortOptionsFragmentShown();
        return Unit.INSTANCE;
    }

    public static final int observePositionsListItemCount(String str, PositionInstrumentType positionInstrumentType, PositionsLocation positionsLocation, int i, int i2, Integer num, Integer num2, PositionsListDuxo positionsListDuxo, Composer composer, int i3, int i4) {
        Composer composer2;
        PositionsListDuxo positionsListDuxo2;
        int iIntValue;
        Intrinsics.checkNotNullParameter(positionInstrumentType, "positionInstrumentType");
        Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
        composer.startReplaceGroup(-1562245465);
        int iIntValue2 = 0;
        int i5 = (i4 & 8) != 0 ? 0 : i;
        int i6 = (i4 & 16) != 0 ? 0 : i2;
        Integer num3 = (i4 & 32) != 0 ? null : num;
        Integer num4 = (i4 & 64) != 0 ? null : num2;
        if ((i4 & 128) != 0) {
            String strBuildPositionListDuxoKey = buildPositionListDuxoKey(str, positionInstrumentType, positionsLocation);
            composer.startReplaceGroup(-747520797);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PositionsListDuxo.class), current, strBuildPositionListDuxoKey, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 0, 0);
            composer2 = composer;
            composer2.endReplaceableGroup();
            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
            final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composer2.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsListKt$observePositionsListItemCount$$inlined$duxo$1
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                        lifecycle.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle2 = lifecycle;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsListKt$observePositionsListItemCount$$inlined$duxo$1.1
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
            positionsListDuxo2 = (PositionsListDuxo) baseDuxo;
        } else {
            composer2 = composer;
            positionsListDuxo2 = positionsListDuxo;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1562245465, i3, -1, "com.robinhood.android.common.portfolio.positionsList.observePositionsListItemCount (ReorderablePositionsList.kt:145)");
        }
        PositionsListViewState positionsListViewStateObservePositionsListItemCount$lambda$16 = observePositionsListItemCount$lambda$16(FlowExtKt.collectAsStateWithLifecycle(positionsListDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7));
        if (!Intrinsics.areEqual(positionsListViewStateObservePositionsListItemCount$lambda$16, PositionsListViewState.Unbound.INSTANCE)) {
            if (Intrinsics.areEqual(positionsListViewStateObservePositionsListItemCount$lambda$16, PositionsListViewState.Loading.INSTANCE)) {
                iIntValue2 = i5;
            } else {
                if (!(positionsListViewStateObservePositionsListItemCount$lambda$16 instanceof PositionsListViewState.Ready)) {
                    throw new NoWhenBranchMatchedException();
                }
                PositionsListViewState.Ready ready = (PositionsListViewState.Ready) positionsListViewStateObservePositionsListItemCount$lambda$16;
                if (ready.getItems().isEmpty()) {
                    iIntValue2 = i6;
                } else {
                    if (num3 != null) {
                        iIntValue = num3.intValue();
                    } else {
                        Integer num5 = ready.getHeader() != null ? num : null;
                        iIntValue = num5 != null ? num5.intValue() : 0;
                    }
                    if (num4 != null) {
                        iIntValue2 = num4.intValue();
                    } else {
                        num = ready.getFooter() == null ? null : 1;
                        if (num != null) {
                            iIntValue2 = num.intValue();
                        }
                    }
                    iIntValue2 += iIntValue + ready.getItems().size();
                }
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iIntValue2;
    }

    public static final String buildPositionListDuxoKey(String str, PositionInstrumentType positionInstrumentType, PositionsLocation positionsLocation) {
        Intrinsics.checkNotNullParameter(positionInstrumentType, "positionInstrumentType");
        Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
        return str + "-" + positionInstrumentType + "-" + positionsLocation;
    }

    public static /* synthetic */ void positionsList$default(ReorderableLazyListScope reorderableLazyListScope, String str, ReorderablePositionsList reorderablePositionsList, boolean z, Function1 function1, Function2 function2, Function2 function22, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        positionsList(reorderableLazyListScope, str, reorderablePositionsList, z, (i & 8) != 0 ? null : function1, (i & 16) != 0 ? null : function2, (i & 32) != 0 ? null : function22);
    }

    public static final void positionsList(ReorderableLazyListScope reorderableLazyListScope, String keyPrefix, ReorderablePositionsList positionsListState, boolean z, Function1<? super ReorderableLazyListScope, Unit> function1, Function2<? super LazyListScope, ? super ReorderablePositionsList, Unit> function2, Function2<? super LazyListScope, ? super ReorderablePositionsList, Unit> function22) {
        PositionsLocation positionsLocation;
        Function2<? super LazyListScope, ? super ReorderablePositionsList, Unit> function23;
        Intrinsics.checkNotNullParameter(reorderableLazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(keyPrefix, "keyPrefix");
        Intrinsics.checkNotNullParameter(positionsListState, "positionsListState");
        boolean z2 = positionsListState instanceof ReorderablePositionsList.Ready;
        ReorderablePositionsList.Ready ready = z2 ? (ReorderablePositionsList.Ready) positionsListState : null;
        if (ready == null || (positionsLocation = ready.getPositionsLocation()) == null) {
            positionsLocation = PositionsLocation.UNKNOWN;
        }
        ReorderablePositionsList.Ready.Reorderable reorderable = positionsListState instanceof ReorderablePositionsList.Ready.Reorderable ? (ReorderablePositionsList.Ready.Reorderable) positionsListState : null;
        Function0<Unit> onSortOptionsFragmentShown = reorderable != null ? reorderable.getOnSortOptionsFragmentShown() : null;
        if (function2 != null) {
            function2.invoke(reorderableLazyListScope, positionsListState);
        }
        if (Intrinsics.areEqual(positionsListState, ReorderablePositionsList.Loading.INSTANCE)) {
            if (function1 != null) {
                function1.invoke(reorderableLazyListScope);
            }
            function23 = function22;
        } else if (positionsListState instanceof ReorderablePositionsList.Empty) {
            ReorderablePositionsList.Empty empty = (ReorderablePositionsList.Empty) positionsListState;
            PositionsLocation positionsLocation2 = positionsLocation;
            positionsList$headerIfNotOverridden(empty.getHeader(), function2, reorderableLazyListScope, keyPrefix, z, positionsLocation2, onSortOptionsFragmentShown, empty.getShouldHeaderShimmer(), empty.getOnAssetHomeOpened());
            function23 = function22;
            positionsList$footerIfNotOverridden(empty.getFooter(), function23, reorderableLazyListScope, keyPrefix, z, positionsLocation2);
        } else {
            PositionsLocation positionsLocation3 = positionsLocation;
            Function0<Unit> function0 = onSortOptionsFragmentShown;
            if (!z2) {
                throw new NoWhenBranchMatchedException();
            }
            ReorderablePositionsList.Ready ready2 = (ReorderablePositionsList.Ready) positionsListState;
            positionsList$headerIfNotOverridden(ready2.getHeader(), function2, reorderableLazyListScope, keyPrefix, z, positionsLocation3, function0, ready2.getShouldHeaderShimmer(), ready2.getOnAssetHomeOpened());
            if (ready2 instanceof ReorderablePositionsList.Ready.Reorderable) {
                ReorderablePositionsList.Ready.Reorderable reorderable2 = (ReorderablePositionsList.Ready.Reorderable) positionsListState;
                ReorderablePositions2.reorderablePositions(reorderableLazyListScope, keyPrefix + " ReorderablePositions " + reorderable2.getPositionInstrumentType(), reorderable2.getReorderableListState(), reorderable2.getPositionsLocation(), !reorderable2.getReorderPending() && reorderable2.getAnimateItemPlacement());
            } else {
                if (!(ready2 instanceof ReorderablePositionsList.Ready.FixedOrder)) {
                    throw new NoWhenBranchMatchedException();
                }
                ReorderablePositionsList.Ready.FixedOrder fixedOrder = (ReorderablePositionsList.Ready.FixedOrder) positionsListState;
                LazyPositionsList.lazyDisplayPositions$default(reorderableLazyListScope, fixedOrder.getDisplayPositionListItems(), fixedOrder.getPositionsLocation(), null, keyPrefix, 4, null);
            }
            function23 = function22;
            positionsList$footerIfNotOverridden(ready2.getFooter(), function23, reorderableLazyListScope, keyPrefix, z, positionsLocation3);
        }
        if (function23 != null) {
            function23.invoke(reorderableLazyListScope, positionsListState);
        }
    }

    private static final void positionsList$headerIfNotOverridden(UIComponent<? extends AccountPositionAction> uIComponent, Function2<? super LazyListScope, ? super ReorderablePositionsList, Unit> function2, ReorderableLazyListScope reorderableLazyListScope, String str, final boolean z, final PositionsLocation positionsLocation, final Function0<Unit> function0, final boolean z2, final Function1<? super AssetHomeAssetType, Unit> function1) {
        if (uIComponent != null) {
            if (function2 != null) {
                uIComponent = null;
            }
            final UIComponent<? extends AccountPositionAction> uIComponent2 = uIComponent;
            if (uIComponent2 != null) {
                LazyListScope.item$default(reorderableLazyListScope, str + "_header", null, ComposableLambda3.composableLambdaInstance(592085144, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsListKt$positionsList$headerIfNotOverridden$2$1
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
                            ComposerKt.traceEventStart(592085144, i, -1, "com.robinhood.android.common.portfolio.positionsList.positionsList.headerIfNotOverridden.<anonymous>.<anonymous> (ReorderablePositionsList.kt:264)");
                        }
                        boolean z3 = z;
                        PositionsLocation positionsLocation2 = positionsLocation;
                        Function0<Unit> function02 = function0;
                        Function1<AssetHomeAssetType, Unit> function12 = function1;
                        final boolean z4 = z2;
                        final UIComponent<AccountPositionAction> uIComponent3 = uIComponent2;
                        AccountPositionActionHandler.AccountPositionActionHandler(z3, positionsLocation2, null, function02, function12, ComposableLambda3.rememberComposableLambda(-954966808, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsListKt$positionsList$headerIfNotOverridden$2$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i2) {
                                if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-954966808, i2, -1, "com.robinhood.android.common.portfolio.positionsList.positionsList.headerIfNotOverridden.<anonymous>.<anonymous>.<anonymous> (ReorderablePositionsList.kt:270)");
                                }
                                if (z4) {
                                    composer2.startReplaceGroup(447242170);
                                    final UIComponent<AccountPositionAction> uIComponent4 = uIComponent3;
                                    ShimmerOverlay.ShimmerOverlay(null, null, 3000, ComposableLambda3.rememberComposableLambda(1134220206, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsListKt.positionsList.headerIfNotOverridden.2.1.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i3) {
                                            if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1134220206, i3, -1, "com.robinhood.android.common.portfolio.positionsList.positionsList.headerIfNotOverridden.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReorderablePositionsList.kt:272)");
                                            }
                                            SduiComponent3.SduiComponent(uIComponent4, null, HorizontalPadding.Default, composer3, 384, 2);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer2, 54), composer2, 3456, 3);
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(447562059);
                                    SduiComponent3.SduiComponent(uIComponent3, null, HorizontalPadding.Default, composer2, 384, 2);
                                    composer2.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), composer, 196608, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 2, null);
            }
        }
    }

    private static final void positionsList$footerIfNotOverridden(final UIComponent<? extends AccountPositionAction> uIComponent, Function2<? super LazyListScope, ? super ReorderablePositionsList, Unit> function2, ReorderableLazyListScope reorderableLazyListScope, String str, final boolean z, final PositionsLocation positionsLocation) {
        if (uIComponent != null) {
            if (function2 != null) {
                uIComponent = null;
            }
            if (uIComponent != null) {
                LazyListScope.item$default(reorderableLazyListScope, str + "_footer", null, ComposableLambda3.composableLambdaInstance(502635309, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsListKt$positionsList$footerIfNotOverridden$2$1
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
                            ComposerKt.traceEventStart(502635309, i, -1, "com.robinhood.android.common.portfolio.positionsList.positionsList.footerIfNotOverridden.<anonymous>.<anonymous> (ReorderablePositionsList.kt:291)");
                        }
                        boolean z2 = z;
                        PositionsLocation positionsLocation2 = positionsLocation;
                        final UIComponent<AccountPositionAction> uIComponent2 = uIComponent;
                        AccountPositionActionHandler.AccountPositionActionHandler(z2, positionsLocation2, null, null, null, ComposableLambda3.rememberComposableLambda(-467643171, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsListKt$positionsList$footerIfNotOverridden$2$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i2) {
                                if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-467643171, i2, -1, "com.robinhood.android.common.portfolio.positionsList.positionsList.footerIfNotOverridden.<anonymous>.<anonymous>.<anonymous> (ReorderablePositionsList.kt:295)");
                                }
                                SduiComponent3.SduiComponent(uIComponent2, null, HorizontalPadding.Default, composer2, 384, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), composer, 196608, 28);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 2, null);
            }
        }
    }

    private static final boolean isReorderable(PositionInstrumentType positionInstrumentType) {
        switch (WhenMappings.$EnumSwitchMapping$0[positionInstrumentType.ordinal()]) {
            case 1:
            case 2:
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
