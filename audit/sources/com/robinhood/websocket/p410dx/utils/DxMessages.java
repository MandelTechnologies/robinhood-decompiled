package com.robinhood.websocket.p410dx.utils;

import com.robinhood.websocket.p410dx.DxConstants;
import com.robinhood.websocket.p410dx.DxTopic;
import com.robinhood.websocket.p410dx.models.DxFeedData;
import com.robinhood.websocket.p410dx.models.DxMessage;
import com.robinhood.websocket.p410dx.models.DxResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DxMessages.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\b\u0010\u0006\u001a\u00020\u0001H\u0000\u001a \u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0003H\u0000\u001a4\u0010\u0010\u001a\u00020\u00012\u0014\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010\u00122\u0014\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010\u0012H\u0000\u001a\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012H\u0002\u001a\b\u0010\u0019\u001a\u00020\u0001H\u0000¨\u0006\u001a"}, m3636d2 = {"setupMessage", "Lcom/robinhood/websocket/dx/models/DxMessage;", "appVersion", "", "authMessage", "token", "openFeedChannelMessage", "openDomChannelMessage", "channel", "", "symbol", "instrumentType", "Lcom/robinhood/websocket/dx/DxTopic$InstrumentType;", "closeChannelMessage", "configureChannelMessage", "service", "updateFeedSubscriptionMessage", "add", "", "Lcom/robinhood/websocket/dx/DxTopic$Feed;", "Lcom/robinhood/websocket/dx/models/DxFeedData;", "remove", "toSubscriptions", "", "Lcom/robinhood/websocket/dx/models/DxMessage$FeedSubscription$Subscription;", "createKeepAliveMessage", "lib-websocket-dx_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.websocket.dx.utils.DxMessagesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class DxMessages {
    public static final DxMessage setupMessage(String appVersion) {
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        return new DxMessage.Setup(0, 60, 60, "1.0-RH-Android/" + appVersion);
    }

    public static final DxMessage authMessage(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        return new DxMessage.Auth(0, token);
    }

    public static final DxMessage openFeedChannelMessage() {
        return new DxMessage.ChannelRequest(1, "FEED", DxMessage.ChannelRequest.Parameters.INSTANCE.ofFeed("AUTO"));
    }

    public static final DxMessage openDomChannelMessage(int i, String symbol, DxTopic.InstrumentType instrumentType) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        return new DxMessage.ChannelRequest(i, DxConstants.DOM_SERVICE, DxMessage.ChannelRequest.Parameters.INSTANCE.ofDom(symbol, instrumentType));
    }

    public static final DxMessage closeChannelMessage(int i) {
        return new DxMessage.ChannelCancel(i);
    }

    public static final DxMessage configureChannelMessage(int i, String service) {
        Intrinsics.checkNotNullParameter(service, "service");
        if (Intrinsics.areEqual(service, "FEED")) {
            DxFeedData.Companion companion = DxFeedData.INSTANCE;
            return new DxMessage.FeedSetup(i, 0.25f, "FULL", MapsKt.mapOf(Tuples4.m3642to(DxFeedData.TYPE_QUOTE, companion.getQUOTE_EVENT_FIELDS()), Tuples4.m3642to(DxFeedData.TYPE_TRADE, companion.getTRADE_EVENT_FIELDS())));
        }
        if (Intrinsics.areEqual(service, DxConstants.DOM_SERVICE)) {
            return new DxMessage.DomSetup(i, 10, 0.25f, "FULL", DxResponse.DomSnapshot.INSTANCE.getDOM_ORDER_FIELDS());
        }
        throw new IllegalArgumentException("Unrecognized DX service type: " + service);
    }

    public static final DxMessage updateFeedSubscriptionMessage(Set<? extends DxTopic.Feed<DxFeedData>> set, Set<? extends DxTopic.Feed<DxFeedData>> set2) {
        return new DxMessage.FeedSubscription(1, set != null ? toSubscriptions(set) : null, set2 != null ? toSubscriptions(set2) : null);
    }

    private static final List<DxMessage.FeedSubscription.Subscription> toSubscriptions(Set<? extends DxTopic.Feed<DxFeedData>> set) {
        Set<? extends DxTopic.Feed<DxFeedData>> set2 = set;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10));
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            DxTopic.Feed feed = (DxTopic.Feed) it.next();
            arrayList.add(new DxMessage.FeedSubscription.Subscription(feed.getType(), feed.getSymbol()));
        }
        return arrayList;
    }

    public static final DxMessage createKeepAliveMessage() {
        return new DxMessage.KeepAlive(0);
    }
}
