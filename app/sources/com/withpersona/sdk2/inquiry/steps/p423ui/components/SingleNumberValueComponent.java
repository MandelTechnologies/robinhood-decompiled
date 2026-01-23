package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.NumberController;
import kotlin.Metadata;

/* compiled from: SingleNumberValueComponent.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0004\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0017\u0010\b\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nH&¢\u0006\u0002\u0010\u000bR\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/SingleNumberValueComponent;", "T", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "", "numberController", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/NumberController;", "getNumberController", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/NumberController;", "update", "newValue", "", "(Ljava/lang/Number;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface SingleNumberValueComponent<T extends UiComponent> {
    NumberController getNumberController();

    T update(Number newValue);
}
