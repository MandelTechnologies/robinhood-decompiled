package com.robinhood.android.matcha.p177ui.profile;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.profile.MatchaProfileEvent;
import com.robinhood.android.models.matcha.api.ApiRhyAccountCheck;
import com.robinhood.android.models.matcha.api.profile.ApiMiniProfileResponse;
import com.robinhood.android.social.contracts.matcha.MatchaProfile;
import com.robinhood.android.social.contracts.matcha.MatchaTransaction;
import com.robinhood.android.store.social.SocialBlockingStore;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.api.matcha.MatchaApi;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.GenericAlertErrorResponse;
import com.robinhood.models.api.bonfire.ApiSocialBlockingResponse;
import com.robinhood.models.api.bonfire.ApiSocialProfileInfo;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MatchaProfileDuxo.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 %2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001%B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0015J\u0006\u0010\u001a\u001a\u00020\u0015J\u0006\u0010\u001b\u001a\u00020\u0015J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u000e\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/profile/MatchaProfileDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileDataState;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileViewState;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "matchaApi", "Lcom/robinhood/api/matcha/MatchaApi;", "blockingStore", "Lcom/robinhood/android/store/social/SocialBlockingStore;", "stateProvider", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/api/matcha/MatchaApi;Lcom/robinhood/android/store/social/SocialBlockingStore;Lcom/robinhood/android/matcha/ui/profile/MatchaProfileStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "showBlockConfirmationDialog", "show", "", "toggleBlockState", "reportProfile", "showOverflowMenu", "Lio/reactivex/Single;", "Lcom/robinhood/models/api/bonfire/ApiSocialBlockingResponse;", "profile", "Lcom/robinhood/models/api/bonfire/ApiSocialProfileInfo;", "getBlockConfirmationText", "Lcom/robinhood/utils/resource/StringResource;", "createTransaction", "direction", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchaProfileDuxo extends BaseDuxo3<MatchaProfileDataState, MatchaProfileViewState, MatchaProfileEvent> implements HasSavedState {
    private final SocialBlockingStore blockingStore;
    private final MatchaApi matchaApi;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MatchaProfileDuxo(MatchaApi matchaApi, SocialBlockingStore blockingStore, MatchaProfileStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
        Intrinsics.checkNotNullParameter(blockingStore, "blockingStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new MatchaProfileDataState(false, ((MatchaProfile) companion.getArgs(savedStateHandle)).getDirection(), ((MatchaProfile) companion.getArgs(savedStateHandle)).getIsPreOnboarding(), null, null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, null), stateProvider, duxoBundle);
        this.matchaApi = matchaApi;
        this.blockingStore = blockingStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C214131(null), 3, null);
    }

    /* compiled from: MatchaProfileDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.profile.MatchaProfileDuxo$onStart$1", m3645f = "MatchaProfileDuxo.kt", m3646l = {47, 48, 49}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.profile.MatchaProfileDuxo$onStart$1 */
    static final class C214131 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        C214131(Continuation<? super C214131> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchaProfileDuxo.this.new C214131(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C214131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String userId;
            ApiMiniProfileResponse apiMiniProfileResponse;
            Object hasRhyAccountOrApplication;
            ApiSocialProfileInfo apiSocialProfileInfo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(th);
                GenericAlertErrorResponse genericAlertErrorResponse = errorResponseExtractErrorResponse instanceof GenericAlertErrorResponse ? (GenericAlertErrorResponse) errorResponseExtractErrorResponse : null;
                GenericAlert alert = genericAlertErrorResponse != null ? genericAlertErrorResponse.getAlert() : null;
                if (Throwables.isNetworkRelated(th) && alert != null) {
                    MatchaProfileDuxo.this.applyMutation(new AnonymousClass2(alert, null));
                } else {
                    if (!Throwables.isNetworkRelated(th)) {
                        throw th;
                    }
                    MatchaProfileDuxo.this.submit(new MatchaProfileEvent.Error(th));
                }
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                userId = ((MatchaProfile) MatchaProfileDuxo.INSTANCE.getArgs((HasSavedState) MatchaProfileDuxo.this)).getUserId();
                MatchaApi matchaApi = MatchaProfileDuxo.this.matchaApi;
                this.L$0 = userId;
                this.label = 1;
                obj = matchaApi.getMiniProfile(userId, this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    apiSocialProfileInfo = (ApiSocialProfileInfo) this.L$1;
                    apiMiniProfileResponse = (ApiMiniProfileResponse) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    MatchaProfileDuxo.this.applyMutation(new AnonymousClass1((ApiRhyAccountCheck) obj, apiMiniProfileResponse, apiSocialProfileInfo, null));
                    return Unit.INSTANCE;
                }
                apiMiniProfileResponse = (ApiMiniProfileResponse) this.L$0;
                ResultKt.throwOnFailure(obj);
                ApiSocialProfileInfo apiSocialProfileInfo2 = (ApiSocialProfileInfo) obj;
                MatchaApi matchaApi2 = MatchaProfileDuxo.this.matchaApi;
                this.L$0 = apiMiniProfileResponse;
                this.L$1 = apiSocialProfileInfo2;
                this.label = 3;
                hasRhyAccountOrApplication = matchaApi2.getHasRhyAccountOrApplication(this);
                if (hasRhyAccountOrApplication != coroutine_suspended) {
                    apiSocialProfileInfo = apiSocialProfileInfo2;
                    obj = hasRhyAccountOrApplication;
                    MatchaProfileDuxo.this.applyMutation(new AnonymousClass1((ApiRhyAccountCheck) obj, apiMiniProfileResponse, apiSocialProfileInfo, null));
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            userId = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
            ApiMiniProfileResponse apiMiniProfileResponse2 = (ApiMiniProfileResponse) obj;
            MatchaApi matchaApi3 = MatchaProfileDuxo.this.matchaApi;
            this.L$0 = apiMiniProfileResponse2;
            this.label = 2;
            Object userSocialProfile = matchaApi3.getUserSocialProfile(userId, this);
            if (userSocialProfile == coroutine_suspended) {
                return coroutine_suspended;
            }
            apiMiniProfileResponse = apiMiniProfileResponse2;
            obj = userSocialProfile;
            ApiSocialProfileInfo apiSocialProfileInfo22 = (ApiSocialProfileInfo) obj;
            MatchaApi matchaApi22 = MatchaProfileDuxo.this.matchaApi;
            this.L$0 = apiMiniProfileResponse;
            this.L$1 = apiSocialProfileInfo22;
            this.label = 3;
            hasRhyAccountOrApplication = matchaApi22.getHasRhyAccountOrApplication(this);
            if (hasRhyAccountOrApplication != coroutine_suspended) {
            }
            return coroutine_suspended;
        }

        /* compiled from: MatchaProfileDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.profile.MatchaProfileDuxo$onStart$1$1", m3645f = "MatchaProfileDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.matcha.ui.profile.MatchaProfileDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MatchaProfileDataState, Continuation<? super MatchaProfileDataState>, Object> {
            final /* synthetic */ ApiRhyAccountCheck $hasRhyAccountOrApplication;
            final /* synthetic */ ApiMiniProfileResponse $miniProfile;
            final /* synthetic */ ApiSocialProfileInfo $socialProfile;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiRhyAccountCheck apiRhyAccountCheck, ApiMiniProfileResponse apiMiniProfileResponse, ApiSocialProfileInfo apiSocialProfileInfo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$hasRhyAccountOrApplication = apiRhyAccountCheck;
                this.$miniProfile = apiMiniProfileResponse;
                this.$socialProfile = apiSocialProfileInfo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$hasRhyAccountOrApplication, this.$miniProfile, this.$socialProfile, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MatchaProfileDataState matchaProfileDataState, Continuation<? super MatchaProfileDataState> continuation) {
                return ((AnonymousClass1) create(matchaProfileDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MatchaProfileDataState.copy$default((MatchaProfileDataState) this.L$0, this.$hasRhyAccountOrApplication.getAccount_or_application_exist(), null, false, this.$miniProfile, this.$socialProfile, false, null, 102, null);
            }
        }

        /* compiled from: MatchaProfileDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.profile.MatchaProfileDuxo$onStart$1$2", m3645f = "MatchaProfileDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.matcha.ui.profile.MatchaProfileDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<MatchaProfileDataState, Continuation<? super MatchaProfileDataState>, Object> {
            final /* synthetic */ GenericAlert $errorAlert;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(GenericAlert genericAlert, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$errorAlert = genericAlert;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$errorAlert, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MatchaProfileDataState matchaProfileDataState, Continuation<? super MatchaProfileDataState> continuation) {
                return ((AnonymousClass2) create(matchaProfileDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MatchaProfileDataState.copy$default((MatchaProfileDataState) this.L$0, false, null, false, null, null, false, this.$errorAlert, 63, null);
            }
        }
    }

    /* compiled from: MatchaProfileDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.profile.MatchaProfileDuxo$showBlockConfirmationDialog$1", m3645f = "MatchaProfileDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.profile.MatchaProfileDuxo$showBlockConfirmationDialog$1 */
    static final class C214141 extends ContinuationImpl7 implements Function2<MatchaProfileDataState, Continuation<? super MatchaProfileDataState>, Object> {
        final /* synthetic */ boolean $show;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C214141(boolean z, Continuation<? super C214141> continuation) {
            super(2, continuation);
            this.$show = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C214141 c214141 = new C214141(this.$show, continuation);
            c214141.L$0 = obj;
            return c214141;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchaProfileDataState matchaProfileDataState, Continuation<? super MatchaProfileDataState> continuation) {
            return ((C214141) create(matchaProfileDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MatchaProfileDataState.copy$default((MatchaProfileDataState) this.L$0, false, null, false, null, null, this.$show, null, 95, null);
        }
    }

    public final void showBlockConfirmationDialog(boolean show) {
        applyMutation(new C214141(show, null));
    }

    /* compiled from: MatchaProfileDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.profile.MatchaProfileDuxo$toggleBlockState$1", m3645f = "MatchaProfileDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.profile.MatchaProfileDuxo$toggleBlockState$1 */
    static final class C214151 extends ContinuationImpl7 implements Function2<MatchaProfileDataState, Continuation<? super MatchaProfileDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C214151(Continuation<? super C214151> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C214151 c214151 = new C214151(continuation);
            c214151.L$0 = obj;
            return c214151;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchaProfileDataState matchaProfileDataState, Continuation<? super MatchaProfileDataState> continuation) {
            return ((C214151) create(matchaProfileDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MatchaProfileDataState.copy$default((MatchaProfileDataState) this.L$0, false, null, false, null, null, false, null, 95, null);
        }
    }

    public final void toggleBlockState() {
        applyMutation(new C214151(null));
        withDataState(new Function1() { // from class: com.robinhood.android.matcha.ui.profile.MatchaProfileDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaProfileDuxo.toggleBlockState$lambda$2(this.f$0, (MatchaProfileDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toggleBlockState$lambda$2(final MatchaProfileDuxo matchaProfileDuxo, MatchaProfileDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ApiSocialProfileInfo socialProfile = dataState.getSocialProfile();
        if (socialProfile == null) {
            return Unit.INSTANCE;
        }
        Single<R> singleFlatMap = matchaProfileDuxo.toggleBlockState(socialProfile).flatMap(new Function() { // from class: com.robinhood.android.matcha.ui.profile.MatchaProfileDuxo$toggleBlockState$2$1

            /* compiled from: MatchaProfileDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiSocialProfileInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.profile.MatchaProfileDuxo$toggleBlockState$2$1$1", m3645f = "MatchaProfileDuxo.kt", m3646l = {89}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.matcha.ui.profile.MatchaProfileDuxo$toggleBlockState$2$1$1 */
            static final class C214161 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiSocialProfileInfo>, Object> {
                int label;
                final /* synthetic */ MatchaProfileDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C214161(MatchaProfileDuxo matchaProfileDuxo, Continuation<? super C214161> continuation) {
                    super(2, continuation);
                    this.this$0 = matchaProfileDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C214161(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiSocialProfileInfo> continuation) {
                    return ((C214161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    String userId = ((MatchaProfile) MatchaProfileDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getUserId();
                    this.label = 1;
                    Object userSocialProfile = matchaApi.getUserSocialProfile(userId, this);
                    return userSocialProfile == coroutine_suspended ? coroutine_suspended : userSocialProfile;
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends ApiSocialProfileInfo> apply(ApiSocialBlockingResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                MatchaProfileDuxo matchaProfileDuxo2 = this.this$0;
                return RxFactory.DefaultImpls.rxSingle$default(matchaProfileDuxo2, null, new C214161(matchaProfileDuxo2, null), 1, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(matchaProfileDuxo, singleFlatMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.profile.MatchaProfileDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaProfileDuxo.toggleBlockState$lambda$2$lambda$0(this.f$0, (ApiSocialProfileInfo) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.matcha.ui.profile.MatchaProfileDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaProfileDuxo.toggleBlockState$lambda$2$lambda$1(this.f$0, (Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toggleBlockState$lambda$2$lambda$0(MatchaProfileDuxo matchaProfileDuxo, ApiSocialProfileInfo apiSocialProfileInfo) {
        Intrinsics.checkNotNull(apiSocialProfileInfo);
        matchaProfileDuxo.submit(new MatchaProfileEvent.BlockResult(Result.m28550constructorimpl(matchaProfileDuxo.getBlockConfirmationText(apiSocialProfileInfo))));
        matchaProfileDuxo.applyMutation(new MatchaProfileDuxo3(apiSocialProfileInfo, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toggleBlockState$lambda$2$lambda$1(MatchaProfileDuxo matchaProfileDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Result.Companion companion = Result.INSTANCE;
        matchaProfileDuxo.submit(new MatchaProfileEvent.BlockResult(Result.m28550constructorimpl(ResultKt.createFailure(throwable))));
        return Unit.INSTANCE;
    }

    public final void reportProfile() {
        withDataState(new Function1() { // from class: com.robinhood.android.matcha.ui.profile.MatchaProfileDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaProfileDuxo.reportProfile$lambda$3(this.f$0, (MatchaProfileDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportProfile$lambda$3(MatchaProfileDuxo matchaProfileDuxo, MatchaProfileDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ApiSocialProfileInfo socialProfile = dataState.getSocialProfile();
        if (socialProfile == null) {
            return Unit.INSTANCE;
        }
        matchaProfileDuxo.submit(new MatchaProfileEvent.Report(socialProfile));
        return Unit.INSTANCE;
    }

    public final void showOverflowMenu() {
        withDataState(new Function1() { // from class: com.robinhood.android.matcha.ui.profile.MatchaProfileDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaProfileDuxo.showOverflowMenu$lambda$4(this.f$0, (MatchaProfileDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showOverflowMenu$lambda$4(MatchaProfileDuxo matchaProfileDuxo, MatchaProfileDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        matchaProfileDuxo.submit(new MatchaProfileEvent.ShowMenu(it.getCanReportUser(), it.isUserBlocked()));
        return Unit.INSTANCE;
    }

    private final Single<ApiSocialBlockingResponse> toggleBlockState(ApiSocialProfileInfo profile) {
        String block_relationship_id = profile.getBlock_relationship_id();
        UUID uuid = block_relationship_id != null ? StringsKt.toUuid(block_relationship_id) : null;
        if (uuid != null) {
            return this.blockingStore.unblockUser(uuid);
        }
        return this.blockingStore.block(((MatchaProfile) INSTANCE.getArgs((HasSavedState) this)).getUserId());
    }

    private final StringResource getBlockConfirmationText(ApiSocialProfileInfo profile) {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        if (profile.isBlocked()) {
            i = C21284R.string.matcha_profile_blocked_user_action;
        } else {
            i = C21284R.string.matcha_profile_unblocked_user_action;
        }
        return companion.invoke(i, profile.getFull_name());
    }

    public final void createTransaction(final MatchaTransaction.Direction direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        withDataState(new Function1() { // from class: com.robinhood.android.matcha.ui.profile.MatchaProfileDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaProfileDuxo.createTransaction$lambda$5(this.f$0, direction, (MatchaProfileDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createTransaction$lambda$5(MatchaProfileDuxo matchaProfileDuxo, MatchaTransaction.Direction direction, MatchaProfileDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ApiSocialProfileInfo socialProfile = dataState.getSocialProfile();
        if (socialProfile == null) {
            return Unit.INSTANCE;
        }
        if (dataState.getHasRhyAccountOrApplication()) {
            matchaProfileDuxo.submit(new MatchaProfileEvent.CreateTransaction(direction, socialProfile));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: MatchaProfileDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/profile/MatchaProfileDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileDuxo;", "Lcom/robinhood/android/social/contracts/matcha/MatchaProfile;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MatchaProfileDuxo, MatchaProfile> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchaProfile getArgs(SavedStateHandle savedStateHandle) {
            return (MatchaProfile) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchaProfile getArgs(MatchaProfileDuxo matchaProfileDuxo) {
            return (MatchaProfile) DuxoCompanion.DefaultImpls.getArgs(this, matchaProfileDuxo);
        }
    }
}
