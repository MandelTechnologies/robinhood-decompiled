package com.robinhood.shared.education.p377ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.education.EducationLessonPreviews;
import com.robinhood.shared.lib.education.C39080R;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: EducationSeriesLessonsCarouselView.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\"\u001a\u00020\u0018J\r\u0010#\u001a\u00020 H\u0017¢\u0006\u0002\u0010$J\u0010\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\u0010H\u0002J\u0010\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020\u0010H\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR;\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006*"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/EducationSeriesLessonsCarouselView;", "Lcom/robinhood/compose/app/GenericComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "<set-?>", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "lessonsState", "getLessonsState", "()Lkotlinx/collections/immutable/ImmutableList;", "setLessonsState", "(Lkotlinx/collections/immutable/ImmutableList;)V", "lessonsState$delegate", "Landroidx/compose/runtime/MutableState;", "", "showNewLabelOnFirstLessonState", "getShowNewLabelOnFirstLessonState", "()Z", "setShowNewLabelOnFirstLessonState", "(Z)V", "showNewLabelOnFirstLessonState$delegate", "bind", "", "lessons", "showNewLabelOnFirstLesson", "Content", "(Landroidx/compose/runtime/Composer;I)V", "onLessonCardClick", "lessonPreview", "navigateToLesson", "lesson", "Companion", "lib-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EducationSeriesLessonsCarouselView extends Hammer_EducationSeriesLessonsCarouselView {

    /* renamed from: lessonsState$delegate, reason: from kotlin metadata */
    private final SnapshotState lessonsState;
    public Navigator navigator;

    /* renamed from: showNewLabelOnFirstLessonState$delegate, reason: from kotlin metadata */
    private final SnapshotState showNewLabelOnFirstLessonState;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$1(EducationSeriesLessonsCarouselView educationSeriesLessonsCarouselView, int i, Composer composer, int i2) {
        educationSeriesLessonsCarouselView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ EducationSeriesLessonsCarouselView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationSeriesLessonsCarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.lessonsState = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.showNewLabelOnFirstLessonState = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    private final ImmutableList<EducationLessonPreview> getLessonsState() {
        return (ImmutableList) this.lessonsState.getValue();
    }

    private final void setLessonsState(ImmutableList<EducationLessonPreview> immutableList) {
        this.lessonsState.setValue(immutableList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowNewLabelOnFirstLessonState() {
        return ((Boolean) this.showNewLabelOnFirstLessonState.getValue()).booleanValue();
    }

    private final void setShowNewLabelOnFirstLessonState(boolean z) {
        this.showNewLabelOnFirstLessonState.setValue(Boolean.valueOf(z));
    }

    public final void bind(ImmutableList<EducationLessonPreview> lessons, boolean showNewLabelOnFirstLesson) {
        Intrinsics.checkNotNullParameter(lessons, "lessons");
        setLessonsState(lessons);
        setShowNewLabelOnFirstLessonState(showNewLabelOnFirstLesson);
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1566017375);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1566017375, i2, -1, "com.robinhood.shared.education.ui.EducationSeriesLessonsCarouselView.Content (EducationSeriesLessonsCarouselView.kt:43)");
            }
            final ImmutableList<EducationLessonPreview> lessonsState = getLessonsState();
            if (lessonsState != null) {
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.BROWSE_NEWSFEED, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-80704729, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.ui.EducationSeriesLessonsCarouselView$Content$1$1
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
                            ComposerKt.traceEventStart(-80704729, i3, -1, "com.robinhood.shared.education.ui.EducationSeriesLessonsCarouselView.Content.<anonymous>.<anonymous> (EducationSeriesLessonsCarouselView.kt:46)");
                        }
                        ImmutableList<EducationLessonPreview> immutableList = lessonsState;
                        boolean showNewLabelOnFirstLessonState = this.getShowNewLabelOnFirstLessonState();
                        EducationSeriesLessonsCarouselView educationSeriesLessonsCarouselView = this;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer2.changedInstance(educationSeriesLessonsCarouselView);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new EducationSeriesLessonsCarouselView3(educationSeriesLessonsCarouselView);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        EducationSeriesLessonsCarousel5.EducationSeriesLessonsCarousel(immutableList, showNewLabelOnFirstLessonState, null, (Function1) ((KFunction) objRememberedValue), composer2, 0, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.education.ui.EducationSeriesLessonsCarouselView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EducationSeriesLessonsCarouselView.Content$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLessonCardClick(EducationLessonPreview lessonPreview) {
        navigateToLesson(lessonPreview);
    }

    private final void navigateToLesson(EducationLessonPreview lesson) {
        FragmentKey fragmentKeyOrNull = EducationLessonPreviews.toFragmentKeyOrNull(lesson, "browse");
        if (fragmentKeyOrNull != null) {
            Navigator navigator = getNavigator();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, context, fragmentKeyOrNull, false, false, false, null, false, null, false, false, null, null, 4084, null);
        }
    }

    /* compiled from: EducationSeriesLessonsCarouselView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/EducationSeriesLessonsCarouselView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/shared/education/ui/EducationSeriesLessonsCarouselView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<EducationSeriesLessonsCarouselView> {
        private final /* synthetic */ Inflater<EducationSeriesLessonsCarouselView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public EducationSeriesLessonsCarouselView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (EducationSeriesLessonsCarouselView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C39080R.layout.include_education_series_lessons_carousel_view);
        }
    }
}
