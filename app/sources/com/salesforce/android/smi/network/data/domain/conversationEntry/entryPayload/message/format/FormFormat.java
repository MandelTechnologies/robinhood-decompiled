package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format;

import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.input.Input;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.input.InputSection;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.optionItem.titleItem.TitleItem;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FormFormat.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u000b\fJ\u0010\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H&J\b\u0010\t\u001a\u00020\nH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\r¨\u0006\u000e"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/FormFormat;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/MessageFormat;", "formatType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/FormFormat$FormFormatType;", "getFormatType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/FormFormat$FormFormatType;", "validate", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$ValidationError;", "hasValidationErrors", "", "FormFormatType", "InputsFormat", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/FormFormat$InputsFormat;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface FormFormat extends MessageFormat {
    @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat
    FormFormatType getFormatType();

    boolean hasValidationErrors();

    List<Input.ValidationError> validate();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FormFormat.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \u00062\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/FormFormat$FormFormatType;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/MessageFormat$FormatType;", "", "<init>", "(Ljava/lang/String;I)V", "Inputs", "Companion", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class FormFormatType implements MessageFormat.FormatType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FormFormatType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final FormFormatType Inputs = new FormFormatType("Inputs", 0);

        private static final /* synthetic */ FormFormatType[] $values() {
            return new FormFormatType[]{Inputs};
        }

        public static EnumEntries<FormFormatType> getEntries() {
            return $ENTRIES;
        }

        private FormFormatType(String str, int i) {
        }

        static {
            FormFormatType[] formFormatTypeArr$values = $values();
            $VALUES = formFormatTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(formFormatTypeArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: FormFormat.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/FormFormat$FormFormatType$Companion;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/MessageFormat$FormatType$EnumValueTypeHelper;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/FormFormat$FormFormatType;", "<init>", "()V", "enumValueOfOrNull", "name", "", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements MessageFormat.FormatType.EnumValueTypeHelper<FormFormatType> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat.FormatType.EnumValueTypeHelper
            public FormFormatType enumValueOfOrNull(String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                for (FormFormatType formFormatType : FormFormatType.values()) {
                    if (Intrinsics.areEqual(formFormatType.name(), name)) {
                        return formFormatType;
                    }
                }
                return null;
            }
        }

        public static FormFormatType valueOf(String str) {
            return (FormFormatType) Enum.valueOf(FormFormatType.class, str);
        }

        public static FormFormatType[] values() {
            return (FormFormatType[]) $VALUES.clone();
        }
    }

    /* compiled from: FormFormat.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static boolean hasValidationErrors(FormFormat formFormat) {
            return !CollectionsKt.filterNotNull(formFormat.validate()).isEmpty();
        }
    }

    /* compiled from: FormFormat.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0006H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/FormFormat$InputsFormat;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/FormFormat;", "formTitle", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;", "message", "sections", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputSection;", "<init>", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;Ljava/util/List;)V", "getFormTitle", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;", "getMessage", "getSections", "()Ljava/util/List;", "formatType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/FormFormat$FormFormatType;", "getFormatType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/FormFormat$FormFormatType;", "validate", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$ValidationError;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class InputsFormat implements FormFormat {
        private final TitleItem.DefaultTitleItem formTitle;
        private final FormFormatType formatType;
        private final TitleItem.DefaultTitleItem message;
        private final List<InputSection> sections;

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.FormFormat
        public boolean hasValidationErrors() {
            return DefaultImpls.hasValidationErrors(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public InputsFormat(TitleItem.DefaultTitleItem formTitle, TitleItem.DefaultTitleItem message, List<? extends InputSection> sections) {
            Intrinsics.checkNotNullParameter(formTitle, "formTitle");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(sections, "sections");
            this.formTitle = formTitle;
            this.message = message;
            this.sections = sections;
            this.formatType = FormFormatType.Inputs;
        }

        public final TitleItem.DefaultTitleItem getFormTitle() {
            return this.formTitle;
        }

        public final TitleItem.DefaultTitleItem getMessage() {
            return this.message;
        }

        public final List<InputSection> getSections() {
            return this.sections;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat
        public FormFormatType getFormatType() {
            return this.formatType;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.FormFormat
        public List<Input.ValidationError> validate() {
            List<InputSection> list = this.sections;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InputSection) it.next()).validate());
            }
            return arrayList;
        }
    }
}
