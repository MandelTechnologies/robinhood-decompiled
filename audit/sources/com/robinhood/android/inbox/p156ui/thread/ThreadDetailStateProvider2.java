package com.robinhood.android.inbox.p156ui.thread;

import android.net.Uri;
import com.robinhood.android.deeplink.config.DeeplinkConfig;
import com.robinhood.android.inbox.p156ui.thread.ThreadDetailViewState4;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnUtils;
import com.robinhood.models.p320db.InboxMessageType;
import com.robinhood.models.p320db.MediaMetadata;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.LocalDateTimes;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.datetime.format.LocalDateTimeFormatter;
import com.robinhood.utils.datetime.format.LocalTimeFormatter;
import com.robinhood.utils.extensions.HttpUrl2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import okhttp3.HttpUrl;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.LocalDateTime;
import p479j$.time.LocalTime;
import p479j$.time.ZoneId;

/* compiled from: ThreadDetailStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 W2\u00020\u0001:\u0001WB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ-\u0010\u001c\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\nJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\f\u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\f\u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\u00020\u0011*\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020\u0011*\u00020\u001fH\u0002¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u0004\u0018\u00010,*\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0013\u0010-\u001a\u000200*\u00020/H\u0002¢\u0006\u0004\b-\u00101J\u0015\u00104\u001a\u0004\u0018\u000103*\u000202H\u0002¢\u0006\u0004\b4\u00105J?\u0010=\u001a\b\u0012\u0004\u0012\u00020<062\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001f062\f\u00109\u001a\b\u0012\u0004\u0012\u000208062\u0006\u0010:\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u0011¢\u0006\u0004\b=\u0010>R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010B\u001a\u0004\bC\u0010DR\u001c\u0010F\u001a\b\u0012\u0004\u0012\u00020<0E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010H\u001a\b\u0012\u0004\u0012\u00020\u000b068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010\u0016\u001a\u00020\u0015*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0018\u0010P\u001a\u00020\u0011*\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010*R\u0018\u0010R\u001a\u00020\u0011*\u00020Q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0018\u0010V\u001a\u00020\u0002*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006X"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/InboxMessageConverter;", "", "Ljava/util/UUID;", "userId", "", "entityUrl", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "", "addTimestampOfLastMessage", "()V", "Lcom/robinhood/models/db/InboxMessageType;", "inboxMessage", "addMetadata", "(Lcom/robinhood/models/db/InboxMessageType;)V", "message", "addDateTime", "", "isSameYear", "j$/time/LocalDate", "createdAtLocalDate", "j$/time/LocalDateTime", "createdAtLocalDateTime", "formatDateTime", "(ZLj$/time/LocalDate;Lj$/time/LocalDateTime;)Ljava/lang/String;", "addImage", "", "messageIdToLocalMessageId", "addText", "(Lcom/robinhood/models/db/InboxMessageType;Ljava/util/Map;)V", "addResponsesOfLastMessage", "Lcom/robinhood/models/db/InboxMessageType$Message;", "Lcom/robinhood/android/inbox/ui/thread/InternalAction;", "createInternalAction", "(Lcom/robinhood/models/db/InboxMessageType$Message;)Lcom/robinhood/android/inbox/ui/thread/InternalAction;", "Lcom/robinhood/android/inbox/ui/thread/ExternalAction;", "createExternalAction", "(Lcom/robinhood/models/db/InboxMessageType$Message;)Lcom/robinhood/android/inbox/ui/thread/ExternalAction;", "nextMessage", "isLatestFromSender", "(Lcom/robinhood/models/db/InboxMessageType;Lcom/robinhood/models/db/InboxMessageType;)Z", "shouldAddText", "(Lcom/robinhood/models/db/InboxMessageType$Message;)Z", "Lcom/robinhood/models/serverdriven/db/RichText$Attribute;", "Lcom/robinhood/android/inbox/ui/thread/ViewType$Text$Attribute;", "toViewState", "(Lcom/robinhood/models/serverdriven/db/RichText$Attribute;)Lcom/robinhood/android/inbox/ui/thread/ViewType$Text$Attribute;", "Lcom/robinhood/models/serverdriven/db/RichText$TextStyle;", "Lcom/robinhood/android/inbox/ui/thread/ViewType$Text$TextStyle;", "(Lcom/robinhood/models/serverdriven/db/RichText$TextStyle;)Lcom/robinhood/android/inbox/ui/thread/ViewType$Text$TextStyle;", "Lcom/robinhood/models/db/InboxMessageType$LocalMessage$State;", "Lcom/robinhood/android/inbox/ui/thread/ViewType$Text$LocalMessageStatus;", "toLocalMessageStatus", "(Lcom/robinhood/models/db/InboxMessageType$LocalMessage$State;)Lcom/robinhood/android/inbox/ui/thread/ViewType$Text$LocalMessageStatus;", "", NotificationSettings4FragmentKey.SETTINGS_MESSAGES, "Lcom/robinhood/models/db/InboxMessageType$LocalMessage;", "localMessages", "hasFetchedAllPreviousMessages", "isLoadingPreviousMessages", "Lcom/robinhood/android/inbox/ui/thread/ViewType;", "convert", "(Ljava/util/List;Ljava/util/List;ZZ)Ljava/util/List;", "Ljava/util/UUID;", "getUserId", "()Ljava/util/UUID;", "Ljava/lang/String;", "getEntityUrl", "()Ljava/lang/String;", "", "viewTypes", "Ljava/util/List;", "inboxMessages", "previousMessage", "Lcom/robinhood/models/db/InboxMessageType;", "latestFromSender", "Z", "getCreatedAtLocalDateTime", "(Lcom/robinhood/models/db/InboxMessageType;)Lj$/time/LocalDateTime;", "getFromUser", "fromUser", "Lcom/robinhood/models/db/InboxMessageType$Message$Action;", "isInternalAction", "(Lcom/robinhood/models/db/InboxMessageType$Message$Action;)Z", "getSenderId", "(Lcom/robinhood/models/db/InboxMessageType;)Ljava/util/UUID;", "senderId", "Companion", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.inbox.ui.thread.InboxMessageConverter, reason: use source file name */
/* loaded from: classes10.dex */
final class ThreadDetailStateProvider2 {
    private final String entityUrl;
    private List<? extends InboxMessageType> inboxMessages;
    private boolean latestFromSender;
    private InboxMessageType previousMessage;
    private final UUID userId;
    private List<ThreadDetailViewState4> viewTypes;
    private static final Duration LATEST_FROM_SENDER_THRESHOLD = Durations.FIVE_MINUTES;
    private static final Duration DATE_TIME_THRESHOLD = Durations.INSTANCE.getONE_HOUR();

