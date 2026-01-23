package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AttachmentType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/AttachmentType;", "", "<init>", "(Ljava/lang/String;I)V", "Image", "Pdf", "Unknown", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class AttachmentType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AttachmentType[] $VALUES;
    public static final AttachmentType Image = new AttachmentType("Image", 0);
    public static final AttachmentType Pdf = new AttachmentType("Pdf", 1);
    public static final AttachmentType Unknown = new AttachmentType("Unknown", 2);

    private static final /* synthetic */ AttachmentType[] $values() {
        return new AttachmentType[]{Image, Pdf, Unknown};
    }

    public static EnumEntries<AttachmentType> getEntries() {
        return $ENTRIES;
    }

    private AttachmentType(String str, int i) {
    }

    static {
        AttachmentType[] attachmentTypeArr$values = $values();
        $VALUES = attachmentTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(attachmentTypeArr$values);
    }

    public static AttachmentType valueOf(String str) {
        return (AttachmentType) Enum.valueOf(AttachmentType.class, str);
    }

    public static AttachmentType[] values() {
        return (AttachmentType[]) $VALUES.clone();
    }
}
