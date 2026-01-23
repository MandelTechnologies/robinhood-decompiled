package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.robinhood.models.serverdriven.experimental.api.ComponentState;
import com.robinhood.models.serverdriven.experimental.api.StateReference;
import com.robinhood.models.serverdriven.experimental.extensions.ComponentStates;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiStateHandler.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B+\u0012\"\b\u0002\u0010\u0002\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010J\u0016\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0005J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005J\u0014\u0010\u001c\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eJ\u0018\u0010 \u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u0019J\u001e\u0010\"\u001a\u00020\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e2\b\b\u0002\u0010!\u001a\u00020\u0019J\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004R(\u0010\u0002\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/StateHandler;", "", "onStateChange", "Lkotlin/Function1;", "", "", "Lcom/robinhood/models/serverdriven/experimental/api/ComponentState;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "_states", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "states", "getStates", "()Ljava/util/Map;", "validationBindings", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ComponentValidation;", "register", "identifier", "initialState", "validationBinding", "setState", "state", "remove", "validate", "", "componentId", "stateId", "validateStateReferences", "references", "", "Lcom/robinhood/models/serverdriven/experimental/api/StateReference;", "validateComponent", "showError", "validateComponents", "componentIds", "serverValueStates", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.StateHandler, reason: use source file name */
/* loaded from: classes17.dex */
public final class SduiStateHandler3 {
    public static final int $stable = 0;
    private final SnapshotStateMap<String, ComponentState> _states;
    private final Function1<Map<String, ? extends ComponentState>, Unit> onStateChange;
    private final SnapshotStateMap<String, ComponentValidation> validationBindings;

    /* JADX WARN: Multi-variable type inference failed */
    public SduiStateHandler3() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SduiStateHandler3(Function1<? super Map<String, ? extends ComponentState>, Unit> function1) {
        this.onStateChange = function1;
        this._states = SnapshotStateKt.mutableStateMapOf();
        this.validationBindings = SnapshotStateKt.mutableStateMapOf();
    }

    public /* synthetic */ SduiStateHandler3(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    public final Map<String, ComponentState> getStates() {
        return this._states;
    }

    public static /* synthetic */ void register$default(SduiStateHandler3 sduiStateHandler3, String str, ComponentState componentState, ComponentValidation componentValidation, int i, Object obj) {
        if ((i & 4) != 0) {
            componentValidation = null;
        }
        sduiStateHandler3.register(str, componentState, componentValidation);
    }

    public final void register(String identifier, ComponentState initialState, ComponentValidation validationBinding) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this._states.put(identifier, initialState);
        if (validationBinding != null) {
            this.validationBindings.put(identifier, validationBinding);
        }
    }

    public final synchronized void setState(String identifier, ComponentState state) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(state, "state");
        this._states.put(identifier, state);
        Function1<Map<String, ? extends ComponentState>, Unit> function1 = this.onStateChange;
        if (function1 != null) {
            function1.invoke(this._states);
        }
    }

    public final synchronized void remove(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this._states.remove(identifier);
        this.validationBindings.remove(identifier);
        Function1<Map<String, ? extends ComponentState>, Unit> function1 = this.onStateChange;
        if (function1 != null) {
            function1.invoke(this._states);
        }
    }

    public final boolean validate(String componentId, String stateId) {
        Function0<Boolean> onValidate;
        Map<String, Validator> validators;
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        ComponentValidation componentValidation = this.validationBindings.get(componentId);
        Validator validator = (componentValidation == null || (validators = componentValidation.getValidators()) == null) ? null : validators.get(stateId);
        if (validator == null || (onValidate = validator.getOnValidate()) == null) {
            return true;
        }
        return onValidate.invoke().booleanValue();
    }

    public final boolean validateStateReferences(List<StateReference> references) {
        Map<String, Validator> validators;
        Validator validator;
        Function0<Boolean> onValidate;
        Intrinsics.checkNotNullParameter(references, "references");
        List<StateReference> list = references;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (StateReference stateReference : list) {
            String component_id = stateReference.getComponent_id();
            String state_id = stateReference.getState_id();
            ComponentValidation componentValidation = this.validationBindings.get(component_id);
            if (!((componentValidation == null || (validators = componentValidation.getValidators()) == null || (validator = validators.get(state_id)) == null || (onValidate = validator.getOnValidate()) == null) ? false : onValidate.invoke().booleanValue())) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean validateComponent$default(SduiStateHandler3 sduiStateHandler3, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return sduiStateHandler3.validateComponent(str, z);
    }

    public final boolean validateComponent(String componentId, boolean showError) {
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        ComponentValidation componentValidation = this.validationBindings.get(componentId);
        if (componentValidation != null) {
            return componentValidation.validateComponent(showError);
        }
        return true;
    }

    public static /* synthetic */ boolean validateComponents$default(SduiStateHandler3 sduiStateHandler3, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return sduiStateHandler3.validateComponents(list, z);
    }

    public final boolean validateComponents(List<String> componentIds, boolean showError) {
        Intrinsics.checkNotNullParameter(componentIds, "componentIds");
        List<String> list = componentIds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!validateComponent((String) it.next(), showError)) {
                return false;
            }
        }
        return true;
    }

    public final Map<String, Object> serverValueStates() {
        Map<String, ComponentState> states = getStates();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(states.size()));
        Iterator<T> it = states.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ComponentStates.toServerValue((ComponentState) entry.getValue()));
        }
        return linkedHashMap;
    }
}
