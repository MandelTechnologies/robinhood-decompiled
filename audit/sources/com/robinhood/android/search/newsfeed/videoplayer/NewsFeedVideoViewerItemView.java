package com.robinhood.android.search.newsfeed.videoplayer;

import android.content.Context;
import android.content.res.Resources;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.p014ui.PlayerView;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.newsfeed.extensions.Contents;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.android.newsfeed.p200ui.NewsFeedRelatedInstrumentsView;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.video.VideoPlayerContainer;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.time.android.format.DurationFormatter;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NewsFeedVideoViewerItemView.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 ,2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002+,B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003H\u0016J\u0006\u0010\"\u001a\u00020 J\u000e\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003H\u0002J\u0010\u0010'\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003H\u0002J\u0010\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020*H\u0002R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoViewerItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/search/newsfeed/videoplayer/Video;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "video", "getVideo", "()Lcom/robinhood/android/search/newsfeed/videoplayer/Video;", "callbacks", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoViewerItemView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoViewerItemView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoViewerItemView$Callbacks;)V", "titleTxt", "Landroid/widget/TextView;", "relatedInstrumentsView", "Lcom/robinhood/android/newsfeed/ui/NewsFeedRelatedInstrumentsView;", "sourceTxt", "timeTxt", "videoPlayerContainer", "Lcom/robinhood/android/video/VideoPlayerContainer;", "replayView", "Landroid/view/View;", "darkOverlay", "bind", "", "state", "unbindPlayerView", "bindPlayerView", "playerView", "Landroidx/media3/ui/PlayerView;", "bindSourceAndTimeText", "bindRelatedInstruments", "animateDarkOverlay", "show", "", "Callbacks", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NewsFeedVideoViewerItemView extends ConstraintLayout implements Bindable<Video> {
    private Callbacks callbacks;
    private final View darkOverlay;
    private final NewsFeedRelatedInstrumentsView relatedInstrumentsView;
    private final View replayView;
    private final TextView sourceTxt;
    private final TextView timeTxt;
    private final TextView titleTxt;
    private Video video;
    private final VideoPlayerContainer videoPlayerContainer;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: NewsFeedVideoViewerItemView.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoViewerItemView$Callbacks;", "", "onRelatedInstrumentClick", "", "video", "Lcom/robinhood/android/search/newsfeed/videoplayer/Video;", "instrument", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "onReplayClick", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onRelatedInstrumentClick(Video video, RelatedInstrument instrument);

        void onReplayClick(Video video);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsFeedVideoViewerItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        ViewGroups.inflate(this, C27909R.layout.merge_video_viewer_item, true);
        ViewsKt.eventData$default(this, false, new Function0() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoViewerItemView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedVideoViewerItemView._init_$lambda$1(this.f$0);
            }
        }, 1, null);
        View viewFindViewById = findViewById(C27909R.id.news_feed_video_item_title_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.titleTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C27909R.id.news_feed_video_item_related_instruments);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.relatedInstrumentsView = (NewsFeedRelatedInstrumentsView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C27909R.id.news_feed_video_item_source_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.sourceTxt = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C27909R.id.news_feed_video_item_time_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.timeTxt = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(C27909R.id.news_feed_video_item_player_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        VideoPlayerContainer videoPlayerContainer = (VideoPlayerContainer) viewFindViewById5;
        this.videoPlayerContainer = videoPlayerContainer;
        View viewFindViewById6 = findViewById(C27909R.id.news_feed_video_item_replay_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.replayView = viewFindViewById6;
        View viewFindViewById7 = findViewById(C27909R.id.news_feed_video_item_dark_overlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.darkOverlay = viewFindViewById7;
        OnClickListeners.onClick(viewFindViewById6, new Function0() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoViewerItemView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedVideoViewerItemView._init_$lambda$2(this.f$0);
            }
        });
        videoPlayerContainer.setEnablePlayIcon(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor _init_$lambda$1(NewsFeedVideoViewerItemView newsFeedVideoViewerItemView) {
        Content.Video contentVideo;
        Video video = newsFeedVideoViewerItemView.video;
        if (video == null || (contentVideo = video.toContentVideo()) == null) {
            return null;
        }
        return new UserInteractionEventDescriptor(null, null, null, Contents.getEventContext(contentVideo), Contents.getEventComponent(contentVideo), null, 39, null);
    }

    public final Video getVideo() {
        return this.video;
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(NewsFeedVideoViewerItemView newsFeedVideoViewerItemView) {
        Callbacks callbacks = newsFeedVideoViewerItemView.callbacks;
        if (callbacks != null) {
            Video video = newsFeedVideoViewerItemView.video;
            Intrinsics.checkNotNull(video);
            callbacks.onReplayClick(video);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(Video state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.video = state;
        this.titleTxt.setText(state.getTitle());
        bindRelatedInstruments(state);
        bindSourceAndTimeText(state);
        this.videoPlayerContainer.setPreviewImageUrl(state.getPreviewImageUrl());
        this.videoPlayerContainer.setEnableBufferingView(!state.getShowReplay());
        this.replayView.setVisibility(state.getShowReplay() ? 0 : 8);
        this.darkOverlay.setVisibility(this.videoPlayerContainer.getPlayerView() == null ? 0 : 8);
    }

    public final void unbindPlayerView() {
        this.videoPlayerContainer.unbindPlayerView();
        animateDarkOverlay(true);
    }

    public final void bindPlayerView(PlayerView playerView) {
        Intrinsics.checkNotNullParameter(playerView, "playerView");
        this.videoPlayerContainer.bindPlayerView(playerView);
        animateDarkOverlay(false);
    }

    private final void bindSourceAndTimeText(Video state) {
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String narrow$default = DurationFormatter.formatNarrow$default(resources, Durations.since(state.getPublishedAt()), false, 4, null);
        this.sourceTxt.setText(state.getSource());
        this.timeTxt.setText(narrow$default);
    }

    private final void bindRelatedInstruments(final Video state) {
        NewsFeedRelatedInstrumentsView.bind$default(this.relatedInstrumentsView, state.getFirstInstrument(), state.getSecondInstrument(), (String) null, 4, (Object) null);
        this.relatedInstrumentsView.setOnRelatedInstrumentClick(new Function1() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoViewerItemView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedVideoViewerItemView.bindRelatedInstruments$lambda$3(this.f$0, state, (RelatedInstrument) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindRelatedInstruments$lambda$3(NewsFeedVideoViewerItemView newsFeedVideoViewerItemView, Video video, RelatedInstrument relatedInstrument) {
        Intrinsics.checkNotNullParameter(relatedInstrument, "relatedInstrument");
        Callbacks callbacks = newsFeedVideoViewerItemView.callbacks;
        if (callbacks != null) {
            callbacks.onRelatedInstrumentClick(video, relatedInstrument);
        }
        return Unit.INSTANCE;
    }

    private final void animateDarkOverlay(boolean show) {
        Fade fade = new Fade();
        fade.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoViewerItemView$animateDarkOverlay$$inlined$beginDelayedTransition$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                IdlingResourceCounters2.increment(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        fade.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoViewerItemView$animateDarkOverlay$$inlined$beginDelayedTransition$2
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                IdlingResourceCounters2.decrement(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        fade.addTarget(this.darkOverlay);
        TransitionManager.beginDelayedTransition(this, fade);
        this.darkOverlay.setVisibility(show ? 0 : 8);
    }

    /* compiled from: NewsFeedVideoViewerItemView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoViewerItemView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoViewerItemView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<NewsFeedVideoViewerItemView> {
        private final /* synthetic */ Inflater<NewsFeedVideoViewerItemView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public NewsFeedVideoViewerItemView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (NewsFeedVideoViewerItemView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C27909R.layout.include_video_viewer_item);
        }
    }
}
