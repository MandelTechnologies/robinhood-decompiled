package com.robinhood.android.matcha.p177ui.deeplink;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.matcha.MatchaApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.ApiSocialProfileInfo;
import com.robinhood.udf.UiEvent;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MatchaTransferDeeplinkDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/deeplink/MatchaTransferDeeplinkDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/matcha/ui/deeplink/MatchaTransferDeeplinkState;", "Lcom/robinhood/android/udf/HasSavedState;", "matchaApi", "Lcom/robinhood/api/matcha/MatchaApi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/api/matcha/MatchaApi;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchaTransferDeeplinkDuxo extends OldBaseDuxo<MatchaTransferDeeplinkState> implements HasSavedState {
    private final MatchaApi matchaApi;
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
    public MatchaTransferDeeplinkDuxo(MatchaApi matchaApi, SavedStateHandle savedStateHandle) {
        super(new MatchaTransferDeeplinkState(null, 1, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.matchaApi = matchaApi;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C213151(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.deeplink.MatchaTransferDeeplinkDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaTransferDeeplinkDuxo.onStart$lambda$1(this.f$0, (ApiSocialProfileInfo) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.matcha.ui.deeplink.MatchaTransferDeeplinkDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaTransferDeeplinkDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: MatchaTransferDeeplinkDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiSocialProfileInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.deeplink.MatchaTransferDeeplinkDuxo$onStart$1", m3645f = "MatchaTransferDeeplinkDuxo.kt", m3646l = {29}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.deeplink.MatchaTransferDeeplinkDuxo$onStart$1 */
    static final class C213151 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiSocialProfileInfo>, Object> {
        int label;

        C213151(Continuation<? super C213151> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchaTransferDeeplinkDuxo.this.new C213151(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiSocialProfileInfo> continuation) {
            return ((C213151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            MatchaApi matchaApi = MatchaTransferDeeplinkDuxo.this.matchaApi;
            String userId = ((LegacyIntentKey.MatchaTransferFromDeepLink) MatchaTransferDeeplinkDuxo.INSTANCE.getExtras((HasSavedState) MatchaTransferDeeplinkDuxo.this)).getUserId();
            this.label = 1;
            Object userSocialProfile = matchaApi.getUserSocialProfile(userId, this);
            return userSocialProfile == coroutine_suspended ? coroutine_suspended : userSocialProfile;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(MatchaTransferDeeplinkDuxo matchaTransferDeeplinkDuxo, final ApiSocialProfileInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        matchaTransferDeeplinkDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.deeplink.MatchaTransferDeeplinkDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaTransferDeeplinkDuxo.onStart$lambda$1$lambda$0(it, (MatchaTransferDeeplinkState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchaTransferDeeplinkState onStart$lambda$1$lambda$0(ApiSocialProfileInfo apiSocialProfileInfo, MatchaTransferDeeplinkState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(new UiEvent<>(Result.m28549boximpl(Result.m28550constructorimpl(apiSocialProfileInfo))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(MatchaTransferDeeplinkDuxo matchaTransferDeeplinkDuxo, final Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        matchaTransferDeeplinkDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.deeplink.MatchaTransferDeeplinkDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaTransferDeeplinkDuxo.onStart$lambda$3$lambda$2(it, (MatchaTransferDeeplinkState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchaTransferDeeplinkState onStart$lambda$3$lambda$2(Throwable th, MatchaTransferDeeplinkState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Result.Companion companion = Result.INSTANCE;
        return applyMutation.copy(new UiEvent<>(Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(th)))));
    }

    /* compiled from: MatchaTransferDeeplinkDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/deeplink/MatchaTransferDeeplinkDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/matcha/ui/deeplink/MatchaTransferDeeplinkDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$MatchaTransferFromDeepLink;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<MatchaTransferDeeplinkDuxo, LegacyIntentKey.MatchaTransferFromDeepLink> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public LegacyIntentKey.MatchaTransferFromDeepLink getExtras(SavedStateHandle savedStateHandle) {
            return (LegacyIntentKey.MatchaTransferFromDeepLink) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public LegacyIntentKey.MatchaTransferFromDeepLink getExtras(MatchaTransferDeeplinkDuxo matchaTransferDeeplinkDuxo) {
            return (LegacyIntentKey.MatchaTransferFromDeepLink) DuxoCompanion2.DefaultImpls.getExtras(this, matchaTransferDeeplinkDuxo);
        }
    }
}
