package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.input;

import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.input.Input;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InputSection.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputSection;", "", "sectionType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputSection$SectionType;", "<init>", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputSection$SectionType;)V", "getSectionType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputSection$SectionType;", "validate", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$ValidationError;", "hasValidationErrors", "", "SingleInputSection", "SectionType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputSection$SingleInputSection;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class InputSection {
    private final SectionType sectionType;

    public /* synthetic */ InputSection(SectionType sectionType, DefaultConstructorMarker defaultConstructorMarker) {
        this(sectionType);
    }

    public abstract Input.ValidationError validate();

    private InputSection(SectionType sectionType) {
        this.sectionType = sectionType;
    }

    public final SectionType getSectionType() {
        return this.sectionType;
    }

    public final boolean hasValidationErrors() {
        return validate() != null;
    }

    /* compiled from: InputSection.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputSection$SingleInputSection;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputSection;", "input", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input;", "nextSectionInputId", "", "submitForm", "", "<init>", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input;Ljava/lang/String;Ljava/lang/Boolean;)V", "getInput", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input;", "getNextSectionInputId", "()Ljava/lang/String;", "getSubmitForm", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "validate", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$ValidationError;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class SingleInputSection extends InputSection {
        private final Input input;
        private final String nextSectionInputId;
        private final Boolean submitForm;

        public /* synthetic */ SingleInputSection(Input input, String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(input, (i & 2) != 0 ? null : str, (i & 4) != 0 ? Boolean.FALSE : bool);
        }

        public final Input getInput() {
            return this.input;
        }

        public final String getNextSectionInputId() {
            return this.nextSectionInputId;
        }

        public final Boolean getSubmitForm() {
            return this.submitForm;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SingleInputSection(Input input, String str, Boolean bool) {
            super(SectionType.SingleInputSection, null);
            Intrinsics.checkNotNullParameter(input, "input");
            this.input = input;
            this.nextSectionInputId = str;
            this.submitForm = bool;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.input.InputSection
        public Input.ValidationError validate() {
            return this.input.validate();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InputSection.kt */
    @JsonClass(generateAdapter = false)
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputSection$SectionType;", "", "<init>", "(Ljava/lang/String;I)V", "SingleInputSection", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class SectionType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SectionType[] $VALUES;
        public static final SectionType SingleInputSection = new SectionType("SingleInputSection", 0);

        private static final /* synthetic */ SectionType[] $values() {
            return new SectionType[]{SingleInputSection};
        }

        public static EnumEntries<SectionType> getEntries() {
            return $ENTRIES;
        }

        private SectionType(String str, int i) {
        }

        static {
            SectionType[] sectionTypeArr$values = $values();
            $VALUES = sectionTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sectionTypeArr$values);
        }

        public static SectionType valueOf(String str) {
            return (SectionType) Enum.valueOf(SectionType.class, str);
        }

        public static SectionType[] values() {
            return (SectionType[]) $VALUES.clone();
        }
    }
}
