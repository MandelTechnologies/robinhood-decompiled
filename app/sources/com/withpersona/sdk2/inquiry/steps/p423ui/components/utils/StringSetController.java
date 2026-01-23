package com.withpersona.sdk2.inquiry.steps.p423ui.components.utils;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: StringSetController.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/StringSetController;", "", "", "", "initialValue", "<init>", "(Ljava/util/Set;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_stringSetValue", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/Flow;", "onChanged", "Lkotlinx/coroutines/flow/Flow;", "getOnChanged", "()Lkotlinx/coroutines/flow/Flow;", "value", "getValue", "()Ljava/util/Set;", "setValue", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class StringSetController {
    private final StateFlow2<Set<String>> _stringSetValue;
    private final Flow<Set<String>> onChanged;

    public StringSetController(Set<String> initialValue) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        StateFlow2<Set<String>> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(initialValue);
        this._stringSetValue = stateFlow2MutableStateFlow;
        this.onChanged = FlowKt.drop(stateFlow2MutableStateFlow, 1);
    }

    public final Flow<Set<String>> getOnChanged() {
        return this.onChanged;
    }

    public final Set<String> getValue() {
        return this._stringSetValue.getValue();
    }

    public final void setValue(Set<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._stringSetValue.setValue(value);
    }
}
