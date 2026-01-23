package com.robinhood.websocket.p413md.utils;

import com.robinhood.websocket.p413md.MdConstants;
import com.robinhood.websocket.p413md.MdTopic;
import com.robinhood.websocket.p413md.models.MdFeedData;
import com.robinhood.websocket.p413md.models.MdMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MdMessages.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0006H\u0000\u001a4\u0010\u000f\u001a\u00020\u00012\u0014\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u00112\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0011H\u0000\u001a\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\t\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0003\"\u0014\u0010\u000b\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0003\"\u0014\u0010\r\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0003¨\u0006\u0018"}, m3636d2 = {"createKeepAliveMessage", "Lcom/robinhood/websocket/md/models/MdMessage;", "getCreateKeepAliveMessage", "()Lcom/robinhood/websocket/md/models/MdMessage;", "setupMessage", "appVersion", "", "authMessage", "token", "setupLoggingMessage", "getSetupLoggingMessage", "openFeedChannelMessage", "getOpenFeedChannelMessage", "feedSetupMessage", "getFeedSetupMessage", "updateFeedSubscriptionMessage", "add", "", "Lcom/robinhood/websocket/md/MdTopic$Feed;", "Lcom/robinhood/websocket/md/models/MdFeedData;", "remove", "toSubscriptions", "", "Lcom/robinhood/websocket/md/models/MdMessage$FeedSubscription$Subscription;", "lib-websocket-md_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.websocket.md.utils.MdMessagesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class MdMessages {
    private static final MdMessage createKeepAliveMessage = new MdMessage.KeepAlive(0);
    private static final MdMessage feedSetupMessage;
    private static final MdMessage openFeedChannelMessage;
    private static final MdMessage setupLoggingMessage;

    static {
        MdConstants mdConstants = MdConstants.INSTANCE;
        setupLoggingMessage = new MdMessage.SetupLogging(0, mdConstants.getENABLE_LOGGING(), mdConstants.getENABLE_LOGGING());
        openFeedChannelMessage = new MdMessage.ChannelRequest(1, "FEED", new MdMessage.ChannelRequest.Parameters("AUTO"));
        feedSetupMessage = new MdMessage.FeedSetup(1, 10, "FULL");
    }

    public static final MdMessage getCreateKeepAliveMessage() {
        return createKeepAliveMessage;
    }

    public static final MdMessage setupMessage(String appVersion) {
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        return new MdMessage.Setup(0, 120, 60, "1.0-RH-Android/" + appVersion + "}");
    }

    public static final MdMessage authMessage(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        return new MdMessage.Auth(0, token);
    }

    public static final MdMessage getSetupLoggingMessage() {
        return setupLoggingMessage;
    }

    public static final MdMessage getOpenFeedChannelMessage() {
        return openFeedChannelMessage;
    }

    public static final MdMessage getFeedSetupMessage() {
        return feedSetupMessage;
    }

    public static final MdMessage updateFeedSubscriptionMessage(Set<? extends MdTopic.Feed<MdFeedData>> set, Set<? extends MdTopic.Feed<MdFeedData>> set2) {
        return new MdMessage.FeedSubscription(1, set != null ? toSubscriptions(set) : null, set2 != null ? toSubscriptions(set2) : null);
    }

    private static final List<MdMessage.FeedSubscription.Subscription> toSubscriptions(Set<? extends MdTopic.Feed<MdFeedData>> set) {
        Set<? extends MdTopic.Feed<MdFeedData>> set2 = set;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10));
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            MdTopic.Feed feed = (MdTopic.Feed) it.next();
            arrayList.add(new MdMessage.FeedSubscription.Subscription(feed.getType(), feed.getSymbol(), feed.getIncludeQuoteParams() ? new MdMessage.QuoteParams(feed.getIncludeInactive(), feed.getIncludeBboSource(), feed.getBounds()) : null));
        }
        return arrayList;
    }
}
