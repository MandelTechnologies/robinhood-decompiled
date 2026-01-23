package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.input;

import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.value.Value;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.optionItem.OptionItem;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.optionItem.titleItem.TitleItem;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InputValue.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B%\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputValue;", "", "inputId", "", "inputlabel", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;", "inputValueType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputValue$InputValueType;", "<init>", "(Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputValue$InputValueType;)V", "getInputId", "()Ljava/lang/String;", "getInputlabel", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;", "getInputValueType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputValue$InputValueType;", "SingleInputValue", "SelectedOptionsInputValue", "InputValueType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputValue$SelectedOptionsInputValue;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputValue$SingleInputValue;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class InputValue {
    private final String inputId;
    private final InputValueType inputValueType;
    private final TitleItem.DefaultTitleItem inputlabel;

    public /* synthetic */ InputValue(String str, TitleItem.DefaultTitleItem defaultTitleItem, InputValueType inputValueType, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, defaultTitleItem, inputValueType);
    }

    private InputValue(String str, TitleItem.DefaultTitleItem defaultTitleItem, InputValueType inputValueType) {
        this.inputId = str;
        this.inputlabel = defaultTitleItem;
        this.inputValueType = inputValueType;
    }

    public /* synthetic */ InputValue(String str, TitleItem.DefaultTitleItem defaultTitleItem, InputValueType inputValueType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : defaultTitleItem, inputValueType, null);
    }

    public final String getInputId() {
        return this.inputId;
    }

    public final TitleItem.DefaultTitleItem getInputlabel() {
        return this.inputlabel;
    }

    public final InputValueType getInputValueType() {
        return this.inputValueType;
    }

    /* compiled from: InputValue.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputValue$SingleInputValue;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputValue;", "inputId", "", "inputLabel", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;", "value", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value;", "displayValue", "<init>", "(Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value;Ljava/lang/String;)V", "getValue", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value;", "getDisplayValue", "()Ljava/lang/String;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class SingleInputValue extends InputValue {
        private final String displayValue;
        private final Value value;

        public /* synthetic */ SingleInputValue(String str, TitleItem.DefaultTitleItem defaultTitleItem, Value value, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : defaultTitleItem, value, (i & 8) != 0 ? null : str2);
        }

        public final Value getValue() {
            return this.value;
        }

        public final String getDisplayValue() {
            return this.displayValue;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SingleInputValue(String inputId, TitleItem.DefaultTitleItem defaultTitleItem, Value value, String str) {
            super(inputId, defaultTitleItem, InputValueType.SingleInputValue, null);
            Intrinsics.checkNotNullParameter(inputId, "inputId");
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
            this.displayValue = str;
        }
    }

    /* compiled from: InputValue.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputValue$SelectedOptionsInputValue;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputValue;", "inputId", "", "inputLabel", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;", "selectedOptions", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$SelectionsOptionItem;", "<init>", "(Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;Ljava/util/List;)V", "getSelectedOptions", "()Ljava/util/List;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class SelectedOptionsInputValue extends InputValue {
        private final List<OptionItem.SelectionsOptionItem> selectedOptions;

        public /* synthetic */ SelectedOptionsInputValue(String str, TitleItem.DefaultTitleItem defaultTitleItem, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : defaultTitleItem, list);
        }

        public final List<OptionItem.SelectionsOptionItem> getSelectedOptions() {
            return this.selectedOptions;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectedOptionsInputValue(String inputId, TitleItem.DefaultTitleItem defaultTitleItem, List<OptionItem.SelectionsOptionItem> selectedOptions) {
            super(inputId, defaultTitleItem, InputValueType.SelectedOptionsInputValue, null);
            Intrinsics.checkNotNullParameter(inputId, "inputId");
            Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
            this.selectedOptions = selectedOptions;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InputValue.kt */
    @JsonClass(generateAdapter = false)
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputValue$InputValueType;", "", "<init>", "(Ljava/lang/String;I)V", "SingleInputValue", "SelectedOptionsInputValue", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class InputValueType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InputValueType[] $VALUES;
        public static final InputValueType SingleInputValue = new InputValueType("SingleInputValue", 0);
        public static final InputValueType SelectedOptionsInputValue = new InputValueType("SelectedOptionsInputValue", 1);

        private static final /* synthetic */ InputValueType[] $values() {
            return new InputValueType[]{SingleInputValue, SelectedOptionsInputValue};
        }

        public static EnumEntries<InputValueType> getEntries() {
            return $ENTRIES;
        }

        private InputValueType(String str, int i) {
        }

        static {
            InputValueType[] inputValueTypeArr$values = $values();
            $VALUES = inputValueTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(inputValueTypeArr$values);
        }

        public static InputValueType valueOf(String str) {
            return (InputValueType) Enum.valueOf(InputValueType.class, str);
        }

        public static InputValueType[] values() {
            return (InputValueType[]) $VALUES.clone();
        }
    }
}
