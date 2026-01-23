package com.robinhood.android.lib.conversations;

import com.robinhood.rosetta.eventlogging.TwilioConversationsSdkEventData;
import com.twilio.conversations.Conversation;
import com.twilio.conversations.ConversationsClient;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventDatas.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u001a\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0000\u001a\u00020\u0005*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0007¨\u0006\b"}, m3636d2 = {"eventData", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConnectionState;", "Lcom/twilio/conversations/ConversationsClient$ConnectionState;", "getEventData", "(Lcom/twilio/conversations/ConversationsClient$ConnectionState;)Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConnectionState;", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConversationSyncStatus;", "Lcom/twilio/conversations/Conversation;", "(Lcom/twilio/conversations/Conversation;)Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConversationSyncStatus;", "lib-conversations_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.conversations.EventDatasKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class EventDatas {

    /* compiled from: EventDatas.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.conversations.EventDatasKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ConversationsClient.ConnectionState.values().length];
            try {
                iArr[ConversationsClient.ConnectionState.CONNECTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConversationsClient.ConnectionState.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConversationsClient.ConnectionState.DISCONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConversationsClient.ConnectionState.DENIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ConversationsClient.ConnectionState.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ConversationsClient.ConnectionState.FATAL_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Conversation.SynchronizationStatus.values().length];
            try {
                iArr2[Conversation.SynchronizationStatus.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Conversation.SynchronizationStatus.IDENTIFIER.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Conversation.SynchronizationStatus.METADATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Conversation.SynchronizationStatus.ALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Conversation.SynchronizationStatus.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final TwilioConversationsSdkEventData.ConnectionState getEventData(ConversationsClient.ConnectionState connectionState) {
        switch (connectionState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[connectionState.ordinal()]) {
            case -1:
                return TwilioConversationsSdkEventData.ConnectionState.CONNECTION_STATE_UNSPECIFIED;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return TwilioConversationsSdkEventData.ConnectionState.CONNECTING;
            case 2:
                return TwilioConversationsSdkEventData.ConnectionState.CONNECTED;
            case 3:
                return TwilioConversationsSdkEventData.ConnectionState.DISCONNECTED;
            case 4:
                return TwilioConversationsSdkEventData.ConnectionState.DENIED;
            case 5:
                return TwilioConversationsSdkEventData.ConnectionState.ERROR;
            case 6:
                return TwilioConversationsSdkEventData.ConnectionState.FATAL_ERROR;
        }
    }

    public static final TwilioConversationsSdkEventData.ConversationSyncStatus getEventData(Conversation conversation) {
        Intrinsics.checkNotNullParameter(conversation, "<this>");
        Conversation.SynchronizationStatus synchronizationStatus = conversation.getSynchronizationStatus();
        int i = synchronizationStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$1[synchronizationStatus.ordinal()];
        if (i == 1) {
            return TwilioConversationsSdkEventData.ConversationSyncStatus.NONE;
        }
        if (i == 2) {
            return TwilioConversationsSdkEventData.ConversationSyncStatus.IDENTIFIER;
        }
        if (i == 3) {
            return TwilioConversationsSdkEventData.ConversationSyncStatus.METADATA;
        }
        if (i == 4) {
            return TwilioConversationsSdkEventData.ConversationSyncStatus.ALL;
        }
        if (i == 5) {
            return TwilioConversationsSdkEventData.ConversationSyncStatus.FAILED;
        }
        return TwilioConversationsSdkEventData.ConversationSyncStatus.CONVERSATION_SYNC_STATUS_UNSPECIFIED;
    }
}
