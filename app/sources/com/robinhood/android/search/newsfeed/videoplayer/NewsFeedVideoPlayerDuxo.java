package com.robinhood.android.search.newsfeed.videoplayer;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoPlayerDuxo;
import com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoPlayerViewState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.newsfeed.NewsFeedVideoStore;
import com.robinhood.models.newsfeed.p334db.dao.NewsFeedElement;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NewsFeedVideoPlayerDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0016B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u0010J\u0016\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoPlayerDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoPlayerViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "newsFeedVideoStore", "Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedVideoStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedVideoStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "endedVideoIds", "", "Ljava/util/UUID;", "onCreate", "", "refreshVideos", "setVideoEnded", "videoId", "ended", "", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class NewsFeedVideoPlayerDuxo extends OldBaseDuxo<NewsFeedVideoPlayerViewState> implements HasSavedState {
    private final Set<UUID> endedVideoIds;
    private final NewsFeedVideoStore newsFeedVideoStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NewsFeedVideoPlayerDuxo(NewsFeedVideoStore newsFeedVideoStore, SavedStateHandle savedStateHandle) {
        super(new NewsFeedVideoPlayerViewState(null, null, null, 7, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(newsFeedVideoStore, "newsFeedVideoStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.newsFeedVideoStore = newsFeedVideoStore;
        this.savedStateHandle = savedStateHandle;
        this.endedVideoIds = new LinkedHashSet();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        Observable<NewsFeedVideoPlayerViewState> observableTake = getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoPlayerDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedVideoPlayerDuxo.onCreate$lambda$0(this.f$0, (NewsFeedVideoPlayerViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(NewsFeedVideoPlayerDuxo newsFeedVideoPlayerDuxo, NewsFeedVideoPlayerViewState newsFeedVideoPlayerViewState) {
        if (!newsFeedVideoPlayerViewState.getShowContent()) {
            newsFeedVideoPlayerDuxo.refreshVideos();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: NewsFeedVideoPlayerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/newsfeed/db/dao/NewsFeedElement;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoPlayerDuxo$refreshVideos$1", m3645f = "NewsFeedVideoPlayerDuxo.kt", m3646l = {40}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoPlayerDuxo$refreshVideos$1 */
    static final class C280791 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends NewsFeedElement>>, Object> {
        int label;

        C280791(Continuation<? super C280791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NewsFeedVideoPlayerDuxo.this.new C280791(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends NewsFeedElement>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<NewsFeedElement>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<NewsFeedElement>> continuation) {
            return ((C280791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            NewsFeedVideoStore newsFeedVideoStore = NewsFeedVideoPlayerDuxo.this.newsFeedVideoStore;
            UUID videoId = ((LegacyFragmentKey.NewsFeedVideoPlayer) NewsFeedVideoPlayerDuxo.INSTANCE.getArgs((HasSavedState) NewsFeedVideoPlayerDuxo.this)).getVideoId();
            this.label = 1;
            Object objFetchNewsFeedVideoElements = newsFeedVideoStore.fetchNewsFeedVideoElements(videoId, this);
            return objFetchNewsFeedVideoElements == coroutine_suspended ? coroutine_suspended : objFetchNewsFeedVideoElements;
        }
    }

    public final void refreshVideos() {
        Single singleDoOnSubscribe = RxFactory.DefaultImpls.rxSingle$default(this, null, new C280791(null), 1, null).doOnSubscribe(new C280802());
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoPlayerDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedVideoPlayerDuxo.refreshVideos$lambda$2(this.f$0, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoPlayerDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedVideoPlayerDuxo.refreshVideos$lambda$4(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: NewsFeedVideoPlayerDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoPlayerDuxo$refreshVideos$2 */
    static final class C280802<T> implements Consumer {
        C280802() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NewsFeedVideoPlayerViewState accept$lambda$0(NewsFeedVideoPlayerViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return NewsFeedVideoPlayerViewState.copy$default(applyMutation, null, null, NewsFeedVideoPlayerViewState.VideosLoadingState.LOADING, 3, null);
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            NewsFeedVideoPlayerDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoPlayerDuxo$refreshVideos$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NewsFeedVideoPlayerDuxo.C280802.accept$lambda$0((NewsFeedVideoPlayerViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshVideos$lambda$2(NewsFeedVideoPlayerDuxo newsFeedVideoPlayerDuxo, final List list) {
        newsFeedVideoPlayerDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoPlayerDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedVideoPlayerDuxo.refreshVideos$lambda$2$lambda$1(list, (NewsFeedVideoPlayerViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedVideoPlayerViewState refreshVideos$lambda$2$lambda$1(List list, NewsFeedVideoPlayerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(list);
        return NewsFeedVideoPlayerViewState.copy$default(applyMutation, list, null, NewsFeedVideoPlayerViewState.VideosLoadingState.LOADED, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshVideos$lambda$4(NewsFeedVideoPlayerDuxo newsFeedVideoPlayerDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            newsFeedVideoPlayerDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoPlayerDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NewsFeedVideoPlayerDuxo.refreshVideos$lambda$4$lambda$3((NewsFeedVideoPlayerViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedVideoPlayerViewState refreshVideos$lambda$4$lambda$3(NewsFeedVideoPlayerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NewsFeedVideoPlayerViewState.copy$default(applyMutation, null, null, NewsFeedVideoPlayerViewState.VideosLoadingState.FAILED, 3, null);
    }

    public final void setVideoEnded(UUID videoId, boolean ended) {
        Intrinsics.checkNotNullParameter(videoId, "videoId");
        if (ended) {
            this.endedVideoIds.add(videoId);
        } else {
            this.endedVideoIds.remove(videoId);
        }
        final Set set = CollectionsKt.toSet(this.endedVideoIds);
        applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoPlayerDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedVideoPlayerDuxo.setVideoEnded$lambda$5(set, (NewsFeedVideoPlayerViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedVideoPlayerViewState setVideoEnded$lambda$5(Set set, NewsFeedVideoPlayerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NewsFeedVideoPlayerViewState.copy$default(applyMutation, null, set, null, 5, null);
    }

    /* compiled from: NewsFeedVideoPlayerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoPlayerDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoPlayerDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$NewsFeedVideoPlayer;", "<init>", "()V", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<NewsFeedVideoPlayerDuxo, LegacyFragmentKey.NewsFeedVideoPlayer> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.NewsFeedVideoPlayer getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.NewsFeedVideoPlayer) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.NewsFeedVideoPlayer getArgs(NewsFeedVideoPlayerDuxo newsFeedVideoPlayerDuxo) {
            return (LegacyFragmentKey.NewsFeedVideoPlayer) DuxoCompanion.DefaultImpls.getArgs(this, newsFeedVideoPlayerDuxo);
        }
    }
}
