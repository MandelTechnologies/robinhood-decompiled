package com.robinhood.shared.support.supportchat;

import com.robinhood.shared.models.chat.common.Renderable;
import com.robinhood.shared.models.chat.common.RenderableType;
import com.robinhood.shared.models.chat.common.api.ParticipantType;
import com.robinhood.shared.support.supportchat.format.ChatTimestampFormatter;
import com.robinhood.shared.support.supportchat.p396ui.models.TimestampFormat;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage2;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples3;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.LocalDateTime;
import p479j$.time.ZoneId;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: UiChatMessages.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\u001a\u0099\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2Z\u0010\u0013\u001aV\u0012\u0004\u0012\u00020\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n¢\u0006\u0002\b\u0012¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u009b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0011*\u00020\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2Z\u0010\u0013\u001aV\u0012\u0004\u0012\u00020\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n¢\u0006\u0002\b\u0012H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001c\u001a\u00020\u001b*\u00020\u00012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010\u001e\u001a\u00020\u0002*\u00020\u00012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010\r\u001a\u00020\u0002*\u00020\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b\r\u0010!\u001a\u0019\u0010\"\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#\u001a%\u0010$\u001a\u0004\u0018\u00010\u0011*\u00020\u00012\b\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b$\u0010%\u001a!\u0010&\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010#\u001a'\u0010(\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)\u001a5\u0010/\u001a\u00020.2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b/\u00100\u001a\u001d\u00103\u001a\u00020\u0002*\u00020\u00062\b\b\u0002\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104¨\u00065"}, m3636d2 = {"", "Lcom/robinhood/shared/models/chat/common/Renderable;", "", "showTypingIndicator", "", "lastAgentReadMessageIndex", "j$/time/Instant", "lastAgentReadMessageTimestamp", "Lcom/robinhood/shared/support/supportchat/format/ChatTimestampFormatter;", "chatTimestampFormatter", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "isEndOfMessageBlock", "showAvatar", "Lcom/robinhood/shared/support/supportchat/ui/models/MessageMetadata$Timestamp;", "timestampMetadata", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage;", "Lkotlin/ExtensionFunctionType;", "transform", "(Ljava/util/List;ZJLj$/time/Instant;Lcom/robinhood/shared/support/supportchat/format/ChatTimestampFormatter;Lkotlin/jvm/functions/Function4;)Ljava/util/List;", "next", "isFollowedByTypingIndicator", "lastAgentReadUserMessageIndex", "toChatMessage", "(Lcom/robinhood/shared/models/chat/common/Renderable;Lcom/robinhood/shared/models/chat/common/Renderable;ZJLj$/time/Instant;Lcom/robinhood/shared/support/supportchat/format/ChatTimestampFormatter;Lkotlin/jvm/functions/Function4;)Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage;", "prev", "Lcom/robinhood/shared/support/supportchat/ui/models/TimestampFormat;", "timestampFormatter", "(Lcom/robinhood/shared/models/chat/common/Renderable;Lcom/robinhood/shared/models/chat/common/Renderable;)Lcom/robinhood/shared/support/supportchat/ui/models/TimestampFormat;", "showPrecedingTimestamp", "(Lcom/robinhood/shared/models/chat/common/Renderable;Lcom/robinhood/shared/models/chat/common/Renderable;)Z", "isLastReadAgentMessage", "(Lcom/robinhood/shared/models/chat/common/Renderable;Lcom/robinhood/shared/models/chat/common/Renderable;ZZ)Z", "shouldShowAvatar", "(Lcom/robinhood/shared/models/chat/common/Renderable;Z)Z", "generatePrecedingTimestampRow", "(Lcom/robinhood/shared/models/chat/common/Renderable;Lcom/robinhood/shared/models/chat/common/Renderable;Lcom/robinhood/shared/support/supportchat/format/ChatTimestampFormatter;)Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage;", "shouldBeFollowedByTypingIndicator", "isLastAgentReadUserMessage", "shouldShowMetadataText", "(Lcom/robinhood/shared/models/chat/common/Renderable;ZZ)Z", "dateCreated", "dateRead", "Lcom/robinhood/shared/models/chat/common/api/ParticipantType;", "senderType", "Lcom/robinhood/utils/resource/StringResource;", "createMessageTimestampResource", "(Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/shared/models/chat/common/api/ParticipantType;ZLcom/robinhood/shared/support/supportchat/format/ChatTimestampFormatter;)Lcom/robinhood/utils/resource/StringResource;", "j$/time/ZoneId", "zone", "isDifferentYear", "(Lj$/time/Instant;Lj$/time/ZoneId;)Z", "lib-support-chat_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.support.supportchat.UiChatMessagesKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class UiChatMessages {
    private static final boolean shouldBeFollowedByTypingIndicator(Renderable renderable, boolean z) {
        return renderable == null && z;
    }

    public static final List<UiChatMessage> transform(List<? extends Renderable> list, final boolean z, long j, final Instant lastAgentReadMessageTimestamp, final ChatTimestampFormatter chatTimestampFormatter, final Function4<? super Renderable, ? super Boolean, ? super Boolean, ? super UiChatMessage2.Timestamp, ? extends UiChatMessage> transform) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lastAgentReadMessageTimestamp, "lastAgentReadMessageTimestamp");
        Intrinsics.checkNotNullParameter(chatTimestampFormatter, "chatTimestampFormatter");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Sequence sequenceDistinctBy = SequencesKt.distinctBy(SequencesKt.filterNot(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.shared.support.supportchat.UiChatMessagesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(UiChatMessages.transform$lambda$0((Renderable) obj));
            }
        }), new Function1() { // from class: com.robinhood.shared.support.supportchat.UiChatMessagesKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiChatMessages.transform$lambda$1((Renderable) obj);
            }
        });
        Object obj = null;
        for (Object obj2 : sequenceDistinctBy) {
            Renderable renderable = (Renderable) obj2;
            if (renderable.getIndex() <= j && renderable.getSenderType() == ParticipantType.USER) {
                obj = obj2;
            }
        }
        Renderable renderable2 = (Renderable) obj;
        final long index = renderable2 != null ? renderable2.getIndex() : -1L;
        return SequencesKt.toList(SequencesKt.flatMapIterable(com.robinhood.utils.extensions.SequencesKt.zipWithNeighbors(sequenceDistinctBy), new Function1() { // from class: com.robinhood.shared.support.supportchat.UiChatMessagesKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return UiChatMessages.transform$lambda$3(chatTimestampFormatter, z, index, lastAgentReadMessageTimestamp, transform, (Tuples3) obj3);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean transform$lambda$0(Renderable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getType() == RenderableType.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String transform$lambda$1(Renderable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getMessageSid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable transform$lambda$3(ChatTimestampFormatter chatTimestampFormatter, boolean z, long j, Instant instant, Function4 function4, Tuples3 tuples3) {
        Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
        Renderable renderable = (Renderable) tuples3.component1();
        Renderable renderable2 = (Renderable) tuples3.component2();
        Renderable renderable3 = (Renderable) tuples3.component3();
        return CollectionsKt.listOfNotNull((Object[]) new UiChatMessage[]{generatePrecedingTimestampRow(renderable2, renderable, chatTimestampFormatter), toChatMessage(renderable2, renderable3, shouldBeFollowedByTypingIndicator(renderable3, z), j, instant, chatTimestampFormatter, function4)});
    }

    public static final UiChatMessage toChatMessage(Renderable renderable, Renderable renderable2, boolean z, long j, Instant lastAgentReadMessageTimestamp, ChatTimestampFormatter chatTimestampFormatter, Function4<? super Renderable, ? super Boolean, ? super Boolean, ? super UiChatMessage2.Timestamp, ? extends UiChatMessage> transform) {
        Intrinsics.checkNotNullParameter(renderable, "<this>");
        Intrinsics.checkNotNullParameter(lastAgentReadMessageTimestamp, "lastAgentReadMessageTimestamp");
        Intrinsics.checkNotNullParameter(chatTimestampFormatter, "chatTimestampFormatter");
        Intrinsics.checkNotNullParameter(transform, "transform");
        boolean z2 = renderable.getIndex() >= 0 && j == renderable.getIndex();
        boolean zIsEndOfMessageBlock = isEndOfMessageBlock(renderable, renderable2, z, z2);
        return transform.invoke(renderable, Boolean.valueOf(zIsEndOfMessageBlock), Boolean.valueOf(shouldShowAvatar(renderable, zIsEndOfMessageBlock)), shouldShowMetadataText(renderable2, z, z2) ? new UiChatMessage2.Timestamp(createMessageTimestampResource(renderable.getDateCreated(), lastAgentReadMessageTimestamp, renderable.getSenderType(), z2, chatTimestampFormatter)) : null);
    }

    public static final TimestampFormat timestampFormatter(Renderable renderable, Renderable renderable2) {
        Intrinsics.checkNotNullParameter(renderable, "<this>");
        Instant dateCreated = renderable.getDateCreated();
        Instant dateCreated2 = renderable2 != null ? renderable2.getDateCreated() : null;
        LocalDateTime localDateTime$default = Instants.toLocalDateTime$default(dateCreated, null, 1, null);
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        LocalDateTime localDateTimeTruncatedTo = localDateTime$default.truncatedTo(chronoUnit);
        Instant instantNow = Instant.now();
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        boolean zAreEqual = Intrinsics.areEqual(localDateTimeTruncatedTo, Instants.toLocalDateTime$default(instantNow, null, 1, null).truncatedTo(chronoUnit));
        if (renderable2 == null || renderable.getRequirePrecedingTimestamp()) {
            if (isDifferentYear$default(dateCreated, null, 1, null)) {
                return TimestampFormat.NATURAL_DOT;
            }
            if (zAreEqual) {
                return TimestampFormat.TIME_SHORT;
            }
            return TimestampFormat.NATURAL_DOT_NO_YEAR;
        }
        Intrinsics.checkNotNull(dateCreated2);
        if (isDifferentYear$default(dateCreated2, null, 1, null)) {
            return TimestampFormat.NATURAL_DOT;
        }
        if (zAreEqual) {
            return TimestampFormat.TIME_SHORT;
        }
        return TimestampFormat.NATURAL_DOT_NO_YEAR;
    }

    public static final boolean showPrecedingTimestamp(Renderable renderable, Renderable renderable2) {
        Intrinsics.checkNotNullParameter(renderable, "<this>");
        RenderableType type2 = renderable.getType();
        RenderableType renderableType = RenderableType.DISCLAIMER;
        if (type2 == renderableType) {
            return false;
        }
        if (renderable2 != null && renderable2.getType() != renderableType && !renderable.getRequirePrecedingTimestamp()) {
            Duration durationBetween = Duration.between(renderable2.getDateCreated(), renderable.getDateCreated());
            Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
            if (durationBetween.toHours() < 1) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isEndOfMessageBlock(Renderable renderable, Renderable renderable2, boolean z, boolean z2) {
        long minutes;
        Instant dateCreated;
        Intrinsics.checkNotNullParameter(renderable, "<this>");
        boolean z3 = renderable.getSenderType() != (renderable2 != null ? renderable2.getSenderType() : null);
        if (renderable2 == null || (dateCreated = renderable2.getDateCreated()) == null) {
            minutes = 0;
        } else {
            Duration durationBetween = Duration.between(renderable.getDateCreated(), dateCreated);
            Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
            minutes = durationBetween.toMinutes();
        }
        return (z3 || minutes > 5) && (!z || z2);
    }

    public static final boolean shouldShowAvatar(Renderable renderable, boolean z) {
        Intrinsics.checkNotNullParameter(renderable, "<this>");
        if (renderable.getSupportsAvatar() && z) {
            return renderable.getSenderType() == ParticipantType.AGENT || renderable.getSenderType() == ParticipantType.CHATBOT;
        }
        return false;
    }

    public static final UiChatMessage generatePrecedingTimestampRow(Renderable renderable, Renderable renderable2, ChatTimestampFormatter chatTimestampFormatter) {
        Intrinsics.checkNotNullParameter(renderable, "<this>");
        Intrinsics.checkNotNullParameter(chatTimestampFormatter, "chatTimestampFormatter");
        if (!showPrecedingTimestamp(renderable, renderable2)) {
            return null;
        }
        TimestampFormat timestampFormatTimestampFormatter = timestampFormatter(renderable, renderable2);
        return new UiChatMessage.Metadata.Timestamp(renderable.getMessageSid() + "+timestamp", 0L, null, renderable.getDateCreated(), chatTimestampFormatter.format(renderable.getDateCreated(), timestampFormatTimestampFormatter), 6, null);
    }

    public static final boolean shouldShowMetadataText(Renderable renderable, boolean z, boolean z2) {
        ParticipantType senderType = renderable != null ? renderable.getSenderType() : null;
        return renderable == null ? !z : (!z2 || senderType == ParticipantType.AGENT || senderType == ParticipantType.CHATBOT) ? false : true;
    }

    public static final StringResource createMessageTimestampResource(Instant dateCreated, Instant dateRead, ParticipantType senderType, boolean z, ChatTimestampFormatter chatTimestampFormatter) {
        Intrinsics.checkNotNullParameter(dateCreated, "dateCreated");
        Intrinsics.checkNotNullParameter(dateRead, "dateRead");
        Intrinsics.checkNotNullParameter(senderType, "senderType");
        Intrinsics.checkNotNullParameter(chatTimestampFormatter, "chatTimestampFormatter");
        TimestampFormat timestampFormat = TimestampFormat.TIME_SHORT;
        if (z) {
            return StringResource.INSTANCE.invoke(C40042R.string.support_chat_thread_read_timestamp, chatTimestampFormatter.format(dateRead, timestampFormat));
        }
        if (senderType == ParticipantType.AGENT) {
            return StringResource.INSTANCE.invoke(chatTimestampFormatter.format(dateCreated, timestampFormat));
        }
        return StringResource.INSTANCE.invoke(C40042R.string.support_chat_thread_sent_timestamp, chatTimestampFormatter.format(dateCreated, timestampFormat));
    }

    static /* synthetic */ boolean isDifferentYear$default(Instant instant, ZoneId zoneId, int i, Object obj) {
        if ((i & 1) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return isDifferentYear(instant, zoneId);
    }

    private static final boolean isDifferentYear(Instant instant, ZoneId zoneId) {
        int year = Instants.toLocalDateTime(instant, zoneId).getYear();
        Instant instantNow = Instant.now();
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        return year != Instants.toLocalDateTime(instantNow, zoneId).getYear();
    }
}
