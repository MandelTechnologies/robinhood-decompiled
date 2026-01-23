package com.salesforce.android.smi.network.data.domain.prechat.choicelist;

import com.robinhood.models.card.p311db.Card;
import com.salesforce.android.smi.network.data.domain.prechat.PreChatErrorType;
import com.salesforce.android.smi.network.data.domain.prechat.PreChatFieldType;
import com.salesforce.android.smi.network.data.domain.prechat.PreChatLabels;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalChoiceListField.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u00101\u001a\u00020\u000bH\u0016J\b\u00102\u001a\u00020\u0010H\u0016J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\t\u00107\u001a\u00020\u000bHÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0010HÆ\u0003J\t\u0010<\u001a\u00020\u000bHÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\t\u0010>\u001a\u00020\u0014HÆ\u0003J\u0081\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\u0013\u0010@\u001a\u00020\u000b2\b\u0010A\u001a\u0004\u0018\u00010BHÖ\u0003J\t\u0010C\u001a\u00020\u0005HÖ\u0001J\t\u0010D\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0014\u0010\r\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010%R\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0011\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010 \"\u0004\b*\u0010+R\u001a\u0010\u0012\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010 \"\u0004\b,\u0010+R\u001a\u0010\u0013\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u0006E"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/InternalChoiceListField;", "Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceListField;", "name", "", Card.Icon.ORDER, "", "labels", "Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatLabels;", "type", "Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatFieldType;", "required", "", "maxLength", "choiceListId", "userInput", "errorType", "Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatErrorType;", "isHidden", "isEditable", "choiceList", "Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceList;", "<init>", "(Ljava/lang/String;ILcom/salesforce/android/smi/network/data/domain/prechat/PreChatLabels;Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatFieldType;ZILjava/lang/String;Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatErrorType;ZZLcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceList;)V", "getName", "()Ljava/lang/String;", "getOrder", "()I", "getLabels", "()Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatLabels;", "getType", "()Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatFieldType;", "getRequired", "()Z", "getMaxLength", "getChoiceListId", "getUserInput", "setUserInput", "(Ljava/lang/String;)V", "getErrorType", "()Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatErrorType;", "setErrorType", "(Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatErrorType;)V", "setHidden", "(Z)V", "setEditable", "getChoiceList", "()Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceList;", "setChoiceList", "(Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceList;)V", "isValid", "validate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "", "hashCode", "toString", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class InternalChoiceListField implements ChoiceListField {
    private transient ChoiceList choiceList;
    private final String choiceListId;
    private PreChatErrorType errorType;
    private boolean isEditable;
    private boolean isHidden;
    private final PreChatLabels labels;
    private final int maxLength;
    private final String name;
    private final int order;
    private final boolean required;
    private final PreChatFieldType type;
    private String userInput;

    public static /* synthetic */ InternalChoiceListField copy$default(InternalChoiceListField internalChoiceListField, String str, int i, PreChatLabels preChatLabels, PreChatFieldType preChatFieldType, boolean z, int i2, String str2, String str3, PreChatErrorType preChatErrorType, boolean z2, boolean z3, ChoiceList choiceList, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = internalChoiceListField.name;
        }
        if ((i3 & 2) != 0) {
            i = internalChoiceListField.order;
        }
        if ((i3 & 4) != 0) {
            preChatLabels = internalChoiceListField.labels;
        }
        if ((i3 & 8) != 0) {
            preChatFieldType = internalChoiceListField.type;
        }
        if ((i3 & 16) != 0) {
            z = internalChoiceListField.required;
        }
        if ((i3 & 32) != 0) {
            i2 = internalChoiceListField.maxLength;
        }
        if ((i3 & 64) != 0) {
            str2 = internalChoiceListField.choiceListId;
        }
        if ((i3 & 128) != 0) {
            str3 = internalChoiceListField.userInput;
        }
        if ((i3 & 256) != 0) {
            preChatErrorType = internalChoiceListField.errorType;
        }
        if ((i3 & 512) != 0) {
            z2 = internalChoiceListField.isHidden;
        }
        if ((i3 & 1024) != 0) {
            z3 = internalChoiceListField.isEditable;
        }
        if ((i3 & 2048) != 0) {
            choiceList = internalChoiceListField.choiceList;
        }
        boolean z4 = z3;
        ChoiceList choiceList2 = choiceList;
        PreChatErrorType preChatErrorType2 = preChatErrorType;
        boolean z5 = z2;
        String str4 = str2;
        String str5 = str3;
        boolean z6 = z;
        int i4 = i2;
        return internalChoiceListField.copy(str, i, preChatLabels, preChatFieldType, z6, i4, str4, str5, preChatErrorType2, z5, z4, choiceList2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsEditable() {
        return this.isEditable;
    }

    /* renamed from: component12, reason: from getter */
    public final ChoiceList getChoiceList() {
        return this.choiceList;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    /* renamed from: component3, reason: from getter */
    public final PreChatLabels getLabels() {
        return this.labels;
    }

    /* renamed from: component4, reason: from getter */
    public final PreChatFieldType getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* renamed from: component6, reason: from getter */
    public final int getMaxLength() {
        return this.maxLength;
    }

    /* renamed from: component7, reason: from getter */
    public final String getChoiceListId() {
        return this.choiceListId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getUserInput() {
        return this.userInput;
    }

    /* renamed from: component9, reason: from getter */
    public final PreChatErrorType getErrorType() {
        return this.errorType;
    }

    public final InternalChoiceListField copy(String name, int order, PreChatLabels labels, PreChatFieldType type2, boolean required, int maxLength, String choiceListId, String userInput, PreChatErrorType errorType, boolean isHidden, boolean isEditable, ChoiceList choiceList) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(choiceListId, "choiceListId");
        Intrinsics.checkNotNullParameter(userInput, "userInput");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(choiceList, "choiceList");
        return new InternalChoiceListField(name, order, labels, type2, required, maxLength, choiceListId, userInput, errorType, isHidden, isEditable, choiceList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalChoiceListField)) {
            return false;
        }
        InternalChoiceListField internalChoiceListField = (InternalChoiceListField) other;
        return Intrinsics.areEqual(this.name, internalChoiceListField.name) && this.order == internalChoiceListField.order && Intrinsics.areEqual(this.labels, internalChoiceListField.labels) && this.type == internalChoiceListField.type && this.required == internalChoiceListField.required && this.maxLength == internalChoiceListField.maxLength && Intrinsics.areEqual(this.choiceListId, internalChoiceListField.choiceListId) && Intrinsics.areEqual(this.userInput, internalChoiceListField.userInput) && this.errorType == internalChoiceListField.errorType && this.isHidden == internalChoiceListField.isHidden && this.isEditable == internalChoiceListField.isEditable && Intrinsics.areEqual(this.choiceList, internalChoiceListField.choiceList);
    }

    public int hashCode() {
        return (((((((((((((((((((((this.name.hashCode() * 31) + Integer.hashCode(this.order)) * 31) + this.labels.hashCode()) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.required)) * 31) + Integer.hashCode(this.maxLength)) * 31) + this.choiceListId.hashCode()) * 31) + this.userInput.hashCode()) * 31) + this.errorType.hashCode()) * 31) + Boolean.hashCode(this.isHidden)) * 31) + Boolean.hashCode(this.isEditable)) * 31) + this.choiceList.hashCode();
    }

    public String toString() {
        return "InternalChoiceListField(name=" + this.name + ", order=" + this.order + ", labels=" + this.labels + ", type=" + this.type + ", required=" + this.required + ", maxLength=" + this.maxLength + ", choiceListId=" + this.choiceListId + ", userInput=" + this.userInput + ", errorType=" + this.errorType + ", isHidden=" + this.isHidden + ", isEditable=" + this.isEditable + ", choiceList=" + this.choiceList + ")";
    }

    public InternalChoiceListField(String name, int i, PreChatLabels labels, PreChatFieldType type2, boolean z, int i2, String choiceListId, String userInput, PreChatErrorType errorType, boolean z2, boolean z3, ChoiceList choiceList) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(choiceListId, "choiceListId");
        Intrinsics.checkNotNullParameter(userInput, "userInput");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(choiceList, "choiceList");
        this.name = name;
        this.order = i;
        this.labels = labels;
        this.type = type2;
        this.required = z;
        this.maxLength = i2;
        this.choiceListId = choiceListId;
        this.userInput = userInput;
        this.errorType = errorType;
        this.isHidden = z2;
        this.isEditable = z3;
        this.choiceList = choiceList;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.PreChatField
    public String getName() {
        return this.name;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.PreChatField
    public int getOrder() {
        return this.order;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.PreChatField
    public PreChatLabels getLabels() {
        return this.labels;
    }

    public /* synthetic */ InternalChoiceListField(String str, int i, PreChatLabels preChatLabels, PreChatFieldType preChatFieldType, boolean z, int i2, String str2, String str3, PreChatErrorType preChatErrorType, boolean z2, boolean z3, ChoiceList choiceList, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, preChatLabels, (i3 & 8) != 0 ? PreChatFieldType.ChoiceList : preChatFieldType, z, i2, str2, (i3 & 128) != 0 ? "" : str3, (i3 & 256) != 0 ? PreChatErrorType.None : preChatErrorType, (i3 & 512) != 0 ? false : z2, (i3 & 1024) != 0 ? true : z3, (i3 & 2048) != 0 ? new ChoiceList("", null, 2, null) : choiceList);
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.PreChatField
    public PreChatFieldType getType() {
        return this.type;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.PreChatField
    public boolean getRequired() {
        return this.required;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.PreChatField
    public int getMaxLength() {
        return this.maxLength;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.choicelist.ChoiceListField
    public String getChoiceListId() {
        return this.choiceListId;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.PreChatField, com.salesforce.android.smi.network.data.domain.prechat.FormField
    public String getUserInput() {
        return this.userInput;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.PreChatField, com.salesforce.android.smi.network.data.domain.prechat.FormField
    public void setUserInput(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userInput = str;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.PreChatField, com.salesforce.android.smi.network.data.domain.prechat.FormField
    public PreChatErrorType getErrorType() {
        return this.errorType;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.PreChatField, com.salesforce.android.smi.network.data.domain.prechat.FormField
    public void setErrorType(PreChatErrorType preChatErrorType) {
        Intrinsics.checkNotNullParameter(preChatErrorType, "<set-?>");
        this.errorType = preChatErrorType;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.PreChatField, com.salesforce.android.smi.network.data.domain.prechat.FormField
    /* renamed from: isHidden */
    public boolean getIsHidden() {
        return this.isHidden;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.PreChatField, com.salesforce.android.smi.network.data.domain.prechat.FormField
    public void setHidden(boolean z) {
        this.isHidden = z;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.PreChatField
    public boolean isEditable() {
        return this.isEditable;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.PreChatField
    public void setEditable(boolean z) {
        this.isEditable = z;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.choicelist.ChoiceListField
    public ChoiceList getChoiceList() {
        return this.choiceList;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.choicelist.ChoiceListField
    public void setChoiceList(ChoiceList choiceList) {
        Intrinsics.checkNotNullParameter(choiceList, "<set-?>");
        this.choiceList = choiceList;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.PreChatField, com.salesforce.android.smi.network.data.domain.prechat.FormField
    public boolean isValid() {
        return validate() == PreChatErrorType.None;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.PreChatField, com.salesforce.android.smi.network.data.domain.prechat.FormField
    public PreChatErrorType validate() {
        if (getRequired() && getUserInput().length() == 0) {
            return PreChatErrorType.RequiredField;
        }
        if (!getRequired() && getUserInput().length() == 0) {
            return PreChatErrorType.None;
        }
        if (getUserInput().length() >= getMaxLength()) {
            return PreChatErrorType.MaxLength;
        }
        return PreChatErrorType.None;
    }
}
