package com.robinhood.android.gold.upgrade.unified.screen;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
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
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeWelcomeAlertMessageComposable;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedConfirmationComposable3;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedConfirmationViewState;
import com.robinhood.android.mediaservice.ImageDensityUrl;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.p409ui.edge2edge.OverrideSystemBarsStyle;
import gold_flow.proto.p466v1.Action;
import gold_flow.proto.p466v1.Cta;
import gold_flow.proto.p466v1.GoldConfirmationAlert;
import gold_flow.proto.p466v1.StreamConfirmationContentResponse;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
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

/* compiled from: GoldUnifiedConfirmationComposable.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\u001a7\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001aD\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152#\u0010\u0016\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\t0\u00172\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u001c\u001a\u0017\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u001e\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020!X\u008a\u0084\u0002"}, m3636d2 = {"ConfirmationImageTestTag", "", "getConfirmationImageTestTag$annotations", "()V", "ConfirmationPrimaryCtaTestTag", "getConfirmationPrimaryCtaTestTag$annotations", "CONFIRMATION_IMAGE_ASPECT_RATIO", "", "GoldUnifiedConfirmationComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedConfirmationDuxo;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedConfirmationDuxo;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Landroidx/compose/runtime/Composer;II)V", "Loaded", "state", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedConfirmationViewState$Loaded;", "onAction", "Lkotlin/Function1;", "Lgold_flow/proto/v1/Action;", "Lkotlin/ParameterName;", "name", "action", "(Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedConfirmationViewState$Loaded;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Loading", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-gold-upgrade_externalRelease", "viewState", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedConfirmationViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedConfirmationComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldUnifiedConfirmationComposable3 {
    private static final float CONFIRMATION_IMAGE_ASPECT_RATIO = 0.77319586f;
    public static final String ConfirmationImageTestTag = "confirmationImage";
    public static final String ConfirmationPrimaryCtaTestTag = "confirmation_primary_cta";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUnifiedConfirmationComposable$lambda$2(Modifier modifier, GoldUnifiedConfirmationDuxo goldUnifiedConfirmationDuxo, Screen screen, Context context, int i, int i2, Composer composer, int i3) {
        GoldUnifiedConfirmationComposable(modifier, goldUnifiedConfirmationDuxo, screen, context, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$3(GoldUnifiedConfirmationViewState.Loaded loaded, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Loaded(loaded, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loading$lambda$4(Modifier modifier, int i, int i2, Composer composer, int i3) {
        Loading(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getConfirmationImageTestTag$annotations() {
    }

    public static /* synthetic */ void getConfirmationPrimaryCtaTestTag$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b6  */
    /* JADX WARN: Type inference failed for: r2v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldUnifiedConfirmationComposable(Modifier modifier, GoldUnifiedConfirmationDuxo goldUnifiedConfirmationDuxo, Screen screen, Context context, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        GoldUnifiedConfirmationDuxo goldUnifiedConfirmationDuxo2;
        Screen screen2;
        Context context2;
        final Modifier modifier3;
        boolean z;
        Context context3;
        ?? r2;
        GoldUnifiedConfirmationViewState goldUnifiedConfirmationViewStateGoldUnifiedConfirmationComposable$lambda$0;
        final GoldUnifiedConfirmationDuxo goldUnifiedConfirmationDuxo3;
        final Screen screen3;
        final Context context4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1842341911);
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
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                goldUnifiedConfirmationDuxo2 = goldUnifiedConfirmationDuxo;
                int i5 = composerStartRestartGroup.changedInstance(goldUnifiedConfirmationDuxo2) ? 32 : 16;
                i3 |= i5;
            } else {
                goldUnifiedConfirmationDuxo2 = goldUnifiedConfirmationDuxo;
            }
            i3 |= i5;
        } else {
            goldUnifiedConfirmationDuxo2 = goldUnifiedConfirmationDuxo;
        }
        if ((i & 384) == 0) {
            screen2 = screen;
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changedInstance(screen2)) ? 256 : 128;
        } else {
            screen2 = screen;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                context2 = context;
                i3 |= composerStartRestartGroup.changedInstance(context2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        z = false;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(GoldUnifiedConfirmationDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedConfirmationComposableKt$GoldUnifiedConfirmationComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedConfirmationComposableKt$GoldUnifiedConfirmationComposable$$inlined$duxo$1.1
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
                        goldUnifiedConfirmationDuxo2 = (GoldUnifiedConfirmationDuxo) baseDuxo;
                        i3 &= -113;
                    } else {
                        z = false;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        screen2 = new Screen(Screen.Name.GOLD_UPGRADE_SUCCESS, "GoldUpgradeConfirmationFragment", null, null, 12, null);
                    }
                    if (i6 == 0) {
                        context3 = null;
                        r2 = z;
                    } else {
                        context3 = context;
                        r2 = z;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                    context3 = context2;
                    r2 = 0;
                }
                Screen screen4 = screen2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1842341911, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedConfirmationComposable (GoldUnifiedConfirmationComposable.kt:58)");
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(goldUnifiedConfirmationDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                OverrideSystemBarsStyle.OverrideStatusBarStyle(r2, composerStartRestartGroup, 6);
                goldUnifiedConfirmationViewStateGoldUnifiedConfirmationComposable$lambda$0 = GoldUnifiedConfirmationComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (!(goldUnifiedConfirmationViewStateGoldUnifiedConfirmationComposable$lambda$0 instanceof GoldUnifiedConfirmationViewState.Error)) {
                    composerStartRestartGroup.startReplaceGroup(964067323);
                    GoldUnifiedErrorComposable.GoldUnifiedErrorComposable(context3, screen4, modifier3, null, composerStartRestartGroup, ((i3 >> 9) & 14) | ((i3 >> 3) & 112) | ((i3 << 6) & 896), 8);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (Intrinsics.areEqual(goldUnifiedConfirmationViewStateGoldUnifiedConfirmationComposable$lambda$0, GoldUnifiedConfirmationViewState.Loading.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(964074163);
                    Loading(modifier3, composerStartRestartGroup, i3 & 14, r2);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(goldUnifiedConfirmationViewStateGoldUnifiedConfirmationComposable$lambda$0 instanceof GoldUnifiedConfirmationViewState.Loaded)) {
                        composerStartRestartGroup.startReplaceGroup(964065191);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(964077120);
                    GoldUnifiedConfirmationViewState.Loaded loaded = (GoldUnifiedConfirmationViewState.Loaded) goldUnifiedConfirmationViewStateGoldUnifiedConfirmationComposable$lambda$0;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(goldUnifiedConfirmationDuxo2);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new GoldUnifiedConfirmationComposable4(goldUnifiedConfirmationDuxo2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer2 = composerStartRestartGroup;
                    Loaded(loaded, (Function1) objRememberedValue2, ModifiersKt.logScreenTransitions(modifier3, new UserInteractionEventDescriptor(null, screen4, null, context3, null, null, 53, null)), composer2, 0, 0);
                    composerStartRestartGroup = composer2;
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                goldUnifiedConfirmationDuxo3 = goldUnifiedConfirmationDuxo2;
                screen3 = screen4;
                context4 = context3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                goldUnifiedConfirmationDuxo3 = goldUnifiedConfirmationDuxo2;
                context4 = context2;
                screen3 = screen2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedConfirmationComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldUnifiedConfirmationComposable3.GoldUnifiedConfirmationComposable$lambda$2(modifier3, goldUnifiedConfirmationDuxo3, screen3, context4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        context2 = context;
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 2) == 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i6 == 0) {
                }
                Screen screen42 = screen2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(goldUnifiedConfirmationDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                OverrideSystemBarsStyle.OverrideStatusBarStyle(r2, composerStartRestartGroup, 6);
                goldUnifiedConfirmationViewStateGoldUnifiedConfirmationComposable$lambda$0 = GoldUnifiedConfirmationComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                if (!(goldUnifiedConfirmationViewStateGoldUnifiedConfirmationComposable$lambda$0 instanceof GoldUnifiedConfirmationViewState.Error)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                goldUnifiedConfirmationDuxo3 = goldUnifiedConfirmationDuxo2;
                screen3 = screen42;
                context4 = context3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final GoldUnifiedConfirmationViewState GoldUnifiedConfirmationComposable$lambda$0(SnapshotState4<? extends GoldUnifiedConfirmationViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: GoldUnifiedConfirmationComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedConfirmationComposableKt$Loaded$1 */
    static final class C182101 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<Action, Unit> $onAction;
        final /* synthetic */ GoldUnifiedConfirmationViewState.Loaded $state;

        /* JADX WARN: Multi-variable type inference failed */
        C182101(GoldUnifiedConfirmationViewState.Loaded loaded, Function1<? super Action, Unit> function1, Modifier modifier) {
            this.$state = loaded;
            this.$onAction = function1;
            this.$modifier = modifier;
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
                ComposerKt.traceEventStart(-1361695022, i, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous> (GoldUnifiedConfirmationComposable.kt:92)");
            }
            final StreamConfirmationContentResponse content = this.$state.getContent();
            final Function1<Action, Unit> function1 = this.$onAction;
            final Modifier modifier = this.$modifier;
            final GoldConfirmationAlert alert = content.getAlert();
            composer.startReplaceGroup(1376111081);
            if (alert != null) {
                String description = alert.getDescription();
                String title = alert.getTitle();
                Cta cta = alert.getCta();
                String text = cta != null ? cta.getText() : null;
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function1) | composer.changedInstance(alert);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedConfirmationComposableKt$Loaded$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GoldUnifiedConfirmationComposable3.C182101.invoke$lambda$3$lambda$2$lambda$1$lambda$0(function1, alert);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                LegacyGoldUpgradeWelcomeAlertMessageComposable.GoldUpgradeWelcomeAlertMessageComposable(description, title, text, (Function0) objRememberedValue, composer, 0, 0);
            }
            composer.endReplaceGroup();
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(42702120, true, new GoldUnifiedConfirmationComposable5(content, function1), composer, 54), ComposableLambda3.rememberComposableLambda(-1882007403, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedConfirmationComposableKt$Loaded$1$1$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i2) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i2 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1882007403, i2, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous>.<anonymous> (GoldUnifiedConfirmationComposable.kt:115)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Background3.m4872backgroundbw27NRU$default(modifier, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null);
                    Alignment topCenter = Alignment.INSTANCE.getTopCenter();
                    final StreamConfirmationContentResponse streamConfirmationContentResponse = content;
                    BoxWithConstraints.BoxWithConstraints(modifierFillMaxSize$default, topCenter, false, ComposableLambda3.rememberComposableLambda(-484683265, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedConfirmationComposableKt$Loaded$1$1$3.1
                        public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer3, int i3) {
                            int i4;
                            float f;
                            float f2;
                            int i5;
                            Composer composer4;
                            StreamConfirmationContentResponse streamConfirmationContentResponse2;
                            BentoTheme bentoTheme;
                            Composer composer5;
                            int i6;
                            int i7;
                            Modifier.Companion companion;
                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i3 & 6) == 0) {
                                i4 = i3 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                            } else {
                                i4 = i3;
                            }
                            if ((i4 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-484683265, i4, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldUnifiedConfirmationComposable.kt:121)");
                            }
                            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(BoxWithConstraints.mo5103getMaxWidthD9Ej5fM() * 1.2933334f);
                            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(200);
                            String asset_path = streamConfirmationContentResponse.getAsset_path();
                            composer3.startReplaceGroup(-1924141393);
                            if (asset_path == null) {
                                f2 = fM7995constructorimpl;
                                composer4 = composer3;
                                f = 0.0f;
                                i5 = 0;
                            } else {
                                f = 0.0f;
                                f2 = fM7995constructorimpl;
                                i5 = 0;
                                ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(asset_path, null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((android.content.Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composer3, 0, 62), (String) null, TestTag3.testTag(AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.77319586f, false, 2, null), "confirmationImage"), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer3, 25008, 104);
                                composer4 = composer3;
                                Unit unit = Unit.INSTANCE;
                            }
                            composer4.endReplaceGroup();
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Modifier.Companion companion3 = companion2;
                            Modifier modifierThen = companion3.then(C2002Dp.m7994compareTo0680j_4(C2002Dp.m7995constructorimpl(f2 + fM7995constructorimpl2), BoxWithConstraints.mo5102getMaxHeightD9Ej5fM()) >= 0 ? BoxWithConstraints.align(companion2, Alignment.INSTANCE.getBottomCenter()) : PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, f2, 0.0f, 0.0f, 13, null));
                            Brush.Companion companion4 = Brush.INSTANCE;
                            Tuples2 tuples2M3642to = Tuples4.m3642to(Float.valueOf(f), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU()));
                            Float fValueOf = Float.valueOf(0.3f);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            Tuples2[] tuples2Arr = {tuples2M3642to, Tuples4.m3642to(fValueOf, Color.m6701boximpl(bentoTheme2.getColors(composer4, i8).m21371getBg0d7_KjU()))};
                            int i9 = i8;
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.background$default(modifierThen, Brush.Companion.m6683verticalGradient8A3gB4$default(companion4, tuples2Arr, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), f, composer4, i5, 1);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            StreamConfirmationContentResponse streamConfirmationContentResponse3 = streamConfirmationContentResponse;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer4, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, i5);
                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion5.getConstructor();
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            String title2 = streamConfirmationContentResponse3.getTitle();
                            composer4.startReplaceGroup(-245817936);
                            if (title2 == null) {
                                composer5 = composer4;
                                streamConfirmationContentResponse2 = streamConfirmationContentResponse3;
                                i6 = i5;
                                bentoTheme = bentoTheme2;
                            } else {
                                streamConfirmationContentResponse2 = streamConfirmationContentResponse3;
                                bentoTheme = bentoTheme2;
                                composer5 = composer3;
                                BentoText2.m20747BentoText38GnDrw(title2, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer4, i9).getDisplayCapsuleLarge(), composer5, 0, 0, 8126);
                                i9 = i9;
                                companion3 = companion3;
                                i6 = 0;
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer5, i9).m21590getDefaultD9Ej5fM()), composer5, 0);
                            }
                            composer5.endReplaceGroup();
                            String description2 = streamConfirmationContentResponse2.getDescription();
                            composer5.startReplaceGroup(-245804370);
                            if (description2 == null) {
                                i7 = i9;
                                companion = companion3;
                            } else {
                                i7 = i9;
                                companion = companion3;
                                BentoText2.m20747BentoText38GnDrw(description2, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer5, 0, 0, 16318);
                            }
                            composer5.endReplaceGroup();
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer5, i7).m21592getMediumD9Ej5fM()), composer5, 0);
                            composer5.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer3, Integer num) {
                            invoke(boxWithConstraints4, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, 3120, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 3504, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(Function1 function1, GoldConfirmationAlert goldConfirmationAlert) {
            Cta cta = goldConfirmationAlert.getCta();
            function1.invoke(cta != null ? cta.getAction() : null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Loaded(final GoldUnifiedConfirmationViewState.Loaded state, final Function1<? super Action, Unit> onAction, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-220540134);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAction) ? 32 : 16;
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
                    ComposerKt.traceEventStart(-220540134, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded (GoldUnifiedConfirmationComposable.kt:90)");
                }
                Modifier modifier5 = modifier4;
                BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1361695022, true, new C182101(state, onAction, modifier4), composerStartRestartGroup, 54), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedConfirmationComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldUnifiedConfirmationComposable3.Loaded$lambda$3(state, onAction, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifier52 = modifier4;
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1361695022, true, new C182101(state, onAction, modifier4), composerStartRestartGroup, 54), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void Loading(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-964714395);
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
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-964714395, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loading (GoldUnifiedConfirmationComposable.kt:183)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1487311843, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedConfirmationComposableKt.Loading.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1487311843, i5, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loading.<anonymous> (GoldUnifiedConfirmationComposable.kt:185)");
                    }
                    LocalShowPlaceholder.Loadable(true, Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), null, GoldUnifiedConfirmationComposable.INSTANCE.m15153getLambda$1232440915$feature_gold_upgrade_externalRelease(), composer2, 3078, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedConfirmationComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldUnifiedConfirmationComposable3.Loading$lambda$4(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
