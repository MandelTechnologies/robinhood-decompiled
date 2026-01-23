package com.robinhood.android.event.trade.explainer;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.BottomSheetScaffold;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.event.trade.C16465R;
import com.robinhood.android.event.trade.explainer.PriceExplainerDuxo4;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.models.event.p186db.arsenal.ExchangeSource;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.staticcontent.model.OtherMarkdown;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PriceExplainer.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00012\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0013\u001aA\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001a²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, m3636d2 = {"PriceExplainerBottomSheet", "", "eventContractId", "Ljava/util/UUID;", "onDismiss", "Lkotlin/Function0;", "exchangeSource", "Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;", "titleResOverride", "", "sheetState", "Landroidx/compose/material3/SheetState;", "duxo", "Lcom/robinhood/android/event/trade/explainer/PriceExplainerDuxo;", "(Ljava/util/UUID;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;Ljava/lang/Integer;Landroidx/compose/material3/SheetState;Lcom/robinhood/android/event/trade/explainer/PriceExplainerDuxo;Landroidx/compose/runtime/Composer;II)V", "viewState", "Lcom/robinhood/android/event/trade/explainer/PriceExplainerViewState;", "(Lcom/robinhood/android/event/trade/explainer/PriceExplainerViewState;Ljava/lang/Integer;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PreviewPriceExplainerBottomSheet", "(Lcom/robinhood/android/event/trade/explainer/PriceExplainerViewState;Landroidx/compose/runtime/Composer;I)V", "PriceExplainerBottomSheetLoadedContent", "state", "Lcom/robinhood/android/event/trade/explainer/PriceExplainerViewState$Loaded;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/event/trade/explainer/PriceExplainerViewState$Loaded;Ljava/lang/Integer;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-event-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.trade.explainer.PriceExplainerKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class PriceExplainer {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewPriceExplainerBottomSheet$lambda$4(PriceExplainerDuxo4 priceExplainerDuxo4, int i, Composer composer, int i2) {
        PreviewPriceExplainerBottomSheet(priceExplainerDuxo4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PriceExplainerBottomSheet$lambda$2(UUID uuid, Function0 function0, ExchangeSource exchangeSource, Integer num, SheetState sheetState, PriceExplainerDuxo priceExplainerDuxo, int i, int i2, Composer composer, int i3) {
        PriceExplainerBottomSheet(uuid, function0, exchangeSource, num, sheetState, priceExplainerDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PriceExplainerBottomSheet$lambda$3(PriceExplainerDuxo4 priceExplainerDuxo4, Integer num, SheetState sheetState, Function0 function0, int i, Composer composer, int i2) {
        PriceExplainerBottomSheet(priceExplainerDuxo4, num, sheetState, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PriceExplainerBottomSheetLoadedContent$lambda$5(PriceExplainerDuxo4.Loaded loaded, Integer num, SheetState sheetState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PriceExplainerBottomSheetLoadedContent(loaded, num, sheetState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PriceExplainerBottomSheet(final UUID eventContractId, final Function0<Unit> onDismiss, final ExchangeSource exchangeSource, Integer num, SheetState sheetState, PriceExplainerDuxo priceExplainerDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Integer num2;
        SheetState sheetState2;
        PriceExplainerDuxo priceExplainerDuxo2;
        Integer num3;
        SheetState sheetStateRememberModalBottomSheetState;
        int i4;
        boolean z;
        int i5;
        SheetState sheetState3;
        PriceExplainerDuxo priceExplainerDuxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        final SheetState sheetState4;
        final Integer num4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(eventContractId, "eventContractId");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-815710523);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(eventContractId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(exchangeSource == null ? -1 : exchangeSource.ordinal()) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                num2 = num;
                i3 |= composerStartRestartGroup.changed(num2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    sheetState2 = sheetState;
                    int i7 = composerStartRestartGroup.changed(sheetState2) ? 16384 : 8192;
                    i3 |= i7;
                } else {
                    sheetState2 = sheetState;
                }
                i3 |= i7;
            } else {
                sheetState2 = sheetState;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    priceExplainerDuxo2 = priceExplainerDuxo;
                    int i8 = composerStartRestartGroup.changedInstance(priceExplainerDuxo2) ? 131072 : 65536;
                    i3 |= i8;
                } else {
                    priceExplainerDuxo2 = priceExplainerDuxo;
                }
                i3 |= i8;
            } else {
                priceExplainerDuxo2 = priceExplainerDuxo;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    num3 = i6 == 0 ? null : num2;
                    if ((i2 & 16) == 0) {
                        sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
                        i3 &= -57345;
                    } else {
                        sheetStateRememberModalBottomSheetState = sheetState;
                    }
                    if ((i2 & 32) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        z = true;
                        i4 = -1;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PriceExplainerDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.event.trade.explainer.PriceExplainerKt$PriceExplainerBottomSheet$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.event.trade.explainer.PriceExplainerKt$PriceExplainerBottomSheet$$inlined$duxo$1.1
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
                        PriceExplainerDuxo priceExplainerDuxo4 = (PriceExplainerDuxo) baseDuxo;
                        i5 = i3 & (-458753);
                        sheetState3 = sheetStateRememberModalBottomSheetState;
                        priceExplainerDuxo3 = priceExplainerDuxo4;
                    } else {
                        i4 = -1;
                        z = true;
                        i5 = i3;
                        sheetState3 = sheetStateRememberModalBottomSheetState;
                        priceExplainerDuxo3 = priceExplainerDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    i4 = -1;
                    num3 = num2;
                    priceExplainerDuxo3 = priceExplainerDuxo2;
                    z = true;
                    i5 = i3;
                    sheetState3 = sheetState;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-815710523, i5, i4, "com.robinhood.android.event.trade.explainer.PriceExplainerBottomSheet (PriceExplainer.kt:45)");
                }
                int i9 = i5;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(priceExplainerDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i9 & 896) == 256 ? z : false) | composerStartRestartGroup.changedInstance(priceExplainerDuxo3) | composerStartRestartGroup.changedInstance(eventContractId);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new PriceExplainer2(priceExplainerDuxo3, eventContractId, exchangeSource, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                int i10 = ((i9 >> 6) & 1008) | ((i9 << 6) & 7168);
                priceExplainerDuxo2 = priceExplainerDuxo3;
                Integer num5 = num3;
                PriceExplainerBottomSheet(PriceExplainerBottomSheet$lambda$0(snapshotState4CollectAsStateWithLifecycle), num5, sheetState3, onDismiss, composerStartRestartGroup, i10);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                sheetState4 = sheetState3;
                num4 = num5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                num4 = num2;
                sheetState4 = sheetState2;
            }
            final PriceExplainerDuxo priceExplainerDuxo5 = priceExplainerDuxo2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.explainer.PriceExplainerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PriceExplainer.PriceExplainerBottomSheet$lambda$2(eventContractId, onDismiss, exchangeSource, num4, sheetState4, priceExplainerDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        num2 = num;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((74899 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i92 = i5;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(priceExplainerDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i92 & 896) == 256 ? z : false) | composerStartRestartGroup.changedInstance(priceExplainerDuxo3) | composerStartRestartGroup.changedInstance(eventContractId);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new PriceExplainer2(priceExplainerDuxo3, eventContractId, exchangeSource, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                    int i102 = ((i92 >> 6) & 1008) | ((i92 << 6) & 7168);
                    priceExplainerDuxo2 = priceExplainerDuxo3;
                    Integer num52 = num3;
                    PriceExplainerBottomSheet(PriceExplainerBottomSheet$lambda$0(snapshotState4CollectAsStateWithLifecycle2), num52, sheetState3, onDismiss, composerStartRestartGroup, i102);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    sheetState4 = sheetState3;
                    num4 = num52;
                }
            }
        }
        final PriceExplainerDuxo priceExplainerDuxo52 = priceExplainerDuxo2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void PriceExplainerBottomSheet(final PriceExplainerDuxo4 viewState, final Integer num, final SheetState sheetState, final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(616852190);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(num) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(sheetState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(616852190, i2, -1, "com.robinhood.android.event.trade.explainer.PriceExplainerBottomSheet (PriceExplainer.kt:67)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-546675085, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.explainer.PriceExplainerKt.PriceExplainerBottomSheet.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                    invoke(composer2, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-546675085, i3, -1, "com.robinhood.android.event.trade.explainer.PriceExplainerBottomSheet.<anonymous> (PriceExplainer.kt:69)");
                    }
                    final PriceExplainerDuxo4 priceExplainerDuxo4 = viewState;
                    final Integer num2 = num;
                    final SheetState sheetState2 = sheetState;
                    final Function0<Unit> function0 = onDismiss;
                    LocalShowPlaceholder.Loadable(priceExplainerDuxo4 instanceof PriceExplainerDuxo4.Loading, null, null, ComposableLambda3.rememberComposableLambda(-186832157, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.explainer.PriceExplainerKt.PriceExplainerBottomSheet.3.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num3) {
                            invoke(composer3, num3.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            PriceExplainerDuxo4.Loaded loaded;
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-186832157, i4, -1, "com.robinhood.android.event.trade.explainer.PriceExplainerBottomSheet.<anonymous>.<anonymous> (PriceExplainer.kt:70)");
                            }
                            PriceExplainerDuxo4 priceExplainerDuxo42 = priceExplainerDuxo4;
                            composer3.startReplaceGroup(842927257);
                            if (Intrinsics.areEqual(priceExplainerDuxo42, PriceExplainerDuxo4.Loading.INSTANCE)) {
                                loaded = new PriceExplainerDuxo4.Loaded(new OtherMarkdown("---------------------------\n", "--------------------------------------------------------------------------- ----------------------------------\n\n----------------------------------------------------------------------------------  --------------------------------------\n\n------------------------------------------"));
                            } else if (priceExplainerDuxo42 instanceof PriceExplainerDuxo4.Loaded) {
                                loaded = (PriceExplainerDuxo4.Loaded) priceExplainerDuxo4;
                            } else {
                                if (!Intrinsics.areEqual(priceExplainerDuxo42, PriceExplainerDuxo4.Error.INSTANCE)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                loaded = new PriceExplainerDuxo4.Loaded(new OtherMarkdown(StringResources_androidKt.stringResource(C11048R.string.error_title, composer3, 0), StringResources_androidKt.stringResource(C11048R.string.error_description_something_went_wrong, composer3, 0)));
                            }
                            PriceExplainerDuxo4.Loaded loaded2 = loaded;
                            composer3.endReplaceGroup();
                            PriceExplainer.PriceExplainerBottomSheetLoadedContent(loaded2, num2, sheetState2, function0, null, composer3, 0, 16);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.explainer.PriceExplainerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PriceExplainer.PriceExplainerBottomSheet$lambda$3(viewState, num, sheetState, onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final PriceExplainerDuxo4 PriceExplainerBottomSheet$lambda$0(SnapshotState4<? extends PriceExplainerDuxo4> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: PriceExplainer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.trade.explainer.PriceExplainerKt$PreviewPriceExplainerBottomSheet$1 */
    static final class C164701 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ PriceExplainerDuxo4 $viewState;

        C164701(PriceExplainerDuxo4 priceExplainerDuxo4) {
            this.$viewState = priceExplainerDuxo4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1521952187, i, -1, "com.robinhood.android.event.trade.explainer.PreviewPriceExplainerBottomSheet.<anonymous> (PriceExplainer.kt:105)");
            }
            PriceExplainerDuxo4 priceExplainerDuxo4 = this.$viewState;
            SheetState sheetStateRememberStandardBottomSheetState = BottomSheetScaffold.rememberStandardBottomSheetState(SheetValue.Expanded, null, false, composer, 6, 6);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.event.trade.explainer.PriceExplainerKt$PreviewPriceExplainerBottomSheet$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            PriceExplainer.PriceExplainerBottomSheet(priceExplainerDuxo4, null, sheetStateRememberStandardBottomSheetState, (Function0) objRememberedValue, composer, 3120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    private static final void PreviewPriceExplainerBottomSheet(final PriceExplainerDuxo4 priceExplainerDuxo4, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1558763635);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(priceExplainerDuxo4) : composerStartRestartGroup.changedInstance(priceExplainerDuxo4) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1558763635, i2, -1, "com.robinhood.android.event.trade.explainer.PreviewPriceExplainerBottomSheet (PriceExplainer.kt:103)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1521952187, true, new C164701(priceExplainerDuxo4), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.explainer.PriceExplainerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PriceExplainer.PreviewPriceExplainerBottomSheet$lambda$4(priceExplainerDuxo4, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PriceExplainerBottomSheetLoadedContent(final PriceExplainerDuxo4.Loaded loaded, final Integer num, final SheetState sheetState, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1933610837);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(num) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(sheetState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1933610837, i3, -1, "com.robinhood.android.event.trade.explainer.PriceExplainerBottomSheetLoadedContent (PriceExplainer.kt:138)");
                }
                int i5 = i3 >> 9;
                int i6 = (i5 & 112) | (i5 & 14) | 1572864 | ((i3 << 3) & 7168);
                Modifier modifier4 = modifier3;
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function0, modifier4, false, sheetState, null, 0L, ComposableLambda3.rememberComposableLambda(-2067242620, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.explainer.PriceExplainerKt.PriceExplainerBottomSheetLoadedContent.1
                    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i7) {
                        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                        if ((i7 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2067242620, i7, -1, "com.robinhood.android.event.trade.explainer.PriceExplainerBottomSheetLoadedContent.<anonymous> (PriceExplainer.kt:144)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(companion, bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM());
                        Integer num2 = num;
                        PriceExplainerDuxo4.Loaded loaded2 = loaded;
                        Function0<Unit> function02 = function0;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5145paddingqDBjuR0);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        composer2.startReplaceGroup(-244782220);
                        String strStringResource = num2 == null ? null : StringResources_androidKt.stringResource(num2.intValue(), composer2, 0);
                        composer2.endReplaceGroup();
                        if (strStringResource == null) {
                            strStringResource = loaded2.getContent().getTitle();
                        }
                        BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i8).m21593getSmallD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i8).getDisplayCapsuleSmall(), composer2, 0, 0, 8188);
                        BentoMarkdownText2.BentoMarkdownText(loaded2.getContent().getMarkdown2(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i8).getTextM(), 0, 0L, 0L, false, composer2, BentoMarkdownText.$stable << 15, 30), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                        BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C16465R.string.price_explainer_dismiss_label, composer2, 0), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num2) {
                        invoke(rhModalBottomSheet5, composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, i6, 52);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.explainer.PriceExplainerKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PriceExplainer.PriceExplainerBottomSheetLoadedContent$lambda$5(loaded, num, sheetState, function0, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i52 = i3 >> 9;
            int i62 = (i52 & 112) | (i52 & 14) | 1572864 | ((i3 << 3) & 7168);
            Modifier modifier42 = modifier3;
            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function0, modifier42, false, sheetState, null, 0L, ComposableLambda3.rememberComposableLambda(-2067242620, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.explainer.PriceExplainerKt.PriceExplainerBottomSheetLoadedContent.1
                public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i7) {
                    Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                    if ((i7 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2067242620, i7, -1, "com.robinhood.android.event.trade.explainer.PriceExplainerBottomSheetLoadedContent.<anonymous> (PriceExplainer.kt:144)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(companion, bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM());
                    Integer num2 = num;
                    PriceExplainerDuxo4.Loaded loaded2 = loaded;
                    Function0<Unit> function02 = function0;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5145paddingqDBjuR0);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    composer2.startReplaceGroup(-244782220);
                    String strStringResource = num2 == null ? null : StringResources_androidKt.stringResource(num2.intValue(), composer2, 0);
                    composer2.endReplaceGroup();
                    if (strStringResource == null) {
                        strStringResource = loaded2.getContent().getTitle();
                    }
                    BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i8).m21593getSmallD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i8).getDisplayCapsuleSmall(), composer2, 0, 0, 8188);
                    BentoMarkdownText2.BentoMarkdownText(loaded2.getContent().getMarkdown2(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i8).getTextM(), 0, 0L, 0L, false, composer2, BentoMarkdownText.$stable << 15, 30), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                    BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C16465R.string.price_explainer_dismiss_label, composer2, 0), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num2) {
                    invoke(rhModalBottomSheet5, composer2, num2.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, i62, 52);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
