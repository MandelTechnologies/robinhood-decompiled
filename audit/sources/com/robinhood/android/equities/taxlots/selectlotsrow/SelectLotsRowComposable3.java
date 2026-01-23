package com.robinhood.android.equities.taxlots.selectlotsrow;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
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
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import com.robinhood.utils.resource.StringResource;
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
import kotlinx.coroutines.Job;

/* compiled from: SelectLotsRowComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a5\u0010\u0010\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002"}, m3636d2 = {"SelectLotsRowComposable", "", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "orderId", "orderFormState", "Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/equities/taxlots/selectlotsrow/SelectLotsRowDuxo;", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/shared/trading/tradeflow/OrderFormState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/equities/taxlots/selectlotsrow/SelectLotsRowDuxo;Landroidx/compose/runtime/Composer;II)V", "SelectLotsRow", "state", "Lcom/robinhood/android/equities/taxlots/selectlotsrow/SelectLotsRowViewState;", "(Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/equities/taxlots/selectlotsrow/SelectLotsRowViewState;Lcom/robinhood/shared/trading/tradeflow/OrderFormState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SelectLotsRowComposablePreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-tax-lots_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class SelectLotsRowComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectLotsRow$lambda$5(Function0 function0, SelectLotsRowViewState selectLotsRowViewState, OrderForm6 orderForm6, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SelectLotsRow(function0, selectLotsRowViewState, orderForm6, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectLotsRowComposable$lambda$4(String str, UUID uuid, UUID uuid2, OrderForm6 orderForm6, Function0 function0, Modifier modifier, SelectLotsRowDuxo selectLotsRowDuxo, int i, int i2, Composer composer, int i3) {
        SelectLotsRowComposable(str, uuid, uuid2, orderForm6, function0, modifier, selectLotsRowDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectLotsRowComposablePreview$lambda$6(int i, Composer composer, int i2) {
        SelectLotsRowComposablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectLotsRowComposable(final String accountNumber, final UUID instrumentId, final UUID orderId, final OrderForm6 orderFormState, final Function0<Unit> onClick, Modifier modifier, SelectLotsRowDuxo selectLotsRowDuxo, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        SelectLotsRowDuxo selectLotsRowDuxo2;
        int i4;
        final SelectLotsRowDuxo selectLotsRowDuxo3;
        Modifier modifier3;
        boolean zChangedInstance;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-13295591);
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
            i3 |= composerStartRestartGroup.changedInstance(instrumentId) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(orderId) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(orderFormState.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    selectLotsRowDuxo2 = selectLotsRowDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(selectLotsRowDuxo2) ? 1048576 : 524288;
                    i3 |= i6;
                } else {
                    selectLotsRowDuxo2 = selectLotsRowDuxo;
                }
                i3 |= i6;
            } else {
                selectLotsRowDuxo2 = selectLotsRowDuxo;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i5 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 64) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(SelectLotsRowDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowComposableKt$SelectLotsRowComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowComposableKt$SelectLotsRowComposable$$inlined$duxo$1.1
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
                        SelectLotsRowDuxo selectLotsRowDuxo4 = (SelectLotsRowDuxo) baseDuxo;
                        i4 = i3 & (-3670017);
                        selectLotsRowDuxo3 = selectLotsRowDuxo4;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-13295591, i4, -1, "com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowComposable (SelectLotsRowComposable.kt:35)");
                    }
                    int i7 = i4 >> 3;
                    SelectLotsRow(onClick, SelectLotsRowComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(selectLotsRowDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), orderFormState, modifier3, composerStartRestartGroup, ((i4 >> 6) & 7168) | ((i4 >> 12) & 14) | (StringResource.$stable << 3) | (i7 & 896), 0);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = composerStartRestartGroup.changedInstance(selectLotsRowDuxo3) | composerStartRestartGroup.changedInstance(instrumentId) | ((i4 & 14) == 4) | composerStartRestartGroup.changedInstance(orderId);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SelectLotsRowComposable3.SelectLotsRowComposable$lambda$3$lambda$2(selectLotsRowDuxo3, instrumentId, accountNumber, orderId, (LifecycleResumePauseEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    selectLotsRowDuxo2 = selectLotsRowDuxo3;
                    LifecycleEffectKt.LifecycleResumeEffect(instrumentId, accountNumber, lifecycleOwner, (Function1) objRememberedValue, composerStartRestartGroup, ((i4 << 3) & 112) | (i7 & 14), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                }
                i4 = i3;
                modifier3 = modifier2;
                selectLotsRowDuxo3 = selectLotsRowDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i72 = i4 >> 3;
                SelectLotsRow(onClick, SelectLotsRowComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(selectLotsRowDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), orderFormState, modifier3, composerStartRestartGroup, ((i4 >> 6) & 7168) | ((i4 >> 12) & 14) | (StringResource.$stable << 3) | (i72 & 896), 0);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(selectLotsRowDuxo3) | composerStartRestartGroup.changedInstance(instrumentId) | ((i4 & 14) == 4) | composerStartRestartGroup.changedInstance(orderId);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SelectLotsRowComposable3.SelectLotsRowComposable$lambda$3$lambda$2(selectLotsRowDuxo3, instrumentId, accountNumber, orderId, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    selectLotsRowDuxo2 = selectLotsRowDuxo3;
                    LifecycleEffectKt.LifecycleResumeEffect(instrumentId, accountNumber, lifecycleOwner2, (Function1) objRememberedValue, composerStartRestartGroup, ((i4 << 3) & 112) | (i72 & 14), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            final SelectLotsRowDuxo selectLotsRowDuxo5 = selectLotsRowDuxo2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SelectLotsRowComposable3.SelectLotsRowComposable$lambda$4(accountNumber, instrumentId, orderId, orderFormState, onClick, modifier2, selectLotsRowDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i5 != 0) {
                }
                if ((i2 & 64) == 0) {
                    i4 = i3;
                    modifier3 = modifier2;
                    selectLotsRowDuxo3 = selectLotsRowDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i722 = i4 >> 3;
                SelectLotsRow(onClick, SelectLotsRowComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(selectLotsRowDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), orderFormState, modifier3, composerStartRestartGroup, ((i4 >> 6) & 7168) | ((i4 >> 12) & 14) | (StringResource.$stable << 3) | (i722 & 896), 0);
                LifecycleOwner lifecycleOwner22 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(selectLotsRowDuxo3) | composerStartRestartGroup.changedInstance(instrumentId) | ((i4 & 14) == 4) | composerStartRestartGroup.changedInstance(orderId);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                }
            }
        }
        final SelectLotsRowDuxo selectLotsRowDuxo52 = selectLotsRowDuxo2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult SelectLotsRowComposable$lambda$3$lambda$2(SelectLotsRowDuxo selectLotsRowDuxo, UUID uuid, String str, UUID uuid2, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = selectLotsRowDuxo.bind(uuid, str, uuid2);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowComposableKt$SelectLotsRowComposable$lambda$3$lambda$2$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectLotsRow(final Function0<Unit> onClick, final SelectLotsRowViewState state, final OrderForm6 orderFormState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1634298029);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(orderFormState.ordinal()) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1634298029, i3, -1, "com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRow (SelectLotsRowComposable.kt:61)");
                }
                Modifier modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null).then(orderFormState != OrderForm6.EDITING ? ClickableKt.m4893clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, onClick, 7, null) : Modifier.INSTANCE), null, null, ComposableLambda3.rememberComposableLambda(-481305968, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowComposableKt.SelectLotsRow.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) throws Resources.NotFoundException {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-481305968, i5, -1, "com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRow.<anonymous> (SelectLotsRowComposable.kt:76)");
                        }
                        StringResource title = state.getTitle();
                        Resources resources = ((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        CharSequence text = title.getText(resources);
                        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type kotlin.String");
                        BentoText2.m20747BentoText38GnDrw((String) text, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1629385391, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowComposableKt.SelectLotsRow.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) throws Resources.NotFoundException {
                        CharSequence text;
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1629385391, i5, -1, "com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRow.<anonymous> (SelectLotsRowComposable.kt:79)");
                        }
                        StringResource subtitle = state.getSubtitle();
                        composer3.startReplaceGroup(-1823701258);
                        if (subtitle == null) {
                            text = null;
                        } else {
                            Resources resources = ((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                            text = subtitle.getText(resources);
                        }
                        composer3.endReplaceGroup();
                        String str = text instanceof String ? (String) text : null;
                        if (str != null) {
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextS(), composer3, 0, 0, 8186);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-554890546, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowComposableKt.SelectLotsRow.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) throws Resources.NotFoundException {
                        CharSequence text;
                        CharSequence text2;
                        SelectLotsRowViewState selectLotsRowViewState;
                        String str;
                        String str2;
                        Modifier.Companion companion;
                        CharSequence text3;
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-554890546, i5, -1, "com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRow.<anonymous> (SelectLotsRowComposable.kt:88)");
                        }
                        if (state.getHasSelectedLots()) {
                            composer3.startReplaceGroup(584937255);
                            SelectLotsRowViewState selectLotsRowViewState2 = state;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion2);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            StringResource metaTitle = selectLotsRowViewState2.getMetaTitle();
                            composer3.startReplaceGroup(-1902564828);
                            if (metaTitle == null) {
                                text2 = null;
                            } else {
                                Resources resources = ((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                                text2 = metaTitle.getText(resources);
                            }
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(-1902563182);
                            if (text2 == null) {
                                selectLotsRowViewState = selectLotsRowViewState2;
                                str2 = "getResources(...)";
                                companion = companion2;
                                str = "null cannot be cast to non-null type kotlin.String";
                            } else {
                                Intrinsics.checkNotNull(text2, "null cannot be cast to non-null type kotlin.String");
                                selectLotsRowViewState = selectLotsRowViewState2;
                                str = "null cannot be cast to non-null type kotlin.String";
                                str2 = "getResources(...)";
                                companion = companion2;
                                BentoText2.m20747BentoText38GnDrw((String) text2, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21426getFg20d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, null, composer3, 24624, 0, 16296);
                            }
                            composer3.endReplaceGroup();
                            StringResource metaSubtitle = selectLotsRowViewState.getMetaSubtitle();
                            composer3.startReplaceGroup(-1902550236);
                            if (metaSubtitle == null) {
                                text3 = null;
                            } else {
                                Resources resources2 = ((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                                Intrinsics.checkNotNullExpressionValue(resources2, str2);
                                text3 = metaSubtitle.getText(resources2);
                            }
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(-1902548583);
                            if (text3 != null) {
                                Intrinsics.checkNotNull(text3, str);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i6 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw((String) text3, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextS(), composer3, 48, 0, 8120);
                            }
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(585891621);
                            StringResource metaTitle2 = state.getMetaTitle();
                            composer3.startReplaceGroup(-673836203);
                            if (metaTitle2 == null) {
                                text = null;
                            } else {
                                Resources resources3 = ((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                                Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                                text = metaTitle2.getText(resources3);
                            }
                            composer3.endReplaceGroup();
                            if (text != null) {
                                BentoText2.m20747BentoText38GnDrw((String) text, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21426getFg20d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, null, composer3, 24624, 0, 16296);
                                Unit unit = Unit.INSTANCE;
                            }
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1555800813, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowComposableKt.SelectLotsRow.4
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
                            ComposerKt.traceEventStart(1555800813, i5, -1, "com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRow.<anonymous> (SelectLotsRowComposable.kt:67)");
                        }
                        if (orderFormState == OrderForm6.EDITING) {
                            IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(C20690R.drawable.ic_rds_dropdown_16dp, composer3, 0), "Caret", (Modifier) null, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU(), composer3, 48, 4);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), true, false, true, null, composer2, 819686400, 0, 1286);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SelectLotsRowComposable3.SelectLotsRow$lambda$5(onClick, state, orderFormState, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifier42 = modifier3;
            composer2 = composerStartRestartGroup;
            BentoBaseRowLayout.BentoBaseRowLayout(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null).then(orderFormState != OrderForm6.EDITING ? ClickableKt.m4893clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, onClick, 7, null) : Modifier.INSTANCE), null, null, ComposableLambda3.rememberComposableLambda(-481305968, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowComposableKt.SelectLotsRow.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) throws Resources.NotFoundException {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-481305968, i5, -1, "com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRow.<anonymous> (SelectLotsRowComposable.kt:76)");
                    }
                    StringResource title = state.getTitle();
                    Resources resources = ((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    CharSequence text = title.getText(resources);
                    Intrinsics.checkNotNull(text, "null cannot be cast to non-null type kotlin.String");
                    BentoText2.m20747BentoText38GnDrw((String) text, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1629385391, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowComposableKt.SelectLotsRow.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) throws Resources.NotFoundException {
                    CharSequence text;
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1629385391, i5, -1, "com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRow.<anonymous> (SelectLotsRowComposable.kt:79)");
                    }
                    StringResource subtitle = state.getSubtitle();
                    composer3.startReplaceGroup(-1823701258);
                    if (subtitle == null) {
                        text = null;
                    } else {
                        Resources resources = ((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        text = subtitle.getText(resources);
                    }
                    composer3.endReplaceGroup();
                    String str = text instanceof String ? (String) text : null;
                    if (str != null) {
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextS(), composer3, 0, 0, 8186);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-554890546, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowComposableKt.SelectLotsRow.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) throws Resources.NotFoundException {
                    CharSequence text;
                    CharSequence text2;
                    SelectLotsRowViewState selectLotsRowViewState;
                    String str;
                    String str2;
                    Modifier.Companion companion;
                    CharSequence text3;
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-554890546, i5, -1, "com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRow.<anonymous> (SelectLotsRowComposable.kt:88)");
                    }
                    if (state.getHasSelectedLots()) {
                        composer3.startReplaceGroup(584937255);
                        SelectLotsRowViewState selectLotsRowViewState2 = state;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion2);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        StringResource metaTitle = selectLotsRowViewState2.getMetaTitle();
                        composer3.startReplaceGroup(-1902564828);
                        if (metaTitle == null) {
                            text2 = null;
                        } else {
                            Resources resources = ((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                            text2 = metaTitle.getText(resources);
                        }
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(-1902563182);
                        if (text2 == null) {
                            selectLotsRowViewState = selectLotsRowViewState2;
                            str2 = "getResources(...)";
                            companion = companion2;
                            str = "null cannot be cast to non-null type kotlin.String";
                        } else {
                            Intrinsics.checkNotNull(text2, "null cannot be cast to non-null type kotlin.String");
                            selectLotsRowViewState = selectLotsRowViewState2;
                            str = "null cannot be cast to non-null type kotlin.String";
                            str2 = "getResources(...)";
                            companion = companion2;
                            BentoText2.m20747BentoText38GnDrw((String) text2, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21426getFg20d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, null, composer3, 24624, 0, 16296);
                        }
                        composer3.endReplaceGroup();
                        StringResource metaSubtitle = selectLotsRowViewState.getMetaSubtitle();
                        composer3.startReplaceGroup(-1902550236);
                        if (metaSubtitle == null) {
                            text3 = null;
                        } else {
                            Resources resources2 = ((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                            Intrinsics.checkNotNullExpressionValue(resources2, str2);
                            text3 = metaSubtitle.getText(resources2);
                        }
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(-1902548583);
                        if (text3 != null) {
                            Intrinsics.checkNotNull(text3, str);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw((String) text3, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextS(), composer3, 48, 0, 8120);
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(585891621);
                        StringResource metaTitle2 = state.getMetaTitle();
                        composer3.startReplaceGroup(-673836203);
                        if (metaTitle2 == null) {
                            text = null;
                        } else {
                            Resources resources3 = ((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                            text = metaTitle2.getText(resources3);
                        }
                        composer3.endReplaceGroup();
                        if (text != null) {
                            BentoText2.m20747BentoText38GnDrw((String) text, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21426getFg20d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, null, composer3, 24624, 0, 16296);
                            Unit unit = Unit.INSTANCE;
                        }
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1555800813, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowComposableKt.SelectLotsRow.4
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
                        ComposerKt.traceEventStart(1555800813, i5, -1, "com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRow.<anonymous> (SelectLotsRowComposable.kt:67)");
                    }
                    if (orderFormState == OrderForm6.EDITING) {
                        IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(C20690R.drawable.ic_rds_dropdown_16dp, composer3, 0), "Caret", (Modifier) null, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU(), composer3, 48, 4);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), true, false, true, null, composer2, 819686400, 0, 1286);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final SelectLotsRowViewState SelectLotsRowComposable$lambda$0(SnapshotState4<SelectLotsRowViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    public static final void SelectLotsRowComposablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(219051282);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(219051282, i, -1, "com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowComposablePreview (SelectLotsRowComposable.kt:129)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, SelectLotsRowComposable.INSTANCE.m13616getLambda$635631414$lib_tax_lots_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SelectLotsRowComposable3.SelectLotsRowComposablePreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
