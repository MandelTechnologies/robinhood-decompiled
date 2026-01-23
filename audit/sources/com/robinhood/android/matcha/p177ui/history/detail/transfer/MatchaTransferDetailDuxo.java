package com.robinhood.android.matcha.p177ui.history.detail.transfer;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.history.contracts.MatchaTransferDetailFragmentKey;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.history.detail.transfer.MatchaTransferDetailDuxo;
import com.robinhood.android.matcha.p177ui.profile.MatchaProfileMenuBottomSheet;
import com.robinhood.android.models.matcha.api.MatchaMemo;
import com.robinhood.android.social.contracts.CreateReportFragmentKey;
import com.robinhood.android.store.matcha.MatchaTransferStore;
import com.robinhood.android.store.social.SocialBlockingStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.api.matcha.MatchaApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedSingle;
import com.robinhood.models.api.bonfire.ApiSocialBlockingResponse;
import com.robinhood.models.api.bonfire.ApiSocialProfileInfo;
import com.robinhood.models.p320db.matcha.MatchaProfileInfo;
import com.robinhood.models.p320db.matcha.MatchaTransfer;
import com.robinhood.models.p320db.matcha.MatchaUser;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MatchaTransferDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001$B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0016J\u0006\u0010\u001a\u001a\u00020\u0016J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020#H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailDataState;", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "matchaApi", "Lcom/robinhood/api/matcha/MatchaApi;", "transferStore", "Lcom/robinhood/android/store/matcha/MatchaTransferStore;", "blockingStore", "Lcom/robinhood/android/store/social/SocialBlockingStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailStateProvider;", "<init>", "(Lcom/robinhood/api/matcha/MatchaApi;Lcom/robinhood/android/store/matcha/MatchaTransferStore;Lcom/robinhood/android/store/social/SocialBlockingStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "showMenuSheet", "launchReporting", "showBlockConfirmationDialog", "toggleBlockState", "Lio/reactivex/Single;", "Lcom/robinhood/models/api/bonfire/ApiSocialBlockingResponse;", "profile", "Lcom/robinhood/models/db/matcha/MatchaProfileInfo;", "userId", "", "getBlockConfirmationText", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/api/bonfire/ApiSocialProfileInfo;", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchaTransferDetailDuxo extends BaseDuxo<MatchaTransferDetailDataState, MatchaTransferDetailViewState> implements HasSavedState {
    private final SocialBlockingStore blockingStore;
    private final MatchaApi matchaApi;
    private final SavedStateHandle savedStateHandle;
    private final MatchaTransferStore transferStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaTransferDetailDuxo(MatchaApi matchaApi, MatchaTransferStore transferStore, SocialBlockingStore blockingStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, MatchaTransferDetailStateProvider stateProvider) {
        super(new MatchaTransferDetailDataState(null, null, null, null, null, 31, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
        Intrinsics.checkNotNullParameter(transferStore, "transferStore");
        Intrinsics.checkNotNullParameter(blockingStore, "blockingStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.matchaApi = matchaApi;
        this.transferStore = transferStore;
        this.blockingStore = blockingStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, this.transferStore.streamMatchaTransfer(((MatchaTransferDetailFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getTransferId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaTransferDetailDuxo.onResume$lambda$0(this.f$0, (MatchaTransfer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(MatchaTransferDetailDuxo matchaTransferDetailDuxo, MatchaTransfer it) {
        Intrinsics.checkNotNullParameter(it, "it");
        matchaTransferDetailDuxo.applyMutation(new MatchaTransferDetailDuxo2(it, null));
        return Unit.INSTANCE;
    }

    /* compiled from: MatchaTransferDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailDuxo$showMenuSheet$1", m3645f = "MatchaTransferDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailDuxo$showMenuSheet$1 */
    static final class C213361 extends ContinuationImpl7 implements Function2<MatchaTransferDetailDataState, Continuation<? super MatchaTransferDetailDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C213361(Continuation<? super C213361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C213361 c213361 = new C213361(continuation);
            c213361.L$0 = obj;
            return c213361;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchaTransferDetailDataState matchaTransferDetailDataState, Continuation<? super MatchaTransferDetailDataState> continuation) {
            return ((C213361) create(matchaTransferDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MatchaTransferDetailDataState matchaTransferDetailDataState = (MatchaTransferDetailDataState) this.L$0;
            return MatchaTransferDetailDataState.copy$default(matchaTransferDetailDataState, null, new UiEvent(new MatchaProfileMenuBottomSheet.Args.FromTransferDetail(matchaTransferDetailDataState.getCanReport(), matchaTransferDetailDataState.isBlocked(), matchaTransferDetailDataState.getCanBlock())), null, null, null, 29, null);
        }
    }

    public final void showMenuSheet() {
        applyMutation(new C213361(null));
    }

    /* compiled from: MatchaTransferDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailDuxo$launchReporting$1", m3645f = "MatchaTransferDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailDuxo$launchReporting$1 */
    static final class C213341 extends ContinuationImpl7 implements Function2<MatchaTransferDetailDataState, Continuation<? super MatchaTransferDetailDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C213341(Continuation<? super C213341> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C213341 c213341 = new C213341(continuation);
            c213341.L$0 = obj;
            return c213341;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchaTransferDetailDataState matchaTransferDetailDataState, Continuation<? super MatchaTransferDetailDataState> continuation) {
            return ((C213341) create(matchaTransferDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            UUID id;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MatchaTransferDetailDataState matchaTransferDetailDataState = (MatchaTransferDetailDataState) this.L$0;
            MatchaTransfer transfer = matchaTransferDetailDataState.getTransfer();
            String string2 = null;
            MatchaUser transactor = transfer != null ? transfer.getTransactor() : null;
            Intrinsics.checkNotNull(transactor);
            String value = transactor.getIdentifier().getValue();
            MatchaProfileInfo profileInfo = transactor.getProfileInfo();
            String username = profileInfo != null ? profileInfo.getUsername() : null;
            MatchaProfileInfo profileInfo2 = transactor.getProfileInfo();
            String profilePictureUrl = profileInfo2 != null ? profileInfo2.getProfilePictureUrl() : null;
            MatchaMemo memo = matchaTransferDetailDataState.getTransfer().getMemo();
            if (memo != null && (id = memo.getId()) != null) {
                string2 = id.toString();
            }
            return MatchaTransferDetailDataState.copy$default(matchaTransferDetailDataState, null, null, new UiEvent(new CreateReportFragmentKey(value, username, profilePictureUrl, string2)), null, null, 27, null);
        }
    }

    public final void launchReporting() {
        applyMutation(new C213341(null));
    }

    /* compiled from: MatchaTransferDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailDuxo$showBlockConfirmationDialog$1", m3645f = "MatchaTransferDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailDuxo$showBlockConfirmationDialog$1 */
    static final class C213351 extends ContinuationImpl7 implements Function2<MatchaTransferDetailDataState, Continuation<? super MatchaTransferDetailDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C213351(Continuation<? super C213351> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C213351 c213351 = new C213351(continuation);
            c213351.L$0 = obj;
            return c213351;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchaTransferDetailDataState matchaTransferDetailDataState, Continuation<? super MatchaTransferDetailDataState> continuation) {
            return ((C213351) create(matchaTransferDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            MatchaUser transactor;
            MatchaProfileInfo profileInfo;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MatchaTransferDetailDataState matchaTransferDetailDataState = (MatchaTransferDetailDataState) this.L$0;
            MatchaTransfer transfer = matchaTransferDetailDataState.getTransfer();
            return MatchaTransferDetailDataState.copy$default(matchaTransferDetailDataState, null, null, null, (transfer == null || (transactor = transfer.getTransactor()) == null || (profileInfo = transactor.getProfileInfo()) == null) ? null : new UiEvent(new ShowBlockConfirmationDialogEvent(profileInfo.isBlocked(), profileInfo.getFullName())), null, 23, null);
        }
    }

    public final void showBlockConfirmationDialog() {
        applyMutation(new C213351(null));
    }

    /* compiled from: MatchaTransferDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailDuxo$toggleBlockState$1", m3645f = "MatchaTransferDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailDuxo$toggleBlockState$1 */
    static final class C213371 extends ContinuationImpl7 implements Function2<MatchaTransferDetailDataState, Continuation<? super MatchaTransferDetailDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C213371(Continuation<? super C213371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C213371 c213371 = MatchaTransferDetailDuxo.this.new C213371(continuation);
            c213371.L$0 = obj;
            return c213371;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchaTransferDetailDataState matchaTransferDetailDataState, Continuation<? super MatchaTransferDetailDataState> continuation) {
            return ((C213371) create(matchaTransferDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MatchaTransferDetailDataState matchaTransferDetailDataState = (MatchaTransferDetailDataState) this.L$0;
            MatchaTransfer transfer = matchaTransferDetailDataState.getTransfer();
            MatchaUser transactor = transfer != null ? transfer.getTransactor() : null;
            Intrinsics.checkNotNull(transactor);
            MatchaProfileInfo profileInfo = transactor.getProfileInfo();
            Intrinsics.checkNotNull(profileInfo);
            final String value = transactor.getIdentifier().getValue();
            MatchaTransferDetailDuxo matchaTransferDetailDuxo = MatchaTransferDetailDuxo.this;
            Single single = matchaTransferDetailDuxo.toggleBlockState(profileInfo, value);
            final MatchaTransferDetailDuxo matchaTransferDetailDuxo2 = MatchaTransferDetailDuxo.this;
            Single singleFlatMap = single.flatMap(new Function() { // from class: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailDuxo.toggleBlockState.1.1

                /* compiled from: MatchaTransferDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiSocialProfileInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailDuxo$toggleBlockState$1$1$1", m3645f = "MatchaTransferDetailDuxo.kt", m3646l = {101}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailDuxo$toggleBlockState$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C502721 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiSocialProfileInfo>, Object> {
                    final /* synthetic */ String $userId;
                    int label;
                    final /* synthetic */ MatchaTransferDetailDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C502721(MatchaTransferDetailDuxo matchaTransferDetailDuxo, String str, Continuation<? super C502721> continuation) {
                        super(2, continuation);
                        this.this$0 = matchaTransferDetailDuxo;
                        this.$userId = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C502721(this.this$0, this.$userId, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiSocialProfileInfo> continuation) {
                        return ((C502721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                        MatchaApi matchaApi = this.this$0.matchaApi;
                        String str = this.$userId;
                        this.label = 1;
                        Object userSocialProfile = matchaApi.getUserSocialProfile(str, this);
                        return userSocialProfile == coroutine_suspended ? coroutine_suspended : userSocialProfile;
                    }
                }

                @Override // io.reactivex.functions.Function
                public final SingleSource<? extends ApiSocialProfileInfo> apply(ApiSocialBlockingResponse it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    MatchaTransferDetailDuxo matchaTransferDetailDuxo3 = matchaTransferDetailDuxo2;
                    return RxFactory.DefaultImpls.rxSingle$default(matchaTransferDetailDuxo3, null, new C502721(matchaTransferDetailDuxo3, value, null), 1, null);
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
            ScopedSingle scopedSingleBind$default = LifecycleHost.DefaultImpls.bind$default(matchaTransferDetailDuxo, singleFlatMap, (LifecycleEvent) null, 1, (Object) null);
            final MatchaTransferDetailDuxo matchaTransferDetailDuxo3 = MatchaTransferDetailDuxo.this;
            Function1 function1 = new Function1() { // from class: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailDuxo$toggleBlockState$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return MatchaTransferDetailDuxo.C213371.invokeSuspend$lambda$0(matchaTransferDetailDuxo3, (ApiSocialProfileInfo) obj2);
                }
            };
            final MatchaTransferDetailDuxo matchaTransferDetailDuxo4 = MatchaTransferDetailDuxo.this;
            scopedSingleBind$default.subscribeKotlin(function1, new Function1() { // from class: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailDuxo$toggleBlockState$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return MatchaTransferDetailDuxo.C213371.invokeSuspend$lambda$1(matchaTransferDetailDuxo4, (Throwable) obj2);
                }
            });
            return MatchaTransferDetailDataState.copy$default(matchaTransferDetailDataState, null, null, null, null, null, 31, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(MatchaTransferDetailDuxo matchaTransferDetailDuxo, ApiSocialProfileInfo apiSocialProfileInfo) {
            matchaTransferDetailDuxo.transferStore.refresh(true);
            matchaTransferDetailDuxo.applyMutation(new MatchaTransferDetailDuxo3(matchaTransferDetailDuxo, apiSocialProfileInfo, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(MatchaTransferDetailDuxo matchaTransferDetailDuxo, Throwable th) {
            matchaTransferDetailDuxo.applyMutation(new MatchaTransferDetailDuxo4(th, null));
            return Unit.INSTANCE;
        }
    }

    public final void toggleBlockState() {
        applyMutation(new C213371(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<ApiSocialBlockingResponse> toggleBlockState(MatchaProfileInfo profile, String userId) {
        String blockRelationshipId = profile.getBlockRelationshipId();
        UUID uuid = blockRelationshipId != null ? StringsKt.toUuid(blockRelationshipId) : null;
        if (uuid != null) {
            return this.blockingStore.unblockUser(uuid);
        }
        return this.blockingStore.block(userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StringResource getBlockConfirmationText(ApiSocialProfileInfo profile) {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        if (profile.isBlocked()) {
            i = C21284R.string.matcha_profile_blocked_user_action;
        } else {
            i = C21284R.string.matcha_profile_unblocked_user_action;
        }
        return companion.invoke(i, profile.getFull_name());
    }

    /* compiled from: MatchaTransferDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailDuxo;", "Lcom/robinhood/android/history/contracts/MatchaTransferDetailFragmentKey;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MatchaTransferDetailDuxo, MatchaTransferDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchaTransferDetailFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (MatchaTransferDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchaTransferDetailFragmentKey getArgs(MatchaTransferDetailDuxo matchaTransferDetailDuxo) {
            return (MatchaTransferDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, matchaTransferDetailDuxo);
        }
    }
}
