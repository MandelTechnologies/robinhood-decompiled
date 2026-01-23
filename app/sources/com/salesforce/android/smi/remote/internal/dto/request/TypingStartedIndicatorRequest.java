package com.salesforce.android.smi.remote.internal.dto.request;

import com.squareup.moshi.JsonClass;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TypingStartedIndicatorRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/dto/request/TypingStartedIndicatorRequest;", "", "conversationId", "Ljava/util/UUID;", "id", "", "entryType", "Lcom/salesforce/android/smi/remote/internal/dto/request/TypingStartedIndicatorRequest$EntryType;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/salesforce/android/smi/remote/internal/dto/request/TypingStartedIndicatorRequest$EntryType;)V", "getConversationId", "()Ljava/util/UUID;", "getId", "()Ljava/lang/String;", "getEntryType", "()Lcom/salesforce/android/smi/remote/internal/dto/request/TypingStartedIndicatorRequest$EntryType;", "EntryType", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class TypingStartedIndicatorRequest {
    private final transient UUID conversationId;
    private final EntryType entryType;
    private final String id;

    public TypingStartedIndicatorRequest() {
        this(null, null, null, 7, null);
    }

    public TypingStartedIndicatorRequest(UUID uuid, String id, EntryType entryType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(entryType, "entryType");
        this.conversationId = uuid;
        this.id = id;
        this.entryType = entryType;
    }

    public final UUID getConversationId() {
        return this.conversationId;
    }

    public /* synthetic */ TypingStartedIndicatorRequest(UUID uuid, String str, EntryType entryType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? UUID.randomUUID().toString() : str, (i & 4) != 0 ? EntryType.TypingStartedIndicator : entryType);
    }

    public final String getId() {
        return this.id;
    }

    public final EntryType getEntryType() {
        return this.entryType;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TypingStartedIndicatorRequest.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/dto/request/TypingStartedIndicatorRequest$EntryType;", "", "<init>", "(Ljava/lang/String;I)V", "TypingIndicator", "TypingStartedIndicator", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class EntryType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryType[] $VALUES;
        public static final EntryType TypingIndicator = new EntryType("TypingIndicator", 0);
        public static final EntryType TypingStartedIndicator = new EntryType("TypingStartedIndicator", 1);

        private static final /* synthetic */ EntryType[] $values() {
            return new EntryType[]{TypingIndicator, TypingStartedIndicator};
        }

        public static EnumEntries<EntryType> getEntries() {
            return $ENTRIES;
        }

        private EntryType(String str, int i) {
        }

        static {
            EntryType[] entryTypeArr$values = $values();
            $VALUES = entryTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryTypeArr$values);
        }

        public static EntryType valueOf(String str) {
            return (EntryType) Enum.valueOf(EntryType.class, str);
        }

        public static EntryType[] values() {
            return (EntryType[]) $VALUES.clone();
        }
    }
}
