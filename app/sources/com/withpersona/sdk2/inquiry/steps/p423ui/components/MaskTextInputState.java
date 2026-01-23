package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: InputMaskedTextComponent.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/MaskTextInputState;", "", "", "prefill", "mask", "", "secure", AnnotatedPrivateKey.LABEL, "placeholder", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPrefill", "getMask", "Ljava/lang/Boolean;", "getSecure", "()Ljava/lang/Boolean;", "getLabel", "getPlaceholder", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class MaskTextInputState {
    private final String label;
    private final String mask;
    private final String placeholder;
    private final String prefill;
    private final Boolean secure;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaskTextInputState)) {
            return false;
        }
        MaskTextInputState maskTextInputState = (MaskTextInputState) other;
        return Intrinsics.areEqual(this.prefill, maskTextInputState.prefill) && Intrinsics.areEqual(this.mask, maskTextInputState.mask) && Intrinsics.areEqual(this.secure, maskTextInputState.secure) && Intrinsics.areEqual(this.label, maskTextInputState.label) && Intrinsics.areEqual(this.placeholder, maskTextInputState.placeholder);
    }

    public int hashCode() {
        String str = this.prefill;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mask;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.secure;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.label;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.placeholder;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "MaskTextInputState(prefill=" + this.prefill + ", mask=" + this.mask + ", secure=" + this.secure + ", label=" + this.label + ", placeholder=" + this.placeholder + ")";
    }

    public MaskTextInputState(String str, String str2, Boolean bool, String str3, String str4) {
        this.prefill = str;
        this.mask = str2;
        this.secure = bool;
        this.label = str3;
        this.placeholder = str4;
    }

    public final String getPrefill() {
        return this.prefill;
    }

    public final String getMask() {
        return this.mask;
    }

    public final Boolean getSecure() {
        return this.secure;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }
}
