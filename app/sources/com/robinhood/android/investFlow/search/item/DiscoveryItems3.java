package com.robinhood.android.investFlow.search.item;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
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
import com.robinhood.android.investFlow.search.item.DiscoveryItemViewState;
import com.robinhood.android.investFlow.search.item.DiscoveryItems3;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.Haptics;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: DiscoveryItems.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\"\u0010\u0010\u001a\u00020\f*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n\"\u0015\u0010\u0013\u001a\u00020\u0014*\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u0015\u0010\u0017\u001a\u00020\u0014*\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002"}, m3636d2 = {"DiscoveryItem", "", "assetId", "Ljava/util/UUID;", "selectedIds", "Lkotlinx/collections/immutable/ImmutableList;", "listId", ResourceTypes.STYLE, "Lcom/robinhood/android/investFlow/search/item/DiscoveryItemStyle;", "callbacks", "Lcom/robinhood/android/investFlow/search/item/DiscoveryItemCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/investFlow/search/item/DiscoveryItemDuxo;", "(Ljava/util/UUID;Lkotlinx/collections/immutable/ImmutableList;Ljava/util/UUID;Lcom/robinhood/android/investFlow/search/item/DiscoveryItemStyle;Lcom/robinhood/android/investFlow/search/item/DiscoveryItemCallbacks;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/investFlow/search/item/DiscoveryItemDuxo;Landroidx/compose/runtime/Composer;II)V", "discoveryItemClickable", "state", "Lcom/robinhood/android/investFlow/search/item/DiscoveryItemViewState;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "getBackgroundColor", "(Lcom/robinhood/android/investFlow/search/item/DiscoveryItemViewState;Landroidx/compose/runtime/Composer;I)J", "borderColor", "getBorderColor", "feature-invest-flow_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investFlow.search.item.DiscoveryItemsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class DiscoveryItems3 {

    /* compiled from: DiscoveryItems.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.investFlow.search.item.DiscoveryItemsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DiscoveryItems2.values().length];
            try {
                iArr[DiscoveryItems2.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DiscoveryItems2.Chip.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiscoveryItem$lambda$4(UUID uuid, ImmutableList immutableList, UUID uuid2, DiscoveryItems2 discoveryItems2, DiscoveryItems discoveryItems, Modifier modifier, DiscoveryItemDuxo discoveryItemDuxo, int i, int i2, Composer composer, int i3) {
        DiscoveryItem(uuid, immutableList, uuid2, discoveryItems2, discoveryItems, modifier, discoveryItemDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DiscoveryItem(final UUID assetId, final ImmutableList<UUID> selectedIds, final UUID listId, final DiscoveryItems2 style, final DiscoveryItems callbacks, Modifier modifier, DiscoveryItemDuxo discoveryItemDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final DiscoveryItemDuxo discoveryItemDuxo2;
        Composer composer2;
        int i4;
        Modifier modifier3;
        DiscoveryItemDuxo discoveryItemDuxo3;
        int i5;
        int i6;
        Modifier modifier4;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(163927360);
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
            i3 |= composerStartRestartGroup.changedInstance(selectedIds) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(listId) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(style.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 16384 : 8192;
        }
        int i7 = i2 & 32;
        if (i7 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    discoveryItemDuxo2 = discoveryItemDuxo;
                    int i8 = composerStartRestartGroup.changedInstance(discoveryItemDuxo2) ? 1048576 : 524288;
                    i3 |= i8;
                } else {
                    discoveryItemDuxo2 = discoveryItemDuxo;
                }
                i3 |= i8;
            } else {
                discoveryItemDuxo2 = discoveryItemDuxo;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier6 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 64) == 0) {
                        String str = "invest_flow_" + listId + "_asset_" + assetId;
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(DiscoveryItemDuxo.class), current, str, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryItemsKt$DiscoveryItem$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryItemsKt$DiscoveryItem$$inlined$duxo$1.1
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
                        discoveryItemDuxo3 = (DiscoveryItemDuxo) baseDuxo;
                        Modifier modifier7 = modifier6;
                        i4 = i3 & (-3670017);
                        modifier3 = modifier7;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(163927360, i4, -1, "com.robinhood.android.investFlow.search.item.DiscoveryItem (DiscoveryItems.kt:51)");
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(discoveryItemDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                        i5 = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
                        if (i5 != 1) {
                            discoveryItemDuxo2 = discoveryItemDuxo3;
                            i6 = i4;
                            composer2.startReplaceGroup(-1379583595);
                            int i9 = i6 >> 6;
                            DiscoveryCards3.InvestFlowCard(DiscoveryItem$lambda$0(snapshotState4CollectAsStateWithLifecycle), listId, callbacks, modifier3, composer2, ((i6 >> 3) & 112) | (i9 & 896) | (i9 & 7168), 0);
                            modifier4 = modifier3;
                            composer2.endReplaceGroup();
                        } else {
                            if (i5 != 2) {
                                composer2.startReplaceGroup(-1379584953);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(-1379577643);
                            int i10 = i4 >> 6;
                            int i11 = ((i4 >> 3) & 112) | (i10 & 896) | (i10 & 7168);
                            i6 = i4;
                            discoveryItemDuxo2 = discoveryItemDuxo3;
                            DiscoveryChips.InvestFlowChip(DiscoveryItem$lambda$0(snapshotState4CollectAsStateWithLifecycle), listId, callbacks, modifier3, composer2, i11, 0);
                            composer2.endReplaceGroup();
                            modifier4 = modifier3;
                        }
                        composer2.startReplaceGroup(-1746271574);
                        zChangedInstance = composer2.changedInstance(discoveryItemDuxo2) | composer2.changedInstance(assetId) | composer2.changedInstance(selectedIds);
                        objRememberedValue = composer2.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryItemsKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return DiscoveryItems3.DiscoveryItem$lambda$3$lambda$2(discoveryItemDuxo2, assetId, selectedIds, (LifecycleResumePauseEffectScope) obj);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        LifecycleEffectKt.LifecycleResumeEffect(assetId, selectedIds, null, (Function1) objRememberedValue, composer2, i6 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier4;
                    } else {
                        composer2 = composerStartRestartGroup;
                        Modifier modifier8 = modifier6;
                        i4 = i3;
                        modifier3 = modifier8;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    i4 = i3;
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                }
                discoveryItemDuxo3 = discoveryItemDuxo2;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(discoveryItemDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                i5 = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
                if (i5 != 1) {
                }
                composer2.startReplaceGroup(-1746271574);
                zChangedInstance = composer2.changedInstance(discoveryItemDuxo2) | composer2.changedInstance(assetId) | composer2.changedInstance(selectedIds);
                objRememberedValue = composer2.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryItemsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return DiscoveryItems3.DiscoveryItem$lambda$3$lambda$2(discoveryItemDuxo2, assetId, selectedIds, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                    composer2.endReplaceGroup();
                    LifecycleEffectKt.LifecycleResumeEffect(assetId, selectedIds, null, (Function1) objRememberedValue, composer2, i6 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 4);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier5 = modifier4;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier5 = modifier2;
            }
            final DiscoveryItemDuxo discoveryItemDuxo4 = discoveryItemDuxo2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryItemsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DiscoveryItems3.DiscoveryItem$lambda$4(assetId, selectedIds, listId, style, callbacks, modifier5, discoveryItemDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((1572864 & i) != 0) {
        }
        if ((599187 & i3) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
            }
        }
        final DiscoveryItemDuxo discoveryItemDuxo42 = discoveryItemDuxo2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult DiscoveryItem$lambda$3$lambda$2(final DiscoveryItemDuxo discoveryItemDuxo, UUID uuid, ImmutableList immutableList, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        discoveryItemDuxo.setData(uuid, immutableList);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryItemsKt$DiscoveryItem$lambda$3$lambda$2$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                discoveryItemDuxo.onDispose();
            }
        };
    }

    /* compiled from: DiscoveryItems.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.investFlow.search.item.DiscoveryItemsKt$discoveryItemClickable$1 */
    static final class C194201 implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ DiscoveryItems $callbacks;
        final /* synthetic */ UUID $listId;
        final /* synthetic */ DiscoveryItemViewState $state;

        C194201(DiscoveryItemViewState discoveryItemViewState, DiscoveryItems discoveryItems, UUID uuid) {
            this.$state = discoveryItemViewState;
            this.$callbacks = discoveryItems;
            this.$listId = uuid;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier composed, Composer composer, int i) {
            Modifier modifierM4897combinedClickablef5TDLPQ$default;
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceGroup(2056215122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2056215122, i, -1, "com.robinhood.android.investFlow.search.item.discoveryItemClickable.<anonymous> (DiscoveryItems.kt:85)");
            }
            DiscoveryItemViewState discoveryItemViewState = this.$state;
            if (discoveryItemViewState instanceof DiscoveryItemViewState.Loaded) {
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(this.$state) | composer.changedInstance(this.$callbacks) | composer.changedInstance(this.$listId);
                final DiscoveryItemViewState discoveryItemViewState2 = this.$state;
                final DiscoveryItems discoveryItems = this.$callbacks;
                final UUID uuid = this.$listId;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryItemsKt$discoveryItemClickable$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DiscoveryItems3.C194201.invoke$lambda$1$lambda$0(discoveryItemViewState2, discoveryItems, uuid);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Function0<Unit> function0HapticClick = Haptics.hapticClick((Function0) objRememberedValue, composer, 0);
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance2 = composer.changedInstance(this.$callbacks) | composer.changedInstance(this.$state) | composer.changedInstance(this.$listId);
                final DiscoveryItems discoveryItems2 = this.$callbacks;
                final DiscoveryItemViewState discoveryItemViewState3 = this.$state;
                final UUID uuid2 = this.$listId;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryItemsKt$discoveryItemClickable$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DiscoveryItems3.C194201.invoke$lambda$3$lambda$2(discoveryItems2, discoveryItemViewState3, uuid2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                modifierM4897combinedClickablef5TDLPQ$default = ClickableKt.m4897combinedClickablef5TDLPQ$default(composed, true, null, null, null, null, (Function0) objRememberedValue2, false, function0HapticClick, 94, null);
            } else {
                if (!(discoveryItemViewState instanceof DiscoveryItemViewState.Loading)) {
                    throw new NoWhenBranchMatchedException();
                }
                modifierM4897combinedClickablef5TDLPQ$default = composed;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierM4897combinedClickablef5TDLPQ$default;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(DiscoveryItemViewState discoveryItemViewState, DiscoveryItems discoveryItems, UUID uuid) {
            DiscoveryItemViewState.Loaded loaded = (DiscoveryItemViewState.Loaded) discoveryItemViewState;
            discoveryItems.onItemClicked(loaded.getId(), loaded.getSelected(), uuid);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(DiscoveryItems discoveryItems, DiscoveryItemViewState discoveryItemViewState, UUID uuid) {
            discoveryItems.onItemDoubleClicked(((DiscoveryItemViewState.Loaded) discoveryItemViewState).getId(), uuid);
            return Unit.INSTANCE;
        }
    }

    private static final DiscoveryItemViewState DiscoveryItem$lambda$0(SnapshotState4<? extends DiscoveryItemViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    public static final Modifier discoveryItemClickable(Modifier modifier, DiscoveryItemViewState state, UUID listId, DiscoveryItems callbacks) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        return ComposedModifier2.composed$default(modifier, null, new C194201(state, callbacks, listId), 1, null);
    }

    @JvmName
    public static final long getBackgroundColor(DiscoveryItemViewState discoveryItemViewState, Composer composer, int i) {
        long jM21371getBg0d7_KjU;
        Intrinsics.checkNotNullParameter(discoveryItemViewState, "<this>");
        composer.startReplaceGroup(-2129680701);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2129680701, i, -1, "com.robinhood.android.investFlow.search.item.<get-backgroundColor> (DiscoveryItems.kt:106)");
        }
        if (discoveryItemViewState.getSelected()) {
            composer.startReplaceGroup(-60828134);
            jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21372getBg20d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-60785509);
            jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21371getBg0d7_KjU;
    }

    @JvmName
    public static final long getBorderColor(DiscoveryItemViewState discoveryItemViewState, Composer composer, int i) {
        long jM21373getBg30d7_KjU;
        Intrinsics.checkNotNullParameter(discoveryItemViewState, "<this>");
        composer.startReplaceGroup(-364892473);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-364892473, i, -1, "com.robinhood.android.investFlow.search.item.<get-borderColor> (DiscoveryItems.kt:114)");
        }
        if (discoveryItemViewState.getSelected()) {
            composer.startReplaceGroup(50601878);
            jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(50644534);
            jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21373getBg30d7_KjU;
    }
}
