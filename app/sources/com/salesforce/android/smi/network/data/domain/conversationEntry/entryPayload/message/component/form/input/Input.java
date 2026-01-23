package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.input;

import androidx.core.util.PatternsCompat;
import com.robinhood.utils.http.Headers;
import com.salesforce.android.smi.common.internal.util.URLUtils;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.input.InputValue;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.value.Value;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.optionItem.OptionItem;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.optionItem.titleItem.TitleItem;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: Input.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u001b\u001c\u001d\u001e\u001f !B9\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0004\"#$%¨\u0006&"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input;", "", "id", "", AnnotatedPrivateKey.LABEL, "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;", "hintText", "required", "", "inputType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$InputType;", "<init>", "(Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;Ljava/lang/String;Ljava/lang/Boolean;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$InputType;)V", "getId", "()Ljava/lang/String;", "getLabel", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;", "getHintText", "getRequired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getInputType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$InputType;", "asInputValue", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputValue;", "validate", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$ValidationError;", "ValidationError", "InputValidationError", "SelectInput", "OptionPickerInput", "DatePickerInput", "TextInput", "InputType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$DatePickerInput;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$OptionPickerInput;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$SelectInput;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$TextInput;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class Input {
    private final String hintText;
    private final String id;
    private final InputType inputType;
    private final TitleItem.DefaultTitleItem label;
    private final Boolean required;

    /* compiled from: Input.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$ValidationError;", "", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface ValidationError {
    }

    public /* synthetic */ Input(String str, TitleItem.DefaultTitleItem defaultTitleItem, String str2, Boolean bool, InputType inputType, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, defaultTitleItem, str2, bool, inputType);
    }

    public abstract InputValue asInputValue();

    public abstract ValidationError validate();

    private Input(String str, TitleItem.DefaultTitleItem defaultTitleItem, String str2, Boolean bool, InputType inputType) {
        this.id = str;
        this.label = defaultTitleItem;
        this.hintText = str2;
        this.required = bool;
        this.inputType = inputType;
    }

    public final String getId() {
        return this.id;
    }

    public final TitleItem.DefaultTitleItem getLabel() {
        return this.label;
    }

    public final String getHintText() {
        return this.hintText;
    }

    public /* synthetic */ Input(String str, TitleItem.DefaultTitleItem defaultTitleItem, String str2, Boolean bool, InputType inputType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, defaultTitleItem, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? Boolean.FALSE : bool, inputType, null);
    }

    public final Boolean getRequired() {
        return this.required;
    }

    public final InputType getInputType() {
        return this.inputType;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Input.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$InputValidationError;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$ValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "Required", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class InputValidationError implements ValidationError {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InputValidationError[] $VALUES;
        public static final InputValidationError Required = new InputValidationError("Required", 0);

        private static final /* synthetic */ InputValidationError[] $values() {
            return new InputValidationError[]{Required};
        }

        public static EnumEntries<InputValidationError> getEntries() {
            return $ENTRIES;
        }

        private InputValidationError(String str, int i) {
        }

        static {
            InputValidationError[] inputValidationErrorArr$values = $values();
            $VALUES = inputValidationErrorArr$values;
            $ENTRIES = EnumEntries2.enumEntries(inputValidationErrorArr$values);
        }

        public static InputValidationError valueOf(String str) {
            return (InputValidationError) Enum.valueOf(InputValidationError.class, str);
        }

        public static InputValidationError[] values() {
            return (InputValidationError[]) $VALUES.clone();
        }
    }

    /* compiled from: Input.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001bBG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$SelectInput;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input;", "id", "", AnnotatedPrivateKey.LABEL, "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;", "hintText", "required", "", "optionItems", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$TypedOptionItem$TitleOptionItem;", "multipleSelection", "<init>", "(Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Z)V", "getOptionItems", "()Ljava/util/List;", "getMultipleSelection", "()Z", "value", "getValue", "setValue", "(Ljava/util/List;)V", "validate", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$ValidationError;", "asInputValue", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputValue$SelectedOptionsInputValue;", "SelectInputValidationError", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class SelectInput extends Input {
        private final boolean multipleSelection;
        private final List<OptionItem.TypedOptionItem.TitleOptionItem> optionItems;
        private transient List<OptionItem.TypedOptionItem.TitleOptionItem> value;

        public /* synthetic */ SelectInput(String str, TitleItem.DefaultTitleItem defaultTitleItem, String str2, Boolean bool, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, defaultTitleItem, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? Boolean.FALSE : bool, list, (i & 32) != 0 ? false : z);
        }

        public final List<OptionItem.TypedOptionItem.TitleOptionItem> getOptionItems() {
            return this.optionItems;
        }

        public final boolean getMultipleSelection() {
            return this.multipleSelection;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectInput(String id, TitleItem.DefaultTitleItem label, String str, Boolean bool, List<OptionItem.TypedOptionItem.TitleOptionItem> optionItems, boolean z) {
            super(id, label, str, bool, InputType.SelectInput, null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(optionItems, "optionItems");
            this.optionItems = optionItems;
            this.multipleSelection = z;
            this.value = CollectionsKt.emptyList();
        }

        public final List<OptionItem.TypedOptionItem.TitleOptionItem> getValue() {
            return this.value;
        }

        public final void setValue(List<OptionItem.TypedOptionItem.TitleOptionItem> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.value = list;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Input.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$SelectInput$SelectInputValidationError;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$ValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "RequiredOneOrMore", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class SelectInputValidationError implements ValidationError {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ SelectInputValidationError[] $VALUES;
            public static final SelectInputValidationError RequiredOneOrMore = new SelectInputValidationError("RequiredOneOrMore", 0);

            private static final /* synthetic */ SelectInputValidationError[] $values() {
                return new SelectInputValidationError[]{RequiredOneOrMore};
            }

            public static EnumEntries<SelectInputValidationError> getEntries() {
                return $ENTRIES;
            }

            private SelectInputValidationError(String str, int i) {
            }

            static {
                SelectInputValidationError[] selectInputValidationErrorArr$values = $values();
                $VALUES = selectInputValidationErrorArr$values;
                $ENTRIES = EnumEntries2.enumEntries(selectInputValidationErrorArr$values);
            }

            public static SelectInputValidationError valueOf(String str) {
                return (SelectInputValidationError) Enum.valueOf(SelectInputValidationError.class, str);
            }

            public static SelectInputValidationError[] values() {
                return (SelectInputValidationError[]) $VALUES.clone();
            }
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.input.Input
        public ValidationError validate() {
            boolean z = Intrinsics.areEqual(getRequired(), Boolean.TRUE) && this.value.isEmpty();
            if (z) {
                return SelectInputValidationError.RequiredOneOrMore;
            }
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            return null;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.input.Input
        public InputValue.SelectedOptionsInputValue asInputValue() {
            String id = getId();
            TitleItem.DefaultTitleItem label = getLabel();
            List<OptionItem.TypedOptionItem.TitleOptionItem> list = this.value;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new OptionItem.SelectionsOptionItem(((OptionItem.TypedOptionItem.TitleOptionItem) it.next()).getOptionId(), null, null, 6, null));
            }
            return new InputValue.SelectedOptionsInputValue(id, label, arrayList);
        }
    }

    /* compiled from: Input.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001eBG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$OptionPickerInput;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input;", "id", "", AnnotatedPrivateKey.LABEL, "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;", "hintText", "required", "", "optionItems", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$TypedOptionItem$TitleOptionItem;", "selectedOptionIndex", "", "<init>", "(Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;)V", "getOptionItems", "()Ljava/util/List;", "getSelectedOptionIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "value", "getValue", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$TypedOptionItem$TitleOptionItem;", "setValue", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$TypedOptionItem$TitleOptionItem;)V", "validate", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$ValidationError;", "asInputValue", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputValue$SelectedOptionsInputValue;", "OptionPickerInputValidationError", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class OptionPickerInput extends Input {
        private final List<OptionItem.TypedOptionItem.TitleOptionItem> optionItems;
        private final Integer selectedOptionIndex;
        private transient OptionItem.TypedOptionItem.TitleOptionItem value;

        public /* synthetic */ OptionPickerInput(String str, TitleItem.DefaultTitleItem defaultTitleItem, String str2, Boolean bool, List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, defaultTitleItem, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? Boolean.FALSE : bool, list, num);
        }

        public final List<OptionItem.TypedOptionItem.TitleOptionItem> getOptionItems() {
            return this.optionItems;
        }

        public final Integer getSelectedOptionIndex() {
            return this.selectedOptionIndex;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OptionPickerInput(String id, TitleItem.DefaultTitleItem label, String str, Boolean bool, List<OptionItem.TypedOptionItem.TitleOptionItem> optionItems, Integer num) {
            super(id, label, str, bool, InputType.OptionPickerInput, null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(optionItems, "optionItems");
            this.optionItems = optionItems;
            this.selectedOptionIndex = num;
            this.value = num != null ? (OptionItem.TypedOptionItem.TitleOptionItem) CollectionsKt.getOrNull(optionItems, num.intValue()) : null;
        }

        public final OptionItem.TypedOptionItem.TitleOptionItem getValue() {
            return this.value;
        }

        public final void setValue(OptionItem.TypedOptionItem.TitleOptionItem titleOptionItem) {
            this.value = titleOptionItem;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Input.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$OptionPickerInput$OptionPickerInputValidationError;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$ValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "RequiredOneOrMore", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Deprecated
        public static final class OptionPickerInputValidationError implements ValidationError {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ OptionPickerInputValidationError[] $VALUES;
            public static final OptionPickerInputValidationError RequiredOneOrMore = new OptionPickerInputValidationError("RequiredOneOrMore", 0);

            private static final /* synthetic */ OptionPickerInputValidationError[] $values() {
                return new OptionPickerInputValidationError[]{RequiredOneOrMore};
            }

            public static EnumEntries<OptionPickerInputValidationError> getEntries() {
                return $ENTRIES;
            }

            private OptionPickerInputValidationError(String str, int i) {
            }

            static {
                OptionPickerInputValidationError[] optionPickerInputValidationErrorArr$values = $values();
                $VALUES = optionPickerInputValidationErrorArr$values;
                $ENTRIES = EnumEntries2.enumEntries(optionPickerInputValidationErrorArr$values);
            }

            public static OptionPickerInputValidationError valueOf(String str) {
                return (OptionPickerInputValidationError) Enum.valueOf(OptionPickerInputValidationError.class, str);
            }

            public static OptionPickerInputValidationError[] values() {
                return (OptionPickerInputValidationError[]) $VALUES.clone();
            }
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.input.Input
        public ValidationError validate() {
            boolean z = Intrinsics.areEqual(getRequired(), Boolean.TRUE) && this.value == null;
            if (z) {
                return InputValidationError.Required;
            }
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.input.Input
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public InputValue.SelectedOptionsInputValue asInputValue() {
            List listEmptyList;
            String id = getId();
            TitleItem.DefaultTitleItem label = getLabel();
            OptionItem.TypedOptionItem.TitleOptionItem titleOptionItem = this.value;
            if (titleOptionItem != null) {
                listEmptyList = CollectionsKt.listOf(new OptionItem.SelectionsOptionItem(titleOptionItem.getOptionId(), null, null, 6, null));
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
            }
            return new InputValue.SelectedOptionsInputValue(id, label, listEmptyList);
        }
    }

    /* compiled from: Input.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 &2\u00020\u0001:\u0001&B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\n\u0010 \u001a\u0004\u0018\u00010!H\u0016J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\n\u0010$\u001a\u0004\u0018\u00010%H\u0002R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0010¨\u0006'"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$DatePickerInput;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input;", "id", "", AnnotatedPrivateKey.LABEL, "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;", "hintText", "required", "", "dateFormat", "startDate", "minimumDate", "maximumDate", "<init>", "(Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDateFormat", "()Ljava/lang/String;", "getStartDate", "getMinimumDate", "getMaximumDate", "value", "getValue", "setValue", "(Ljava/lang/String;)V", "isDateTimeValue", "()Z", "responseValueType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$ValueType;", "getResponseValueType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$ValueType;", "dateOrTimeFormat", "getDateOrTimeFormat", "validate", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$ValidationError;", "asInputValue", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputValue;", "validateRequired", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$InputValidationError;", "Companion", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DatePickerInput extends Input {
        public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";
        public static final String DEFAULT_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm";
        private final String dateFormat;
        private final String dateOrTimeFormat;
        private final boolean isDateTimeValue;
        private final String maximumDate;
        private final String minimumDate;
        private final Value.ValueType responseValueType;
        private final String startDate;
        private transient String value;

        public /* synthetic */ DatePickerInput(String str, TitleItem.DefaultTitleItem defaultTitleItem, String str2, Boolean bool, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, defaultTitleItem, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6);
        }

        public final String getDateFormat() {
            return this.dateFormat;
        }

        public final String getStartDate() {
            return this.startDate;
        }

        public final String getMinimumDate() {
            return this.minimumDate;
        }

        public final String getMaximumDate() {
            return this.maximumDate;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DatePickerInput(String id, TitleItem.DefaultTitleItem label, String str, Boolean bool, String str2, String str3, String str4, String str5) {
            Value.ValueType valueType;
            String str6;
            super(id, label, str, bool, InputType.DatePickerInput, null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            this.dateFormat = str2;
            this.startDate = str3;
            this.minimumDate = str4;
            this.maximumDate = str5;
            boolean z = false;
            if (str2 != null && new Regex(".*T$").matches(str2)) {
                z = true;
            }
            this.isDateTimeValue = z;
            if (z) {
                valueType = Value.ValueType.DateTimeValue;
            } else {
                valueType = Value.ValueType.DateValue;
            }
            this.responseValueType = valueType;
            if (str2 != null) {
                str6 = str2;
            } else if (z) {
                str6 = DEFAULT_DATE_TIME_FORMAT;
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                str6 = "yyyy-MM-dd";
            }
            this.dateOrTimeFormat = str6;
        }

        public final String getValue() {
            return this.value;
        }

        public final void setValue(String str) {
            this.value = str;
        }

        /* renamed from: isDateTimeValue, reason: from getter */
        public final boolean getIsDateTimeValue() {
            return this.isDateTimeValue;
        }

        public final Value.ValueType getResponseValueType() {
            return this.responseValueType;
        }

        public final String getDateOrTimeFormat() {
            return this.dateOrTimeFormat;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.input.Input
        public ValidationError validate() {
            return validateRequired();
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.input.Input
        public InputValue asInputValue() {
            Value valueStringValueToResponseValue = Value.INSTANCE.stringValueToResponseValue(this.value, this.responseValueType);
            if (valueStringValueToResponseValue == null) {
                return null;
            }
            return new InputValue.SingleInputValue(getId(), getLabel(), valueStringValueToResponseValue, null, 8, null);
        }

        private final InputValidationError validateRequired() {
            boolean z = Intrinsics.areEqual(getRequired(), Boolean.TRUE) && this.value == null;
            if (z) {
                return InputValidationError.Required;
            }
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            return null;
        }
    }

    /* compiled from: Input.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00044567Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\n\u0010)\u001a\u0004\u0018\u00010*H\u0016J\n\u0010+\u001a\u0004\u0018\u00010,H\u0016J\n\u0010-\u001a\u0004\u0018\u00010.H\u0002J\n\u0010/\u001a\u0004\u0018\u000100H\u0002J\n\u00101\u001a\u0004\u0018\u000100H\u0002J\u0012\u00102\u001a\u0004\u0018\u0001002\u0006\u0010!\u001a\u00020\u0003H\u0002J\u0012\u00103\u001a\u0004\u0018\u0001002\u0006\u0010!\u001a\u00020\u0003H\u0002R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u00068"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$TextInput;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input;", "id", "", AnnotatedPrivateKey.LABEL, "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;", "hintText", "required", "", "textInputType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$TextInput$TextInputType;", "placeholder", "prefixText", "maximumCharacterCount", "", "textContentType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$TextInput$TextContentType;", "keyboardType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$TextInput$TextKeyboardType;", "<init>", "(Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem$DefaultTitleItem;Ljava/lang/String;Ljava/lang/Boolean;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$TextInput$TextInputType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$TextInput$TextContentType;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$TextInput$TextKeyboardType;)V", "getTextInputType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$TextInput$TextInputType;", "getPlaceholder", "()Ljava/lang/String;", "getPrefixText", "getMaximumCharacterCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTextContentType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$TextInput$TextContentType;", "getKeyboardType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$TextInput$TextKeyboardType;", "value", "getValue", "setValue", "(Ljava/lang/String;)V", "responseValueType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$ValueType;", "getResponseValueType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$ValueType;", "validate", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$ValidationError;", "asInputValue", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/InputValue;", "validateRequired", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$InputValidationError;", "validateMaxCharacters", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$TextInput$TextInputValidationError;", "validateContentType", "validateEmail", "validateURL", "TextInputValidationError", "TextInputType", "TextContentType", "TextKeyboardType", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class TextInput extends Input {
        private final TextKeyboardType keyboardType;
        private final Integer maximumCharacterCount;
        private final String placeholder;
        private final String prefixText;
        private final Value.ValueType responseValueType;
        private final TextContentType textContentType;
        private final TextInputType textInputType;
        private transient String value;

        /* compiled from: Input.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TextContentType.values().length];
                try {
                    iArr[TextContentType.EmailAddress.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TextContentType.URL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ TextInput(String str, TitleItem.DefaultTitleItem defaultTitleItem, String str2, Boolean bool, TextInputType textInputType, String str3, String str4, Integer num, TextContentType textContentType, TextKeyboardType textKeyboardType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, defaultTitleItem, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) != 0 ? TextInputType.Singleline : textInputType, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : textContentType, (i & 512) != 0 ? null : textKeyboardType);
        }

        public final TextInputType getTextInputType() {
            return this.textInputType;
        }

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final String getPrefixText() {
            return this.prefixText;
        }

        public final Integer getMaximumCharacterCount() {
            return this.maximumCharacterCount;
        }

        public final TextContentType getTextContentType() {
            return this.textContentType;
        }

        public final TextKeyboardType getKeyboardType() {
            return this.keyboardType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextInput(String id, TitleItem.DefaultTitleItem label, String str, Boolean bool, TextInputType textInputType, String str2, String str3, Integer num, TextContentType textContentType, TextKeyboardType textKeyboardType) {
            Value.ValueType responseValueType;
            super(id, label, str, bool, InputType.TextInput, null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            this.textInputType = textInputType;
            this.placeholder = str2;
            this.prefixText = str3;
            this.maximumCharacterCount = num;
            this.textContentType = textContentType;
            this.keyboardType = textKeyboardType;
            this.responseValueType = (textKeyboardType == null || (responseValueType = textKeyboardType.getResponseValueType()) == null) ? Value.ValueType.TextValue : responseValueType;
        }

        public final String getValue() {
            return this.value;
        }

        public final void setValue(String str) {
            this.value = str;
        }

        public final Value.ValueType getResponseValueType() {
            return this.responseValueType;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Input.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$TextInput$TextInputValidationError;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$ValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "MaxCharacters", "URL", "EmailAddress", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class TextInputValidationError implements ValidationError {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ TextInputValidationError[] $VALUES;
            public static final TextInputValidationError MaxCharacters = new TextInputValidationError("MaxCharacters", 0);
            public static final TextInputValidationError URL = new TextInputValidationError("URL", 1);
            public static final TextInputValidationError EmailAddress = new TextInputValidationError("EmailAddress", 2);

            private static final /* synthetic */ TextInputValidationError[] $values() {
                return new TextInputValidationError[]{MaxCharacters, URL, EmailAddress};
            }

            public static EnumEntries<TextInputValidationError> getEntries() {
                return $ENTRIES;
            }

            private TextInputValidationError(String str, int i) {
            }

            static {
                TextInputValidationError[] textInputValidationErrorArr$values = $values();
                $VALUES = textInputValidationErrorArr$values;
                $ENTRIES = EnumEntries2.enumEntries(textInputValidationErrorArr$values);
            }

            public static TextInputValidationError valueOf(String str) {
                return (TextInputValidationError) Enum.valueOf(TextInputValidationError.class, str);
            }

            public static TextInputValidationError[] values() {
                return (TextInputValidationError[]) $VALUES.clone();
            }
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.input.Input
        public ValidationError validate() {
            InputValidationError inputValidationErrorValidateRequired = validateRequired();
            if (inputValidationErrorValidateRequired != null) {
                return inputValidationErrorValidateRequired;
            }
            TextInputValidationError textInputValidationErrorValidateMaxCharacters = validateMaxCharacters();
            return textInputValidationErrorValidateMaxCharacters != null ? textInputValidationErrorValidateMaxCharacters : validateContentType();
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.input.Input
        public InputValue asInputValue() {
            Value valueStringValueToResponseValue = Value.INSTANCE.stringValueToResponseValue(this.value, this.responseValueType);
            if (valueStringValueToResponseValue == null) {
                return null;
            }
            return new InputValue.SingleInputValue(getId(), getLabel(), valueStringValueToResponseValue, null, 8, null);
        }

        private final InputValidationError validateRequired() {
            String str;
            boolean z = Intrinsics.areEqual(getRequired(), Boolean.TRUE) && ((str = this.value) == null || StringsKt.isBlank(str));
            if (z) {
                return InputValidationError.Required;
            }
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            return null;
        }

        private final TextInputValidationError validateMaxCharacters() {
            Integer num = this.maximumCharacterCount;
            if (num == null) {
                return null;
            }
            int iIntValue = num.intValue();
            String str = this.value;
            boolean z = (str != null ? str.length() : 0) <= iIntValue;
            if (z) {
                return null;
            }
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            return TextInputValidationError.MaxCharacters;
        }

        private final TextInputValidationError validateContentType() {
            String str = this.value;
            if (str == null || StringsKt.isBlank(str)) {
                str = null;
            }
            if (str == null) {
                return null;
            }
            TextContentType textContentType = this.textContentType;
            int i = textContentType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[textContentType.ordinal()];
            if (i == 1) {
                return validateEmail(str);
            }
            if (i != 2) {
                return null;
            }
            return validateURL(str);
        }

        private final TextInputValidationError validateEmail(String value) {
            Pattern EMAIL_ADDRESS = PatternsCompat.EMAIL_ADDRESS;
            Intrinsics.checkNotNullExpressionValue(EMAIL_ADDRESS, "EMAIL_ADDRESS");
            boolean zMatches = new Regex(EMAIL_ADDRESS).matches(value);
            if (zMatches) {
                return null;
            }
            if (zMatches) {
                throw new NoWhenBranchMatchedException();
            }
            return TextInputValidationError.EmailAddress;
        }

        private final TextInputValidationError validateURL(String value) {
            boolean z = URLUtils.INSTANCE.getToUriOrNull(value) != null;
            if (z) {
                return null;
            }
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            return TextInputValidationError.URL;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Input.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$TextInput$TextInputType;", "", "<init>", "(Ljava/lang/String;I)V", "Singleline", "Multiline", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class TextInputType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ TextInputType[] $VALUES;
            public static final TextInputType Singleline = new TextInputType("Singleline", 0);
            public static final TextInputType Multiline = new TextInputType("Multiline", 1);

            private static final /* synthetic */ TextInputType[] $values() {
                return new TextInputType[]{Singleline, Multiline};
            }

            public static EnumEntries<TextInputType> getEntries() {
                return $ENTRIES;
            }

            private TextInputType(String str, int i) {
            }

            static {
                TextInputType[] textInputTypeArr$values = $values();
                $VALUES = textInputTypeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(textInputTypeArr$values);
            }

            public static TextInputType valueOf(String str) {
                return (TextInputType) Enum.valueOf(TextInputType.class, str);
            }

            public static TextInputType[] values() {
                return (TextInputType[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Input.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$TextInput$TextContentType;", "", "<init>", "(Ljava/lang/String;I)V", "Name", "NamePrefix", "GivenName", "MiddleName", "FamilyName", "NameSuffix", "Nickname", "JobTitle", "OrganizationName", Headers.LOCATION, "FullStreetAddress", "StreetAddressLine1", "StreetAddressLine2", "AddressCity", "AddressState", "AddressCityAndState", "Sublocality", "CountryName", "PostalCode", "TelephoneNumber", "EmailAddress", "URL", "CreditCardNumber", "Username", "Password", "NewPassword", "OneTimeCode", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class TextContentType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ TextContentType[] $VALUES;
            public static final TextContentType Name = new TextContentType("Name", 0);
            public static final TextContentType NamePrefix = new TextContentType("NamePrefix", 1);
            public static final TextContentType GivenName = new TextContentType("GivenName", 2);
            public static final TextContentType MiddleName = new TextContentType("MiddleName", 3);
            public static final TextContentType FamilyName = new TextContentType("FamilyName", 4);
            public static final TextContentType NameSuffix = new TextContentType("NameSuffix", 5);
            public static final TextContentType Nickname = new TextContentType("Nickname", 6);
            public static final TextContentType JobTitle = new TextContentType("JobTitle", 7);
            public static final TextContentType OrganizationName = new TextContentType("OrganizationName", 8);
            public static final TextContentType Location = new TextContentType(Headers.LOCATION, 9);
            public static final TextContentType FullStreetAddress = new TextContentType("FullStreetAddress", 10);
            public static final TextContentType StreetAddressLine1 = new TextContentType("StreetAddressLine1", 11);
            public static final TextContentType StreetAddressLine2 = new TextContentType("StreetAddressLine2", 12);
            public static final TextContentType AddressCity = new TextContentType("AddressCity", 13);
            public static final TextContentType AddressState = new TextContentType("AddressState", 14);
            public static final TextContentType AddressCityAndState = new TextContentType("AddressCityAndState", 15);
            public static final TextContentType Sublocality = new TextContentType("Sublocality", 16);
            public static final TextContentType CountryName = new TextContentType("CountryName", 17);
            public static final TextContentType PostalCode = new TextContentType("PostalCode", 18);
            public static final TextContentType TelephoneNumber = new TextContentType("TelephoneNumber", 19);
            public static final TextContentType EmailAddress = new TextContentType("EmailAddress", 20);
            public static final TextContentType URL = new TextContentType("URL", 21);
            public static final TextContentType CreditCardNumber = new TextContentType("CreditCardNumber", 22);
            public static final TextContentType Username = new TextContentType("Username", 23);
            public static final TextContentType Password = new TextContentType("Password", 24);
            public static final TextContentType NewPassword = new TextContentType("NewPassword", 25);
            public static final TextContentType OneTimeCode = new TextContentType("OneTimeCode", 26);

            private static final /* synthetic */ TextContentType[] $values() {
                return new TextContentType[]{Name, NamePrefix, GivenName, MiddleName, FamilyName, NameSuffix, Nickname, JobTitle, OrganizationName, Location, FullStreetAddress, StreetAddressLine1, StreetAddressLine2, AddressCity, AddressState, AddressCityAndState, Sublocality, CountryName, PostalCode, TelephoneNumber, EmailAddress, URL, CreditCardNumber, Username, Password, NewPassword, OneTimeCode};
            }

            public static EnumEntries<TextContentType> getEntries() {
                return $ENTRIES;
            }

            private TextContentType(String str, int i) {
            }

            static {
                TextContentType[] textContentTypeArr$values = $values();
                $VALUES = textContentTypeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(textContentTypeArr$values);
            }

            public static TextContentType valueOf(String str) {
                return (TextContentType) Enum.valueOf(TextContentType.class, str);
            }

            public static TextContentType[] values() {
                return (TextContentType[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Input.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$TextInput$TextKeyboardType;", "", "responseValueType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$ValueType;", "<init>", "(Ljava/lang/String;ILcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$ValueType;)V", "getResponseValueType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/value/Value$ValueType;", "Default", "AsciiCapable", "NumbersAndPunctuation", "URL", "NumberPad", "PhonePad", "NamePhonePad", "EmailAddress", "DecimalPad", "Twitter", "WebSearch", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class TextKeyboardType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ TextKeyboardType[] $VALUES;
            public static final TextKeyboardType AsciiCapable;
            public static final TextKeyboardType DecimalPad;
            public static final TextKeyboardType Default;
            public static final TextKeyboardType EmailAddress;
            public static final TextKeyboardType NamePhonePad;
            public static final TextKeyboardType NumberPad;
            public static final TextKeyboardType NumbersAndPunctuation;
            public static final TextKeyboardType PhonePad;
            public static final TextKeyboardType Twitter;
            public static final TextKeyboardType URL;
            public static final TextKeyboardType WebSearch;
            private final Value.ValueType responseValueType;

            private static final /* synthetic */ TextKeyboardType[] $values() {
                return new TextKeyboardType[]{Default, AsciiCapable, NumbersAndPunctuation, URL, NumberPad, PhonePad, NamePhonePad, EmailAddress, DecimalPad, Twitter, WebSearch};
            }

            public static EnumEntries<TextKeyboardType> getEntries() {
                return $ENTRIES;
            }

            private TextKeyboardType(String str, int i, Value.ValueType valueType) {
                this.responseValueType = valueType;
            }

            public final Value.ValueType getResponseValueType() {
                return this.responseValueType;
            }

            static {
                Value.ValueType valueType = Value.ValueType.TextValue;
                Default = new TextKeyboardType("Default", 0, valueType);
                AsciiCapable = new TextKeyboardType("AsciiCapable", 1, valueType);
                Value.ValueType valueType2 = Value.ValueType.DoubleValue;
                NumbersAndPunctuation = new TextKeyboardType("NumbersAndPunctuation", 2, valueType2);
                URL = new TextKeyboardType("URL", 3, Value.ValueType.UrlValue);
                NumberPad = new TextKeyboardType("NumberPad", 4, Value.ValueType.IntegerValue);
                PhonePad = new TextKeyboardType("PhonePad", 5, valueType);
                NamePhonePad = new TextKeyboardType("NamePhonePad", 6, valueType);
                EmailAddress = new TextKeyboardType("EmailAddress", 7, valueType);
                DecimalPad = new TextKeyboardType("DecimalPad", 8, valueType2);
                Twitter = new TextKeyboardType("Twitter", 9, valueType);
                WebSearch = new TextKeyboardType("WebSearch", 10, valueType);
                TextKeyboardType[] textKeyboardTypeArr$values = $values();
                $VALUES = textKeyboardTypeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(textKeyboardTypeArr$values);
            }

            public static TextKeyboardType valueOf(String str) {
                return (TextKeyboardType) Enum.valueOf(TextKeyboardType.class, str);
            }

            public static TextKeyboardType[] values() {
                return (TextKeyboardType[]) $VALUES.clone();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Input.kt */
    @JsonClass(generateAdapter = false)
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/input/Input$InputType;", "", "<init>", "(Ljava/lang/String;I)V", "SelectInput", "OptionPickerInput", "DatePickerInput", "TextInput", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class InputType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InputType[] $VALUES;
        public static final InputType SelectInput = new InputType("SelectInput", 0);
        public static final InputType OptionPickerInput = new InputType("OptionPickerInput", 1);
        public static final InputType DatePickerInput = new InputType("DatePickerInput", 2);
        public static final InputType TextInput = new InputType("TextInput", 3);

        private static final /* synthetic */ InputType[] $values() {
            return new InputType[]{SelectInput, OptionPickerInput, DatePickerInput, TextInput};
        }

        public static EnumEntries<InputType> getEntries() {
            return $ENTRIES;
        }

        private InputType(String str, int i) {
        }

        static {
            InputType[] inputTypeArr$values = $values();
            $VALUES = inputTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(inputTypeArr$values);
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }
    }
}
