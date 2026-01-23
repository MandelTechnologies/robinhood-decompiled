package com.salesforce.android.smi.network.internal.dto.response.remoteconfig;

import com.salesforce.android.smi.network.data.domain.prechat.PreChatField;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreChatConfiguration.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/PreChatConfiguration;", "", "formFields", "", "Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatField;", "hiddenFormFields", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getFormFields", "()Ljava/util/List;", "getHiddenFormFields", "formType", "Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/FormType;", "getFormType", "()Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/FormType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PreChatConfiguration {
    private final List<PreChatField> formFields;
    private final transient FormType formType;
    private final List<PreChatField> hiddenFormFields;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreChatConfiguration copy$default(PreChatConfiguration preChatConfiguration, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = preChatConfiguration.formFields;
        }
        if ((i & 2) != 0) {
            list2 = preChatConfiguration.hiddenFormFields;
        }
        return preChatConfiguration.copy(list, list2);
    }

    public final List<PreChatField> component1() {
        return this.formFields;
    }

    public final List<PreChatField> component2() {
        return this.hiddenFormFields;
    }

    public final PreChatConfiguration copy(List<? extends PreChatField> formFields, List<? extends PreChatField> hiddenFormFields) {
        Intrinsics.checkNotNullParameter(formFields, "formFields");
        Intrinsics.checkNotNullParameter(hiddenFormFields, "hiddenFormFields");
        return new PreChatConfiguration(formFields, hiddenFormFields);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreChatConfiguration)) {
            return false;
        }
        PreChatConfiguration preChatConfiguration = (PreChatConfiguration) other;
        return Intrinsics.areEqual(this.formFields, preChatConfiguration.formFields) && Intrinsics.areEqual(this.hiddenFormFields, preChatConfiguration.hiddenFormFields);
    }

    public int hashCode() {
        return (this.formFields.hashCode() * 31) + this.hiddenFormFields.hashCode();
    }

    public String toString() {
        return "PreChatConfiguration(formFields=" + this.formFields + ", hiddenFormFields=" + this.hiddenFormFields + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreChatConfiguration(List<? extends PreChatField> formFields, List<? extends PreChatField> hiddenFormFields) {
        Intrinsics.checkNotNullParameter(formFields, "formFields");
        Intrinsics.checkNotNullParameter(hiddenFormFields, "hiddenFormFields");
        this.formFields = formFields;
        this.hiddenFormFields = hiddenFormFields;
        this.formType = FormType.PreChat;
    }

    public final List<PreChatField> getFormFields() {
        return this.formFields;
    }

    public final List<PreChatField> getHiddenFormFields() {
        return this.hiddenFormFields;
    }

    public final FormType getFormType() {
        return this.formType;
    }
}
