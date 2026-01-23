package com.salesforce.android.smi.remote.internal.api.sse;

import com.salesforce.android.smi.network.internal.api.sse.ServerSentEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ServerSentEventsService.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.salesforce.android.smi.remote.internal.api.sse.ServerSentEventsService$createEventSource$1$eventSourceListener$1$onEvent$2, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class ServerSentEventsService3 extends FunctionReferenceImpl implements Function2<String, String, ServerSentEvent> {
    ServerSentEventsService3(Object obj) {
        super(2, obj, ServerSentEventsService.class, "processConversationEntryEvent", "processConversationEntryEvent(Ljava/lang/String;Ljava/lang/String;)Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final ServerSentEvent invoke(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        return ((ServerSentEventsService) this.receiver).processConversationEntryEvent(p0, p1);
    }
}
