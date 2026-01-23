package com.withpersona.sdk2.inquiry.internal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InquiryIntentKeys.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"com/withpersona/sdk2/inquiry/internal/InquiryIntentKeys$Status", "", "Lcom/withpersona/sdk2/inquiry/internal/InquiryIntentKeys$Status;", "<init>", "(Ljava/lang/String;I)V", "INQUIRY_COMPLETE", "INQUIRY_CANCELED", "INQUIRY_ERROR", "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.internal.InquiryIntentKeys$Status, reason: use source file name */
/* loaded from: classes18.dex */
public final class InquiryIntentKeys {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InquiryIntentKeys[] $VALUES;
    public static final InquiryIntentKeys INQUIRY_COMPLETE = new InquiryIntentKeys("INQUIRY_COMPLETE", 0);
    public static final InquiryIntentKeys INQUIRY_CANCELED = new InquiryIntentKeys("INQUIRY_CANCELED", 1);
    public static final InquiryIntentKeys INQUIRY_ERROR = new InquiryIntentKeys("INQUIRY_ERROR", 2);

    private static final /* synthetic */ InquiryIntentKeys[] $values() {
        return new InquiryIntentKeys[]{INQUIRY_COMPLETE, INQUIRY_CANCELED, INQUIRY_ERROR};
    }

    public static EnumEntries<InquiryIntentKeys> getEntries() {
        return $ENTRIES;
    }

    private InquiryIntentKeys(String str, int i) {
    }

    static {
        InquiryIntentKeys[] inquiryIntentKeysArr$values = $values();
        $VALUES = inquiryIntentKeysArr$values;
        $ENTRIES = EnumEntries2.enumEntries(inquiryIntentKeysArr$values);
    }

    public static InquiryIntentKeys valueOf(String str) {
        return (InquiryIntentKeys) Enum.valueOf(InquiryIntentKeys.class, str);
    }

    public static InquiryIntentKeys[] values() {
        return (InquiryIntentKeys[]) $VALUES.clone();
    }
}
