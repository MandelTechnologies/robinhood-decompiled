package com.robinhood.android.equities.taxlots.appbar;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.equities.taxlots.C14807R;
import com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBar;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.EquityOrderContext;
import com.robinhood.rosetta.eventlogging.TaxLotsContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.common.contracts.OtherMarkdownFragmentKey;
import equity_trading_tax_lots.proto.p460v1.TaxLotStatus;
import java.util.UUID;
import kotlin.Metadata;
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
import kotlinx.coroutines.Job;
import okhttp3.HttpUrl;

/* compiled from: TaxLotsTopAppBar.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a_\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001aE\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0018\u001a/\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u001c\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001d²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002"}, m3636d2 = {"TOP_APP_BAR_BACK_BUTTON_TEST_TAG", "", "TaxLotsTopAppBar", "", "accountNumber", "orderId", "Ljava/util/UUID;", "instrumentId", "lotStatus", "Lequity_trading_tax_lots/proto/v1/TaxLotStatus;", "taxLotsContext", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext;", "onBackClick", "Lkotlin/Function0;", "topBarNestedScrollConnection", "Lcom/robinhood/android/equities/taxlots/appbar/TaxLotsTopAppBarNestedScrollConnection;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/equities/taxlots/appbar/SelectLotsTopAppBarDuxo;", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Lequity_trading_tax_lots/proto/v1/TaxLotStatus;Lcom/robinhood/rosetta/eventlogging/TaxLotsContext;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/equities/taxlots/appbar/TaxLotsTopAppBarNestedScrollConnection;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/equities/taxlots/appbar/SelectLotsTopAppBarDuxo;Landroidx/compose/runtime/Composer;II)V", "StaticAppBar", "toolbarState", "Lcom/robinhood/android/equities/taxlots/appbar/SelectLotsTopAppBarViewState;", "(Lcom/robinhood/android/equities/taxlots/appbar/TaxLotsTopAppBarNestedScrollConnection;Lcom/robinhood/android/equities/taxlots/appbar/SelectLotsTopAppBarViewState;Lkotlin/jvm/functions/Function0;Lequity_trading_tax_lots/proto/v1/TaxLotStatus;Lcom/robinhood/rosetta/eventlogging/TaxLotsContext;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CollapsingAppBar", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/ui/unit/Density;Lcom/robinhood/android/equities/taxlots/appbar/TaxLotsTopAppBarNestedScrollConnection;Lcom/robinhood/android/equities/taxlots/appbar/SelectLotsTopAppBarViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-tax-lots_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TaxLotsTopAppBar {
    public static final String TOP_APP_BAR_BACK_BUTTON_TEST_TAG = "select_Lots_Top_App_Bar_Back_Button";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CollapsingAppBar$lambda$19(Density density, TaxLotsTopAppBarNestedScrollConnection taxLotsTopAppBarNestedScrollConnection, SelectLotsTopAppBarViewState selectLotsTopAppBarViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CollapsingAppBar(density, taxLotsTopAppBarNestedScrollConnection, selectLotsTopAppBarViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StaticAppBar$lambda$8(TaxLotsTopAppBarNestedScrollConnection taxLotsTopAppBarNestedScrollConnection, SelectLotsTopAppBarViewState selectLotsTopAppBarViewState, Function0 function0, TaxLotStatus taxLotStatus, TaxLotsContext taxLotsContext, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StaticAppBar(taxLotsTopAppBarNestedScrollConnection, selectLotsTopAppBarViewState, function0, taxLotStatus, taxLotsContext, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsTopAppBar$lambda$5(String str, UUID uuid, UUID uuid2, TaxLotStatus taxLotStatus, TaxLotsContext taxLotsContext, Function0 function0, TaxLotsTopAppBarNestedScrollConnection taxLotsTopAppBarNestedScrollConnection, Modifier modifier, TaxLotsTopAppBarDuxo taxLotsTopAppBarDuxo, int i, int i2, Composer composer, int i3) {
        TaxLotsTopAppBar(str, uuid, uuid2, taxLotStatus, taxLotsContext, function0, taxLotsTopAppBarNestedScrollConnection, modifier, taxLotsTopAppBarDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TaxLotsTopAppBar(final String accountNumber, final UUID orderId, final UUID instrumentId, final TaxLotStatus lotStatus, final TaxLotsContext taxLotsContext, final Function0<Unit> onBackClick, final TaxLotsTopAppBarNestedScrollConnection topBarNestedScrollConnection, Modifier modifier, TaxLotsTopAppBarDuxo taxLotsTopAppBarDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        TaxLotsTopAppBarDuxo taxLotsTopAppBarDuxo2;
        Composer composer2;
        final TaxLotsTopAppBarDuxo taxLotsTopAppBarDuxo3;
        int i4;
        Modifier modifier3;
        boolean zChangedInstance;
        Object objRememberedValue;
        TaxLotsTopAppBarDuxo taxLotsTopAppBarDuxo4;
        Composer composer3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer4;
        final TaxLotsTopAppBarDuxo taxLotsTopAppBarDuxo5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(lotStatus, "lotStatus");
        Intrinsics.checkNotNullParameter(taxLotsContext, "taxLotsContext");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(topBarNestedScrollConnection, "topBarNestedScrollConnection");
        Composer composerStartRestartGroup = composer.startRestartGroup(-615941061);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(orderId) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(instrumentId) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(lotStatus.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(taxLotsContext) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(topBarNestedScrollConnection) ? 1048576 : 524288;
        }
        int i5 = i2 & 128;
        if (i5 == 0) {
            if ((12582912 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            }
            if ((i & 100663296) != 0) {
                if ((i2 & 256) == 0) {
                    taxLotsTopAppBarDuxo2 = taxLotsTopAppBarDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(taxLotsTopAppBarDuxo2) ? 67108864 : 33554432;
                    i3 |= i6;
                } else {
                    taxLotsTopAppBarDuxo2 = taxLotsTopAppBarDuxo;
                }
                i3 |= i6;
            } else {
                taxLotsTopAppBarDuxo2 = taxLotsTopAppBarDuxo;
            }
            if ((i3 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 256) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(TaxLotsTopAppBarDuxo.class), current, "selectLotsTopAppBar", factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 384, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarKt$TaxLotsTopAppBar$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarKt$TaxLotsTopAppBar$$inlined$duxo$1.1
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
                        i3 &= -234881025;
                        taxLotsTopAppBarDuxo3 = (TaxLotsTopAppBarDuxo) baseDuxo;
                    } else {
                        composer2 = composerStartRestartGroup;
                        taxLotsTopAppBarDuxo3 = taxLotsTopAppBarDuxo2;
                    }
                    i4 = i3;
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                    }
                    composer2 = composerStartRestartGroup;
                    taxLotsTopAppBarDuxo3 = taxLotsTopAppBarDuxo2;
                    i4 = i3;
                    modifier3 = modifier2;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-615941061, i4, -1, "com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBar (TaxLotsTopAppBar.kt:67)");
                }
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composer2.startReplaceGroup(-1224400529);
                int i7 = i4 & 7168;
                zChangedInstance = composer2.changedInstance(taxLotsTopAppBarDuxo3) | ((i4 & 14) != 4) | composer2.changedInstance(orderId) | composer2.changedInstance(instrumentId) | (i7 == 2048);
                objRememberedValue = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function1 function1 = new Function1() { // from class: com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TaxLotsTopAppBar.TaxLotsTopAppBar$lambda$2$lambda$1(taxLotsTopAppBarDuxo3, accountNumber, orderId, instrumentId, lotStatus, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    taxLotsTopAppBarDuxo4 = taxLotsTopAppBarDuxo3;
                    composer2.updateRememberedValue(function1);
                    objRememberedValue = function1;
                } else {
                    taxLotsTopAppBarDuxo4 = taxLotsTopAppBarDuxo3;
                }
                composer2.endReplaceGroup();
                int i8 = i4 >> 6;
                composer3 = composer2;
                LifecycleEffectKt.LifecycleResumeEffect(instrumentId, lifecycleOwner, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composer3, i8 & 14, 0);
                int i9 = i4;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(taxLotsTopAppBarDuxo4.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composer3.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.useNode();
                } else {
                    composer3.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifier5 = modifier3;
                StaticAppBar(topBarNestedScrollConnection, TaxLotsTopAppBar$lambda$3(snapshotState4CollectAsStateWithLifecycle), onBackClick, lotStatus, taxLotsContext, modifier5, composer3, i7 | ((i9 >> 18) & 14) | ((i9 >> 9) & 896) | (i9 & 57344) | (i8 & 458752), 0);
                modifier2 = modifier5;
                composer4 = composer3;
                CollapsingAppBar(density, topBarNestedScrollConnection, TaxLotsTopAppBar$lambda$3(snapshotState4CollectAsStateWithLifecycle), null, composer4, (i9 >> 15) & 112, 8);
                composer4.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                taxLotsTopAppBarDuxo5 = taxLotsTopAppBarDuxo4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer4 = composerStartRestartGroup;
                taxLotsTopAppBarDuxo5 = taxLotsTopAppBarDuxo2;
            }
            final Modifier modifier6 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TaxLotsTopAppBar.TaxLotsTopAppBar$lambda$5(accountNumber, orderId, instrumentId, lotStatus, taxLotsContext, onBackClick, topBarNestedScrollConnection, modifier6, taxLotsTopAppBarDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 12582912;
        modifier2 = modifier;
        if ((i & 100663296) != 0) {
        }
        if ((i3 & 38347923) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                i4 = i3;
                modifier3 = modifier4;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composer2.startReplaceGroup(-1224400529);
                int i72 = i4 & 7168;
                zChangedInstance = composer2.changedInstance(taxLotsTopAppBarDuxo3) | ((i4 & 14) != 4) | composer2.changedInstance(orderId) | composer2.changedInstance(instrumentId) | (i72 == 2048);
                objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance) {
                    Function1 function12 = new Function1() { // from class: com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TaxLotsTopAppBar.TaxLotsTopAppBar$lambda$2$lambda$1(taxLotsTopAppBarDuxo3, accountNumber, orderId, instrumentId, lotStatus, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    taxLotsTopAppBarDuxo4 = taxLotsTopAppBarDuxo3;
                    composer2.updateRememberedValue(function12);
                    objRememberedValue = function12;
                    composer2.endReplaceGroup();
                    int i82 = i4 >> 6;
                    composer3 = composer2;
                    LifecycleEffectKt.LifecycleResumeEffect(instrumentId, lifecycleOwner2, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composer3, i82 & 14, 0);
                    int i92 = i4;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(taxLotsTopAppBarDuxo4.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion3);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                    if (composer3.getApplier() == null) {
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        Modifier modifier52 = modifier3;
                        StaticAppBar(topBarNestedScrollConnection, TaxLotsTopAppBar$lambda$3(snapshotState4CollectAsStateWithLifecycle2), onBackClick, lotStatus, taxLotsContext, modifier52, composer3, i72 | ((i92 >> 18) & 14) | ((i92 >> 9) & 896) | (i92 & 57344) | (i82 & 458752), 0);
                        modifier2 = modifier52;
                        composer4 = composer3;
                        CollapsingAppBar(density2, topBarNestedScrollConnection, TaxLotsTopAppBar$lambda$3(snapshotState4CollectAsStateWithLifecycle2), null, composer4, (i92 >> 15) & 112, 8);
                        composer4.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        taxLotsTopAppBarDuxo5 = taxLotsTopAppBarDuxo4;
                    }
                }
            }
        }
        final Modifier modifier62 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult TaxLotsTopAppBar$lambda$2$lambda$1(TaxLotsTopAppBarDuxo taxLotsTopAppBarDuxo, String str, UUID uuid, UUID uuid2, TaxLotStatus taxLotStatus, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = taxLotsTopAppBarDuxo.bind(str, uuid, uuid2, taxLotStatus);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarKt$TaxLotsTopAppBar$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    private static final SelectLotsTopAppBarViewState TaxLotsTopAppBar$lambda$3(SnapshotState4<SelectLotsTopAppBarViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: TaxLotsTopAppBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarKt$StaticAppBar$2 */
    static final class C148632 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ TaxLotStatus $lotStatus;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ SelectLotsTopAppBarViewState $toolbarState;
        final /* synthetic */ TaxLotsTopAppBarNestedScrollConnection $topBarNestedScrollConnection;

        C148632(TaxLotsTopAppBarNestedScrollConnection taxLotsTopAppBarNestedScrollConnection, TaxLotStatus taxLotStatus, Navigator navigator, Context context, SelectLotsTopAppBarViewState selectLotsTopAppBarViewState) {
            this.$topBarNestedScrollConnection = taxLotsTopAppBarNestedScrollConnection;
            this.$lotStatus = taxLotStatus;
            this.$navigator = navigator;
            this.$context = context;
            this.$toolbarState = selectLotsTopAppBarViewState;
        }

        public final void invoke(Composer composer, int i) {
            boolean z;
            boolean z2;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1479806667, i, -1, "com.robinhood.android.equities.taxlots.appbar.StaticAppBar.<anonymous> (TaxLotsTopAppBar.kt:116)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            final TaxLotsTopAppBarNestedScrollConnection taxLotsTopAppBarNestedScrollConnection = this.$topBarNestedScrollConnection;
            TaxLotStatus taxLotStatus = this.$lotStatus;
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            final SelectLotsTopAppBarViewState selectLotsTopAppBarViewState = this.$toolbarState;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier modifierAlpha = Alpha.alpha(companion, taxLotsTopAppBarNestedScrollConnection.getAnimationComplete().getValue().booleanValue() ? 1.0f : 0.0f);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(taxLotsTopAppBarNestedScrollConnection);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarKt$StaticAppBar$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TaxLotsTopAppBar.C148632.invoke$lambda$5$lambda$1$lambda$0(taxLotsTopAppBarNestedScrollConnection, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierAlpha, (Function1) objRememberedValue);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierOnGloballyPositioned);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(companion, selectLotsTopAppBarViewState.getTitle() == null, null, 2, null);
            String title = selectLotsTopAppBarViewState.getTitle();
            composer.startReplaceGroup(-1235956345);
            if (title == null) {
                z = false;
                title = StringResources_androidKt.stringResource(C14807R.string.top_app_bar_title_placeholder, composer, 0);
            } else {
                z = false;
            }
            composer.endReplaceGroup();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(title, modifierBentoPlaceholder$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8184);
            Modifier modifierBentoPlaceholder$default2 = ModifiersKt.bentoPlaceholder$default(companion, selectLotsTopAppBarViewState.getSubtitle() == null, null, 2, null);
            String subtitle = selectLotsTopAppBarViewState.getSubtitle();
            composer.startReplaceGroup(-1235942419);
            if (subtitle == null) {
                z2 = false;
                subtitle = StringResources_androidKt.stringResource(C14807R.string.top_app_bar_subtitle_placeholder, composer, 0);
            } else {
                z2 = false;
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(subtitle, modifierBentoPlaceholder$default2, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8184);
            composer.endNode();
            composer.startReplaceGroup(-1257296652);
            if (taxLotStatus == TaxLotStatus.OPEN) {
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 11, null);
                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                String strStringResource = StringResources_androidKt.stringResource(C14807R.string.tax_lot_faq, composer, 0);
                long jM21368getAccent0d7_KjU = bentoTheme.getColors(composer, i2).m21368getAccent0d7_KjU();
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance2 = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changed(selectLotsTopAppBarViewState);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarKt$StaticAppBar$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TaxLotsTopAppBar.C148632.invoke$lambda$5$lambda$4$lambda$3(navigator, context, selectLotsTopAppBarViewState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jM21368getAccent0d7_KjU, modifierM5146paddingqDBjuR0$default, (Function0) objRememberedValue2, false, composer, BentoIcon4.Size24.$stable, 32);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$1$lambda$0(TaxLotsTopAppBarNestedScrollConnection taxLotsTopAppBarNestedScrollConnection, LayoutCoordinates it) {
            Intrinsics.checkNotNullParameter(it, "it");
            taxLotsTopAppBarNestedScrollConnection.m13609setStaticAppBarOffsetk4lQ0M(LayoutCoordinates2.positionInWindow(it));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3(Navigator navigator, Context context, SelectLotsTopAppBarViewState selectLotsTopAppBarViewState) {
            int i;
            if (selectLotsTopAppBarViewState.getM1Enabled()) {
                i = C14807R.string.tax_lots_table_m1_faq_contentful_id;
            } else {
                i = C14807R.string.tax_lots_table_m0_faq_contentful_id;
            }
            String string2 = context.getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = context.getString(C14807R.string.tax_lot_learn_more_primary_button_title);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            WebUtils webUtils = WebUtils.INSTANCE;
            HttpUrl.Companion companion = HttpUrl.INSTANCE;
            String string4 = context.getString(C14807R.string.tax_lot_learn_more_primary_button_link);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, context, new OtherMarkdownFragmentKey(string2, null, new OtherMarkdownFragmentKey.PrimaryButton(string3, webUtils.toLocalizedUrl(companion.get(string4), context).getUrl()), 2, null), false, false, false, null, false, null, false, false, null, null, 4084, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void StaticAppBar(final TaxLotsTopAppBarNestedScrollConnection taxLotsTopAppBarNestedScrollConnection, final SelectLotsTopAppBarViewState selectLotsTopAppBarViewState, final Function0<Unit> function0, final TaxLotStatus taxLotStatus, final TaxLotsContext taxLotsContext, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        SelectLotsTopAppBarViewState selectLotsTopAppBarViewState2;
        Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(634394824);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(taxLotsTopAppBarNestedScrollConnection) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            selectLotsTopAppBarViewState2 = selectLotsTopAppBarViewState;
        } else {
            selectLotsTopAppBarViewState2 = selectLotsTopAppBarViewState;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(selectLotsTopAppBarViewState2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(taxLotStatus.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(taxLotsContext) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(634394824, i3, -1, "com.robinhood.android.equities.taxlots.appbar.StaticAppBar (TaxLotsTopAppBar.kt:106)");
                }
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(taxLotsTopAppBarNestedScrollConnection);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TaxLotsTopAppBar.StaticAppBar$lambda$7$lambda$6(taxLotsTopAppBarNestedScrollConnection, (IntSize) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-1479806667, true, new C148632(taxLotsTopAppBarNestedScrollConnection, taxLotStatus, navigator, context, selectLotsTopAppBarViewState2), composerStartRestartGroup, 54), OnRemeasuredModifier2.onSizeChanged(modifier4, (Function1) objRememberedValue), ComposableLambda3.rememberComposableLambda(-1925660023, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarKt.StaticAppBar.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                        invoke(bentoAppBarScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                        int i6;
                        EquityOrderContext equity_order_context;
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 6) == 0) {
                            i6 = i5 | ((i5 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2);
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1925660023, i6, -1, "com.robinhood.android.equities.taxlots.appbar.StaticAppBar.<anonymous> (TaxLotsTopAppBar.kt:186)");
                        }
                        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, TaxLotsTopAppBar.TOP_APP_BAR_BACK_BUTTON_TEST_TAG);
                        com.robinhood.rosetta.eventlogging.Context context2 = userInteractionEventDescriptor.getContext();
                        com.robinhood.rosetta.eventlogging.Context contextCopy$default = null;
                        equityOrderContextCopy = null;
                        EquityOrderContext equityOrderContextCopy = null;
                        if (context2 != null) {
                            com.robinhood.rosetta.eventlogging.Context context3 = userInteractionEventDescriptor.getContext();
                            if (context3 != null && (equity_order_context = context3.getEquity_order_context()) != null) {
                                equityOrderContextCopy = equity_order_context.copy((493567 & 1) != 0 ? equity_order_context.instrument_id : null, (493567 & 2) != 0 ? equity_order_context.symbol : null, (493567 & 4) != 0 ? equity_order_context.side : null, (493567 & 8) != 0 ? equity_order_context.type : null, (493567 & 16) != 0 ? equity_order_context.trigger : null, (493567 & 32) != 0 ? equity_order_context.is_dollar_based_amount : null, (493567 & 64) != 0 ? equity_order_context.is_trailing_order : null, (493567 & 128) != 0 ? equity_order_context.is_preset_percent_limit_order : null, (493567 & 256) != 0 ? equity_order_context.market_hours : null, (493567 & 512) != 0 ? equity_order_context.bid_price : null, (493567 & 1024) != 0 ? equity_order_context.ask_price : null, (493567 & 2048) != 0 ? equity_order_context.bid_ask_timestamp : null, (493567 & 4096) != 0 ? equity_order_context.quote_last_cache_timestamp : null, (493567 & 8192) != 0 ? equity_order_context.tax_lot_selections : null, (493567 & 16384) != 0 ? equity_order_context.tax_lots_context : taxLotsContext, (493567 & 32768) != 0 ? equity_order_context.estimated_total_fees : null, (493567 & 65536) != 0 ? equity_order_context.position_effect : null, (493567 & 131072) != 0 ? equity_order_context.order_entry_point : null, (493567 & 262144) != 0 ? equity_order_context.order_input_format : null, (493567 & 524288) != 0 ? equity_order_context.unknownFields() : null);
                            }
                            contextCopy$default = com.robinhood.rosetta.eventlogging.Context.copy$default(context2, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, equityOrderContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -536870913, -1, -1, -1, 16383, null);
                        }
                        BentoAppBar.m20575BentoBackButtondrOMvmE(com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(modifierTestTag, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.BACK, contextCopy$default, new Component(Component.ComponentType.BUTTON, "tax_lots.table.dismiss", null, 4, null), null, 35, null), false, false, false, true, false, null, 110, null), false, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21368getAccent0d7_KjU()), function0, composer3, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2040);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier5 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TaxLotsTopAppBar.StaticAppBar$lambda$8(taxLotsTopAppBarNestedScrollConnection, selectLotsTopAppBarViewState, function0, taxLotStatus, taxLotsContext, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChangedInstance = composerStartRestartGroup.changedInstance(taxLotsTopAppBarNestedScrollConnection);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TaxLotsTopAppBar.StaticAppBar$lambda$7$lambda$6(taxLotsTopAppBarNestedScrollConnection, (IntSize) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-1479806667, true, new C148632(taxLotsTopAppBarNestedScrollConnection, taxLotStatus, navigator2, context2, selectLotsTopAppBarViewState2), composerStartRestartGroup, 54), OnRemeasuredModifier2.onSizeChanged(modifier4, (Function1) objRememberedValue), ComposableLambda3.rememberComposableLambda(-1925660023, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarKt.StaticAppBar.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                        invoke(bentoAppBarScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                        int i6;
                        EquityOrderContext equity_order_context;
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 6) == 0) {
                            i6 = i5 | ((i5 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2);
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1925660023, i6, -1, "com.robinhood.android.equities.taxlots.appbar.StaticAppBar.<anonymous> (TaxLotsTopAppBar.kt:186)");
                        }
                        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, TaxLotsTopAppBar.TOP_APP_BAR_BACK_BUTTON_TEST_TAG);
                        com.robinhood.rosetta.eventlogging.Context context22 = userInteractionEventDescriptor2.getContext();
                        com.robinhood.rosetta.eventlogging.Context contextCopy$default = null;
                        equityOrderContextCopy = null;
                        EquityOrderContext equityOrderContextCopy = null;
                        if (context22 != null) {
                            com.robinhood.rosetta.eventlogging.Context context3 = userInteractionEventDescriptor2.getContext();
                            if (context3 != null && (equity_order_context = context3.getEquity_order_context()) != null) {
                                equityOrderContextCopy = equity_order_context.copy((493567 & 1) != 0 ? equity_order_context.instrument_id : null, (493567 & 2) != 0 ? equity_order_context.symbol : null, (493567 & 4) != 0 ? equity_order_context.side : null, (493567 & 8) != 0 ? equity_order_context.type : null, (493567 & 16) != 0 ? equity_order_context.trigger : null, (493567 & 32) != 0 ? equity_order_context.is_dollar_based_amount : null, (493567 & 64) != 0 ? equity_order_context.is_trailing_order : null, (493567 & 128) != 0 ? equity_order_context.is_preset_percent_limit_order : null, (493567 & 256) != 0 ? equity_order_context.market_hours : null, (493567 & 512) != 0 ? equity_order_context.bid_price : null, (493567 & 1024) != 0 ? equity_order_context.ask_price : null, (493567 & 2048) != 0 ? equity_order_context.bid_ask_timestamp : null, (493567 & 4096) != 0 ? equity_order_context.quote_last_cache_timestamp : null, (493567 & 8192) != 0 ? equity_order_context.tax_lot_selections : null, (493567 & 16384) != 0 ? equity_order_context.tax_lots_context : taxLotsContext, (493567 & 32768) != 0 ? equity_order_context.estimated_total_fees : null, (493567 & 65536) != 0 ? equity_order_context.position_effect : null, (493567 & 131072) != 0 ? equity_order_context.order_entry_point : null, (493567 & 262144) != 0 ? equity_order_context.order_input_format : null, (493567 & 524288) != 0 ? equity_order_context.unknownFields() : null);
                            }
                            contextCopy$default = com.robinhood.rosetta.eventlogging.Context.copy$default(context22, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, equityOrderContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -536870913, -1, -1, -1, 16383, null);
                        }
                        BentoAppBar.m20575BentoBackButtondrOMvmE(com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(modifierTestTag, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, UserInteractionEventData.Action.BACK, contextCopy$default, new Component(Component.ComponentType.BUTTON, "tax_lots.table.dismiss", null, 4, null), null, 35, null), false, false, false, true, false, null, 110, null), false, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21368getAccent0d7_KjU()), function0, composer3, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2040);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StaticAppBar$lambda$7$lambda$6(TaxLotsTopAppBarNestedScrollConnection taxLotsTopAppBarNestedScrollConnection, IntSize intSize) {
        taxLotsTopAppBarNestedScrollConnection.setStaticAppBarHeight((int) (intSize.getPackedValue() & 4294967295L));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void CollapsingAppBar(final Density density, final TaxLotsTopAppBarNestedScrollConnection taxLotsTopAppBarNestedScrollConnection, final SelectLotsTopAppBarViewState selectLotsTopAppBarViewState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        SelectLotsTopAppBarViewState selectLotsTopAppBarViewState2;
        int i4;
        Modifier modifier2;
        float fMo5013toDpu2uoSUM;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotIntState2 snapshotIntState2;
        float f;
        boolean zChangedInstance;
        Object objRememberedValue2;
        boolean zChangedInstance2;
        Object objRememberedValue3;
        boolean zChangedInstance3;
        Object objRememberedValue4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String title;
        String subtitle;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-696738906);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(density) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(taxLotsTopAppBarNestedScrollConnection) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                selectLotsTopAppBarViewState2 = selectLotsTopAppBarViewState;
                i3 |= composerStartRestartGroup.changed(selectLotsTopAppBarViewState2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-696738906, i3, -1, "com.robinhood.android.equities.taxlots.appbar.CollapsingAppBar (TaxLotsTopAppBar.kt:217)");
                    }
                    fMo5013toDpu2uoSUM = density.mo5013toDpu2uoSUM(taxLotsTopAppBarNestedScrollConnection.getCollapsingAppbarHeight().getIntValue());
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    f = 0.0f;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, composerStartRestartGroup, 0, 1);
                    if (!taxLotsTopAppBarNestedScrollConnection.getAnimationComplete().getValue().booleanValue() && snapshotIntState2.getIntValue() >= 1) {
                        f = 1.0f;
                    }
                    Modifier modifierAlpha = Alpha.alpha(modifierM21623defaultHorizontalPaddingrAjV9yQ, f);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance = composerStartRestartGroup.changedInstance(taxLotsTopAppBarNestedScrollConnection);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TaxLotsTopAppBar.CollapsingAppBar$lambda$12$lambda$11(taxLotsTopAppBarNestedScrollConnection, (Density) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierOffset = OffsetKt.offset(modifierAlpha, (Function1) objRememberedValue2);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(taxLotsTopAppBarNestedScrollConnection);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TaxLotsTopAppBar.CollapsingAppBar$lambda$14$lambda$13(taxLotsTopAppBarNestedScrollConnection, snapshotIntState2, (IntSize) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(modifierOffset, (Function1) objRememberedValue3);
                    if (C2002Dp.m7994compareTo0680j_4(fMo5013toDpu2uoSUM, C2002Dp.m7995constructorimpl((float) 0)) <= 0) {
                        modifierOnSizeChanged = SizeKt.m5156height3ABfNKs(modifierOnSizeChanged, fMo5013toDpu2uoSUM);
                    }
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(taxLotsTopAppBarNestedScrollConnection);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance3 || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TaxLotsTopAppBar.CollapsingAppBar$lambda$17$lambda$16(taxLotsTopAppBarNestedScrollConnection, (LayoutCoordinates) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierOnSizeChanged, (Function1) objRememberedValue4);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getBottom(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor);
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(companion3, selectLotsTopAppBarViewState2.getTitle() != null, null, 2, null);
                    title = selectLotsTopAppBarViewState2.getTitle();
                    composerStartRestartGroup.startReplaceGroup(1343838792);
                    if (title == null) {
                        title = StringResources_androidKt.stringResource(C14807R.string.top_app_bar_title_placeholder, composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifier5 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(title, modifierBentoPlaceholder$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), 0L, taxLotsTopAppBarNestedScrollConnection.m13607getCollapsingHeaderFontSize5XXgJZs(bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM()), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null), composerStartRestartGroup, 0, 0, 8184);
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.bentoPlaceholder$default(companion3, selectLotsTopAppBarViewState.getSubtitle() != null, null, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 7, null);
                    subtitle = selectLotsTopAppBarViewState.getSubtitle();
                    composerStartRestartGroup.startReplaceGroup(1343861838);
                    if (subtitle == null) {
                        subtitle = StringResources_androidKt.stringResource(C14807R.string.top_app_bar_subtitle_placeholder, composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(subtitle, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composer2, 0, 0, 8184);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TaxLotsTopAppBar.CollapsingAppBar$lambda$19(density, taxLotsTopAppBarNestedScrollConnection, selectLotsTopAppBarViewState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 1171) == 1170) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                fMo5013toDpu2uoSUM = density.mo5013toDpu2uoSUM(taxLotsTopAppBarNestedScrollConnection.getCollapsingAppbarHeight().getIntValue());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                f = 0.0f;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, composerStartRestartGroup, 0, 1);
                if (!taxLotsTopAppBarNestedScrollConnection.getAnimationComplete().getValue().booleanValue()) {
                    f = 1.0f;
                }
                Modifier modifierAlpha2 = Alpha.alpha(modifierM21623defaultHorizontalPaddingrAjV9yQ2, f);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(taxLotsTopAppBarNestedScrollConnection);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TaxLotsTopAppBar.CollapsingAppBar$lambda$12$lambda$11(taxLotsTopAppBarNestedScrollConnection, (Density) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierOffset2 = OffsetKt.offset(modifierAlpha2, (Function1) objRememberedValue2);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(taxLotsTopAppBarNestedScrollConnection);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TaxLotsTopAppBar.CollapsingAppBar$lambda$14$lambda$13(taxLotsTopAppBarNestedScrollConnection, snapshotIntState2, (IntSize) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierOnSizeChanged2 = OnRemeasuredModifier2.onSizeChanged(modifierOffset2, (Function1) objRememberedValue3);
                        if (C2002Dp.m7994compareTo0680j_4(fMo5013toDpu2uoSUM, C2002Dp.m7995constructorimpl((float) 0)) <= 0) {
                        }
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance3 = composerStartRestartGroup.changedInstance(taxLotsTopAppBarNestedScrollConnection);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance3) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TaxLotsTopAppBar.CollapsingAppBar$lambda$17$lambda$16(taxLotsTopAppBarNestedScrollConnection, (LayoutCoordinates) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifier3.onGloballyPositioned(modifierOnSizeChanged2, (Function1) objRememberedValue4);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getBottom(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned2);
                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                Modifier.Companion companion32 = Modifier.INSTANCE;
                                Modifier modifierBentoPlaceholder$default2 = ModifiersKt.bentoPlaceholder$default(companion32, selectLotsTopAppBarViewState2.getTitle() != null, null, 2, null);
                                title = selectLotsTopAppBarViewState2.getTitle();
                                composerStartRestartGroup.startReplaceGroup(1343838792);
                                if (title == null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i52 = BentoTheme.$stable;
                                Modifier modifier52 = modifier4;
                                BentoText2.m20747BentoText38GnDrw(title, modifierBentoPlaceholder$default2, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), 0L, taxLotsTopAppBarNestedScrollConnection.m13607getCollapsingHeaderFontSize5XXgJZs(bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM()), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null), composerStartRestartGroup, 0, 0, 8184);
                                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.bentoPlaceholder$default(companion32, selectLotsTopAppBarViewState.getSubtitle() != null, null, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 7, null);
                                subtitle = selectLotsTopAppBarViewState.getSubtitle();
                                composerStartRestartGroup.startReplaceGroup(1343861838);
                                if (subtitle == null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composer2 = composerStartRestartGroup;
                                BentoText2.m20747BentoText38GnDrw(subtitle, modifierM5146paddingqDBjuR0$default2, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composer2, 0, 0, 8184);
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        selectLotsTopAppBarViewState2 = selectLotsTopAppBarViewState;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset CollapsingAppBar$lambda$12$lambda$11(TaxLotsTopAppBarNestedScrollConnection taxLotsTopAppBarNestedScrollConnection, Density offset) {
        long jM8033constructorimpl;
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        if (!Offset.m6540equalsimpl0(taxLotsTopAppBarNestedScrollConnection.getCollapsingAppBarAdditionalOffset().getValue().getPackedValue(), Offset.INSTANCE.m6552getUnspecifiedF1C5BW0())) {
            jM8033constructorimpl = IntOffset.m8033constructorimpl((((int) Float.intBitsToFloat((int) (taxLotsTopAppBarNestedScrollConnection.getCollapsingAppBarAdditionalOffset().getValue().getPackedValue() & 4294967295L))) & 4294967295L) | (((int) Float.intBitsToFloat((int) (taxLotsTopAppBarNestedScrollConnection.getCollapsingAppBarAdditionalOffset().getValue().getPackedValue() >> 32))) << 32));
        } else {
            long j = 0;
            jM8033constructorimpl = IntOffset.m8033constructorimpl((j & 4294967295L) | (j << 32));
        }
        return IntOffset.m8030boximpl(jM8033constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CollapsingAppBar$lambda$14$lambda$13(TaxLotsTopAppBarNestedScrollConnection taxLotsTopAppBarNestedScrollConnection, SnapshotIntState2 snapshotIntState2, IntSize intSize) {
        taxLotsTopAppBarNestedScrollConnection.setCollapsingAppBarHeight((int) (intSize.getPackedValue() & 4294967295L));
        snapshotIntState2.setIntValue(snapshotIntState2.getIntValue() + 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CollapsingAppBar$lambda$17$lambda$16(TaxLotsTopAppBarNestedScrollConnection taxLotsTopAppBarNestedScrollConnection, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!Offset.m6540equalsimpl0(LayoutCoordinates2.positionInWindow(it), Offset.INSTANCE.m6552getUnspecifiedF1C5BW0())) {
            taxLotsTopAppBarNestedScrollConnection.m13608setCollapsingAppBarOffsetk4lQ0M(LayoutCoordinates2.positionInWindow(it));
        }
        return Unit.INSTANCE;
    }
}
