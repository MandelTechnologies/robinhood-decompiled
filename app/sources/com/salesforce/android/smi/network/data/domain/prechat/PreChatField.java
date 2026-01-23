package com.salesforce.android.smi.network.data.domain.prechat;

import com.robinhood.models.card.p311db.Card;
import kotlin.Metadata;

/* compiled from: PreChatField.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\b\u0010'\u001a\u00020\u0013H&J\b\u0010(\u001a\u00020\u001dH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\tR\u0018\u0010\u0018\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0005\"\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u00020\u001dX¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0018\u0010\"\u001a\u00020\u0013X¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010$R\u0018\u0010%\u001a\u00020\u0013X¦\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010$¨\u0006)"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatField;", "Lcom/salesforce/android/smi/network/data/domain/prechat/FormField;", "name", "", "getName", "()Ljava/lang/String;", Card.Icon.ORDER, "", "getOrder", "()I", "labels", "Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatLabels;", "getLabels", "()Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatLabels;", "type", "Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatFieldType;", "getType", "()Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatFieldType;", "required", "", "getRequired", "()Z", "maxLength", "getMaxLength", "userInput", "getUserInput", "setUserInput", "(Ljava/lang/String;)V", "errorType", "Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatErrorType;", "getErrorType", "()Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatErrorType;", "setErrorType", "(Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatErrorType;)V", "isHidden", "setHidden", "(Z)V", "isEditable", "setEditable", "isValid", "validate", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface PreChatField extends FormField {
    @Override // com.salesforce.android.smi.network.data.domain.prechat.FormField
    PreChatErrorType getErrorType();

    PreChatLabels getLabels();

    int getMaxLength();

    String getName();

    int getOrder();

    boolean getRequired();

    PreChatFieldType getType();

    @Override // com.salesforce.android.smi.network.data.domain.prechat.FormField
    String getUserInput();

    boolean isEditable();

    @Override // com.salesforce.android.smi.network.data.domain.prechat.FormField
    /* renamed from: isHidden */
    boolean getIsHidden();

    @Override // com.salesforce.android.smi.network.data.domain.prechat.FormField
    boolean isValid();

    void setEditable(boolean z);

    @Override // com.salesforce.android.smi.network.data.domain.prechat.FormField
    void setErrorType(PreChatErrorType preChatErrorType);

    @Override // com.salesforce.android.smi.network.data.domain.prechat.FormField
    void setHidden(boolean z);

    @Override // com.salesforce.android.smi.network.data.domain.prechat.FormField
    void setUserInput(String str);

    @Override // com.salesforce.android.smi.network.data.domain.prechat.FormField
    PreChatErrorType validate();
}
