package com.robinhood.android.lib.conversations;

import com.robinhood.models.supportchat.api.ApiSocketChatMessage3;
import com.robinhood.models.supportchat.api.ApiSocketChatMessageAttributes;
import com.robinhood.models.supportchat.p353db.SocketChatMessage;
import com.robinhood.models.supportchat.p353db.SocketChatMessage3;
import com.robinhood.models.supportchat.p353db.SocketChatMessage4;
import com.robinhood.models.supportchat.p353db.SocketChatMessageAttributes;
import com.robinhood.shared.models.chat.common.api.ParticipantType;
import com.robinhood.utils.logging.CrashReporter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.twilio.conversations.Message;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
import p479j$.time.Instant;
import p479j$.util.DateRetargetClass;

/* compiled from: Messages.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u001a\u0018\u0010\u0000\u001a\u00020\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\"\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"toUiModel", "", "Lcom/robinhood/models/supportchat/db/SocketChatMessage;", "Lcom/twilio/conversations/Message;", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/supportchat/api/ApiSocketChatMessageAttributes;", "unknownAttrs", "Lcom/robinhood/models/supportchat/db/SocketChatMessageAttributes;", "lib-conversations_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.conversations.MessagesKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Messages2 {
    private static final SocketChatMessageAttributes unknownAttrs = new SocketChatMessageAttributes(new SocketChatMessage3.Unknown(null, ApiSocketChatMessage3.UNKNOWN, ParticipantType.USER, null, 8, null));

    public static final List<SocketChatMessage> toUiModel(List<? extends Message> list, JsonAdapter<ApiSocketChatMessageAttributes> adapter) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        List<? extends Message> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toUiModel((Message) it.next(), adapter));
        }
        return arrayList;
    }

    public static final SocketChatMessage toUiModel(Message message, JsonAdapter<ApiSocketChatMessageAttributes> adapter) throws IOException {
        SocketChatMessageAttributes uiModel;
        SocketChatMessageAttributes uiModel2;
        String string2;
        Intrinsics.checkNotNullParameter(message, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        JSONObject jSONObject = message.getAttributes().getJSONObject();
        ApiSocketChatMessageAttributes apiSocketChatMessageAttributesFromJson = null;
        if (jSONObject != null && (string2 = jSONObject.toString()) != null) {
            try {
                apiSocketChatMessageAttributesFromJson = adapter.fromJson(string2);
            } catch (JsonDataException e) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
            }
        }
        if (apiSocketChatMessageAttributesFromJson == null || (uiModel = SocketChatMessage4.toUiModel(apiSocketChatMessageAttributesFromJson)) == null) {
            uiModel = unknownAttrs;
        }
        if (uiModel.getData().getSenderType() == ParticipantType.CHATBOT) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        String sid = message.getSid();
        Intrinsics.checkNotNullExpressionValue(sid, "getSid(...)");
        long messageIndex = message.getMessageIndex();
        String body = message.getBody();
        Intrinsics.checkNotNullExpressionValue(body, "getBody(...)");
        if (apiSocketChatMessageAttributesFromJson == null || (uiModel2 = SocketChatMessage4.toUiModel(apiSocketChatMessageAttributesFromJson)) == null) {
            uiModel2 = unknownAttrs;
        }
        SocketChatMessageAttributes socketChatMessageAttributes = uiModel2;
        Instant instant = DateRetargetClass.toInstant(message.getDateCreatedAsDate());
        Intrinsics.checkNotNullExpressionValue(instant, "toInstant(...)");
        Instant instant2 = DateRetargetClass.toInstant(message.getDateUpdatedAsDate());
        Intrinsics.checkNotNullExpressionValue(instant2, "toInstant(...)");
        return new SocketChatMessage(sid, messageIndex, instant, body, socketChatMessageAttributes, instant2);
    }
}
