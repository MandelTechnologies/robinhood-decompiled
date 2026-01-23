package com.robinhood.android.options.comboorders.detail;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarComposable;
import com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarDuxo;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
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

/* compiled from: ComboOrderDetailComposable.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a%\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002"}, m3636d2 = {"ComboOrderDetailComposable", "", "duxo", "Lcom/robinhood/android/options/comboorders/detail/ComboOrderDetailDuxo;", "modifier", "Landroidx/compose/ui/Modifier;", "onBackPressed", "Lkotlin/Function0;", "(Lcom/robinhood/android/options/comboorders/detail/ComboOrderDetailDuxo;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LoadingContent", "(Landroidx/compose/runtime/Composer;I)V", "LoadedContent", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-combo-order-detail_externalDebug", "viewState", "Lcom/robinhood/android/options/comboorders/detail/ComboOrderDetailViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ComboOrderDetailComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComboOrderDetailComposable$lambda$1(ComboOrderDetailDuxo comboOrderDetailDuxo, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        ComboOrderDetailComposable(comboOrderDetailDuxo, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedContent$lambda$3(Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        LoadedContent(modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingContent$lambda$2(int i, Composer composer, int i2) {
        LoadingContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ComboOrderDetailComposable(final ComboOrderDetailDuxo duxo, Modifier modifier, final Function0<Unit> onBackPressed, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(683593930);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(683593930, i3, -1, "com.robinhood.android.options.comboorders.detail.ComboOrderDetailComposable (ComboOrderDetailComposable.kt:49)");
            }
            if (ComboOrderDetailComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)).isLoading()) {
                composerStartRestartGroup.startReplaceGroup(-1787908936);
                LoadingContent(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1787870558);
                LoadedContent(modifier, onBackPressed, composerStartRestartGroup, (i3 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.comboorders.detail.ComboOrderDetailComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComboOrderDetailComposableKt.ComboOrderDetailComposable$lambda$1(duxo, modifier2, onBackPressed, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void LoadingContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1224217561);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1224217561, i, -1, "com.robinhood.android.options.comboorders.detail.LoadingContent (ComboOrderDetailComposable.kt:59)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, ComposableSingletons$ComboOrderDetailComposableKt.INSTANCE.getLambda$2056932503$feature_combo_order_detail_externalDebug(), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.comboorders.detail.ComboOrderDetailComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComboOrderDetailComposableKt.LoadingContent$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final ComboOrderDetailViewState ComboOrderDetailComposable$lambda$0(SnapshotState4<ComboOrderDetailViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final void LoadedContent(Modifier modifier, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2100899455);
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
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2100899455, i3, -1, "com.robinhood.android.options.comboorders.detail.LoadedContent (ComboOrderDetailComposable.kt:178)");
            }
            Modifier modifierTestTag = TestTag3.testTag(WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null)), TestTags.LOADED);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            modifier3 = modifier4;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierTestTag, ComposableLambda3.rememberComposableLambda(2086896451, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.comboorders.detail.ComboOrderDetailComposableKt.LoadedContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2086896451, i6, -1, "com.robinhood.android.options.comboorders.detail.LoadedContent.<anonymous> (ComboOrderDetailComposable.kt:188)");
                    }
                    composer3.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer3, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composer3, 0);
                    composer3.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ComboOrderDetailTopbarDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer3, 0, 0);
                    composer3.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composer3.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composer3.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer3.changedInstance(baseDuxo) | composer3.changedInstance(lifecycle);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.options.comboorders.detail.ComboOrderDetailComposableKt$LoadedContent$1$invoke$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.options.comboorders.detail.ComboOrderDetailComposableKt$LoadedContent$1$invoke$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    composer3.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer3, 0);
                    composer3.endReplaceGroup();
                    ComboOrderDetailTopbarComposable.ComboOrderDetailTopbarComposable((ComboOrderDetailTopbarDuxo) baseDuxo, function0, null, composer3, 0, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null), ComposableSingletons$ComboOrderDetailComposableKt.INSTANCE.m16897getLambda$2131860978$feature_combo_order_detail_externalDebug(), composer2, 805306416, 60);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.comboorders.detail.ComboOrderDetailComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComboOrderDetailComposableKt.LoadedContent$lambda$3(modifier3, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
