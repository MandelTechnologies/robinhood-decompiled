package com.robinhood.android.rhy.waitlist.p244ui;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCaller;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.rhy.contracts.RhyWaitlistSignUpConfirmationContract;
import com.robinhood.android.rhy.waitlist.C27560R;
import com.robinhood.android.rhy.waitlist.databinding.FragmentRhyWaitlistSignUpConfirmationBinding;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.random.Random;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;

/* compiled from: RhyWaitlistSignUpConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 02\u00020\u0001:\u0002/0B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u001eH\u0016J\b\u0010'\u001a\u00020\u001eH\u0016J\b\u0010(\u001a\u00020\u001eH\u0016J\b\u0010)\u001a\u00020\u0019H\u0016J\b\u0010*\u001a\u00020\u001eH\u0002J\b\u0010+\u001a\u00020\u001eH\u0002J\b\u0010,\u001a\u00020\u001eH\u0002J\b\u0010-\u001a\u00020\u001eH\u0002J\b\u0010.\u001a\u00020\u001eH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u001b\u0010\u001c¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/rhy/waitlist/ui/RhyWaitlistSignUpConfirmationFragment;", "Lcom/robinhood/android/rhy/waitlist/ui/RhyWaitlistFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "callbacks", "Lcom/robinhood/android/rhy/contracts/RhyWaitlistSignUpConfirmationContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/rhy/contracts/RhyWaitlistSignUpConfirmationContract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/rhy/waitlist/databinding/FragmentRhyWaitlistSignUpConfirmationBinding;", "getBinding", "()Lcom/robinhood/android/rhy/waitlist/databinding/FragmentRhyWaitlistSignUpConfirmationBinding;", "binding$delegate", "mediaPlayers", "", "Lcom/robinhood/android/rhy/waitlist/ui/RhyWaitlistSignUpConfirmationFragment$MediaPlayerData;", "value", "", "isMediaPrepared", "setMediaPrepared", "(Z)V", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onPause", "onDestroy", "onBackPressed", "prepareMediaPlayers", "stopMediaPlayers", "releaseMediaPlayers", "checkMediaPlayers", "playRandomSound", "MediaPlayerData", "Companion", "feature-rhy-waitlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyWaitlistSignUpConfirmationFragment extends RhyWaitlistFragment {
    private static final List<HttpUrl> RHY_WAITLIST_CAT_SOUND_URLS;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public EventLogger eventLogger;
    private boolean isMediaPrepared;
    private final List<MediaPlayerData> mediaPlayers;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyWaitlistSignUpConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rhy/contracts/RhyWaitlistSignUpConfirmationContract$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(RhyWaitlistSignUpConfirmationFragment.class, "binding", "getBinding()Lcom/robinhood/android/rhy/waitlist/databinding/FragmentRhyWaitlistSignUpConfirmationBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final LottieUrl RHY_WAITLIST_CAT_LOTTIE_URL = LottieUrl.RHY_WAITLIST_CAT;

    public RhyWaitlistSignUpConfirmationFragment() {
        super(C27560R.layout.fragment_rhy_waitlist_sign_up_confirmation);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(RhyWaitlistSignUpConfirmationContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhy.waitlist.ui.RhyWaitlistSignUpConfirmationFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
                if (!(parentFragment instanceof RhyWaitlistSignUpConfirmationContract.Callbacks)) {
                    parentFragment = null;
                }
                RhyWaitlistSignUpConfirmationContract.Callbacks callbacks = (RhyWaitlistSignUpConfirmationContract.Callbacks) parentFragment;
                if (callbacks != null) {
                    return callbacks;
                }
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof RhyWaitlistSignUpConfirmationContract.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.binding = ViewBinding5.viewBinding(this, RhyWaitlistSignUpConfirmationFragment2.INSTANCE);
        this.mediaPlayers = new ArrayList();
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    static {
        HttpUrl httpUrlBuild = Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegments("rhy/waitlist/success_cat/").build();
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"meow.wav", "meow2.wav", "meow3.wav"});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            HttpUrl httpUrlResolve = httpUrlBuild.resolve((String) it.next());
            if (httpUrlResolve == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(httpUrlResolve);
        }
        RHY_WAITLIST_CAT_SOUND_URLS = arrayList;
    }

    private final RhyWaitlistSignUpConfirmationContract.Callbacks getCallbacks() {
        return (RhyWaitlistSignUpConfirmationContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentRhyWaitlistSignUpConfirmationBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRhyWaitlistSignUpConfirmationBinding) value;
    }

    /* compiled from: RhyWaitlistSignUpConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/rhy/waitlist/ui/RhyWaitlistSignUpConfirmationFragment$MediaPlayerData;", "", "mediaPlayer", "Landroid/media/MediaPlayer;", "isPrepared", "", "<init>", "(Landroid/media/MediaPlayer;Z)V", "getMediaPlayer", "()Landroid/media/MediaPlayer;", "setMediaPlayer", "(Landroid/media/MediaPlayer;)V", "()Z", "setPrepared", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-rhy-waitlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final /* data */ class MediaPlayerData {
        private boolean isPrepared;
        private MediaPlayer mediaPlayer;

        public static /* synthetic */ MediaPlayerData copy$default(MediaPlayerData mediaPlayerData, MediaPlayer mediaPlayer, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaPlayer = mediaPlayerData.mediaPlayer;
            }
            if ((i & 2) != 0) {
                z = mediaPlayerData.isPrepared;
            }
            return mediaPlayerData.copy(mediaPlayer, z);
        }

        /* renamed from: component1, reason: from getter */
        public final MediaPlayer getMediaPlayer() {
            return this.mediaPlayer;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsPrepared() {
            return this.isPrepared;
        }

        public final MediaPlayerData copy(MediaPlayer mediaPlayer, boolean isPrepared) {
            return new MediaPlayerData(mediaPlayer, isPrepared);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MediaPlayerData)) {
                return false;
            }
            MediaPlayerData mediaPlayerData = (MediaPlayerData) other;
            return Intrinsics.areEqual(this.mediaPlayer, mediaPlayerData.mediaPlayer) && this.isPrepared == mediaPlayerData.isPrepared;
        }

        public int hashCode() {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            return ((mediaPlayer == null ? 0 : mediaPlayer.hashCode()) * 31) + Boolean.hashCode(this.isPrepared);
        }

        public String toString() {
            return "MediaPlayerData(mediaPlayer=" + this.mediaPlayer + ", isPrepared=" + this.isPrepared + ")";
        }

        public MediaPlayerData(MediaPlayer mediaPlayer, boolean z) {
            this.mediaPlayer = mediaPlayer;
            this.isPrepared = z;
        }

        public final MediaPlayer getMediaPlayer() {
            return this.mediaPlayer;
        }

        public final void setMediaPlayer(MediaPlayer mediaPlayer) {
            this.mediaPlayer = mediaPlayer;
        }

        public final boolean isPrepared() {
            return this.isPrepared;
        }

        public final void setPrepared(boolean z) {
            this.isPrepared = z;
        }
    }

    private final void setMediaPrepared(boolean z) {
        this.isMediaPrepared = z;
        LinearLayout rhyWaitlistSignUpConfirmationTooltip = getBinding().rhyWaitlistSignUpConfirmationTooltip;
        Intrinsics.checkNotNullExpressionValue(rhyWaitlistSignUpConfirmationTooltip, "rhyWaitlistSignUpConfirmationTooltip");
        rhyWaitlistSignUpConfirmationTooltip.setVisibility(!z ? 4 : 0);
    }

    @Override // com.robinhood.android.rhy.waitlist.p244ui.RhyWaitlistFragment, com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        RHY_WAITLIST_CAT_LOTTIE_URL.prefetch(context);
    }

    @Override // com.robinhood.android.rhy.waitlist.p244ui.RhyWaitlistFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        for (HttpUrl httpUrl : RHY_WAITLIST_CAT_SOUND_URLS) {
            List<MediaPlayerData> list = this.mediaPlayers;
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setDataSource(httpUrl.getUrl());
            list.add(new MediaPlayerData(mediaPlayer, false));
        }
        LottieAnimationView lottieAnimationView = getBinding().rhyWaitlistSignUpConfirmationLottie;
        Intrinsics.checkNotNull(lottieAnimationView);
        LottieAnimationViewsKt.setRemoteUrl(lottieAnimationView, RHY_WAITLIST_CAT_LOTTIE_URL);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.playAnimation();
        OnClickListeners.onClick(lottieAnimationView, new Function0() { // from class: com.robinhood.android.rhy.waitlist.ui.RhyWaitlistSignUpConfirmationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyWaitlistSignUpConfirmationFragment.onViewCreated$lambda$2$lambda$1(this.f$0);
            }
        });
        LinearLayout rhyWaitlistSignUpConfirmationTooltip = getBinding().rhyWaitlistSignUpConfirmationTooltip;
        Intrinsics.checkNotNullExpressionValue(rhyWaitlistSignUpConfirmationTooltip, "rhyWaitlistSignUpConfirmationTooltip");
        OnClickListeners.onClick(rhyWaitlistSignUpConfirmationTooltip, new Function0() { // from class: com.robinhood.android.rhy.waitlist.ui.RhyWaitlistSignUpConfirmationFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyWaitlistSignUpConfirmationFragment.onViewCreated$lambda$3(this.f$0);
            }
        });
        if (!isInTabFragment()) {
            RdsButton rhyWaitlistSignUpConfirmationDoneButton = getBinding().rhyWaitlistSignUpConfirmationDoneButton;
            Intrinsics.checkNotNullExpressionValue(rhyWaitlistSignUpConfirmationDoneButton, "rhyWaitlistSignUpConfirmationDoneButton");
            ApplyWindowInsets.m26663applyWindowInsetsAsMarginqNU9l24(rhyWaitlistSignUpConfirmationDoneButton, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        RdsButton rhyWaitlistSignUpConfirmationDoneButton2 = getBinding().rhyWaitlistSignUpConfirmationDoneButton;
        Intrinsics.checkNotNullExpressionValue(rhyWaitlistSignUpConfirmationDoneButton2, "rhyWaitlistSignUpConfirmationDoneButton");
        OnClickListeners.onClick(rhyWaitlistSignUpConfirmationDoneButton2, new Function0() { // from class: com.robinhood.android.rhy.waitlist.ui.RhyWaitlistSignUpConfirmationFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyWaitlistSignUpConfirmationFragment.onViewCreated$lambda$4(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2$lambda$1(RhyWaitlistSignUpConfirmationFragment rhyWaitlistSignUpConfirmationFragment) throws IllegalStateException {
        rhyWaitlistSignUpConfirmationFragment.playRandomSound();
        EventLogger.DefaultImpls.logTap$default(rhyWaitlistSignUpConfirmationFragment.getEventLogger(), null, rhyWaitlistSignUpConfirmationFragment.getEventScreen(), new Component(Component.ComponentType.RHY_WAITLIST_CAT, null, null, 6, null), null, rhyWaitlistSignUpConfirmationFragment.getEventContext(), false, 41, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(RhyWaitlistSignUpConfirmationFragment rhyWaitlistSignUpConfirmationFragment) throws IllegalStateException {
        rhyWaitlistSignUpConfirmationFragment.playRandomSound();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(RhyWaitlistSignUpConfirmationFragment rhyWaitlistSignUpConfirmationFragment) {
        rhyWaitlistSignUpConfirmationFragment.getCallbacks().onWaitlistDone();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() throws IllegalStateException {
        super.onResume();
        prepareMediaPlayers();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() throws IllegalStateException {
        super.onPause();
        stopMediaPlayers();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        releaseMediaPlayers();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (isInTabFragment()) {
            return super.onBackPressed();
        }
        getCallbacks().onWaitlistDone();
        return true;
    }

    private final void prepareMediaPlayers() throws IllegalStateException {
        for (final MediaPlayerData mediaPlayerData : this.mediaPlayers) {
            MediaPlayer mediaPlayer = mediaPlayerData.getMediaPlayer();
            if (mediaPlayer != null) {
                mediaPlayer.prepareAsync();
            }
            MediaPlayer mediaPlayer2 = mediaPlayerData.getMediaPlayer();
            if (mediaPlayer2 != null) {
                mediaPlayer2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.robinhood.android.rhy.waitlist.ui.RhyWaitlistSignUpConfirmationFragment.prepareMediaPlayers.1
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer3) {
                        mediaPlayerData.setPrepared(true);
                        this.checkMediaPlayers();
                    }
                });
            }
        }
    }

    private final void stopMediaPlayers() throws IllegalStateException {
        Iterator<MediaPlayerData> it = this.mediaPlayers.iterator();
        while (it.hasNext()) {
            MediaPlayer mediaPlayer = it.next().getMediaPlayer();
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
        }
        setMediaPrepared(false);
    }

    private final void releaseMediaPlayers() {
        for (MediaPlayerData mediaPlayerData : this.mediaPlayers) {
            MediaPlayer mediaPlayer = mediaPlayerData.getMediaPlayer();
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            mediaPlayerData.setMediaPlayer(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkMediaPlayers() {
        Iterator<MediaPlayerData> it = this.mediaPlayers.iterator();
        while (it.hasNext()) {
            if (!it.next().isPrepared()) {
                return;
            }
        }
        setMediaPrepared(true);
    }

    private final void playRandomSound() throws IllegalStateException {
        if (this.isMediaPrepared) {
            List<MediaPlayerData> list = this.mediaPlayers;
            MediaPlayer mediaPlayer = list.get(Random.INSTANCE.nextInt(list.size())).getMediaPlayer();
            if (mediaPlayer != null) {
                mediaPlayer.start();
            }
        }
    }

    /* compiled from: RhyWaitlistSignUpConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/rhy/waitlist/ui/RhyWaitlistSignUpConfirmationFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/rhy/contracts/RhyWaitlistSignUpConfirmationContract$Key;", "<init>", "()V", "RHY_WAITLIST_CAT_LOTTIE_URL", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "RHY_WAITLIST_CAT_SOUND_URLS", "", "Lokhttp3/HttpUrl;", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-rhy-waitlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<RhyWaitlistSignUpConfirmationContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(RhyWaitlistSignUpConfirmationContract.Key key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new RhyWaitlistSignUpConfirmationFragment();
        }
    }
}
