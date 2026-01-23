package com.robinhood.shared.education.p377ui.onboarding;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.Divider2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextLinkStyles;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.LayoutDirection;
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
import com.robinhood.android.common.C11048R;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.p377ui.onboarding.CryptoLearnAndEarnOnboardingViewState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: CryptoLearnAndEarnOnboardingComposable.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a#\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0003¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u0084\u0002"}, m3636d2 = {"CryptoLearnAndEarnOnboardingComposable", "", "continueAction", "Lkotlin/Function0;", "termsAndConditionsAction", "duxo", "Lcom/robinhood/shared/education/ui/onboarding/CryptoLearnAndEarnOnboardingDuxo;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/shared/education/ui/onboarding/CryptoLearnAndEarnOnboardingDuxo;Landroidx/compose/runtime/Composer;II)V", "CryptoLearnAndEarnFooterText", "viewState", "Lcom/robinhood/shared/education/ui/onboarding/CryptoLearnAndEarnOnboardingViewState;", "(Lcom/robinhood/shared/education/ui/onboarding/CryptoLearnAndEarnOnboardingViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-education_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.education.ui.onboarding.CryptoLearnAndEarnOnboardingComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoLearnAndEarnOnboardingComposable5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoLearnAndEarnFooterText$lambda$6(CryptoLearnAndEarnOnboardingViewState cryptoLearnAndEarnOnboardingViewState, Function0 function0, int i, Composer composer, int i2) {
        CryptoLearnAndEarnFooterText(cryptoLearnAndEarnOnboardingViewState, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoLearnAndEarnOnboardingComposable$lambda$1(Function0 function0, Function0 function02, CryptoLearnAndEarnOnboardingDuxo cryptoLearnAndEarnOnboardingDuxo, int i, int i2, Composer composer, int i3) {
        CryptoLearnAndEarnOnboardingComposable(function0, function02, cryptoLearnAndEarnOnboardingDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoLearnAndEarnOnboardingComposable(final Function0<Unit> continueAction, final Function0<Unit> termsAndConditionsAction, CryptoLearnAndEarnOnboardingDuxo cryptoLearnAndEarnOnboardingDuxo, Composer composer, final int i, final int i2) {
        int i3;
        CryptoLearnAndEarnOnboardingDuxo cryptoLearnAndEarnOnboardingDuxo2;
        CreationExtras defaultViewModelCreationExtras;
        final CryptoLearnAndEarnOnboardingDuxo cryptoLearnAndEarnOnboardingDuxo3;
        Intrinsics.checkNotNullParameter(continueAction, "continueAction");
        Intrinsics.checkNotNullParameter(termsAndConditionsAction, "termsAndConditionsAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(35844934);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(continueAction) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(termsAndConditionsAction) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                cryptoLearnAndEarnOnboardingDuxo2 = cryptoLearnAndEarnOnboardingDuxo;
                int i4 = composerStartRestartGroup.changedInstance(cryptoLearnAndEarnOnboardingDuxo2) ? 256 : 128;
                i3 |= i4;
            } else {
                cryptoLearnAndEarnOnboardingDuxo2 = cryptoLearnAndEarnOnboardingDuxo;
            }
            i3 |= i4;
        } else {
            cryptoLearnAndEarnOnboardingDuxo2 = cryptoLearnAndEarnOnboardingDuxo;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
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
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoLearnAndEarnOnboardingDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.education.ui.onboarding.CryptoLearnAndEarnOnboardingComposableKt$CryptoLearnAndEarnOnboardingComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.shared.education.ui.onboarding.CryptoLearnAndEarnOnboardingComposableKt$CryptoLearnAndEarnOnboardingComposable$$inlined$duxo$1.1
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
                    cryptoLearnAndEarnOnboardingDuxo2 = (CryptoLearnAndEarnOnboardingDuxo) baseDuxo;
                    i3 &= -897;
                }
                CryptoLearnAndEarnOnboardingDuxo cryptoLearnAndEarnOnboardingDuxo4 = cryptoLearnAndEarnOnboardingDuxo2;
                int i5 = i3;
                cryptoLearnAndEarnOnboardingDuxo3 = cryptoLearnAndEarnOnboardingDuxo4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(35844934, i5, -1, "com.robinhood.shared.education.ui.onboarding.CryptoLearnAndEarnOnboardingComposable (CryptoLearnAndEarnOnboardingComposable.kt:49)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoLearnAndEarnOnboardingDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE), CryptoLearnAndEarnOnboardingComposable.INSTANCE.m25404getLambda$440575998$feature_education_externalDebug(), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-653993641, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.ui.onboarding.CryptoLearnAndEarnOnboardingComposableKt.CryptoLearnAndEarnOnboardingComposable.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                        invoke(paddingValues, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        int i7 = (i6 & 6) == 0 ? i6 | (composer2.changed(paddingValues) ? 4 : 2) : i6;
                        if ((i7 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-653993641, i7, -1, "com.robinhood.shared.education.ui.onboarding.CryptoLearnAndEarnOnboardingComposable.<anonymous> (CryptoLearnAndEarnOnboardingComposable.kt:64)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        LayoutDirection layoutDirection = LayoutDirection.Ltr;
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m5146paddingqDBjuR0$default(companion, PaddingKt.calculateStartPadding(paddingValues, layoutDirection), 0.0f, PaddingKt.calculateEndPadding(paddingValues, layoutDirection), 0.0f, 10, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                        Function0<Unit> function0 = termsAndConditionsAction;
                        Function0<Unit> function02 = continueAction;
                        SnapshotState4<CryptoLearnAndEarnOnboardingViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        ImageKt.Image(PainterResources_androidKt.painterResource(C38790R.drawable.crypto_learn_and_earn_onboarding_splash, composer2, 0), (String) null, SizeKt.fillMaxWidth$default(PaddingKt.m5145paddingqDBjuR0(companion, bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21594getXlargeD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21593getSmallD9Ej5fM()), 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                        Divider2.m5581DivideroMI9zvI(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getColors(composer2, i8).m21372getBg20d7_KjU(), C2002Dp.m7995constructorimpl(1), 0.0f, composer2, 390, 8);
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C38790R.string.crypto_learn_and_earn_onboarding_title, composer2, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21591getLargeD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i8).getDisplayCapsuleMedium(), composer2, 0, 0, 8188);
                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(CryptoLearnAndEarnOnboardingComposable5.CryptoLearnAndEarnOnboardingComposable$lambda$0(snapshotState4).getSubtitle(), composer2, StringResource.$stable), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i8).getTextM(), composer2, 0, 0, 8188);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM()), composer2, 0);
                        composer2.startReplaceGroup(181393926);
                        int i9 = 0;
                        for (Object obj : CryptoLearnAndEarnOnboardingComposable5.CryptoLearnAndEarnOnboardingComposable$lambda$0(snapshotState4).getContentRows()) {
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            CryptoLearnAndEarnOnboardingViewState.BentoValuePropRowContent bentoValuePropRowContent = (CryptoLearnAndEarnOnboardingViewState.BentoValuePropRowContent) obj;
                            StringResource title = bentoValuePropRowContent.getTitle();
                            int i11 = StringResource.$stable;
                            BentoValuePropRow3.BentoValuePropRow(StringResource2.getString(title, composer2, i11), StringResource2.getString(bentoValuePropRowContent.getBody(), composer2, i11), new BentoValuePropRow2.Number(i10), BentoValuePropRow.Top, (Modifier) null, composer2, (BentoValuePropRow2.Number.$stable << 6) | 3072, 16);
                            i9 = i10;
                        }
                        composer2.endReplaceGroup();
                        CryptoLearnAndEarnOnboardingComposable5.CryptoLearnAndEarnFooterText(CryptoLearnAndEarnOnboardingComposable5.CryptoLearnAndEarnOnboardingComposable$lambda$0(snapshotState4), function0, composer2, 0);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i12 = BentoTheme.$stable;
                        BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer2, 0), PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoTheme2.getSpacing(composer2, i12).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i12).m21590getDefaultD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 508);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                CryptoLearnAndEarnOnboardingDuxo cryptoLearnAndEarnOnboardingDuxo42 = cryptoLearnAndEarnOnboardingDuxo2;
                int i52 = i3;
                cryptoLearnAndEarnOnboardingDuxo3 = cryptoLearnAndEarnOnboardingDuxo42;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<CryptoLearnAndEarnOnboardingViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoLearnAndEarnOnboardingDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE), CryptoLearnAndEarnOnboardingComposable.INSTANCE.m25404getLambda$440575998$feature_education_externalDebug(), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-653993641, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.ui.onboarding.CryptoLearnAndEarnOnboardingComposableKt.CryptoLearnAndEarnOnboardingComposable.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                        invoke(paddingValues, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        int i7 = (i6 & 6) == 0 ? i6 | (composer2.changed(paddingValues) ? 4 : 2) : i6;
                        if ((i7 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-653993641, i7, -1, "com.robinhood.shared.education.ui.onboarding.CryptoLearnAndEarnOnboardingComposable.<anonymous> (CryptoLearnAndEarnOnboardingComposable.kt:64)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        LayoutDirection layoutDirection = LayoutDirection.Ltr;
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m5146paddingqDBjuR0$default(companion, PaddingKt.calculateStartPadding(paddingValues, layoutDirection), 0.0f, PaddingKt.calculateEndPadding(paddingValues, layoutDirection), 0.0f, 10, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                        Function0<Unit> function0 = termsAndConditionsAction;
                        Function0<Unit> function02 = continueAction;
                        SnapshotState4<CryptoLearnAndEarnOnboardingViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        ImageKt.Image(PainterResources_androidKt.painterResource(C38790R.drawable.crypto_learn_and_earn_onboarding_splash, composer2, 0), (String) null, SizeKt.fillMaxWidth$default(PaddingKt.m5145paddingqDBjuR0(companion, bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21594getXlargeD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21593getSmallD9Ej5fM()), 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                        Divider2.m5581DivideroMI9zvI(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getColors(composer2, i8).m21372getBg20d7_KjU(), C2002Dp.m7995constructorimpl(1), 0.0f, composer2, 390, 8);
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C38790R.string.crypto_learn_and_earn_onboarding_title, composer2, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21591getLargeD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i8).getDisplayCapsuleMedium(), composer2, 0, 0, 8188);
                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(CryptoLearnAndEarnOnboardingComposable5.CryptoLearnAndEarnOnboardingComposable$lambda$0(snapshotState4).getSubtitle(), composer2, StringResource.$stable), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i8).getTextM(), composer2, 0, 0, 8188);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM()), composer2, 0);
                        composer2.startReplaceGroup(181393926);
                        int i9 = 0;
                        for (Object obj : CryptoLearnAndEarnOnboardingComposable5.CryptoLearnAndEarnOnboardingComposable$lambda$0(snapshotState4).getContentRows()) {
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            CryptoLearnAndEarnOnboardingViewState.BentoValuePropRowContent bentoValuePropRowContent = (CryptoLearnAndEarnOnboardingViewState.BentoValuePropRowContent) obj;
                            StringResource title = bentoValuePropRowContent.getTitle();
                            int i11 = StringResource.$stable;
                            BentoValuePropRow3.BentoValuePropRow(StringResource2.getString(title, composer2, i11), StringResource2.getString(bentoValuePropRowContent.getBody(), composer2, i11), new BentoValuePropRow2.Number(i10), BentoValuePropRow.Top, (Modifier) null, composer2, (BentoValuePropRow2.Number.$stable << 6) | 3072, 16);
                            i9 = i10;
                        }
                        composer2.endReplaceGroup();
                        CryptoLearnAndEarnOnboardingComposable5.CryptoLearnAndEarnFooterText(CryptoLearnAndEarnOnboardingComposable5.CryptoLearnAndEarnOnboardingComposable$lambda$0(snapshotState4), function0, composer2, 0);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i12 = BentoTheme.$stable;
                        BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer2, 0), PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoTheme2.getSpacing(composer2, i12).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i12).m21590getDefaultD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 508);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            cryptoLearnAndEarnOnboardingDuxo3 = cryptoLearnAndEarnOnboardingDuxo2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.education.ui.onboarding.CryptoLearnAndEarnOnboardingComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoLearnAndEarnOnboardingComposable5.CryptoLearnAndEarnOnboardingComposable$lambda$1(continueAction, termsAndConditionsAction, cryptoLearnAndEarnOnboardingDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoLearnAndEarnOnboardingViewState CryptoLearnAndEarnOnboardingComposable$lambda$0(SnapshotState4<CryptoLearnAndEarnOnboardingViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoLearnAndEarnFooterText(final CryptoLearnAndEarnOnboardingViewState cryptoLearnAndEarnOnboardingViewState, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1584261400);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(cryptoLearnAndEarnOnboardingViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1584261400, i2, -1, "com.robinhood.shared.education.ui.onboarding.CryptoLearnAndEarnFooterText (CryptoLearnAndEarnOnboardingComposable.kt:147)");
            }
            StringResource footerMessage = cryptoLearnAndEarnOnboardingViewState.getFooterMessage();
            int i3 = StringResource.$stable;
            String string2 = StringResource2.getString(footerMessage, composerStartRestartGroup, i3);
            composerStartRestartGroup.startReplaceGroup(2056791101);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            int iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.append(string2);
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                builder.append(' ');
                composerStartRestartGroup.startReplaceGroup(2056797295);
                TextLinkStyles textLinkStyles = new TextLinkStyles(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61434, (DefaultConstructorMarker) null), null, null, null, 14, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z = (i2 & 112) == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new LinkInteractionListener() { // from class: com.robinhood.shared.education.ui.onboarding.CryptoLearnAndEarnOnboardingComposableKt$CryptoLearnAndEarnFooterText$annotatedString$1$2$1
                        @Override // androidx.compose.p011ui.text.LinkInteractionListener
                        public final void onClick(LinkAnnotation it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            function0.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                int iPushLink = builder.pushLink(new LinkAnnotation.Clickable("clickable-link", textLinkStyles, (LinkInteractionListener) objRememberedValue));
                try {
                    builder.append(StringResource2.getString(cryptoLearnAndEarnOnboardingViewState.getFooterLinkText(), composerStartRestartGroup, i3));
                    builder.pop(iPushLink);
                    composerStartRestartGroup.endReplaceGroup();
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20748BentoTextQnj7Zds(annotatedString, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21591getLargeD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, null, 0, false, 0, 0, null, null, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer2, 0, 0, 8188);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } catch (Throwable th) {
                    builder.pop(iPushLink);
                    throw th;
                }
            } catch (Throwable th2) {
                builder.pop(iPushStyle);
                throw th2;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.education.ui.onboarding.CryptoLearnAndEarnOnboardingComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoLearnAndEarnOnboardingComposable5.CryptoLearnAndEarnFooterText$lambda$6(cryptoLearnAndEarnOnboardingViewState, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
