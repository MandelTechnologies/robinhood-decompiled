package com.robinhood.shared.education.p377ui.home;

import android.content.res.Configuration;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SingleValueAnimation;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.Divider2;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals3;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.rosetta.converters.engagement.LearningLessons;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.education.p377ui.EducationSeriesLessonsCarousel5;
import com.robinhood.shared.education.p377ui.home.EducationHomeFragmentKt;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationSeries;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.extensions2;

/* compiled from: EducationHomeFragment.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\u001aF\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\f\u001a5\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001e\u001a\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001e\u001aB\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020!2!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010#\u001a\u00020$H\u0003¢\u0006\u0002\u0010%\u001a\u0015\u0010&\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010'\u001a\u0015\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010'\u001a\r\u0010*\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010+\u001a)\u0010,\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010.\u001a\f\u0010/\u001a\u00020\u0013*\u000200H\u0002¨\u00061²\u0006\n\u0010\u0018\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0019\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\n\u0010\u0019\u001a\u00020\u0011X\u008a\u0084\u0002"}, m3636d2 = {"HomeContent", "", "state", "Lcom/robinhood/shared/education/ui/home/EducationHomeViewState;", "onLessonCardClick", "Lkotlin/Function1;", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "Lkotlin/ParameterName;", "name", "lesson", "onBackButtonClick", "Lkotlin/Function0;", "(Lcom/robinhood/shared/education/ui/home/EducationHomeViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TopAppBar", "homeTitle", "", "headerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "isHeaderVisible", "", "TopAppBar-3IgeMak", "(Ljava/lang/String;JZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Header", "title", "foregroundColor", "backgroundColor", "Header-1wkBAMs", "(Ljava/lang/String;JJLandroidx/compose/runtime/Composer;I)V", "headerForegroundColor", "Landroidx/compose/runtime/State;", "(Lcom/robinhood/shared/education/ui/home/EducationHomeViewState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "EducationSeriesSection", "series", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationSeries;", "lessonPreview", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationSeries;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SeriesTitle", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "SeriesSubtitle", "subtitle", "SeriesDivider", "(Landroidx/compose/runtime/Composer;I)V", "ErrorScreen", "onTryAgainClick", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "isSmallScreen", "Landroid/content/res/Configuration;", "feature-education_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EducationHomeFragmentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EducationSeriesSection$lambda$12(EducationSeries educationSeries, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EducationSeriesSection(educationSeries, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorScreen$lambda$16(Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        ErrorScreen(function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Header_1wkBAMs$lambda$9(String str, long j, long j2, int i, Composer composer, int i2) {
        m25361Header1wkBAMs(str, j, j2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContent$lambda$5(EducationHomeViewState educationHomeViewState, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        HomeContent(educationHomeViewState, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SeriesDivider$lambda$15(int i, Composer composer, int i2) {
        SeriesDivider(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SeriesSubtitle$lambda$14(String str, int i, Composer composer, int i2) {
        SeriesSubtitle(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SeriesTitle$lambda$13(String str, int i, Composer composer, int i2) {
        SeriesTitle(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopAppBar_3IgeMak$lambda$7(String str, long j, boolean z, Function0 function0, int i, Composer composer, int i2) {
        m25362TopAppBar3IgeMak(str, j, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long HomeContent$lambda$0(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long HomeContent$lambda$1(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HomeContent$lambda$4(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final long TopAppBar_3IgeMak$lambda$6(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HomeContent(final EducationHomeViewState educationHomeViewState, final Function1<? super EducationLessonPreview, Unit> function1, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1743553186);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(educationHomeViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1743553186, i2, -1, "com.robinhood.shared.education.ui.home.HomeContent (EducationHomeFragment.kt:198)");
            }
            int i3 = i2 & 14;
            SnapshotState4<Color> snapshotState4HeaderForegroundColor = headerForegroundColor(educationHomeViewState, composerStartRestartGroup, i3);
            final SnapshotState4<Color> snapshotState4HeaderBackgroundColor = headerBackgroundColor(educationHomeViewState, composerStartRestartGroup, i3);
            int size = educationHomeViewState.getSeries().size();
            final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(EducationHomeFragmentKt.HomeContent$lambda$3$lambda$2(lazyListStateRememberLazyListState));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5625Scaffold27mzLpw(null, null, ComposableLambda3.rememberComposableLambda(-1187142919, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt.HomeContent.1
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
                        ComposerKt.traceEventStart(-1187142919, i4, -1, "com.robinhood.shared.education.ui.home.HomeContent.<anonymous> (EducationHomeFragment.kt:207)");
                    }
                    EducationHomeFragmentKt.m25362TopAppBar3IgeMak(educationHomeViewState.getTitle(), EducationHomeFragmentKt.HomeContent$lambda$1(snapshotState4HeaderBackgroundColor), EducationHomeFragmentKt.HomeContent$lambda$4(snapshotState4), function0, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, ComposableLambda3.rememberComposableLambda(-822823200, true, new C388392(lazyListStateRememberLazyListState, educationHomeViewState, snapshotState4HeaderForegroundColor, snapshotState4HeaderBackgroundColor, size, function1), composerStartRestartGroup, 54), composer2, 384, 12582912, 98299);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EducationHomeFragmentKt.HomeContent$lambda$5(educationHomeViewState, function1, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HomeContent$lambda$3$lambda$2(LazyListState lazyListState) {
        return lazyListState.getFirstVisibleItemIndex() == 0;
    }

    /* compiled from: EducationHomeFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt$HomeContent$2 */
    static final class C388392 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<Color> $backgroundColor$delegate;
        final /* synthetic */ SnapshotState4<Color> $foregroundColor$delegate;
        final /* synthetic */ LazyListState $listState;
        final /* synthetic */ Function1<EducationLessonPreview, Unit> $onLessonCardClick;
        final /* synthetic */ int $seriesCount;
        final /* synthetic */ EducationHomeViewState $state;

        /* JADX WARN: Multi-variable type inference failed */
        C388392(LazyListState lazyListState, EducationHomeViewState educationHomeViewState, SnapshotState4<Color> snapshotState4, SnapshotState4<Color> snapshotState42, int i, Function1<? super EducationLessonPreview, Unit> function1) {
            this.$listState = lazyListState;
            this.$state = educationHomeViewState;
            this.$foregroundColor$delegate = snapshotState4;
            this.$backgroundColor$delegate = snapshotState42;
            this.$seriesCount = i;
            this.$onLessonCardClick = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-822823200, i2, -1, "com.robinhood.shared.education.ui.home.HomeContent.<anonymous> (EducationHomeFragment.kt:216)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), 0.0f, 1, null);
            LazyListState lazyListState = this.$listState;
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$state) | composer.changed(this.$foregroundColor$delegate) | composer.changed(this.$backgroundColor$delegate) | composer.changed(this.$seriesCount) | composer.changed(this.$onLessonCardClick);
            final EducationHomeViewState educationHomeViewState = this.$state;
            final SnapshotState4<Color> snapshotState4 = this.$foregroundColor$delegate;
            final SnapshotState4<Color> snapshotState42 = this.$backgroundColor$delegate;
            final int i3 = this.$seriesCount;
            final Function1<EducationLessonPreview, Unit> function1 = this.$onLessonCardClick;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt$HomeContent$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EducationHomeFragmentKt.C388392.invoke$lambda$2$lambda$1(educationHomeViewState, snapshotState4, snapshotState42, i3, function1, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, lazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(final EducationHomeViewState educationHomeViewState, final SnapshotState4 snapshotState4, final SnapshotState4 snapshotState42, final int i, final Function1 function1, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(2918891, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt$HomeContent$2$1$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i2) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i2 & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2918891, i2, -1, "com.robinhood.shared.education.ui.home.HomeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EducationHomeFragment.kt:223)");
                    }
                    EducationHomeFragmentKt.m25361Header1wkBAMs(educationHomeViewState.getTitle(), EducationHomeFragmentKt.HomeContent$lambda$0(snapshotState4), EducationHomeFragmentKt.HomeContent$lambda$1(snapshotState42), composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
            final List<EducationSeries> series = educationHomeViewState.getSeries();
            LazyColumn.items(series.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt$HomeContent$2$invoke$lambda$2$lambda$1$$inlined$itemsIndexed$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i2) {
                    series.get(i2);
                    return null;
                }
            }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt$HomeContent$2$invoke$lambda$2$lambda$1$$inlined$itemsIndexed$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                    int i4;
                    if ((i3 & 6) == 0) {
                        i4 = i3 | (composer.changed(lazyItemScope) ? 4 : 2);
                    } else {
                        i4 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        i4 |= composer.changed(i2) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1091073711, i4, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                    }
                    final EducationSeries educationSeries = (EducationSeries) series.get(i2);
                    composer.startReplaceGroup(-645703241);
                    Component component = new Component(Component.ComponentType.CAROUSEL, null, null, 6, null);
                    Context eventContext = AutoLoggingCompositionLocals3.INSTANCE.getEventContext(composer, AutoLoggingCompositionLocals3.$stable);
                    UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, null, null, Context.copy$default(eventContext == null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16383, null) : eventContext, i2 + 1, i, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LearningLessons.toProtobuf(educationSeries), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4, -129, -1, -1, -1, -1, 16383, null), component, null, 39, null);
                    final Function1 function12 = function1;
                    AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(-1462044671, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt$HomeContent$2$1$1$2$1
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
                                ComposerKt.traceEventStart(-1462044671, i5, -1, "com.robinhood.shared.education.ui.home.HomeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EducationHomeFragment.kt:239)");
                            }
                            EducationHomeFragmentKt.EducationSeriesSection(educationSeries, function12, ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, null, true, false, false, false, false, null, 125, null), composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 48);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TopAppBar-3IgeMak, reason: not valid java name */
    public static final void m25362TopAppBar3IgeMak(final String str, final long j, final boolean z, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(418717347);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(418717347, i2, -1, "com.robinhood.shared.education.ui.home.TopAppBar (EducationHomeFragment.kt:256)");
            }
            final boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(LocalShowPlaceholder.getLocalShowPlaceholder())).booleanValue();
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(14869571, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt$TopAppBar$title$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(14869571, i3, -1, "com.robinhood.shared.education.ui.home.TopAppBar.<anonymous> (EducationHomeFragment.kt:259)");
                    }
                    if (!zBooleanValue) {
                        boolean z2 = !z;
                        EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
                        ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
                        final String str2 = str;
                        AnimatedVisibilityKt.AnimatedVisibility(z2, (Modifier) null, enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambda3.rememberComposableLambda(1095752944, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt$TopAppBar$title$1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                invoke(animatedVisibilityScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i4) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1095752944, i4, -1, "com.robinhood.shared.education.ui.home.TopAppBar.<anonymous>.<anonymous> (EducationHomeFragment.kt:264)");
                                }
                                BentoText2.m20747BentoText38GnDrw(str2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 200064, 18);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(-1339536853);
            long jM21371getBg0d7_KjU = (!z || zBooleanValue) ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU() : j;
            composerStartRestartGroup.endReplaceGroup();
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.BACK, null, new Component(Component.ComponentType.BACK_BUTTON, null, null, 6, null), null, 43, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), ComposableLambda3.rememberComposableLambda(-185344574, true, new EducationHomeFragmentKt$TopAppBar$1(zBooleanValue, function0), composerStartRestartGroup, 54), null, null, false, false, null, Color.m6701boximpl(TopAppBar_3IgeMak$lambda$6(SingleValueAnimation.m4805animateColorAsStateeuL9pac(jM21371getBg0d7_KjU, AnimationSpecKt.tween$default(0, 0, null, 7, null), "education_home_header_bg_color", null, composerStartRestartGroup, 432, 8))), 0L, null, composerStartRestartGroup, 390, 0, 1784);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EducationHomeFragmentKt.TopAppBar_3IgeMak$lambda$7(str, j, z, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Header-1wkBAMs, reason: not valid java name */
    public static final void m25361Header1wkBAMs(final String str, final long j, final long j2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2018549744);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2018549744, i2, -1, "com.robinhood.shared.education.ui.home.Header (EducationHomeFragment.kt:297)");
            }
            float fM7995constructorimpl = isSmallScreen((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())) ? C2002Dp.m7995constructorimpl(115) : C2002Dp.m7995constructorimpl(150);
            Alignment bottomStart = Alignment.INSTANCE.getBottomStart();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), fM7995constructorimpl), j2, null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(bottomStart, false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 0.8f), ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), C2002Dp.m7995constructorimpl(16), 2, null), Color.m6701boximpl(j), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getBookCoverNibSmall(), composer2, (i2 & 14) | ((i2 << 3) & 896), 0, 8120);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EducationHomeFragmentKt.Header_1wkBAMs$lambda$9(str, j, j2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final SnapshotState4<Color> headerForegroundColor(final EducationHomeViewState educationHomeViewState, Composer composer, int i) {
        composer.startReplaceGroup(-183031103);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-183031103, i, -1, "com.robinhood.shared.education.ui.home.headerForegroundColor (EducationHomeFragment.kt:327)");
        }
        final long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(educationHomeViewState) | composer.changed(jM21425getFg0d7_KjU);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<Color>() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt$headerForegroundColor$1$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Color invoke() {
                    return Color.m6701boximpl(m25366invoke0d7_KjU());
                }

                /* renamed from: invoke-0d7_KjU, reason: not valid java name */
                public final long m25366invoke0d7_KjU() {
                    if (educationHomeViewState.getForegroundColor() != null) {
                        return Color2.Color(educationHomeViewState.getForegroundColor().intValue());
                    }
                    return jM21425getFg0d7_KjU;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        SnapshotState4<Color> snapshotState4DerivedStateOf = SnapshotStateKt.derivedStateOf((Function0) objRememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snapshotState4DerivedStateOf;
    }

    private static final SnapshotState4<Color> headerBackgroundColor(final EducationHomeViewState educationHomeViewState, Composer composer, int i) {
        composer.startReplaceGroup(-724373002);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-724373002, i, -1, "com.robinhood.shared.education.ui.home.headerBackgroundColor (EducationHomeFragment.kt:341)");
        }
        final long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(educationHomeViewState) | composer.changed(jM21371getBg0d7_KjU);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<Color>() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt$headerBackgroundColor$1$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Color invoke() {
                    return Color.m6701boximpl(m25365invoke0d7_KjU());
                }

                /* renamed from: invoke-0d7_KjU, reason: not valid java name */
                public final long m25365invoke0d7_KjU() {
                    if (educationHomeViewState.getBackgroundColor() != null) {
                        return Color2.Color(educationHomeViewState.getBackgroundColor().intValue());
                    }
                    return jM21371getBg0d7_KjU;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        SnapshotState4<Color> snapshotState4DerivedStateOf = SnapshotStateKt.derivedStateOf((Function0) objRememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snapshotState4DerivedStateOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EducationSeriesSection(final EducationSeries educationSeries, final Function1<? super EducationLessonPreview, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1554835921);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(educationSeries) ? 4 : 2) | i;
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
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1554835921, i3, -1, "com.robinhood.shared.education.ui.home.EducationSeriesSection (EducationHomeFragment.kt:359)");
            }
            SeriesTitle(educationSeries.getTitle(), composerStartRestartGroup, 0);
            String subtitle = educationSeries.getSubtitle();
            if (subtitle != null && !StringsKt.isBlank(subtitle)) {
                composerStartRestartGroup.startReplaceGroup(1105651787);
                SeriesSubtitle(subtitle, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1105697605);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(12)), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            EducationSeriesLessonsCarousel5.EducationSeriesLessonsCarousel(extensions2.toImmutableList(educationSeries.getLessons()), false, modifier3, function1, composerStartRestartGroup, (i3 & 896) | 48 | ((i3 << 6) & 7168), 0);
            SeriesDivider(composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EducationHomeFragmentKt.EducationSeriesSection$lambda$12(educationSeries, function1, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SeriesTitle(final String str, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1345937238);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1345937238, i2, -1, "com.robinhood.shared.education.ui.home.SeriesTitle (EducationHomeFragment.kt:378)");
            }
            BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5145paddingqDBjuR0(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), C2002Dp.m7995constructorimpl(4)), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getDisplayCapsuleSmall(), composerStartRestartGroup, i2 & 14, 0, 8124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EducationHomeFragmentKt.SeriesTitle$lambda$13(str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SeriesSubtitle(final String str, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(905703360);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(905703360, i2, -1, "com.robinhood.shared.education.ui.home.SeriesSubtitle (EducationHomeFragment.kt:394)");
            }
            BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), C2002Dp.m7995constructorimpl(16), 2, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextM(), composerStartRestartGroup, i2 & 14, 0, 8124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EducationHomeFragmentKt.SeriesSubtitle$lambda$14(str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SeriesDivider(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1265682904);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1265682904, i, -1, "com.robinhood.shared.education.ui.home.SeriesDivider (EducationHomeFragment.kt:408)");
            }
            Divider2.m5581DivideroMI9zvI(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 2, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), C2002Dp.m7995constructorimpl(1), 0.0f, composerStartRestartGroup, 384, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EducationHomeFragmentKt.SeriesDivider$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ErrorScreen(final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(723096102);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(723096102, i2, -1, "com.robinhood.shared.education.ui.home.ErrorScreen (EducationHomeFragment.kt:420)");
            }
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5625Scaffold27mzLpw(null, null, ComposableLambda3.rememberComposableLambda(1747771115, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt.ErrorScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1747771115, i3, -1, "com.robinhood.shared.education.ui.home.ErrorScreen.<anonymous> (EducationHomeFragment.kt:423)");
                    }
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.BACK, null, new Component(Component.ComponentType.BACK_BUTTON, null, null, 6, null), null, 43, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                    Function2<Composer, Integer, Unit> function2M25353getLambda$1928994216$feature_education_externalDebug = ComposableSingletons$EducationHomeFragmentKt.INSTANCE.m25353getLambda$1928994216$feature_education_externalDebug();
                    final Function0<Unit> function03 = function0;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M25353getLambda$1928994216$feature_education_externalDebug, modifierAutoLogEvents$default, ComposableLambda3.rememberComposableLambda(-1642414164, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt.ErrorScreen.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i4) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i4 & 6) == 0) {
                                i4 |= (i4 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i4 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1642414164, i4, -1, "com.robinhood.shared.education.ui.home.ErrorScreen.<anonymous>.<anonymous> (EducationHomeFragment.kt:425)");
                            }
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function03, composer4, (BentoAppBarScope.$stable << 12) | ((i4 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2040);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, ComposableLambda3.rememberComposableLambda(1240883940, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt.ErrorScreen.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i3 & 6) == 0) {
                        i3 |= composer3.changed(paddingValues) ? 4 : 2;
                    }
                    if ((i3 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1240883940, i3, -1, "com.robinhood.shared.education.ui.home.ErrorScreen.<anonymous> (EducationHomeFragment.kt:437)");
                    }
                    ErrorScreenComposable.ErrorScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), function02, 0, null, null, null, null, false, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 384, 12582912, 98299);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.education.ui.home.EducationHomeFragmentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EducationHomeFragmentKt.ErrorScreen$lambda$16(function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean isSmallScreen(Configuration configuration) {
        return configuration.screenHeightDp < 700;
    }
}
