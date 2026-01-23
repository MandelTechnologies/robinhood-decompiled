package com.robinhood.shared.security.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.utils.http.Headers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: PromptsHandlingInfo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001:\u0001LB{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b+\u0010#J\u0010\u0010,\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b,\u0010#J\u0012\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b-\u0010#J\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010#J\u0010\u0010/\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b/\u0010*J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b0\u00101J\u009e\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b4\u0010#J\u0010\u00105\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b5\u0010\u001fJ\u001a\u00108\u001a\u00020\u000b2\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b>\u0010#R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b?\u0010#R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b@\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bB\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bD\u0010*R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\bE\u0010#R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\bF\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\bG\u0010#R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bH\u0010#R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\bI\u0010*R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010J\u001a\u0004\bK\u00101¨\u0006M"}, m3636d2 = {"Lcom/robinhood/shared/security/contracts/PromptsHandlingInfo;", "Landroid/os/Parcelable;", "Ljava/util/UUID;", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "", "flowId", "deviceName", "deviceType", "location", "j$/time/Instant", "actionTime", "", "silent", "title", CarResultComposable2.BODY, "titleMarkdown", "bodyMarkdown", "showMap", "", "Lcom/robinhood/shared/security/contracts/PromptsHandlingInfo$Location;", "mapCoordinates", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Lj$/time/Instant;", "component7", "()Z", "component8", "component9", "component10", "component11", "component12", "component13", "()Ljava/util/List;", "copy", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)Lcom/robinhood/shared/security/contracts/PromptsHandlingInfo;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getChallengeId", "Ljava/lang/String;", "getFlowId", "getDeviceName", "getDeviceType", "getLocation", "Lj$/time/Instant;", "getActionTime", "Z", "getSilent", "getTitle", "getBody", "getTitleMarkdown", "getBodyMarkdown", "getShowMap", "Ljava/util/List;", "getMapCoordinates", Headers.LOCATION, "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PromptsHandlingInfo implements Parcelable {
    public static final Parcelable.Creator<PromptsHandlingInfo> CREATOR = new Creator();
    private final Instant actionTime;
    private final String body;
    private final String bodyMarkdown;
    private final UUID challengeId;
    private final String deviceName;
    private final String deviceType;
    private final String flowId;
    private final String location;
    private final List<Location> mapCoordinates;
    private final boolean showMap;
    private final boolean silent;
    private final String title;
    private final String titleMarkdown;

    /* compiled from: PromptsHandlingInfo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<PromptsHandlingInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PromptsHandlingInfo createFromParcel(Parcel parcel) {
            boolean z;
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            UUID uuid = (UUID) parcel.readSerializable();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Instant instant = (Instant) parcel.readSerializable();
            int i = 0;
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            boolean z3 = parcel.readInt() != 0 ? z : false;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                while (i != i2) {
                    arrayList.add(Location.CREATOR.createFromParcel(parcel));
                    i++;
                    i2 = i2;
                }
            }
            return new PromptsHandlingInfo(uuid, string2, string3, string4, string5, instant, z2, string6, string7, string8, string9, z3, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PromptsHandlingInfo[] newArray(int i) {
            return new PromptsHandlingInfo[i];
        }
    }

    public static /* synthetic */ PromptsHandlingInfo copy$default(PromptsHandlingInfo promptsHandlingInfo, UUID uuid, String str, String str2, String str3, String str4, Instant instant, boolean z, String str5, String str6, String str7, String str8, boolean z2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = promptsHandlingInfo.challengeId;
        }
        return promptsHandlingInfo.copy(uuid, (i & 2) != 0 ? promptsHandlingInfo.flowId : str, (i & 4) != 0 ? promptsHandlingInfo.deviceName : str2, (i & 8) != 0 ? promptsHandlingInfo.deviceType : str3, (i & 16) != 0 ? promptsHandlingInfo.location : str4, (i & 32) != 0 ? promptsHandlingInfo.actionTime : instant, (i & 64) != 0 ? promptsHandlingInfo.silent : z, (i & 128) != 0 ? promptsHandlingInfo.title : str5, (i & 256) != 0 ? promptsHandlingInfo.body : str6, (i & 512) != 0 ? promptsHandlingInfo.titleMarkdown : str7, (i & 1024) != 0 ? promptsHandlingInfo.bodyMarkdown : str8, (i & 2048) != 0 ? promptsHandlingInfo.showMap : z2, (i & 4096) != 0 ? promptsHandlingInfo.mapCoordinates : list);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getChallengeId() {
        return this.challengeId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getTitleMarkdown() {
        return this.titleMarkdown;
    }

    /* renamed from: component11, reason: from getter */
    public final String getBodyMarkdown() {
        return this.bodyMarkdown;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getShowMap() {
        return this.showMap;
    }

    public final List<Location> component13() {
        return this.mapCoordinates;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFlowId() {
        return this.flowId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* renamed from: component6, reason: from getter */
    public final Instant getActionTime() {
        return this.actionTime;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getSilent() {
        return this.silent;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component9, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    public final PromptsHandlingInfo copy(UUID challengeId, String flowId, String deviceName, String deviceType, String location, Instant actionTime, boolean silent, String title, String body, String titleMarkdown, String bodyMarkdown, boolean showMap, List<Location> mapCoordinates) {
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        Intrinsics.checkNotNullParameter(flowId, "flowId");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(actionTime, "actionTime");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        return new PromptsHandlingInfo(challengeId, flowId, deviceName, deviceType, location, actionTime, silent, title, body, titleMarkdown, bodyMarkdown, showMap, mapCoordinates);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromptsHandlingInfo)) {
            return false;
        }
        PromptsHandlingInfo promptsHandlingInfo = (PromptsHandlingInfo) other;
        return Intrinsics.areEqual(this.challengeId, promptsHandlingInfo.challengeId) && Intrinsics.areEqual(this.flowId, promptsHandlingInfo.flowId) && Intrinsics.areEqual(this.deviceName, promptsHandlingInfo.deviceName) && Intrinsics.areEqual(this.deviceType, promptsHandlingInfo.deviceType) && Intrinsics.areEqual(this.location, promptsHandlingInfo.location) && Intrinsics.areEqual(this.actionTime, promptsHandlingInfo.actionTime) && this.silent == promptsHandlingInfo.silent && Intrinsics.areEqual(this.title, promptsHandlingInfo.title) && Intrinsics.areEqual(this.body, promptsHandlingInfo.body) && Intrinsics.areEqual(this.titleMarkdown, promptsHandlingInfo.titleMarkdown) && Intrinsics.areEqual(this.bodyMarkdown, promptsHandlingInfo.bodyMarkdown) && this.showMap == promptsHandlingInfo.showMap && Intrinsics.areEqual(this.mapCoordinates, promptsHandlingInfo.mapCoordinates);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.challengeId.hashCode() * 31) + this.flowId.hashCode()) * 31) + this.deviceName.hashCode()) * 31) + this.deviceType.hashCode()) * 31) + this.location.hashCode()) * 31) + this.actionTime.hashCode()) * 31) + Boolean.hashCode(this.silent)) * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31;
        String str = this.titleMarkdown;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bodyMarkdown;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.showMap)) * 31;
        List<Location> list = this.mapCoordinates;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "PromptsHandlingInfo(challengeId=" + this.challengeId + ", flowId=" + this.flowId + ", deviceName=" + this.deviceName + ", deviceType=" + this.deviceType + ", location=" + this.location + ", actionTime=" + this.actionTime + ", silent=" + this.silent + ", title=" + this.title + ", body=" + this.body + ", titleMarkdown=" + this.titleMarkdown + ", bodyMarkdown=" + this.bodyMarkdown + ", showMap=" + this.showMap + ", mapCoordinates=" + this.mapCoordinates + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.challengeId);
        dest.writeString(this.flowId);
        dest.writeString(this.deviceName);
        dest.writeString(this.deviceType);
        dest.writeString(this.location);
        dest.writeSerializable(this.actionTime);
        dest.writeInt(this.silent ? 1 : 0);
        dest.writeString(this.title);
        dest.writeString(this.body);
        dest.writeString(this.titleMarkdown);
        dest.writeString(this.bodyMarkdown);
        dest.writeInt(this.showMap ? 1 : 0);
        List<Location> list = this.mapCoordinates;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<Location> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public PromptsHandlingInfo(UUID challengeId, String flowId, String deviceName, String deviceType, String location, Instant actionTime, boolean z, String title, String body, String str, String str2, boolean z2, List<Location> list) {
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        Intrinsics.checkNotNullParameter(flowId, "flowId");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(actionTime, "actionTime");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        this.challengeId = challengeId;
        this.flowId = flowId;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.location = location;
        this.actionTime = actionTime;
        this.silent = z;
        this.title = title;
        this.body = body;
        this.titleMarkdown = str;
        this.bodyMarkdown = str2;
        this.showMap = z2;
        this.mapCoordinates = list;
    }

    public final UUID getChallengeId() {
        return this.challengeId;
    }

    public final String getFlowId() {
        return this.flowId;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final String getLocation() {
        return this.location;
    }

    public final Instant getActionTime() {
        return this.actionTime;
    }

    public final boolean getSilent() {
        return this.silent;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getTitleMarkdown() {
        return this.titleMarkdown;
    }

    public final String getBodyMarkdown() {
        return this.bodyMarkdown;
    }

    public final boolean getShowMap() {
        return this.showMap;
    }

    public final List<Location> getMapCoordinates() {
        return this.mapCoordinates;
    }

    /* compiled from: PromptsHandlingInfo.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/security/contracts/PromptsHandlingInfo$Location;", "Landroid/os/Parcelable;", "latitude", "", "longitude", "deviceLocation", "", "<init>", "(DDLjava/lang/String;)V", "getLatitude", "()D", "getLongitude", "getDeviceLocation", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Location implements Parcelable {
        public static final Parcelable.Creator<Location> CREATOR = new Creator();
        private final String deviceLocation;
        private final double latitude;
        private final double longitude;

        /* compiled from: PromptsHandlingInfo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Location> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Location createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Location(parcel.readDouble(), parcel.readDouble(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Location[] newArray(int i) {
                return new Location[i];
            }
        }

        public static /* synthetic */ Location copy$default(Location location, double d, double d2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                d = location.latitude;
            }
            double d3 = d;
            if ((i & 2) != 0) {
                d2 = location.longitude;
            }
            double d4 = d2;
            if ((i & 4) != 0) {
                str = location.deviceLocation;
            }
            return location.copy(d3, d4, str);
        }

        /* renamed from: component1, reason: from getter */
        public final double getLatitude() {
            return this.latitude;
        }

        /* renamed from: component2, reason: from getter */
        public final double getLongitude() {
            return this.longitude;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeviceLocation() {
            return this.deviceLocation;
        }

        public final Location copy(double latitude, double longitude, String deviceLocation) {
            return new Location(latitude, longitude, deviceLocation);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Location)) {
                return false;
            }
            Location location = (Location) other;
            return Double.compare(this.latitude, location.latitude) == 0 && Double.compare(this.longitude, location.longitude) == 0 && Intrinsics.areEqual(this.deviceLocation, location.deviceLocation);
        }

        public int hashCode() {
            int iHashCode = ((Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude)) * 31;
            String str = this.deviceLocation;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Location(latitude=" + this.latitude + ", longitude=" + this.longitude + ", deviceLocation=" + this.deviceLocation + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeDouble(this.latitude);
            dest.writeDouble(this.longitude);
            dest.writeString(this.deviceLocation);
        }

        public Location(double d, double d2, String str) {
            this.latitude = d;
            this.longitude = d2;
            this.deviceLocation = str;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        public final String getDeviceLocation() {
            return this.deviceLocation;
        }
    }
}
