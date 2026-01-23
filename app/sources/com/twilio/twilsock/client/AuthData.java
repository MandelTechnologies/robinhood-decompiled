package com.twilio.twilsock.client;

import com.twilio.util.InternalUtils3;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElement6;
import kotlinx.serialization.json.JsonElementBuilders2;

/* compiled from: Twilsock.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u000bHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/twilio/twilsock/client/AuthData;", "", "token", "", "activeGrant", "notificationProductId", "certificates", "", "tweaksJson", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "tweaks", "Lkotlinx/serialization/json/JsonObject;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/json/JsonObject;)V", "getActiveGrant", "()Ljava/lang/String;", "getCertificates", "()Ljava/util/List;", "getNotificationProductId", "getToken", "getTweaks", "()Lkotlinx/serialization/json/JsonObject;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class AuthData {
    private final String activeGrant;
    private final List<String> certificates;
    private final String notificationProductId;
    private final String token;
    private final JsonElement6 tweaks;

    public static /* synthetic */ AuthData copy$default(AuthData authData, String str, String str2, String str3, List list, JsonElement6 jsonElement6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authData.token;
        }
        if ((i & 2) != 0) {
            str2 = authData.activeGrant;
        }
        if ((i & 4) != 0) {
            str3 = authData.notificationProductId;
        }
        if ((i & 8) != 0) {
            list = authData.certificates;
        }
        if ((i & 16) != 0) {
            jsonElement6 = authData.tweaks;
        }
        JsonElement6 jsonElement62 = jsonElement6;
        String str4 = str3;
        return authData.copy(str, str2, str4, list, jsonElement62);
    }

    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component2, reason: from getter */
    public final String getActiveGrant() {
        return this.activeGrant;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNotificationProductId() {
        return this.notificationProductId;
    }

    public final List<String> component4() {
        return this.certificates;
    }

    /* renamed from: component5, reason: from getter */
    public final JsonElement6 getTweaks() {
        return this.tweaks;
    }

    public final AuthData copy(String token, String activeGrant, String notificationProductId, List<String> certificates, JsonElement6 tweaks) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(activeGrant, "activeGrant");
        Intrinsics.checkNotNullParameter(notificationProductId, "notificationProductId");
        Intrinsics.checkNotNullParameter(certificates, "certificates");
        Intrinsics.checkNotNullParameter(tweaks, "tweaks");
        return new AuthData(token, activeGrant, notificationProductId, certificates, tweaks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthData)) {
            return false;
        }
        AuthData authData = (AuthData) other;
        return Intrinsics.areEqual(this.token, authData.token) && Intrinsics.areEqual(this.activeGrant, authData.activeGrant) && Intrinsics.areEqual(this.notificationProductId, authData.notificationProductId) && Intrinsics.areEqual(this.certificates, authData.certificates) && Intrinsics.areEqual(this.tweaks, authData.tweaks);
    }

    public int hashCode() {
        return (((((((this.token.hashCode() * 31) + this.activeGrant.hashCode()) * 31) + this.notificationProductId.hashCode()) * 31) + this.certificates.hashCode()) * 31) + this.tweaks.hashCode();
    }

    public String toString() {
        return "AuthData(token=" + this.token + ", activeGrant=" + this.activeGrant + ", notificationProductId=" + this.notificationProductId + ", certificates=" + this.certificates + ", tweaks=" + this.tweaks + ')';
    }

    public /* synthetic */ AuthData(String str, String str2, String str3, List list, JsonElement6 jsonElement6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (List<String>) list, (i & 16) != 0 ? new JsonElementBuilders2().build() : jsonElement6);
    }

    public AuthData(String token, String activeGrant, String notificationProductId, List<String> certificates, JsonElement6 tweaks) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(activeGrant, "activeGrant");
        Intrinsics.checkNotNullParameter(notificationProductId, "notificationProductId");
        Intrinsics.checkNotNullParameter(certificates, "certificates");
        Intrinsics.checkNotNullParameter(tweaks, "tweaks");
        this.token = token;
        this.activeGrant = activeGrant;
        this.notificationProductId = notificationProductId;
        this.certificates = certificates;
        this.tweaks = tweaks;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getActiveGrant() {
        return this.activeGrant;
    }

    public final String getNotificationProductId() {
        return this.notificationProductId;
    }

    public final List<String> getCertificates() {
        return this.certificates;
    }

    public final JsonElement6 getTweaks() {
        return this.tweaks;
    }

    public AuthData(String token, String activeGrant, String notificationProductId, List<String> certificates, String tweaksJson) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(activeGrant, "activeGrant");
        Intrinsics.checkNotNullParameter(notificationProductId, "notificationProductId");
        Intrinsics.checkNotNullParameter(certificates, "certificates");
        Intrinsics.checkNotNullParameter(tweaksJson, "tweaksJson");
        JsonElement toJsonElement = InternalUtils3.getJson().parseToJsonElement(tweaksJson);
        JsonElement6 jsonElement6Build = toJsonElement instanceof JsonElement6 ? (JsonElement6) toJsonElement : null;
        if (jsonElement6Build == null) {
            JsonElementBuilders2 jsonElementBuilders2 = new JsonElementBuilders2();
            Unit unit = Unit.INSTANCE;
            jsonElement6Build = jsonElementBuilders2.build();
        }
        this(token, activeGrant, notificationProductId, certificates, jsonElement6Build);
    }
}
