package com.robinhood.android.eventcontracts.hub.p134v2.home;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.eventcontracts.hub.p134v2.HubTestTags;
import com.robinhood.android.eventcontracts.hub.p134v2.cards.EventCard;
import com.robinhood.android.eventcontracts.hub.p134v2.home.HubDefaultCategoryContentComposable4;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.SectionDividerComponent4;
import com.robinhood.android.eventcontracts.hub.p134v2.root.HubCategoryContentDelegate2;
import com.robinhood.android.eventcontracts.sharedeventui.LiveStatusIcon5;
import com.robinhood.android.eventcontracts.sharedeventui.StringUtil2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.extensions.AutomationTestTagModifierExt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
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
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: HubDefaultCategoryContentComposable.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a%\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u000f\u001a\u001f\u0010\u0010\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00112\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u0012\u001a\u001f\u0010\u0013\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00142\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\n\u0010\n\u001a\u00020\u0017X\u008a\u0084\u0002"}, m3636d2 = {"HubDefaultCategoryContentComposable", "", "key", "", "nodeId", "Ljava/util/UUID;", "duxo", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubDefaultCategoryContentDuxo;", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/android/eventcontracts/hub/v2/home/HubDefaultCategoryContentDuxo;Landroidx/compose/runtime/Composer;II)V", "LoadedLayoutComponents", "state", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubLayoutComponent;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SectionHeaderComponent", "Lcom/robinhood/android/eventcontracts/hub/v2/home/SectionHeaderComponentViewState;", "(Lcom/robinhood/android/eventcontracts/hub/v2/home/SectionHeaderComponentViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SeeMoreCtaComponent", "Lcom/robinhood/android/eventcontracts/hub/v2/home/SeeMoreCtaComponentViewState;", "(Lcom/robinhood/android/eventcontracts/hub/v2/home/SeeMoreCtaComponentViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-hub-v2_externalDebug", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubDefaultCategoryContentViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class HubDefaultCategoryContentComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HubDefaultCategoryContentComposable$lambda$5(String str, UUID uuid, HubDefaultCategoryContentDuxo hubDefaultCategoryContentDuxo, int i, int i2, Composer composer, int i3) {
        HubDefaultCategoryContentComposable(str, uuid, hubDefaultCategoryContentDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedLayoutComponents$lambda$6(ImmutableList immutableList, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadedLayoutComponents(immutableList, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SectionHeaderComponent$lambda$7(SectionHeaderComponentViewState sectionHeaderComponentViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SectionHeaderComponent(sectionHeaderComponentViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SeeMoreCtaComponent$lambda$10(SeeMoreCtaComponentViewState seeMoreCtaComponentViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SeeMoreCtaComponent(seeMoreCtaComponentViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HubDefaultCategoryContentComposable(final String key, final UUID nodeId, HubDefaultCategoryContentDuxo hubDefaultCategoryContentDuxo, Composer composer, final int i, final int i2) {
        int i3;
        HubDefaultCategoryContentDuxo hubDefaultCategoryContentDuxo2;
        CreationExtras defaultViewModelCreationExtras;
        HubDefaultCategoryContentDuxo hubDefaultCategoryContentDuxo3;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final HubDefaultCategoryContentDuxo hubDefaultCategoryContentDuxo4;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1127743668);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(key) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(nodeId) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                hubDefaultCategoryContentDuxo2 = hubDefaultCategoryContentDuxo;
                int i4 = composerStartRestartGroup.changedInstance(hubDefaultCategoryContentDuxo2) ? 256 : 128;
                i3 |= i4;
            } else {
                hubDefaultCategoryContentDuxo2 = hubDefaultCategoryContentDuxo;
            }
            i3 |= i4;
        } else {
            hubDefaultCategoryContentDuxo2 = hubDefaultCategoryContentDuxo;
        }
        int i5 = i3;
        if ((i5 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    int i6 = i5 << 3;
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    int i7 = i6 & 112;
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(HubDefaultCategoryContentDuxo.class), current, key, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, (i7 << 3) & 896, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentComposableKt$HubDefaultCategoryContentComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentComposableKt$HubDefaultCategoryContentComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    i5 &= -897;
                    hubDefaultCategoryContentDuxo3 = (HubDefaultCategoryContentDuxo) baseDuxo;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1127743668, i5, -1, "com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentComposable (HubDefaultCategoryContentComposable.kt:47)");
                }
                HubCategoryContentDelegate2.BindNodeId(hubDefaultCategoryContentDuxo3, nodeId, composerStartRestartGroup, ((i5 >> 6) & 14) | (i5 & 112));
                ImmutableList<HubDefaultCategoryContentViewState3> layoutComponents = HubDefaultCategoryContentComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(hubDefaultCategoryContentDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)).getLayoutComponents();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HubDefaultCategoryContentComposable4.HubDefaultCategoryContentComposable$lambda$2$lambda$1((AnimatedContentTransitionScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HubDefaultCategoryContentComposable4.HubDefaultCategoryContentComposable$lambda$4$lambda$3((ImmutableList) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                AnimatedContentKt.AnimatedContent(layoutComponents, null, function1, null, null, (Function1) objRememberedValue2, HubDefaultCategoryContentComposable.INSTANCE.m14329getLambda$888768089$feature_hub_v2_externalDebug(), composerStartRestartGroup, 1769856, 26);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                hubDefaultCategoryContentDuxo4 = hubDefaultCategoryContentDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i5 &= -897;
                }
            }
            hubDefaultCategoryContentDuxo3 = hubDefaultCategoryContentDuxo2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            HubCategoryContentDelegate2.BindNodeId(hubDefaultCategoryContentDuxo3, nodeId, composerStartRestartGroup, ((i5 >> 6) & 14) | (i5 & 112));
            ImmutableList<HubDefaultCategoryContentViewState3> layoutComponents2 = HubDefaultCategoryContentComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(hubDefaultCategoryContentDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)).getLayoutComponents();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            Function1 function12 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(layoutComponents2, null, function12, null, null, (Function1) objRememberedValue2, HubDefaultCategoryContentComposable.INSTANCE.m14329getLambda$888768089$feature_hub_v2_externalDebug(), composerStartRestartGroup, 1769856, 26);
            if (ComposerKt.isTraceInProgress()) {
            }
            hubDefaultCategoryContentDuxo4 = hubDefaultCategoryContentDuxo3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            hubDefaultCategoryContentDuxo4 = hubDefaultCategoryContentDuxo2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HubDefaultCategoryContentComposable4.HubDefaultCategoryContentComposable$lambda$5(key, nodeId, hubDefaultCategoryContentDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object HubDefaultCategoryContentComposable$lambda$4$lambda$3(ImmutableList immutableList) {
        return Boolean.valueOf(immutableList == null || immutableList.isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform HubDefaultCategoryContentComposable$lambda$2$lambda$1(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadedLayoutComponents(final ImmutableList<? extends HubDefaultCategoryContentViewState3> immutableList, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2010075901);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(immutableList) : composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2010075901, i3, -1, "com.robinhood.android.eventcontracts.hub.v2.home.LoadedLayoutComponents (HubDefaultCategoryContentComposable.kt:73)");
            }
            CompositionLocal3.CompositionLocalProvider(LiveStatusIcon5.getLocalLiveStatusIconAnimation().provides(LiveStatusIcon5.rememberLiveStatusIconAnimation(composerStartRestartGroup, 0)), ComposableLambda3.rememberComposableLambda(-294422595, true, new C165591(modifier, immutableList), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HubDefaultCategoryContentComposable4.LoadedLayoutComponents$lambda$6(immutableList, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: HubDefaultCategoryContentComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentComposableKt$LoadedLayoutComponents$1 */
    static final class C165591 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ ImmutableList<HubDefaultCategoryContentViewState3> $state;

        /* JADX WARN: Multi-variable type inference failed */
        C165591(Modifier modifier, ImmutableList<? extends HubDefaultCategoryContentViewState3> immutableList) {
            this.$modifier = modifier;
            this.$state = immutableList;
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
                ComposerKt.traceEventStart(-294422595, i, -1, "com.robinhood.android.eventcontracts.hub.v2.home.LoadedLayoutComponents.<anonymous> (HubDefaultCategoryContentComposable.kt:77)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(this.$modifier, 0.0f, 1, null);
            PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(0.0f, C2002Dp.m7995constructorimpl(12), 1, null);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$state);
            final ImmutableList<HubDefaultCategoryContentViewState3> immutableList = this.$state;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentComposableKt$LoadedLayoutComponents$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HubDefaultCategoryContentComposable4.C165591.invoke$lambda$4$lambda$3(immutableList, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, paddingValuesM5137PaddingValuesYgX7TsA$default, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 384, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(final ImmutableList immutableList, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            final Function1 function1 = new Function1() { // from class: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentComposableKt$LoadedLayoutComponents$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HubDefaultCategoryContentComposable4.C165591.invoke$lambda$4$lambda$3$lambda$0((HubDefaultCategoryContentViewState3) obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentComposableKt$LoadedLayoutComponents$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HubDefaultCategoryContentComposable4.C165591.invoke$lambda$4$lambda$3$lambda$1((HubDefaultCategoryContentViewState3) obj);
                }
            };
            LazyColumn.items(immutableList.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentComposableKt$LoadedLayoutComponents$1$invoke$lambda$4$lambda$3$$inlined$items$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return function1.invoke(immutableList.get(i));
                }
            }, new Function1<Integer, Object>() { // from class: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentComposableKt$LoadedLayoutComponents$1$invoke$lambda$4$lambda$3$$inlined$items$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return function12.invoke(immutableList.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentComposableKt$LoadedLayoutComponents$1$invoke$lambda$4$lambda$3$$inlined$items$3
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
                    HubDefaultCategoryContentViewState3 hubDefaultCategoryContentViewState3 = (HubDefaultCategoryContentViewState3) immutableList.get(i);
                    composer.startReplaceGroup(1150084406);
                    if (hubDefaultCategoryContentViewState3 instanceof HubDefaultCategoryContentViewState2) {
                        composer.startReplaceGroup(1150101548);
                        HubDefaultCategoryContentViewState2 hubDefaultCategoryContentViewState2 = (HubDefaultCategoryContentViewState2) hubDefaultCategoryContentViewState3;
                        EventCard.EventCard(hubDefaultCategoryContentViewState2, AutomationTestTagModifierExt.automationTestTag(com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer, 6, 1), HubTestTags.INSTANCE.eventCard(hubDefaultCategoryContentViewState2.getSectionIdentifier())), composer, 0, 0);
                        composer.endReplaceGroup();
                    } else if (hubDefaultCategoryContentViewState3 instanceof SectionHeaderComponentViewState) {
                        composer.startReplaceGroup(175664190);
                        SectionHeaderComponentViewState sectionHeaderComponentViewState = (SectionHeaderComponentViewState) hubDefaultCategoryContentViewState3;
                        HubDefaultCategoryContentComposable4.SectionHeaderComponent(sectionHeaderComponentViewState, AutomationTestTagModifierExt.automationTestTag(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(14), composer, 54, 0), HubTestTags.INSTANCE.sectionHeader(sectionHeaderComponentViewState.getSectionIdentifier())), composer, 0, 0);
                        composer.endReplaceGroup();
                    } else if (hubDefaultCategoryContentViewState3 instanceof SeeMoreCtaComponentViewState) {
                        composer.startReplaceGroup(175678189);
                        SeeMoreCtaComponentViewState seeMoreCtaComponentViewState = (SeeMoreCtaComponentViewState) hubDefaultCategoryContentViewState3;
                        HubDefaultCategoryContentComposable4.SeeMoreCtaComponent(seeMoreCtaComponentViewState, AutomationTestTagModifierExt.automationTestTag(com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), composer, 6, 1), HubTestTags.INSTANCE.seeMoreFooter(seeMoreCtaComponentViewState.getSectionIdentifier())), composer, 0, 0);
                        composer.endReplaceGroup();
                    } else {
                        if (!(hubDefaultCategoryContentViewState3 instanceof SectionDividerComponentViewState)) {
                            composer.startReplaceGroup(175646829);
                            composer.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer.startReplaceGroup(1151513815);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i4 = BentoTheme.$stable;
                        SectionDividerComponent4.SectionDividerComponent((SectionDividerComponentViewState) hubDefaultCategoryContentViewState3, AutomationTestTagModifierExt.automationTestTag(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM(), 5, null), HubTestTags.HUB_SECTION_DIVIDER_LINE), composer, 0, 0);
                        composer.endReplaceGroup();
                    }
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            LazyListScope.item$default(LazyColumn, null, null, HubDefaultCategoryContentComposable.INSTANCE.getLambda$566279186$feature_hub_v2_externalDebug(), 3, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invoke$lambda$4$lambda$3$lambda$0(HubDefaultCategoryContentViewState3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getIdentifier();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invoke$lambda$4$lambda$3$lambda$1(HubDefaultCategoryContentViewState3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Reflection.getOrCreateKotlinClass(it.getClass());
        }
    }

    private static final HubDefaultCategoryContentViewState HubDefaultCategoryContentComposable$lambda$0(SnapshotState4<HubDefaultCategoryContentViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SectionHeaderComponent(final SectionHeaderComponentViewState sectionHeaderComponentViewState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2111919882);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(sectionHeaderComponentViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2111919882, i3, -1, "com.robinhood.android.eventcontracts.hub.v2.home.SectionHeaderComponent (HubDefaultCategoryContentComposable.kt:153)");
                }
                int i5 = i3 & 112;
                modifier3 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(sectionHeaderComponentViewState.getTitle(), modifier3, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getDisplayCapsuleMedium(), composer2, i5, 0, 8188);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HubDefaultCategoryContentComposable4.SectionHeaderComponent$lambda$7(sectionHeaderComponentViewState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i52 = i3 & 112;
            modifier3 = modifier4;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(sectionHeaderComponentViewState.getTitle(), modifier3, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getDisplayCapsuleMedium(), composer2, i52, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SeeMoreCtaComponent(final SeeMoreCtaComponentViewState seeMoreCtaComponentViewState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final HubNavigationCallbacks hubNavigationCallbacks;
        final String str;
        final Modifier modifier3;
        boolean zChangedInstance;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(269408048);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(seeMoreCtaComponentViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(269408048, i3, -1, "com.robinhood.android.eventcontracts.hub.v2.home.SeeMoreCtaComponent (HubDefaultCategoryContentComposable.kt:165)");
                }
                hubNavigationCallbacks = (HubNavigationCallbacks) composerStartRestartGroup.consume(HubNavigationCallbacks2.getLocalHubNavigationCallbacks());
                str = "see-more-" + Uuids.safeToString(seeMoreCtaComponentViewState.getNextNodeId());
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(str, null, null, null, new Component(Component.ComponentType.BUTTON, str, null, 4, null), null, 46, null)), true, false, false, true, false, null, 108, null);
                modifier3 = modifier4;
                String text = StringUtil2.getText(seeMoreCtaComponentViewState.getLabel(), composerStartRestartGroup, StringResource.$stable);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(hubNavigationCallbacks) | composerStartRestartGroup.changedInstance(seeMoreCtaComponentViewState) | composerStartRestartGroup.changed(str);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HubDefaultCategoryContentComposable4.SeeMoreCtaComponent$lambda$9$lambda$8(hubNavigationCallbacks, seeMoreCtaComponentViewState, str);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, text, modifierAutoLogEvents$default, null, null, false, null, composerStartRestartGroup, 0, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HubDefaultCategoryContentComposable4.SeeMoreCtaComponent$lambda$10(seeMoreCtaComponentViewState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            hubNavigationCallbacks = (HubNavigationCallbacks) composerStartRestartGroup.consume(HubNavigationCallbacks2.getLocalHubNavigationCallbacks());
            str = "see-more-" + Uuids.safeToString(seeMoreCtaComponentViewState.getNextNodeId());
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(str, null, null, null, new Component(Component.ComponentType.BUTTON, str, null, 4, null), null, 46, null)), true, false, false, true, false, null, 108, null);
            modifier3 = modifier4;
            String text2 = StringUtil2.getText(seeMoreCtaComponentViewState.getLabel(), composerStartRestartGroup, StringResource.$stable);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = composerStartRestartGroup.changedInstance(hubNavigationCallbacks) | composerStartRestartGroup.changedInstance(seeMoreCtaComponentViewState) | composerStartRestartGroup.changed(str);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HubDefaultCategoryContentComposable4.SeeMoreCtaComponent$lambda$9$lambda$8(hubNavigationCallbacks, seeMoreCtaComponentViewState, str);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, text2, modifierAutoLogEvents$default2, null, null, false, null, composerStartRestartGroup, 0, 120);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SeeMoreCtaComponent$lambda$9$lambda$8(HubNavigationCallbacks hubNavigationCallbacks, SeeMoreCtaComponentViewState seeMoreCtaComponentViewState, String str) {
        hubNavigationCallbacks.openNewNodeScreen(seeMoreCtaComponentViewState.getNextNodeId(), "in-hub-" + str);
        return Unit.INSTANCE;
    }
}
