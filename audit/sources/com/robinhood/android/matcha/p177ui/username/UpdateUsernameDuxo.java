package com.robinhood.android.matcha.p177ui.username;

import com.robinhood.android.matcha.p177ui.username.UpdateUsernameViewState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.ProfileStore;
import com.robinhood.models.api.ApiProfile;
import com.robinhood.models.p320db.Profile;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Completable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: UpdateUsernameDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u000fJ\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/username/UpdateUsernameDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/matcha/ui/username/UpdateUsernameDataState;", "Lcom/robinhood/android/matcha/ui/username/UpdateUsernameViewState;", "profileStore", "Lcom/robinhood/librobinhood/data/store/ProfileStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "stateProvider", "Lcom/robinhood/android/matcha/ui/username/UpdateUsernameStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ProfileStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/matcha/ui/username/UpdateUsernameStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "saveUsername", "username", "", "dismissError", "updateProfile", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class UpdateUsernameDuxo extends BaseDuxo<UpdateUsernameDataState, UpdateUsernameViewState> {
    public static final int $stable = 8;
    private final ProfileStore profileStore;
    private final UserStore userStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateUsernameDuxo(ProfileStore profileStore, UserStore userStore, UpdateUsernameStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new UpdateUsernameDataState(null, null, false, null, 15, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(profileStore, "profileStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.profileStore = profileStore;
        this.userStore = userStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.profileStore.fetchProfile(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.username.UpdateUsernameDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UpdateUsernameDuxo.onStart$lambda$0(this.f$0, (Profile) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.matcha.ui.username.UpdateUsernameDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UpdateUsernameDuxo.onStart$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(UpdateUsernameDuxo updateUsernameDuxo, Profile profile) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        updateUsernameDuxo.applyMutation(new UpdateUsernameDuxo2(profile, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(UpdateUsernameDuxo updateUsernameDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            updateUsernameDuxo.applyMutation(new UpdateUsernameDuxo3(null));
            return Unit.INSTANCE;
        }
        throw t;
    }

    public final void saveUsername(String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        UpdateUsernameViewState value = getStateFlow().getValue();
        UpdateUsernameViewState.Loaded loaded = value instanceof UpdateUsernameViewState.Loaded ? (UpdateUsernameViewState.Loaded) value : null;
        String username2 = loaded != null ? loaded.getUsername() : null;
        if (StringsKt.isBlank(username) || Intrinsics.areEqual(username, username2)) {
            applyMutation(new C215851(null));
        } else {
            updateProfile(username);
        }
    }

    /* compiled from: UpdateUsernameDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/username/UpdateUsernameDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.username.UpdateUsernameDuxo$saveUsername$1", m3645f = "UpdateUsernameDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.username.UpdateUsernameDuxo$saveUsername$1 */
    static final class C215851 extends ContinuationImpl7 implements Function2<UpdateUsernameDataState, Continuation<? super UpdateUsernameDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C215851(Continuation<? super C215851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C215851 c215851 = new C215851(continuation);
            c215851.L$0 = obj;
            return c215851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UpdateUsernameDataState updateUsernameDataState, Continuation<? super UpdateUsernameDataState> continuation) {
            return ((C215851) create(updateUsernameDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return UpdateUsernameDataState.copy$default((UpdateUsernameDataState) this.L$0, null, new ComposeUiEvent(Unit.INSTANCE), false, null, 13, null);
        }
    }

    /* compiled from: UpdateUsernameDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/username/UpdateUsernameDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.username.UpdateUsernameDuxo$dismissError$1", m3645f = "UpdateUsernameDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.username.UpdateUsernameDuxo$dismissError$1 */
    static final class C215841 extends ContinuationImpl7 implements Function2<UpdateUsernameDataState, Continuation<? super UpdateUsernameDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C215841(Continuation<? super C215841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C215841 c215841 = new C215841(continuation);
            c215841.L$0 = obj;
            return c215841;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UpdateUsernameDataState updateUsernameDataState, Continuation<? super UpdateUsernameDataState> continuation) {
            return ((C215841) create(updateUsernameDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return UpdateUsernameDataState.copy$default((UpdateUsernameDataState) this.L$0, null, null, false, null, 7, null);
        }
    }

    public final void dismissError() {
        applyMutation(new C215841(null));
    }

    private final void updateProfile(String username) {
        Completable completableDoOnComplete = this.profileStore.updateProfile(new ApiProfile.Request(username, null, null, false, 14, null)).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.matcha.ui.username.UpdateUsernameDuxo.updateProfile.1

            /* compiled from: UpdateUsernameDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/username/UpdateUsernameDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.username.UpdateUsernameDuxo$updateProfile$1$1", m3645f = "UpdateUsernameDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.matcha.ui.username.UpdateUsernameDuxo$updateProfile$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UpdateUsernameDataState, Continuation<? super UpdateUsernameDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UpdateUsernameDataState updateUsernameDataState, Continuation<? super UpdateUsernameDataState> continuation) {
                    return ((AnonymousClass1) create(updateUsernameDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return UpdateUsernameDataState.copy$default((UpdateUsernameDataState) this.L$0, null, null, true, null, 11, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                UpdateUsernameDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        }).doOnComplete(new Action() { // from class: com.robinhood.android.matcha.ui.username.UpdateUsernameDuxo.updateProfile.2
            @Override // io.reactivex.functions.Action
            public final void run() {
                UpdateUsernameDuxo.this.userStore.refresh(true);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDoOnComplete, "doOnComplete(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableDoOnComplete, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.matcha.ui.username.UpdateUsernameDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UpdateUsernameDuxo.updateProfile$lambda$2(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.matcha.ui.username.UpdateUsernameDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UpdateUsernameDuxo.updateProfile$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateProfile$lambda$2(UpdateUsernameDuxo updateUsernameDuxo) {
        updateUsernameDuxo.applyMutation(new UpdateUsernameDuxo4(null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateProfile$lambda$3(UpdateUsernameDuxo updateUsernameDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            updateUsernameDuxo.applyMutation(new UpdateUsernameDuxo5(t, null));
            return Unit.INSTANCE;
        }
        throw t;
    }
}
