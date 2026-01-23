package com.robinhood.android.blackwidow.p068ui.upsell;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.SavedStateHandle;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.blackwidow.apiblackwidowbff.BlackWidowUpsellStore;
import com.robinhood.android.blackwidow.apiblackwidowbff.SendEmailStatus;
import com.robinhood.android.blackwidow.contracts.ExploreLegendUpsellKey;
import com.robinhood.android.blackwidow.p068ui.upsell.ExploreLegendUpsellViewEvent;
import com.robinhood.android.blackwidow.p068ui.upsell.ExploreLegendUpsellViewState;
import com.robinhood.android.common.BuildConfig;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.compose.common.AnimationExoPlayer2;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.utils.extensions.SinglesKt;
import com.robinhood.utils.p408rx.DownloadManagerOnSubscribe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.FilesKt;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import okhttp3.HttpUrl;
import timber.log.Timber;

/* compiled from: ExploreLegendUpsellDuxo.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\"B3\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u001a\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a0\u0019H\u0002J\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J\u0006\u0010!\u001a\u00020\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellViewState;", "Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellViewEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "appContext", "Landroid/content/Context;", PlaceTypes.STORE, "Lcom/robinhood/android/blackwidow/apiblackwidowbff/BlackWidowUpsellStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroid/content/Context;Lcom/robinhood/android/blackwidow/apiblackwidowbff/BlackWidowUpsellStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "upsellKey", "Lcom/robinhood/android/blackwidow/contracts/ExploreLegendUpsellKey;", "onResume", "", "requestContent", "prepareVideoAssetsFiles", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Lcom/robinhood/android/blackwidow/ui/upsell/VideoInfo;", "produceVideoInfo", "files", "", "Ljava/io/File;", "requestEmailLink", "Companion", "feature-black-widow-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ExploreLegendUpsellDuxo extends BaseDuxo5<ExploreLegendUpsellViewState, ExploreLegendUpsellViewEvent> implements HasSavedState {
    public static final int $stable;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final String ROOT_DIRECTORY = "black_widow/explore_legend/upsell";
    private static final String VIDEO_FILE_EXTENSION = ".mp4";
    private static final List<String> fileNames;
    private static final HttpUrl heroImageUrl;
    private final Context appContext;
    private final SavedStateHandle savedStateHandle;
    private final BlackWidowUpsellStore store;
    private final ExploreLegendUpsellKey upsellKey;
    private final UserStore userStore;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreLegendUpsellDuxo(Context appContext, BlackWidowUpsellStore store, UserStore userStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(ExploreLegendUpsellViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.appContext = appContext;
        this.store = store;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
        this.upsellKey = (ExploreLegendUpsellKey) INSTANCE.getArgs(getSavedStateHandle());
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        requestContent();
    }

    /* compiled from: ExploreLegendUpsellDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellDuxo$requestContent$1", m3645f = "ExploreLegendUpsellDuxo.kt", m3646l = {66}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellDuxo$requestContent$1 */
    static final class C99121 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C99121(Continuation<? super C99121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ExploreLegendUpsellDuxo.this.new C99121(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C99121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.m28818catch(FlowKt.flowCombine(ExploreLegendUpsellDuxo.this.prepareVideoAssetsFiles(), Context7.buffer$default(RxConvert.asFlow(ExploreLegendUpsellDuxo.this.userStore.getUser()), Integer.MAX_VALUE, null, 2, null), new AnonymousClass1(null)), new AnonymousClass2(ExploreLegendUpsellDuxo.this, null)));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(ExploreLegendUpsellDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: ExploreLegendUpsellDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00050\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Lcom/robinhood/android/blackwidow/ui/upsell/VideoInfo;", "Lcom/robinhood/models/db/sheriff/User;", "videoInfo", "user"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellDuxo$requestContent$1$1", m3645f = "ExploreLegendUpsellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellDuxo$requestContent$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<ImmutableMap<String, ? extends VideoInfo>, User, Continuation<? super Tuples2<? extends ImmutableMap<String, ? extends VideoInfo>, ? extends User>>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(ImmutableMap<String, ? extends VideoInfo> immutableMap, User user, Continuation<? super Tuples2<? extends ImmutableMap<String, ? extends VideoInfo>, ? extends User>> continuation) {
                return invoke2((ImmutableMap<String, VideoInfo>) immutableMap, user, (Continuation<? super Tuples2<? extends ImmutableMap<String, VideoInfo>, User>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(ImmutableMap<String, VideoInfo> immutableMap, User user, Continuation<? super Tuples2<? extends ImmutableMap<String, VideoInfo>, User>> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = immutableMap;
                anonymousClass1.L$1 = user;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Tuples4.m3642to((ImmutableMap) this.L$0, (User) this.L$1);
            }
        }

        /* compiled from: ExploreLegendUpsellDuxo.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001* \u0012\u001c\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u00070\u00030\u00022\u0006\u0010\b\u001a\u00020\tH\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Lcom/robinhood/android/blackwidow/ui/upsell/VideoInfo;", "Lcom/robinhood/models/db/sheriff/User;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellDuxo$requestContent$1$2", m3645f = "ExploreLegendUpsellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellDuxo$requestContent$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function3<FlowCollector<? super Tuples2<? extends ImmutableMap<String, ? extends VideoInfo>, ? extends User>>, Throwable, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ExploreLegendUpsellDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ExploreLegendUpsellDuxo exploreLegendUpsellDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
                this.this$0 = exploreLegendUpsellDuxo;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Tuples2<? extends ImmutableMap<String, ? extends VideoInfo>, ? extends User>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return invoke2((FlowCollector<? super Tuples2<? extends ImmutableMap<String, VideoInfo>, User>>) flowCollector, th, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(FlowCollector<? super Tuples2<? extends ImmutableMap<String, VideoInfo>, User>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return new AnonymousClass2(this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.submit(ExploreLegendUpsellViewEvent.Error.INSTANCE);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: ExploreLegendUpsellDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u00070\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Lcom/robinhood/android/blackwidow/ui/upsell/VideoInfo;", "Lcom/robinhood/models/db/sheriff/User;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellDuxo$requestContent$1$3", m3645f = "ExploreLegendUpsellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellDuxo$requestContent$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Tuples2<? extends ImmutableMap<String, ? extends VideoInfo>, ? extends User>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ExploreLegendUpsellDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(ExploreLegendUpsellDuxo exploreLegendUpsellDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = exploreLegendUpsellDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ImmutableMap<String, ? extends VideoInfo>, ? extends User> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<? extends ImmutableMap<String, VideoInfo>, User>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<? extends ImmutableMap<String, VideoInfo>, User> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: ExploreLegendUpsellDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellDuxo$requestContent$1$3$1", m3645f = "ExploreLegendUpsellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellDuxo$requestContent$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ExploreLegendUpsellViewState, Continuation<? super ExploreLegendUpsellViewState>, Object> {
                final /* synthetic */ User $user;
                final /* synthetic */ ImmutableMap<String, VideoInfo> $videoInfo;
                int label;
                final /* synthetic */ ExploreLegendUpsellDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ImmutableMap<String, VideoInfo> immutableMap, ExploreLegendUpsellDuxo exploreLegendUpsellDuxo, User user, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$videoInfo = immutableMap;
                    this.this$0 = exploreLegendUpsellDuxo;
                    this.$user = user;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$videoInfo, this.this$0, this.$user, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ExploreLegendUpsellViewState exploreLegendUpsellViewState, Continuation<? super ExploreLegendUpsellViewState> continuation) {
                    return ((AnonymousClass1) create(exploreLegendUpsellViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ImmutableMap<String, VideoInfo> immutableMap = this.$videoInfo;
                    String source = this.this$0.upsellKey.getSource();
                    if (source == null) {
                        source = "";
                    }
                    return new ExploreLegendUpsellViewState.Ready(immutableMap, source, ExploreLegendUpsellDuxo.INSTANCE.getHeroImageUrl$feature_black_widow_upsell_externalDebug(), this.$user.getIsRhsg() || this.$user.getIsUk());
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                ImmutableMap immutableMap = (ImmutableMap) tuples2.component1();
                User user = (User) tuples2.component2();
                ExploreLegendUpsellDuxo exploreLegendUpsellDuxo = this.this$0;
                exploreLegendUpsellDuxo.applyMutation(new AnonymousClass1(immutableMap, exploreLegendUpsellDuxo, user, null));
                return Unit.INSTANCE;
            }
        }
    }

    private final void requestContent() {
        getLifecycleScope().launchWhenStarted(new C99121(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<ImmutableMap<String, VideoInfo>> prepareVideoAssetsFiles() {
        Timber.INSTANCE.mo3350d("prepareVideoAssets", new Object[0]);
        final File file = new File(this.appContext.getExternalCacheDir(), ROOT_DIRECTORY);
        file.mkdirs();
        Observable observable = Observable.fromIterable(fileNames).flatMapSingle(new Function() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellDuxo.prepareVideoAssetsFiles.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends File> apply(String fileName) {
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                HttpUrl httpUrlAssetUrl$default = Companion.assetUrl$default(ExploreLegendUpsellDuxo.INSTANCE, fileName, null, 2, null);
                final File file2 = new File(file, fileName + ExploreLegendUpsellDuxo.VIDEO_FILE_EXTENSION);
                if (BuildConfig.DEBUG && file2.exists()) {
                    file2.delete();
                }
                if (file2.exists()) {
                    Single singleFromCallable = Single.fromCallable(new Callable() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellDuxo.prepareVideoAssetsFiles.1.1
                        @Override // java.util.concurrent.Callable
                        public final File call() {
                            return file2;
                        }
                    });
                    Intrinsics.checkNotNull(singleFromCallable);
                    return singleFromCallable;
                }
                Timber.INSTANCE.mo3350d("Downloading " + httpUrlAssetUrl$default, new Object[0]);
                Single singleCreate = Single.create(new DownloadManagerOnSubscribe(this.appContext, httpUrlAssetUrl$default, file2, false));
                Intrinsics.checkNotNullExpressionValue(singleCreate, "create(...)");
                return SinglesKt.retryExponential$default(singleCreate, 2, null, 2, null);
            }
        }).toList().map(new Function() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellDuxo.prepareVideoAssetsFiles.2
            @Override // io.reactivex.functions.Function
            public final ImmutableMap<String, VideoInfo> apply(List<File> files) {
                Intrinsics.checkNotNullParameter(files, "files");
                return ExploreLegendUpsellDuxo.this.produceVideoInfo(files);
            }
        }).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return Context7.buffer$default(RxConvert.asFlow(observable), Integer.MAX_VALUE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImmutableMap<String, VideoInfo> produceVideoInfo(List<? extends File> files) throws IOException {
        List<? extends File> list = files;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (File file : list) {
            String nameWithoutExtension = FilesKt.getNameWithoutExtension(file);
            String path = file.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
            MediaSource mediaSourceMp4MediaSourceFromLocalFile = AnimationExoPlayer2.mp4MediaSourceFromLocalFile(Uri.parse(path));
            String path2 = file.getPath();
            Intrinsics.checkNotNullExpressionValue(path2, "getPath(...)");
            Uri uri = Uri.parse(path2);
            Companion companion = INSTANCE;
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            MediaItem mediaItemFromUri = MediaItem.fromUri(Companion.assetUrl$default(companion, name, null, 2, null).getUrl());
            Intrinsics.checkNotNullExpressionValue(mediaItemFromUri, "fromUri(...)");
            linkedHashMap.put(nameWithoutExtension, new VideoInfo(mediaSourceMp4MediaSourceFromLocalFile, uri, mediaItemFromUri));
        }
        return extensions2.toImmutableMap(linkedHashMap);
    }

    /* compiled from: ExploreLegendUpsellDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellDuxo$requestEmailLink$1", m3645f = "ExploreLegendUpsellDuxo.kt", m3646l = {128}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellDuxo$requestEmailLink$1 */
    static final class C99131 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C99131(Continuation<? super C99131> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ExploreLegendUpsellDuxo.this.new C99131(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C99131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BlackWidowUpsellStore blackWidowUpsellStore = ExploreLegendUpsellDuxo.this.store;
                String source = ExploreLegendUpsellDuxo.this.upsellKey.getSource();
                this.label = 1;
                obj = blackWidowUpsellStore.sendEmail(source, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((SendEmailStatus) obj).getSuccess()) {
                ExploreLegendUpsellDuxo.this.submit(ExploreLegendUpsellViewEvent.EmailSuccess.INSTANCE);
            } else {
                ExploreLegendUpsellDuxo.this.submit(ExploreLegendUpsellViewEvent.EmailError.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    public final void requestEmailLink() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C99131(null), 3, null);
    }

    /* compiled from: ExploreLegendUpsellDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellDuxo;", "Lcom/robinhood/android/blackwidow/contracts/ExploreLegendUpsellKey;", "<init>", "()V", "ROOT_DIRECTORY", "", "VIDEO_FILE_EXTENSION", "fileNames", "", "heroImageUrl", "Lokhttp3/HttpUrl;", "getHeroImageUrl$feature_black_widow_upsell_externalDebug", "()Lokhttp3/HttpUrl;", "assetUrl", "name", "extension", "feature-black-widow-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ExploreLegendUpsellDuxo, ExploreLegendUpsellKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ExploreLegendUpsellKey getArgs(SavedStateHandle savedStateHandle) {
            return (ExploreLegendUpsellKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ExploreLegendUpsellKey getArgs(ExploreLegendUpsellDuxo exploreLegendUpsellDuxo) {
            return (ExploreLegendUpsellKey) DuxoCompanion.DefaultImpls.getArgs(this, exploreLegendUpsellDuxo);
        }

        public final HttpUrl getHeroImageUrl$feature_black_widow_upsell_externalDebug() {
            return ExploreLegendUpsellDuxo.heroImageUrl;
        }

        static /* synthetic */ HttpUrl assetUrl$default(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = ExploreLegendUpsellDuxo.VIDEO_FILE_EXTENSION;
            }
            return companion.assetUrl(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final HttpUrl assetUrl(String name, String extension) {
            return Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegment("black_widow/explore_legend/upsell/" + name + extension).build();
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        $stable = 8;
        fileNames = CollectionsKt.listOf((Object[]) new String[]{"01_hero_intro", "02_drawing", "02_indicators", "02_intervals", "02_trading", "03_metal_candlesticks", "04_custom_layouts", "05_preset_layout_no_etf", "06_buy_sequence", "07_dual_screen_linking", "08_bottom_wave"});
        heroImageUrl = companion.assetUrl("01_hero_intro_thumbnail", ".png");
    }
}
