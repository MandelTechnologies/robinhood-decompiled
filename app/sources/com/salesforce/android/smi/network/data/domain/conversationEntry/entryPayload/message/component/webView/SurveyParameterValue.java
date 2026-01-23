package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.webView;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyParameterValue.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/webView/SurveyParameterValue;", "", "valueType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/webView/ValueType;", "textValue", "", "<init>", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/webView/ValueType;Ljava/lang/String;)V", "getValueType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/webView/ValueType;", "getTextValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SurveyParameterValue {
    private final String textValue;
    private final ValueType valueType;

    public static /* synthetic */ SurveyParameterValue copy$default(SurveyParameterValue surveyParameterValue, ValueType valueType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            valueType = surveyParameterValue.valueType;
        }
        if ((i & 2) != 0) {
            str = surveyParameterValue.textValue;
        }
        return surveyParameterValue.copy(valueType, str);
    }

    /* renamed from: component1, reason: from getter */
    public final ValueType getValueType() {
        return this.valueType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTextValue() {
        return this.textValue;
    }

    public final SurveyParameterValue copy(ValueType valueType, String textValue) {
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        Intrinsics.checkNotNullParameter(textValue, "textValue");
        return new SurveyParameterValue(valueType, textValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyParameterValue)) {
            return false;
        }
        SurveyParameterValue surveyParameterValue = (SurveyParameterValue) other;
        return this.valueType == surveyParameterValue.valueType && Intrinsics.areEqual(this.textValue, surveyParameterValue.textValue);
    }

    public int hashCode() {
        return (this.valueType.hashCode() * 31) + this.textValue.hashCode();
    }

    public String toString() {
        return "SurveyParameterValue(valueType=" + this.valueType + ", textValue=" + this.textValue + ")";
    }

    public SurveyParameterValue(ValueType valueType, String textValue) {
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        Intrinsics.checkNotNullParameter(textValue, "textValue");
        this.valueType = valueType;
        this.textValue = textValue;
    }

    public final ValueType getValueType() {
        return this.valueType;
    }

    public final String getTextValue() {
        return this.textValue;
    }
}
