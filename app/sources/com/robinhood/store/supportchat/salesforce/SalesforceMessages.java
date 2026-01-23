package com.robinhood.store.supportchat.salesforce;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.robinhood.android.bitmap.BitmapStore;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.models.supportchat.api.ApiSocketChatMessage3;
import com.robinhood.models.supportchat.p353db.SocketChatMessage;
import com.robinhood.models.supportchat.p353db.SocketChatMessage3;
import com.robinhood.models.supportchat.p353db.SocketChatMessageAttributes;
import com.robinhood.models.supportchat.p353db.SupportChatAction;
import com.robinhood.shared.models.chat.common.api.ParticipantType;
import com.robinhood.store.supportchat.C41581R;
import com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry;
import com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntryStatus;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.event.ParticipantChangedOperation;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.event.entries.ParticipantChangedEntry;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.richLink.LinkItem;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.StaticContentFormat;
import com.salesforce.android.smi.network.data.domain.participant.Participant;
import com.salesforce.android.smi.network.data.domain.participant.ParticipantRoleType;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import p479j$.time.Instant;

/* compiled from: SalesforceMessages.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\t\u001a,\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002\u001a\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00020\u000f\u001a\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011*\u0004\u0018\u00010\u0013H\u0002\u001a\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0002\u001a\f\u0010\u0017\u001a\u00020\u0015*\u00020\u0016H\u0002\u001a\f\u0010\u0018\u001a\u00020\u0015*\u00020\u0016H\u0002¨\u0006\u0019"}, m3636d2 = {"toUiModel", "Lcom/robinhood/models/supportchat/db/SocketChatMessage;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "context", "Landroid/content/Context;", "bitmapStore", "Lcom/robinhood/android/bitmap/BitmapStore;", "toParticipantType", "Lcom/robinhood/shared/models/chat/common/api/ParticipantType;", "Lcom/salesforce/android/smi/network/data/domain/participant/Participant;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$MessagePayload;", "entry", "senderType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$ParticipantChangedPayload;", "lastReadEntryOrNull", "", "getBitmapSize", "Lkotlin/Pair;", "", "Ljava/io/File;", "isWebUrl", "", "", "isSendSafelyUrl", "isDeeplink", "lib-store-support-chat_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceMessagesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class SalesforceMessages {

    /* compiled from: SalesforceMessages.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceMessagesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ParticipantRoleType.values().length];
            try {
                iArr[ParticipantRoleType.EndUser.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ParticipantRoleType.System.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final SocketChatMessage toUiModel(ConversationEntry conversationEntry, Context context, BitmapStore bitmapStore) {
        Intrinsics.checkNotNullParameter(conversationEntry, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
        ParticipantType participantType = toParticipantType(conversationEntry.getSender());
        EntryPayload payload = conversationEntry.getPayload();
        if (payload instanceof EntryPayload.MessagePayload) {
            return toUiModel((EntryPayload.MessagePayload) payload, context, conversationEntry, participantType, bitmapStore);
        }
        if (payload instanceof EntryPayload.ParticipantChangedPayload) {
            return toUiModel((EntryPayload.ParticipantChangedPayload) payload, context, conversationEntry);
        }
        if ((payload instanceof EntryPayload.AcknowledgeDeliveryPayload) || (payload instanceof EntryPayload.AcknowledgeReadPayload) || (payload instanceof EntryPayload.RoutingResultPayload) || (payload instanceof EntryPayload.RoutingWorkResultPayload) || (payload instanceof EntryPayload.TypingIndicatorPayload) || (payload instanceof EntryPayload.TypingStartedIndicatorPayload) || (payload instanceof EntryPayload.TypingStoppedIndicatorPayload) || (payload instanceof EntryPayload.UnknownEntryPayload) || (payload instanceof EntryPayload.ProgressIndicatorPayload) || (payload instanceof EntryPayload.StreamingTokenPayload)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ParticipantType toParticipantType(Participant participant) {
        Intrinsics.checkNotNullParameter(participant, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[participant.getRoleType().ordinal()];
        if (i == 1) {
            return ParticipantType.USER;
        }
        if (i == 2) {
            return ParticipantType.SYSTEM;
        }
        return ParticipantType.AGENT;
    }

    public static final SocketChatMessage toUiModel(EntryPayload.MessagePayload messagePayload, Context context, ConversationEntry entry, ParticipantType senderType, BitmapStore bitmapStore) {
        SocketChatMessage3 action;
        SocketChatMessage3 text;
        Intrinsics.checkNotNullParameter(messagePayload, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(senderType, "senderType");
        Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
        MessageFormat content = messagePayload.getContent();
        if (content instanceof StaticContentFormat.TextFormat) {
            String identifier = entry.getIdentifier();
            long timestamp = entry.getTimestamp();
            Instant instantOfEpochMilli = Instant.ofEpochMilli(entry.getTimestamp());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(entry.getTimestamp());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(...)");
            String text2 = ((StaticContentFormat.TextFormat) content).getText();
            if (senderType == ParticipantType.SYSTEM) {
                text = new SocketChatMessage3.SystemInfo(null, ApiSocketChatMessage3.INFO, senderType, null, 8, null);
            } else {
                text = new SocketChatMessage3.Text(null, ApiSocketChatMessage3.TEXT, senderType, null, 8, null);
            }
            return new SocketChatMessage(identifier, timestamp, instantOfEpochMilli, text2, new SocketChatMessageAttributes(text), instantOfEpochMilli2);
        }
        if (content instanceof StaticContentFormat.RichLinkFormat) {
            StaticContentFormat.RichLinkFormat richLinkFormat = (StaticContentFormat.RichLinkFormat) content;
            LinkItem linkItem = richLinkFormat.getLinkItem();
            if (isSendSafelyUrl(linkItem.getUrl())) {
                ApiSocketChatMessage3 apiSocketChatMessage3 = ApiSocketChatMessage3.ACTION;
                String string2 = context.getString(C41581R.string.support_chat_sendsafely_title);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                action = new SocketChatMessage3.Action(null, apiSocketChatMessage3, senderType, null, new SocketChatMessage3.Action.Extras(CollectionsKt.listOf(new SupportChatAction.Deeplink(string2, null, new SupportChatAction.Deeplink.Extras(Uri.parse(linkItem.getUrl()))))), 8, null);
            } else if (isWebUrl(linkItem.getUrl())) {
                action = new SocketChatMessage3.Link(null, ApiSocketChatMessage3.LINK, senderType, null, new SocketChatMessage3.Link.Extras(linkItem.getTitleItem().getTitle(), HttpUrl.INSTANCE.get(linkItem.getUrl())), 8, null);
            } else {
                if (!isDeeplink(linkItem.getUrl())) {
                    return null;
                }
                action = new SocketChatMessage3.Action(null, ApiSocketChatMessage3.ACTION, senderType, null, new SocketChatMessage3.Action.Extras(CollectionsKt.listOf(new SupportChatAction.Deeplink(linkItem.getTitleItem().getTitle(), null, new SupportChatAction.Deeplink.Extras(Uri.parse(linkItem.getUrl()))))), 8, null);
            }
            SocketChatMessage3 socketChatMessage3 = action;
            String identifier2 = entry.getIdentifier();
            long timestamp2 = entry.getTimestamp();
            Instant instantOfEpochMilli3 = Instant.ofEpochMilli(entry.getTimestamp());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli3, "ofEpochMilli(...)");
            Instant instantOfEpochMilli4 = Instant.ofEpochMilli(entry.getTimestamp());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli4, "ofEpochMilli(...)");
            String text3 = richLinkFormat.getText();
            return new SocketChatMessage(identifier2, timestamp2, instantOfEpochMilli3, text3 == null ? "" : text3, new SocketChatMessageAttributes(socketChatMessage3), instantOfEpochMilli4);
        }
        if (content instanceof StaticContentFormat.AttachmentsFormat) {
            FileAsset fileAsset = (FileAsset) CollectionsKt.firstOrNull((List) ((StaticContentFormat.AttachmentsFormat) content).getAttachments());
            if (fileAsset == null) {
                return null;
            }
            File cacheFileByKey = bitmapStore.getCacheFileByKey(fileAsset.getName());
            Tuples2<Integer, Integer> bitmapSize = getBitmapSize(cacheFileByKey);
            int iIntValue = bitmapSize.component1().intValue();
            int iIntValue2 = bitmapSize.component2().intValue();
            String identifier3 = entry.getIdentifier();
            long timestamp3 = entry.getTimestamp();
            Instant instantOfEpochMilli5 = Instant.ofEpochMilli(entry.getTimestamp());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli5, "ofEpochMilli(...)");
            Instant instantOfEpochMilli6 = Instant.ofEpochMilli(entry.getTimestamp());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli6, "ofEpochMilli(...)");
            String url = fileAsset.getUrl();
            return new SocketChatMessage(identifier3, timestamp3, instantOfEpochMilli5, url == null ? "" : url, new SocketChatMessageAttributes(new SocketChatMessage3.Image(null, ApiSocketChatMessage3.IMAGE, senderType, null, new SocketChatMessage3.Image.Extras(null, cacheFileByKey != null ? Uri.fromFile(cacheFileByKey) : null, iIntValue, iIntValue2))), instantOfEpochMilli6);
        }
        throw new IllegalArgumentException("Unsupported message content type: " + content);
    }

    public static final SocketChatMessage toUiModel(EntryPayload.ParticipantChangedPayload participantChangedPayload, Context context, ConversationEntry entry) {
        Object next;
        Intrinsics.checkNotNullParameter(participantChangedPayload, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Iterator<T> it = participantChangedPayload.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ParticipantChangedEntry) next).getOperation() == ParticipantChangedOperation.Add) {
                break;
            }
        }
        ParticipantChangedEntry participantChangedEntry = (ParticipantChangedEntry) next;
        if (participantChangedEntry == null) {
            return null;
        }
        String string2 = context.getString(C41581R.string.support_chat_agent_reviewing_case, participantChangedEntry.getDisplayName());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String identifier = entry.getIdentifier();
        long timestamp = entry.getTimestamp();
        SocketChatMessageAttributes socketChatMessageAttributes = new SocketChatMessageAttributes(new SocketChatMessage3.SystemInfo(null, ApiSocketChatMessage3.INFO, ParticipantType.SYSTEM, null, 8, null));
        Instant instantOfEpochMilli = Instant.ofEpochMilli(entry.getTimestamp());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        Instant instantOfEpochMilli2 = Instant.ofEpochMilli(entry.getTimestamp());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(...)");
        return new SocketChatMessage(identifier, timestamp, instantOfEpochMilli, string2, socketChatMessageAttributes, instantOfEpochMilli2);
    }

    private static final Tuples2<Integer, Integer> getBitmapSize(File file) {
        if (file == null) {
            return Tuples4.m3642to(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return Tuples4.m3642to(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    private static final boolean isWebUrl(String str) {
        return HttpUrl.INSTANCE.parse(str) != null;
    }

    private static final boolean isSendSafelyUrl(String str) {
        return isWebUrl(str) && Intrinsics.areEqual(HttpUrl.INSTANCE.get(str).getHost(), "robinhood.sendsafely.com");
    }

    private static final boolean isDeeplink(String str) {
        return StringsKt.startsWith$default(str, DeepLinkPath.INSTANCE.getSCHEME_ROBINHOOD(), false, 2, (Object) null);
    }

    public static final ConversationEntry lastReadEntryOrNull(List<? extends ConversationEntry> list) {
        ConversationEntry conversationEntryPrevious;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ListIterator<? extends ConversationEntry> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                conversationEntryPrevious = null;
                break;
            }
            conversationEntryPrevious = listIterator.previous();
            if (conversationEntryPrevious.getStatus() == ConversationEntryStatus.Read) {
                break;
            }
        }
        return conversationEntryPrevious;
    }
}
