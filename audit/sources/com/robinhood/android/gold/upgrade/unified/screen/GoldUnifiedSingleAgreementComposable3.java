package com.robinhood.android.gold.upgrade.unified.screen;

import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
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
import androidx.compose.runtime.SnapshotStateKt;
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
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.gold.upgrade.C18003R;
import com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBar;
import com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedBottomBar3;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposable3;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementViewState;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.mediaservice.ImageDensityUrl;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
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
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.p409ui.edge2edge.OverrideSystemBarsStyle;
import com.robinhood.utils.resource.StringResource;
import gold_flow.proto.p466v1.FullAgreement;
import gold_flow.proto.p466v1.FullAgreementCard;
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
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import rosetta.identi.agreements.AgreementType;

/* compiled from: GoldUnifiedSingleAgreementComposable.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001aI\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u0012\u001a;\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0019\u001a\u0015\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0003¢\u0006\u0002\u0010\u001d\"\u0016\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002²\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002"}, m3636d2 = {"CardAssetTestTag", "", "getCardAssetTestTag$annotations", "()V", "GoldSingleAgreementCtaTestTag", "getGoldSingleAgreementCtaTestTag$annotations", "GoldUnifiedSingleAgreementComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementDuxo;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "themeOverride", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementDuxo;Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Loaded", "state", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementViewState$Loaded;", "onReview", "Lkotlin/Function0;", "onAccept", "(Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementViewState$Loaded;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AgreementCard", "card", "Lgold_flow/proto/v1/FullAgreementCard;", "(Lgold_flow/proto/v1/FullAgreementCard;Landroidx/compose/runtime/Composer;I)V", "feature-gold-upgrade_externalRelease", "viewState", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementViewState;", "isScrolledToEnd", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldUnifiedSingleAgreementComposable3 {
    public static final String CardAssetTestTag = "cardAsset";
    public static final String GoldSingleAgreementCtaTestTag = "gold_single_agreement_cta";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgreementCard$lambda$13(FullAgreementCard fullAgreementCard, int i, Composer composer, int i2) {
        AgreementCard(fullAgreementCard, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUnifiedSingleAgreementComposable$lambda$1(Modifier modifier, GoldUnifiedSingleAgreementDuxo goldUnifiedSingleAgreementDuxo, Context context, Screen screen, String str, int i, int i2, Composer composer, int i3) {
        GoldUnifiedSingleAgreementComposable(modifier, goldUnifiedSingleAgreementDuxo, context, screen, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$7(GoldUnifiedSingleAgreementViewState.Loaded loaded, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Loaded(loaded, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getCardAssetTestTag$annotations() {
    }

    public static /* synthetic */ void getGoldSingleAgreementCtaTestTag$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldUnifiedSingleAgreementComposable(Modifier modifier, GoldUnifiedSingleAgreementDuxo goldUnifiedSingleAgreementDuxo, Context context, Screen screen, String str, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        GoldUnifiedSingleAgreementDuxo goldUnifiedSingleAgreementDuxo2;
        Context context2;
        Screen screen2;
        String str2;
        final Modifier modifier3;
        int i4;
        Composer composer2;
        Screen screen3;
        int i5;
        String str3;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer3;
        boolean isDay;
        final String str4;
        final GoldUnifiedSingleAgreementDuxo goldUnifiedSingleAgreementDuxo3;
        final Screen screen4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(148462559);
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
                goldUnifiedSingleAgreementDuxo2 = goldUnifiedSingleAgreementDuxo;
                int i7 = composerStartRestartGroup.changedInstance(goldUnifiedSingleAgreementDuxo2) ? 32 : 16;
                i3 |= i7;
            } else {
                goldUnifiedSingleAgreementDuxo2 = goldUnifiedSingleAgreementDuxo;
            }
            i3 |= i7;
        } else {
            goldUnifiedSingleAgreementDuxo2 = goldUnifiedSingleAgreementDuxo;
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
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                screen2 = screen;
                int i9 = composerStartRestartGroup.changedInstance(screen2) ? 2048 : 1024;
                i3 |= i9;
            } else {
                screen2 = screen;
            }
            i3 |= i9;
        } else {
            screen2 = screen;
        }
        int i10 = i2 & 16;
        if (i10 == 0) {
            if ((i & 24576) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
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
                        composer2 = composerStartRestartGroup;
                        i4 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(GoldUnifiedSingleAgreementDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt$GoldUnifiedSingleAgreementComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt$GoldUnifiedSingleAgreementComposable$$inlined$duxo$1.1
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
                        goldUnifiedSingleAgreementDuxo2 = (GoldUnifiedSingleAgreementDuxo) baseDuxo;
                        i3 &= -113;
                    } else {
                        i4 = 0;
                        composer2 = composerStartRestartGroup;
                    }
                    if (i8 != 0) {
                        context2 = null;
                    }
                    if ((i2 & 8) == 0) {
                        screen3 = new Screen(Screen.Name.MARGIN_UPGRADE_GOLD_AGREEMENT, null, null, null, 14, null);
                        i3 &= -7169;
                    } else {
                        screen3 = screen;
                    }
                    i5 = i3;
                    str3 = i10 == 0 ? null : str;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                    i5 = i3;
                    screen3 = screen2;
                    str3 = str2;
                    i4 = 0;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(148462559, i5, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposable (GoldUnifiedSingleAgreementComposable.kt:69)");
                }
                Composer composer4 = composer2;
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(goldUnifiedSingleAgreementDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                composer3 = composer4;
                composer3.startReplaceGroup(938610931);
                if (Intrinsics.areEqual(str3, "light")) {
                    isDay = Intrinsics.areEqual(str3, "dark") ? i4 : BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).getIsDay();
                } else {
                    isDay = 1;
                }
                composer3.endReplaceGroup();
                OverrideSystemBarsStyle.OverrideStatusBarStyle(isDay, composer3, i4);
                final Modifier modifier4 = modifier3;
                final GoldUnifiedSingleAgreementDuxo goldUnifiedSingleAgreementDuxo4 = goldUnifiedSingleAgreementDuxo2;
                final Context context3 = context2;
                final Screen screen5 = screen3;
                BentoThemeOverlays.DayNightThemeOverlay(isDay, ComposableLambda3.rememberComposableLambda(354311982, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt.GoldUnifiedSingleAgreementComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i11) {
                        AgreementType agreement_type;
                        if ((i11 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(354311982, i11, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposable.<anonymous> (GoldUnifiedSingleAgreementComposable.kt:79)");
                        }
                        GoldUnifiedSingleAgreementViewState goldUnifiedSingleAgreementViewStateGoldUnifiedSingleAgreementComposable$lambda$0 = GoldUnifiedSingleAgreementComposable3.GoldUnifiedSingleAgreementComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        if (goldUnifiedSingleAgreementViewStateGoldUnifiedSingleAgreementComposable$lambda$0 instanceof GoldUnifiedSingleAgreementViewState.Loading) {
                            composer5.startReplaceGroup(1191401745);
                            LoadingScreenComposablesKt.GenericTextLoadingScreenComposable(null, true, true, composer5, 432, 1);
                            composer5.endReplaceGroup();
                        } else if (goldUnifiedSingleAgreementViewStateGoldUnifiedSingleAgreementComposable$lambda$0 instanceof GoldUnifiedSingleAgreementViewState.Loaded) {
                            composer5.startReplaceGroup(-1721046502);
                            GoldUnifiedSingleAgreementViewState.Loaded loaded = (GoldUnifiedSingleAgreementViewState.Loaded) goldUnifiedSingleAgreementViewStateGoldUnifiedSingleAgreementComposable$lambda$0;
                            Modifier modifier5 = modifier4;
                            Screen screen6 = screen5;
                            FullAgreement agreement = loaded.getContent().getAgreement();
                            String strName = (agreement == null || (agreement_type = agreement.getAgreement_type()) == null) ? null : agreement_type.name();
                            if (strName == null) {
                                strName = "";
                            }
                            Modifier modifierLogScreenTransitions = ModifiersKt.logScreenTransitions(modifier5, new UserInteractionEventDescriptor(null, Screen.copy$default(screen6, null, null, strName, null, 11, null), null, context3, null, null, 53, null));
                            GoldUnifiedSingleAgreementDuxo goldUnifiedSingleAgreementDuxo5 = goldUnifiedSingleAgreementDuxo4;
                            composer5.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer5.changedInstance(goldUnifiedSingleAgreementDuxo5);
                            Object objRememberedValue2 = composer5.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new GoldUnifiedSingleAgreementComposable4(goldUnifiedSingleAgreementDuxo5);
                                composer5.updateRememberedValue(objRememberedValue2);
                            }
                            KFunction kFunction = (KFunction) objRememberedValue2;
                            composer5.endReplaceGroup();
                            GoldUnifiedSingleAgreementDuxo goldUnifiedSingleAgreementDuxo6 = goldUnifiedSingleAgreementDuxo4;
                            composer5.startReplaceGroup(5004770);
                            boolean zChangedInstance3 = composer5.changedInstance(goldUnifiedSingleAgreementDuxo6);
                            Object objRememberedValue3 = composer5.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new GoldUnifiedSingleAgreementComposable5(goldUnifiedSingleAgreementDuxo6);
                                composer5.updateRememberedValue(objRememberedValue3);
                            }
                            composer5.endReplaceGroup();
                            GoldUnifiedSingleAgreementComposable3.Loaded(loaded, (Function0) kFunction, (Function0) ((KFunction) objRememberedValue3), modifierLogScreenTransitions, composer5, 0, 0);
                            composer5.endReplaceGroup();
                        } else {
                            if (!(goldUnifiedSingleAgreementViewStateGoldUnifiedSingleAgreementComposable$lambda$0 instanceof GoldUnifiedSingleAgreementViewState.Error)) {
                                composer5.startReplaceGroup(1191399715);
                                composer5.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer5.startReplaceGroup(1191427202);
                            GoldUnifiedErrorComposable.GoldUnifiedErrorComposable(context3, screen5, modifier4, null, composer5, 0, 8);
                            composer5.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str4 = str3;
                goldUnifiedSingleAgreementDuxo3 = goldUnifiedSingleAgreementDuxo2;
                screen4 = screen3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                goldUnifiedSingleAgreementDuxo3 = goldUnifiedSingleAgreementDuxo2;
                screen4 = screen2;
                str4 = str2;
                composer3 = composerStartRestartGroup;
            }
            final Context context4 = context2;
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldUnifiedSingleAgreementComposable3.GoldUnifiedSingleAgreementComposable$lambda$1(modifier3, goldUnifiedSingleAgreementDuxo3, context4, screen4, str4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        str2 = str;
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 2) == 0) {
                }
                if (i8 != 0) {
                }
                if ((i2 & 8) == 0) {
                }
                i5 = i3;
                if (i10 == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                final SnapshotState4<? extends GoldUnifiedSingleAgreementViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(goldUnifiedSingleAgreementDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                composer3 = composer42;
                composer3.startReplaceGroup(938610931);
                if (Intrinsics.areEqual(str3, "light")) {
                }
                composer3.endReplaceGroup();
                OverrideSystemBarsStyle.OverrideStatusBarStyle(isDay, composer3, i4);
                final Modifier modifier42 = modifier3;
                final GoldUnifiedSingleAgreementDuxo goldUnifiedSingleAgreementDuxo42 = goldUnifiedSingleAgreementDuxo2;
                final Context context32 = context2;
                final Screen screen52 = screen3;
                BentoThemeOverlays.DayNightThemeOverlay(isDay, ComposableLambda3.rememberComposableLambda(354311982, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt.GoldUnifiedSingleAgreementComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i11) {
                        AgreementType agreement_type;
                        if ((i11 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(354311982, i11, -1, "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposable.<anonymous> (GoldUnifiedSingleAgreementComposable.kt:79)");
                        }
                        GoldUnifiedSingleAgreementViewState goldUnifiedSingleAgreementViewStateGoldUnifiedSingleAgreementComposable$lambda$0 = GoldUnifiedSingleAgreementComposable3.GoldUnifiedSingleAgreementComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                        if (goldUnifiedSingleAgreementViewStateGoldUnifiedSingleAgreementComposable$lambda$0 instanceof GoldUnifiedSingleAgreementViewState.Loading) {
                            composer5.startReplaceGroup(1191401745);
                            LoadingScreenComposablesKt.GenericTextLoadingScreenComposable(null, true, true, composer5, 432, 1);
                            composer5.endReplaceGroup();
                        } else if (goldUnifiedSingleAgreementViewStateGoldUnifiedSingleAgreementComposable$lambda$0 instanceof GoldUnifiedSingleAgreementViewState.Loaded) {
                            composer5.startReplaceGroup(-1721046502);
                            GoldUnifiedSingleAgreementViewState.Loaded loaded = (GoldUnifiedSingleAgreementViewState.Loaded) goldUnifiedSingleAgreementViewStateGoldUnifiedSingleAgreementComposable$lambda$0;
                            Modifier modifier5 = modifier42;
                            Screen screen6 = screen52;
                            FullAgreement agreement = loaded.getContent().getAgreement();
                            String strName = (agreement == null || (agreement_type = agreement.getAgreement_type()) == null) ? null : agreement_type.name();
                            if (strName == null) {
                                strName = "";
                            }
                            Modifier modifierLogScreenTransitions = ModifiersKt.logScreenTransitions(modifier5, new UserInteractionEventDescriptor(null, Screen.copy$default(screen6, null, null, strName, null, 11, null), null, context32, null, null, 53, null));
                            GoldUnifiedSingleAgreementDuxo goldUnifiedSingleAgreementDuxo5 = goldUnifiedSingleAgreementDuxo42;
                            composer5.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer5.changedInstance(goldUnifiedSingleAgreementDuxo5);
                            Object objRememberedValue2 = composer5.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new GoldUnifiedSingleAgreementComposable4(goldUnifiedSingleAgreementDuxo5);
                                composer5.updateRememberedValue(objRememberedValue2);
                            }
                            KFunction kFunction = (KFunction) objRememberedValue2;
                            composer5.endReplaceGroup();
                            GoldUnifiedSingleAgreementDuxo goldUnifiedSingleAgreementDuxo6 = goldUnifiedSingleAgreementDuxo42;
                            composer5.startReplaceGroup(5004770);
                            boolean zChangedInstance3 = composer5.changedInstance(goldUnifiedSingleAgreementDuxo6);
                            Object objRememberedValue3 = composer5.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new GoldUnifiedSingleAgreementComposable5(goldUnifiedSingleAgreementDuxo6);
                                composer5.updateRememberedValue(objRememberedValue3);
                            }
                            composer5.endReplaceGroup();
                            GoldUnifiedSingleAgreementComposable3.Loaded(loaded, (Function0) kFunction, (Function0) ((KFunction) objRememberedValue3), modifierLogScreenTransitions, composer5, 0, 0);
                            composer5.endReplaceGroup();
                        } else {
                            if (!(goldUnifiedSingleAgreementViewStateGoldUnifiedSingleAgreementComposable$lambda$0 instanceof GoldUnifiedSingleAgreementViewState.Error)) {
                                composer5.startReplaceGroup(1191399715);
                                composer5.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer5.startReplaceGroup(1191427202);
                            GoldUnifiedErrorComposable.GoldUnifiedErrorComposable(context32, screen52, modifier42, null, composer5, 0, 8);
                            composer5.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                str4 = str3;
                goldUnifiedSingleAgreementDuxo3 = goldUnifiedSingleAgreementDuxo2;
                screen4 = screen3;
            }
        }
        final Context context42 = context2;
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoldUnifiedSingleAgreementViewState GoldUnifiedSingleAgreementComposable$lambda$0(SnapshotState4<? extends GoldUnifiedSingleAgreementViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Loaded$lambda$4(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Loaded(final GoldUnifiedSingleAgreementViewState.Loaded loaded, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function03;
        int i4;
        Modifier modifier2;
        final ScrollState scrollStateRememberScrollState;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState4 snapshotState4;
        boolean zChangedInstance;
        Object objRememberedValue2;
        boolean zChangedInstance2;
        Object objRememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1946634440);
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
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                function03 = function02;
                i3 |= composerStartRestartGroup.changedInstance(function03) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1946634440, i3, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded (GoldUnifiedSingleAgreementComposable.kt:114)");
                    }
                    final NavHostController navController = ((LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator())).getNavController();
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(GoldUnifiedSingleAgreementComposable3.Loaded$lambda$3$lambda$2(scrollStateRememberScrollState));
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotState4 = (SnapshotState4) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Boolean boolValueOf = Boolean.valueOf(loaded.isReviewed());
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(loaded) | composerStartRestartGroup.changed(scrollStateRememberScrollState);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new GoldUnifiedSingleAgreementComposable6(loaded, scrollStateRememberScrollState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                    Boolean boolValueOf2 = Boolean.valueOf(Loaded$lambda$4(snapshotState4));
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance2 = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(loaded);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new GoldUnifiedSingleAgreementComposable7(loaded, function0, snapshotState4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                    final Function0<Unit> function04 = function03;
                    final Modifier modifier4 = modifier2;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-491928243, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt.Loaded.3
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
                                ComposerKt.traceEventStart(-491928243, i5, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous> (GoldUnifiedSingleAgreementComposable.kt:132)");
                            }
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU();
                            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU();
                            Modifier modifier5 = modifier4;
                            final NavHostController navHostController = navController;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(999190281, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt.Loaded.3.1
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
                                        ComposerKt.traceEventStart(999190281, i7, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous> (GoldUnifiedSingleAgreementComposable.kt:137)");
                                    }
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Function2<Composer, Integer, Unit> lambda$247875260$feature_gold_upgrade_externalRelease = GoldUnifiedSingleAgreementComposable.INSTANCE.getLambda$247875260$feature_gold_upgrade_externalRelease();
                                    final NavHostController navHostController2 = navHostController;
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$247875260$feature_gold_upgrade_externalRelease, modifierFillMaxWidth$default, ComposableLambda3.rememberComposableLambda(-1110214168, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt.Loaded.3.1.1
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
                                                ComposerKt.traceEventStart(-1110214168, i8, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous>.<anonymous> (GoldUnifiedSingleAgreementComposable.kt:139)");
                                            }
                                            NavHostController navHostController3 = navHostController2;
                                            composer4.startReplaceGroup(5004770);
                                            boolean zChangedInstance3 = composer4.changedInstance(navHostController3);
                                            Object objRememberedValue4 = composer4.rememberedValue();
                                            if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue4 = new GoldUnifiedSingleAgreementComposable8(navHostController3);
                                                composer4.updateRememberedValue(objRememberedValue4);
                                            }
                                            composer4.endReplaceGroup();
                                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue4, composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 7);
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
                            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-2001358168, true, new AnonymousClass2(loaded, function0, function04), composer2, 54);
                            final ScrollState scrollState = scrollStateRememberScrollState;
                            final GoldUnifiedSingleAgreementViewState.Loaded loaded2 = loaded;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-1340601826, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt.Loaded.3.3
                                public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                                    int i8;
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
                                        ComposerKt.traceEventStart(-1340601826, i8, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous> (GoldUnifiedSingleAgreementComposable.kt:166)");
                                    }
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.padding(companion2, paddingValues), scrollState, false, null, false, 14, null);
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i9 = BentoTheme.$stable;
                                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierVerticalScroll$default, bentoTheme2.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), composer3, 0, 0);
                                    GoldUnifiedSingleAgreementViewState.Loaded loaded3 = loaded2;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    FullAgreement agreement = loaded3.getContent().getAgreement();
                                    FullAgreementCard card = agreement != null ? agreement.getCard() : null;
                                    composer3.startReplaceGroup(2014055501);
                                    if (card != null) {
                                        GoldUnifiedSingleAgreementComposable3.AgreementCard(card, composer3, 0);
                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme2.getSpacing(composer3, i9).m21592getMediumD9Ej5fM()), composer3, 0);
                                    }
                                    composer3.endReplaceGroup();
                                    FullAgreement agreement2 = loaded3.getContent().getAgreement();
                                    String content = agreement2 != null ? agreement2.getContent() : null;
                                    composer3.startReplaceGroup(2014062237);
                                    if (content != null) {
                                        BentoMarkdownText2.BentoMarkdownText(content, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composer3, i9).getTextS(), 0, 0L, bentoTheme2.getColors(composer3, i9).m21425getFg0d7_KjU(), false, composer3, BentoMarkdownText.$stable << 15, 22), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
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

                        /* compiled from: GoldUnifiedSingleAgreementComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt$Loaded$3$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ Function0<Unit> $onAccept;
                            final /* synthetic */ Function0<Unit> $onReview;
                            final /* synthetic */ GoldUnifiedSingleAgreementViewState.Loaded $state;

                            /* compiled from: GoldUnifiedSingleAgreementComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt$Loaded$3$2$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[GoldUnifiedSingleAgreementViewState2.values().length];
                                    try {
                                        iArr[GoldUnifiedSingleAgreementViewState2.UNREVIEWED.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[GoldUnifiedSingleAgreementViewState2.ACCEPTED.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[GoldUnifiedSingleAgreementViewState2.REVIEWED.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            AnonymousClass2(GoldUnifiedSingleAgreementViewState.Loaded loaded, Function0<Unit> function0, Function0<Unit> function02) {
                                this.$state = loaded;
                                this.$onReview = function0;
                                this.$onAccept = function02;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
                                CharSequence text;
                                if ((i & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2001358168, i, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous> (GoldUnifiedSingleAgreementComposable.kt:144)");
                                }
                                StringResource ctaText = this.$state.getCtaText();
                                composer.startReplaceGroup(840152143);
                                if (ctaText == null) {
                                    text = null;
                                } else {
                                    Resources resources = ((android.content.Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                                    text = ctaText.getText(resources);
                                }
                                composer.endReplaceGroup();
                                String string2 = text != null ? text.toString() : null;
                                String footer = this.$state.getFooter();
                                boolean zIsCtaEnabled = this.$state.isCtaEnabled();
                                boolean zIsCtaLoading = this.$state.isCtaLoading();
                                GoldUnifiedBottomBar3 goldUnifiedBottomBar3 = this.$state.getShowSparkleButton() ? GoldUnifiedBottomBar3.GOLD_SPARKLE : GoldUnifiedBottomBar3.ACHROMATIC;
                                composer.startReplaceGroup(-1746271574);
                                boolean zChangedInstance = composer.changedInstance(this.$state) | composer.changed(this.$onReview) | composer.changed(this.$onAccept);
                                final GoldUnifiedSingleAgreementViewState.Loaded loaded = this.$state;
                                final Function0<Unit> function0 = this.$onReview;
                                final Function0<Unit> function02 = this.$onAccept;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt$Loaded$3$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return GoldUnifiedSingleAgreementComposable3.C182493.AnonymousClass2.invoke$lambda$1$lambda$0(loaded, function0, function02);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                GoldUnifiedBottomBar.GoldUnifiedBottomBar(string2, (Function0) objRememberedValue, GoldUnifiedSingleAgreementComposable3.GoldSingleAgreementCtaTestTag, null, footer, zIsCtaEnabled, zIsCtaLoading, goldUnifiedBottomBar3, null, null, composer, 384, 776);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(GoldUnifiedSingleAgreementViewState.Loaded loaded, Function0 function0, Function0 function02) {
                                int i = WhenMappings.$EnumSwitchMapping$0[loaded.getReviewStatus().ordinal()];
                                if (i == 1) {
                                    function0.invoke();
                                } else {
                                    if (i != 2 && i != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    function02.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return GoldUnifiedSingleAgreementComposable3.Loaded$lambda$7(loaded, function0, function02, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 1171) != 1170) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final NavHostController navController2 = ((LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator())).getNavController();
                scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotState4 = (SnapshotState4) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf3 = Boolean.valueOf(loaded.isReviewed());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(loaded) | composerStartRestartGroup.changed(scrollStateRememberScrollState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue2 = new GoldUnifiedSingleAgreementComposable6(loaded, scrollStateRememberScrollState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                    Boolean boolValueOf22 = Boolean.valueOf(Loaded$lambda$4(snapshotState4));
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance2 = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(loaded);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue3 = new GoldUnifiedSingleAgreementComposable7(loaded, function0, snapshotState4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(boolValueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                        final Function0<Unit> function042 = function03;
                        final Modifier modifier42 = modifier2;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-491928243, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt.Loaded.3
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
                                    ComposerKt.traceEventStart(-491928243, i5, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous> (GoldUnifiedSingleAgreementComposable.kt:132)");
                                }
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i6 = BentoTheme.$stable;
                                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU();
                                long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU();
                                Modifier modifier5 = modifier42;
                                final NavHostController navHostController = navController2;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(999190281, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt.Loaded.3.1
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
                                            ComposerKt.traceEventStart(999190281, i7, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous> (GoldUnifiedSingleAgreementComposable.kt:137)");
                                        }
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        Function2<Composer, Integer, Unit> lambda$247875260$feature_gold_upgrade_externalRelease = GoldUnifiedSingleAgreementComposable.INSTANCE.getLambda$247875260$feature_gold_upgrade_externalRelease();
                                        final NavHostController navHostController2 = navHostController;
                                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$247875260$feature_gold_upgrade_externalRelease, modifierFillMaxWidth$default, ComposableLambda3.rememberComposableLambda(-1110214168, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt.Loaded.3.1.1
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
                                                    ComposerKt.traceEventStart(-1110214168, i8, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous>.<anonymous> (GoldUnifiedSingleAgreementComposable.kt:139)");
                                                }
                                                NavHostController navHostController3 = navHostController2;
                                                composer4.startReplaceGroup(5004770);
                                                boolean zChangedInstance3 = composer4.changedInstance(navHostController3);
                                                Object objRememberedValue4 = composer4.rememberedValue();
                                                if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue4 = new GoldUnifiedSingleAgreementComposable8(navHostController3);
                                                    composer4.updateRememberedValue(objRememberedValue4);
                                                }
                                                composer4.endReplaceGroup();
                                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue4, composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 7);
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
                                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-2001358168, true, new AnonymousClass2(loaded, function0, function042), composer2, 54);
                                final ScrollState scrollState = scrollStateRememberScrollState;
                                final GoldUnifiedSingleAgreementViewState.Loaded loaded2 = loaded;
                                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-1340601826, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt.Loaded.3.3
                                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                                        int i8;
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
                                            ComposerKt.traceEventStart(-1340601826, i8, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous> (GoldUnifiedSingleAgreementComposable.kt:166)");
                                        }
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.padding(companion2, paddingValues), scrollState, false, null, false, 14, null);
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i9 = BentoTheme.$stable;
                                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierVerticalScroll$default, bentoTheme2.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), composer3, 0, 0);
                                        GoldUnifiedSingleAgreementViewState.Loaded loaded3 = loaded2;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        FullAgreement agreement = loaded3.getContent().getAgreement();
                                        FullAgreementCard card = agreement != null ? agreement.getCard() : null;
                                        composer3.startReplaceGroup(2014055501);
                                        if (card != null) {
                                            GoldUnifiedSingleAgreementComposable3.AgreementCard(card, composer3, 0);
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme2.getSpacing(composer3, i9).m21592getMediumD9Ej5fM()), composer3, 0);
                                        }
                                        composer3.endReplaceGroup();
                                        FullAgreement agreement2 = loaded3.getContent().getAgreement();
                                        String content = agreement2 != null ? agreement2.getContent() : null;
                                        composer3.startReplaceGroup(2014062237);
                                        if (content != null) {
                                            BentoMarkdownText2.BentoMarkdownText(content, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composer3, i9).getTextS(), 0, 0L, bentoTheme2.getColors(composer3, i9).m21425getFg0d7_KjU(), false, composer3, BentoMarkdownText.$stable << 15, 22), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
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

                            /* compiled from: GoldUnifiedSingleAgreementComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt$Loaded$3$2, reason: invalid class name */
                            static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ Function0<Unit> $onAccept;
                                final /* synthetic */ Function0<Unit> $onReview;
                                final /* synthetic */ GoldUnifiedSingleAgreementViewState.Loaded $state;

                                /* compiled from: GoldUnifiedSingleAgreementComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt$Loaded$3$2$WhenMappings */
                                public /* synthetic */ class WhenMappings {
                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                    static {
                                        int[] iArr = new int[GoldUnifiedSingleAgreementViewState2.values().length];
                                        try {
                                            iArr[GoldUnifiedSingleAgreementViewState2.UNREVIEWED.ordinal()] = 1;
                                        } catch (NoSuchFieldError unused) {
                                        }
                                        try {
                                            iArr[GoldUnifiedSingleAgreementViewState2.ACCEPTED.ordinal()] = 2;
                                        } catch (NoSuchFieldError unused2) {
                                        }
                                        try {
                                            iArr[GoldUnifiedSingleAgreementViewState2.REVIEWED.ordinal()] = 3;
                                        } catch (NoSuchFieldError unused3) {
                                        }
                                        $EnumSwitchMapping$0 = iArr;
                                    }
                                }

                                AnonymousClass2(GoldUnifiedSingleAgreementViewState.Loaded loaded, Function0<Unit> function0, Function0<Unit> function02) {
                                    this.$state = loaded;
                                    this.$onReview = function0;
                                    this.$onAccept = function02;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
                                    CharSequence text;
                                    if ((i & 3) == 2 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2001358168, i, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous> (GoldUnifiedSingleAgreementComposable.kt:144)");
                                    }
                                    StringResource ctaText = this.$state.getCtaText();
                                    composer.startReplaceGroup(840152143);
                                    if (ctaText == null) {
                                        text = null;
                                    } else {
                                        Resources resources = ((android.content.Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                                        text = ctaText.getText(resources);
                                    }
                                    composer.endReplaceGroup();
                                    String string2 = text != null ? text.toString() : null;
                                    String footer = this.$state.getFooter();
                                    boolean zIsCtaEnabled = this.$state.isCtaEnabled();
                                    boolean zIsCtaLoading = this.$state.isCtaLoading();
                                    GoldUnifiedBottomBar3 goldUnifiedBottomBar3 = this.$state.getShowSparkleButton() ? GoldUnifiedBottomBar3.GOLD_SPARKLE : GoldUnifiedBottomBar3.ACHROMATIC;
                                    composer.startReplaceGroup(-1746271574);
                                    boolean zChangedInstance = composer.changedInstance(this.$state) | composer.changed(this.$onReview) | composer.changed(this.$onAccept);
                                    final GoldUnifiedSingleAgreementViewState.Loaded loaded = this.$state;
                                    final Function0 function0 = this.$onReview;
                                    final Function0 function02 = this.$onAccept;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt$Loaded$3$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return GoldUnifiedSingleAgreementComposable3.C182493.AnonymousClass2.invoke$lambda$1$lambda$0(loaded, function0, function02);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    GoldUnifiedBottomBar.GoldUnifiedBottomBar(string2, (Function0) objRememberedValue, GoldUnifiedSingleAgreementComposable3.GoldSingleAgreementCtaTestTag, null, footer, zIsCtaEnabled, zIsCtaLoading, goldUnifiedBottomBar3, null, null, composer, 384, 776);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(GoldUnifiedSingleAgreementViewState.Loaded loaded, Function0 function0, Function0 function02) {
                                    int i = WhenMappings.$EnumSwitchMapping$0[loaded.getReviewStatus().ordinal()];
                                    if (i == 1) {
                                        function0.invoke();
                                    } else {
                                        if (i != 2 && i != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        function02.invoke();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function03 = function02;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Loaded$lambda$3$lambda$2(ScrollState scrollState) {
        return scrollState.getValue() == scrollState.getMaxValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AgreementCard(final FullAgreementCard fullAgreementCard, Composer composer, final int i) {
        int i2;
        long jM21372getBg20d7_KjU;
        int i3;
        BentoTheme bentoTheme;
        Modifier.Companion companion;
        BentoTheme bentoTheme2;
        int i4;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1288466838);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(fullAgreementCard) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1288466838, i2, -1, "com.robinhood.android.gold.upgrade.unified.screen.AgreementCard (GoldUnifiedSingleAgreementComposable.kt:191)");
            }
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            if (bentoTheme3.getColors(composerStartRestartGroup, i5).getIsDay()) {
                composerStartRestartGroup.startReplaceGroup(593110411);
                jM21372getBg20d7_KjU = bentoTheme3.getColors(composerStartRestartGroup, i5).getMineral();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(593180719);
                jM21372getBg20d7_KjU = bentoTheme3.getColors(composerStartRestartGroup, i5).m21372getBg20d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(modifierFillMaxWidth$default, jM21372getBg20d7_KjU, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme3.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()));
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4871backgroundbw27NRU);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            int i6 = 0;
            Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(Row5.weight$default(Row6.INSTANCE, companion3, 1.0f, false, 2, null), bentoTheme3.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), bentoTheme3.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), bentoTheme3.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), bentoTheme3.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5145paddingqDBjuR0);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            String title = fullAgreementCard.getTitle();
            composerStartRestartGroup.startReplaceGroup(-408763692);
            if (title == null) {
                i3 = i5;
                bentoTheme = bentoTheme3;
                companion = companion3;
            } else {
                i3 = i5;
                bentoTheme = bentoTheme3;
                companion = companion3;
                BentoText2.m20747BentoText38GnDrw(title, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 24576, 0, 8174);
                composerStartRestartGroup = composerStartRestartGroup;
                i6 = 0;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            String content = fullAgreementCard.getContent();
            composerStartRestartGroup.startReplaceGroup(-408753667);
            if (content == null) {
                bentoTheme2 = bentoTheme;
                i4 = i6;
            } else {
                TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS();
                Composer composer3 = composerStartRestartGroup;
                bentoTheme2 = bentoTheme;
                i4 = i6;
                BentoText2.m20747BentoText38GnDrw(content, null, null, null, null, null, null, 0, false, 0, 0, null, 0, textS, composer3, 0, 0, 8190);
                composerStartRestartGroup = composer3;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            String asset_path = fullAgreementCard.getAsset_path();
            composerStartRestartGroup.startReplaceGroup(-1303761033);
            if (asset_path == null) {
                composer2 = composerStartRestartGroup;
            } else {
                composer2 = composerStartRestartGroup;
                ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(asset_path, null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, ContentScale.INSTANCE.getFillWidth(), 0, null, composerStartRestartGroup, 3072, 54), (String) null, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.m5158heightInVpY3zN4$default(SizeKt.m5174width3ABfNKs(TestTag3.testTag(companion, "cardAsset"), PrimitiveResources_androidKt.dimensionResource(C18003R.dimen.gold_unified_single_agreement_card_image_width, composerStartRestartGroup, i4)), PrimitiveResources_androidKt.dimensionResource(C18003R.dimen.gold_unified_single_agreement_card_image_width, composerStartRestartGroup, i4), 0.0f, 2, null), bentoTheme2.getSpacing(composerStartRestartGroup, i3).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldUnifiedSingleAgreementComposable3.AgreementCard$lambda$13(fullAgreementCard, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
