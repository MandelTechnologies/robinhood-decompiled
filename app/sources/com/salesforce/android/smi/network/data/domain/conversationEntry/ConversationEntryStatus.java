package com.salesforce.android.smi.network.data.domain.conversationEntry;

import com.squareup.moshi.JsonClass;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConversationEntryStatus.kt */
@JsonClass(generateAdapter = false)
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntryStatus;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Sending", "Error", "Sent", "Delivered", "Read", "PreconditionFailedError", "Companion", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ConversationEntryStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ConversationEntryStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final ConversationEntryStatus[] values;
    private final int value;
    public static final ConversationEntryStatus Sending = new ConversationEntryStatus("Sending", 0, 0);
    public static final ConversationEntryStatus Error = new ConversationEntryStatus("Error", 1, 1);
    public static final ConversationEntryStatus Sent = new ConversationEntryStatus("Sent", 2, 2);
    public static final ConversationEntryStatus Delivered = new ConversationEntryStatus("Delivered", 3, 3);
    public static final ConversationEntryStatus Read = new ConversationEntryStatus("Read", 4, 4);

    @Deprecated
    public static final ConversationEntryStatus PreconditionFailedError = new ConversationEntryStatus("PreconditionFailedError", 5, 5);

    private static final /* synthetic */ ConversationEntryStatus[] $values() {
        return new ConversationEntryStatus[]{Sending, Error, Sent, Delivered, Read, PreconditionFailedError};
    }

    public static EnumEntries<ConversationEntryStatus> getEntries() {
        return $ENTRIES;
    }

    private ConversationEntryStatus(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ConversationEntryStatus[] conversationEntryStatusArr$values = $values();
        $VALUES = conversationEntryStatusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(conversationEntryStatusArr$values);
        INSTANCE = new Companion(null);
        values = values();
    }

    /* compiled from: ConversationEntryStatus.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntryStatus$Companion;", "", "<init>", "()V", "values", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntryStatus;", "getValues", "()[Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntryStatus;", "[Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntryStatus;", "fromValue", "value", "", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ConversationEntryStatus[] getValues() {
            return ConversationEntryStatus.values;
        }

        public final ConversationEntryStatus fromValue(int value) {
            ConversationEntryStatus conversationEntryStatus;
            ConversationEntryStatus[] values = getValues();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    conversationEntryStatus = null;
                    break;
                }
                conversationEntryStatus = values[i];
                if (conversationEntryStatus.getValue() == value) {
                    break;
                }
                i++;
            }
            return conversationEntryStatus == null ? ConversationEntryStatus.Error : conversationEntryStatus;
        }
    }

    public static ConversationEntryStatus valueOf(String str) {
        return (ConversationEntryStatus) Enum.valueOf(ConversationEntryStatus.class, str);
    }

    public static ConversationEntryStatus[] values() {
        return (ConversationEntryStatus[]) $VALUES.clone();
    }
}
