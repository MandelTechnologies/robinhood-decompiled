package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.DateController;
import kotlin.Metadata;

/* compiled from: DateValueComponent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0019\u0010\u0006\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\r\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/DateValueComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "T", "", "", "newDate", "update", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/DateController;", "getDateController", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/DateController;", "setDateController", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/DateController;)V", "dateController", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface DateValueComponent<T extends UiComponent> {
    DateController getDateController();

    T update(String newDate);
}
