package com.robinhood.shared.phone;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
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
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.shared.phone.SelectCountryCodeBottomSheetViewState;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: SelectCountryCodeBottomSheetComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r\u001a3\u0010\u000e\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0011\u001a\u0014\u0010\u0012\u001a\u00020\u0013*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¨\u0006\u0016²\u0006\n\u0010\u000f\u001a\u00020\u0017X\u008a\u0084\u0002"}, m3636d2 = {"SelectCountryCodeBottomSheetComposable", "", "onSelectCountryCode", "Lkotlin/Function1;", "Lcom/robinhood/iso/countrycode/CountryCode;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetDuxo;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetDuxo;Landroidx/compose/runtime/Composer;II)V", "Loading", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewLoading", "(Landroidx/compose/runtime/Composer;I)V", "Loaded", "viewState", "Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetViewState$Loaded;", "(Lkotlin/jvm/functions/Function1;Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetViewState$Loaded;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "displayText", "", "showCallingCode", "", "feature-phone_externalDebug", "Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.phone.SelectCountryCodeBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class SelectCountryCodeBottomSheetComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$8(Function1 function1, SelectCountryCodeBottomSheetViewState.Loaded loaded, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Loaded(function1, loaded, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loading$lambda$2(Modifier modifier, int i, int i2, Composer composer, int i3) {
        Loading(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLoading$lambda$3(int i, Composer composer, int i2) {
        PreviewLoading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectCountryCodeBottomSheetComposable$lambda$1(Function1 function1, Modifier modifier, SelectCountryCodeBottomSheetDuxo selectCountryCodeBottomSheetDuxo, int i, int i2, Composer composer, int i3) {
        SelectCountryCodeBottomSheetComposable(function1, modifier, selectCountryCodeBottomSheetDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectCountryCodeBottomSheetComposable(final Function1<? super CountryCode, Unit> onSelectCountryCode, Modifier modifier, SelectCountryCodeBottomSheetDuxo selectCountryCodeBottomSheetDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SelectCountryCodeBottomSheetDuxo selectCountryCodeBottomSheetDuxo2;
        int i4;
        final Modifier modifier3;
        SelectCountryCodeBottomSheetDuxo selectCountryCodeBottomSheetDuxo3;
        SelectCountryCodeBottomSheetViewState selectCountryCodeBottomSheetViewStateSelectCountryCodeBottomSheetComposable$lambda$0;
        final SelectCountryCodeBottomSheetDuxo selectCountryCodeBottomSheetDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onSelectCountryCode, "onSelectCountryCode");
        Composer composerStartRestartGroup = composer.startRestartGroup(1777368967);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onSelectCountryCode) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    selectCountryCodeBottomSheetDuxo2 = selectCountryCodeBottomSheetDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(selectCountryCodeBottomSheetDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    selectCountryCodeBottomSheetDuxo2 = selectCountryCodeBottomSheetDuxo;
                }
                i3 |= i6;
            } else {
                selectCountryCodeBottomSheetDuxo2 = selectCountryCodeBottomSheetDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(SelectCountryCodeBottomSheetDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.phone.SelectCountryCodeBottomSheetComposableKt$SelectCountryCodeBottomSheetComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.phone.SelectCountryCodeBottomSheetComposableKt$SelectCountryCodeBottomSheetComposable$$inlined$duxo$1.1
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
                        Modifier modifier5 = modifier4;
                        i4 = i3 & (-897);
                        modifier3 = modifier5;
                        selectCountryCodeBottomSheetDuxo3 = (SelectCountryCodeBottomSheetDuxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1777368967, i4, -1, "com.robinhood.shared.phone.SelectCountryCodeBottomSheetComposable (SelectCountryCodeBottomSheetComposable.kt:26)");
                        }
                        selectCountryCodeBottomSheetViewStateSelectCountryCodeBottomSheetComposable$lambda$0 = SelectCountryCodeBottomSheetComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(selectCountryCodeBottomSheetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                        if (!(selectCountryCodeBottomSheetViewStateSelectCountryCodeBottomSheetComposable$lambda$0 instanceof SelectCountryCodeBottomSheetViewState.Loaded)) {
                            composerStartRestartGroup.startReplaceGroup(1242440579);
                            Loaded(onSelectCountryCode, (SelectCountryCodeBottomSheetViewState.Loaded) selectCountryCodeBottomSheetViewStateSelectCountryCodeBottomSheetComposable$lambda$0, modifier3, composerStartRestartGroup, (i4 & 14) | ((i4 << 3) & 896), 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            if (!Intrinsics.areEqual(selectCountryCodeBottomSheetViewStateSelectCountryCodeBottomSheetComposable$lambda$0, SelectCountryCodeBottomSheetViewState.Loading.INSTANCE)) {
                                composerStartRestartGroup.startReplaceGroup(-1345397662);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceGroup(-1345387965);
                            Loading(modifier3, composerStartRestartGroup, (i4 >> 3) & 14, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        selectCountryCodeBottomSheetDuxo4 = selectCountryCodeBottomSheetDuxo3;
                    } else {
                        Modifier modifier6 = modifier4;
                        i4 = i3;
                        modifier3 = modifier6;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                }
                selectCountryCodeBottomSheetDuxo3 = selectCountryCodeBottomSheetDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                selectCountryCodeBottomSheetViewStateSelectCountryCodeBottomSheetComposable$lambda$0 = SelectCountryCodeBottomSheetComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(selectCountryCodeBottomSheetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (!(selectCountryCodeBottomSheetViewStateSelectCountryCodeBottomSheetComposable$lambda$0 instanceof SelectCountryCodeBottomSheetViewState.Loaded)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                selectCountryCodeBottomSheetDuxo4 = selectCountryCodeBottomSheetDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                selectCountryCodeBottomSheetDuxo4 = selectCountryCodeBottomSheetDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.phone.SelectCountryCodeBottomSheetComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SelectCountryCodeBottomSheetComposable4.SelectCountryCodeBottomSheetComposable$lambda$1(onSelectCountryCode, modifier3, selectCountryCodeBottomSheetDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Loading(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-777454995);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-777454995, i3, -1, "com.robinhood.shared.phone.Loading (SelectCountryCodeBottomSheetComposable.kt:43)");
            }
            LocalShowPlaceholder.Loadable(true, SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), null, SelectCountryCodeBottomSheetComposable.INSTANCE.getLambda$1619221501$feature_phone_externalDebug(), composerStartRestartGroup, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.phone.SelectCountryCodeBottomSheetComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SelectCountryCodeBottomSheetComposable4.Loading$lambda$2(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewLoading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2116075912);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2116075912, i, -1, "com.robinhood.shared.phone.PreviewLoading (SelectCountryCodeBottomSheetComposable.kt:64)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, SelectCountryCodeBottomSheetComposable.INSTANCE.m25588getLambda$1149280832$feature_phone_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.phone.SelectCountryCodeBottomSheetComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SelectCountryCodeBottomSheetComposable4.PreviewLoading$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Loaded(final Function1<? super CountryCode, Unit> function1, final SelectCountryCodeBottomSheetViewState.Loaded loaded, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(392463080);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(loaded) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(392463080, i3, -1, "com.robinhood.shared.phone.Loaded (SelectCountryCodeBottomSheetComposable.kt:75)");
                }
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(loaded) | ((i3 & 14) != 4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.phone.SelectCountryCodeBottomSheetComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SelectCountryCodeBottomSheetComposable4.Loaded$lambda$7$lambda$6(loaded, function1, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                LazyDslKt.LazyColumn(modifier5, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, (i3 >> 6) & 14, 510);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.phone.SelectCountryCodeBottomSheetComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SelectCountryCodeBottomSheetComposable4.Loaded$lambda$8(function1, loaded, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = composerStartRestartGroup.changedInstance(loaded) | ((i3 & 14) != 4);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.phone.SelectCountryCodeBottomSheetComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SelectCountryCodeBottomSheetComposable4.Loaded$lambda$7$lambda$6(loaded, function1, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                LazyDslKt.LazyColumn(modifier52, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, (i3 >> 6) & 14, 510);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$7$lambda$6(final SelectCountryCodeBottomSheetViewState.Loaded loaded, final Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List<CountryCode> countryCodes = loaded.getCountryCodes();
        final C39363x738e836c c39363x738e836c = new Function1() { // from class: com.robinhood.shared.phone.SelectCountryCodeBottomSheetComposableKt$Loaded$lambda$7$lambda$6$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(CountryCode countryCode) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((CountryCode) obj);
            }
        };
        LazyColumn.items(countryCodes.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.phone.SelectCountryCodeBottomSheetComposableKt$Loaded$lambda$7$lambda$6$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c39363x738e836c.invoke(countryCodes.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.phone.SelectCountryCodeBottomSheetComposableKt$Loaded$lambda$7$lambda$6$$inlined$items$default$4
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
                final CountryCode countryCode = (CountryCode) countryCodes.get(i);
                composer.startReplaceGroup(-1743449372);
                BentoBaseRowState bentoBaseRowState = new BentoBaseRowState(null, new BentoBaseRowState.Text.Plain(SelectCountryCodeBottomSheetComposable4.displayText(countryCode, loaded.getShowCallingCode())), null, null, null, !loaded.getProhibitedCountryCodes().contains(countryCode), false, 93, null);
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function1) | composer.changedInstance(countryCode);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = function1;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.shared.phone.SelectCountryCodeBottomSheetComposableKt$Loaded$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(countryCode);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState, false, false, false, 0L, (Function0) objRememberedValue, composer, BentoBaseRowState.$stable << 3, 61);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    private static final SelectCountryCodeBottomSheetViewState SelectCountryCodeBottomSheetComposable$lambda$0(SnapshotState4<? extends SelectCountryCodeBottomSheetViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayText(CountryCode countryCode, boolean z) {
        String str;
        InternationalInfo internationalInfoFromCountryCode$default = InternationalInfo.Companion.fromCountryCode$default(InternationalInfo.INSTANCE, null, countryCode, 1, null);
        if (z) {
            str = " (" + internationalInfoFromCountryCode$default.getDisplayCountryPhoneCode() + ")";
        } else {
            str = "";
        }
        return CountryCode.getDisplayCountry$default(countryCode, null, 1, null) + str;
    }
}
