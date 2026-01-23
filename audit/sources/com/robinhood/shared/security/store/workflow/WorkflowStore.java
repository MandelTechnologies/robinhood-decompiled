package com.robinhood.shared.security.store.workflow;

import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.workflow.p358ui.UiWorkflowActionResponse;
import com.robinhood.models.workflow.p358ui.UiWorkflowActionResponse2;
import com.robinhood.models.workflow.p358ui.screens.UiWorkflowScreen;
import com.robinhood.models.workflow.p358ui.screens.UiWorkflowScreenAction;
import com.robinhood.rosetta.eventlogging.WorkflowInfo;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import identi.service.p471v1.RestIdentiIDLV1Service;
import identi.service.p471v1.models_workflow.p472v1.WorkflowActionRequestDto;
import identi.service.p471v1.models_workflow.p472v1.WorkflowActionResponseDto;
import identi.service.p471v1.models_workflow.p472v1.WorkflowScreenDto;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: WorkflowStore.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m3636d2 = {"Lcom/robinhood/shared/security/store/workflow/WorkflowStore;", "Lcom/robinhood/store/Store;", "Lidenti/service/v1/RestIdentiIDLV1Service;", "identiService", "Lcom/robinhood/analytics/SharedEventLogger;", "eventLogger", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lidenti/service/v1/RestIdentiIDLV1Service;Lcom/robinhood/analytics/SharedEventLogger;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)V", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto;", "params", "Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreenAction;", "action", "Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreen;", "screen", "", "logRequest", "(Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto;Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreenAction;Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreen;)V", "logResponse", "(Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto;Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreen;)V", "", "clientVersion", "Ljava/util/UUID;", "workflowId", "Lcom/robinhood/models/workflow/ui/UiWorkflowActionResponse;", "sendActionRequest", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreenAction;Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreen;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lidenti/service/v1/RestIdentiIDLV1Service;", "Lcom/robinhood/analytics/SharedEventLogger;", "Lj$/time/Clock;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto;", "workflowActionEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "lib-store-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class WorkflowStore extends Store {
    private final Clock clock;
    private final SharedEventLogger eventLogger;
    private final RestIdentiIDLV1Service identiService;
    private final Endpoint<WorkflowActionRequestDto, WorkflowActionResponseDto> workflowActionEndpoint;

    /* compiled from: WorkflowStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.store.workflow.WorkflowStore", m3645f = "WorkflowStore.kt", m3646l = {51}, m3647m = "sendActionRequest")
    /* renamed from: com.robinhood.shared.security.store.workflow.WorkflowStore$sendActionRequest$1 */
    static final class C396811 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C396811(Continuation<? super C396811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WorkflowStore.this.sendActionRequest(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean workflowActionEndpoint$lambda$0(Long l) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkflowStore(RestIdentiIDLV1Service identiService, SharedEventLogger eventLogger, Clock clock, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(identiService, "identiService");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.identiService = identiService;
        this.eventLogger = eventLogger;
        this.clock = clock;
        this.workflowActionEndpoint = Endpoint.INSTANCE.create(new WorkflowStore2(identiService), getLogoutKillswitch(), new WorkflowStore3(null), storeBundle.getClock(), new Function1() { // from class: com.robinhood.shared.security.store.workflow.WorkflowStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(WorkflowStore.workflowActionEndpoint$lambda$0((Long) obj));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendActionRequest(String str, UUID uuid, UiWorkflowScreenAction uiWorkflowScreenAction, UiWorkflowScreen uiWorkflowScreen, Continuation<? super UiWorkflowActionResponse> continuation) {
        C396811 c396811;
        UiWorkflowScreen uiWorkflowScreen2;
        WorkflowActionRequestDto workflowActionRequestDto;
        UUID blockId;
        if (continuation instanceof C396811) {
            c396811 = (C396811) continuation;
            int i = c396811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c396811.label = i - Integer.MIN_VALUE;
            } else {
                c396811 = new C396811(continuation);
            }
        }
        C396811 c3968112 = c396811;
        Object objForceFetch$default = c3968112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3968112.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            String string2 = null;
            WorkflowScreenDto.NameDto apiScreenName = uiWorkflowScreen != null ? uiWorkflowScreen.getApiScreenName() : null;
            if (uiWorkflowScreen != null && (blockId = uiWorkflowScreen.getBlockId()) != null) {
                string2 = blockId.toString();
            }
            String string3 = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            WorkflowActionRequestDto workflowActionRequestDto2 = new WorkflowActionRequestDto(str, apiScreenName, string2, string3, uiWorkflowScreenAction.toApiModel());
            logRequest(workflowActionRequestDto2, uiWorkflowScreenAction, uiWorkflowScreen);
            Endpoint<WorkflowActionRequestDto, WorkflowActionResponseDto> endpoint = this.workflowActionEndpoint;
            c3968112.L$0 = uiWorkflowScreen;
            c3968112.L$1 = workflowActionRequestDto2;
            c3968112.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, workflowActionRequestDto2, null, c3968112, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            uiWorkflowScreen2 = uiWorkflowScreen;
            workflowActionRequestDto = workflowActionRequestDto2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            workflowActionRequestDto = (WorkflowActionRequestDto) c3968112.L$1;
            uiWorkflowScreen2 = (UiWorkflowScreen) c3968112.L$0;
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        UiWorkflowActionResponse uiModel = UiWorkflowActionResponse2.toUiModel((WorkflowActionResponseDto) objForceFetch$default);
        logResponse(workflowActionRequestDto, uiWorkflowScreen2);
        return uiModel;
    }

    private final void logRequest(WorkflowActionRequestDto params, UiWorkflowScreenAction action, UiWorkflowScreen screen) {
        String string2;
        String loggingIdentifier;
        SharedEventLogger sharedEventLogger = this.eventLogger;
        WorkflowInfo.EventType eventType = WorkflowInfo.EventType.REQUEST;
        Instant instant = this.clock.instant();
        String id = params.getId();
        WorkflowScreenDto.NameDto screen_name = params.getScreen_name();
        if (screen_name == null || (string2 = screen_name.toString()) == null) {
            string2 = "";
        }
        String block_id = params.getBlock_id();
        if (block_id == null) {
            block_id = "";
        }
        String client_version = params.getClient_version();
        String apiClassName = action.toApiClassName();
        if (screen == null || (loggingIdentifier = screen.getLoggingIdentifier()) == null) {
            loggingIdentifier = "";
        }
        SharedEventLogger.DefaultImpls.logAccountSecurityEvent$default(sharedEventLogger, null, null, null, new WorkflowInfo(eventType, null, instant, id, string2, block_id, client_version, apiClassName, loggingIdentifier, null, null, null, 3586, null), null, 23, null);
    }

    private final void logResponse(WorkflowActionRequestDto params, UiWorkflowScreen screen) {
        String string2;
        String loggingIdentifier;
        SharedEventLogger sharedEventLogger = this.eventLogger;
        WorkflowInfo.EventType eventType = WorkflowInfo.EventType.RESPONSE;
        Instant instant = this.clock.instant();
        String id = params.getId();
        WorkflowScreenDto.NameDto screen_name = params.getScreen_name();
        if (screen_name == null || (string2 = screen_name.toString()) == null) {
            string2 = "";
        }
        String block_id = params.getBlock_id();
        if (block_id == null) {
            block_id = "";
        }
        SharedEventLogger.DefaultImpls.logAccountSecurityEvent$default(sharedEventLogger, null, null, null, new WorkflowInfo(eventType, null, instant, id, string2, block_id, null, null, (screen == null || (loggingIdentifier = screen.getLoggingIdentifier()) == null) ? "" : loggingIdentifier, null, null, null, 3778, null), null, 23, null);
    }
}
