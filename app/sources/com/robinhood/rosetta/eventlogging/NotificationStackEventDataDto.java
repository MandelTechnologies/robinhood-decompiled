package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.ClientContextDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: NotificationStackEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004CDEFB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BÉ\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\b\b\u0002\u0010\u001c\u001a\u00020\t\u0012\b\b\u0002\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u001eJÆ\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\tJ\b\u00106\u001a\u00020\u0002H\u0016J\b\u00107\u001a\u00020\tH\u0016J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;H\u0096\u0002J\b\u0010<\u001a\u00020\fH\u0016J\u0018\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\fH\u0016J\b\u0010B\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b!\u0010 R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b$\u0010 R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b%\u0010 R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b&\u0010 R\u0011\u0010\u0010\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0011\u0010\u0011\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b(\u0010#R\u0011\u0010\u0012\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b)\u0010#R\u0011\u0010\u0013\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b*\u0010#R\u0011\u0010\u0014\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b+\u0010 R\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b,\u0010 R\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b-\u0010 R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u0019\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b0\u0010 R\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b1\u0010 R\u0011\u0010\u001b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b2\u0010 R\u0011\u0010\u001c\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b3\u0010 R\u0011\u0010\u001d\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b4\u0010 ¨\u0006G"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/NotificationStackEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto$Surrogate;)V", "type", "", "entity_id", "number_of_notifications", "", "resource_url", "title", "message", "number_of_impressions", "number_of_dismisses", "time_since_first_impression", "item_index", "promo_product", "surface", "load_id", "client_context", "Lcom/robinhood/rosetta/eventlogging/ClientContextDto;", "surface_version", "location", "deeplink", "badge_text", "conversion_event", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientContextDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getEntity_id", "getNumber_of_notifications", "()I", "getResource_url", "getTitle", "getMessage", "getNumber_of_impressions", "getNumber_of_dismisses", "getTime_since_first_impression", "getItem_index", "getPromo_product", "getSurface", "getLoad_id", "getClient_context", "()Lcom/robinhood/rosetta/eventlogging/ClientContextDto;", "getSurface_version", "getLocation", "getDeeplink", "getBadge_text", "getConversion_event", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class NotificationStackEventDataDto implements Dto3<NotificationStackEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<NotificationStackEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<NotificationStackEventDataDto, NotificationStackEventData>> binaryBase64Serializer$delegate;
    private static final NotificationStackEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ NotificationStackEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private NotificationStackEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getType() {
        return this.surrogate.getType();
    }

    public final String getEntity_id() {
        return this.surrogate.getEntity_id();
    }

    public final int getNumber_of_notifications() {
        return this.surrogate.getNumber_of_notifications();
    }

    public final String getResource_url() {
        return this.surrogate.getResource_url();
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getMessage() {
        return this.surrogate.getMessage();
    }

    public final int getNumber_of_impressions() {
        return this.surrogate.getNumber_of_impressions();
    }

    public final int getNumber_of_dismisses() {
        return this.surrogate.getNumber_of_dismisses();
    }

    public final int getTime_since_first_impression() {
        return this.surrogate.getTime_since_first_impression();
    }

    public final int getItem_index() {
        return this.surrogate.getItem_index();
    }

    public final String getPromo_product() {
        return this.surrogate.getPromo_product();
    }

    public final String getSurface() {
        return this.surrogate.getSurface();
    }

    public final String getLoad_id() {
        return this.surrogate.getLoad_id();
    }

    public final ClientContextDto getClient_context() {
        return this.surrogate.getClient_context();
    }

    public final String getSurface_version() {
        return this.surrogate.getSurface_version();
    }

    public final String getLocation() {
        return this.surrogate.getLocation();
    }

    public final String getDeeplink() {
        return this.surrogate.getDeeplink();
    }

    public final String getBadge_text() {
        return this.surrogate.getBadge_text();
    }

    public final String getConversion_event() {
        return this.surrogate.getConversion_event();
    }

    public /* synthetic */ NotificationStackEventDataDto(String str, String str2, int i, String str3, String str4, String str5, int i2, int i3, int i4, int i5, String str6, String str7, String str8, ClientContextDto clientContextDto, String str9, String str10, String str11, String str12, String str13, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? 0 : i, (i6 & 8) != 0 ? "" : str3, (i6 & 16) != 0 ? "" : str4, (i6 & 32) != 0 ? "" : str5, (i6 & 64) != 0 ? 0 : i2, (i6 & 128) != 0 ? 0 : i3, (i6 & 256) != 0 ? 0 : i4, (i6 & 512) == 0 ? i5 : 0, (i6 & 1024) != 0 ? "" : str6, (i6 & 2048) != 0 ? "" : str7, (i6 & 4096) != 0 ? "" : str8, (i6 & 8192) != 0 ? null : clientContextDto, (i6 & 16384) != 0 ? "" : str9, (i6 & 32768) != 0 ? "" : str10, (i6 & 65536) != 0 ? "" : str11, (i6 & 131072) != 0 ? "" : str12, (i6 & 262144) != 0 ? "" : str13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotificationStackEventDataDto(String type2, String entity_id, int i, String resource_url, String title, String message, int i2, int i3, int i4, int i5, String promo_product, String surface, String load_id, ClientContextDto clientContextDto, String surface_version, String location, String deeplink, String badge_text, String conversion_event) {
        this(new Surrogate(type2, entity_id, i, resource_url, title, message, i2, i3, i4, i5, promo_product, surface, load_id, clientContextDto, surface_version, location, deeplink, badge_text, conversion_event));
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
    }

    public static /* synthetic */ NotificationStackEventDataDto copy$default(NotificationStackEventDataDto notificationStackEventDataDto, String str, String str2, int i, String str3, String str4, String str5, int i2, int i3, int i4, int i5, String str6, String str7, String str8, ClientContextDto clientContextDto, String str9, String str10, String str11, String str12, String str13, int i6, Object obj) {
        String conversion_event;
        String str14;
        String type2 = (i6 & 1) != 0 ? notificationStackEventDataDto.surrogate.getType() : str;
        String entity_id = (i6 & 2) != 0 ? notificationStackEventDataDto.surrogate.getEntity_id() : str2;
        int number_of_notifications = (i6 & 4) != 0 ? notificationStackEventDataDto.surrogate.getNumber_of_notifications() : i;
        String resource_url = (i6 & 8) != 0 ? notificationStackEventDataDto.surrogate.getResource_url() : str3;
        String title = (i6 & 16) != 0 ? notificationStackEventDataDto.surrogate.getTitle() : str4;
        String message = (i6 & 32) != 0 ? notificationStackEventDataDto.surrogate.getMessage() : str5;
        int number_of_impressions = (i6 & 64) != 0 ? notificationStackEventDataDto.surrogate.getNumber_of_impressions() : i2;
        int number_of_dismisses = (i6 & 128) != 0 ? notificationStackEventDataDto.surrogate.getNumber_of_dismisses() : i3;
        int time_since_first_impression = (i6 & 256) != 0 ? notificationStackEventDataDto.surrogate.getTime_since_first_impression() : i4;
        int item_index = (i6 & 512) != 0 ? notificationStackEventDataDto.surrogate.getItem_index() : i5;
        String promo_product = (i6 & 1024) != 0 ? notificationStackEventDataDto.surrogate.getPromo_product() : str6;
        String surface = (i6 & 2048) != 0 ? notificationStackEventDataDto.surrogate.getSurface() : str7;
        String load_id = (i6 & 4096) != 0 ? notificationStackEventDataDto.surrogate.getLoad_id() : str8;
        ClientContextDto client_context = (i6 & 8192) != 0 ? notificationStackEventDataDto.surrogate.getClient_context() : clientContextDto;
        String str15 = type2;
        String surface_version = (i6 & 16384) != 0 ? notificationStackEventDataDto.surrogate.getSurface_version() : str9;
        String location = (i6 & 32768) != 0 ? notificationStackEventDataDto.surrogate.getLocation() : str10;
        String deeplink = (i6 & 65536) != 0 ? notificationStackEventDataDto.surrogate.getDeeplink() : str11;
        String badge_text = (i6 & 131072) != 0 ? notificationStackEventDataDto.surrogate.getBadge_text() : str12;
        if ((i6 & 262144) != 0) {
            str14 = badge_text;
            conversion_event = notificationStackEventDataDto.surrogate.getConversion_event();
        } else {
            conversion_event = str13;
            str14 = badge_text;
        }
        return notificationStackEventDataDto.copy(str15, entity_id, number_of_notifications, resource_url, title, message, number_of_impressions, number_of_dismisses, time_since_first_impression, item_index, promo_product, surface, load_id, client_context, surface_version, location, deeplink, str14, conversion_event);
    }

    public final NotificationStackEventDataDto copy(String type2, String entity_id, int number_of_notifications, String resource_url, String title, String message, int number_of_impressions, int number_of_dismisses, int time_since_first_impression, int item_index, String promo_product, String surface, String load_id, ClientContextDto client_context, String surface_version, String location, String deeplink, String badge_text, String conversion_event) {
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
        return new NotificationStackEventDataDto(new Surrogate(type2, entity_id, number_of_notifications, resource_url, title, message, number_of_impressions, number_of_dismisses, time_since_first_impression, item_index, promo_product, surface, load_id, client_context, surface_version, location, deeplink, badge_text, conversion_event));
    }

    @Override // com.robinhood.idl.Dto
    public NotificationStackEventData toProto() {
        String type2 = this.surrogate.getType();
        String entity_id = this.surrogate.getEntity_id();
        int number_of_notifications = this.surrogate.getNumber_of_notifications();
        String resource_url = this.surrogate.getResource_url();
        String title = this.surrogate.getTitle();
        String message = this.surrogate.getMessage();
        int number_of_impressions = this.surrogate.getNumber_of_impressions();
        int number_of_dismisses = this.surrogate.getNumber_of_dismisses();
        int time_since_first_impression = this.surrogate.getTime_since_first_impression();
        int item_index = this.surrogate.getItem_index();
        String promo_product = this.surrogate.getPromo_product();
        String surface = this.surrogate.getSurface();
        String load_id = this.surrogate.getLoad_id();
        ClientContextDto client_context = this.surrogate.getClient_context();
        return new NotificationStackEventData(type2, entity_id, number_of_notifications, resource_url, title, message, number_of_impressions, number_of_dismisses, time_since_first_impression, item_index, promo_product, surface, load_id, client_context != null ? client_context.toProto() : null, this.surrogate.getSurface_version(), this.surrogate.getLocation(), this.surrogate.getDeeplink(), this.surrogate.getBadge_text(), this.surrogate.getConversion_event(), null, 524288, null);
    }

    public String toString() {
        return "[NotificationStackEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof NotificationStackEventDataDto) && Intrinsics.areEqual(((NotificationStackEventDataDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NotificationStackEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 m2\u00020\u0001:\u0002lmB\u0092\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\r\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cBÏ\u0001\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010 J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\u0018\u0010M\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\u0018\u0010Q\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\u0018\u0010R\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\u0018\u0010S\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\u0018\u0010T\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\u0094\u0002\u0010^\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\u0017\b\u0002\u0010\r\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\u0017\b\u0002\u0010\u000e\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\u0017\b\u0002\u0010\u000f\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\u0017\b\u0002\u0010\u0010\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u0003HÆ\u0001J\u0013\u0010_\u001a\u00020`2\b\u0010a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010b\u001a\u00020\u0006HÖ\u0001J\t\u0010c\u001a\u00020\u0003HÖ\u0001J%\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\u00002\u0006\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020jH\u0001¢\u0006\u0002\bkR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R+\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\"\u001a\u0004\b(\u0010)R\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\"\u001a\u0004\b+\u0010$R\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\"\u001a\u0004\b-\u0010$R\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\"\u001a\u0004\b/\u0010$R+\u0010\r\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\"\u001a\u0004\b1\u0010)R+\u0010\u000e\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\"\u001a\u0004\b3\u0010)R+\u0010\u000f\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\"\u001a\u0004\b5\u0010)R+\u0010\u0010\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\"\u001a\u0004\b7\u0010)R\u001c\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010\"\u001a\u0004\b9\u0010$R\u001c\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010\"\u001a\u0004\b;\u0010$R\u001c\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010\"\u001a\u0004\b=\u0010$R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010\"\u001a\u0004\b?\u0010@R\u001c\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010\"\u001a\u0004\bB\u0010$R\u001c\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bC\u0010\"\u001a\u0004\bD\u0010$R\u001c\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bE\u0010\"\u001a\u0004\bF\u0010$R\u001c\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u0010\"\u001a\u0004\bH\u0010$R\u001c\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u0010\"\u001a\u0004\bJ\u0010$¨\u0006n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto$Surrogate;", "", "type", "", "entity_id", "number_of_notifications", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "resource_url", "title", "message", "number_of_impressions", "number_of_dismisses", "time_since_first_impression", "item_index", "promo_product", "surface", "load_id", "client_context", "Lcom/robinhood/rosetta/eventlogging/ClientContextDto;", "surface_version", "location", "deeplink", "badge_text", "conversion_event", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientContextDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientContextDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType$annotations", "()V", "getType", "()Ljava/lang/String;", "getEntity_id$annotations", "getEntity_id", "getNumber_of_notifications$annotations", "getNumber_of_notifications", "()I", "getResource_url$annotations", "getResource_url", "getTitle$annotations", "getTitle", "getMessage$annotations", "getMessage", "getNumber_of_impressions$annotations", "getNumber_of_impressions", "getNumber_of_dismisses$annotations", "getNumber_of_dismisses", "getTime_since_first_impression$annotations", "getTime_since_first_impression", "getItem_index$annotations", "getItem_index", "getPromo_product$annotations", "getPromo_product", "getSurface$annotations", "getSurface", "getLoad_id$annotations", "getLoad_id", "getClient_context$annotations", "getClient_context", "()Lcom/robinhood/rosetta/eventlogging/ClientContextDto;", "getSurface_version$annotations", "getSurface_version", "getLocation$annotations", "getLocation", "getDeeplink$annotations", "getDeeplink", "getBadge_text$annotations", "getBadge_text", "getConversion_event$annotations", "getConversion_event", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String badge_text;
        private final ClientContextDto client_context;
        private final String conversion_event;
        private final String deeplink;
        private final String entity_id;
        private final int item_index;
        private final String load_id;
        private final String location;
        private final String message;
        private final int number_of_dismisses;
        private final int number_of_impressions;
        private final int number_of_notifications;
        private final String promo_product;
        private final String resource_url;
        private final String surface;
        private final String surface_version;
        private final int time_since_first_impression;
        private final String title;
        private final String type;

        public Surrogate() {
            this((String) null, (String) null, 0, (String) null, (String) null, (String) null, 0, 0, 0, 0, (String) null, (String) null, (String) null, (ClientContextDto) null, (String) null, (String) null, (String) null, (String) null, (String) null, 524287, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, int i, String str3, String str4, String str5, int i2, int i3, int i4, int i5, String str6, String str7, String str8, ClientContextDto clientContextDto, String str9, String str10, String str11, String str12, String str13, int i6, Object obj) {
            String str14;
            String str15;
            String str16 = (i6 & 1) != 0 ? surrogate.type : str;
            String str17 = (i6 & 2) != 0 ? surrogate.entity_id : str2;
            int i7 = (i6 & 4) != 0 ? surrogate.number_of_notifications : i;
            String str18 = (i6 & 8) != 0 ? surrogate.resource_url : str3;
            String str19 = (i6 & 16) != 0 ? surrogate.title : str4;
            String str20 = (i6 & 32) != 0 ? surrogate.message : str5;
            int i8 = (i6 & 64) != 0 ? surrogate.number_of_impressions : i2;
            int i9 = (i6 & 128) != 0 ? surrogate.number_of_dismisses : i3;
            int i10 = (i6 & 256) != 0 ? surrogate.time_since_first_impression : i4;
            int i11 = (i6 & 512) != 0 ? surrogate.item_index : i5;
            String str21 = (i6 & 1024) != 0 ? surrogate.promo_product : str6;
            String str22 = (i6 & 2048) != 0 ? surrogate.surface : str7;
            String str23 = (i6 & 4096) != 0 ? surrogate.load_id : str8;
            ClientContextDto clientContextDto2 = (i6 & 8192) != 0 ? surrogate.client_context : clientContextDto;
            String str24 = str16;
            String str25 = (i6 & 16384) != 0 ? surrogate.surface_version : str9;
            String str26 = (i6 & 32768) != 0 ? surrogate.location : str10;
            String str27 = (i6 & 65536) != 0 ? surrogate.deeplink : str11;
            String str28 = (i6 & 131072) != 0 ? surrogate.badge_text : str12;
            if ((i6 & 262144) != 0) {
                str15 = str28;
                str14 = surrogate.conversion_event;
            } else {
                str14 = str13;
                str15 = str28;
            }
            return surrogate.copy(str24, str17, i7, str18, str19, str20, i8, i9, i10, i11, str21, str22, str23, clientContextDto2, str25, str26, str27, str15, str14);
        }

        @SerialName("badgeText")
        @JsonAnnotations2(names = {"badge_text"})
        public static /* synthetic */ void getBadge_text$annotations() {
        }

        @SerialName("clientContext")
        @JsonAnnotations2(names = {"client_context"})
        public static /* synthetic */ void getClient_context$annotations() {
        }

        @SerialName("conversionEvent")
        @JsonAnnotations2(names = {"conversion_event"})
        public static /* synthetic */ void getConversion_event$annotations() {
        }

        @SerialName("deeplink")
        @JsonAnnotations2(names = {"deeplink"})
        public static /* synthetic */ void getDeeplink$annotations() {
        }

        @SerialName("entityId")
        @JsonAnnotations2(names = {"entity_id"})
        public static /* synthetic */ void getEntity_id$annotations() {
        }

        @SerialName("itemIndex")
        @JsonAnnotations2(names = {"item_index"})
        public static /* synthetic */ void getItem_index$annotations() {
        }

        @SerialName("loadId")
        @JsonAnnotations2(names = {"load_id"})
        public static /* synthetic */ void getLoad_id$annotations() {
        }

        @SerialName("location")
        @JsonAnnotations2(names = {"location"})
        public static /* synthetic */ void getLocation$annotations() {
        }

        @SerialName("message")
        @JsonAnnotations2(names = {"message"})
        public static /* synthetic */ void getMessage$annotations() {
        }

        @SerialName("numberOfDismisses")
        @JsonAnnotations2(names = {"number_of_dismisses"})
        public static /* synthetic */ void getNumber_of_dismisses$annotations() {
        }

        @SerialName("numberOfImpressions")
        @JsonAnnotations2(names = {"number_of_impressions"})
        public static /* synthetic */ void getNumber_of_impressions$annotations() {
        }

        @SerialName("numberOfNotifications")
        @JsonAnnotations2(names = {"number_of_notifications"})
        public static /* synthetic */ void getNumber_of_notifications$annotations() {
        }

        @SerialName("promoProduct")
        @JsonAnnotations2(names = {"promo_product"})
        public static /* synthetic */ void getPromo_product$annotations() {
        }

        @SerialName("resourceUrl")
        @JsonAnnotations2(names = {"resource_url"})
        public static /* synthetic */ void getResource_url$annotations() {
        }

        @SerialName("surface")
        @JsonAnnotations2(names = {"surface"})
        public static /* synthetic */ void getSurface$annotations() {
        }

        @SerialName("surfaceVersion")
        @JsonAnnotations2(names = {"surface_version"})
        public static /* synthetic */ void getSurface_version$annotations() {
        }

        @SerialName("timeSinceFirstImpression")
        @JsonAnnotations2(names = {"time_since_first_impression"})
        public static /* synthetic */ void getTime_since_first_impression$annotations() {
        }

        @SerialName("title")
        @JsonAnnotations2(names = {"title"})
        public static /* synthetic */ void getTitle$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component10, reason: from getter */
        public final int getItem_index() {
            return this.item_index;
        }

        /* renamed from: component11, reason: from getter */
        public final String getPromo_product() {
            return this.promo_product;
        }

        /* renamed from: component12, reason: from getter */
        public final String getSurface() {
            return this.surface;
        }

        /* renamed from: component13, reason: from getter */
        public final String getLoad_id() {
            return this.load_id;
        }

        /* renamed from: component14, reason: from getter */
        public final ClientContextDto getClient_context() {
            return this.client_context;
        }

        /* renamed from: component15, reason: from getter */
        public final String getSurface_version() {
            return this.surface_version;
        }

        /* renamed from: component16, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        /* renamed from: component17, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component18, reason: from getter */
        public final String getBadge_text() {
            return this.badge_text;
        }

        /* renamed from: component19, reason: from getter */
        public final String getConversion_event() {
            return this.conversion_event;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEntity_id() {
            return this.entity_id;
        }

        /* renamed from: component3, reason: from getter */
        public final int getNumber_of_notifications() {
            return this.number_of_notifications;
        }

        /* renamed from: component4, reason: from getter */
        public final String getResource_url() {
            return this.resource_url;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component6, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component7, reason: from getter */
        public final int getNumber_of_impressions() {
            return this.number_of_impressions;
        }

        /* renamed from: component8, reason: from getter */
        public final int getNumber_of_dismisses() {
            return this.number_of_dismisses;
        }

        /* renamed from: component9, reason: from getter */
        public final int getTime_since_first_impression() {
            return this.time_since_first_impression;
        }

        public final Surrogate copy(String type2, String entity_id, int number_of_notifications, String resource_url, String title, String message, int number_of_impressions, int number_of_dismisses, int time_since_first_impression, int item_index, String promo_product, String surface, String load_id, ClientContextDto client_context, String surface_version, String location, String deeplink, String badge_text, String conversion_event) {
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
            return new Surrogate(type2, entity_id, number_of_notifications, resource_url, title, message, number_of_impressions, number_of_dismisses, time_since_first_impression, item_index, promo_product, surface, load_id, client_context, surface_version, location, deeplink, badge_text, conversion_event);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.type, surrogate.type) && Intrinsics.areEqual(this.entity_id, surrogate.entity_id) && this.number_of_notifications == surrogate.number_of_notifications && Intrinsics.areEqual(this.resource_url, surrogate.resource_url) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.message, surrogate.message) && this.number_of_impressions == surrogate.number_of_impressions && this.number_of_dismisses == surrogate.number_of_dismisses && this.time_since_first_impression == surrogate.time_since_first_impression && this.item_index == surrogate.item_index && Intrinsics.areEqual(this.promo_product, surrogate.promo_product) && Intrinsics.areEqual(this.surface, surrogate.surface) && Intrinsics.areEqual(this.load_id, surrogate.load_id) && Intrinsics.areEqual(this.client_context, surrogate.client_context) && Intrinsics.areEqual(this.surface_version, surrogate.surface_version) && Intrinsics.areEqual(this.location, surrogate.location) && Intrinsics.areEqual(this.deeplink, surrogate.deeplink) && Intrinsics.areEqual(this.badge_text, surrogate.badge_text) && Intrinsics.areEqual(this.conversion_event, surrogate.conversion_event);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((((((this.type.hashCode() * 31) + this.entity_id.hashCode()) * 31) + Integer.hashCode(this.number_of_notifications)) * 31) + this.resource_url.hashCode()) * 31) + this.title.hashCode()) * 31) + this.message.hashCode()) * 31) + Integer.hashCode(this.number_of_impressions)) * 31) + Integer.hashCode(this.number_of_dismisses)) * 31) + Integer.hashCode(this.time_since_first_impression)) * 31) + Integer.hashCode(this.item_index)) * 31) + this.promo_product.hashCode()) * 31) + this.surface.hashCode()) * 31) + this.load_id.hashCode()) * 31;
            ClientContextDto clientContextDto = this.client_context;
            return ((((((((((iHashCode + (clientContextDto == null ? 0 : clientContextDto.hashCode())) * 31) + this.surface_version.hashCode()) * 31) + this.location.hashCode()) * 31) + this.deeplink.hashCode()) * 31) + this.badge_text.hashCode()) * 31) + this.conversion_event.hashCode();
        }

        public String toString() {
            return "Surrogate(type=" + this.type + ", entity_id=" + this.entity_id + ", number_of_notifications=" + this.number_of_notifications + ", resource_url=" + this.resource_url + ", title=" + this.title + ", message=" + this.message + ", number_of_impressions=" + this.number_of_impressions + ", number_of_dismisses=" + this.number_of_dismisses + ", time_since_first_impression=" + this.time_since_first_impression + ", item_index=" + this.item_index + ", promo_product=" + this.promo_product + ", surface=" + this.surface + ", load_id=" + this.load_id + ", client_context=" + this.client_context + ", surface_version=" + this.surface_version + ", location=" + this.location + ", deeplink=" + this.deeplink + ", badge_text=" + this.badge_text + ", conversion_event=" + this.conversion_event + ")";
        }

        /* compiled from: NotificationStackEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return NotificationStackEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, int i2, String str3, String str4, String str5, int i3, int i4, int i5, int i6, String str6, String str7, String str8, ClientContextDto clientContextDto, String str9, String str10, String str11, String str12, String str13, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.type = "";
            } else {
                this.type = str;
            }
            if ((i & 2) == 0) {
                this.entity_id = "";
            } else {
                this.entity_id = str2;
            }
            if ((i & 4) == 0) {
                this.number_of_notifications = 0;
            } else {
                this.number_of_notifications = i2;
            }
            if ((i & 8) == 0) {
                this.resource_url = "";
            } else {
                this.resource_url = str3;
            }
            if ((i & 16) == 0) {
                this.title = "";
            } else {
                this.title = str4;
            }
            if ((i & 32) == 0) {
                this.message = "";
            } else {
                this.message = str5;
            }
            if ((i & 64) == 0) {
                this.number_of_impressions = 0;
            } else {
                this.number_of_impressions = i3;
            }
            if ((i & 128) == 0) {
                this.number_of_dismisses = 0;
            } else {
                this.number_of_dismisses = i4;
            }
            if ((i & 256) == 0) {
                this.time_since_first_impression = 0;
            } else {
                this.time_since_first_impression = i5;
            }
            if ((i & 512) == 0) {
                this.item_index = 0;
            } else {
                this.item_index = i6;
            }
            if ((i & 1024) == 0) {
                this.promo_product = "";
            } else {
                this.promo_product = str6;
            }
            if ((i & 2048) == 0) {
                this.surface = "";
            } else {
                this.surface = str7;
            }
            if ((i & 4096) == 0) {
                this.load_id = "";
            } else {
                this.load_id = str8;
            }
            this.client_context = (i & 8192) == 0 ? null : clientContextDto;
            if ((i & 16384) == 0) {
                this.surface_version = "";
            } else {
                this.surface_version = str9;
            }
            if ((32768 & i) == 0) {
                this.location = "";
            } else {
                this.location = str10;
            }
            if ((65536 & i) == 0) {
                this.deeplink = "";
            } else {
                this.deeplink = str11;
            }
            if ((131072 & i) == 0) {
                this.badge_text = "";
            } else {
                this.badge_text = str12;
            }
            if ((i & 262144) == 0) {
                this.conversion_event = "";
            } else {
                this.conversion_event = str13;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.type, "")) {
                output.encodeStringElement(serialDesc, 0, self.type);
            }
            if (!Intrinsics.areEqual(self.entity_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.entity_id);
            }
            int i = self.number_of_notifications;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 2, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.resource_url, "")) {
                output.encodeStringElement(serialDesc, 3, self.resource_url);
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 4, self.title);
            }
            if (!Intrinsics.areEqual(self.message, "")) {
                output.encodeStringElement(serialDesc, 5, self.message);
            }
            int i2 = self.number_of_impressions;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            int i3 = self.number_of_dismisses;
            if (i3 != 0) {
                output.encodeSerializableElement(serialDesc, 7, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i3));
            }
            int i4 = self.time_since_first_impression;
            if (i4 != 0) {
                output.encodeSerializableElement(serialDesc, 8, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i4));
            }
            int i5 = self.item_index;
            if (i5 != 0) {
                output.encodeSerializableElement(serialDesc, 9, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i5));
            }
            if (!Intrinsics.areEqual(self.promo_product, "")) {
                output.encodeStringElement(serialDesc, 10, self.promo_product);
            }
            if (!Intrinsics.areEqual(self.surface, "")) {
                output.encodeStringElement(serialDesc, 11, self.surface);
            }
            if (!Intrinsics.areEqual(self.load_id, "")) {
                output.encodeStringElement(serialDesc, 12, self.load_id);
            }
            ClientContextDto clientContextDto = self.client_context;
            if (clientContextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, ClientContextDto.Serializer.INSTANCE, clientContextDto);
            }
            if (!Intrinsics.areEqual(self.surface_version, "")) {
                output.encodeStringElement(serialDesc, 14, self.surface_version);
            }
            if (!Intrinsics.areEqual(self.location, "")) {
                output.encodeStringElement(serialDesc, 15, self.location);
            }
            if (!Intrinsics.areEqual(self.deeplink, "")) {
                output.encodeStringElement(serialDesc, 16, self.deeplink);
            }
            if (!Intrinsics.areEqual(self.badge_text, "")) {
                output.encodeStringElement(serialDesc, 17, self.badge_text);
            }
            if (Intrinsics.areEqual(self.conversion_event, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 18, self.conversion_event);
        }

        public Surrogate(String type2, String entity_id, int i, String resource_url, String title, String message, int i2, int i3, int i4, int i5, String promo_product, String surface, String load_id, ClientContextDto clientContextDto, String surface_version, String location, String deeplink, String badge_text, String conversion_event) {
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
            this.client_context = clientContextDto;
            this.surface_version = surface_version;
            this.location = location;
            this.deeplink = deeplink;
            this.badge_text = badge_text;
            this.conversion_event = conversion_event;
        }

        public /* synthetic */ Surrogate(String str, String str2, int i, String str3, String str4, String str5, int i2, int i3, int i4, int i5, String str6, String str7, String str8, ClientContextDto clientContextDto, String str9, String str10, String str11, String str12, String str13, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? 0 : i, (i6 & 8) != 0 ? "" : str3, (i6 & 16) != 0 ? "" : str4, (i6 & 32) != 0 ? "" : str5, (i6 & 64) != 0 ? 0 : i2, (i6 & 128) != 0 ? 0 : i3, (i6 & 256) != 0 ? 0 : i4, (i6 & 512) == 0 ? i5 : 0, (i6 & 1024) != 0 ? "" : str6, (i6 & 2048) != 0 ? "" : str7, (i6 & 4096) != 0 ? "" : str8, (i6 & 8192) != 0 ? null : clientContextDto, (i6 & 16384) != 0 ? "" : str9, (i6 & 32768) != 0 ? "" : str10, (i6 & 65536) != 0 ? "" : str11, (i6 & 131072) != 0 ? "" : str12, (i6 & 262144) != 0 ? "" : str13);
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

        public final ClientContextDto getClient_context() {
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
    }

    /* compiled from: NotificationStackEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/NotificationStackEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<NotificationStackEventDataDto, NotificationStackEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NotificationStackEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NotificationStackEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NotificationStackEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) NotificationStackEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<NotificationStackEventData> getProtoAdapter() {
            return NotificationStackEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NotificationStackEventDataDto getZeroValue() {
            return NotificationStackEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NotificationStackEventDataDto fromProto(NotificationStackEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String type2 = proto.getType();
            String entity_id = proto.getEntity_id();
            int number_of_notifications = proto.getNumber_of_notifications();
            String resource_url = proto.getResource_url();
            String title = proto.getTitle();
            String message = proto.getMessage();
            int number_of_impressions = proto.getNumber_of_impressions();
            int number_of_dismisses = proto.getNumber_of_dismisses();
            int time_since_first_impression = proto.getTime_since_first_impression();
            int item_index = proto.getItem_index();
            String promo_product = proto.getPromo_product();
            String surface = proto.getSurface();
            String load_id = proto.getLoad_id();
            ClientContext client_context = proto.getClient_context();
            return new NotificationStackEventDataDto(new Surrogate(type2, entity_id, number_of_notifications, resource_url, title, message, number_of_impressions, number_of_dismisses, time_since_first_impression, item_index, promo_product, surface, load_id, client_context != null ? ClientContextDto.INSTANCE.fromProto(client_context) : null, proto.getSurface_version(), proto.getLocation(), proto.getDeeplink(), proto.getBadge_text(), proto.getConversion_event()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NotificationStackEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NotificationStackEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new NotificationStackEventDataDto(null, null, 0, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 524287, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: NotificationStackEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<NotificationStackEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.NotificationStackEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, NotificationStackEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public NotificationStackEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new NotificationStackEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: NotificationStackEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.NotificationStackEventDataDto";
        }
    }
}
