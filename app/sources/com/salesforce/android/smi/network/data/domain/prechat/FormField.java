package com.salesforce.android.smi.network.data.domain.prechat;

import kotlin.Metadata;

/* compiled from: FormField.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0013\u001a\u00020\u000fH&J\b\u0010\u0014\u001a\u00020\tH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/prechat/FormField;", "", "userInput", "", "getUserInput", "()Ljava/lang/String;", "setUserInput", "(Ljava/lang/String;)V", "errorType", "Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatErrorType;", "getErrorType", "()Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatErrorType;", "setErrorType", "(Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatErrorType;)V", "isHidden", "", "()Z", "setHidden", "(Z)V", "isValid", "validate", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface FormField {
    PreChatErrorType getErrorType();

    String getUserInput();

    boolean isHidden();

    boolean isValid();

    void setErrorType(PreChatErrorType preChatErrorType);

    void setHidden(boolean z);

    void setUserInput(String str);

    PreChatErrorType validate();
}
