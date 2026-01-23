package com.robinhood.android.securitycenter.p251ui.data.personal;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.models.p355ui.UiPersonalDataRequestDetailsItem;
import com.robinhood.utils.text.Capitalization;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.OffsetDateTime;

/* compiled from: PersonalDataViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataViewState;", "", "<init>", "()V", "Loading", "Success", "Error", "Companion", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataViewState$Error;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataViewState$Loading;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataViewState$Success;", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class PersonalDataViewState {
    public static final int $stable = 0;
    private static final char NON_BREAKING_SPACE = 160;

    public /* synthetic */ PersonalDataViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PersonalDataViewState() {
    }

    /* compiled from: PersonalDataViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataViewState$Loading;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataViewState;", "<init>", "()V", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends PersonalDataViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: PersonalDataViewState.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*BA\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u001b\u001a\u0004\u0018\u00010\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\bH\u0002J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataViewState$Success;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataViewState;", ErrorBundle.DETAIL_ENTRY, "", "Lcom/robinhood/models/ui/UiPersonalDataRequestDetailsItem;", "status", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataViewState$Success$Status;", "createdAt", "", "expiresAt", "requestId", "Ljava/util/UUID;", "<init>", "(Ljava/util/List;Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataViewState$Success$Status;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V", "getDetails", "()Ljava/util/List;", "getStatus", "()Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataViewState$Success$Status;", "getCreatedAt", "()Ljava/lang/String;", "getExpiresAt", "getRequestId", "()Ljava/util/UUID;", "requestDateString", "getRequestDateString", "expireDateString", "getExpireDateString", "formatTimestamp", "timestamp", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Status", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success extends PersonalDataViewState {
        public static final int $stable = 8;
        private final String createdAt;
        private final List<UiPersonalDataRequestDetailsItem> details;
        private final String expiresAt;
        private final UUID requestId;
        private final Status status;

        public static /* synthetic */ Success copy$default(Success success, List list, Status status, String str, String str2, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                list = success.details;
            }
            if ((i & 2) != 0) {
                status = success.status;
            }
            if ((i & 4) != 0) {
                str = success.createdAt;
            }
            if ((i & 8) != 0) {
                str2 = success.expiresAt;
            }
            if ((i & 16) != 0) {
                uuid = success.requestId;
            }
            UUID uuid2 = uuid;
            String str3 = str;
            return success.copy(list, status, str3, str2, uuid2);
        }

        public final List<UiPersonalDataRequestDetailsItem> component1() {
            return this.details;
        }

        /* renamed from: component2, reason: from getter */
        public final Status getStatus() {
            return this.status;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        /* renamed from: component4, reason: from getter */
        public final String getExpiresAt() {
            return this.expiresAt;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getRequestId() {
            return this.requestId;
        }

        public final Success copy(List<UiPersonalDataRequestDetailsItem> details, Status status, String createdAt, String expiresAt, UUID requestId) {
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(status, "status");
            return new Success(details, status, createdAt, expiresAt, requestId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.details, success.details) && this.status == success.status && Intrinsics.areEqual(this.createdAt, success.createdAt) && Intrinsics.areEqual(this.expiresAt, success.expiresAt) && Intrinsics.areEqual(this.requestId, success.requestId);
        }

        public int hashCode() {
            int iHashCode = ((this.details.hashCode() * 31) + this.status.hashCode()) * 31;
            String str = this.createdAt;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.expiresAt;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            UUID uuid = this.requestId;
            return iHashCode3 + (uuid != null ? uuid.hashCode() : 0);
        }

        public String toString() {
            return "Success(details=" + this.details + ", status=" + this.status + ", createdAt=" + this.createdAt + ", expiresAt=" + this.expiresAt + ", requestId=" + this.requestId + ")";
        }

        public /* synthetic */ Success(List list, Status status, String str, String str2, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, status, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : uuid);
        }

        public final List<UiPersonalDataRequestDetailsItem> getDetails() {
            return this.details;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final String getCreatedAt() {
            return this.createdAt;
        }

        public final String getExpiresAt() {
            return this.expiresAt;
        }

        public final UUID getRequestId() {
            return this.requestId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(List<UiPersonalDataRequestDetailsItem> details, Status status, String str, String str2, UUID uuid) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(status, "status");
            this.details = details;
            this.status = status;
            this.createdAt = str;
            this.expiresAt = str2;
            this.requestId = uuid;
        }

        public final String getRequestDateString() {
            return formatTimestamp(this.createdAt);
        }

        public final String getExpireDateString() {
            return formatTimestamp(this.expiresAt);
        }

        private final String formatTimestamp(String timestamp) {
            try {
                OffsetDateTime offsetDateTime = OffsetDateTime.parse(timestamp);
                String string2 = offsetDateTime.getMonth().toString();
                Locale ROOT = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                String lowerCase = string2.toLowerCase(ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                return StringsKt.replace$default(Capitalization.capitalizeFirstChar(lowerCase, ROOT) + PlaceholderUtils.XXShortPlaceholderText + offsetDateTime.getDayOfMonth() + ", " + offsetDateTime.getYear(), ' ', PersonalDataViewState.NON_BREAKING_SPACE, false, 4, (Object) null);
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PersonalDataViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataViewState$Success$Status;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "COMPLETED", "EXPIRED", "NONE", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Status {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;
            public static final Status PENDING = new Status("PENDING", 0);
            public static final Status COMPLETED = new Status("COMPLETED", 1);
            public static final Status EXPIRED = new Status("EXPIRED", 2);
            public static final Status NONE = new Status("NONE", 3);

            private static final /* synthetic */ Status[] $values() {
                return new Status[]{PENDING, COMPLETED, EXPIRED, NONE};
            }

            public static EnumEntries<Status> getEntries() {
                return $ENTRIES;
            }

            private Status(String str, int i) {
            }

            static {
                Status[] statusArr$values = $values();
                $VALUES = statusArr$values;
                $ENTRIES = EnumEntries2.enumEntries(statusArr$values);
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: PersonalDataViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataViewState$Error;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataViewState;", "<init>", "()V", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error extends PersonalDataViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }
}