    /* compiled from: ThreadDetailStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.inbox.ui.thread.InboxMessageConverter$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RichText.TextStyle.values().length];
            try {
                iArr[RichText.TextStyle.BOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RichText.TextStyle.ITALIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RichText.TextStyle.UNDERLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RichText.TextStyle.HIGHLIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InboxMessageType.LocalMessage.State.values().length];
            try {
                iArr2[InboxMessageType.LocalMessage.State.SENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InboxMessageType.LocalMessage.State.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InboxMessageType.LocalMessage.State.RESENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InboxMessageType.LocalMessage.State.SENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ThreadDetailStateProvider2(UUID uuid, String str) {
        this.userId = uuid;
        this.entityUrl = str;
    }

    public final String getEntityUrl() {
        return this.entityUrl;
    }

    public final UUID getUserId() {
        return this.userId;
    }

    public final List<ThreadDetailViewState4> convert(List<InboxMessageType.Message> messages, List<InboxMessageType.LocalMessage> localMessages, boolean hasFetchedAllPreviousMessages, boolean isLoadingPreviousMessages) {
        int iNextIndex;
        Intrinsics.checkNotNullParameter(messages, "messages");
        Intrinsics.checkNotNullParameter(localMessages, "localMessages");
        if (this.userId == null) {
            return CollectionsKt.emptyList();
        }
        Set set = SequencesKt.toSet(SequencesKt.map(CollectionsKt.asSequence(messages), new Function1() { // from class: com.robinhood.android.inbox.ui.thread.InboxMessageConverter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadDetailStateProvider2.convert$lambda$0((InboxMessageType.Message) obj);
            }
        }));
        List<InboxMessageType.LocalMessage> list = localMessages;
        ArrayList<InboxMessageType.LocalMessage> arrayList = new ArrayList();
        for (Object obj : list) {
            if (!CollectionsKt.contains(set, ((InboxMessageType.LocalMessage) obj).getServerMessageId())) {
                arrayList.add(obj);
            }
        }
        List<? extends InboxMessageType> mutableList = CollectionsKt.toMutableList((Collection) messages);
        for (InboxMessageType.LocalMessage localMessage : arrayList) {
            ListIterator<? extends InboxMessageType> listIterator = mutableList.listIterator(mutableList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                }
                InboxMessageType inboxMessageTypePrevious = listIterator.previous();
                if ((inboxMessageTypePrevious instanceof InboxMessageType.Message) && ((InboxMessageType.Message) inboxMessageTypePrevious).getCreatedAt().compareTo(localMessage.getCreatedAt()) < 0) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            if (iNextIndex != -1 || hasFetchedAllPreviousMessages) {
                mutableList.add(iNextIndex + 1, localMessage);
            }
        }
        this.inboxMessages = mutableList;
        ArrayList arrayList2 = new ArrayList();
        this.viewTypes = arrayList2;
        if (isLoadingPreviousMessages) {
            arrayList2.add(new ThreadDetailViewState4.ProgressBar());
        }
        this.previousMessage = null;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (InboxMessageType.LocalMessage localMessage2 : list) {
            Tuples2 tuples2M3642to = Tuples4.m3642to(localMessage2.getServerMessageId(), localMessage2.getId());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        List<? extends InboxMessageType> list2 = this.inboxMessages;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inboxMessages");
            list2 = null;
        }
        int i = 0;
        for (InboxMessageType inboxMessageType : list2) {
            i++;
            List<? extends InboxMessageType> list3 = this.inboxMessages;
            if (list3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inboxMessages");
                list3 = null;
            }
            this.latestFromSender = isLatestFromSender(inboxMessageType, (InboxMessageType) CollectionsKt.getOrNull(list3, i));
            addDateTime(inboxMessageType);
            addImage(inboxMessageType);
            addText(inboxMessageType, linkedHashMap);
            addMetadata(inboxMessageType);
            this.previousMessage = inboxMessageType;
        }
        addTimestampOfLastMessage();
        addResponsesOfLastMessage();
        List<ThreadDetailViewState4> list4 = this.viewTypes;
        if (list4 != null) {
            return list4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewTypes");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String convert$lambda$0(InboxMessageType.Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getId();
    }

    private final void addTimestampOfLastMessage() {
        List<? extends InboxMessageType> list = this.inboxMessages;
        List<ThreadDetailViewState4> list2 = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inboxMessages");
            list = null;
        }
        Object objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) list);
        InboxMessageType.Message message = objLastOrNull instanceof InboxMessageType.Message ? (InboxMessageType.Message) objLastOrNull : null;
        if (message == null || message.getIsMetadata()) {
            return;
        }
        boolean fromUser = getFromUser(message);
        LocalTime localTime = getCreatedAtLocalDateTime(message).toLocalTime();
        List<ThreadDetailViewState4> list3 = this.viewTypes;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewTypes");
        } else {
            list2 = list3;
        }
        LocalTimeFormatter localTimeFormatter = LocalTimeFormatter.SHORT;
        Intrinsics.checkNotNull(localTime);
        list2.add(new ThreadDetailViewState4.Timestamp(fromUser, localTimeFormatter.format(localTime)));
    }

    private final void addMetadata(InboxMessageType inboxMessage) {
        if (inboxMessage instanceof InboxMessageType.Message) {
            InboxMessageType.Message message = (InboxMessageType.Message) inboxMessage;
            if (!message.getIsMetadata() || message.getText() == null) {
                return;
            }
            InternalAction internalActionCreateInternalAction = createInternalAction(message);
            ExternalAction externalActionCreateExternalAction = createExternalAction(message);
            List<ThreadDetailViewState4> list = this.viewTypes;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewTypes");
                list = null;
            }
            String id = message.getId();
            RichText text = message.getText();
            Intrinsics.checkNotNull(text);
            list.add(new ThreadDetailViewState4.Metadata(id, text.getText(), internalActionCreateInternalAction, externalActionCreateExternalAction, message.getMessageConfigId()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void addDateTime(InboxMessageType message) {
        String dateTime;
        LocalDate localDateNow = LocalDate.now();
        LocalDateTime createdAtLocalDateTime = getCreatedAtLocalDateTime(message);
        InboxMessageType inboxMessageType = this.previousMessage;
        List<ThreadDetailViewState4> list = null;
        LocalDateTime createdAtLocalDateTime2 = inboxMessageType != null ? getCreatedAtLocalDateTime(inboxMessageType) : null;
        LocalDate localDateMo3394a = createdAtLocalDateTime.mo3394a();
        boolean zAreEqual = Intrinsics.areEqual(localDateMo3394a, createdAtLocalDateTime2 != null ? createdAtLocalDateTime2.mo3394a() : null);
        boolean z = false;
        boolean z2 = localDateNow.getYear() == localDateMo3394a.getYear();
        InboxMessageType inboxMessageType2 = this.previousMessage;
        if (inboxMessageType2 != null && inboxMessageType2.getIsMetadata()) {
            z = true;
        }
        if (zAreEqual || message.getIsMetadata() || z) {
            if (!message.getIsMetadata() && !z) {
                Intrinsics.checkNotNull(createdAtLocalDateTime2);
                if (LocalDateTimes.until(createdAtLocalDateTime2, createdAtLocalDateTime).compareTo(DATE_TIME_THRESHOLD) <= 0) {
                    dateTime = null;
                }
            } else if (Intrinsics.areEqual(localDateMo3394a, localDateNow)) {
                dateTime = LocalDateTimeFormatter.TIME.format(createdAtLocalDateTime);
            } else {
                Intrinsics.checkNotNull(localDateMo3394a);
                dateTime = formatDateTime(z2, localDateMo3394a, createdAtLocalDateTime);
            }
        } else {
            Intrinsics.checkNotNull(localDateMo3394a);
            dateTime = formatDateTime(z2, localDateMo3394a, createdAtLocalDateTime);
        }
        if (dateTime != null) {
            List<ThreadDetailViewState4> list2 = this.viewTypes;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewTypes");
            } else {
                list = list2;
            }
            list.add(new ThreadDetailViewState4.Date(dateTime));
        }
    }

    private final String formatDateTime(boolean isSameYear, LocalDate createdAtLocalDate, LocalDateTime createdAtLocalDateTime) {
        return (isSameYear ? LocalDateFormatter.MEDIUM_NO_YEAR : LocalDateFormatter.MEDIUM).format(createdAtLocalDate) + " · " + LocalDateTimeFormatter.TIME.format(createdAtLocalDateTime);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void addImage(InboxMessageType inboxMessage) {
        boolean z;
        if (inboxMessage instanceof InboxMessageType.Message) {
            InboxMessageType.Message message = (InboxMessageType.Message) inboxMessage;
            int size = message.getMediaMetadataList().size();
            int i = 0;
            for (MediaMetadata mediaMetadata : message.getMediaMetadataList()) {
                int i2 = i + 1;
                if (i == size - 1 && this.latestFromSender) {
                    RichText text = message.getText();
                    String text2 = text != null ? text.getText() : null;
                    if (text2 == null || text2.length() == 0) {
                        z = true;
                    }
                } else {
                    z = false;
                }
                boolean z2 = !getFromUser(message) && z;
                List<ThreadDetailViewState4> list = this.viewTypes;
                if (list == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewTypes");
                    list = null;
                }
                String str = null;
                String id = message.getId();
                boolean fromUser = getFromUser(message);
                String shortDisplayName = message.getSender().getShortDisplayName();
                HttpUrl avatarUrl = message.getSender().getAvatarUrl();
                if (z2) {
                    str = this.entityUrl;
                }
                list.add(new ThreadDetailViewState4.Text(id, null, null, fromUser, z, null, null, mediaMetadata, null, null, shortDisplayName, avatarUrl, z2, str, false, false, null, null, 197472, null));
                i = i2;
            }
        }
    }

    private final void addText(InboxMessageType inboxMessage, Map<String, UUID> messageIdToLocalMessageId) {
        ArrayList arrayList;
        List<RichText.Attribute> attributes;
        List<ThreadDetailViewState4> list = null;
        if (inboxMessage instanceof InboxMessageType.Message) {
            InboxMessageType.Message message = (InboxMessageType.Message) inboxMessage;
            if (shouldAddText(message)) {
                InternalAction internalActionCreateInternalAction = createInternalAction(message);
                ExternalAction externalActionCreateExternalAction = createExternalAction(message);
                String shortDisplayName = message.getSender().getShortDisplayName();
                HttpUrl avatarUrl = message.getSender().getAvatarUrl();
                RichText text = message.getText();
                if (text == null || (attributes = text.getAttributes()) == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it = attributes.iterator();
                    while (it.hasNext()) {
                        ThreadDetailViewState4.Text.Attribute viewState = toViewState((RichText.Attribute) it.next());
                        if (viewState != null) {
                            arrayList2.add(viewState);
                        }
                    }
                    arrayList = arrayList2;
                }
                boolean z = !getFromUser(message) && this.latestFromSender;
                if (externalActionCreateExternalAction != null) {
                    List<ThreadDetailViewState4> list2 = this.viewTypes;
                    if (list2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewTypes");
                        list2 = null;
                    }
                    String id = message.getId();
                    boolean fromUser = getFromUser(message);
                    RichText text2 = message.getText();
                    list2.add(new ThreadDetailViewState4.Text(id, null, null, fromUser, false, text2 != null ? text2.getText() : null, arrayList, null, null, null, shortDisplayName, null, false, null, false, false, message.getMessageConfigId(), message.getMessageTypeConfigId(), 11136, null));
                    List<ThreadDetailViewState4> list3 = this.viewTypes;
                    if (list3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewTypes");
                        list3 = null;
                    }
                    list3.add(new ThreadDetailViewState4.Text(message.getId(), null, null, getFromUser(message), this.latestFromSender, null, null, null, null, externalActionCreateExternalAction, shortDisplayName, avatarUrl, z, z ? this.entityUrl : null, false, false, message.getMessageConfigId(), message.getMessageTypeConfigId(), 480, null));
                    return;
                }
                boolean z2 = z;
                List<ThreadDetailViewState4> list4 = this.viewTypes;
                if (list4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewTypes");
                    list4 = null;
                }
                String id2 = message.getId();
                UUID uuid = messageIdToLocalMessageId.get(message.getId());
                boolean fromUser2 = getFromUser(message);
                boolean z3 = this.latestFromSender;
                RichText text3 = message.getText();
                list4.add(new ThreadDetailViewState4.Text(id2, uuid, null, fromUser2, z3, text3 != null ? text3.getText() : null, arrayList, null, internalActionCreateInternalAction, null, shortDisplayName, avatarUrl, z2, z2 ? this.entityUrl : null, false, false, message.getMessageConfigId(), message.getMessageTypeConfigId(), OptionsSimulatedReturnUtils.SMALL_DEVICE_HEIGHT_FOR_OPTIONS_SIMULATED_RETURNS, null));
                return;
            }
            return;
        }
        if (!(inboxMessage instanceof InboxMessageType.LocalMessage)) {
            throw new NoWhenBranchMatchedException();
        }
        InboxMessageType.LocalMessage localMessage = (InboxMessageType.LocalMessage) inboxMessage;
        boolean z4 = localMessage.getState() == InboxMessageType.LocalMessage.State.FAILED;
        List<ThreadDetailViewState4> list5 = this.viewTypes;
        if (list5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewTypes");
        } else {
            list = list5;
        }
        list.add(new ThreadDetailViewState4.Text("0", localMessage.getId(), toLocalMessageStatus(localMessage.getState()), true, this.latestFromSender, localMessage.getRequestData().getDisplayText(), null, null, null, null, "", null, false, null, true, z4, null, null, 207808, null));
    }

    private final void addResponsesOfLastMessage() {
        List<? extends InboxMessageType> list = this.inboxMessages;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inboxMessages");
            list = null;
        }
        Object objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) list);
        InboxMessageType.Message message = objLastOrNull instanceof InboxMessageType.Message ? (InboxMessageType.Message) objLastOrNull : null;
        if (message == null) {
            return;
        }
        for (InboxMessageType.Message.Response response : message.getResponses()) {
            List<ThreadDetailViewState4> list2 = this.viewTypes;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewTypes");
                list2 = null;
            }
            list2.add(new ThreadDetailViewState4.Response(message.getId(), response.getAnswer(), response.getDisplayText(), response.getLocalId(), message.getMessageConfigId(), message.getMessageTypeConfigId()));
        }
    }

    private final InternalAction createInternalAction(InboxMessageType.Message inboxMessage) {
        InboxMessageType.Message.Action action = inboxMessage.getAction();
        if (action != null && isInternalAction(action)) {
            return new InternalAction(action.getDisplayText(), action.getUrl());
        }
        return null;
    }

    private final ExternalAction createExternalAction(InboxMessageType.Message inboxMessage) {
        InboxMessageType.Message.Action action = inboxMessage.getAction();
        if (action == null || Intrinsics.areEqual(action.getUrl(), Uri.EMPTY) || action.getUrl().getHost() == null || isInternalAction(action)) {
            return null;
        }
        String displayText = action.getDisplayText();
        String host = action.getUrl().getHost();
        Intrinsics.checkNotNull(host);
        return new ExternalAction(displayText, host, HttpUrl2.toHttpUrl(action.getUrl()));
    }

    private final LocalDateTime getCreatedAtLocalDateTime(InboxMessageType inboxMessageType) {
        Instant createdAt = inboxMessageType.getCreatedAt();
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
        return Instants.toLocalDateTime(createdAt, zoneIdSystemDefault);
    }

    private final boolean getFromUser(InboxMessageType.Message message) {
        return Intrinsics.areEqual(message.getSender().getId(), this.userId);
    }

    private final boolean isInternalAction(InboxMessageType.Message.Action action) {
        return Intrinsics.areEqual(action.getUrl().getScheme(), DeeplinkConfig.INSTANCE.getScheme());
    }

    private final UUID getSenderId(InboxMessageType inboxMessageType) {
        if (inboxMessageType instanceof InboxMessageType.Message) {
            return ((InboxMessageType.Message) inboxMessageType).getSender().getId();
        }
        if (!(inboxMessageType instanceof InboxMessageType.LocalMessage)) {
            throw new NoWhenBranchMatchedException();
        }
        UUID uuid = this.userId;
        Intrinsics.checkNotNull(uuid);
        return uuid;
    }

    private final boolean isLatestFromSender(InboxMessageType inboxMessageType, InboxMessageType inboxMessageType2) {
        if (!Intrinsics.areEqual(inboxMessageType2 != null ? getSenderId(inboxMessageType2) : null, getSenderId(inboxMessageType))) {
            return true;
        }
        Duration durationBetween = Duration.between(inboxMessageType.getCreatedAt(), inboxMessageType2.getCreatedAt());
        Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
        return durationBetween.compareTo(LATEST_FROM_SENDER_THRESHOLD) > 0 || inboxMessageType2.getIsMetadata();
    }

    private final boolean shouldAddText(InboxMessageType.Message message) {
        RichText text = message.getText();
        String text2 = text != null ? text.getText() : null;
        return (text2 == null || text2.length() == 0 || message.getIsMetadata()) ? false : true;
    }

    private final ThreadDetailViewState4.Text.Attribute toViewState(RichText.Attribute attribute) {
        int location = attribute.getLocation();
        int length = attribute.getLength();
        Uri link = attribute.getLink();
        RichText.TextStyle style = attribute.getStyle();
        return new ThreadDetailViewState4.Text.Attribute(location, length, link, style != null ? toViewState(style) : null);
    }

    private final ThreadDetailViewState4.Text.TextStyle toViewState(RichText.TextStyle textStyle) {
        int i = WhenMappings.$EnumSwitchMapping$0[textStyle.ordinal()];
        if (i == 1) {
            return ThreadDetailViewState4.Text.TextStyle.BOLD;
        }
        if (i == 2) {
            return ThreadDetailViewState4.Text.TextStyle.ITALIC;
        }
        if (i == 3) {
            return ThreadDetailViewState4.Text.TextStyle.UNDERLINE;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return ThreadDetailViewState4.Text.TextStyle.HIGHLIGHT;
    }

    private final ThreadDetailViewState4.Text.LocalMessageStatus toLocalMessageStatus(InboxMessageType.LocalMessage.State state) {
        int i = WhenMappings.$EnumSwitchMapping$1[state.ordinal()];
        if (i == 1) {
            return ThreadDetailViewState4.Text.LocalMessageStatus.SENDING;
        }
        if (i == 2) {
            return ThreadDetailViewState4.Text.LocalMessageStatus.FAILED;
        }
        if (i == 3) {
            return ThreadDetailViewState4.Text.LocalMessageStatus.RESENDING;
        }
        if (i == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
