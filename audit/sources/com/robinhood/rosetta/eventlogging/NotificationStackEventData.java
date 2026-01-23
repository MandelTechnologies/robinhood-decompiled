package com.robinhood.rosetta.eventlogging;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: NotificationStackEventData.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;BÑ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u00103\u001a\u00020\u0002H\u0017J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0096\u0002J\b\u00108\u001a\u00020\u0007H\u0016J\b\u00109\u001a\u00020\u0004H\u0016JÐ\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u001aR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0016\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0016\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0016\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0016\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0016\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0016\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0016\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001e¨\u0006<"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NotificationStackEventData;", "Lcom/squareup/wire/Message;", "", "type", "", "entity_id", "number_of_notifications", "", "resource_url", "title", "message", "number_of_impressions", "number_of_dismisses", "time_since_first_impression", "item_index", "promo_product", "surface", "load_id", "client_context", "Lcom/robinhood/rosetta/eventlogging/ClientContext;", "surface_version", "location", "deeplink", "badge_text", "conversion_event", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getType", "()Ljava/lang/String;", "getEntity_id", "getNumber_of_notifications", "()I", "getResource_url", "getTitle", "getMessage", "getNumber_of_impressions", "getNumber_of_dismisses", "getTime_since_first_impression", "getItem_index", "getPromo_product", "getSurface", "getLoad_id", "getClient_context", "()Lcom/robinhood/rosetta/eventlogging/ClientContext;", "getSurface_version", "getLocation", "getDeeplink", "getBadge_text", "getConversion_event", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class NotificationStackEventData extends Message {

    @JvmField
    public static final ProtoAdapter<NotificationStackEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "badgeText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final String badge_text;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientContext#ADAPTER", jsonName = "clientContext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final ClientContext client_context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "conversionEvent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final String conversion_event;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final String deeplink;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "entityId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String entity_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "itemIndex", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final int item_index;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loadId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String load_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final String location;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numberOfDismisses", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final int number_of_dismisses;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numberOfImpressions", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final int number_of_impressions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numberOfNotifications", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int number_of_notifications;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "promoProduct", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String promo_product;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "resourceUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String resource_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String surface;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "surfaceVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final String surface_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "timeSinceFirstImpression", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final int time_since_first_impression;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String type;

    public NotificationStackEventData() {
        this(null, null, 0, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public /* synthetic */ NotificationStackEventData(String str, String str2, int i, String str3, String str4, String str5, int i2, int i3, int i4, int i5, String str6, String str7, String str8, ClientContext clientContext, String str9, String str10, String str11, String str12, String str13, ByteString byteString, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? 0 : i, (i6 & 8) != 0 ? "" : str3, (i6 & 16) != 0 ? "" : str4, (i6 & 32) != 0 ? "" : str5, (i6 & 64) != 0 ? 0 : i2, (i6 & 128) != 0 ? 0 : i3, (i6 & 256) != 0 ? 0 : i4, (i6 & 512) == 0 ? i5 : 0, (i6 & 1024) != 0 ? "" : str6, (i6 & 2048) != 0 ? "" : str7, (i6 & 4096) != 0 ? "" : str8, (i6 & 8192) != 0 ? null : clientContext, (i6 & 16384) != 0 ? "" : str9, (i6 & 32768) != 0 ? "" : str10, (i6 & 65536) != 0 ? "" : str11, (i6 & 131072) != 0 ? "" : str12, (i6 & 262144) == 0 ? str13 : "", (i6 & 524288) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24412newBuilder();
    }

    public final String getType() {
        return this.type;
    }

    public final String getEntity_id() {
        return this.entity_id;
    }

    public final int getNumber_of_notifications() {
        return this.number_of_notifications;
    }

    public final String getResource_url() {
        return this.resource_url;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getNumber_of_impressions() {
        return this.number_of_impressions;
    }

    public final int getNumber_of_dismisses() {
        return this.number_of_dismisses;
    }

    public final int getTime_since_first_impression() {
        return this.time_since_first_impression;
    }

    public final int getItem_index() {
        return this.item_index;
    }

    public final String getPromo_product() {
        return this.promo_product;
    }

    public final String getSurface() {
        return this.surface;
    }

    public final String getLoad_id() {
        return this.load_id;
    }

    public final ClientContext getClient_context() {
        return this.client_context;
    }

    public final String getSurface_version() {
        return this.surface_version;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getBadge_text() {
        return this.badge_text;
    }

    public final String getConversion_event() {
        return this.conversion_event;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationStackEventData(String type2, String entity_id, int i, String resource_url, String title, String message, int i2, int i3, int i4, int i5, String promo_product, String surface, String load_id, ClientContext clientContext, String surface_version, String location, String deeplink, String badge_text, String conversion_event, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(entity_id, "entity_id");
        Intrinsics.checkNotNullParameter(resource_url, "resource_url");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(promo_product, "promo_product");
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(load_id, "load_id");
        Intrinsics.checkNotNullParameter(surface_version, "surface_version");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(badge_text, "badge_text");
        Intrinsics.checkNotNullParameter(conversion_event, "conversion_event");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.type = type2;
        this.entity_id = entity_id;
        this.number_of_notifications = i;
        this.resource_url = resource_url;
        this.title = title;
        this.message = message;
        this.number_of_impressions = i2;
        this.number_of_dismisses = i3;
        this.time_since_first_impression = i4;
        this.item_index = i5;
        this.promo_product = promo_product;
        this.surface = surface;
        this.load_id = load_id;
        this.client_context = clientContext;
        this.surface_version = surface_version;
        this.location = location;
        this.deeplink = deeplink;
        this.badge_text = badge_text;
        this.conversion_event = conversion_event;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24412newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NotificationStackEventData)) {
            return false;
        }
        NotificationStackEventData notificationStackEventData = (NotificationStackEventData) other;
        return Intrinsics.areEqual(unknownFields(), notificationStackEventData.unknownFields()) && Intrinsics.areEqual(this.type, notificationStackEventData.type) && Intrinsics.areEqual(this.entity_id, notificationStackEventData.entity_id) && this.number_of_notifications == notificationStackEventData.number_of_notifications && Intrinsics.areEqual(this.resource_url, notificationStackEventData.resource_url) && Intrinsics.areEqual(this.title, notificationStackEventData.title) && Intrinsics.areEqual(this.message, notificationStackEventData.message) && this.number_of_impressions == notificationStackEventData.number_of_impressions && this.number_of_dismisses == notificationStackEventData.number_of_dismisses && this.time_since_first_impression == notificationStackEventData.time_since_first_impression && this.item_index == notificationStackEventData.item_index && Intrinsics.areEqual(this.promo_product, notificationStackEventData.promo_product) && Intrinsics.areEqual(this.surface, notificationStackEventData.surface) && Intrinsics.areEqual(this.load_id, notificationStackEventData.load_id) && Intrinsics.areEqual(this.client_context, notificationStackEventData.client_context) && Intrinsics.areEqual(this.surface_version, notificationStackEventData.surface_version) && Intrinsics.areEqual(this.location, notificationStackEventData.location) && Intrinsics.areEqual(this.deeplink, notificationStackEventData.deeplink) && Intrinsics.areEqual(this.badge_text, notificationStackEventData.badge_text) && Intrinsics.areEqual(this.conversion_event, notificationStackEventData.conversion_event);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37) + this.entity_id.hashCode()) * 37) + Integer.hashCode(this.number_of_notifications)) * 37) + this.resource_url.hashCode()) * 37) + this.title.hashCode()) * 37) + this.message.hashCode()) * 37) + Integer.hashCode(this.number_of_impressions)) * 37) + Integer.hashCode(this.number_of_dismisses)) * 37) + Integer.hashCode(this.time_since_first_impression)) * 37) + Integer.hashCode(this.item_index)) * 37) + this.promo_product.hashCode()) * 37) + this.surface.hashCode()) * 37) + this.load_id.hashCode()) * 37;
        ClientContext clientContext = this.client_context;
        int iHashCode2 = ((((((((((iHashCode + (clientContext != null ? clientContext.hashCode() : 0)) * 37) + this.surface_version.hashCode()) * 37) + this.location.hashCode()) * 37) + this.deeplink.hashCode()) * 37) + this.badge_text.hashCode()) * 37) + this.conversion_event.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + Internal.sanitize(this.type));
        arrayList.add("entity_id=" + Internal.sanitize(this.entity_id));
        arrayList.add("number_of_notifications=" + this.number_of_notifications);
        arrayList.add("resource_url=" + Internal.sanitize(this.resource_url));
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("message=" + Internal.sanitize(this.message));
        arrayList.add("number_of_impressions=" + this.number_of_impressions);
        arrayList.add("number_of_dismisses=" + this.number_of_dismisses);
        arrayList.add("time_since_first_impression=" + this.time_since_first_impression);
        arrayList.add("item_index=" + this.item_index);
        arrayList.add("promo_product=" + Internal.sanitize(this.promo_product));
        arrayList.add("surface=" + Internal.sanitize(this.surface));
        arrayList.add("load_id=" + Internal.sanitize(this.load_id));
        ClientContext clientContext = this.client_context;
        if (clientContext != null) {
            arrayList.add("client_context=" + clientContext);
        }
        arrayList.add("surface_version=" + Internal.sanitize(this.surface_version));
        arrayList.add("location=" + Internal.sanitize(this.location));
        arrayList.add("deeplink=" + Internal.sanitize(this.deeplink));
        arrayList.add("badge_text=" + Internal.sanitize(this.badge_text));
        arrayList.add("conversion_event=" + Internal.sanitize(this.conversion_event));
        return CollectionsKt.joinToString$default(arrayList, ", ", "NotificationStackEventData{", "}", 0, null, null, 56, null);
    }

    public final NotificationStackEventData copy(String type2, String entity_id, int number_of_notifications, String resource_url, String title, String message, int number_of_impressions, int number_of_dismisses, int time_since_first_impression, int item_index, String promo_product, String surface, String load_id, ClientContext client_context, String surface_version, String location, String deeplink, String badge_text, String conversion_event, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(entity_id, "entity_id");
        Intrinsics.checkNotNullParameter(resource_url, "resource_url");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(promo_product, "promo_product");
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(load_id, "load_id");
        Intrinsics.checkNotNullParameter(surface_version, "surface_version");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(badge_text, "badge_text");
        Intrinsics.checkNotNullParameter(conversion_event, "conversion_event");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NotificationStackEventData(type2, entity_id, number_of_notifications, resource_url, title, message, number_of_impressions, number_of_dismisses, time_since_first_impression, item_index, promo_product, surface, load_id, client_context, surface_version, location, deeplink, badge_text, conversion_event, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NotificationStackEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NotificationStackEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.NotificationStackEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NotificationStackEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getType());
                }
                if (!Intrinsics.areEqual(value.getEntity_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getEntity_id());
                }
                if (value.getNumber_of_notifications() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getNumber_of_notifications()));
                }
                if (!Intrinsics.areEqual(value.getResource_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getResource_url());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getMessage());
                }
                if (value.getNumber_of_impressions() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.getNumber_of_impressions()));
                }
                if (value.getNumber_of_dismisses() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(8, Integer.valueOf(value.getNumber_of_dismisses()));
                }
                if (value.getTime_since_first_impression() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(9, Integer.valueOf(value.getTime_since_first_impression()));
                }
                if (value.getItem_index() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(10, Integer.valueOf(value.getItem_index()));
                }
                if (!Intrinsics.areEqual(value.getPromo_product(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getPromo_product());
                }
                if (!Intrinsics.areEqual(value.getSurface(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getSurface());
                }
                if (!Intrinsics.areEqual(value.getLoad_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getLoad_id());
                }
                if (value.getClient_context() != null) {
                    size += ClientContext.ADAPTER.encodedSizeWithTag(14, value.getClient_context());
                }
                if (!Intrinsics.areEqual(value.getSurface_version(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(15, value.getSurface_version());
                }
                if (!Intrinsics.areEqual(value.getLocation(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(16, value.getLocation());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(17, value.getDeeplink());
                }
                if (!Intrinsics.areEqual(value.getBadge_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(18, value.getBadge_text());
                }
                return !Intrinsics.areEqual(value.getConversion_event(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(19, value.getConversion_event()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NotificationStackEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getEntity_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEntity_id());
                }
                if (value.getNumber_of_notifications() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getNumber_of_notifications()));
                }
                if (!Intrinsics.areEqual(value.getResource_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getResource_url());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getMessage());
                }
                if (value.getNumber_of_impressions() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getNumber_of_impressions()));
                }
                if (value.getNumber_of_dismisses() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 8, (int) Integer.valueOf(value.getNumber_of_dismisses()));
                }
                if (value.getTime_since_first_impression() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 9, (int) Integer.valueOf(value.getTime_since_first_impression()));
                }
                if (value.getItem_index() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 10, (int) Integer.valueOf(value.getItem_index()));
                }
                if (!Intrinsics.areEqual(value.getPromo_product(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getPromo_product());
                }
                if (!Intrinsics.areEqual(value.getSurface(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getSurface());
                }
                if (!Intrinsics.areEqual(value.getLoad_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getLoad_id());
                }
                if (value.getClient_context() != null) {
                    ClientContext.ADAPTER.encodeWithTag(writer, 14, (int) value.getClient_context());
                }
                if (!Intrinsics.areEqual(value.getSurface_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getSurface_version());
                }
                if (!Intrinsics.areEqual(value.getLocation(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getLocation());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getDeeplink());
                }
                if (!Intrinsics.areEqual(value.getBadge_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getBadge_text());
                }
                if (!Intrinsics.areEqual(value.getConversion_event(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 19, (int) value.getConversion_event());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NotificationStackEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getConversion_event(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 19, (int) value.getConversion_event());
                }
                if (!Intrinsics.areEqual(value.getBadge_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getBadge_text());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getDeeplink());
                }
                if (!Intrinsics.areEqual(value.getLocation(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getLocation());
                }
                if (!Intrinsics.areEqual(value.getSurface_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getSurface_version());
                }
                if (value.getClient_context() != null) {
                    ClientContext.ADAPTER.encodeWithTag(writer, 14, (int) value.getClient_context());
                }
                if (!Intrinsics.areEqual(value.getLoad_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getLoad_id());
                }
                if (!Intrinsics.areEqual(value.getSurface(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getSurface());
                }
                if (!Intrinsics.areEqual(value.getPromo_product(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getPromo_product());
                }
                if (value.getItem_index() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 10, (int) Integer.valueOf(value.getItem_index()));
                }
                if (value.getTime_since_first_impression() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 9, (int) Integer.valueOf(value.getTime_since_first_impression()));
                }
                if (value.getNumber_of_dismisses() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 8, (int) Integer.valueOf(value.getNumber_of_dismisses()));
                }
                if (value.getNumber_of_impressions() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getNumber_of_impressions()));
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getMessage());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getResource_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getResource_url());
                }
                if (value.getNumber_of_notifications() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getNumber_of_notifications()));
                }
                if (!Intrinsics.areEqual(value.getEntity_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEntity_id());
                }
                if (Intrinsics.areEqual(value.getType(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getType());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public NotificationStackEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                String strDecode9 = strDecode8;
                String strDecode10 = strDecode9;
                String strDecode11 = strDecode10;
                int iIntValue = 0;
                int iIntValue2 = 0;
                int iIntValue3 = 0;
                int iIntValue4 = 0;
                int iIntValue5 = 0;
                ClientContext clientContextDecode = null;
                String strDecode12 = strDecode11;
                String strDecode13 = strDecode12;
                while (true) {
                    int iNextTag = reader.nextTag();
                    String str = strDecode12;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode12 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 4:
                                strDecode13 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 8:
                                iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 9:
                                iIntValue4 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 10:
                                iIntValue5 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 11:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                clientContextDecode = ClientContext.ADAPTER.decode(reader);
                                break;
                            case 15:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 16:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 17:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 18:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 19:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                        strDecode12 = str;
                    } else {
                        return new NotificationStackEventData(strDecode11, str, iIntValue, strDecode13, strDecode, strDecode2, iIntValue2, iIntValue3, iIntValue4, iIntValue5, strDecode3, strDecode4, strDecode5, clientContextDecode, strDecode6, strDecode7, strDecode8, strDecode9, strDecode10, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NotificationStackEventData redact(NotificationStackEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ClientContext client_context = value.getClient_context();
                return value.copy((516095 & 1) != 0 ? value.type : null, (516095 & 2) != 0 ? value.entity_id : null, (516095 & 4) != 0 ? value.number_of_notifications : 0, (516095 & 8) != 0 ? value.resource_url : null, (516095 & 16) != 0 ? value.title : null, (516095 & 32) != 0 ? value.message : null, (516095 & 64) != 0 ? value.number_of_impressions : 0, (516095 & 128) != 0 ? value.number_of_dismisses : 0, (516095 & 256) != 0 ? value.time_since_first_impression : 0, (516095 & 512) != 0 ? value.item_index : 0, (516095 & 1024) != 0 ? value.promo_product : null, (516095 & 2048) != 0 ? value.surface : null, (516095 & 4096) != 0 ? value.load_id : null, (516095 & 8192) != 0 ? value.client_context : client_context != null ? ClientContext.ADAPTER.redact(client_context) : null, (516095 & 16384) != 0 ? value.surface_version : null, (516095 & 32768) != 0 ? value.location : null, (516095 & 65536) != 0 ? value.deeplink : null, (516095 & 131072) != 0 ? value.badge_text : null, (516095 & 262144) != 0 ? value.conversion_event : null, (516095 & 524288) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
