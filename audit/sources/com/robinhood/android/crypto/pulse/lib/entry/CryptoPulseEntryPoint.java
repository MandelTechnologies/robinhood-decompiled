package com.robinhood.android.crypto.pulse.lib.entry;

import android.content.Context;
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
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulsePreviewResponseDto;
import com.robinhood.android.cortex.models.asset.AssetDigest4;
import com.robinhood.android.crypto.pulse.lib.entry.CryptoPulseEntryPointEvent;
import com.robinhood.android.crypto.pulse.lib.entry.CryptoPulseEntryPointViewState;
import com.robinhood.android.crypto.pulse.lib.entry.views.CryptoPulseSeparateComponentEntryPoint4;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.shared.crypto.contracts.pulse.CryptoPulseIntentKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: CryptoPulseEntryPoint.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002²\u0006\u0012\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u008a\u0084\u0002"}, m3636d2 = {"CryptoPulseEntryPoint", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointDuxo;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointDuxo;Landroidx/compose/runtime/Composer;II)V", "lib-crypto-pulse_externalDebug", "viewState", "Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointViewState;", "eventState", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.pulse.lib.entry.CryptoPulseEntryPointKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoPulseEntryPoint {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPulseEntryPoint$lambda$3(Modifier modifier, CryptoPulseEntryPointDuxo cryptoPulseEntryPointDuxo, int i, int i2, Composer composer, int i3) {
        CryptoPulseEntryPoint(modifier, cryptoPulseEntryPointDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPulseEntryPoint$lambda$6(Modifier modifier, CryptoPulseEntryPointDuxo cryptoPulseEntryPointDuxo, int i, int i2, Composer composer, int i3) {
        CryptoPulseEntryPoint(modifier, cryptoPulseEntryPointDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoPulseEntryPoint(final Modifier modifier, final CryptoPulseEntryPointDuxo cryptoPulseEntryPointDuxo, Composer composer, final int i, final int i2) {
        int i3;
        final Navigator navigator;
        final Context context;
        final Event<CryptoPulseEntryPointEvent> eventCryptoPulseEntryPoint$lambda$1;
        final CryptoPulseEntryPointViewState cryptoPulseEntryPointViewStateCryptoPulseEntryPoint$lambda$0;
        EventConsumer<CryptoPulseEntryPointEvent> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(-515481398);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changedInstance(cryptoPulseEntryPointDuxo)) ? 32 : 16;
        }
        int i5 = i3;
        if ((i5 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoPulseEntryPointDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.pulse.lib.entry.CryptoPulseEntryPointKt$CryptoPulseEntryPoint$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.pulse.lib.entry.CryptoPulseEntryPointKt$CryptoPulseEntryPoint$$inlined$duxo$1.1
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
                    cryptoPulseEntryPointDuxo = (CryptoPulseEntryPointDuxo) baseDuxo;
                    i5 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-515481398, i5, -1, "com.robinhood.android.crypto.pulse.lib.entry.CryptoPulseEntryPoint (CryptoPulseEntryPoint.kt:19)");
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoPulseEntryPointDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoPulseEntryPointDuxo.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                eventCryptoPulseEntryPoint$lambda$1 = CryptoPulseEntryPoint$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoPulseEntryPoint$lambda$1 != null && (eventCryptoPulseEntryPoint$lambda$1.getData() instanceof CryptoPulseEntryPointEvent) && (eventConsumerInvoke = eventCryptoPulseEntryPoint$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventCryptoPulseEntryPoint$lambda$1, new Function1() { // from class: com.robinhood.android.crypto.pulse.lib.entry.CryptoPulseEntryPointKt$CryptoPulseEntryPoint$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m12964invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m12964invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CryptoPulseEntryPointEvent cryptoPulseEntryPointEvent = (CryptoPulseEntryPointEvent) eventCryptoPulseEntryPoint$lambda$1.getData();
                            if (!(cryptoPulseEntryPointEvent instanceof CryptoPulseEntryPointEvent.ShowDigestFragment)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Navigator.DefaultImpls.startActivity$default(navigator, context, new CryptoPulseIntentKey(new CryptoPulseIntentKey.Destination.ShowDigestFragment(((CryptoPulseEntryPointEvent.ShowDigestFragment) cryptoPulseEntryPointEvent).getFragmentKey())), null, false, null, null, 60, null);
                        }
                    });
                }
                cryptoPulseEntryPointViewStateCryptoPulseEntryPoint$lambda$0 = CryptoPulseEntryPoint$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (!(cryptoPulseEntryPointViewStateCryptoPulseEntryPoint$lambda$0 instanceof CryptoPulseEntryPointViewState.Gone)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.pulse.lib.entry.CryptoPulseEntryPointKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoPulseEntryPoint.CryptoPulseEntryPoint$lambda$3(modifier, cryptoPulseEntryPointDuxo, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                if (!(cryptoPulseEntryPointViewStateCryptoPulseEntryPoint$lambda$0 instanceof CryptoPulseEntryPointViewState.Visible)) {
                    throw new NoWhenBranchMatchedException();
                }
                CryptoPulseEntryPointViewState.Visible visible = (CryptoPulseEntryPointViewState.Visible) cryptoPulseEntryPointViewStateCryptoPulseEntryPoint$lambda$0;
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChanged = composerStartRestartGroup.changed(cryptoPulseEntryPointViewStateCryptoPulseEntryPoint$lambda$0) | composerStartRestartGroup.changedInstance(cryptoPulseEntryPointDuxo) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.pulse.lib.entry.CryptoPulseEntryPointKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoPulseEntryPoint.CryptoPulseEntryPoint$lambda$5$lambda$4(cryptoPulseEntryPointViewStateCryptoPulseEntryPoint$lambda$0, cryptoPulseEntryPointDuxo, navigator, context);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier2 = modifier;
                Composer composer2 = composerStartRestartGroup;
                CryptoPulseSeparateComponentEntryPoint4.CryptoPulseSeparateComponentEntryPoint(visible, (Function0) objRememberedValue2, modifier2, composer2, (i5 << 6) & 896, 0);
                composerStartRestartGroup = composer2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier = modifier2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(cryptoPulseEntryPointDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(cryptoPulseEntryPointDuxo.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                eventCryptoPulseEntryPoint$lambda$1 = CryptoPulseEntryPoint$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoPulseEntryPoint$lambda$1 != null) {
                    eventConsumerInvoke.consume(eventCryptoPulseEntryPoint$lambda$1, new Function1() { // from class: com.robinhood.android.crypto.pulse.lib.entry.CryptoPulseEntryPointKt$CryptoPulseEntryPoint$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m12964invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m12964invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CryptoPulseEntryPointEvent cryptoPulseEntryPointEvent = (CryptoPulseEntryPointEvent) eventCryptoPulseEntryPoint$lambda$1.getData();
                            if (!(cryptoPulseEntryPointEvent instanceof CryptoPulseEntryPointEvent.ShowDigestFragment)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Navigator.DefaultImpls.startActivity$default(navigator, context, new CryptoPulseIntentKey(new CryptoPulseIntentKey.Destination.ShowDigestFragment(((CryptoPulseEntryPointEvent.ShowDigestFragment) cryptoPulseEntryPointEvent).getFragmentKey())), null, false, null, null, 60, null);
                        }
                    });
                }
                cryptoPulseEntryPointViewStateCryptoPulseEntryPoint$lambda$0 = CryptoPulseEntryPoint$lambda$0(snapshotState4CollectAsStateWithLifecycle3);
                if (!(cryptoPulseEntryPointViewStateCryptoPulseEntryPoint$lambda$0 instanceof CryptoPulseEntryPointViewState.Gone)) {
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.crypto.pulse.lib.entry.CryptoPulseEntryPointKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoPulseEntryPoint.CryptoPulseEntryPoint$lambda$6(modifier, cryptoPulseEntryPointDuxo, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPulseEntryPoint$lambda$5$lambda$4(CryptoPulseEntryPointViewState cryptoPulseEntryPointViewState, CryptoPulseEntryPointDuxo cryptoPulseEntryPointDuxo, Navigator navigator, Context context) {
        GetCryptoPulsePreviewResponseDto.TapActionDto.TypeDto type2 = ((CryptoPulseEntryPointViewState.Visible) cryptoPulseEntryPointViewState).getTapAction().getType();
        if (type2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (type2 instanceof GetCryptoPulsePreviewResponseDto.TapActionDto.TypeDto.ShowDigestDetails) {
            cryptoPulseEntryPointDuxo.onShowDigestDetailClicked(AssetDigest4.toUiModel(((GetCryptoPulsePreviewResponseDto.TapActionDto.TypeDto.ShowDigestDetails) type2).getValue()));
        } else {
            if (!(type2 instanceof GetCryptoPulsePreviewResponseDto.TapActionDto.TypeDto.ShowFeed)) {
                throw new NoWhenBranchMatchedException();
            }
            Navigator.DefaultImpls.startActivity$default(navigator, context, new CryptoPulseIntentKey(CryptoPulseIntentKey.Destination.Feed.INSTANCE), null, false, null, NavigationType.PUSH, 28, null);
        }
        return Unit.INSTANCE;
    }

    private static final CryptoPulseEntryPointViewState CryptoPulseEntryPoint$lambda$0(SnapshotState4<? extends CryptoPulseEntryPointViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoPulseEntryPointEvent> CryptoPulseEntryPoint$lambda$1(SnapshotState4<Event<CryptoPulseEntryPointEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
