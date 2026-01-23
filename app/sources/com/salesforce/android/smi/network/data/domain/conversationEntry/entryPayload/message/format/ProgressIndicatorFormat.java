package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format;

import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProgressIndicatorFormat.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\b¨\u0006\t"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ProgressIndicatorFormat;", "", "formatType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ProgressIndicatorFormat$ProgressIndicatorFormatType;", "getFormatType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ProgressIndicatorFormat$ProgressIndicatorFormatType;", "ProgressIndicatorFormatType", "Text", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ProgressIndicatorFormat$Text;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface ProgressIndicatorFormat {
    ProgressIndicatorFormatType getFormatType();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProgressIndicatorFormat.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ProgressIndicatorFormat$ProgressIndicatorFormatType;", "", "<init>", "(Ljava/lang/String;I)V", "Text", "Companion", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ProgressIndicatorFormatType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ProgressIndicatorFormatType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ProgressIndicatorFormatType Text = new ProgressIndicatorFormatType("Text", 0);

        private static final /* synthetic */ ProgressIndicatorFormatType[] $values() {
            return new ProgressIndicatorFormatType[]{Text};
        }

        public static EnumEntries<ProgressIndicatorFormatType> getEntries() {
            return $ENTRIES;
        }

        private ProgressIndicatorFormatType(String str, int i) {
        }

        static {
            ProgressIndicatorFormatType[] progressIndicatorFormatTypeArr$values = $values();
            $VALUES = progressIndicatorFormatTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(progressIndicatorFormatTypeArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: ProgressIndicatorFormat.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ProgressIndicatorFormat$ProgressIndicatorFormatType$Companion;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/MessageFormat$FormatType$EnumValueTypeHelper;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ProgressIndicatorFormat$ProgressIndicatorFormatType;", "<init>", "()V", "enumValueOfOrNull", "name", "", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements MessageFormat.FormatType.EnumValueTypeHelper<ProgressIndicatorFormatType> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat.FormatType.EnumValueTypeHelper
            public ProgressIndicatorFormatType enumValueOfOrNull(String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                for (ProgressIndicatorFormatType progressIndicatorFormatType : ProgressIndicatorFormatType.values()) {
                    if (Intrinsics.areEqual(progressIndicatorFormatType.name(), name)) {
                        return progressIndicatorFormatType;
                    }
                }
                return null;
            }
        }

        public static ProgressIndicatorFormatType valueOf(String str) {
            return (ProgressIndicatorFormatType) Enum.valueOf(ProgressIndicatorFormatType.class, str);
        }

        public static ProgressIndicatorFormatType[] values() {
            return (ProgressIndicatorFormatType[]) $VALUES.clone();
        }
    }

    /* compiled from: ProgressIndicatorFormat.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ProgressIndicatorFormat$Text;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ProgressIndicatorFormat;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "formatType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ProgressIndicatorFormat$ProgressIndicatorFormatType;", "getFormatType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ProgressIndicatorFormat$ProgressIndicatorFormatType;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Text implements ProgressIndicatorFormat {
        private final ProgressIndicatorFormatType formatType;
        private final String text;

        public Text(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.formatType = ProgressIndicatorFormatType.Text;
        }

        public final String getText() {
            return this.text;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.ProgressIndicatorFormat
        public ProgressIndicatorFormatType getFormatType() {
            return this.formatType;
        }
    }
}
