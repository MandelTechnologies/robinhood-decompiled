package com.robinhood.shared.order.type.timeInForce;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import com.robinhood.android.common.C11048R;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposable5;
import com.robinhood.shared.order.type.timeInForce.SelectTimeInForceDuxo;
import com.robinhood.shared.order.type.timeInForce.SelectTimeInForceViewState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: SelectTimeInForceComposable.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001aG\u0010\u000b\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002"}, m3636d2 = {"SelectTimeInForceComposable", "", "initialTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "onTimeInForceSelected", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceDuxo;", "(Lcom/robinhood/models/db/OrderTimeInForce;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceDuxo;Landroidx/compose/runtime/Composer;II)V", "MainContent", "timeInForceValues", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceViewState$RowState;", "onRowClick", "onContinueClick", "Lkotlin/Function0;", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "lib-order-type_externalDebug", "viewState", "Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class SelectTimeInForceComposable5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$2(ImmutableList immutableList, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MainContent(immutableList, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$3(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectTimeInForceComposable$lambda$1(OrderTimeInForce orderTimeInForce, Function1 function1, Modifier modifier, SelectTimeInForceDuxo selectTimeInForceDuxo, int i, int i2, Composer composer, int i3) {
        SelectTimeInForceComposable(orderTimeInForce, function1, modifier, selectTimeInForceDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectTimeInForceComposable(final OrderTimeInForce initialTimeInForce, final Function1<? super OrderTimeInForce, Unit> onTimeInForceSelected, Modifier modifier, SelectTimeInForceDuxo selectTimeInForceDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SelectTimeInForceDuxo selectTimeInForceDuxo2;
        Modifier modifier3;
        Composer composer2;
        int i4;
        SelectTimeInForceDuxo selectTimeInForceDuxo3;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer3;
        final SelectTimeInForceDuxo selectTimeInForceDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(initialTimeInForce, "initialTimeInForce");
        Intrinsics.checkNotNullParameter(onTimeInForceSelected, "onTimeInForceSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(-223436883);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(initialTimeInForce.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTimeInForceSelected) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    selectTimeInForceDuxo2 = selectTimeInForceDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(selectTimeInForceDuxo2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    selectTimeInForceDuxo2 = selectTimeInForceDuxo;
                }
                i3 |= i6;
            } else {
                selectTimeInForceDuxo2 = selectTimeInForceDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        SelectTimeInForceDuxo.InitArgs initArgs = new SelectTimeInForceDuxo.InitArgs(initialTimeInForce);
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(defaultViewModelCreationExtras);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        composer2 = composerStartRestartGroup;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(SelectTimeInForceDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposableKt$SelectTimeInForceComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposableKt$SelectTimeInForceComposable$$inlined$duxo$1.1
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
                        i4 = i3 & (-7169);
                        selectTimeInForceDuxo3 = (SelectTimeInForceDuxo) baseDuxo;
                    } else {
                        composer2 = composerStartRestartGroup;
                        i4 = i3;
                        selectTimeInForceDuxo3 = selectTimeInForceDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                    selectTimeInForceDuxo3 = selectTimeInForceDuxo2;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-223436883, i4, -1, "com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposable (SelectTimeInForceComposable.kt:44)");
                }
                Composer composer4 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(selectTimeInForceDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                final LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composer4.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                modifier2 = modifier3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, ComposableLambda3.rememberComposableLambda(-987104407, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposableKt.SelectTimeInForceComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i7) {
                        if ((i7 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-987104407, i7, -1, "com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposable.<anonymous> (SelectTimeInForceComposable.kt:52)");
                        }
                        Function2<Composer, Integer, Unit> lambda$1212566940$lib_order_type_externalDebug = SelectTimeInForceComposable.INSTANCE.getLambda$1212566940$lib_order_type_externalDebug();
                        final LifecycleAwareNavigator lifecycleAwareNavigator2 = lifecycleAwareNavigator;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1212566940$lib_order_type_externalDebug, null, ComposableLambda3.rememberComposableLambda(-640828728, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposableKt.SelectTimeInForceComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer6, Integer num) {
                                invoke(bentoAppBarScope, composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer6, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i8 |= (i8 & 8) == 0 ? composer6.changed(BentoAppBar) : composer6.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-640828728, i8, -1, "com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposable.<anonymous>.<anonymous> (SelectTimeInForceComposable.kt:55)");
                                }
                                LifecycleAwareNavigator lifecycleAwareNavigator3 = lifecycleAwareNavigator2;
                                composer6.startReplaceGroup(5004770);
                                boolean zChanged = composer6.changed(lifecycleAwareNavigator3);
                                Object objRememberedValue2 = composer6.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new SelectTimeInForceComposable7(lifecycleAwareNavigator3);
                                    composer6.updateRememberedValue(objRememberedValue2);
                                }
                                composer6.endReplaceGroup();
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer6, BentoTheme.$stable).m21368getAccent0d7_KjU()), (Function0) objRememberedValue2, composer6, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer5, 54), null, null, false, false, null, null, 0L, null, composer5, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer4, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1921673218, true, new C393502(selectTimeInForceDuxo3, onTimeInForceSelected, snapshotState4CollectAsStateWithLifecycle), composer4, 54), composer4, ((i4 >> 6) & 14) | 805306416, 508);
                composer3 = composer4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                selectTimeInForceDuxo4 = selectTimeInForceDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                selectTimeInForceDuxo4 = selectTimeInForceDuxo2;
                composer3 = composerStartRestartGroup;
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SelectTimeInForceComposable5.SelectTimeInForceComposable$lambda$1(initialTimeInForce, onTimeInForceSelected, modifier4, selectTimeInForceDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i5 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(selectTimeInForceDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                final LifecycleAwareNavigator lifecycleAwareNavigator2 = (LifecycleAwareNavigator) composer42.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                modifier2 = modifier3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, ComposableLambda3.rememberComposableLambda(-987104407, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposableKt.SelectTimeInForceComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i7) {
                        if ((i7 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-987104407, i7, -1, "com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposable.<anonymous> (SelectTimeInForceComposable.kt:52)");
                        }
                        Function2<Composer, Integer, Unit> lambda$1212566940$lib_order_type_externalDebug = SelectTimeInForceComposable.INSTANCE.getLambda$1212566940$lib_order_type_externalDebug();
                        final LifecycleAwareNavigator lifecycleAwareNavigator22 = lifecycleAwareNavigator2;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1212566940$lib_order_type_externalDebug, null, ComposableLambda3.rememberComposableLambda(-640828728, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposableKt.SelectTimeInForceComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer6, Integer num) {
                                invoke(bentoAppBarScope, composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer6, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i8 |= (i8 & 8) == 0 ? composer6.changed(BentoAppBar) : composer6.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-640828728, i8, -1, "com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposable.<anonymous>.<anonymous> (SelectTimeInForceComposable.kt:55)");
                                }
                                LifecycleAwareNavigator lifecycleAwareNavigator3 = lifecycleAwareNavigator22;
                                composer6.startReplaceGroup(5004770);
                                boolean zChanged = composer6.changed(lifecycleAwareNavigator3);
                                Object objRememberedValue2 = composer6.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new SelectTimeInForceComposable7(lifecycleAwareNavigator3);
                                    composer6.updateRememberedValue(objRememberedValue2);
                                }
                                composer6.endReplaceGroup();
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer6, BentoTheme.$stable).m21368getAccent0d7_KjU()), (Function0) objRememberedValue2, composer6, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer5, 54), null, null, false, false, null, null, 0L, null, composer5, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer42, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1921673218, true, new C393502(selectTimeInForceDuxo3, onTimeInForceSelected, snapshotState4CollectAsStateWithLifecycle2), composer42, 54), composer42, ((i4 >> 6) & 14) | 805306416, 508);
                composer3 = composer42;
                if (ComposerKt.isTraceInProgress()) {
                }
                selectTimeInForceDuxo4 = selectTimeInForceDuxo3;
            }
        }
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: SelectTimeInForceComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposableKt$SelectTimeInForceComposable$2 */
    static final class C393502 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ SelectTimeInForceDuxo $duxo;
        final /* synthetic */ Function1<OrderTimeInForce, Unit> $onTimeInForceSelected;
        final /* synthetic */ SnapshotState4<SelectTimeInForceViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C393502(SelectTimeInForceDuxo selectTimeInForceDuxo, Function1<? super OrderTimeInForce, Unit> function1, SnapshotState4<SelectTimeInForceViewState> snapshotState4) {
            this.$duxo = selectTimeInForceDuxo;
            this.$onTimeInForceSelected = function1;
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i |= composer.changed(paddingValues) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1921673218, i, -1, "com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposable.<anonymous> (SelectTimeInForceComposable.kt:63)");
            }
            ImmutableList<SelectTimeInForceViewState.RowState> rows = SelectTimeInForceComposable5.SelectTimeInForceComposable$lambda$0(this.$viewState$delegate).getRows();
            SelectTimeInForceDuxo selectTimeInForceDuxo = this.$duxo;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(selectTimeInForceDuxo);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SelectTimeInForceComposable8(selectTimeInForceDuxo);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Function1 function1 = (Function1) ((KFunction) objRememberedValue);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onTimeInForceSelected) | composer.changed(this.$viewState$delegate);
            final Function1<OrderTimeInForce, Unit> function12 = this.$onTimeInForceSelected;
            final SnapshotState4<SelectTimeInForceViewState> snapshotState4 = this.$viewState$delegate;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposableKt$SelectTimeInForceComposable$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SelectTimeInForceComposable5.C393502.invoke$lambda$2$lambda$1(function12, snapshotState4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            SelectTimeInForceComposable5.MainContent(rows, function1, (Function0) objRememberedValue2, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer, StringResource.$stable, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(Function1 function1, SnapshotState4 snapshotState4) {
            function1.invoke(SelectTimeInForceComposable5.SelectTimeInForceComposable$lambda$0(snapshotState4).getSelectedTimeInForce());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MainContent(final ImmutableList<SelectTimeInForceViewState.RowState> immutableList, final Function1<? super OrderTimeInForce, Unit> function1, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1829681701);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(immutableList) : composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
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
                    ComposerKt.traceEventStart(1829681701, i3, -1, "com.robinhood.shared.order.type.timeInForce.MainContent (SelectTimeInForceComposable.kt:81)");
                }
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(1083683984, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposableKt.MainContent.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                        invoke(bentoButtonBar3, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1083683984, i5, -1, "com.robinhood.shared.order.type.timeInForce.MainContent.<anonymous> (SelectTimeInForceComposable.kt:84)");
                        }
                        Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                        BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer2, 0), modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1660893123, true, new C393472(modifier3, immutableList, function1), composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SelectTimeInForceComposable5.MainContent$lambda$2(immutableList, function1, function0, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(1083683984, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposableKt.MainContent.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1083683984, i5, -1, "com.robinhood.shared.order.type.timeInForce.MainContent.<anonymous> (SelectTimeInForceComposable.kt:84)");
                    }
                    Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                    BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer2, 0), modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1660893123, true, new C393472(modifier3, immutableList, function1), composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 3);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelectTimeInForceViewState SelectTimeInForceComposable$lambda$0(SnapshotState4<SelectTimeInForceViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: SelectTimeInForceComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposableKt$MainContent$2 */
    static final class C393472 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<OrderTimeInForce, Unit> $onRowClick;
        final /* synthetic */ ImmutableList<SelectTimeInForceViewState.RowState> $timeInForceValues;

        /* JADX WARN: Multi-variable type inference failed */
        C393472(Modifier modifier, ImmutableList<SelectTimeInForceViewState.RowState> immutableList, Function1<? super OrderTimeInForce, Unit> function1) {
            this.$modifier = modifier;
            this.$timeInForceValues = immutableList;
            this.$onRowClick = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1660893123, i, -1, "com.robinhood.shared.order.type.timeInForce.MainContent.<anonymous> (SelectTimeInForceComposable.kt:91)");
            }
            Modifier modifier = this.$modifier;
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$timeInForceValues) | composer.changed(this.$onRowClick);
            final ImmutableList<SelectTimeInForceViewState.RowState> immutableList = this.$timeInForceValues;
            final Function1<OrderTimeInForce, Unit> function1 = this.$onRowClick;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposableKt$MainContent$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SelectTimeInForceComposable5.C393472.invoke$lambda$3$lambda$2(immutableList, function1, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifier, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(final ImmutableList immutableList, final Function1 function1, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.item$default(LazyColumn, null, null, SelectTimeInForceComposable.INSTANCE.m25585getLambda$691869112$lib_order_type_externalDebug(), 3, null);
            final C39340xf4bbd033 c39340xf4bbd033 = new Function1() { // from class: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposableKt$MainContent$2$invoke$lambda$3$lambda$2$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(SelectTimeInForceViewState.RowState rowState) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((SelectTimeInForceViewState.RowState) obj);
                }
            };
            LazyColumn.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposableKt$MainContent$2$invoke$lambda$3$lambda$2$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c39340xf4bbd033.invoke(immutableList.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposableKt$MainContent$2$invoke$lambda$3$lambda$2$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                    int i3;
                    if ((i2 & 6) == 0) {
                        i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    final SelectTimeInForceViewState.RowState rowState = (SelectTimeInForceViewState.RowState) immutableList.get(i);
                    composer.startReplaceGroup(1520653357);
                    BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                    StringResource title = rowState.getTitle();
                    int i4 = StringResource.$stable;
                    BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(type2, StringResource2.getString(title, composer, i4), rowState.isSelected(), (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain(StringResource2.getString(rowState.getDescription(), composer, i4)), false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2032, (DefaultConstructorMarker) null);
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged = composer.changed(function1) | composer.changedInstance(rowState);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function12 = function1;
                        objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposableKt$MainContent$2$1$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function12.invoke(rowState.getTimeInForceValue());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState, (Function0) objRememberedValue, composer, BentoSelectionRowState.$stable << 3, 1);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            return Unit.INSTANCE;
        }
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1142945527);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1142945527, i, -1, "com.robinhood.shared.order.type.timeInForce.Preview (SelectTimeInForceComposable.kt:121)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, SelectTimeInForceComposable.INSTANCE.m25584getLambda$1042624849$lib_order_type_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SelectTimeInForceComposable5.Preview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
