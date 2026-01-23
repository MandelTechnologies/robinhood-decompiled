package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.squareup.workflow1.p415ui.AndroidViewRendering;
import com.squareup.workflow1.p415ui.LayoutRunner;
import com.squareup.workflow1.p415ui.ViewBindingViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2GenericUiStepScreenBinding;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationUtils2;
import com.withpersona.sdk2.inquiry.shared.p422ui.InsetsUtils;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiControllerUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.ComponentView;
import com.withpersona.sdk2.inquiry.steps.p423ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.p423ui.UiStepUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.UiStepUtils6;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DocumentInstructionsView.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002BY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012$\u0010\u000b\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00060\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010!\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001f¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R5\u0010\u000b\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b1\u00100R&\u00103\u001a\b\u0012\u0004\u0012\u00020\u0000028\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u00108\u001a\u0004\b5\u00106¨\u00069"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentInstructionsView;", "Lcom/squareup/workflow1/ui/AndroidViewRendering;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "uiScreen", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "", "componentNamesToActions", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "onBack", "onCancel", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;", "binding", "rendering", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "viewEnvironment", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/ComponentView;", "componentNameToComponentView", "showRendering", "(Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;Lcom/withpersona/sdk2/inquiry/document/DocumentInstructionsView;Lcom/squareup/workflow1/ui/ViewEnvironment;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "getUiScreen", "()Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "Ljava/util/List;", "getComponentNamesToActions", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "getNavigationState", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Lkotlin/jvm/functions/Function0;", "getOnBack", "()Lkotlin/jvm/functions/Function0;", "getOnCancel", "Lcom/squareup/workflow1/ui/ViewFactory;", "viewFactory", "Lcom/squareup/workflow1/ui/ViewFactory;", "getViewFactory", "()Lcom/squareup/workflow1/ui/ViewFactory;", "getViewFactory$annotations", "()V", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class DocumentInstructionsView implements AndroidViewRendering<DocumentInstructionsView>, Parcelable {
    public static final Parcelable.Creator<DocumentInstructionsView> CREATOR = new Creator();
    private final List<Tuples2<String, Function1<UiComponent, Unit>>> componentNamesToActions;
    private final NavigationState navigationState;
    private final Function0<Unit> onBack;
    private final Function0<Unit> onCancel;
    private final UiComponentScreen uiScreen;
    private final ViewFactory<DocumentInstructionsView> viewFactory;

    /* compiled from: DocumentInstructionsView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<DocumentInstructionsView> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DocumentInstructionsView createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            UiComponentScreen uiComponentScreen = (UiComponentScreen) parcel.readParcelable(DocumentInstructionsView.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readSerializable());
            }
            return new DocumentInstructionsView(uiComponentScreen, arrayList, (NavigationState) parcel.readParcelable(DocumentInstructionsView.class.getClassLoader()), (Function0) parcel.readSerializable(), (Function0) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DocumentInstructionsView[] newArray(int i) {
            return new DocumentInstructionsView[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.uiScreen, flags);
        List<Tuples2<String, Function1<UiComponent, Unit>>> list = this.componentNamesToActions;
        dest.writeInt(list.size());
        Iterator<Tuples2<String, Function1<UiComponent, Unit>>> it = list.iterator();
        while (it.hasNext()) {
            dest.writeSerializable(it.next());
        }
        dest.writeParcelable(this.navigationState, flags);
        dest.writeSerializable((Serializable) this.onBack);
        dest.writeSerializable((Serializable) this.onCancel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DocumentInstructionsView(final UiComponentScreen uiScreen, List<? extends Tuples2<String, ? extends Function1<? super UiComponent, Unit>>> componentNamesToActions, NavigationState navigationState, Function0<Unit> onBack, Function0<Unit> onCancel) {
        Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
        Intrinsics.checkNotNullParameter(componentNamesToActions, "componentNamesToActions");
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        this.uiScreen = uiScreen;
        this.componentNamesToActions = componentNamesToActions;
        this.navigationState = navigationState;
        this.onBack = onBack;
        this.onCancel = onCancel;
        UiStepUtils uiStepUtils = UiStepUtils.INSTANCE;
        final Function2 function2 = new Function2() { // from class: com.withpersona.sdk2.inquiry.document.DocumentInstructionsView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DocumentInstructionsView.viewFactory$lambda$0((Pi2GenericUiStepScreenBinding) obj, (Map) obj2);
            }
        };
        final DocumentInstructionsView2 documentInstructionsView2 = new DocumentInstructionsView2(this);
        LayoutRunner.Companion companion = LayoutRunner.INSTANCE;
        final boolean z = true;
        this.viewFactory = new ViewBindingViewFactory(Reflection.getOrCreateKotlinClass(DocumentInstructionsView.class), UiStepUtils2.INSTANCE, new Function1<Pi2GenericUiStepScreenBinding, LayoutRunner<DocumentInstructionsView>>() { // from class: com.withpersona.sdk2.inquiry.document.DocumentInstructionsView$special$$inlined$getViewFactoryForScreen$default$2
            @Override // kotlin.jvm.functions.Function1
            public final LayoutRunner<DocumentInstructionsView> invoke(final Pi2GenericUiStepScreenBinding binding) {
                Intrinsics.checkNotNullParameter(binding, "binding");
                final UiStepUtils6 uiStepUtils6 = UiStepUtils.INSTANCE.setupViewsForNestedUiStep(binding, uiScreen, function2, z);
                final UiComponentScreen uiComponentScreen = uiScreen;
                final Function4 function4 = documentInstructionsView2;
                return new LayoutRunner() { // from class: com.withpersona.sdk2.inquiry.document.DocumentInstructionsView$special$$inlined$getViewFactoryForScreen$default$2.1
                    @Override // com.squareup.workflow1.p415ui.LayoutRunner
                    public final void showRendering(RenderingT rendering, ViewEnvironment viewEnvironment) {
                        Intrinsics.checkNotNullParameter(rendering, "rendering");
                        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
                        Integer backgroundColor = uiComponentScreen.getBackgroundColor();
                        if (backgroundColor != null) {
                            Pi2GenericUiStepScreenBinding pi2GenericUiStepScreenBinding = binding;
                            int iIntValue = backgroundColor.intValue();
                            pi2GenericUiStepScreenBinding.getRoot().setBackgroundColor(iIntValue);
                            SystemUiControllerUtils.updateSystemUiColor(viewEnvironment, iIntValue);
                        }
                        UiComponentScreen uiComponentScreen2 = uiComponentScreen;
                        Context context = binding.getRoot().getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        Drawable drawableBackgroundImageDrawable = uiComponentScreen2.backgroundImageDrawable(context);
                        if (drawableBackgroundImageDrawable != null) {
                            Pi2GenericUiStepScreenBinding pi2GenericUiStepScreenBinding2 = binding;
                            pi2GenericUiStepScreenBinding2.getRoot().setBackground(drawableBackgroundImageDrawable);
                            pi2GenericUiStepScreenBinding2.footerContainer.setBackgroundColor(0);
                        }
                        Function4 function42 = function4;
                        Pi2GenericUiStepScreenBinding pi2GenericUiStepScreenBinding3 = binding;
                        Intrinsics.checkNotNull(pi2GenericUiStepScreenBinding3);
                        function42.invoke(pi2GenericUiStepScreenBinding3, rendering, viewEnvironment, uiStepUtils6.getViewBindings().getComponentNameToComponentView());
                    }
                };
            }
        });
    }

    @Override // com.squareup.workflow1.p415ui.AndroidViewRendering
    public ViewFactory<DocumentInstructionsView> getViewFactory() {
        return this.viewFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit viewFactory$lambda$0(Pi2GenericUiStepScreenBinding binding, Map map) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        InsetsUtils.applyInsetsAsPadding$default(root, false, false, false, false, 15, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRendering(Pi2GenericUiStepScreenBinding binding, final DocumentInstructionsView rendering, ViewEnvironment viewEnvironment, Map<String, ComponentView> componentNameToComponentView) {
        for (Tuples2<String, Function1<UiComponent, Unit>> tuples2 : this.componentNamesToActions) {
            String first = tuples2.getFirst();
            final Function1<UiComponent, Unit> second = tuples2.getSecond();
            final ComponentView componentView = componentNameToComponentView.get(first);
            if (componentView != null) {
                componentView.getView().setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.document.DocumentInstructionsView$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        DocumentInstructionsView.showRendering$lambda$5$lambda$2$lambda$1(second, componentView, view);
                    }
                });
            }
        }
        NavigationState navigationState = rendering.navigationState;
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentInstructionsView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocumentInstructionsView.showRendering$lambda$5$lambda$3(this.f$0);
            }
        };
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentInstructionsView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocumentInstructionsView.showRendering$lambda$5$lambda$4(this.f$0);
            }
        };
        Pi2NavigationBar navigationBar = binding.navigationBar;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        NavigationUtils2.applyNavigationState(navigationState, function0, function02, navigationBar, root);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$5$lambda$2$lambda$1(Function1 function1, ComponentView componentView, View view) {
        function1.invoke(componentView.getComponent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$5$lambda$3(DocumentInstructionsView documentInstructionsView) {
        documentInstructionsView.onBack.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$5$lambda$4(DocumentInstructionsView documentInstructionsView) {
        documentInstructionsView.onCancel.invoke();
        return Unit.INSTANCE;
    }
}
