package com.squareup.workflow1.p415ui;

import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: TextController.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bg\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/squareup/workflow1/ui/TextController;", "", "onTextChanged", "Lkotlinx/coroutines/flow/Flow;", "", "getOnTextChanged", "()Lkotlinx/coroutines/flow/Flow;", "textValue", "getTextValue", "()Ljava/lang/String;", "setTextValue", "(Ljava/lang/String;)V", "wf1-core-common"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface TextController {
    Flow<String> getOnTextChanged();

    String getTextValue();

    void setTextValue(String str);
}
