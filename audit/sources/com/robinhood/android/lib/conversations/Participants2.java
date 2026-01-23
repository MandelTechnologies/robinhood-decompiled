package com.robinhood.android.lib.conversations;

import com.robinhood.models.supportchat.api.ApiSocketSenderAttribute;
import com.robinhood.shared.models.chat.common.api.ParticipantType;
import com.robinhood.utils.logging.CrashReporter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.twilio.conversations.Participant;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p479j$.time.Instant;

/* compiled from: Participants.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/twilio/conversations/Participant;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/supportchat/api/ApiSocketSenderAttribute;", "adapter", "", "isAgent", "(Lcom/twilio/conversations/Participant;Lcom/squareup/moshi/JsonAdapter;)Z", "Lkotlin/Pair;", "", "j$/time/Instant", "getLastReadDataPair", "(Lcom/twilio/conversations/Participant;)Lkotlin/Pair;", "safeGetLastReadTimestamp", "(Lcom/twilio/conversations/Participant;)Lj$/time/Instant;", "lib-conversations_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.conversations.ParticipantsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Participants2 {
    public static final boolean isAgent(Participant participant, JsonAdapter<ApiSocketSenderAttribute> adapter) throws IOException {
        String string2;
        Intrinsics.checkNotNullParameter(participant, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        JSONObject jSONObject = participant.getAttributes().getJSONObject();
        if (jSONObject == null || (string2 = jSONObject.toString()) == null) {
            return false;
        }
        try {
            ApiSocketSenderAttribute apiSocketSenderAttributeFromJson = adapter.fromJson(string2);
            return (apiSocketSenderAttributeFromJson != null ? apiSocketSenderAttributeFromJson.getType() : null) == ParticipantType.AGENT;
        } catch (JsonDataException e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
            return false;
        }
    }

    public static final Tuples2<Long, Instant> getLastReadDataPair(Participant participant) {
        Intrinsics.checkNotNullParameter(participant, "<this>");
        Instant instantSafeGetLastReadTimestamp = safeGetLastReadTimestamp(participant);
        if (participant.getLastReadMessageIndex() == null || instantSafeGetLastReadTimestamp == null) {
            return null;
        }
        return Tuples4.m3642to(participant.getLastReadMessageIndex(), instantSafeGetLastReadTimestamp);
    }

    public static final Instant safeGetLastReadTimestamp(Participant participant) {
        Intrinsics.checkNotNullParameter(participant, "<this>");
        String lastReadTimestamp = participant.getLastReadTimestamp();
        Intrinsics.checkNotNullExpressionValue(lastReadTimestamp, "getLastReadTimestamp(...)");
        if (lastReadTimestamp.length() > 0) {
            return Instant.parse(participant.getLastReadTimestamp());
        }
        return null;
    }
}
