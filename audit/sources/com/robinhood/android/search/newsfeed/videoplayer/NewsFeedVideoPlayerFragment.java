package com.robinhood.android.search.newsfeed.videoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.view.FragmentContainerLayout;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.newsfeed.videoplayer.NewsFeedLandscapeVideoPlayerFragment;
import com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment;
import com.robinhood.android.search.newsfeed.videoplayer.overlay.VideoPlayerTheme;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import org.json.JSONException;

/* compiled from: NewsFeedVideoPlayerFragment.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 @2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001@B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020%H\u0016J\b\u0010)\u001a\u00020%H\u0016J\u001a\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010-\u001a\u00020%H\u0016J\b\u0010.\u001a\u00020%H\u0016J\u0010\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020'H\u0016J\b\u00101\u001a\u00020\tH\u0017J\b\u00106\u001a\u00020%H\u0016J\u0010\u00107\u001a\u00020%2\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u00020%2\u0006\u00108\u001a\u000209H\u0016J\u0017\u0010;\u001a\u0004\u0018\u00010\u00172\u0006\u0010<\u001a\u00020\u0016H\u0016¢\u0006\u0002\u0010=J\u0018\u0010>\u001a\u00020%2\u0006\u0010<\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u0017H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R7\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015j\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017`\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR/\u0010\u001e\u001a\u0004\u0018\u00010\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001c\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u00102\u001a\u000203X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoPlayerFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedLandscapeVideoPlayerFragment$Callbacks;", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedPortraitVideoPlayerFragment$Callbacks;", "<init>", "()V", "orientationEventListener", "Landroid/view/OrientationEventListener;", "isLandscape", "", "duxo", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoPlayerDuxo;", "getDuxo", "()Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoPlayerDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "portraitVideoPlayerFragment", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedPortraitVideoPlayerFragment;", "landscapeVideoPlayerFragment", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedLandscapeVideoPlayerFragment;", "videoContentIdToPlaybackPositionMap", "Ljava/util/HashMap;", "Ljava/util/UUID;", "", "Lkotlin/collections/HashMap;", "getVideoContentIdToPlaybackPositionMap", "()Ljava/util/HashMap;", "videoContentIdToPlaybackPositionMap$delegate", "Lkotlin/properties/ReadWriteProperty;", "<set-?>", "savedVideoContentId", "getSavedVideoContentId", "()Ljava/util/UUID;", "setSavedVideoContentId", "(Ljava/util/UUID;)V", "savedVideoContentId$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "onViewCreated", "view", "Landroid/view/View;", "onResume", "onPause", "onSaveInstanceState", "outState", "onBackPressed", "screenName", "", "getScreenName", "()Ljava/lang/String;", "onRetryClick", "onReplayClick", "video", "Lcom/robinhood/android/search/newsfeed/videoplayer/Video;", "onVideoEnded", "getSavedPlaybackPosition", "videoId", "(Ljava/util/UUID;)Ljava/lang/Long;", "setSavedPlaybackPosition", "position", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NewsFeedVideoPlayerFragment extends BaseFragment implements NewsFeedLandscapeVideoPlayerFragment.Callbacks, NewsFeedPortraitVideoPlayerFragment.Callbacks {
    private static final String SCREEN_NAME = "BROWSE_NEWSFEED_THEATRE";

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private boolean isLandscape;
    private NewsFeedLandscapeVideoPlayerFragment landscapeVideoPlayerFragment;
    private OrientationEventListener orientationEventListener;
    private NewsFeedPortraitVideoPlayerFragment portraitVideoPlayerFragment;

    /* renamed from: savedVideoContentId$delegate, reason: from kotlin metadata */
    private final Interfaces3 savedVideoContentId;
    private final String screenName;

    /* renamed from: videoContentIdToPlaybackPositionMap$delegate, reason: from kotlin metadata */
    private final Interfaces3 videoContentIdToPlaybackPositionMap;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NewsFeedVideoPlayerFragment.class, "videoContentIdToPlaybackPositionMap", "getVideoContentIdToPlaybackPositionMap()Ljava/util/HashMap;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(NewsFeedVideoPlayerFragment.class, "savedVideoContentId", "getSavedVideoContentId()Ljava/util/UUID;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public NewsFeedVideoPlayerFragment() {
        super(C27909R.layout.fragment_news_feed_video_player);
        this.duxo = OldDuxos.oldDuxo(this, NewsFeedVideoPlayerDuxo.class);
        Interfaces interfacesSavedSerializable = BindSavedState2.savedSerializable(this, new HashMap());
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.videoContentIdToPlaybackPositionMap = (Interfaces3) interfacesSavedSerializable.provideDelegate(this, kPropertyArr[0]);
        this.savedVideoContentId = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, kPropertyArr[1]);
        this.screenName = SCREEN_NAME;
    }

    private final NewsFeedVideoPlayerDuxo getDuxo() {
        return (NewsFeedVideoPlayerDuxo) this.duxo.getValue();
    }

    private final HashMap<UUID, Long> getVideoContentIdToPlaybackPositionMap() {
        return (HashMap) this.videoContentIdToPlaybackPositionMap.getValue(this, $$delegatedProperties[0]);
    }

    private final UUID getSavedVideoContentId() {
        return (UUID) this.savedVideoContentId.getValue(this, $$delegatedProperties[1]);
    }

    private final void setSavedVideoContentId(UUID uuid) {
        this.savedVideoContentId.setValue(this, $$delegatedProperties[1], uuid);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(getScarletManager(), VideoPlayerTheme.INSTANCE, null, 2, null);
        this.orientationEventListener = new C280811(requireContext());
    }

    /* compiled from: NewsFeedVideoPlayerFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0002\u0000\u0007\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0012"}, m3636d2 = {"com/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoPlayerFragment$onCreate$1", "Landroid/view/OrientationEventListener;", "skip", "", "unlockOrientation", "isAccelerometerRotationSettingEnabled", "rotationSettingObserver", "com/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoPlayerFragment$onCreate$1$rotationSettingObserver$1", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoPlayerFragment$onCreate$1$rotationSettingObserver$1;", "onOrientationChanged", "", "orientation", "", "enable", AnalyticsStrings.BUTTON_FRIDAY_TRADING_SETTING_DISABLE, "syncRotationSetting", "isLandscapeOrientation", "isPortraitOrientation", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoPlayerFragment$onCreate$1 */
    public static final class C280811 extends OrientationEventListener {
        private boolean isAccelerometerRotationSettingEnabled;
        private final NewsFeedVideoPlayerFragment2 rotationSettingObserver;
        private boolean skip;
        private boolean unlockOrientation;

        private final boolean isLandscapeOrientation(int orientation) {
            if (80 > orientation || orientation >= 101) {
                return 260 <= orientation && orientation < 281;
            }
            return true;
        }

        private final boolean isPortraitOrientation(int orientation) {
            if (350 > orientation || orientation >= 360) {
                return orientation >= 0 && orientation < 11;
            }
            return true;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoPlayerFragment$onCreate$1$rotationSettingObserver$1] */
        C280811(Context context) {
            super(context);
            this.skip = true;
            this.rotationSettingObserver = new ContentObserver() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoPlayerFragment$onCreate$1$rotationSettingObserver$1
                {
                    super(null);
                }

                @Override // android.database.ContentObserver
                public void onChange(boolean selfChange) {
                    this.this$0.syncRotationSetting();
                }
            };
            syncRotationSetting();
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int orientation) {
            if (this.skip) {
                this.skip = false;
                return;
            }
            if (this.isAccelerometerRotationSettingEnabled) {
                FragmentActivity fragmentActivityRequireActivity = NewsFeedVideoPlayerFragment.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                if (fragmentActivityRequireActivity.getRequestedOrientation() == 11) {
                    if (isLandscapeOrientation(orientation)) {
                        this.unlockOrientation = true;
                    }
                    if (this.unlockOrientation && isPortraitOrientation(orientation)) {
                        fragmentActivityRequireActivity.setRequestedOrientation(-1);
                        return;
                    }
                    return;
                }
                if (fragmentActivityRequireActivity.getRequestedOrientation() == 12) {
                    if (isPortraitOrientation(orientation)) {
                        this.unlockOrientation = true;
                    }
                    if (this.unlockOrientation && isLandscapeOrientation(orientation)) {
                        fragmentActivityRequireActivity.setRequestedOrientation(-1);
                    }
                }
            }
        }

        @Override // android.view.OrientationEventListener
        public void enable() {
            super.enable();
            try {
                NewsFeedVideoPlayerFragment.this.requireContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), false, this.rotationSettingObserver);
            } catch (SecurityException unused) {
            }
        }

        @Override // android.view.OrientationEventListener
        public void disable() {
            super.disable();
            NewsFeedVideoPlayerFragment.this.requireContext().getContentResolver().unregisterContentObserver(this.rotationSettingObserver);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void syncRotationSetting() {
            try {
                boolean z = true;
                if (Settings.System.getInt(NewsFeedVideoPlayerFragment.this.requireContext().getContentResolver(), "accelerometer_rotation") != 1) {
                    z = false;
                }
                this.isAccelerometerRotationSettingEnabled = z;
            } catch (Settings.SettingNotFoundException unused) {
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        requireBaseActivity().overrideStatusBarStyle(false);
        super.onStart();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        requireBaseActivity().resetStatusBarStyleOverride();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        boolean z = view.findViewById(C27909R.id.news_feed_landscape_video_player_view) != null;
        this.isLandscape = z;
        if (z) {
            Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(C27909R.id.news_feed_landscape_video_player_view);
            Intrinsics.checkNotNull(fragmentFindFragmentById, "null cannot be cast to non-null type com.robinhood.android.search.newsfeed.videoplayer.NewsFeedLandscapeVideoPlayerFragment");
            this.landscapeVideoPlayerFragment = (NewsFeedLandscapeVideoPlayerFragment) fragmentFindFragmentById;
        } else {
            Fragment fragmentFindFragmentById2 = getChildFragmentManager().findFragmentById(C27909R.id.news_feed_portrait_video_player_view);
            Intrinsics.checkNotNull(fragmentFindFragmentById2, "null cannot be cast to non-null type com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment");
            this.portraitVideoPlayerFragment = (NewsFeedPortraitVideoPlayerFragment) fragmentFindFragmentById2;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        fragmentActivityRequireActivity.setVolumeControlStream(3);
        if (this.isLandscape) {
            view.setSystemUiVisibility(4614);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.robinhood.android.common.ui.view.FragmentContainerLayout.LayoutParams");
            ((FragmentContainerLayout.LayoutParams) layoutParams).setUnderneathToolbar(true);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        OrientationEventListener orientationEventListener = this.orientationEventListener;
        if (orientationEventListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orientationEventListener");
            orientationEventListener = null;
        }
        orientationEventListener.enable();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoPlayerFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedVideoPlayerFragment.onResume$lambda$1(this.f$0, (NewsFeedVideoPlayerViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(NewsFeedVideoPlayerFragment newsFeedVideoPlayerFragment, NewsFeedVideoPlayerViewState viewState) throws JSONException {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        NewsFeedPortraitVideoPlayerFragment newsFeedPortraitVideoPlayerFragment = newsFeedVideoPlayerFragment.portraitVideoPlayerFragment;
        if (newsFeedPortraitVideoPlayerFragment != null) {
            newsFeedPortraitVideoPlayerFragment.bind(viewState);
        }
        NewsFeedLandscapeVideoPlayerFragment newsFeedLandscapeVideoPlayerFragment = newsFeedVideoPlayerFragment.landscapeVideoPlayerFragment;
        if (newsFeedLandscapeVideoPlayerFragment != null) {
            newsFeedLandscapeVideoPlayerFragment.bind(viewState);
        }
        UUID savedVideoContentId = newsFeedVideoPlayerFragment.getSavedVideoContentId();
        newsFeedVideoPlayerFragment.setSavedVideoContentId(null);
        if (savedVideoContentId != null) {
            Iterator<Video> it = viewState.getVideos().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.areEqual(it.next().getId(), savedVideoContentId)) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                Video video = viewState.getVideos().get(i);
                NewsFeedPortraitVideoPlayerFragment newsFeedPortraitVideoPlayerFragment2 = newsFeedVideoPlayerFragment.portraitVideoPlayerFragment;
                if (newsFeedPortraitVideoPlayerFragment2 != null) {
                    newsFeedPortraitVideoPlayerFragment2.scrollToPosition(i, video);
                }
                NewsFeedLandscapeVideoPlayerFragment newsFeedLandscapeVideoPlayerFragment2 = newsFeedVideoPlayerFragment.landscapeVideoPlayerFragment;
                if (newsFeedLandscapeVideoPlayerFragment2 != null) {
                    Long l = newsFeedVideoPlayerFragment.getVideoContentIdToPlaybackPositionMap().get(savedVideoContentId);
                    newsFeedLandscapeVideoPlayerFragment2.seekTo(i, l != null ? l.longValue() : 0L, video);
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        OrientationEventListener orientationEventListener = this.orientationEventListener;
        if (orientationEventListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orientationEventListener");
            orientationEventListener = null;
        }
        orientationEventListener.disable();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        UUID currentVideoId;
        Intrinsics.checkNotNullParameter(outState, "outState");
        UUID currentVideoId2 = null;
        if (this.isLandscape) {
            NewsFeedLandscapeVideoPlayerFragment newsFeedLandscapeVideoPlayerFragment = this.landscapeVideoPlayerFragment;
            if (newsFeedLandscapeVideoPlayerFragment != null && (currentVideoId = newsFeedLandscapeVideoPlayerFragment.getCurrentVideoId()) != null) {
                HashMap<UUID, Long> videoContentIdToPlaybackPositionMap = getVideoContentIdToPlaybackPositionMap();
                NewsFeedLandscapeVideoPlayerFragment newsFeedLandscapeVideoPlayerFragment2 = this.landscapeVideoPlayerFragment;
                Intrinsics.checkNotNull(newsFeedLandscapeVideoPlayerFragment2);
                Long currentPlayerPosition = newsFeedLandscapeVideoPlayerFragment2.getCurrentPlayerPosition();
                Intrinsics.checkNotNull(currentPlayerPosition);
                videoContentIdToPlaybackPositionMap.put(currentVideoId, currentPlayerPosition);
                currentVideoId2 = currentVideoId;
            }
        } else {
            NewsFeedPortraitVideoPlayerFragment newsFeedPortraitVideoPlayerFragment = this.portraitVideoPlayerFragment;
            if (newsFeedPortraitVideoPlayerFragment != null) {
                currentVideoId2 = newsFeedPortraitVideoPlayerFragment.getCurrentVideoId();
            }
        }
        setSavedVideoContentId(currentVideoId2);
        super.onSaveInstanceState(outState);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    @SuppressLint({"SourceLockedOrientationActivity"})
    public boolean onBackPressed() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        if (this.isLandscape) {
            fragmentActivityRequireActivity.setRequestedOrientation(12);
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.search.newsfeed.videoplayer.NewsFeedLandscapeVideoPlayerFragment.Callbacks, com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment.Callbacks
    public void onRetryClick() {
        getDuxo().refreshVideos();
    }

    @Override // com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment.Callbacks
    public void onReplayClick(Video video) {
        Intrinsics.checkNotNullParameter(video, "video");
        getDuxo().setVideoEnded(video.getId(), false);
    }

    @Override // com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment.Callbacks
    public void onVideoEnded(Video video) {
        Intrinsics.checkNotNullParameter(video, "video");
        getDuxo().setVideoEnded(video.getId(), true);
    }

    @Override // com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment.Callbacks
    public Long getSavedPlaybackPosition(UUID videoId) {
        Intrinsics.checkNotNullParameter(videoId, "videoId");
        return getVideoContentIdToPlaybackPositionMap().get(videoId);
    }

    @Override // com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment.Callbacks
    public void setSavedPlaybackPosition(UUID videoId, long position) {
        Intrinsics.checkNotNullParameter(videoId, "videoId");
        getVideoContentIdToPlaybackPositionMap().put(videoId, Long.valueOf(position));
    }

    /* compiled from: NewsFeedVideoPlayerFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoPlayerFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$NewsFeedVideoPlayer;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoPlayerFragment;", "<init>", "()V", "SCREEN_NAME", "", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.NewsFeedVideoPlayer>, FragmentWithArgsCompanion<NewsFeedVideoPlayerFragment, LegacyFragmentKey.NewsFeedVideoPlayer> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.NewsFeedVideoPlayer getArgs(NewsFeedVideoPlayerFragment newsFeedVideoPlayerFragment) {
            return (LegacyFragmentKey.NewsFeedVideoPlayer) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, newsFeedVideoPlayerFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public NewsFeedVideoPlayerFragment newInstance(LegacyFragmentKey.NewsFeedVideoPlayer newsFeedVideoPlayer) {
            return (NewsFeedVideoPlayerFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, newsFeedVideoPlayer);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(NewsFeedVideoPlayerFragment newsFeedVideoPlayerFragment, LegacyFragmentKey.NewsFeedVideoPlayer newsFeedVideoPlayer) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, newsFeedVideoPlayerFragment, newsFeedVideoPlayer);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.NewsFeedVideoPlayer key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return newInstance((Parcelable) key);
        }
    }
}
