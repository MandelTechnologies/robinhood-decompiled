package com.robinhood.android.newsfeed.p200ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.lib.newsfeed.C20334R;
import com.robinhood.android.lib.newsfeed.databinding.MergeNewsFeedEducationCarouselViewBinding;
import com.robinhood.android.newsfeed.model.Element;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.NewsFeedItem;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: NewsFeedEducationCarouselView.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u001b\u001cB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0003H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0003H\u0002R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/ui/NewsFeedEducationCarouselView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/newsfeed/model/Element$EducationCarousel;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/lib/newsfeed/databinding/MergeNewsFeedEducationCarouselViewBinding;", "getBinding", "()Lcom/robinhood/android/lib/newsfeed/databinding/MergeNewsFeedEducationCarouselViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/newsfeed/ui/NewsFeedEducationCarouselView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/newsfeed/ui/NewsFeedEducationCarouselView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/newsfeed/ui/NewsFeedEducationCarouselView$Callbacks;)V", "onAttachedToWindow", "", "bind", "state", "bindEventData", "Callbacks", "Companion", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class NewsFeedEducationCarouselView extends ConstraintLayout implements Bindable<Element.EducationCarousel> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private Callbacks callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NewsFeedEducationCarouselView.class, "binding", "getBinding()Lcom/robinhood/android/lib/newsfeed/databinding/MergeNewsFeedEducationCarouselViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: NewsFeedEducationCarouselView.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/ui/NewsFeedEducationCarouselView$Callbacks;", "", "onEducationLessonsAppear", "", "lessons", "", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "onEducationHomeEntryPointClick", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onEducationHomeEntryPointClick();

        void onEducationLessonsAppear(List<EducationLessonPreview> lessons);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsFeedEducationCarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C20334R.layout.merge_news_feed_education_carousel_view, true);
        this.binding = ViewBinding5.viewBinding(this, NewsFeedEducationCarouselView2.INSTANCE);
        ViewsKt.setLoggingConfig(this, new AutoLoggingConfig(false, false, 2, null));
        RdsTextButton newsFeedEducationEntryPointBtn = getBinding().newsFeedEducationEntryPointBtn;
        Intrinsics.checkNotNullExpressionValue(newsFeedEducationEntryPointBtn, "newsFeedEducationEntryPointBtn");
        ViewsKt.setLoggingConfig(newsFeedEducationEntryPointBtn, new AutoLoggingConfig(false, false));
    }

    private final MergeNewsFeedEducationCarouselViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeNewsFeedEducationCarouselViewBinding) value;
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        RdsTextButton newsFeedEducationEntryPointBtn = getBinding().newsFeedEducationEntryPointBtn;
        Intrinsics.checkNotNullExpressionValue(newsFeedEducationEntryPointBtn, "newsFeedEducationEntryPointBtn");
        OnClickListeners.onClick(newsFeedEducationEntryPointBtn, new Function0() { // from class: com.robinhood.android.newsfeed.ui.NewsFeedEducationCarouselView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedEducationCarouselView.onAttachedToWindow$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$0(NewsFeedEducationCarouselView newsFeedEducationCarouselView) {
        Callbacks callbacks = newsFeedEducationCarouselView.callbacks;
        if (callbacks != null) {
            callbacks.onEducationHomeEntryPointClick();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(Element.EducationCarousel state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getBinding().newsFeedEducationCarouselTitleTxt.setText(state.getTitle());
        getBinding().seriesCarouselView.bind(state.getLessons(), true);
        bindEventData(state);
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.onEducationLessonsAppear(state.getLessons());
        }
    }

    private final void bindEventData(final Element.EducationCarousel state) {
        ViewsKt.eventData$default(this, false, new Function0() { // from class: com.robinhood.android.newsfeed.ui.NewsFeedEducationCarouselView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedEducationCarouselView.bindEventData$lambda$1(state);
            }
        }, 1, null);
        RdsTextButton newsFeedEducationEntryPointBtn = getBinding().newsFeedEducationEntryPointBtn;
        Intrinsics.checkNotNullExpressionValue(newsFeedEducationEntryPointBtn, "newsFeedEducationEntryPointBtn");
        ViewsKt.eventData$default(newsFeedEducationEntryPointBtn, false, new Function0() { // from class: com.robinhood.android.newsfeed.ui.NewsFeedEducationCarouselView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedEducationCarouselView.bindEventData$lambda$2(state);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bindEventData$lambda$1(Element.EducationCarousel educationCarousel) {
        String title = educationCarousel.getTitle();
        Component component = new Component(Component.ComponentType.LEARNING_ENTRY_POINT, educationCarousel.getTitle(), null, 4, null);
        String str = null;
        NewsFeedItem newsFeedItem = new NewsFeedItem(null, NewsFeedItem.ContentType.LEARNING_ENTRY_POINT, null, null, educationCarousel.getLessons().size(), null, 45, null);
        return new UserInteractionEventDescriptor(title, null, null, new com.robinhood.rosetta.eventlogging.Context(educationCarousel.getRank() + 1, 0, 0, null, null, str, null, null, 0, null, null, null, null, null, null, null, newsFeedItem, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65538, -1, -1, -1, -1, -1, 16383, null), component, null, 38, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bindEventData$lambda$2(Element.EducationCarousel educationCarousel) {
        UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_EDUCATION_HOME;
        Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
        String str = null;
        NewsFeedItem newsFeedItem = new NewsFeedItem(null, NewsFeedItem.ContentType.LEARNING_ENTRY_POINT, null, null, educationCarousel.getLessons().size(), null, 45, null);
        return new UserInteractionEventDescriptor(null, null, action, new com.robinhood.rosetta.eventlogging.Context(educationCarousel.getRank() + 1, 0, 0, null, null, str, null, null, 0, null, null, null, null, null, null, null, newsFeedItem, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65538, -1, -1, -1, -1, -1, 16383, null), component, null, 35, null);
    }

    /* compiled from: NewsFeedEducationCarouselView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/ui/NewsFeedEducationCarouselView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/newsfeed/ui/NewsFeedEducationCarouselView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<NewsFeedEducationCarouselView> {
        private final /* synthetic */ Inflater<NewsFeedEducationCarouselView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public NewsFeedEducationCarouselView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (NewsFeedEducationCarouselView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20334R.layout.include_news_feed_education_carousel_view);
        }
    }
}
