package com.robinhood.android.gold.subscription.api;

import com.robinhood.enums.RhEnum;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiModels.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/gold/subscription/api/GoldSubscribeResponse;", "", "status", "Lcom/robinhood/android/gold/subscription/api/GoldSubscribeResponse$Status;", "displayStatusMessage", "", "<init>", "(Lcom/robinhood/android/gold/subscription/api/GoldSubscribeResponse$Status;Ljava/lang/String;)V", "getStatus", "()Lcom/robinhood/android/gold/subscription/api/GoldSubscribeResponse$Status;", "getDisplayStatusMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "lib-gold-subscription_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GoldSubscribeResponse {
    private final String displayStatusMessage;
    private final Status status;

    public static /* synthetic */ GoldSubscribeResponse copy$default(GoldSubscribeResponse goldSubscribeResponse, Status status, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            status = goldSubscribeResponse.status;
        }
        if ((i & 2) != 0) {
            str = goldSubscribeResponse.displayStatusMessage;
        }
        return goldSubscribeResponse.copy(status, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayStatusMessage() {
        return this.displayStatusMessage;
    }

    public final GoldSubscribeResponse copy(Status status, @Json(name = "display_status_message") String displayStatusMessage) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(displayStatusMessage, "displayStatusMessage");
        return new GoldSubscribeResponse(status, displayStatusMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldSubscribeResponse)) {
            return false;
        }
        GoldSubscribeResponse goldSubscribeResponse = (GoldSubscribeResponse) other;
        return this.status == goldSubscribeResponse.status && Intrinsics.areEqual(this.displayStatusMessage, goldSubscribeResponse.displayStatusMessage);
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + this.displayStatusMessage.hashCode();
    }

    public String toString() {
        return "GoldSubscribeResponse(status=" + this.status + ", displayStatusMessage=" + this.displayStatusMessage + ")";
    }

    public GoldSubscribeResponse(Status status, @Json(name = "display_status_message") String displayStatusMessage) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(displayStatusMessage, "displayStatusMessage");
        this.status = status;
        this.displayStatusMessage = displayStatusMessage;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getDisplayStatusMessage() {
        return this.displayStatusMessage;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiModels.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/subscription/api/GoldSubscribeResponse$Status;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "SUCCESS", "MARGIN_UPGRADE_FAILED", "MARGIN_UPGRADE_REJECTED", "MARGIN_UPGRADE_PENDING", "GOLD_UPGRADE_FAILED", "MARGIN_INVESTING_ENABLE_FAILED", "SWEEP_ENROLLMENT_FAILED", "SLIP_ENABLE_FAILED", "Companion", "lib-gold-subscription_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Status implements RhEnum<Status> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        private final String serverValue;
        public static final Status SUCCESS = new Status("SUCCESS", 0, "success");
        public static final Status MARGIN_UPGRADE_FAILED = new Status("MARGIN_UPGRADE_FAILED", 1, "margin_upgrade_failed");
        public static final Status MARGIN_UPGRADE_REJECTED = new Status("MARGIN_UPGRADE_REJECTED", 2, "margin_upgrade_rejected");
        public static final Status MARGIN_UPGRADE_PENDING = new Status("MARGIN_UPGRADE_PENDING", 3, "margin_upgrade_pending");
        public static final Status GOLD_UPGRADE_FAILED = new Status("GOLD_UPGRADE_FAILED", 4, "gold_upgrade_failed");
        public static final Status MARGIN_INVESTING_ENABLE_FAILED = new Status("MARGIN_INVESTING_ENABLE_FAILED", 5, "margin_investing_enable_failed");
        public static final Status SWEEP_ENROLLMENT_FAILED = new Status("SWEEP_ENROLLMENT_FAILED", 6, "sweep_enrollment_failed");
        public static final Status SLIP_ENABLE_FAILED = new Status("SLIP_ENABLE_FAILED", 7, "slip_enable_failed");

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{SUCCESS, MARGIN_UPGRADE_FAILED, MARGIN_UPGRADE_REJECTED, MARGIN_UPGRADE_PENDING, GOLD_UPGRADE_FAILED, MARGIN_INVESTING_ENABLE_FAILED, SWEEP_ENROLLMENT_FAILED, SLIP_ENABLE_FAILED};
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        private Status(String str, int i, String str2) {
            this.serverValue = str2;
        }

        @Override // com.robinhood.enums.RhEnum
        public String getServerValue() {
            return this.serverValue;
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(statusArr$values);
            INSTANCE = new Companion(null);
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }
}
