package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format;

import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.optionItem.OptionItem;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChoicesResponseFormat.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\b¨\u0006\t"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesResponseFormat;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/MessageFormat;", "formatType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesResponseFormat$ChoicesResponseFormatType;", "getFormatType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesResponseFormat$ChoicesResponseFormatType;", "ChoicesResponseFormatType", "ChoicesResponseSelectionsFormat", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesResponseFormat$ChoicesResponseSelectionsFormat;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface ChoicesResponseFormat extends MessageFormat {
    @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat
    ChoicesResponseFormatType getFormatType();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChoicesResponseFormat.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \u00062\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesResponseFormat$ChoicesResponseFormatType;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/MessageFormat$FormatType;", "", "<init>", "(Ljava/lang/String;I)V", "Selections", "Companion", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ChoicesResponseFormatType implements MessageFormat.FormatType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ChoicesResponseFormatType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ChoicesResponseFormatType Selections = new ChoicesResponseFormatType("Selections", 0);

        private static final /* synthetic */ ChoicesResponseFormatType[] $values() {
            return new ChoicesResponseFormatType[]{Selections};
        }

        public static EnumEntries<ChoicesResponseFormatType> getEntries() {
            return $ENTRIES;
        }

        private ChoicesResponseFormatType(String str, int i) {
        }

        static {
            ChoicesResponseFormatType[] choicesResponseFormatTypeArr$values = $values();
            $VALUES = choicesResponseFormatTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(choicesResponseFormatTypeArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: ChoicesResponseFormat.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesResponseFormat$ChoicesResponseFormatType$Companion;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/MessageFormat$FormatType$EnumValueTypeHelper;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesResponseFormat$ChoicesResponseFormatType;", "<init>", "()V", "enumValueOfOrNull", "name", "", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements MessageFormat.FormatType.EnumValueTypeHelper<ChoicesResponseFormatType> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat.FormatType.EnumValueTypeHelper
            public ChoicesResponseFormatType enumValueOfOrNull(String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                for (ChoicesResponseFormatType choicesResponseFormatType : ChoicesResponseFormatType.values()) {
                    if (Intrinsics.areEqual(choicesResponseFormatType.name(), name)) {
                        return choicesResponseFormatType;
                    }
                }
                return null;
            }
        }

        public static ChoicesResponseFormatType valueOf(String str) {
            return (ChoicesResponseFormatType) Enum.valueOf(ChoicesResponseFormatType.class, str);
        }

        public static ChoicesResponseFormatType[] values() {
            return (ChoicesResponseFormatType[]) $VALUES.clone();
        }
    }

    /* compiled from: ChoicesResponseFormat.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesResponseFormat$ChoicesResponseSelectionsFormat;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesResponseFormat;", "selectedOptions", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$SelectionsOptionItem;", "<init>", "(Ljava/util/List;)V", "getSelectedOptions", "()Ljava/util/List;", "formatType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesResponseFormat$ChoicesResponseFormatType;", "getFormatType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesResponseFormat$ChoicesResponseFormatType;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ChoicesResponseSelectionsFormat implements ChoicesResponseFormat {
        private final ChoicesResponseFormatType formatType;
        private final List<OptionItem.SelectionsOptionItem> selectedOptions;

        public ChoicesResponseSelectionsFormat(List<OptionItem.SelectionsOptionItem> selectedOptions) {
            Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
            this.selectedOptions = selectedOptions;
            this.formatType = ChoicesResponseFormatType.Selections;
        }

        public final List<OptionItem.SelectionsOptionItem> getSelectedOptions() {
            return this.selectedOptions;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat
        public ChoicesResponseFormatType getFormatType() {
            return this.formatType;
        }
    }
}
