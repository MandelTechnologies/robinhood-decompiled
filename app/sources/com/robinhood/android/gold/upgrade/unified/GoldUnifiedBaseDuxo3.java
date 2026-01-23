package com.robinhood.android.gold.upgrade.unified;

import com.robinhood.android.microgramsdui.MicrogramManager;
import gold_flow.proto.p466v1.Action;
import gold_flow.proto.p466v1.ActionDto;
import gold_flow.proto.p466v1.GoldFlowScreen;
import gold_flow.proto.p466v1.GoldFlowService;
import gold_flow.proto.p466v1.SendActionRequestDto;
import gold_flow.proto.p466v1.SendActionResponseDto;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.MicrogramLaunchId;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: GoldUnifiedBaseDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u0005\u001a$\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0002\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\u0002*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001¨\u0006\u0010"}, m3636d2 = {"sendAction", "Lgold_flow/proto/v1/SendActionResponseDto;", "Lgold_flow/proto/v1/GoldFlowService;", "action", "Lgold_flow/proto/v1/Action;", "(Lgold_flow/proto/v1/GoldFlowService;Lgold_flow/proto/v1/Action;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendDeeplinkAction", "deeplinkUri", "", "screen", "Lgold_flow/proto/v1/GoldFlowScreen;", "(Lgold_flow/proto/v1/GoldFlowService;Ljava/lang/String;Lgold_flow/proto/v1/GoldFlowScreen;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGoldFlowService", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "feature-gold-upgrade_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.unified.GoldUnifiedBaseDuxoKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldUnifiedBaseDuxo3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object sendAction(GoldFlowService goldFlowService, Action action, Continuation<? super SendActionResponseDto> continuation) {
        return goldFlowService.SendAction(new SendActionRequestDto(ActionDto.INSTANCE.fromProto(action)), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object sendDeeplinkAction(GoldFlowService goldFlowService, String str, GoldFlowScreen goldFlowScreen, Continuation<? super SendActionResponseDto> continuation) {
        String strName;
        Tuples2 tuples2M3642to = Tuples4.m3642to("deeplinkUri", str);
        if (goldFlowScreen == null || (strName = goldFlowScreen.name()) == null) {
            strName = "";
        }
        return goldFlowService.SendAction(new SendActionRequestDto(new ActionDto("DEEPLINK", (Map<String, String>) MapsKt.mapOf(tuples2M3642to, Tuples4.m3642to("screen", strName)))), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final GoldFlowService getGoldFlowService(MicrogramManager microgramManager, CoroutineScope viewModelScope) {
        Intrinsics.checkNotNullParameter(microgramManager, "<this>");
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        return (GoldFlowService) MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(microgramManager, viewModelScope, new MicrogramLaunchId(new RemoteMicrogramApplication("app-gold-flow", null, 2, null), null, 2, 0 == true ? 1 : 0), null, 4, null).getComponent().getServiceLocator().getClient(GoldFlowService.class);
    }
}
