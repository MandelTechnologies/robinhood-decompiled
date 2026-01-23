package com.robinhood.android.eventcontracts.hub.p134v2.root;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.eventcontracts.hub.p134v2.home.HubNavigationCallbacks;
import com.robinhood.android.eventcontracts.hub.p134v2.home.HubNavigationCallbacks2;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.HubBackground;
import com.robinhood.android.eventcontracts.hub.p134v2.root.navbar.HubNavBarDuxo;
import com.robinhood.android.eventcontracts.hub.p134v2.root.navbar.HubNavBarEvent;
import com.robinhood.android.eventcontracts.hub.p134v2.root.navbar.HubNavBarViewState;
import com.robinhood.android.eventcontracts.hub.p134v2.root.navbar.NavBarComposable3;
import com.robinhood.android.eventcontracts.hub.p134v2.root.navbar.NavBarComposable4;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubNavNode;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.iac.infobanner.InfoBannerComponent;
import com.robinhood.utils.extensions.Uuids;
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

/* compiled from: HubMainComposable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a'\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\f\u001a\u001d\u0010\r\u001a\u00020\u00012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012²\u0006\n\u0010\u0006\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\u0012\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u008a\u0084\u0002"}, m3636d2 = {"HubMainComposable", "", "screenEntryPoint", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "LayoutContent", "navBarState", "Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarViewState;", "onChildCategoryClicked", "Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/NavBarCallback;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarViewState;Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/NavBarCallback;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HandleNavEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarEvent;", "(Lcom/robinhood/android/udf/event/Event;Landroidx/compose/runtime/Composer;I)V", "feature-hub-v2_externalDebug", "events"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.HubMainComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class HubMainComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HandleNavEvent$lambda$6(Event event, int i, Composer composer, int i2) {
        HandleNavEvent(event, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HubMainComposable$lambda$1(String str, int i, Composer composer, int i2) {
        HubMainComposable(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LayoutContent$lambda$4(HubNavBarViewState hubNavBarViewState, NavBarComposable3 navBarComposable3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LayoutContent(hubNavBarViewState, navBarComposable3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void HubMainComposable(final String screenEntryPoint, Composer composer, final int i) {
        int i2;
        CreationExtras defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(screenEntryPoint, "screenEntryPoint");
        Composer composerStartRestartGroup = composer.startRestartGroup(-691058091);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(screenEntryPoint) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-691058091, i2, -1, "com.robinhood.android.eventcontracts.hub.v2.root.HubMainComposable (HubMainComposable.kt:40)");
            }
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
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(HubNavBarDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endReplaceableGroup();
            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
            final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.HubMainComposableKt$HubMainComposable$$inlined$duxo$1
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                        lifecycle.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle2 = lifecycle;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.HubMainComposableKt$HubMainComposable$$inlined$duxo$1.1
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
            final HubNavBarDuxo hubNavBarDuxo = (HubNavBarDuxo) baseDuxo;
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(hubNavBarDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            CompositionLocal3.CompositionLocalProvider(HubNavigationCallbacks2.getLocalHubNavigationCallbacks().provides(HubNavigationCallbacks2.rememberHubNavigationCallbacks(composerStartRestartGroup, 0)), ComposableLambda3.rememberComposableLambda(580124053, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.HubMainComposableKt.HubMainComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                private static final Event<HubNavBarEvent> invoke$lambda$2(SnapshotState4<Event<HubNavBarEvent>> snapshotState4) {
                    return snapshotState4.getValue();
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(580124053, i3, -1, "com.robinhood.android.eventcontracts.hub.v2.root.HubMainComposable.<anonymous> (HubMainComposable.kt:46)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    if (HubMainComposable3.HubMainComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isInPredictionMarketTestingExperiment()) {
                        modifierFillMaxSize$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, Color2.Color(4292072403L), null, 2, null);
                    }
                    final SnapshotState4<HubNavBarViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    final String str = screenEntryPoint;
                    final HubNavBarDuxo hubNavBarDuxo2 = hubNavBarDuxo;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    HubBackground.HubBackground(HubMainComposable3.HubMainComposable$lambda$0(snapshotState4).getBackgroundImageStyle(), SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composer2, 48, 0);
                    ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(1405373451, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.HubMainComposableKt$HubMainComposable$1$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1405373451, i4, -1, "com.robinhood.android.eventcontracts.hub.v2.root.HubMainComposable.<anonymous>.<anonymous>.<anonymous> (HubMainComposable.kt:60)");
                            }
                            final SnapshotState4<HubNavBarViewState> snapshotState42 = snapshotState4;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-62627842, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.HubMainComposableKt$HubMainComposable$1$2$1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i5) {
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-62627842, i5, -1, "com.robinhood.android.eventcontracts.hub.v2.root.HubMainComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HubMainComposable.kt:62)");
                                    }
                                    String title = HubMainComposable3.HubMainComposable$lambda$0(snapshotState42).getTitle();
                                    if (title == null) {
                                        title = "";
                                    }
                                    BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getTextM(), composer4, 0, 0, 8190);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, HubMainComposable.INSTANCE.getLambda$637307946$feature_hub_v2_externalDebug(), null, null, true, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer3, 12779910, 0, 1882);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), null, null, null, 0, Color.INSTANCE.m6725getTransparent0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(537579744, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.HubMainComposableKt$HubMainComposable$1$2$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(final PaddingValues paddingValues, Composer composer3, int i4) {
                            int i5;
                            EcHubNavNode node;
                            UUID id;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i4 & 6) == 0) {
                                i5 = i4 | (composer3.changed(paddingValues) ? 4 : 2);
                            } else {
                                i5 = i4;
                            }
                            if ((i5 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(537579744, i5, -1, "com.robinhood.android.eventcontracts.hub.v2.root.HubMainComposable.<anonymous>.<anonymous>.<anonymous> (HubMainComposable.kt:73)");
                            }
                            String identifier = HubMainComposable3.HubMainComposable$lambda$0(snapshotState4).getIdentifier();
                            Screen.Name name = Screen.Name.EVENT_CONTRACT_HUB_V2;
                            String description = HubMainComposable3.HubMainComposable$lambda$0(snapshotState4).getDescription();
                            HubNavBarViewState.DisplayChildCategory selectedCategory = HubMainComposable3.HubMainComposable$lambda$0(snapshotState4).getSelectedCategory();
                            String strSafeToString = (selectedCategory == null || (node = selectedCategory.getNode()) == null || (id = node.getId()) == null) ? null : Uuids.safeToString(id);
                            if (strSafeToString == null) {
                                strSafeToString = "";
                            }
                            UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(identifier, new Screen(name, description, strSafeToString, null, 8, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 52, null);
                            final HubNavBarDuxo hubNavBarDuxo3 = hubNavBarDuxo2;
                            final SnapshotState4<HubNavBarViewState> snapshotState42 = snapshotState4;
                            AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(1193615691, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.HubMainComposableKt$HubMainComposable$1$2$2.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i6) {
                                    if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1193615691, i6, -1, "com.robinhood.android.eventcontracts.hub.v2.root.HubMainComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HubMainComposable.kt:86)");
                                    }
                                    Modifier modifierLogScreenTransitions$default = Modifier.INSTANCE;
                                    Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(modifierLogScreenTransitions$default, 0.0f, 1, null), paddingValues);
                                    if (!HubMainComposable3.HubMainComposable$lambda$0(snapshotState42).isLoading()) {
                                        modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifierLogScreenTransitions$default, null, 1, null);
                                    }
                                    Modifier modifierThen = modifierPadding.then(modifierLogScreenTransitions$default);
                                    HubNavBarViewState hubNavBarViewStateHubMainComposable$lambda$0 = HubMainComposable3.HubMainComposable$lambda$0(snapshotState42);
                                    composer4.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer4.changedInstance(hubNavBarDuxo3);
                                    final HubNavBarDuxo hubNavBarDuxo4 = hubNavBarDuxo3;
                                    Object objRememberedValue2 = composer4.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new NavBarComposable3() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.HubMainComposableKt$HubMainComposable$1$2$2$1$1$1
                                            @Override // com.robinhood.android.eventcontracts.hub.p134v2.root.navbar.NavBarComposable3
                                            public final void onChildCategoryClicked(HubNavBarViewState.DisplayChildCategory category, String identifier2) {
                                                Intrinsics.checkNotNullParameter(category, "category");
                                                Intrinsics.checkNotNullParameter(identifier2, "identifier");
                                                hubNavBarDuxo4.onChildNodeSelected(category.getNode(), identifier2);
                                            }
                                        };
                                        composer4.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer4.endReplaceGroup();
                                    HubMainComposable3.LayoutContent(hubNavBarViewStateHubMainComposable$lambda$0, (NavBarComposable3) objRememberedValue2, modifierThen, composer4, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 806879280, 445);
                    composer2.endNode();
                    HubMainComposable3.HandleNavEvent(invoke$lambda$2(FlowExtKt.collectAsStateWithLifecycle(hubNavBarDuxo.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7)), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.HubMainComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HubMainComposable3.HubMainComposable$lambda$1(screenEntryPoint, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HubNavBarViewState HubMainComposable$lambda$0(SnapshotState4<HubNavBarViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LayoutContent(final HubNavBarViewState hubNavBarViewState, final NavBarComposable3 navBarComposable3, Modifier modifier, Composer composer, final int i, final int i2) {
        HubNavBarViewState hubNavBarViewState2;
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        HubNavBarViewState.LayoutContent presentLayoutContent;
        Unit unit;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1699807257);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            hubNavBarViewState2 = hubNavBarViewState;
        } else if ((i & 6) == 0) {
            hubNavBarViewState2 = hubNavBarViewState;
            i3 = (composerStartRestartGroup.changedInstance(hubNavBarViewState2) ? 4 : 2) | i;
        } else {
            hubNavBarViewState2 = hubNavBarViewState;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(navBarComposable3) : composerStartRestartGroup.changedInstance(navBarComposable3) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1699807257, i3, -1, "com.robinhood.android.eventcontracts.hub.v2.root.LayoutContent (HubMainComposable.kt:113)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                InfoBannerComponent.InfoBannerComponent(hubNavBarViewState2.getIndividualAccountNumber(), IacInfoBannerLocation.INFO_BANNER_EVENT_CONTRACT_HUB_TOP_LEVEL, null, null, null, null, null, null, null, null, null, null, null, composerStartRestartGroup, 48, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                NavBarComposable4.HubNavBarComposable(hubNavBarViewState, navBarComposable3, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 7, null), composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                presentLayoutContent = hubNavBarViewState.getPresentLayoutContent();
                composerStartRestartGroup.startReplaceGroup(225236469);
                if (presentLayoutContent != null) {
                    unit = null;
                } else {
                    HubCategoryContentComposable.HubCategoryContentComposable(presentLayoutContent.getIdToPresentInLayout(), presentLayoutContent.getNode().getDisplayLayoutType(), null, composerStartRestartGroup, 0, 4);
                    unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(225235468);
                if (unit == null) {
                    LoadingScreenComposablesKt.GenericBoxesLoadingScreenComposable(null, composerStartRestartGroup, 0, 1);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.HubMainComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HubMainComposable3.LayoutContent$lambda$4(hubNavBarViewState, navBarComposable3, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                InfoBannerComponent.InfoBannerComponent(hubNavBarViewState2.getIndividualAccountNumber(), IacInfoBannerLocation.INFO_BANNER_EVENT_CONTRACT_HUB_TOP_LEVEL, null, null, null, null, null, null, null, null, null, null, null, composerStartRestartGroup, 48, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifier52 = modifier4;
                NavBarComposable4.HubNavBarComposable(hubNavBarViewState, navBarComposable3, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 7, null), composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                presentLayoutContent = hubNavBarViewState.getPresentLayoutContent();
                composerStartRestartGroup.startReplaceGroup(225236469);
                if (presentLayoutContent != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(225235468);
                if (unit == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
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
    public static final void HandleNavEvent(final Event<HubNavBarEvent> event, Composer composer, final int i) {
        int i2;
        EventConsumer<HubNavBarEvent> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(1292377448);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(event) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1292377448, i2, -1, "com.robinhood.android.eventcontracts.hub.v2.root.HandleNavEvent (HubMainComposable.kt:136)");
            }
            final HubNavigationCallbacks hubNavigationCallbacks = (HubNavigationCallbacks) composerStartRestartGroup.consume(HubNavigationCallbacks2.getLocalHubNavigationCallbacks());
            if (event != null && (event.getData() instanceof HubNavBarEvent.PushNewScreen) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.HubMainComposableKt$HandleNavEvent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m14344invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m14344invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        HubNavBarEvent.PushNewScreen pushNewScreen = (HubNavBarEvent.PushNewScreen) event.getData();
                        hubNavigationCallbacks.openNewNodeScreen(pushNewScreen.getEntryNodeId(), pushNewScreen.getEntryPointIdentifier());
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.HubMainComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HubMainComposable3.HandleNavEvent$lambda$6(event, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
