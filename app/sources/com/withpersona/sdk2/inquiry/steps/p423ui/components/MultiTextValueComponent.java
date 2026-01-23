package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.SelectedOptionsController;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MultiTextValueComponent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u001d\u0010\u0007\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/MultiTextValueComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "T", "", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "selectedOptions", "update", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/SelectedOptionsController;", "getSelectedOptionsController", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/SelectedOptionsController;", "selectedOptionsController", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface MultiTextValueComponent<T extends UiComponent> {
    SelectedOptionsController getSelectedOptionsController();

    T update(List<Option> selectedOptions);
}
