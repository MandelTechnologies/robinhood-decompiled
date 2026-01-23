package com.robinhood.android.gold.upgrade.unified.screen;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
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
import androidx.compose.runtime.internal.ComposableLambda;
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
import androidx.navigation.NavHostController;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBar3;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedAgreementDisplayViewState;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.options.comboorders.detail.TestTags;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.edge2edge.OverrideSystemBarsStyle;
import gold_flow.proto.p466v1.Action;
import gold_flow.proto.p466v1.Cta;
import gold_flow.proto.p466v1.FullAgreement;
import gold_flow.proto.p466v1.StreamAgreementDisplayContentResponse;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import rosetta.identi.agreements.AgreementType;

/* compiled from: GoldUnifiedAgreementDisplayComposable.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a9\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\r\u001a5\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00050\u00122\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0014\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002"}, m3636d2 = {"AgreementDisplayCtaTestTag", "", "getAgreementDisplayCtaTestTag$annotations", "()V", "GoldUnifiedAgreementDisplayComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedAgreementDisplayDuxo;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "themeOverride", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedAgreementDisplayDuxo;Lcom/robinhood/rosetta/eventlogging/Context;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Loaded", TestTags.LOADED, "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedAgreementDisplayViewState$Loaded;", "onAction", "Lkotlin/Function1;", "Lgold_flow/proto/v1/Action;", "(Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedAgreementDisplayViewState$Loaded;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-gold-upgrade_externalRelease", "viewState", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedAgreementDisplayViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedAgreementDisplayComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldUnifiedAgreementDisplayComposable3 {
    public static final String AgreementDisplayCtaTestTag = "agreement_display_cta";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUnifiedAgreementDisplayComposable$lambda$1(Modifier modifier, GoldUnifiedAgreementDisplayDuxo goldUnifiedAgreementDisplayDuxo, Context context, String str, int i, int i2, Composer composer, int i3) {
        GoldUnifiedAgreementDisplayComposable(modifier, goldUnifiedAgreementDisplayDuxo, context, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$3(GoldUnifiedAgreementDisplayViewState.Loaded loaded, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Loaded(loaded, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getAgreementDisplayCtaTestTag$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldUnifiedAgreementDisplayComposable(Modifier modifier, GoldUnifiedAgreementDisplayDuxo goldUnifiedAgreementDisplayDuxo, Context context, String str, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final GoldUnifiedAgreementDisplayDuxo goldUnifiedAgreementDisplayDuxo2;
        final Context context2;
        String str2;
        final Modifier modifier3;
        int i4;
        int i5;
        String str3;
        CreationExtras defaultViewModelCreationExtras;
        boolean isDay;
        final GoldUnifiedAgreementDisplayDuxo goldUnifiedAgreementDisplayDuxo3;
        final String str4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(47425877);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
                goldUnifiedAgreementDisplayDuxo2 = goldUnifiedAgreementDisplayDuxo;
                int i7 = composerStartRestartGroup.changedInstance(goldUnifiedAgreementDisplayDuxo2) ? 32 : 16;
                i3 |= i7;
            } else {
                goldUnifiedAgreementDisplayDuxo2 = goldUnifiedAgreementDisplayDuxo;
            }
            i3 |= i7;
        } else {
            goldUnifiedAgreementDisplayDuxo2 = goldUnifiedAgreementDisplayDuxo;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
            context2 = context;
        } else {
            context2 = context;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(context2) ? 256 : 128;
            }
        }
        int i9 = i2 & 8;
        if (i9 == 0) {
            if ((i & 3072) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) == 0) {
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
                        CreationExtras creationExtras = defaultViewModelCreationExtras;
                        i4 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(GoldUnifiedAgreementDisplayDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedAgreementDisplayComposableKt$GoldUnifiedAgreementDisplayComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedAgreementDisplayComposableKt$GoldUnifiedAgreementDisplayComposable$$inlined$duxo$1.1
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
                        goldUnifiedAgreementDisplayDuxo2 = (GoldUnifiedAgreementDisplayDuxo) baseDuxo;
                        i3 &= -113;
                    } else {
                        i4 = 0;
                    }
                    if (i8 != 0) {
                        context2 = null;
                    }
                    if (i9 == 0) {
                        i5 = i3;
                        str3 = null;
                    } else {
                        i5 = i3;
                        str3 = str;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    String str5 = str2;
                    i5 = i3;
                    str3 = str5;
                    modifier3 = modifier2;
                    i4 = 0;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(47425877, i5, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedAgreementDisplayComposable (GoldUnifiedAgreementDisplayComposable.kt:46)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(goldUnifiedAgreementDisplayDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(-1668362583);
                if (Intrinsics.areEqual(str3, "light")) {
                    isDay = Intrinsics.areEqual(str3, "dark") ? i4 : BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay();
                } else {
                    isDay = 1;
                }
                composerStartRestartGroup.endReplaceGroup();
                OverrideSystemBarsStyle.OverrideStatusBarStyle(isDay, composerStartRestartGroup, i4);
                BentoThemeOverlays.DayNightThemeOverlay(isDay, ComposableLambda3.rememberComposableLambda(-402346972, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedAgreementDisplayComposableKt.GoldUnifiedAgreementDisplayComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i10) {
                        AgreementType agreement_type;
                        String strName;
                        if ((i10 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-402346972, i10, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedAgreementDisplayComposable.<anonymous> (GoldUnifiedAgreementDisplayComposable.kt:55)");
                        }
                        GoldUnifiedAgreementDisplayViewState goldUnifiedAgreementDisplayViewStateGoldUnifiedAgreementDisplayComposable$lambda$0 = GoldUnifiedAgreementDisplayComposable3.GoldUnifiedAgreementDisplayComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        if (goldUnifiedAgreementDisplayViewStateGoldUnifiedAgreementDisplayComposable$lambda$0 instanceof GoldUnifiedAgreementDisplayViewState.Error) {
                            composer2.startReplaceGroup(-108380017);
                            GoldUnifiedErrorComposable.GoldUnifiedErrorComposable(context2, null, modifier3, null, composer2, 48, 8);
                            composer2.endReplaceGroup();
                        } else if (Intrinsics.areEqual(goldUnifiedAgreementDisplayViewStateGoldUnifiedAgreementDisplayComposable$lambda$0, GoldUnifiedAgreementDisplayViewState.Loading.INSTANCE)) {
                            composer2.startReplaceGroup(-108372602);
                            LoadingScreenComposablesKt.GenericTextLoadingScreenComposable(modifier3, false, true, composer2, 384, 2);
                            composer2.endReplaceGroup();
                        } else {
                            if (!(goldUnifiedAgreementDisplayViewStateGoldUnifiedAgreementDisplayComposable$lambda$0 instanceof GoldUnifiedAgreementDisplayViewState.Loaded)) {
                                composer2.startReplaceGroup(-108382030);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(-108365951);
                            GoldUnifiedAgreementDisplayViewState.Loaded loaded = (GoldUnifiedAgreementDisplayViewState.Loaded) goldUnifiedAgreementDisplayViewStateGoldUnifiedAgreementDisplayComposable$lambda$0;
                            GoldUnifiedAgreementDisplayDuxo goldUnifiedAgreementDisplayDuxo4 = goldUnifiedAgreementDisplayDuxo2;
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer2.changedInstance(goldUnifiedAgreementDisplayDuxo4);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new GoldUnifiedAgreementDisplayComposable4(goldUnifiedAgreementDisplayDuxo4);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            Function1 function1 = (Function1) objRememberedValue2;
                            composer2.endReplaceGroup();
                            Modifier modifier4 = modifier3;
                            FullAgreement agreement = loaded.getContent().getAgreement();
                            GoldUnifiedAgreementDisplayComposable3.Loaded(loaded, function1, ModifiersKt.logScreenTransitions(modifier4, new UserInteractionEventDescriptor(null, (agreement == null || (agreement_type = agreement.getAgreement_type()) == null || (strName = agreement_type.name()) == null) ? null : new Screen(null, null, strName, null, 11, null), null, context2, null, null, 53, null)), composer2, 0, 0);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                goldUnifiedAgreementDisplayDuxo3 = goldUnifiedAgreementDisplayDuxo2;
                str4 = str3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                goldUnifiedAgreementDisplayDuxo3 = goldUnifiedAgreementDisplayDuxo2;
                str4 = str2;
            }
            final Context context3 = context2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedAgreementDisplayComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldUnifiedAgreementDisplayComposable3.GoldUnifiedAgreementDisplayComposable$lambda$1(modifier3, goldUnifiedAgreementDisplayDuxo3, context3, str4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        str2 = str;
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 2) == 0) {
                }
                if (i8 != 0) {
                }
                if (i9 == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<? extends GoldUnifiedAgreementDisplayViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(goldUnifiedAgreementDisplayDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(-1668362583);
                if (Intrinsics.areEqual(str3, "light")) {
                }
                composerStartRestartGroup.endReplaceGroup();
                OverrideSystemBarsStyle.OverrideStatusBarStyle(isDay, composerStartRestartGroup, i4);
                BentoThemeOverlays.DayNightThemeOverlay(isDay, ComposableLambda3.rememberComposableLambda(-402346972, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedAgreementDisplayComposableKt.GoldUnifiedAgreementDisplayComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i10) {
                        AgreementType agreement_type;
                        String strName;
                        if ((i10 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-402346972, i10, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedAgreementDisplayComposable.<anonymous> (GoldUnifiedAgreementDisplayComposable.kt:55)");
                        }
                        GoldUnifiedAgreementDisplayViewState goldUnifiedAgreementDisplayViewStateGoldUnifiedAgreementDisplayComposable$lambda$0 = GoldUnifiedAgreementDisplayComposable3.GoldUnifiedAgreementDisplayComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                        if (goldUnifiedAgreementDisplayViewStateGoldUnifiedAgreementDisplayComposable$lambda$0 instanceof GoldUnifiedAgreementDisplayViewState.Error) {
                            composer2.startReplaceGroup(-108380017);
                            GoldUnifiedErrorComposable.GoldUnifiedErrorComposable(context2, null, modifier3, null, composer2, 48, 8);
                            composer2.endReplaceGroup();
                        } else if (Intrinsics.areEqual(goldUnifiedAgreementDisplayViewStateGoldUnifiedAgreementDisplayComposable$lambda$0, GoldUnifiedAgreementDisplayViewState.Loading.INSTANCE)) {
                            composer2.startReplaceGroup(-108372602);
                            LoadingScreenComposablesKt.GenericTextLoadingScreenComposable(modifier3, false, true, composer2, 384, 2);
                            composer2.endReplaceGroup();
                        } else {
                            if (!(goldUnifiedAgreementDisplayViewStateGoldUnifiedAgreementDisplayComposable$lambda$0 instanceof GoldUnifiedAgreementDisplayViewState.Loaded)) {
                                composer2.startReplaceGroup(-108382030);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(-108365951);
                            GoldUnifiedAgreementDisplayViewState.Loaded loaded = (GoldUnifiedAgreementDisplayViewState.Loaded) goldUnifiedAgreementDisplayViewStateGoldUnifiedAgreementDisplayComposable$lambda$0;
                            GoldUnifiedAgreementDisplayDuxo goldUnifiedAgreementDisplayDuxo4 = goldUnifiedAgreementDisplayDuxo2;
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer2.changedInstance(goldUnifiedAgreementDisplayDuxo4);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new GoldUnifiedAgreementDisplayComposable4(goldUnifiedAgreementDisplayDuxo4);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            Function1 function1 = (Function1) objRememberedValue2;
                            composer2.endReplaceGroup();
                            Modifier modifier4 = modifier3;
                            FullAgreement agreement = loaded.getContent().getAgreement();
                            GoldUnifiedAgreementDisplayComposable3.Loaded(loaded, function1, ModifiersKt.logScreenTransitions(modifier4, new UserInteractionEventDescriptor(null, (agreement == null || (agreement_type = agreement.getAgreement_type()) == null || (strName = agreement_type.name()) == null) ? null : new Screen(null, null, strName, null, 11, null), null, context2, null, null, 53, null)), composer2, 0, 0);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                goldUnifiedAgreementDisplayDuxo3 = goldUnifiedAgreementDisplayDuxo2;
                str4 = str3;
            }
        }
        final Context context32 = context2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoldUnifiedAgreementDisplayViewState GoldUnifiedAgreementDisplayComposable$lambda$0(SnapshotState4<? extends GoldUnifiedAgreementDisplayViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Loaded(final GoldUnifiedAgreementDisplayViewState.Loaded loaded, final Function1<? super Action, Unit> function1, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(307148375);
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
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(307148375, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded (GoldUnifiedAgreementDisplayComposable.kt:90)");
            }
            final NavHostController navController = ((LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator())).getNavController();
            final StreamAgreementDisplayContentResponse content = loaded.getContent();
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1382176842, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedAgreementDisplayComposableKt$Loaded$1$1
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
                        ComposerKt.traceEventStart(1382176842, i5, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous> (GoldUnifiedAgreementDisplayComposable.kt:95)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU();
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU();
                    Modifier modifier2 = modifier;
                    final NavHostController navHostController = navController;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1239573774, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedAgreementDisplayComposableKt$Loaded$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1239573774, i7, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous>.<anonymous> (GoldUnifiedAgreementDisplayComposable.kt:100)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Function2<Composer, Integer, Unit> function2M15152getLambda$1893292933$feature_gold_upgrade_externalRelease = GoldUnifiedAgreementDisplayComposable.INSTANCE.m15152getLambda$1893292933$feature_gold_upgrade_externalRelease();
                            final NavHostController navHostController2 = navHostController;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M15152getLambda$1893292933$feature_gold_upgrade_externalRelease, modifierFillMaxWidth$default, ComposableLambda3.rememberComposableLambda(489157071, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedAgreementDisplayComposableKt.Loaded.1.1.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                    invoke(bentoAppBarScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i8 & 6) == 0) {
                                        i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(489157071, i8, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldUnifiedAgreementDisplayComposable.kt:102)");
                                    }
                                    NavHostController navHostController3 = navHostController2;
                                    composer4.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer4.changedInstance(navHostController3);
                                    Object objRememberedValue = composer4.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new GoldUnifiedAgreementDisplayComposable6(navHostController3);
                                        composer4.updateRememberedValue(objRememberedValue);
                                    }
                                    composer4.endReplaceGroup();
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 438, 0, 2040);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1085800719, true, new C182002(content, function1), composer2, 54);
                    final StreamAgreementDisplayContentResponse streamAgreementDisplayContentResponse = content;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-779313703, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedAgreementDisplayComposableKt$Loaded$1$1.3
                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                            int i8;
                            StreamAgreementDisplayContentResponse streamAgreementDisplayContentResponse2;
                            String content2;
                            BentoTheme bentoTheme2;
                            int i9;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i7 & 6) == 0) {
                                i8 = i7 | (composer3.changed(paddingValues) ? 4 : 2);
                            } else {
                                i8 = i7;
                            }
                            if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-779313703, i8, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous>.<anonymous> (GoldUnifiedAgreementDisplayComposable.kt:122)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(companion, paddingValues), 0.0f, 1, null);
                            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                            int i10 = BentoTheme.$stable;
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxSize$default, bentoTheme3.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                            StreamAgreementDisplayContentResponse streamAgreementDisplayContentResponse3 = streamAgreementDisplayContentResponse;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme3.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM()), composer3, 0);
                            FullAgreement agreement = streamAgreementDisplayContentResponse3.getAgreement();
                            String title = agreement != null ? agreement.getTitle() : null;
                            composer3.startReplaceGroup(-975514189);
                            if (title == null) {
                                content2 = null;
                                bentoTheme2 = bentoTheme3;
                                i9 = i10;
                                streamAgreementDisplayContentResponse2 = streamAgreementDisplayContentResponse3;
                            } else {
                                streamAgreementDisplayContentResponse2 = streamAgreementDisplayContentResponse3;
                                content2 = null;
                                BentoText2.m20747BentoText38GnDrw(title, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer3, i10).getDisplayCapsuleMedium(), composer3, 48, 0, 8188);
                                bentoTheme2 = bentoTheme3;
                                i9 = i10;
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composer3, i9).m21591getLargeD9Ej5fM()), composer3, 0);
                            }
                            composer3.endReplaceGroup();
                            FullAgreement agreement2 = streamAgreementDisplayContentResponse2.getAgreement();
                            if (agreement2 != null) {
                                content2 = agreement2.getContent();
                            }
                            composer3.startReplaceGroup(-975501201);
                            if (content2 != null) {
                                BentoMarkdownText2.BentoMarkdownText(content2, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composer3, i9).getTextS(), 0, 0L, 0L, false, composer3, BentoMarkdownText.$stable << 15, 30), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                            }
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, 805306800, EnumC7081g.f2774x74902ae0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: GoldUnifiedAgreementDisplayComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedAgreementDisplayComposableKt$Loaded$1$1$2 */
                static final class C182002 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ Function1<Action, Unit> $onAction;
                    final /* synthetic */ StreamAgreementDisplayContentResponse $this_with;

                    /* JADX WARN: Multi-variable type inference failed */
                    C182002(StreamAgreementDisplayContentResponse streamAgreementDisplayContentResponse, Function1<? super Action, Unit> function1) {
                        this.$this_with = streamAgreementDisplayContentResponse;
                        this.$onAction = function1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        GoldUnifiedBottomBar3 goldUnifiedBottomBar3;
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1085800719, i, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous>.<anonymous> (GoldUnifiedAgreementDisplayComposable.kt:107)");
                        }
                        Boolean disable_sparkle_button_styling = this.$this_with.getDisable_sparkle_button_styling();
                        if (disable_sparkle_button_styling == null) {
                            goldUnifiedBottomBar3 = GoldUnifiedBottomBar3.GOLD_STATIC;
                        } else if (Intrinsics.areEqual(disable_sparkle_button_styling, Boolean.TRUE)) {
                            goldUnifiedBottomBar3 = GoldUnifiedBottomBar3.ACHROMATIC;
                        } else {
                            if (!Intrinsics.areEqual(disable_sparkle_button_styling, Boolean.FALSE)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            goldUnifiedBottomBar3 = GoldUnifiedBottomBar3.GOLD_SPARKLE;
                        }
                        GoldUnifiedBottomBar3 goldUnifiedBottomBar32 = goldUnifiedBottomBar3;
                        Cta cta = this.$this_with.getCta();
                        String text = cta != null ? cta.getText() : null;
                        composer.startReplaceGroup(-222549678);
                        if (text == null) {
                            text = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0);
                        }
                        composer.endReplaceGroup();
                        Cta cta2 = this.$this_with.getCta();
                        boolean zAreEqual = cta2 != null ? Intrinsics.areEqual(cta2.getLoading(), Boolean.TRUE) : false;
                        Cta cta3 = this.$this_with.getCta();
                        boolean z = !(cta3 != null ? Intrinsics.areEqual(cta3.getEnabled(), Boolean.FALSE) : false);
                        composer.startReplaceGroup(-1633490746);
                        boolean zChanged = composer.changed(this.$onAction) | composer.changedInstance(this.$this_with);
                        final Function1<Action, Unit> function1 = this.$onAction;
                        final StreamAgreementDisplayContentResponse streamAgreementDisplayContentResponse = this.$this_with;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00b1: CONSTRUCTOR (r3v1 'objRememberedValue' java.lang.Object) = 
                                  (r1v7 'function1' kotlin.jvm.functions.Function1<gold_flow.proto.v1.Action, kotlin.Unit> A[DONT_INLINE])
                                  (r2v0 'streamAgreementDisplayContentResponse' gold_flow.proto.v1.StreamAgreementDisplayContentResponse A[DONT_INLINE])
                                 A[MD:(kotlin.jvm.functions.Function1, gold_flow.proto.v1.StreamAgreementDisplayContentResponse):void (m)] (LINE:115) call: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedAgreementDisplayComposableKt$Loaded$1$1$2$$ExternalSyntheticLambda0.<init>(kotlin.jvm.functions.Function1, gold_flow.proto.v1.StreamAgreementDisplayContentResponse):void type: CONSTRUCTOR in method: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedAgreementDisplayComposableKt$Loaded$1$1.2.invoke(androidx.compose.runtime.Composer, int):void, file: classes10.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedAgreementDisplayComposableKt$Loaded$1$1$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 25 more
                                */
                            /*
                                this = this;
                                r0 = r15 & 3
                                r1 = 2
                                if (r0 != r1) goto L10
                                boolean r0 = r14.getSkipping()
                                if (r0 != 0) goto Lc
                                goto L10
                            Lc:
                                r14.skipToGroupEnd()
                                return
                            L10:
                                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r0 == 0) goto L1f
                                r0 = -1
                                java.lang.String r1 = "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous>.<anonymous> (GoldUnifiedAgreementDisplayComposable.kt:107)"
                                r2 = 1085800719(0x40b8010f, float:5.750129)
                                androidx.compose.runtime.ComposerKt.traceEventStart(r2, r15, r0, r1)
                            L1f:
                                gold_flow.proto.v1.StreamAgreementDisplayContentResponse r15 = r13.$this_with
                                java.lang.Boolean r15 = r15.getDisable_sparkle_button_styling()
                                if (r15 != 0) goto L2b
                                com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedCtaStyle r15 = com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBar3.GOLD_STATIC
                            L29:
                                r7 = r15
                                goto L41
                            L2b:
                                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r0)
                                if (r0 == 0) goto L36
                                com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedCtaStyle r15 = com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBar3.ACHROMATIC
                                goto L29
                            L36:
                                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                                boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r0)
                                if (r15 == 0) goto Ld6
                                com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedCtaStyle r15 = com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBar3.GOLD_SPARKLE
                                goto L29
                            L41:
                                gold_flow.proto.v1.StreamAgreementDisplayContentResponse r15 = r13.$this_with
                                gold_flow.proto.v1.Cta r15 = r15.getCta()
                                if (r15 == 0) goto L4e
                                java.lang.String r15 = r15.getText()
                                goto L4f
                            L4e:
                                r15 = 0
                            L4f:
                                r0 = -222549678(0xfffffffff2bc2952, float:-7.453841E30)
                                r14.startReplaceGroup(r0)
                                r0 = 0
                                if (r15 != 0) goto L5e
                                int r15 = com.robinhood.android.common.C11048R.string.general_label_done
                                java.lang.String r15 = androidx.compose.p011ui.res.StringResources_androidKt.stringResource(r15, r14, r0)
                            L5e:
                                r14.endReplaceGroup()
                                gold_flow.proto.v1.StreamAgreementDisplayContentResponse r1 = r13.$this_with
                                gold_flow.proto.v1.Cta r1 = r1.getCta()
                                if (r1 == 0) goto L75
                                java.lang.Boolean r1 = r1.getLoading()
                                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                                r6 = r1
                                goto L76
                            L75:
                                r6 = r0
                            L76:
                                gold_flow.proto.v1.StreamAgreementDisplayContentResponse r1 = r13.$this_with
                                gold_flow.proto.v1.Cta r1 = r1.getCta()
                                if (r1 == 0) goto L88
                                java.lang.Boolean r0 = r1.getEnabled()
                                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                            L88:
                                r5 = r0 ^ 1
                                r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
                                r14.startReplaceGroup(r0)
                                kotlin.jvm.functions.Function1<gold_flow.proto.v1.Action, kotlin.Unit> r0 = r13.$onAction
                                boolean r0 = r14.changed(r0)
                                gold_flow.proto.v1.StreamAgreementDisplayContentResponse r1 = r13.$this_with
                                boolean r1 = r14.changedInstance(r1)
                                r0 = r0 | r1
                                kotlin.jvm.functions.Function1<gold_flow.proto.v1.Action, kotlin.Unit> r1 = r13.$onAction
                                gold_flow.proto.v1.StreamAgreementDisplayContentResponse r2 = r13.$this_with
                                java.lang.Object r3 = r14.rememberedValue()
                                if (r0 != 0) goto Laf
                                androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.INSTANCE
                                java.lang.Object r0 = r0.getEmpty()
                                if (r3 != r0) goto Lb7
                            Laf:
                                com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedAgreementDisplayComposableKt$Loaded$1$1$2$$ExternalSyntheticLambda0 r3 = new com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedAgreementDisplayComposableKt$Loaded$1$1$2$$ExternalSyntheticLambda0
                                r3.<init>(r1, r2)
                                r14.updateRememberedValue(r3)
                            Lb7:
                                r1 = r3
                                kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
                                r14.endReplaceGroup()
                                r11 = 384(0x180, float:5.38E-43)
                                r12 = 792(0x318, float:1.11E-42)
                                java.lang.String r2 = "agreement_display_cta"
                                r3 = 0
                                r4 = 0
                                r8 = 0
                                r9 = 0
                                r10 = r14
                                r0 = r15
                                com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBar.GoldUnifiedBottomBar(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                                boolean r14 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r14 == 0) goto Ld5
                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                            Ld5:
                                return
                            Ld6:
                                kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
                                r14.<init>()
                                throw r14
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedAgreementDisplayComposable5.C182002.invoke(androidx.compose.runtime.Composer, int):void");
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, StreamAgreementDisplayContentResponse streamAgreementDisplayContentResponse) {
                            Cta cta = streamAgreementDisplayContentResponse.getCta();
                            function1.invoke(cta != null ? cta.getAction() : null);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            final Modifier modifier2 = modifier;
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedAgreementDisplayComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldUnifiedAgreementDisplayComposable3.Loaded$lambda$3(loaded, function1, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
    }
