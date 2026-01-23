package com.robinhood.compose.bento.component;

import androidx.compose.foundation.text.KeyboardOptions;
import com.robinhood.compose.bento.component.BentoTextInput8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: BentoTextInput.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\t\u0010(\u001a\u00020\u000fHÆ\u0003Jo\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020\u000f2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoTextInputState;", "", "value", "", AnnotatedPrivateKey.LABEL, "placeholder", "hint", "message", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Message;", "leadingIcon", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;", "trailingIcon", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "enabled", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/compose/bento/component/BentoTextInputs$Message;Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;Landroidx/compose/foundation/text/KeyboardOptions;Z)V", "getValue", "()Ljava/lang/String;", "getLabel", "getPlaceholder", "getHint", "getMessage", "()Lcom/robinhood/compose/bento/component/BentoTextInputs$Message;", "getLeadingIcon", "()Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;", "getTrailingIcon", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;", "getEnabled", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BentoTextInputState {
    public static final int $stable = 0;
    private final boolean enabled;
    private final String hint;
    private final KeyboardOptions keyboardOptions;
    private final String label;
    private final BentoTextInput8.Icon.Size24 leadingIcon;
    private final BentoTextInput8.Message message;
    private final String placeholder;
    private final BentoTextInput8.Icon.Size24 trailingIcon;
    private final String value;

    public static /* synthetic */ BentoTextInputState copy$default(BentoTextInputState bentoTextInputState, String str, String str2, String str3, String str4, BentoTextInput8.Message message, BentoTextInput8.Icon.Size24 size24, BentoTextInput8.Icon.Size24 size242, KeyboardOptions keyboardOptions, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bentoTextInputState.value;
        }
        if ((i & 2) != 0) {
            str2 = bentoTextInputState.label;
        }
        if ((i & 4) != 0) {
            str3 = bentoTextInputState.placeholder;
        }
        if ((i & 8) != 0) {
            str4 = bentoTextInputState.hint;
        }
        if ((i & 16) != 0) {
            message = bentoTextInputState.message;
        }
        if ((i & 32) != 0) {
            size24 = bentoTextInputState.leadingIcon;
        }
        if ((i & 64) != 0) {
            size242 = bentoTextInputState.trailingIcon;
        }
        if ((i & 128) != 0) {
            keyboardOptions = bentoTextInputState.keyboardOptions;
        }
        if ((i & 256) != 0) {
            z = bentoTextInputState.enabled;
        }
        KeyboardOptions keyboardOptions2 = keyboardOptions;
        boolean z2 = z;
        BentoTextInput8.Icon.Size24 size243 = size24;
        BentoTextInput8.Icon.Size24 size244 = size242;
        BentoTextInput8.Message message2 = message;
        String str5 = str3;
        return bentoTextInputState.copy(str, str2, str5, str4, message2, size243, size244, keyboardOptions2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component4, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* renamed from: component5, reason: from getter */
    public final BentoTextInput8.Message getMessage() {
        return this.message;
    }

    /* renamed from: component6, reason: from getter */
    public final BentoTextInput8.Icon.Size24 getLeadingIcon() {
        return this.leadingIcon;
    }

    /* renamed from: component7, reason: from getter */
    public final BentoTextInput8.Icon.Size24 getTrailingIcon() {
        return this.trailingIcon;
    }

    /* renamed from: component8, reason: from getter */
    public final KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final BentoTextInputState copy(String value, String label, String placeholder, String hint, BentoTextInput8.Message message, BentoTextInput8.Icon.Size24 leadingIcon, BentoTextInput8.Icon.Size24 trailingIcon, KeyboardOptions keyboardOptions, boolean enabled) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(keyboardOptions, "keyboardOptions");
        return new BentoTextInputState(value, label, placeholder, hint, message, leadingIcon, trailingIcon, keyboardOptions, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BentoTextInputState)) {
            return false;
        }
        BentoTextInputState bentoTextInputState = (BentoTextInputState) other;
        return Intrinsics.areEqual(this.value, bentoTextInputState.value) && Intrinsics.areEqual(this.label, bentoTextInputState.label) && Intrinsics.areEqual(this.placeholder, bentoTextInputState.placeholder) && Intrinsics.areEqual(this.hint, bentoTextInputState.hint) && Intrinsics.areEqual(this.message, bentoTextInputState.message) && Intrinsics.areEqual(this.leadingIcon, bentoTextInputState.leadingIcon) && Intrinsics.areEqual(this.trailingIcon, bentoTextInputState.trailingIcon) && Intrinsics.areEqual(this.keyboardOptions, bentoTextInputState.keyboardOptions) && this.enabled == bentoTextInputState.enabled;
    }

    public int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        String str = this.label;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placeholder;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hint;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BentoTextInput8.Message message = this.message;
        int iHashCode5 = (iHashCode4 + (message == null ? 0 : message.hashCode())) * 31;
        BentoTextInput8.Icon.Size24 size24 = this.leadingIcon;
        int iHashCode6 = (iHashCode5 + (size24 == null ? 0 : size24.hashCode())) * 31;
        BentoTextInput8.Icon.Size24 size242 = this.trailingIcon;
        return ((((iHashCode6 + (size242 != null ? size242.hashCode() : 0)) * 31) + this.keyboardOptions.hashCode()) * 31) + Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return "BentoTextInputState(value=" + this.value + ", label=" + this.label + ", placeholder=" + this.placeholder + ", hint=" + this.hint + ", message=" + this.message + ", leadingIcon=" + this.leadingIcon + ", trailingIcon=" + this.trailingIcon + ", keyboardOptions=" + this.keyboardOptions + ", enabled=" + this.enabled + ")";
    }

    public BentoTextInputState(String value, String str, String str2, String str3, BentoTextInput8.Message message, BentoTextInput8.Icon.Size24 size24, BentoTextInput8.Icon.Size24 size242, KeyboardOptions keyboardOptions, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(keyboardOptions, "keyboardOptions");
        this.value = value;
        this.label = str;
        this.placeholder = str2;
        this.hint = str3;
        this.message = message;
        this.leadingIcon = size24;
        this.trailingIcon = size242;
        this.keyboardOptions = keyboardOptions;
        this.enabled = z;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getHint() {
        return this.hint;
    }

    public final BentoTextInput8.Message getMessage() {
        return this.message;
    }

    public final BentoTextInput8.Icon.Size24 getLeadingIcon() {
        return this.leadingIcon;
    }

    public final BentoTextInput8.Icon.Size24 getTrailingIcon() {
        return this.trailingIcon;
    }

    public /* synthetic */ BentoTextInputState(String str, String str2, String str3, String str4, BentoTextInput8.Message message, BentoTextInput8.Icon.Size24 size24, BentoTextInput8.Icon.Size24 size242, KeyboardOptions keyboardOptions, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : message, (i & 32) != 0 ? null : size24, (i & 64) != 0 ? null : size242, (i & 128) != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions, (i & 256) != 0 ? true : z);
    }

    public final KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }
}
