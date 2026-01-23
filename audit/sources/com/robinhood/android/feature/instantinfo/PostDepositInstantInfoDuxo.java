package com.robinhood.android.feature.instantinfo;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.feature.instantinfo.PostDepositInstantInfoDuxo2;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.instantinfo.ApiPostDepositInstantInfoResponse;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: PostDepositInstantInfoDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/feature/instantinfo/PostDepositInstantInfoDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/feature/instantinfo/PostDepositInstantInfoState;", "Lcom/robinhood/android/udf/HasSavedState;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/android/lib/account/AccountProvider;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "fetchPostDepositInstantInfo", "Companion", "feature-instant-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class PostDepositInstantInfoDuxo extends OldBaseDuxo<PostDepositInstantInfoDuxo2> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final SavedStateHandle savedStateHandle;
    private final TransfersBonfireApi transfersBonfireApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PostDepositInstantInfoDuxo(TransfersBonfireApi transfersBonfireApi, AccountProvider accountProvider, SavedStateHandle savedStateHandle) {
        super(PostDepositInstantInfoDuxo2.Loading.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.transfersBonfireApi = transfersBonfireApi;
        this.accountProvider = accountProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        fetchPostDepositInstantInfo();
    }

    /* compiled from: PostDepositInstantInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/instantinfo/ApiPostDepositInstantInfoResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.instantinfo.PostDepositInstantInfoDuxo$fetchPostDepositInstantInfo$1", m3645f = "PostDepositInstantInfoDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE, 48}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.feature.instantinfo.PostDepositInstantInfoDuxo$fetchPostDepositInstantInfo$1 */
    static final class C166991 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiPostDepositInstantInfoResponse>, Object> {
        int label;

        C166991(Continuation<? super C166991> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PostDepositInstantInfoDuxo.this.new C166991(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiPostDepositInstantInfoResponse> continuation) {
            return ((C166991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable observableFilterIsPresent = ObservablesKt.filterIsPresent(PostDepositInstantInfoDuxo.this.accountProvider.mo22580getActiveAccountNumber());
                this.label = 1;
                obj = RxAwait3.awaitFirst(observableFilterIsPresent, this);
                if (obj != coroutine_suspended) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            String str = (String) obj;
            TransfersBonfireApi transfersBonfireApi = PostDepositInstantInfoDuxo.this.transfersBonfireApi;
            Intrinsics.checkNotNull(str);
            String transferId = ((LegacyIntentKey.PostDepositInstantInfo) PostDepositInstantInfoDuxo.INSTANCE.getExtras((HasSavedState) PostDepositInstantInfoDuxo.this)).getTransferId();
            this.label = 2;
            Object postDepositInstantInfo = transfersBonfireApi.getPostDepositInstantInfo(str, transferId, this);
            return postDepositInstantInfo == coroutine_suspended ? coroutine_suspended : postDepositInstantInfo;
        }
    }

    public final void fetchPostDepositInstantInfo() {
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C166991(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.feature.instantinfo.PostDepositInstantInfoDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostDepositInstantInfoDuxo.fetchPostDepositInstantInfo$lambda$1(this.f$0, (ApiPostDepositInstantInfoResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.feature.instantinfo.PostDepositInstantInfoDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostDepositInstantInfoDuxo.fetchPostDepositInstantInfo$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchPostDepositInstantInfo$lambda$1(PostDepositInstantInfoDuxo postDepositInstantInfoDuxo, final ApiPostDepositInstantInfoResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        postDepositInstantInfoDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.feature.instantinfo.PostDepositInstantInfoDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostDepositInstantInfoDuxo.fetchPostDepositInstantInfo$lambda$1$lambda$0(response, (PostDepositInstantInfoDuxo2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PostDepositInstantInfoDuxo2 fetchPostDepositInstantInfo$lambda$1$lambda$0(ApiPostDepositInstantInfoResponse apiPostDepositInstantInfoResponse, PostDepositInstantInfoDuxo2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new PostDepositInstantInfoDuxo2.Success(apiPostDepositInstantInfoResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchPostDepositInstantInfo$lambda$3(PostDepositInstantInfoDuxo postDepositInstantInfoDuxo, final Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        postDepositInstantInfoDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.feature.instantinfo.PostDepositInstantInfoDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostDepositInstantInfoDuxo.fetchPostDepositInstantInfo$lambda$3$lambda$2(e, (PostDepositInstantInfoDuxo2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PostDepositInstantInfoDuxo2 fetchPostDepositInstantInfo$lambda$3$lambda$2(Throwable th, PostDepositInstantInfoDuxo2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new PostDepositInstantInfoDuxo2.Error(th);
    }

    /* compiled from: PostDepositInstantInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/instantinfo/PostDepositInstantInfoDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/feature/instantinfo/PostDepositInstantInfoDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$PostDepositInstantInfo;", "<init>", "()V", "feature-instant-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<PostDepositInstantInfoDuxo, LegacyIntentKey.PostDepositInstantInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public LegacyIntentKey.PostDepositInstantInfo getExtras(SavedStateHandle savedStateHandle) {
            return (LegacyIntentKey.PostDepositInstantInfo) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public LegacyIntentKey.PostDepositInstantInfo getExtras(PostDepositInstantInfoDuxo postDepositInstantInfoDuxo) {
            return (LegacyIntentKey.PostDepositInstantInfo) DuxoCompanion2.DefaultImpls.getExtras(this, postDepositInstantInfoDuxo);
        }
    }
}
