package com.robinhood.android.crypto.tab.p093ui.education;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.crypto.tab.C13013R;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.EducationSeries;
import com.robinhood.rosetta.eventlogging.LearningLesson;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.education.EducationLessonPreviews;
import com.robinhood.shared.education.p377ui.EducationSeriesLessonsCarousel5;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoHomeEducationComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\u0017\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, m3636d2 = {"CryptoHomeEducationCarouselTestTag", "", "getCryptoHomeEducationCarouselTestTag$annotations", "()V", "getCryptoHomeEducationCarouselTestTag", "()Ljava/lang/String;", "CryptoHomeEducationComposable", "", "duxo", "Lcom/robinhood/android/crypto/tab/ui/education/CryptoHomeEducationDuxo;", "(Lcom/robinhood/android/crypto/tab/ui/education/CryptoHomeEducationDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-tab_externalDebug", "viewState", "Lcom/robinhood/android/crypto/tab/ui/education/CryptoHomeEducationViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoHomeEducationComposable {
    private static final String CryptoHomeEducationCarouselTestTag = "cryptoHomeEducationCarousel";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeEducationComposable$lambda$1(CryptoHomeEducationDuxo cryptoHomeEducationDuxo, int i, int i2, Composer composer, int i3) {
        CryptoHomeEducationComposable(cryptoHomeEducationDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeEducationComposable$lambda$5(CryptoHomeEducationDuxo cryptoHomeEducationDuxo, int i, int i2, Composer composer, int i3) {
        CryptoHomeEducationComposable(cryptoHomeEducationDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getCryptoHomeEducationCarouselTestTag$annotations() {
    }

    public static final String getCryptoHomeEducationCarouselTestTag() {
        return CryptoHomeEducationCarouselTestTag;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoHomeEducationComposable(CryptoHomeEducationDuxo cryptoHomeEducationDuxo, Composer composer, final int i, final int i2) {
        final CryptoHomeEducationDuxo cryptoHomeEducationDuxo2;
        int i3;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1462527602);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                cryptoHomeEducationDuxo2 = cryptoHomeEducationDuxo;
                if (composerStartRestartGroup.changedInstance(cryptoHomeEducationDuxo2)) {
                    i4 = 4;
                }
                i3 = i4 | i;
            } else {
                cryptoHomeEducationDuxo2 = cryptoHomeEducationDuxo;
            }
            i4 = 2;
            i3 = i4 | i;
        } else {
            cryptoHomeEducationDuxo2 = cryptoHomeEducationDuxo;
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoHomeEducationDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationComposableKt$CryptoHomeEducationComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationComposableKt$CryptoHomeEducationComposable$$inlined$duxo$1.1
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
                    cryptoHomeEducationDuxo2 = (CryptoHomeEducationDuxo) baseDuxo;
                    i3 &= -15;
                }
                final CryptoHomeEducationDuxo cryptoHomeEducationDuxo3 = cryptoHomeEducationDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1462527602, i3, -1, "com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationComposable (CryptoHomeEducationComposable.kt:35)");
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoHomeEducationDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                if (CryptoHomeEducationComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isContentVisible()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoHomeEducationComposable.CryptoHomeEducationComposable$lambda$1(cryptoHomeEducationDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21594getXlargeD9Ej5fM()), composerStartRestartGroup, 0);
                Composer composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C13013R.string.crypto_home_education_title, composerStartRestartGroup, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composer2, 0, 0, 8188);
                composerStartRestartGroup = composer2;
                final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Modifier modifierTestTag = TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), CryptoHomeEducationCarouselTestTag);
                ImmutableList<EducationLessonPreview> educationLessonPreviews = CryptoHomeEducationComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getEducationLessonPreviews();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(current2);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoHomeEducationComposable.CryptoHomeEducationComposable$lambda$4$lambda$3(current2, navigator, context, snapshotState4CollectAsStateWithLifecycle, (EducationLessonPreview) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EducationSeriesLessonsCarousel5.EducationSeriesLessonsCarousel(educationLessonPreviews, false, modifierTestTag, (Function1) objRememberedValue2, composerStartRestartGroup, 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                cryptoHomeEducationDuxo2 = cryptoHomeEducationDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                final CryptoHomeEducationDuxo cryptoHomeEducationDuxo32 = cryptoHomeEducationDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoHomeEducationDuxo32.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                if (CryptoHomeEducationComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isContentVisible()) {
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoHomeEducationComposable.CryptoHomeEducationComposable$lambda$5(cryptoHomeEducationDuxo2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeEducationComposable$lambda$4$lambda$3(EventLogger eventLogger, Navigator navigator, Context context, SnapshotState4 snapshotState4, EducationLessonPreview lesson) {
        Intrinsics.checkNotNullParameter(lesson, "lesson");
        FragmentKey fragmentKeyOrNull = EducationLessonPreviews.toFragmentKeyOrNull(lesson, EducationSource.EDUCATION_SOURCE_CRYPTO_TAB);
        if (fragmentKeyOrNull != null) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, fragmentKeyOrNull, false, false, false, null, false, null, true, false, null, null, 3828, null);
        }
        Screen screen = new Screen(Screen.Name.CRYPTO_HOME_TAB, null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.LEARNING_LESSON_CARD, null, null, 6, null);
        UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_LEARNING_LESSON;
        LearningLesson learningLesson = new LearningLesson(lesson.getIdentifier(), lesson.getTitle(), false, 0, null, 28, null);
        EducationSeries educationSeries = new EducationSeries(null, "Learn", null, 5, null);
        int size = CryptoHomeEducationComposable$lambda$0(snapshotState4).getEducationLessonPreviews().size();
        Integer index = lesson.getIndex();
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, new com.robinhood.rosetta.eventlogging.Context(index != null ? index.intValue() : 0, size, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, learningLesson, null, null, null, null, null, null, null, null, null, null, null, null, educationSeries, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108868, -129, -1, -1, -1, -1, 16383, null), true, 8, null);
        return Unit.INSTANCE;
    }

    private static final CryptoHomeEducationViewState CryptoHomeEducationComposable$lambda$0(SnapshotState4<CryptoHomeEducationViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
