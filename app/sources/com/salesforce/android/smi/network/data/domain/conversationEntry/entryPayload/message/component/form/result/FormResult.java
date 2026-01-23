package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.result;

import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FormResult.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/result/FormResult;", "", "resultType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/result/FormResult$FormResultType;", "<init>", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/result/FormResult$FormResultType;)V", "getResultType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/result/FormResult$FormResultType;", "FormRecordsResult", "FormErrorResult", "FormResultType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/result/FormResult$FormErrorResult;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/result/FormResult$FormRecordsResult;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class FormResult {
    private final FormResultType resultType;

    public /* synthetic */ FormResult(FormResultType formResultType, DefaultConstructorMarker defaultConstructorMarker) {
        this(formResultType);
    }

    private FormResult(FormResultType formResultType) {
        this.resultType = formResultType;
    }

    public final FormResultType getResultType() {
        return this.resultType;
    }

    /* compiled from: FormResult.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/result/FormResult$FormRecordsResult;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/result/FormResult;", "records", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/result/RecordResult;", "<init>", "(Ljava/util/List;)V", "getRecords", "()Ljava/util/List;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class FormRecordsResult extends FormResult {
        private final List<RecordResult> records;

        public final List<RecordResult> getRecords() {
            return this.records;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FormRecordsResult(List<RecordResult> records) {
            super(FormResultType.FormRecordsResult, null);
            Intrinsics.checkNotNullParameter(records, "records");
            this.records = records;
        }
    }

    /* compiled from: FormResult.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/result/FormResult$FormErrorResult;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/result/FormResult;", "errors", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/result/FormError;", "<init>", "(Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class FormErrorResult extends FormResult {
        private final List<FormError> errors;

        public final List<FormError> getErrors() {
            return this.errors;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FormErrorResult(List<FormError> errors) {
            super(FormResultType.FormErrorResult, null);
            Intrinsics.checkNotNullParameter(errors, "errors");
            this.errors = errors;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FormResult.kt */
    @JsonClass(generateAdapter = false)
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/result/FormResult$FormResultType;", "", "<init>", "(Ljava/lang/String;I)V", "FormRecordsResult", "FormErrorResult", "FormInputsResponse", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class FormResultType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FormResultType[] $VALUES;
        public static final FormResultType FormRecordsResult = new FormResultType("FormRecordsResult", 0);
        public static final FormResultType FormErrorResult = new FormResultType("FormErrorResult", 1);
        public static final FormResultType FormInputsResponse = new FormResultType("FormInputsResponse", 2);

        private static final /* synthetic */ FormResultType[] $values() {
            return new FormResultType[]{FormRecordsResult, FormErrorResult, FormInputsResponse};
        }

        public static EnumEntries<FormResultType> getEntries() {
            return $ENTRIES;
        }

        private FormResultType(String str, int i) {
        }

        static {
            FormResultType[] formResultTypeArr$values = $values();
            $VALUES = formResultTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(formResultTypeArr$values);
        }

        public static FormResultType valueOf(String str) {
            return (FormResultType) Enum.valueOf(FormResultType.class, str);
        }

        public static FormResultType[] values() {
            return (FormResultType[]) $VALUES.clone();
        }
    }
}
