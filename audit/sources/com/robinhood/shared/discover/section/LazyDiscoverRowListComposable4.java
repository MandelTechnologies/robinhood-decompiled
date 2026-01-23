package com.robinhood.shared.discover.section;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.api.trading.CryptoTradingOptionsCategory;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreState3;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreState4;
import com.robinhood.shared.discover.section.DiscoverRow;
import com.robinhood.shared.discover.section.DiscoverSectionDuxo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: LazyDiscoverRowListComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aM\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, m3636d2 = {"LazyDiscoverRowListComposable", "", "scrollState", "Landroidx/compose/foundation/lazy/LazyListState;", "assetType", "Lcom/robinhood/models/crypto/db/explore/CryptoExploreAssetType;", RhGcmListenerService.EXTRA_CATEGORY, "Lcom/robinhood/models/api/trading/CryptoTradingOptionsCategory;", "previouslyLoadedCount", "", "modifier", "Landroidx/compose/ui/Modifier;", "tabForCdpDeepLink", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "duxo", "Lcom/robinhood/shared/discover/section/DiscoverSectionDuxo;", "(Landroidx/compose/foundation/lazy/LazyListState;Lcom/robinhood/models/crypto/db/explore/CryptoExploreAssetType;Lcom/robinhood/models/api/trading/CryptoTradingOptionsCategory;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/navigation/keys/FragmentTab;Lcom/robinhood/shared/discover/section/DiscoverSectionDuxo;Landroidx/compose/runtime/Composer;II)V", "lib-discover_externalDebug", "viewState", "Lcom/robinhood/shared/discover/section/DiscoverSectionViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.discover.section.LazyDiscoverRowListComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class LazyDiscoverRowListComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyDiscoverRowListComposable$lambda$4(LazyListState lazyListState, CryptoExploreState3 cryptoExploreState3, CryptoTradingOptionsCategory cryptoTradingOptionsCategory, Integer num, Modifier modifier, FragmentTab fragmentTab, DiscoverSectionDuxo discoverSectionDuxo, int i, int i2, Composer composer, int i3) {
        LazyDiscoverRowListComposable(lazyListState, cryptoExploreState3, cryptoTradingOptionsCategory, num, modifier, fragmentTab, discoverSectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4 A[PHI: r8
      0x00a4: PHI (r8v22 int) = (r8v0 int), (r8v5 int), (r8v6 int) binds: [B:55:0x00a2, B:65:0x00ba, B:64:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyDiscoverRowListComposable(final LazyListState scrollState, final CryptoExploreState3 assetType, final CryptoTradingOptionsCategory category, final Integer num, Modifier modifier, FragmentTab fragmentTab, DiscoverSectionDuxo discoverSectionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        DiscoverSectionDuxo discoverSectionDuxo2;
        int i5;
        Modifier modifier3;
        FragmentTab fragmentTab2;
        boolean z;
        Composer composer2;
        int i6;
        DiscoverSectionDuxo discoverSectionDuxo3;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        final Navigator navigator;
        final Context context;
        boolean z2;
        Object objRememberedValue;
        final Modifier modifier4;
        final DiscoverSectionDuxo discoverSectionDuxo4;
        final FragmentTab fragmentTab3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(category, "category");
        Composer composerStartRestartGroup = composer.startRestartGroup(6523270);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(scrollState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(assetType.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(category) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(num) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            int i8 = 196608;
            if (i4 != 0) {
                i3 |= i8;
            } else if ((196608 & i) == 0) {
                i8 = composerStartRestartGroup.changed(fragmentTab == null ? -1 : fragmentTab.ordinal()) ? 131072 : 65536;
                i3 |= i8;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    discoverSectionDuxo2 = discoverSectionDuxo;
                    int i9 = composerStartRestartGroup.changedInstance(discoverSectionDuxo2) ? 1048576 : 524288;
                    i3 |= i9;
                } else {
                    discoverSectionDuxo2 = discoverSectionDuxo;
                }
                i3 |= i9;
            } else {
                discoverSectionDuxo2 = discoverSectionDuxo;
            }
            i5 = i3;
            if ((599187 & i5) == 599186 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    FragmentTab fragmentTab4 = i4 == 0 ? FragmentTab.SEARCH : fragmentTab;
                    if ((i2 & 64) == 0) {
                        CryptoExploreState4 cryptoExploreState4 = CryptoExploreState4.COIN_LIST;
                        z = false;
                        DiscoverSectionDuxo.InitArgs initArgs = new DiscoverSectionDuxo.InitArgs(assetType, cryptoExploreState4, category, fragmentTab4, null, 16, null);
                        fragmentTab2 = fragmentTab4;
                        String str = cryptoExploreState4.getServerValue() + "_" + assetType.getServerValue() + "_" + category.getServerName();
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(DiscoverSectionDuxo.class), current, str, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.discover.section.LazyDiscoverRowListComposableKt$LazyDiscoverRowListComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.discover.section.LazyDiscoverRowListComposableKt$LazyDiscoverRowListComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer2, 0);
                        composer2.endReplaceGroup();
                        i6 = i5 & (-3670017);
                        discoverSectionDuxo3 = (DiscoverSectionDuxo) baseDuxo;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(6523270, i6, -1, "com.robinhood.shared.discover.section.LazyDiscoverRowListComposable (LazyDiscoverRowListComposable.kt:36)");
                        }
                        snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(discoverSectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                        navigator = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                        context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        composer2.startReplaceGroup(-1224400529);
                        boolean zChanged = composer2.changed(snapshotState4CollectAsStateWithLifecycle) | composer2.changedInstance(navigator) | composer2.changedInstance(context);
                        if ((i6 & 7168) == 2048) {
                            z = true;
                        }
                        z2 = zChanged | z;
                        objRememberedValue = composer2.rememberedValue();
                        if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.shared.discover.section.LazyDiscoverRowListComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return LazyDiscoverRowListComposable4.LazyDiscoverRowListComposable$lambda$3$lambda$2(num, snapshotState4CollectAsStateWithLifecycle, navigator, context, (LazyListScope) obj);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        Composer composer3 = composer2;
                        Modifier modifier5 = modifier3;
                        LazyDslKt.LazyColumn(modifier5, scrollState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer3, ((i6 >> 12) & 14) | ((i6 << 3) & 112), 508);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier5;
                        composerStartRestartGroup = composer3;
                        discoverSectionDuxo4 = discoverSectionDuxo3;
                        fragmentTab3 = fragmentTab2;
                    } else {
                        fragmentTab2 = fragmentTab4;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 64) != 0) {
                        i5 &= -3670017;
                    }
                    fragmentTab2 = fragmentTab;
                    modifier3 = modifier2;
                }
                z = false;
                composer2 = composerStartRestartGroup;
                i6 = i5;
                discoverSectionDuxo3 = discoverSectionDuxo2;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(discoverSectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                navigator = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composer2.startReplaceGroup(-1224400529);
                boolean zChanged2 = composer2.changed(snapshotState4CollectAsStateWithLifecycle) | composer2.changedInstance(navigator) | composer2.changedInstance(context);
                if ((i6 & 7168) == 2048) {
                }
                z2 = zChanged2 | z;
                objRememberedValue = composer2.rememberedValue();
                if (!z2) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.discover.section.LazyDiscoverRowListComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LazyDiscoverRowListComposable4.LazyDiscoverRowListComposable$lambda$3$lambda$2(num, snapshotState4CollectAsStateWithLifecycle, navigator, context, (LazyListScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                    composer2.endReplaceGroup();
                    Composer composer32 = composer2;
                    Modifier modifier52 = modifier3;
                    LazyDslKt.LazyColumn(modifier52, scrollState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer32, ((i6 >> 12) & 14) | ((i6 << 3) & 112), 508);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier52;
                    composerStartRestartGroup = composer32;
                    discoverSectionDuxo4 = discoverSectionDuxo3;
                    fragmentTab3 = fragmentTab2;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                discoverSectionDuxo4 = discoverSectionDuxo2;
                fragmentTab3 = fragmentTab;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.discover.section.LazyDiscoverRowListComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LazyDiscoverRowListComposable4.LazyDiscoverRowListComposable$lambda$4(scrollState, assetType, category, num, modifier4, fragmentTab3, discoverSectionDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        i4 = i2 & 32;
        int i82 = 196608;
        if (i4 != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        i5 = i3;
        if ((599187 & i5) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyDiscoverRowListComposable$lambda$3$lambda$2(Integer num, SnapshotState4 snapshotState4, Navigator navigator, Context context, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        ImmutableList<DiscoverRow> rowList = LazyDiscoverRowListComposable$lambda$0(snapshotState4).getRowList();
        if (rowList != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rowList, 10));
            for (final DiscoverRow discoverRow : rowList) {
                if (discoverRow instanceof DiscoverRow.Loading) {
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(143397664, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.discover.section.LazyDiscoverRowListComposableKt$LazyDiscoverRowListComposable$1$1$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num2) {
                            invoke(lazyItemScope, composer, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope item, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(143397664, i, -1, "com.robinhood.shared.discover.section.LazyDiscoverRowListComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LazyDiscoverRowListComposable.kt:46)");
                            }
                            final DiscoverRow discoverRow2 = discoverRow;
                            LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(-1835339600, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.discover.section.LazyDiscoverRowListComposableKt$LazyDiscoverRowListComposable$1$1$1$1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                                    invoke(composer2, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i2) {
                                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1835339600, i2, -1, "com.robinhood.shared.discover.section.LazyDiscoverRowListComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LazyDiscoverRowListComposable.kt:47)");
                                    }
                                    DiscoverRow2.DiscoverRowComposable(((DiscoverRow.Loading) discoverRow2).getDefaultLoadingState(), null, composer2, 0, 2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer, 54), composer, 3078, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                } else {
                    if (!(discoverRow instanceof DiscoverRow.Loaded)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(60881225, true, new LazyDiscoverRowListComposable6(discoverRow, navigator, context)), 3, null);
                }
                arrayList.add(Unit.INSTANCE);
            }
        }
        ImmutableList<DiscoverRow> rowList2 = LazyDiscoverRowListComposable$lambda$0(snapshotState4).getRowList();
        Integer numValueOf = rowList2 != null ? Integer.valueOf(rowList2.size()) : null;
        if (num != null && numValueOf != null && numValueOf.intValue() <= num.intValue()) {
            LazyListScope.item$default(LazyColumn, null, null, LazyDiscoverRowListComposable.INSTANCE.m25300getLambda$771454282$lib_discover_externalDebug(), 3, null);
        }
        return Unit.INSTANCE;
    }

    private static final DiscoverSectionViewState LazyDiscoverRowListComposable$lambda$0(SnapshotState4<DiscoverSectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
