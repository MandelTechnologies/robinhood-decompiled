package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiStateHandler.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bJ\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u001b\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\nHÆ\u0003JK\u0010\u0019\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R#\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ComponentValidation;", "", "validators", "", "", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/Validator;", "onValidationSuccess", "Lkotlin/Function0;", "", "onValidationFailure", "Lkotlin/Function2;", "", "<init>", "(Ljava/util/Map;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "getValidators", "()Ljava/util/Map;", "getOnValidationSuccess", "()Lkotlin/jvm/functions/Function0;", "getOnValidationFailure", "()Lkotlin/jvm/functions/Function2;", "validateComponent", "showError", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final /* data */ class ComponentValidation {
    public static final int $stable = 8;
    private final Function2<Validator, Boolean, Unit> onValidationFailure;
    private final Function0<Unit> onValidationSuccess;
    private final Map<String, Validator> validators;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComponentValidation copy$default(ComponentValidation componentValidation, Map map, Function0 function0, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = componentValidation.validators;
        }
        if ((i & 2) != 0) {
            function0 = componentValidation.onValidationSuccess;
        }
        if ((i & 4) != 0) {
            function2 = componentValidation.onValidationFailure;
        }
        return componentValidation.copy(map, function0, function2);
    }

    public final Map<String, Validator> component1() {
        return this.validators;
    }

    public final Function0<Unit> component2() {
        return this.onValidationSuccess;
    }

    public final Function2<Validator, Boolean, Unit> component3() {
        return this.onValidationFailure;
    }

    public final ComponentValidation copy(Map<String, Validator> validators, Function0<Unit> onValidationSuccess, Function2<? super Validator, ? super Boolean, Unit> onValidationFailure) {
        Intrinsics.checkNotNullParameter(validators, "validators");
        Intrinsics.checkNotNullParameter(onValidationSuccess, "onValidationSuccess");
        Intrinsics.checkNotNullParameter(onValidationFailure, "onValidationFailure");
        return new ComponentValidation(validators, onValidationSuccess, onValidationFailure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComponentValidation)) {
            return false;
        }
        ComponentValidation componentValidation = (ComponentValidation) other;
        return Intrinsics.areEqual(this.validators, componentValidation.validators) && Intrinsics.areEqual(this.onValidationSuccess, componentValidation.onValidationSuccess) && Intrinsics.areEqual(this.onValidationFailure, componentValidation.onValidationFailure);
    }

    public int hashCode() {
        return (((this.validators.hashCode() * 31) + this.onValidationSuccess.hashCode()) * 31) + this.onValidationFailure.hashCode();
    }

    public String toString() {
        return "ComponentValidation(validators=" + this.validators + ", onValidationSuccess=" + this.onValidationSuccess + ", onValidationFailure=" + this.onValidationFailure + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComponentValidation(Map<String, Validator> validators, Function0<Unit> onValidationSuccess, Function2<? super Validator, ? super Boolean, Unit> onValidationFailure) {
        Intrinsics.checkNotNullParameter(validators, "validators");
        Intrinsics.checkNotNullParameter(onValidationSuccess, "onValidationSuccess");
        Intrinsics.checkNotNullParameter(onValidationFailure, "onValidationFailure");
        this.validators = validators;
        this.onValidationSuccess = onValidationSuccess;
        this.onValidationFailure = onValidationFailure;
    }

    public final Map<String, Validator> getValidators() {
        return this.validators;
    }

    public final Function0<Unit> getOnValidationSuccess() {
        return this.onValidationSuccess;
    }

    public final Function2<Validator, Boolean, Unit> getOnValidationFailure() {
        return this.onValidationFailure;
    }

    public final boolean validateComponent(boolean showError) {
        Object next;
        Iterator<T> it = this.validators.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!((Validator) next).getOnValidate().invoke().booleanValue()) {
                break;
            }
        }
        Validator validator = (Validator) next;
        boolean z = validator == null;
        if (validator == null) {
            this.onValidationSuccess.invoke();
            return z;
        }
        this.onValidationFailure.invoke(validator, Boolean.valueOf(showError));
        return z;
    }
}
