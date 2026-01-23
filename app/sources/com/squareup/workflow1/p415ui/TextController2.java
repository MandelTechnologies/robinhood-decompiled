package com.squareup.workflow1.p415ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: TextController.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR$\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004¨\u0006\u0010"}, m3636d2 = {"Lcom/squareup/workflow1/ui/TextControllerImpl;", "Lcom/squareup/workflow1/ui/TextController;", "initialValue", "", "(Ljava/lang/String;)V", "_textValue", "Lkotlinx/coroutines/flow/MutableStateFlow;", "onTextChanged", "Lkotlinx/coroutines/flow/Flow;", "getOnTextChanged", "()Lkotlinx/coroutines/flow/Flow;", "value", "textValue", "getTextValue", "()Ljava/lang/String;", "setTextValue", "wf1-core-common"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.ui.TextControllerImpl, reason: use source file name */
/* loaded from: classes12.dex */
final class TextController2 implements TextController {
    private final StateFlow2<String> _textValue;
    private final Flow<String> onTextChanged;

    public TextController2(String initialValue) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        StateFlow2<String> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(initialValue);
        this._textValue = stateFlow2MutableStateFlow;
        this.onTextChanged = FlowKt.drop(stateFlow2MutableStateFlow, 1);
    }

    @Override // com.squareup.workflow1.p415ui.TextController
    public Flow<String> getOnTextChanged() {
        return this.onTextChanged;
    }

    @Override // com.squareup.workflow1.p415ui.TextController
    public String getTextValue() {
        return this._textValue.getValue();
    }

    @Override // com.squareup.workflow1.p415ui.TextController
    public void setTextValue(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._textValue.setValue(value);
    }
}
