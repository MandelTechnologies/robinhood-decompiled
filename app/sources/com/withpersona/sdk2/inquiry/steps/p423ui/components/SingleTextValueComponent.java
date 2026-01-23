package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import com.squareup.workflow1.p415ui.TextController;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent;
import kotlin.Metadata;

/* compiled from: SingleTextValueComponent.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\fH&¢\u0006\u0002\u0010\rR\u0018\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/SingleTextValueComponent;", "T", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "", "textController", "Lcom/squareup/workflow1/ui/TextController;", "getTextController$annotations", "()V", "getTextController", "()Lcom/squareup/workflow1/ui/TextController;", "update", "newString", "", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface SingleTextValueComponent<T extends UiComponent> {
    TextController getTextController();

    T update(String newString);
}
