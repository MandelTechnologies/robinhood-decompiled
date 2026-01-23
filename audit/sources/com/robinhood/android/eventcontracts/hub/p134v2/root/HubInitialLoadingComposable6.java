package com.robinhood.android.eventcontracts.hub.p134v2.root;

import android.content.res.Resources;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
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
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.NavOptionsBuilder4;
import com.robinhood.android.eventcontracts.hub.p134v2.navigation.HubRootNavGraphDestinations;
import com.robinhood.android.eventcontracts.hub.p134v2.navigation.HubRootNavGraphDestinations2;
import com.robinhood.android.eventcontracts.hub.p134v2.root.HubInitialLoadingDuxo;
import com.robinhood.android.eventcontracts.hub.p134v2.root.NavigateToCategoryContentEvent;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.NavTransition;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: HubInitialLoadingComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\u0012\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u008a\u0084\u0002"}, m3636d2 = {"HubInitialLoadingComposable", "", "entryPointIdentifier", "", "initialNodeId", "Ljava/util/UUID;", "(Ljava/lang/String;Ljava/util/UUID;Landroidx/compose/runtime/Composer;I)V", "feature-hub-v2_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/eventcontracts/hub/v2/root/NavigateToCategoryContentEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.HubInitialLoadingComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class HubInitialLoadingComposable6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HubInitialLoadingComposable$lambda$3(String str, UUID uuid, int i, Composer composer, int i2) {
        HubInitialLoadingComposable(str, uuid, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void HubInitialLoadingComposable(final String entryPointIdentifier, final UUID uuid, Composer composer, final int i) {
        int i2;
        CreationExtras defaultViewModelCreationExtras;
        EventConsumer<NavigateToCategoryContentEvent> eventConsumerInvoke;
        Intrinsics.checkNotNullParameter(entryPointIdentifier, "entryPointIdentifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1595119292);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(entryPointIdentifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(uuid) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1595119292, i2, -1, "com.robinhood.android.eventcontracts.hub.v2.root.HubInitialLoadingComposable (HubInitialLoadingComposable.kt:18)");
            }
            HubInitialLoadingDuxo.InitialArgs initialArgs = new HubInitialLoadingDuxo.InitialArgs(entryPointIdentifier, uuid);
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
            creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initialArgs)));
            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(HubInitialLoadingDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
            final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.HubInitialLoadingComposableKt$HubInitialLoadingComposable$$inlined$duxo$1
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                        lifecycle.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle2 = lifecycle;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.HubInitialLoadingComposableKt$HubInitialLoadingComposable$$inlined$duxo$1.1
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
            HubInitialLoadingDuxo hubInitialLoadingDuxo = (HubInitialLoadingDuxo) baseDuxo;
            HubInitialLoadingComposable hubInitialLoadingComposable = HubInitialLoadingComposable.INSTANCE;
            ScaffoldKt.m5939ScaffoldTvnljyQ(null, hubInitialLoadingComposable.m14338getLambda$823674360$feature_hub_v2_externalDebug(), null, null, null, 0, 0L, 0L, null, hubInitialLoadingComposable.m14337getLambda$1812423213$feature_hub_v2_externalDebug(), composerStartRestartGroup, 805306416, 509);
            composerStartRestartGroup = composerStartRestartGroup;
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(hubInitialLoadingDuxo.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
            final Event<NavigateToCategoryContentEvent> eventHubInitialLoadingComposable$lambda$0 = HubInitialLoadingComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            if (eventHubInitialLoadingComposable$lambda$0 != null && (eventHubInitialLoadingComposable$lambda$0.getData() instanceof NavigateToCategoryContentEvent) && (eventConsumerInvoke = eventHubInitialLoadingComposable$lambda$0.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventHubInitialLoadingComposable$lambda$0, new Function1() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.HubInitialLoadingComposableKt$HubInitialLoadingComposable$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Resources.NotFoundException {
                        m14341invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m14341invoke(Object it) throws Resources.NotFoundException {
                        Intrinsics.checkNotNullParameter(it, "it");
                        List<NavigateToCategoryContentEvent.HubNavigation> navTargets = ((NavigateToCategoryContentEvent) eventHubInitialLoadingComposable$lambda$0.getData()).getNavTargets(entryPointIdentifier);
                        if (navTargets == null) {
                            LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, HubRootNavGraphDestinations2.INSTANCE, new HubRootNavGraphDestinations2.Args(entryPointIdentifier, null, null, 4, null), NavTransition.CROSS_FADE, null, false, new Function1<NavOptionsBuilder, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.HubInitialLoadingComposableKt$HubInitialLoadingComposable$1$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(NavOptionsBuilder navOptionsBuilder) {
                                    invoke2(navOptionsBuilder);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(NavOptionsBuilder navigate) {
                                    Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
                                    navigate.popUpTo(HubRootNavGraphDestinations.INSTANCE.getRoutePath(), new Function1<NavOptionsBuilder4, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.HubInitialLoadingComposableKt$HubInitialLoadingComposable$1$2.1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(NavOptionsBuilder4 navOptionsBuilder4) {
                                            invoke2(navOptionsBuilder4);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(NavOptionsBuilder4 popUpTo) {
                                            Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
                                            popUpTo.setInclusive(true);
                                        }
                                    });
                                }
                            }, 24, null);
                            return;
                        }
                        for (NavigateToCategoryContentEvent.HubNavigation hubNavigation : navTargets) {
                            LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, HubRootNavGraphDestinations2.INSTANCE, hubNavigation.getTarget(), hubNavigation.getTransition(), null, true, new Function1<NavOptionsBuilder, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.HubInitialLoadingComposableKt$HubInitialLoadingComposable$1$1$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(NavOptionsBuilder navOptionsBuilder) {
                                    invoke2(navOptionsBuilder);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(NavOptionsBuilder navigate) {
                                    Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
                                    navigate.popUpTo(HubRootNavGraphDestinations.INSTANCE.getRoutePath(), new Function1<NavOptionsBuilder4, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.HubInitialLoadingComposableKt$HubInitialLoadingComposable$1$1$1.1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(NavOptionsBuilder4 navOptionsBuilder4) {
                                            invoke2(navOptionsBuilder4);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(NavOptionsBuilder4 popUpTo) {
                                            Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
                                            popUpTo.setInclusive(true);
                                        }
                                    });
                                }
                            }, 8, null);
                        }
                    }
                });
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.HubInitialLoadingComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HubInitialLoadingComposable6.HubInitialLoadingComposable$lambda$3(entryPointIdentifier, uuid, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final Event<NavigateToCategoryContentEvent> HubInitialLoadingComposable$lambda$0(SnapshotState4<Event<NavigateToCategoryContentEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
