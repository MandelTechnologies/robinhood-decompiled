package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.view.View;
import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.inquiry.steps.p423ui.UiComponentScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreatePersonaSheetComponent.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m3636d2 = {"updateComponent", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "old", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "new", "makeView", "Landroid/view/View;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class CreatePersonaSheetComponent2 {
    public static final View makeView(CreatePersonaSheetComponent createPersonaSheetComponent, UiComponentHelper uiComponentHelper) {
        Intrinsics.checkNotNullParameter(createPersonaSheetComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        return null;
    }

    public static final CreatePersonaSheetComponent updateComponent(CreatePersonaSheetComponent createPersonaSheetComponent, UiComponent old, UiComponent uiComponent) {
        Intrinsics.checkNotNullParameter(createPersonaSheetComponent, "<this>");
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(uiComponent, "new");
        UiComponentScreen screen = createPersonaSheetComponent.getScreen();
        List<UiComponent> components = createPersonaSheetComponent.getScreen().getComponents();
        return CreatePersonaSheetComponent.copy$default(createPersonaSheetComponent, null, null, null, false, false, false, false, UiComponentScreen.copy$default(screen, components != null ? UiComponent3.updateComponent(components, old, uiComponent) : null, null, null, 6, null), EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }
}
