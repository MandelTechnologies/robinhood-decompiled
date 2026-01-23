package com.salesforce.android.smi.network.data.domain.prechat.termsAndConditions;

import android.text.SpannableString;
import com.salesforce.android.smi.network.data.domain.prechat.FormField;
import com.salesforce.android.smi.network.data.domain.prechat.PreChatErrorType;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: TermsAndConditions.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010$\u001a\u00020\u0003H\u0016J\b\u0010%\u001a\u00020\u0019H\u0016J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J0\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010 ¨\u00061"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/prechat/termsAndConditions/TermsAndConditions;", "Lcom/salesforce/android/smi/network/data/domain/prechat/FormField;", "isTermsAndConditionsEnabled", "", "isTermsAndConditionsRequired", AnnotatedPrivateKey.LABEL, "", "<init>", "(ZLjava/lang/Boolean;Ljava/lang/String;)V", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLabel", "()Ljava/lang/String;", "spannableString", "Landroid/text/SpannableString;", "getSpannableString", "()Landroid/text/SpannableString;", "setSpannableString", "(Landroid/text/SpannableString;)V", "userInput", "getUserInput", "setUserInput", "(Ljava/lang/String;)V", "errorType", "Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatErrorType;", "getErrorType", "()Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatErrorType;", "setErrorType", "(Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatErrorType;)V", "isHidden", "setHidden", "(Z)V", "value", "isChecked", "setChecked", "isValid", "validate", "component1", "component2", "component3", "copy", "(ZLjava/lang/Boolean;Ljava/lang/String;)Lcom/salesforce/android/smi/network/data/domain/prechat/termsAndConditions/TermsAndConditions;", "equals", "other", "", "hashCode", "", "toString", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TermsAndConditions implements FormField {
    private transient boolean isHidden;
    private final boolean isTermsAndConditionsEnabled;
    private final Boolean isTermsAndConditionsRequired;
    private final String label;
    private transient SpannableString spannableString = TermsAndConditionsUtil.createSpannableString(this);
    private transient String userInput = "";
    private transient PreChatErrorType errorType = PreChatErrorType.None;

    public static /* synthetic */ TermsAndConditions copy$default(TermsAndConditions termsAndConditions, boolean z, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = termsAndConditions.isTermsAndConditionsEnabled;
        }
        if ((i & 2) != 0) {
            bool = termsAndConditions.isTermsAndConditionsRequired;
        }
        if ((i & 4) != 0) {
            str = termsAndConditions.label;
        }
        return termsAndConditions.copy(z, bool, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsTermsAndConditionsEnabled() {
        return this.isTermsAndConditionsEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsTermsAndConditionsRequired() {
        return this.isTermsAndConditionsRequired;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final TermsAndConditions copy(boolean isTermsAndConditionsEnabled, Boolean isTermsAndConditionsRequired, String label) {
        return new TermsAndConditions(isTermsAndConditionsEnabled, isTermsAndConditionsRequired, label);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TermsAndConditions)) {
            return false;
        }
        TermsAndConditions termsAndConditions = (TermsAndConditions) other;
        return this.isTermsAndConditionsEnabled == termsAndConditions.isTermsAndConditionsEnabled && Intrinsics.areEqual(this.isTermsAndConditionsRequired, termsAndConditions.isTermsAndConditionsRequired) && Intrinsics.areEqual(this.label, termsAndConditions.label);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isTermsAndConditionsEnabled) * 31;
        Boolean bool = this.isTermsAndConditionsRequired;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.label;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "TermsAndConditions(isTermsAndConditionsEnabled=" + this.isTermsAndConditionsEnabled + ", isTermsAndConditionsRequired=" + this.isTermsAndConditionsRequired + ", label=" + this.label + ")";
    }

    public TermsAndConditions(boolean z, Boolean bool, String str) {
        this.isTermsAndConditionsEnabled = z;
        this.isTermsAndConditionsRequired = bool;
        this.label = str;
    }

    public final boolean isTermsAndConditionsEnabled() {
        return this.isTermsAndConditionsEnabled;
    }

    public final Boolean isTermsAndConditionsRequired() {
        return this.isTermsAndConditionsRequired;
    }

    public final String getLabel() {
        return this.label;
    }

    public final SpannableString getSpannableString() {
        return this.spannableString;
    }

    public final void setSpannableString(SpannableString spannableString) {
        this.spannableString = spannableString;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.FormField
    public String getUserInput() {
        return this.userInput;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.FormField
    public void setUserInput(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userInput = str;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.FormField
    public PreChatErrorType getErrorType() {
        return this.errorType;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.FormField
    public void setErrorType(PreChatErrorType preChatErrorType) {
        Intrinsics.checkNotNullParameter(preChatErrorType, "<set-?>");
        this.errorType = preChatErrorType;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.FormField
    /* renamed from: isHidden, reason: from getter */
    public boolean getIsHidden() {
        return this.isHidden;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.FormField
    public void setHidden(boolean z) {
        this.isHidden = z;
    }

    public final boolean isChecked() {
        return Boolean.parseBoolean(getUserInput());
    }

    public final void setChecked(boolean z) {
        setUserInput(String.valueOf(z));
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.FormField
    public boolean isValid() {
        return validate() == PreChatErrorType.None;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.FormField
    public PreChatErrorType validate() {
        if (this.isTermsAndConditionsEnabled && Intrinsics.areEqual(this.isTermsAndConditionsRequired, Boolean.TRUE) && !Intrinsics.areEqual(getUserInput(), "true")) {
            return PreChatErrorType.RequiresTermsAccepted;
        }
        return PreChatErrorType.None;
    }
}
