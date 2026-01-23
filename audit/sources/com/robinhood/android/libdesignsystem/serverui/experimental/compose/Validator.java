package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiStateHandler.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/Validator;", "", "errorMessage", "", "validationType", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ValidationType;", "onValidate", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ValidationType;Lkotlin/jvm/functions/Function0;)V", "getErrorMessage", "()Ljava/lang/String;", "getValidationType", "()Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ValidationType;", "getOnValidate", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Validator {
    public static final int $stable = 0;
    private final String errorMessage;
    private final Function0<Boolean> onValidate;
    private final SduiStateHandler4 validationType;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Validator copy$default(Validator validator, String str, SduiStateHandler4 sduiStateHandler4, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validator.errorMessage;
        }
        if ((i & 2) != 0) {
            sduiStateHandler4 = validator.validationType;
        }
        if ((i & 4) != 0) {
            function0 = validator.onValidate;
        }
        return validator.copy(str, sduiStateHandler4, function0);
    }

    /* renamed from: component1, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final SduiStateHandler4 getValidationType() {
        return this.validationType;
    }

    public final Function0<Boolean> component3() {
        return this.onValidate;
    }

    public final Validator copy(String errorMessage, SduiStateHandler4 validationType, Function0<Boolean> onValidate) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(validationType, "validationType");
        Intrinsics.checkNotNullParameter(onValidate, "onValidate");
        return new Validator(errorMessage, validationType, onValidate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Validator)) {
            return false;
        }
        Validator validator = (Validator) other;
        return Intrinsics.areEqual(this.errorMessage, validator.errorMessage) && this.validationType == validator.validationType && Intrinsics.areEqual(this.onValidate, validator.onValidate);
    }

    public int hashCode() {
        return (((this.errorMessage.hashCode() * 31) + this.validationType.hashCode()) * 31) + this.onValidate.hashCode();
    }

    public String toString() {
        return "Validator(errorMessage=" + this.errorMessage + ", validationType=" + this.validationType + ", onValidate=" + this.onValidate + ")";
    }

    public Validator(String errorMessage, SduiStateHandler4 validationType, Function0<Boolean> onValidate) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(validationType, "validationType");
        Intrinsics.checkNotNullParameter(onValidate, "onValidate");
        this.errorMessage = errorMessage;
        this.validationType = validationType;
        this.onValidate = onValidate;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final SduiStateHandler4 getValidationType() {
        return this.validationType;
    }

    public final Function0<Boolean> getOnValidate() {
        return this.onValidate;
    }
}
