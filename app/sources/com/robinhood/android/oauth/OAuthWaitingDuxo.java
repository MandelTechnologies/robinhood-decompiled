package com.robinhood.android.oauth;

import android.net.Uri;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.oauth.targets.OAuthWaitingEvent;
import com.robinhood.android.security.contracts.OAuthWaitingFragmentKey;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.models.api.ApplicationIsInternalResponse;
import com.robinhood.models.api.OAuthAuthorizeRequest;
import com.robinhood.models.api.OAuthAuthorizeResponse;
import com.robinhood.rosetta.eventlogging.OAuthInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: OAuthWaitingDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0006\u0010\u0012\u001a\u00020\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/oauth/OAuthWaitingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/oauth/targets/OAuthWaitingEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/api/retrofit/Sheriff;Lcom/robinhood/analytics/SharedEventLogger;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "onErrorDialogDismissed", "Companion", "feature-oauth_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class OAuthWaitingDuxo extends BaseDuxo5<Unit, OAuthWaitingEvent> implements HasSavedState {
    private static final String CLIENT_ERROR = "client";
    private static final long MIN_LOADING_TIME = 2000;
    private static final String QUERY_PARAM_ERROR = "error";
    private static final String RESPONSE_TYPE_CODE = "code";
    private static final String USER_CONSENT_NOT_SUPPORTED = "user_consent_not_supported";
    private final SharedEventLogger eventLogger;
    private final SavedStateHandle savedStateHandle;
    private final Sheriff sheriff;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OAuthWaitingDuxo(Sheriff sheriff, SharedEventLogger eventLogger, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.sheriff = sheriff;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: OAuthWaitingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.oauth.OAuthWaitingDuxo$onResume$1", m3645f = "OAuthWaitingDuxo.kt", m3646l = {36, 38, EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.oauth.OAuthWaitingDuxo$onResume$1 */
    static final class C226241 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C226241(Continuation<? super C226241> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C226241 c226241 = OAuthWaitingDuxo.this.new C226241(continuation);
            c226241.L$0 = obj;
            return c226241;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C226241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0189  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Job jobLaunch$default;
            Object objApplicationIsInternal;
            OAuthWaitingEvent.LaunchDeeplink launchDeeplink;
            Object objOAuthAuthorize;
            OAuthWaitingEvent.LaunchDeeplink launchDeeplink2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                OAuthWaitingDuxo.this.submit(new OAuthWaitingEvent.Error(th));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                jobLaunch$default = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new OAuthWaitingDuxo2(null), 3, null);
                Sheriff sheriff = OAuthWaitingDuxo.this.sheriff;
                String clientId = ((OAuthWaitingFragmentKey) OAuthWaitingDuxo.INSTANCE.getArgs((HasSavedState) OAuthWaitingDuxo.this)).getClientId();
                this.L$0 = jobLaunch$default;
                this.label = 1;
                objApplicationIsInternal = sheriff.applicationIsInternal(clientId, this);
                if (objApplicationIsInternal == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    launchDeeplink2 = (OAuthWaitingEvent.LaunchDeeplink) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    OAuthWaitingDuxo.this.submit(launchDeeplink2);
                    return Unit.INSTANCE;
                }
                jobLaunch$default = (Job) this.L$0;
                ResultKt.throwOnFailure(obj);
                objOAuthAuthorize = obj;
                SharedEventLogger sharedEventLogger = OAuthWaitingDuxo.this.eventLogger;
                OAuthInfo.OAuthStep oAuthStep = OAuthInfo.OAuthStep.SERVER_RETURNED_REDIRECT_URI;
                Companion companion = OAuthWaitingDuxo.INSTANCE;
                SharedEventLogger.DefaultImpls.logAccountSecurityEvent$default(sharedEventLogger, null, null, new OAuthInfo(oAuthStep, ((OAuthWaitingFragmentKey) companion.getArgs((HasSavedState) OAuthWaitingDuxo.this)).getClientId(), ((OAuthWaitingFragmentKey) companion.getArgs((HasSavedState) OAuthWaitingDuxo.this)).getReferenceId(), null, null, null, 56, null), null, null, 27, null);
                Uri uri = Uri.parse(((OAuthAuthorizeResponse) objOAuthAuthorize).getUri());
                Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                launchDeeplink = new OAuthWaitingEvent.LaunchDeeplink(uri);
                this.L$0 = launchDeeplink;
                this.label = 3;
                if (jobLaunch$default.join(this) != coroutine_suspended) {
                    launchDeeplink2 = launchDeeplink;
                    OAuthWaitingDuxo.this.submit(launchDeeplink2);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            jobLaunch$default = (Job) this.L$0;
            ResultKt.throwOnFailure(obj);
            objApplicationIsInternal = obj;
            if (((ApplicationIsInternalResponse) objApplicationIsInternal).isInternal()) {
                Sheriff sheriff2 = OAuthWaitingDuxo.this.sheriff;
                Companion companion2 = OAuthWaitingDuxo.INSTANCE;
                OAuthAuthorizeRequest oAuthAuthorizeRequest = new OAuthAuthorizeRequest(((OAuthWaitingFragmentKey) companion2.getArgs((HasSavedState) OAuthWaitingDuxo.this)).getRedirectUri(), ((OAuthWaitingFragmentKey) companion2.getArgs((HasSavedState) OAuthWaitingDuxo.this)).getClientId(), ((OAuthWaitingFragmentKey) companion2.getArgs((HasSavedState) OAuthWaitingDuxo.this)).getScope(), OAuthWaitingDuxo.RESPONSE_TYPE_CODE, ((OAuthWaitingFragmentKey) companion2.getArgs((HasSavedState) OAuthWaitingDuxo.this)).getState(), true);
                this.L$0 = jobLaunch$default;
                this.label = 2;
                objOAuthAuthorize = sheriff2.oAuthAuthorize(oAuthAuthorizeRequest, this);
                if (objOAuthAuthorize == coroutine_suspended) {
                    return coroutine_suspended;
                }
                SharedEventLogger sharedEventLogger2 = OAuthWaitingDuxo.this.eventLogger;
                OAuthInfo.OAuthStep oAuthStep2 = OAuthInfo.OAuthStep.SERVER_RETURNED_REDIRECT_URI;
                Companion companion3 = OAuthWaitingDuxo.INSTANCE;
                SharedEventLogger.DefaultImpls.logAccountSecurityEvent$default(sharedEventLogger2, null, null, new OAuthInfo(oAuthStep2, ((OAuthWaitingFragmentKey) companion3.getArgs((HasSavedState) OAuthWaitingDuxo.this)).getClientId(), ((OAuthWaitingFragmentKey) companion3.getArgs((HasSavedState) OAuthWaitingDuxo.this)).getReferenceId(), null, null, null, 56, null), null, null, 27, null);
                Uri uri2 = Uri.parse(((OAuthAuthorizeResponse) objOAuthAuthorize).getUri());
                Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
                launchDeeplink = new OAuthWaitingEvent.LaunchDeeplink(uri2);
                this.L$0 = launchDeeplink;
                this.label = 3;
                if (jobLaunch$default.join(this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            SharedEventLogger sharedEventLogger3 = OAuthWaitingDuxo.this.eventLogger;
            OAuthInfo.OAuthStep oAuthStep3 = OAuthInfo.OAuthStep.CLIENT_GENERATED_REDIRECT_URI;
            Companion companion4 = OAuthWaitingDuxo.INSTANCE;
            SharedEventLogger.DefaultImpls.logAccountSecurityEvent$default(sharedEventLogger3, null, null, new OAuthInfo(oAuthStep3, ((OAuthWaitingFragmentKey) companion4.getArgs((HasSavedState) OAuthWaitingDuxo.this)).getClientId(), ((OAuthWaitingFragmentKey) companion4.getArgs((HasSavedState) OAuthWaitingDuxo.this)).getReferenceId(), OAuthWaitingDuxo.USER_CONSENT_NOT_SUPPORTED, null, null, 48, null), null, null, 27, null);
            Uri uriBuild = Uri.parse(((OAuthWaitingFragmentKey) companion4.getArgs((HasSavedState) OAuthWaitingDuxo.this)).getRedirectUri()).buildUpon().appendQueryParameter("error", OAuthWaitingDuxo.USER_CONSENT_NOT_SUPPORTED).build();
            Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
            launchDeeplink = new OAuthWaitingEvent.LaunchDeeplink(uriBuild);
            this.L$0 = launchDeeplink;
            this.label = 3;
            if (jobLaunch$default.join(this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        getLifecycleScope().launchWhenResumed(new C226241(null));
    }

    public final void onErrorDialogDismissed() {
        SharedEventLogger sharedEventLogger = this.eventLogger;
        OAuthInfo.OAuthStep oAuthStep = OAuthInfo.OAuthStep.CLIENT_GENERATED_REDIRECT_URI;
        Companion companion = INSTANCE;
        SharedEventLogger.DefaultImpls.logAccountSecurityEvent$default(sharedEventLogger, null, null, new OAuthInfo(oAuthStep, ((OAuthWaitingFragmentKey) companion.getArgs((HasSavedState) this)).getClientId(), ((OAuthWaitingFragmentKey) companion.getArgs((HasSavedState) this)).getReferenceId(), CLIENT_ERROR, null, null, 48, null), null, null, 27, null);
        Uri uriBuild = Uri.parse(((OAuthWaitingFragmentKey) companion.getArgs((HasSavedState) this)).getRedirectUri()).buildUpon().appendQueryParameter("error", CLIENT_ERROR).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
        submit(new OAuthWaitingEvent.LaunchDeeplink(uriBuild));
    }

    /* compiled from: OAuthWaitingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/oauth/OAuthWaitingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/oauth/OAuthWaitingDuxo;", "Lcom/robinhood/android/security/contracts/OAuthWaitingFragmentKey;", "<init>", "()V", "RESPONSE_TYPE_CODE", "", "QUERY_PARAM_ERROR", "USER_CONSENT_NOT_SUPPORTED", "CLIENT_ERROR", "MIN_LOADING_TIME", "", "feature-oauth_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OAuthWaitingDuxo, OAuthWaitingFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OAuthWaitingFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (OAuthWaitingFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OAuthWaitingFragmentKey getArgs(OAuthWaitingDuxo oAuthWaitingDuxo) {
            return (OAuthWaitingFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, oAuthWaitingDuxo);
        }
    }
}
