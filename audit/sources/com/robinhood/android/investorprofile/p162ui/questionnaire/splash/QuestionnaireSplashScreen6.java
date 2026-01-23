package com.robinhood.android.investorprofile.p162ui.questionnaire.splash;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
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
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.investorprofile.C19641R;
import com.robinhood.android.investorprofile.p162ui.questionnaire.splash.QuestionnaireSplashScreen6;
import com.robinhood.android.investorprofile.p162ui.questionnaire.splash.QuestionnaireSplashViewState;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtonState;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoImage;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import okhttp3.HttpUrl;

/* compiled from: QuestionnaireSplashScreen.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001aC\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u008a\u0084\u0002"}, m3636d2 = {"QuestionnaireSplashScreen", "", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "callbacks", "Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashDuxo;", "onBack", "Lkotlin/Function0;", "(Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashCallbacks;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashDuxo;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "feature-investor-profile_externalDebug", "viewState", "Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashViewState;", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class QuestionnaireSplashScreen6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$2(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuestionnaireSplashScreen$lambda$1(Context context, QuestionnaireSplashCallbacks questionnaireSplashCallbacks, Modifier modifier, QuestionnaireSplashDuxo questionnaireSplashDuxo, Function0 function0, int i, int i2, Composer composer, int i3) {
        QuestionnaireSplashScreen(context, questionnaireSplashCallbacks, modifier, questionnaireSplashDuxo, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void QuestionnaireSplashScreen(final Context eventContext, final QuestionnaireSplashCallbacks callbacks, Modifier modifier, QuestionnaireSplashDuxo questionnaireSplashDuxo, final Function0<Unit> onBack, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        QuestionnaireSplashDuxo questionnaireSplashDuxo2;
        Modifier modifier3;
        Composer composer2;
        int i4;
        QuestionnaireSplashDuxo questionnaireSplashDuxo3;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer3;
        final QuestionnaireSplashDuxo questionnaireSplashDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer composerStartRestartGroup = composer.startRestartGroup(-706567353);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(eventContext) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    questionnaireSplashDuxo2 = questionnaireSplashDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(questionnaireSplashDuxo2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    questionnaireSplashDuxo2 = questionnaireSplashDuxo;
                }
                i3 |= i6;
            } else {
                questionnaireSplashDuxo2 = questionnaireSplashDuxo;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onBack) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                    questionnaireSplashDuxo3 = questionnaireSplashDuxo2;
                    composer2 = composerStartRestartGroup;
                } else {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
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
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(QuestionnaireSplashDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashScreenKt$QuestionnaireSplashScreen$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashScreenKt$QuestionnaireSplashScreen$$inlined$duxo$1.1
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
                        questionnaireSplashDuxo3 = (QuestionnaireSplashDuxo) baseDuxo;
                    } else {
                        composer2 = composerStartRestartGroup;
                        i4 = i3;
                        questionnaireSplashDuxo3 = questionnaireSplashDuxo2;
                    }
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-706567353, i4, -1, "com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashScreen (QuestionnaireSplashScreen.kt:54)");
                }
                Composer composer4 = composer2;
                modifier2 = modifier3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, null, null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-760772840, true, new C198401(FlowExtKt.collectAsStateWithLifecycle(questionnaireSplashDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7), onBack, callbacks, eventContext), composer4, 54), composer4, ((i4 >> 6) & 14) | 805306368, 510);
                composer3 = composer4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                questionnaireSplashDuxo4 = questionnaireSplashDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                questionnaireSplashDuxo4 = questionnaireSplashDuxo2;
                composer3 = composerStartRestartGroup;
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return QuestionnaireSplashScreen6.QuestionnaireSplashScreen$lambda$1(eventContext, callbacks, modifier4, questionnaireSplashDuxo4, onBack, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i5 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                modifier2 = modifier3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, null, null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-760772840, true, new C198401(FlowExtKt.collectAsStateWithLifecycle(questionnaireSplashDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7), onBack, callbacks, eventContext), composer42, 54), composer42, ((i4 >> 6) & 14) | 805306368, 510);
                composer3 = composer42;
                if (ComposerKt.isTraceInProgress()) {
                }
                questionnaireSplashDuxo4 = questionnaireSplashDuxo3;
            }
        }
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: QuestionnaireSplashScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashScreenKt$QuestionnaireSplashScreen$1 */
    static final class C198401 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ QuestionnaireSplashCallbacks $callbacks;
        final /* synthetic */ Context $eventContext;
        final /* synthetic */ Function0<Unit> $onBack;
        final /* synthetic */ SnapshotState4<QuestionnaireSplashViewState> $viewState$delegate;

        C198401(SnapshotState4<QuestionnaireSplashViewState> snapshotState4, Function0<Unit> function0, QuestionnaireSplashCallbacks questionnaireSplashCallbacks, Context context) {
            this.$viewState$delegate = snapshotState4;
            this.$onBack = function0;
            this.$callbacks = questionnaireSplashCallbacks;
            this.$eventContext = context;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues contentPadding, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(contentPadding) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-760772840, i2, -1, "com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashScreen.<anonymous> (QuestionnaireSplashScreen.kt:58)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, contentPadding.getBottom(), 7, null);
            final SnapshotState4<QuestionnaireSplashViewState> snapshotState4 = this.$viewState$delegate;
            final Function0<Unit> function0 = this.$onBack;
            Object obj = this.$callbacks;
            Context context = this.$eventContext;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            final Column6 column6 = Column6.INSTANCE;
            BentoTheme2.BentoTheme(Boolean.valueOf(QuestionnaireSplashScreen6.QuestionnaireSplashScreen$lambda$0(snapshotState4).isDayHeaderOverride(composer, 0)), null, null, null, Boolean.valueOf(QuestionnaireSplashScreen6.QuestionnaireSplashScreen$lambda$0(snapshotState4).getUseElevatedThemeForHeader(composer, 0)), null, null, null, ComposableLambda3.rememberComposableLambda(52712774, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashScreenKt$QuestionnaireSplashScreen$1$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                private static final LottieComposition invoke$lambda$1$lambda$0(LottieCompositionResult lottieCompositionResult) {
                    return lottieCompositionResult.getValue();
                }

                public final void invoke(Composer composer2, int i3) {
                    Composer composer3 = composer2;
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(52712774, i3, -1, "com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashScreen.<anonymous>.<anonymous>.<anonymous> (QuestionnaireSplashScreen.kt:71)");
                    }
                    Column5 column5 = column6;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Column5.weight$default(column5, companion4, 1.0f, false, 2, null), 0.0f, 1, null);
                    final Function0<Unit> function02 = function0;
                    final SnapshotState4<QuestionnaireSplashViewState> snapshotState42 = snapshotState4;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(QuestionnaireSplashScreen2.INSTANCE.m15702getLambda$176413335$feature_investor_profile_externalDebug(), null, ComposableLambda3.rememberComposableLambda(1607480253, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashScreenKt$QuestionnaireSplashScreen$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i4) {
                            long jM21425getFg0d7_KjU;
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i4 & 6) == 0) {
                                i4 |= (i4 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i4 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1607480253, i4, -1, "com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuestionnaireSplashScreen.kt:79)");
                            }
                            if (!QuestionnaireSplashScreen6.QuestionnaireSplashScreen$lambda$0(snapshotState42).isBlocking()) {
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i5 = BentoTheme.$stable;
                                if (bentoTheme.getColors(composer4, i5).getIsDay()) {
                                    composer4.startReplaceGroup(-440894079);
                                    jM21425getFg0d7_KjU = bentoTheme.getColors(composer4, i5).m21371getBg0d7_KjU();
                                    composer4.endReplaceGroup();
                                } else {
                                    composer4.startReplaceGroup(-440788927);
                                    jM21425getFg0d7_KjU = bentoTheme.getColors(composer4, i5).m21425getFg0d7_KjU();
                                    composer4.endReplaceGroup();
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, Color.m6701boximpl(jM21425getFg0d7_KjU), function02, composer4, (BentoAppBarScope.$stable << 12) | ((i4 << 12) & 57344), 3);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, false, false, null, Color.m6701boximpl(QuestionnaireSplashScreen6.QuestionnaireSplashScreen$lambda$0(snapshotState42).getImageBackgroundColor(composer3, 0)), 0L, null, composer3, 390, 0, 1786);
                    QuestionnaireSplashViewState.Illustration illustration = QuestionnaireSplashScreen6.QuestionnaireSplashScreen$lambda$0(snapshotState42).getIllustration();
                    if (illustration instanceof QuestionnaireSplashViewState.Illustration.Lottie) {
                        composer3.startReplaceGroup(1761642419);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i4 = BentoTheme.$stable;
                        QuestionnaireSplashViewState.Illustration.Lottie lottie = (QuestionnaireSplashViewState.Illustration.Lottie) illustration;
                        float f = 67;
                        LottieAnimation2.LottieAnimation(invoke$lambda$1$lambda$0(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl((bentoTheme.getColors(composer3, i4).getIsDay() ? lottie.getDayUrl() : lottie.getNightUrl()).getUrl().getUrl())), null, null, null, null, null, composer3, 0, 62)), PaddingKt.m5145paddingqDBjuR0(Background3.m4872backgroundbw27NRU$default(Column5.weight$default(column62, SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), C2002Dp.m7995constructorimpl(0)), 1.0f, false, 2, null), QuestionnaireSplashScreen6.QuestionnaireSplashScreen$lambda$0(snapshotState42).getImageBackgroundColor(composer3, 0), null, 2, null), C2002Dp.m7995constructorimpl(f), bentoTheme.getSpacing(composer3, i4).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(63)), false, false, null, 0.0f, 0, false, false, false, null, false, false, null, null, ContentScale.INSTANCE.getFit(), false, false, null, false, null, composer2, 0, 196608, 0, 2064380);
                        composer3 = composer2;
                        composer3.endReplaceGroup();
                    } else if (illustration instanceof QuestionnaireSplashViewState.Illustration.Image) {
                        composer3.startReplaceGroup(1762834555);
                        BentoImage.BentoImage(PainterResources_androidKt.painterResource(((QuestionnaireSplashViewState.Illustration.Image) illustration).getImageRes(), composer3, 0), null, Background3.m4872backgroundbw27NRU$default(Column5.weight$default(column62, SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), C2002Dp.m7995constructorimpl(0)), 1.0f, false, 2, null), QuestionnaireSplashScreen6.QuestionnaireSplashScreen$lambda$0(snapshotState42).getImageBackgroundColor(composer3, 0), null, 2, null), null, ContentScale.INSTANCE.getNone(), 0.0f, null, composer3, 24624, 104);
                        composer3.endReplaceGroup();
                    } else {
                        if (!Intrinsics.areEqual(illustration, QuestionnaireSplashViewState.Illustration.Empty.INSTANCE)) {
                            composer3.startReplaceGroup(333918820);
                            composer3.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer3.startReplaceGroup(333981201);
                        BoxKt.Box(Background3.m4872backgroundbw27NRU$default(Column5.weight$default(column62, SizeKt.m5156height3ABfNKs(companion4, C2002Dp.m7995constructorimpl(0)), 1.0f, false, 2, null), QuestionnaireSplashScreen6.QuestionnaireSplashScreen$lambda$0(snapshotState42).getImageBackgroundColor(composer3, 0), null, 2, null), composer3, 0);
                        composer3.endReplaceGroup();
                    }
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE);
            float f = 0;
            Modifier modifierWeight$default = Column5.weight$default(column6, SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f)), 1.0f, false, 2, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierWeight$default, bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(QuestionnaireSplashScreen6.QuestionnaireSplashScreen$lambda$0(snapshotState4).getTitleTextRes(), composer, 0), PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getBookCoverCapsuleSmall(), composer, 0, 0, 8188);
            final android.content.Context context2 = (android.content.Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            String textAsString = StringResources6.getTextAsString(QuestionnaireSplashScreen6.QuestionnaireSplashScreen$lambda$0(snapshotState4).getSummaryText(), composer, StringResource.$stable);
            MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i3).getTextM(), 0, bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU(), 0L, false, composer, BentoMarkdownText.$stable << 15, 26);
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(context2);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashScreenKt$QuestionnaireSplashScreen$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return QuestionnaireSplashScreen6.C198401.invoke$lambda$4$lambda$3$lambda$1$lambda$0(context2, (String) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoMarkdownText2.BentoMarkdownText(textAsString, modifierM5146paddingqDBjuR0$default2, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composer, MarkdownStyle.$stable << 6, 8);
            Spacer2.Spacer(Column5.weight$default(column6, SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f)), 1.0f, false, 2, null), composer, 0);
            BentoButtonState bentoButtonState = new BentoButtonState(StringResources_androidKt.stringResource(C19641R.string.questionnaire_splash_cta, composer, 0), (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, false, false, (Color) null, (Color) null, (Color) null, (TextStyle) null, (Color) null, false, 2046, (DefaultConstructorMarker) null);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(obj);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new QuestionnaireSplashScreen9(obj);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonKt.BentoButton(bentoButtonState, (Function0<Unit>) ((KFunction) objRememberedValue2), PaddingKt.m5145paddingqDBjuR0(ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, context, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 35, null), true, false, false, true, false, null, 108, null), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM()), (String) null, composer, BentoButtonState.$stable, 8);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$1$lambda$0(android.content.Context context, String uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            WebUtils.viewUrl$default(WebUtils.INSTANCE, context, HttpUrl.INSTANCE.get(uri), 0, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuestionnaireSplashViewState QuestionnaireSplashScreen$lambda$0(SnapshotState4<QuestionnaireSplashViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1015369613);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1015369613, i, -1, "com.robinhood.android.investorprofile.ui.questionnaire.splash.Preview (QuestionnaireSplashScreen.kt:209)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, QuestionnaireSplashScreen2.INSTANCE.m15701getLambda$1446398139$feature_investor_profile_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuestionnaireSplashScreen6.Preview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
