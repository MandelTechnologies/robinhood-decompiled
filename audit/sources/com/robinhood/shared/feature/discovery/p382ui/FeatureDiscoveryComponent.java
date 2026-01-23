package com.robinhood.shared.feature.discovery.p382ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.FeatureDiscoveryLocation;
import com.robinhood.models.serverdriven.experimental.api.FeatureDiscovery;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery2;
import com.robinhood.shared.feature.discovery.p382ui.FeatureDiscoveryViewState;
import com.robinhood.shared.feature.discovery.p382ui.FeatureDiscoveryWidget;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: FeatureDiscoveryComponent.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a&\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002"}, m3636d2 = {"FeatureDiscoveryComponent", "", "location", "Lcom/robinhood/models/api/FeatureDiscoveryLocation;", "accountNumber", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/feature/discovery/ui/FeatureDiscoveryDuxo;", "(Lcom/robinhood/models/api/FeatureDiscoveryLocation;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/feature/discovery/ui/FeatureDiscoveryDuxo;Landroidx/compose/runtime/Composer;II)V", "featureDiscoveryContent", "Landroidx/compose/foundation/lazy/LazyListScope;", "lib-feature-discovery_externalDebug", "viewState", "Lcom/robinhood/shared/feature/discovery/ui/FeatureDiscoveryViewState;", "isExpanded", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryComponentKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class FeatureDiscoveryComponent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeatureDiscoveryComponent$lambda$7(FeatureDiscoveryLocation featureDiscoveryLocation, String str, Modifier modifier, FeatureDiscoveryDuxo featureDiscoveryDuxo, int i, int i2, Composer composer, int i3) {
        FeatureDiscoveryComponent(featureDiscoveryLocation, str, modifier, featureDiscoveryDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0292  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FeatureDiscoveryComponent(final FeatureDiscoveryLocation location, final String str, Modifier modifier, FeatureDiscoveryDuxo featureDiscoveryDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        FeatureDiscoveryDuxo featureDiscoveryDuxo2;
        Modifier modifier3;
        int i4;
        FeatureDiscoveryDuxo featureDiscoveryDuxo3;
        Object objRememberedValue;
        Composer.Companion companion;
        FeatureDiscoveryViewState featureDiscoveryViewStateFeatureDiscoveryComponent$lambda$0;
        int i5;
        int i6;
        boolean z;
        Modifier modifier4;
        boolean z2;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final FeatureDiscoveryDuxo featureDiscoveryDuxo4;
        final Modifier modifier5;
        int i7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(location, "location");
        Composer composerStartRestartGroup = composer.startRestartGroup(1795739435);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(location.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    featureDiscoveryDuxo2 = featureDiscoveryDuxo;
                    int i9 = composerStartRestartGroup.changedInstance(featureDiscoveryDuxo2) ? 2048 : 1024;
                    i3 |= i9;
                } else {
                    featureDiscoveryDuxo2 = featureDiscoveryDuxo;
                }
                i3 |= i9;
            } else {
                featureDiscoveryDuxo2 = featureDiscoveryDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        String str2 = "feature_discovery_" + location.getServerValue() + "_" + str;
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(FeatureDiscoveryDuxo.class), current, str2, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryComponentKt$FeatureDiscoveryComponent$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryComponentKt$FeatureDiscoveryComponent$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i4 = i3 & (-7169);
                        featureDiscoveryDuxo3 = (FeatureDiscoveryDuxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1795739435, i4, -1, "com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryComponent (FeatureDiscoveryComponent.kt:22)");
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(featureDiscoveryDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        Object[] objArr = {location};
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryComponentKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FeatureDiscoveryComponent.FeatureDiscoveryComponent$lambda$2$lambda$1();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Composer composer2 = composerStartRestartGroup;
                        final SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                        featureDiscoveryViewStateFeatureDiscoveryComponent$lambda$0 = FeatureDiscoveryComponent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        composer2.startReplaceGroup(-871240282);
                        if (featureDiscoveryViewStateFeatureDiscoveryComponent$lambda$0 instanceof FeatureDiscoveryViewState.Loaded) {
                            composerStartRestartGroup = composer2;
                            i5 = i4;
                            i6 = 32;
                            z = false;
                            modifier4 = modifier3;
                            z2 = true;
                            if (!Intrinsics.areEqual(featureDiscoveryViewStateFeatureDiscoveryComponent$lambda$0, FeatureDiscoveryViewState.Loading.INSTANCE) && !Intrinsics.areEqual(featureDiscoveryViewStateFeatureDiscoveryComponent$lambda$0, FeatureDiscoveryViewState.NoContent.INSTANCE)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            UIComponent<GenericAction> component = ((FeatureDiscoveryViewState.Loaded) featureDiscoveryViewStateFeatureDiscoveryComponent$lambda$0).getComponent();
                            boolean zFeatureDiscoveryComponent$lambda$3 = FeatureDiscoveryComponent$lambda$3(snapshotState);
                            composer2.startReplaceGroup(5004770);
                            boolean zChanged = composer2.changed(snapshotState);
                            Object objRememberedValue4 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new SduiFeatureDiscovery2() { // from class: com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryComponentKt$FeatureDiscoveryComponent$1$1
                                    @Override // com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery2
                                    public final void onExpanded(boolean z3) {
                                        FeatureDiscoveryComponent.FeatureDiscoveryComponent$lambda$4(snapshotState, z3);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            SduiFeatureDiscovery2 sduiFeatureDiscovery2 = (SduiFeatureDiscovery2) objRememberedValue4;
                            composer2.endReplaceGroup();
                            int i10 = i4 >> 3;
                            composer2.startReplaceGroup(-2135521369);
                            SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composer2, 0);
                            if (component instanceof FeatureDiscovery) {
                                composer2.startReplaceGroup(2033818501);
                                ProvidedValue<?>[] providedValueArrProvidedValues = SduiColumns.providedValues(GenericAction.class, null);
                                modifier4 = modifier3;
                                z2 = true;
                                CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArrProvidedValues, providedValueArrProvidedValues.length), ComposableLambda3.rememberComposableLambda(-919485118, true, new FeatureDiscoveryWidget.C389571(component, sduiActionHandlerCurrentActionHandler, modifier4, zFeatureDiscoveryComponent$lambda$3, sduiFeatureDiscovery2), composer2, 54), composer2, ProvidedValue.$stable | 48);
                                composer2.endReplaceGroup();
                                composerStartRestartGroup = composer2;
                                i5 = i4;
                                i7 = 32;
                                z = false;
                            } else {
                                Modifier modifier6 = modifier3;
                                z2 = true;
                                composer2.startReplaceGroup(2034805293);
                                ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(component);
                                composer2.startReplaceGroup(-1772220517);
                                int i11 = ((((i10 & 112) | 12582912) << 3) & 896) | 100663296;
                                z = false;
                                i7 = 32;
                                i5 = i4;
                                SduiColumns.SduiColumn(immutableList3PersistentListOf, GenericAction.class, modifier6, null, sduiActionHandlerCurrentActionHandler, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer2, i11, 0);
                                modifier4 = modifier6;
                                composerStartRestartGroup = composer2;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            i6 = i7;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        zChangedInstance = composerStartRestartGroup.changedInstance(featureDiscoveryDuxo3) | ((i5 & 14) != 4 ? z2 : z) | ((i5 & 112) != i6 ? z2 : z);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new FeatureDiscoveryComponent3(featureDiscoveryDuxo3, location, str, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(location, str, (Function2) objRememberedValue2, composerStartRestartGroup, i5 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        featureDiscoveryDuxo4 = featureDiscoveryDuxo3;
                        modifier5 = modifier4;
                    } else {
                        i4 = i3;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                }
                featureDiscoveryDuxo3 = featureDiscoveryDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(featureDiscoveryDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Object[] objArr2 = {location};
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Composer composer22 = composerStartRestartGroup;
                final SnapshotState<Boolean> snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                featureDiscoveryViewStateFeatureDiscoveryComponent$lambda$0 = FeatureDiscoveryComponent$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                composer22.startReplaceGroup(-871240282);
                if (featureDiscoveryViewStateFeatureDiscoveryComponent$lambda$0 instanceof FeatureDiscoveryViewState.Loaded) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(featureDiscoveryDuxo3) | ((i5 & 14) != 4 ? z2 : z) | ((i5 & 112) != i6 ? z2 : z);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue2 = new FeatureDiscoveryComponent3(featureDiscoveryDuxo3, location, str, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(location, str, (Function2) objRememberedValue2, composerStartRestartGroup, i5 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    featureDiscoveryDuxo4 = featureDiscoveryDuxo3;
                    modifier5 = modifier4;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
                featureDiscoveryDuxo4 = featureDiscoveryDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryComponentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FeatureDiscoveryComponent.FeatureDiscoveryComponent$lambda$7(location, str, modifier5, featureDiscoveryDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState FeatureDiscoveryComponent$lambda$2$lambda$1() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FeatureDiscoveryComponent$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    public static /* synthetic */ void featureDiscoveryContent$default(LazyListScope lazyListScope, FeatureDiscoveryLocation featureDiscoveryLocation, String str, Modifier modifier, int i, Object obj) {
        if ((i & 4) != 0) {
            modifier = Modifier.INSTANCE;
        }
        featureDiscoveryContent(lazyListScope, featureDiscoveryLocation, str, modifier);
    }

    public static final void featureDiscoveryContent(LazyListScope lazyListScope, final FeatureDiscoveryLocation location, final String str, final Modifier modifier) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        LazyListScope.item$default(lazyListScope, location.getServerValue() + "_feature_discovery_" + str, null, ComposableLambda3.composableLambdaInstance(-121946342, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryComponentKt.featureDiscoveryContent.1
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
                    ComposerKt.traceEventStart(-121946342, i, -1, "com.robinhood.shared.feature.discovery.ui.featureDiscoveryContent.<anonymous> (FeatureDiscoveryComponent.kt:59)");
                }
                FeatureDiscoveryComponent.FeatureDiscoveryComponent(location, str, modifier, null, composer, 0, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
    }

    private static final FeatureDiscoveryViewState FeatureDiscoveryComponent$lambda$0(SnapshotState4<? extends FeatureDiscoveryViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean FeatureDiscoveryComponent$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
