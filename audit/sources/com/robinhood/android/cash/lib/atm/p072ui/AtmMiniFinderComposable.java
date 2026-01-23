package com.robinhood.android.cash.lib.atm.p072ui;

import android.content.Context;
import androidx.compose.animation.Crossfade;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
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
import com.google.accompanist.permissions.MultiplePermissionsState;
import com.google.accompanist.permissions.MultiplePermissionsState2;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionsUtil2;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.MapProperties;
import com.google.maps.android.compose.MapUiSettings;
import com.google.maps.android.compose.MarkerKt;
import com.google.maps.android.compose.MarkerState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cash.lib.atm.C10113R;
import com.robinhood.android.cash.lib.atm.p072ui.MapPinDrawableFactory;
import com.robinhood.android.compose.maps.StyleableMapComposable3;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AtmMiniFinderComposable.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a;\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u0010\u000f\u001a\u001f\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0013\u001a\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\"\u0010\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001b¨\u0006\u001c²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, m3636d2 = {"AtmMiniFinderComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "duxo", "Lcom/robinhood/android/cash/lib/atm/ui/AtmMiniFinderV2Duxo;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/android/cash/lib/atm/ui/AtmMiniFinderV2Duxo;Landroidx/compose/runtime/Composer;II)V", "AtmMiniFinder", "viewState", "Lcom/robinhood/android/cash/lib/atm/ui/AtmMiniFinderV2ViewState;", "onLocationPermissionStatus", "Lkotlin/Function1;", "", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/android/cash/lib/atm/ui/AtmMiniFinderV2ViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "AtmMiniFinderMap", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/cash/lib/atm/ui/AtmMiniFinderV2ViewState;Landroidx/compose/runtime/Composer;II)V", "AtmMiniFinderNeedsPermission", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "generateMarkerIcon", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "isHighlighted", "mapPinDrawableFactory", "Lcom/robinhood/android/cash/lib/atm/ui/MapPinDrawableFactory;", "MiniFinderHeight", "Landroidx/compose/ui/unit/Dp;", "F", "lib-cash-atm_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AtmMiniFinderComposable {
    private static final float MiniFinderHeight = C2002Dp.m7995constructorimpl(200);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AtmMiniFinder$lambda$9(Modifier modifier, Navigator navigator, AtmMiniFinderV2ViewState atmMiniFinderV2ViewState, Function1 function1, int i, int i2, Composer composer, int i3) {
        AtmMiniFinder(modifier, navigator, atmMiniFinderV2ViewState, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AtmMiniFinderComposable$lambda$3(Modifier modifier, Navigator navigator, AtmMiniFinderV2Duxo atmMiniFinderV2Duxo, int i, int i2, Composer composer, int i3) {
        AtmMiniFinderComposable(modifier, navigator, atmMiniFinderV2Duxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AtmMiniFinderMap$lambda$12(Modifier modifier, AtmMiniFinderV2ViewState atmMiniFinderV2ViewState, int i, int i2, Composer composer, int i3) {
        AtmMiniFinderMap(modifier, atmMiniFinderV2ViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AtmMiniFinderNeedsPermission$lambda$15(Modifier modifier, int i, int i2, Composer composer, int i3) {
        AtmMiniFinderNeedsPermission(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AtmMiniFinderComposable(Modifier modifier, final Navigator navigator, AtmMiniFinderV2Duxo atmMiniFinderV2Duxo, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        AtmMiniFinderV2Duxo atmMiniFinderV2Duxo2;
        Modifier modifier3;
        CreationExtras defaultViewModelCreationExtras;
        final AtmMiniFinderV2Duxo atmMiniFinderV2Duxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier4;
        final AtmMiniFinderV2Duxo atmMiniFinderV2Duxo4;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Composer composerStartRestartGroup = composer.startRestartGroup(803972167);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                atmMiniFinderV2Duxo2 = atmMiniFinderV2Duxo;
                int i5 = composerStartRestartGroup.changedInstance(atmMiniFinderV2Duxo2) ? 256 : 128;
                i3 |= i5;
            } else {
                atmMiniFinderV2Duxo2 = atmMiniFinderV2Duxo;
            }
            i3 |= i5;
        } else {
            atmMiniFinderV2Duxo2 = atmMiniFinderV2Duxo;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 4) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AtmMiniFinderV2Duxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderComposableKt$AtmMiniFinderComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderComposableKt$AtmMiniFinderComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    i3 &= -897;
                    atmMiniFinderV2Duxo3 = (AtmMiniFinderV2Duxo) baseDuxo;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(803972167, i3, -1, "com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderComposable (AtmMiniFinderComposable.kt:53)");
                }
                AtmMiniFinderV2ViewState atmMiniFinderV2ViewStateAtmMiniFinderComposable$lambda$0 = AtmMiniFinderComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(atmMiniFinderV2Duxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(atmMiniFinderV2Duxo3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AtmMiniFinderComposable.AtmMiniFinderComposable$lambda$2$lambda$1(atmMiniFinderV2Duxo3, ((Boolean) obj).booleanValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                int i6 = i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                Modifier modifier5 = modifier3;
                AtmMiniFinder(modifier5, navigator, atmMiniFinderV2ViewStateAtmMiniFinderComposable$lambda$0, function1, composerStartRestartGroup, i6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier5;
                atmMiniFinderV2Duxo4 = atmMiniFinderV2Duxo3;
            }
            atmMiniFinderV2Duxo3 = atmMiniFinderV2Duxo2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            AtmMiniFinderV2ViewState atmMiniFinderV2ViewStateAtmMiniFinderComposable$lambda$02 = AtmMiniFinderComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(atmMiniFinderV2Duxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChangedInstance = composerStartRestartGroup.changedInstance(atmMiniFinderV2Duxo3);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AtmMiniFinderComposable.AtmMiniFinderComposable$lambda$2$lambda$1(atmMiniFinderV2Duxo3, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                Function1 function12 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                int i62 = i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                Modifier modifier52 = modifier3;
                AtmMiniFinder(modifier52, navigator, atmMiniFinderV2ViewStateAtmMiniFinderComposable$lambda$02, function12, composerStartRestartGroup, i62, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier52;
                atmMiniFinderV2Duxo4 = atmMiniFinderV2Duxo3;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier4 = modifier2;
            atmMiniFinderV2Duxo4 = atmMiniFinderV2Duxo2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AtmMiniFinderComposable.AtmMiniFinderComposable$lambda$3(modifier4, navigator, atmMiniFinderV2Duxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AtmMiniFinderComposable$lambda$2$lambda$1(AtmMiniFinderV2Duxo atmMiniFinderV2Duxo, boolean z) {
        atmMiniFinderV2Duxo.setLocationStatus(z);
        return Unit.INSTANCE;
    }

    private static final void AtmMiniFinder(Modifier modifier, final Navigator navigator, final AtmMiniFinderV2ViewState atmMiniFinderV2ViewState, final Function1<? super Boolean, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(932484761);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigator) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(atmMiniFinderV2ViewState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(932484761, i3, -1, "com.robinhood.android.cash.lib.atm.ui.AtmMiniFinder (AtmMiniFinderComposable.kt:70)");
            }
            MultiplePermissionsState multiplePermissionsStateRememberMultiplePermissionsState = MultiplePermissionsState2.rememberMultiplePermissionsState(CollectionsKt.listOf((Object[]) new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}), null, composerStartRestartGroup, 6, 2);
            Boolean boolValueOf = Boolean.valueOf(AtmMiniFinder$hasGrantedLocationPermission(multiplePermissionsStateRememberMultiplePermissionsState));
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = ((i3 & 7168) == 2048) | composerStartRestartGroup.changed(multiplePermissionsStateRememberMultiplePermissionsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AtmMiniFinderComposable2(function1, multiplePermissionsStateRememberMultiplePermissionsState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AtmMiniFinderComposable.AtmMiniFinder$lambda$7$lambda$6(navigator, context);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifier5 = modifier4;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C10113R.string.atm_mini_finder_title, composerStartRestartGroup, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
            BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(StringResources_androidKt.stringResource(C10113R.string.atm_mini_finder_subtitle, composerStartRestartGroup, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1), null, null, 0, null, 0, 0, null, composerStartRestartGroup, 0, 508);
            composerStartRestartGroup = composerStartRestartGroup;
            Crossfade.Crossfade(Boolean.valueOf(AtmMiniFinder$hasGrantedLocationPermission(multiplePermissionsStateRememberMultiplePermissionsState)), (Modifier) null, (FiniteAnimationSpec<Float>) null, (String) null, ComposableLambda3.rememberComposableLambda(-2128534140, true, new AtmMiniFinderComposable3(multiplePermissionsStateRememberMultiplePermissionsState, atmMiniFinderV2ViewState, function0), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 14);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AtmMiniFinderComposable.AtmMiniFinder$lambda$9(modifier3, navigator, atmMiniFinderV2ViewState, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean AtmMiniFinder$hasGrantedLocationPermission(MultiplePermissionsState multiplePermissionsState) {
        List<PermissionState> permissions = multiplePermissionsState.getPermissions();
        if ((permissions instanceof Collection) && permissions.isEmpty()) {
            return false;
        }
        Iterator<T> it = permissions.iterator();
        while (it.hasNext()) {
            if (PermissionsUtil2.isGranted(((PermissionState) it.next()).getStatus())) {
                return true;
            }
        }
        return false;
    }

    private static final AtmMiniFinderV2ViewState AtmMiniFinderComposable$lambda$0(SnapshotState4<AtmMiniFinderV2ViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AtmMiniFinder$lambda$7$lambda$6(Navigator navigator, Context context) {
        Navigator.DefaultImpls.startActivity$default(navigator, context, LegacyIntentKey.AtmFinder.INSTANCE, null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AtmMiniFinderMap(Modifier modifier, final AtmMiniFinderV2ViewState atmMiniFinderV2ViewState, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(162567345);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(atmMiniFinderV2ViewState) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(162567345, i3, -1, "com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderMap (AtmMiniFinderComposable.kt:157)");
            }
            final MapPinDrawableFactory mapPinDrawableFactory = new MapPinDrawableFactory((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
            composerStartRestartGroup.startReplaceableGroup(-1911106014);
            final CameraPositionState cameraPositionState = (CameraPositionState) RememberSaveable.m6426rememberSaveable(new Object[0], (Saver) CameraPositionState.INSTANCE.getSaver(), (String) null, (Function0) new Function0<CameraPositionState>() { // from class: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderComposableKt$AtmMiniFinderMap$$inlined$rememberCameraPositionState$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final CameraPositionState invoke() {
                    return new CameraPositionState(null, 1, null);
                }
            }, composerStartRestartGroup, 72, 0);
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(cameraPositionState) | composerStartRestartGroup.changedInstance(atmMiniFinderV2ViewState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AtmMiniFinderComposable.AtmMiniFinderMap$lambda$11$lambda$10(cameraPositionState, atmMiniFinderV2ViewState, (LayoutCoordinates) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            modifier3 = modifier4;
            composer2 = composerStartRestartGroup;
            StyleableMapComposable3.StyleableMapComposable(OnGloballyPositionedModifier3.onGloballyPositioned(modifierFillMaxSize$default, (Function1) objRememberedValue), cameraPositionState, null, null, new MapProperties(false, false, true, false, null, null, null, 0.0f, 0.0f, 507, null), null, new MapUiSettings(false, false, false, false, false, false, false, false, false, false), null, null, null, null, null, null, null, null, false, ComposableLambda3.rememberComposableLambda(1790722777, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderComposableKt.AtmMiniFinderMap.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1790722777, i5, -1, "com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderMap.<anonymous> (AtmMiniFinderComposable.kt:185)");
                    }
                    List<LatLng> atmPositions = atmMiniFinderV2ViewState.getAtmPositions();
                    MapPinDrawableFactory mapPinDrawableFactory2 = mapPinDrawableFactory;
                    int i6 = 0;
                    for (Object obj : atmPositions) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        MarkerKt.m9322Markerqld6geY(new MarkerState((LatLng) obj), null, 0.0f, 0L, false, true, AtmMiniFinderComposable.generateMarkerIcon(i6 == 0, mapPinDrawableFactory2), 0L, 0.0f, null, null, null, false, 0.0f, null, null, null, null, composer3, MarkerState.$stable | 221184, 0, 262030);
                        i6 = i7;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, (CameraPositionState.$stable << 3) | (MapProperties.$stable << 12) | (MapUiSettings.$stable << 18), 1572864, 65452);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AtmMiniFinderComposable.AtmMiniFinderMap$lambda$12(modifier3, atmMiniFinderV2ViewState, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AtmMiniFinderMap$lambda$11$lambda$10(CameraPositionState cameraPositionState, AtmMiniFinderV2ViewState atmMiniFinderV2ViewState, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (((int) (it.mo7241getSizeYbymL2g() & 4294967295L)) > 0 && ((int) (it.mo7241getSizeYbymL2g() >> 32)) > 0) {
            cameraPositionState.move(atmMiniFinderV2ViewState.getLatLngZoom());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AtmMiniFinderNeedsPermission(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1812880174);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1812880174, i3, -1, "com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderNeedsPermission (AtmMiniFinderComposable.kt:202)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(modifier3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM());
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifier4 = modifier3;
            ImageKt.Image(PainterResources_androidKt.painterResource(C10113R.drawable.svg_location_pin, composerStartRestartGroup, 0), (String) null, SizeKt.m5158heightInVpY3zN4$default(companion3, C2002Dp.m7995constructorimpl(110), 0.0f, 2, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, 120);
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C10113R.string.atm_mini_finder_permission_text, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextL(), composer2, 0, 0, 8186);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C10113R.string.atm_mini_finder_permission_cta, composer2, 0), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(bentoTheme.getColors(composer2, i5).getPrime()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, 24576, 0, 8168);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AtmMiniFinderComposable.AtmMiniFinderNeedsPermission$lambda$15(modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BitmapDescriptor generateMarkerIcon(boolean z, MapPinDrawableFactory mapPinDrawableFactory) {
        BitmapDescriptor bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(mapPinDrawableFactory.generateBitmap(MapPinDrawableFactory.Type.INSTANCE.fromHighlighted(z)));
        Intrinsics.checkNotNullExpressionValue(bitmapDescriptorFromBitmap, "fromBitmap(...)");
        return bitmapDescriptorFromBitmap;
    }
}
