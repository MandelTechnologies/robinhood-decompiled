package com.withpersona.sdk2.inquiry.p424ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.squareup.workflow1.p415ui.ViewShowRendering;
import com.withpersona.sdk2.inquiry.steps.p423ui.UiStepBottomSheet;
import com.withpersona.sdk2.inquiry.steps.p423ui.UiStepUtils6;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.SheetComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: NestedUiBottomSheetController.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/NestedUiBottomSheetController;", "", "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;", "sheetComponent", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "viewEnvironment", "", "show", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", "hide", "()V", "Landroid/view/ViewGroup;", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiStepBottomSheet;", "currentBottomSheet", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiStepBottomSheet;", "currentSheetComponent", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;", "getCurrentSheetComponent", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;", "setCurrentSheetComponent", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiScreenGenerationResult;", "getUiScreenGenerationResult", "()Lcom/withpersona/sdk2/inquiry/steps/ui/UiScreenGenerationResult;", "uiScreenGenerationResult", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class NestedUiBottomSheetController {
    private final ViewGroup contentView;
    private UiStepBottomSheet currentBottomSheet;
    private SheetComponent currentSheetComponent;

    public NestedUiBottomSheetController(ViewGroup contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.contentView = contentView;
    }

    public final UiStepUtils6 getUiScreenGenerationResult() {
        UiStepBottomSheet uiStepBottomSheet = this.currentBottomSheet;
        if (uiStepBottomSheet != null) {
            return uiStepBottomSheet.getUiScreenGenerationResult();
        }
        return null;
    }

    public final SheetComponent getCurrentSheetComponent() {
        return this.currentSheetComponent;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.withpersona.sdk2.inquiry.ui.NestedUiBottomSheetController$$ExternalSyntheticLambda0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, com.withpersona.sdk2.inquiry.ui.NestedUiBottomSheetController$$ExternalSyntheticLambda2] */
    public final void show(final SheetComponent sheetComponent, ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(sheetComponent, "sheetComponent");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        this.currentSheetComponent = sheetComponent;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.NestedUiBottomSheetController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        };
        UiStepBottomSheet uiStepBottomSheet = new UiStepBottomSheet(sheetComponent.getScreen(), CollectionsKt.emptyList(), new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.NestedUiBottomSheetController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NestedUiBottomSheetController.show$lambda$1(objectRef);
            }
        }, null, sheetComponent.getHideWhenTappedOutside());
        this.currentBottomSheet = uiStepBottomSheet;
        ViewFactory<UiStepBottomSheet> viewFactory = uiStepBottomSheet.getViewFactory();
        Context context = this.contentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final View viewBuildView = viewFactory.buildView(uiStepBottomSheet, viewEnvironment, context, this.contentView);
        this.contentView.addView(viewBuildView);
        ViewShowRendering.start(viewBuildView);
        objectRef.element = new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.NestedUiBottomSheetController$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NestedUiBottomSheetController.show$lambda$3(sheetComponent, this, viewBuildView);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit show$lambda$1(Ref.ObjectRef objectRef) {
        ((Function0) objectRef.element).invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit show$lambda$3(SheetComponent sheetComponent, NestedUiBottomSheetController nestedUiBottomSheetController, View view) {
        sheetComponent.setShown(true);
        sheetComponent.setShowing(false);
        nestedUiBottomSheetController.contentView.removeView(view);
        nestedUiBottomSheetController.currentSheetComponent = null;
        nestedUiBottomSheetController.currentBottomSheet = null;
        return Unit.INSTANCE;
    }

    public final void hide() {
        BottomSheetBehavior<?> bottomSheetBehavior;
        UiStepBottomSheet uiStepBottomSheet = this.currentBottomSheet;
        if (uiStepBottomSheet != null && (bottomSheetBehavior = uiStepBottomSheet.getBottomSheetBehavior()) != null) {
            bottomSheetBehavior.setState(5);
        }
        this.currentSheetComponent = null;
    }
}
