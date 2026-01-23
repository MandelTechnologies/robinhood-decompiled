package com.salesforce.android.smi.network.data.domain.prechat;

import android.telephony.PhoneNumberUtils;
import androidx.core.util.PatternsCompat;
import com.robinhood.models.card.p311db.Card;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: InternalPreChatField.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010)\u001a\u00020\u000bH\u0016J\b\u0010*\u001a\u00020\u000fH\u0016J\u0010\u0010+\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010,\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010-\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0018\u0010.\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001e\u0010/\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b01H\u0002J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u000fHÆ\u0003J\t\u0010:\u001a\u00020\u000bHÆ\u0003J\t\u0010;\u001a\u00020\u000bHÆ\u0003Jm\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000bHÆ\u0001J\u0013\u0010=\u001a\u00020\u000b2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020\u0005HÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u001a\u0010\r\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010!R\u001a\u0010\u000e\u001a\u00020\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0010\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u001d\"\u0004\b&\u0010'R\u001a\u0010\u0011\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u001d\"\u0004\b(\u0010'¨\u0006B"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/prechat/InternalPreChatField;", "Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatField;", "name", "", Card.Icon.ORDER, "", "labels", "Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatLabels;", "type", "Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatFieldType;", "required", "", "maxLength", "userInput", "errorType", "Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatErrorType;", "isHidden", "isEditable", "<init>", "(Ljava/lang/String;ILcom/salesforce/android/smi/network/data/domain/prechat/PreChatLabels;Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatFieldType;ZILjava/lang/String;Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatErrorType;ZZ)V", "getName", "()Ljava/lang/String;", "getOrder", "()I", "getLabels", "()Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatLabels;", "getType", "()Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatFieldType;", "getRequired", "()Z", "getMaxLength", "getUserInput", "setUserInput", "(Ljava/lang/String;)V", "getErrorType", "()Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatErrorType;", "setErrorType", "(Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatErrorType;)V", "setHidden", "(Z)V", "setEditable", "isValid", "validate", "isValidEmail", "isValidPhone", "isNumeric", "isValidCheckBox", "validateType", "predicate", "Lkotlin/Function0;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "", "hashCode", "toString", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class InternalPreChatField implements PreChatField {
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

    /* compiled from: InternalPreChatField.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PreChatFieldType.values().length];
            try {
                iArr[PreChatFieldType.Email.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreChatFieldType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PreChatFieldType.Phone.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PreChatFieldType.Checkbox.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ InternalPreChatField copy$default(InternalPreChatField internalPreChatField, String str, int i, PreChatLabels preChatLabels, PreChatFieldType preChatFieldType, boolean z, int i2, String str2, PreChatErrorType preChatErrorType, boolean z2, boolean z3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = internalPreChatField.name;
        }
        if ((i3 & 2) != 0) {
            i = internalPreChatField.order;
        }
        if ((i3 & 4) != 0) {
            preChatLabels = internalPreChatField.labels;
        }
        if ((i3 & 8) != 0) {
            preChatFieldType = internalPreChatField.type;
        }
        if ((i3 & 16) != 0) {
            z = internalPreChatField.required;
        }
        if ((i3 & 32) != 0) {
            i2 = internalPreChatField.maxLength;
        }
        if ((i3 & 64) != 0) {
            str2 = internalPreChatField.userInput;
        }
        if ((i3 & 128) != 0) {
            preChatErrorType = internalPreChatField.errorType;
        }
        if ((i3 & 256) != 0) {
            z2 = internalPreChatField.isHidden;
        }
        if ((i3 & 512) != 0) {
            z3 = internalPreChatField.isEditable;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        String str3 = str2;
        PreChatErrorType preChatErrorType2 = preChatErrorType;
        boolean z6 = z;
        int i4 = i2;
        return internalPreChatField.copy(str, i, preChatLabels, preChatFieldType, z6, i4, str3, preChatErrorType2, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsEditable() {
        return this.isEditable;
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
    public final String getUserInput() {
        return this.userInput;
    }

    /* renamed from: component8, reason: from getter */
    public final PreChatErrorType getErrorType() {
        return this.errorType;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    public final InternalPreChatField copy(String name, int order, PreChatLabels labels, PreChatFieldType type2, boolean required, int maxLength, String userInput, PreChatErrorType errorType, boolean isHidden, boolean isEditable) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(userInput, "userInput");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        return new InternalPreChatField(name, order, labels, type2, required, maxLength, userInput, errorType, isHidden, isEditable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalPreChatField)) {
            return false;
        }
        InternalPreChatField internalPreChatField = (InternalPreChatField) other;
        return Intrinsics.areEqual(this.name, internalPreChatField.name) && this.order == internalPreChatField.order && Intrinsics.areEqual(this.labels, internalPreChatField.labels) && this.type == internalPreChatField.type && this.required == internalPreChatField.required && this.maxLength == internalPreChatField.maxLength && Intrinsics.areEqual(this.userInput, internalPreChatField.userInput) && this.errorType == internalPreChatField.errorType && this.isHidden == internalPreChatField.isHidden && this.isEditable == internalPreChatField.isEditable;
    }

    public int hashCode() {
        return (((((((((((((((((this.name.hashCode() * 31) + Integer.hashCode(this.order)) * 31) + this.labels.hashCode()) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.required)) * 31) + Integer.hashCode(this.maxLength)) * 31) + this.userInput.hashCode()) * 31) + this.errorType.hashCode()) * 31) + Boolean.hashCode(this.isHidden)) * 31) + Boolean.hashCode(this.isEditable);
    }

    public String toString() {
        return "InternalPreChatField(name=" + this.name + ", order=" + this.order + ", labels=" + this.labels + ", type=" + this.type + ", required=" + this.required + ", maxLength=" + this.maxLength + ", userInput=" + this.userInput + ", errorType=" + this.errorType + ", isHidden=" + this.isHidden + ", isEditable=" + this.isEditable + ")";
    }

    public InternalPreChatField(String name, int i, PreChatLabels labels, PreChatFieldType type2, boolean z, int i2, String userInput, PreChatErrorType errorType, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(userInput, "userInput");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        this.name = name;
        this.order = i;
        this.labels = labels;
        this.type = type2;
        this.required = z;
        this.maxLength = i2;
        this.userInput = userInput;
        this.errorType = errorType;
        this.isHidden = z2;
        this.isEditable = z3;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.PreChatField
    public String getName() {
        return this.name;
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.PreChatField
    public int getOrder() {
        return this.order;
    }

    public /* synthetic */ InternalPreChatField(String str, int i, PreChatLabels preChatLabels, PreChatFieldType preChatFieldType, boolean z, int i2, String str2, PreChatErrorType preChatErrorType, boolean z2, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i3 & 4) != 0 ? new PreChatLabels(null, 1, null) : preChatLabels, preChatFieldType, z, i2, (i3 & 64) != 0 ? "" : str2, (i3 & 128) != 0 ? PreChatErrorType.None : preChatErrorType, (i3 & 256) != 0 ? false : z2, (i3 & 512) != 0 ? true : z3);
    }

    @Override // com.salesforce.android.smi.network.data.domain.prechat.PreChatField
    public PreChatLabels getLabels() {
        return this.labels;
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
        if (getUserInput().length() > getMaxLength()) {
            return PreChatErrorType.MaxLength;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[getType().ordinal()];
        if (i == 1) {
            return isValidEmail(getUserInput());
        }
        if (i == 2) {
            return isNumeric(getUserInput());
        }
        if (i == 3) {
            return isValidPhone(getUserInput());
        }
        if (i == 4) {
            return isValidCheckBox(getUserInput(), getRequired());
        }
        return PreChatErrorType.None;
    }

    private final PreChatErrorType isValidEmail(final String userInput) {
        return validateType(PreChatErrorType.EmailFormat, new Function0() { // from class: com.salesforce.android.smi.network.data.domain.prechat.InternalPreChatField$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(InternalPreChatField.isValidEmail$lambda$0(userInput));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isValidEmail$lambda$0(String str) {
        Pattern EMAIL_ADDRESS = PatternsCompat.EMAIL_ADDRESS;
        Intrinsics.checkNotNullExpressionValue(EMAIL_ADDRESS, "EMAIL_ADDRESS");
        return new Regex(EMAIL_ADDRESS).matches(str);
    }

    private final PreChatErrorType isValidPhone(final String userInput) {
        return validateType(PreChatErrorType.PhoneFormat, new Function0() { // from class: com.salesforce.android.smi.network.data.domain.prechat.InternalPreChatField$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(PhoneNumberUtils.isGlobalPhoneNumber(userInput));
            }
        });
    }

    private final PreChatErrorType isNumeric(final String userInput) {
        return validateType(PreChatErrorType.NumberFormat, new Function0() { // from class: com.salesforce.android.smi.network.data.domain.prechat.InternalPreChatField$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(InternalPreChatField.isNumeric$lambda$2(userInput));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isNumeric$lambda$2(String str) throws NumberFormatException {
        try {
            Double.parseDouble(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private final PreChatErrorType isValidCheckBox(final String userInput, final boolean required) {
        return validateType(PreChatErrorType.RequiredField, new Function0() { // from class: com.salesforce.android.smi.network.data.domain.prechat.InternalPreChatField$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(InternalPreChatField.isValidCheckBox$lambda$3(required, userInput));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isValidCheckBox$lambda$3(boolean z, String str) {
        return (z && Intrinsics.areEqual(str, "true")) || !z;
    }

    private final PreChatErrorType validateType(PreChatErrorType errorType, Function0<Boolean> predicate) {
        return predicate.invoke().booleanValue() ? PreChatErrorType.None : errorType;
    }
}
