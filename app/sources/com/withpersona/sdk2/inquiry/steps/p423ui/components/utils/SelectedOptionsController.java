package com.withpersona.sdk2.inquiry.steps.p423ui.components.utils;

import com.withpersona.sdk2.inquiry.steps.p423ui.components.Option;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: SelectedOptionsController.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0007R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/SelectedOptionsController;", "", "initialValue", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "<init>", "(Ljava/util/List;)V", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)V", "_selectedOptionsValue", "Lkotlinx/coroutines/flow/MutableStateFlow;", "onChanged", "Lkotlinx/coroutines/flow/Flow;", "getOnChanged", "()Lkotlinx/coroutines/flow/Flow;", "value", "getValue", "()Ljava/util/List;", "setValue", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SelectedOptionsController {
    private final StateFlow2<List<Option>> _selectedOptionsValue;
    private final Flow<List<Option>> onChanged;

    public SelectedOptionsController(List<Option> initialValue) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        StateFlow2<List<Option>> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(initialValue);
        this._selectedOptionsValue = stateFlow2MutableStateFlow;
        this.onChanged = FlowKt.drop(stateFlow2MutableStateFlow, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SelectedOptionsController(Option option) {
        List listListOf;
        if (option == null) {
            listListOf = CollectionsKt.emptyList();
        } else {
            listListOf = CollectionsKt.listOf(option);
        }
        this((List<Option>) listListOf);
    }

    public final Flow<List<Option>> getOnChanged() {
        return this.onChanged;
    }

    public final List<Option> getValue() {
        return this._selectedOptionsValue.getValue();
    }

    public final void setValue(List<Option> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._selectedOptionsValue.setValue(value);
    }
}
