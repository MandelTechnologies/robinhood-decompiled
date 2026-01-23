package com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.sdk.wrapper;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.plaid.link.result.LinkAccount;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadataStatus;
import com.plaid.link.result.LinkInstitution;
import com.plaid.link.result.LinkResult;
import com.plaid.link.result.LinkSuccess;
import com.plaid.link.result.LinkSuccessMetadata;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.sdk.wrapper.PlaidSdkEvent;
import com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.sdk.wrapper.PlaidSdkFragment;
import com.robinhood.android.models.creditcard.api.plaid.underwriting.Account;
import com.robinhood.android.models.creditcard.api.plaid.underwriting.PlaidSdkRequestMetadata;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.IAVContext;
import com.robinhood.rosetta.eventlogging.PlaidEventData;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PlaidSdkDuxo.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001aJ&\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010#\u001a\u00020$*\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010&¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/sdk/wrapper/PlaidSdkDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/sdk/wrapper/PlaidSdkEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onLinkToken", "linkToken", "", "onPlaidError", "t", "", "handlePlaidCallback", "result", "Lcom/plaid/link/result/LinkResult;", "sessionId", "args", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/sdk/wrapper/PlaidSdkFragment$Args;", "callbacks", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/sdk/wrapper/PlaidSdkFragment$Callbacks;", "isInvalidLinkTokenError", "", "Lcom/plaid/link/result/LinkExit;", "(Lcom/plaid/link/result/LinkExit;)Z", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class PlaidSdkDuxo extends BaseDuxo5<Unit, PlaidSdkEvent> implements HasSavedState {
    public static final int $stable = 8;
    private final AnalyticsLogger analytics;
    private final EventLogger eventLogger;
    private final SavedStateHandle savedStateHandle;

    public final AnalyticsLogger getAnalytics() {
        return this.analytics;
    }

    public final EventLogger getEventLogger() {
        return this.eventLogger;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidSdkDuxo(AnalyticsLogger analytics, EventLogger eventLogger, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.analytics = analytics;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
    }

    public final void onLinkToken(String linkToken) {
        Intrinsics.checkNotNullParameter(linkToken, "linkToken");
        IdlingResourceCounters2.setBusy(IdlingResourceType.PLAID_SDK_OPEN, true);
        submit(new PlaidSdkEvent.LinkTokenEvent(linkToken));
    }

    public final void onPlaidError(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        submit(new PlaidSdkEvent.ErrorEvent(t));
    }

    /* compiled from: PlaidSdkDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.sdk.wrapper.PlaidSdkDuxo$handlePlaidCallback$1", m3645f = "PlaidSdkDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.sdk.wrapper.PlaidSdkDuxo$handlePlaidCallback$1 */
    static final class C125221 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PlaidSdkFragment.Args $args;
        final /* synthetic */ PlaidSdkFragment.Callbacks $callbacks;
        final /* synthetic */ LinkResult $result;
        final /* synthetic */ String $sessionId;
        int label;
        final /* synthetic */ PlaidSdkDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C125221(LinkResult linkResult, PlaidSdkDuxo plaidSdkDuxo, String str, PlaidSdkFragment.Callbacks callbacks, PlaidSdkFragment.Args args, Continuation<? super C125221> continuation) {
            super(2, continuation);
            this.$result = linkResult;
            this.this$0 = plaidSdkDuxo;
            this.$sessionId = str;
            this.$callbacks = callbacks;
            this.$args = args;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C125221(this.$result, this.this$0, this.$sessionId, this.$callbacks, this.$args, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C125221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            String name;
            String id;
            LinkErrorCode errorCode;
            String jsonValue;
            String name2;
            String id2;
            String errorMessage;
            LinkErrorCode errorCode2;
            LinkErrorCode errorCode3;
            String json;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LinkResult linkResult = this.$result;
            if (linkResult instanceof LinkSuccess) {
                try {
                    LinkSuccessMetadata metadata = ((LinkSuccess) linkResult).getMetadata();
                    EventLogger eventLogger = this.this$0.getEventLogger();
                    IAVContext iAVContext = new IAVContext(null, this.$sessionId, null, null, 13, null);
                    PlaidEventData.Event event = PlaidEventData.Event.ON_SUCCESS;
                    LinkInstitution institution = metadata.getInstitution();
                    String str = (institution == null || (id = institution.getId()) == null) ? "" : id;
                    LinkInstitution institution2 = metadata.getInstitution();
                    EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(UserInteractionEventData.EventType.PLAID_IAV, null, null, null, new Context(0, 0, 0, null, null, null, null, Context.ProductTag.IAV, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PlaidEventData(event, null, null, null, null, null, null, str, (institution2 == null || (name = institution2.getName()) == null) ? "" : name, null, metadata.getLinkSessionId(), null, null, null, null, null, null, PlaidSdkFragment.CREDIT_CARD_PLAID_SOURCE, null, null, 916094, null), iAVContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -49153, -1, -1, -1, -1, 16383, null), null, null, 110, null), false, false, 6, null);
                    AnalyticsLogger analytics = this.this$0.getAnalytics();
                    LinkInstitution institution3 = metadata.getInstitution();
                    String id3 = institution3 != null ? institution3.getId() : null;
                    LinkInstitution institution4 = metadata.getInstitution();
                    analytics.logPlaidLinkConnection(id3, institution4 != null ? institution4.getName() : null, metadata.getLinkSessionId(), PlaidSdkFragment.CREDIT_CARD_PLAID_SOURCE);
                    PlaidSdkFragment.Callbacks callbacks = this.$callbacks;
                    String originalAccountId = this.$args.getOriginalAccountId();
                    String updatedAccountId = this.$args.getUpdatedAccountId();
                    String publicToken = ((LinkSuccess) linkResult).getPublicToken();
                    String linkSessionId = metadata.getLinkSessionId();
                    LinkInstitution institution5 = metadata.getInstitution();
                    String id4 = institution5 != null ? institution5.getId() : null;
                    LinkInstitution institution6 = metadata.getInstitution();
                    PlaidSdkRequestMetadata plaidSdkRequestMetadata = new PlaidSdkRequestMetadata(linkSessionId, id4, institution6 != null ? institution6.getName() : null, PlaidSdkFragment.CREDIT_CARD_PLAID_SOURCE);
                    List<LinkAccount> accounts2 = metadata.getAccounts();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(accounts2, 10));
                    for (LinkAccount linkAccount : accounts2) {
                        String id5 = linkAccount.getId();
                        String name3 = linkAccount.getName();
                        arrayList.add(new Account(id5, null, name3 == null ? "" : name3, linkAccount.getMask(), linkAccount.getSubtype().getAccountType().getJson(), 1));
                    }
                    callbacks.onPlaidAccessTokenGranted(originalAccountId, updatedAccountId, publicToken, plaidSdkRequestMetadata, arrayList);
                } catch (Exception e) {
                    this.$callbacks.onPlaidError(e);
                }
            } else if (linkResult instanceof LinkExit) {
                EventLogger eventLogger2 = this.this$0.getEventLogger();
                IAVContext iAVContext2 = new IAVContext(null, this.$sessionId, null, null, 13, null);
                LinkExit linkExit = (LinkExit) linkResult;
                LinkError error = linkExit.getError();
                String str2 = (error == null || (errorCode3 = error.getErrorCode()) == null || (json = errorCode3.getJson()) == null) ? "" : json;
                LinkError error2 = linkExit.getError();
                String string2 = (error2 == null || (errorCode2 = error2.getErrorCode()) == null) ? null : errorCode2.toString();
                String str3 = string2 == null ? "" : string2;
                LinkError error3 = linkExit.getError();
                String str4 = (error3 == null || (errorMessage = error3.getErrorMessage()) == null) ? "" : errorMessage;
                PlaidEventData.Event event2 = PlaidEventData.Event.ON_EXIT;
                LinkInstitution institution7 = linkExit.getMetadata().getInstitution();
                String str5 = (institution7 == null || (id2 = institution7.getId()) == null) ? "" : id2;
                LinkInstitution institution8 = linkExit.getMetadata().getInstitution();
                String str6 = (institution8 == null || (name2 = institution8.getName()) == null) ? "" : name2;
                String linkSessionId2 = linkExit.getMetadata().getLinkSessionId();
                String str7 = linkSessionId2 == null ? "" : linkSessionId2;
                String requestId = linkExit.getMetadata().getRequestId();
                String str8 = requestId == null ? "" : requestId;
                LinkExitMetadataStatus status = linkExit.getMetadata().getStatus();
                String str9 = null;
                String str10 = null;
                EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger2, new UserInteractionEventData(UserInteractionEventData.EventType.PLAID_IAV, null, null, null, new Context(0, 0, 0, null, null, null, str9, Context.ProductTag.IAV, 0, null, str10, null, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PlaidEventData(event2, null, str3, str4, str2, str9, "", str5, str6, str10, str7, null, str8, null, null, (status == null || (jsonValue = status.getJsonValue()) == null) ? "" : jsonValue, null, PlaidSdkFragment.CREDIT_CARD_PLAID_SOURCE, null, null, 879138, null), iAVContext2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -49153, -1, -1, -1, -1, 16383, null), null, null, 110, null), false, false, 6, null);
                AnalyticsLogger analytics2 = this.this$0.getAnalytics();
                LinkError error4 = linkExit.getError();
                String json2 = (error4 == null || (errorCode = error4.getErrorCode()) == null) ? null : errorCode.getJson();
                LinkError error5 = linkExit.getError();
                String strValueOf = String.valueOf(error5 != null ? error5.getErrorCode() : null);
                LinkError error6 = linkExit.getError();
                String errorMessage2 = error6 != null ? error6.getErrorMessage() : null;
                LinkInstitution institution9 = linkExit.getMetadata().getInstitution();
                String id6 = institution9 != null ? institution9.getId() : null;
                LinkInstitution institution10 = linkExit.getMetadata().getInstitution();
                String name4 = institution10 != null ? institution10.getName() : null;
                String linkSessionId3 = linkExit.getMetadata().getLinkSessionId();
                String requestId2 = linkExit.getMetadata().getRequestId();
                LinkExitMetadataStatus status2 = linkExit.getMetadata().getStatus();
                analytics2.logPlaidExitEvent(json2, strValueOf, errorMessage2, null, id6, name4, linkSessionId3, requestId2, status2 != null ? status2.getJsonValue() : null, PlaidSdkFragment.CREDIT_CARD_PLAID_SOURCE);
                if (!(linkExit.getMetadata().getStatus() instanceof LinkExitMetadataStatus.INSTITUTION_NOT_FOUND)) {
                    if (this.this$0.isInvalidLinkTokenError(linkExit)) {
                        this.this$0.onLinkToken(this.$args.getLinkToken());
                    } else {
                        this.$callbacks.onPlaidExited();
                    }
                } else {
                    this.$callbacks.onPlaidError(null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void handlePlaidCallback(LinkResult result, String sessionId, PlaidSdkFragment.Args args, PlaidSdkFragment.Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C125221(result, this, sessionId, callbacks, args, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isInvalidLinkTokenError(LinkExit linkExit) {
        LinkError error = linkExit.getError();
        LinkErrorCode errorCode = error != null ? error.getErrorCode() : null;
        LinkErrorCode.UNKNOWN unknown = errorCode instanceof LinkErrorCode.UNKNOWN ? (LinkErrorCode.UNKNOWN) errorCode : null;
        return Intrinsics.areEqual(unknown != null ? unknown.getName() : null, "INVALID_LINK_TOKEN");
    }
}
