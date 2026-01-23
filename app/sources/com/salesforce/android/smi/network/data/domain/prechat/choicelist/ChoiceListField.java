package com.salesforce.android.smi.network.data.domain.prechat.choicelist;

import com.salesforce.android.smi.network.data.domain.prechat.PreChatField;
import kotlin.Metadata;

/* compiled from: ChoiceListField.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceListField;", "Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatField;", "choiceListId", "", "getChoiceListId", "()Ljava/lang/String;", "choiceList", "Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceList;", "getChoiceList", "()Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceList;", "setChoiceList", "(Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceList;)V", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface ChoiceListField extends PreChatField {
    ChoiceList getChoiceList();

    String getChoiceListId();

    void setChoiceList(ChoiceList choiceList);
}
