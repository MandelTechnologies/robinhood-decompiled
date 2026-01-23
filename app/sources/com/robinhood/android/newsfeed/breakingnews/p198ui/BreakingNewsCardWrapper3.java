package com.robinhood.android.newsfeed.breakingnews.p198ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
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
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.newsfeed.models.breakingnews.api.ApiAssetType;
import com.robinhood.android.newsfeed.models.breakingnews.p199db.BreakingNews;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: BreakingNewsCardWrapper.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002"}, m3636d2 = {"BreakingNewsCardWrapper", "", "assetId", "Ljava/util/UUID;", "accountNumber", "", "assetType", "Lcom/robinhood/android/newsfeed/models/breakingnews/api/ApiAssetType;", "modifier", "Landroidx/compose/ui/Modifier;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "duxo", "Lcom/robinhood/android/newsfeed/breakingnews/ui/BreakingNewsCardDuxo;", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/newsfeed/models/breakingnews/api/ApiAssetType;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Lcom/robinhood/android/newsfeed/breakingnews/ui/BreakingNewsCardDuxo;Landroidx/compose/runtime/Composer;II)V", "lib-breakingnews-ui_externalDebug", "viewState", "Lcom/robinhood/android/newsfeed/breakingnews/ui/BreakingNewsCardViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardWrapperKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class BreakingNewsCardWrapper3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BreakingNewsCardWrapper$lambda$2(UUID uuid, String str, ApiAssetType apiAssetType, Modifier modifier, PaddingValues paddingValues, BreakingNewsCardWrapper breakingNewsCardWrapper, int i, int i2, Composer composer, int i3) {
        BreakingNewsCardWrapper(uuid, str, apiAssetType, modifier, paddingValues, breakingNewsCardWrapper, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BreakingNewsCardWrapper$lambda$4(UUID uuid, String str, ApiAssetType apiAssetType, Modifier modifier, PaddingValues paddingValues, BreakingNewsCardWrapper breakingNewsCardWrapper, int i, int i2, Composer composer, int i3) {
        BreakingNewsCardWrapper(uuid, str, apiAssetType, modifier, paddingValues, breakingNewsCardWrapper, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BreakingNewsCardWrapper(final UUID assetId, final String str, final ApiAssetType assetType, Modifier modifier, PaddingValues paddingValues, BreakingNewsCardWrapper breakingNewsCardWrapper, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        PaddingValues paddingValues2;
        BreakingNewsCardWrapper breakingNewsCardWrapper2;
        int i4;
        PaddingValues paddingValuesM5138PaddingValuesa9UjIt4;
        PaddingValues paddingValues3;
        Modifier modifier3;
        BreakingNewsCardWrapper breakingNewsCardWrapper3;
        int i5;
        boolean zChangedInstance;
        Object breakingNewsCardWrapper4;
        int i6;
        int i7;
        final BreakingNewsCardWrapper breakingNewsCardWrapper5;
        BreakingNews breakingNews;
        final Modifier modifier4;
        final PaddingValues paddingValues4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Composer composerStartRestartGroup = composer.startRestartGroup(2144916229);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(assetId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(assetType.ordinal()) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    paddingValues2 = paddingValues;
                    int i9 = composerStartRestartGroup.changed(paddingValues2) ? 16384 : 8192;
                    i3 |= i9;
                } else {
                    paddingValues2 = paddingValues;
                }
                i3 |= i9;
            } else {
                paddingValues2 = paddingValues;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    breakingNewsCardWrapper2 = breakingNewsCardWrapper;
                    int i10 = composerStartRestartGroup.changedInstance(breakingNewsCardWrapper2) ? 131072 : 65536;
                    i3 |= i10;
                } else {
                    breakingNewsCardWrapper2 = breakingNewsCardWrapper;
                }
                i3 |= i10;
            } else {
                breakingNewsCardWrapper2 = breakingNewsCardWrapper;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i11 = BentoTheme.$stable;
                        i4 = i3 & (-57345);
                        paddingValuesM5138PaddingValuesa9UjIt4 = PaddingKt.m5138PaddingValuesa9UjIt4(bentoTheme.getSpacing(composerStartRestartGroup, i11).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i11).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i11).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i11).m21593getSmallD9Ej5fM());
                    } else {
                        i4 = i3;
                        paddingValuesM5138PaddingValuesa9UjIt4 = paddingValues2;
                    }
                    if ((i2 & 32) == 0) {
                        String str2 = assetId + PlaceholderUtils.XXShortPlaceholderText + assetType + PlaceholderUtils.XXShortPlaceholderText + str;
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(BreakingNewsCardWrapper.class), current, str2, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardWrapperKt$BreakingNewsCardWrapper$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardWrapperKt$BreakingNewsCardWrapper$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        paddingValues3 = paddingValuesM5138PaddingValuesa9UjIt4;
                        modifier3 = modifier5;
                        breakingNewsCardWrapper3 = (BreakingNewsCardWrapper) baseDuxo;
                        i5 = i4 & (-458753);
                    } else {
                        paddingValues3 = paddingValuesM5138PaddingValuesa9UjIt4;
                        modifier3 = modifier5;
                        breakingNewsCardWrapper3 = breakingNewsCardWrapper2;
                        i5 = i4;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    i5 = i3;
                    modifier3 = modifier2;
                    paddingValues3 = paddingValues2;
                    breakingNewsCardWrapper3 = breakingNewsCardWrapper2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2144916229, i5, -1, "com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardWrapper (BreakingNewsCardWrapper.kt:43)");
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(breakingNewsCardWrapper3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                int i12 = i5 & 896;
                zChangedInstance = composerStartRestartGroup.changedInstance(breakingNewsCardWrapper3) | ((i5 & 112) != 32) | composerStartRestartGroup.changedInstance(assetId) | (i12 == 256);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    i6 = i5;
                    BreakingNewsCardWrapper breakingNewsCardWrapper6 = breakingNewsCardWrapper3;
                    breakingNewsCardWrapper4 = new BreakingNewsCardWrapper4(breakingNewsCardWrapper6, str, assetId, assetType, null);
                    i7 = 0;
                    breakingNewsCardWrapper5 = breakingNewsCardWrapper6;
                    composerStartRestartGroup.updateRememberedValue(breakingNewsCardWrapper4);
                } else {
                    i6 = i5;
                    breakingNewsCardWrapper4 = objRememberedValue2;
                    i7 = 0;
                    breakingNewsCardWrapper5 = breakingNewsCardWrapper3;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(str, assetId, assetType, (Function2) breakingNewsCardWrapper4, composerStartRestartGroup, ((i6 >> 3) & 14) | ((i6 << 3) & 112) | i12);
                breakingNews = BreakingNewsCardWrapper$lambda$0(snapshotState4CollectAsStateWithLifecycle).getBreakingNews();
                if (breakingNews != null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        final Modifier modifier6 = modifier3;
                        final PaddingValues paddingValues5 = paddingValues3;
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardWrapperKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BreakingNewsCardWrapper3.BreakingNewsCardWrapper$lambda$2(assetId, str, assetType, modifier6, paddingValues5, breakingNewsCardWrapper5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                modifier4 = modifier3;
                paddingValues4 = paddingValues3;
                Modifier modifierPadding = PaddingKt.padding(modifier4, paddingValues4);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, i7);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i7);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPadding);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                BreakingNewsCard.BreakingNewsCard(breakingNews, null, composerStartRestartGroup, i7, 2);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                paddingValues4 = paddingValues2;
                breakingNewsCardWrapper5 = breakingNewsCardWrapper2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardWrapperKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BreakingNewsCardWrapper3.BreakingNewsCardWrapper$lambda$4(assetId, str, assetType, modifier4, paddingValues4, breakingNewsCardWrapper5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((74899 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(breakingNewsCardWrapper3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                int i122 = i5 & 896;
                zChangedInstance = composerStartRestartGroup.changedInstance(breakingNewsCardWrapper3) | ((i5 & 112) != 32) | composerStartRestartGroup.changedInstance(assetId) | (i122 == 256);
                Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    i6 = i5;
                    BreakingNewsCardWrapper breakingNewsCardWrapper62 = breakingNewsCardWrapper3;
                    breakingNewsCardWrapper4 = new BreakingNewsCardWrapper4(breakingNewsCardWrapper62, str, assetId, assetType, null);
                    i7 = 0;
                    breakingNewsCardWrapper5 = breakingNewsCardWrapper62;
                    composerStartRestartGroup.updateRememberedValue(breakingNewsCardWrapper4);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(str, assetId, assetType, (Function2) breakingNewsCardWrapper4, composerStartRestartGroup, ((i6 >> 3) & 14) | ((i6 << 3) & 112) | i122);
                    breakingNews = BreakingNewsCardWrapper$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getBreakingNews();
                    if (breakingNews != null) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final BreakingNewsCardViewState BreakingNewsCardWrapper$lambda$0(SnapshotState4<BreakingNewsCardViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
