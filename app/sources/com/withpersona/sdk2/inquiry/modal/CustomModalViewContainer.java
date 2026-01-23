package com.withpersona.sdk2.inquiry.modal;

import android.app.Dialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.WindowCompat;
import com.squareup.workflow1.p415ui.BuilderViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.squareup.workflow1.p415ui.ViewShowRendering;
import com.squareup.workflow1.p415ui.modal.ModalViewContainer;
import com.withpersona.sdk2.inquiry.modal.CustomModalViewContainer;
import com.withpersona.sdk2.inquiry.resources.R$style;
import com.withpersona.sdk2.inquiry.shared.WindowUtils2;
import com.withpersona.sdk2.inquiry.shared.p422ui.InsetsUtils;
import com.withpersona.sdk2.inquiry.shared.p422ui.ViewUtils3;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: CustomModalViewContainer.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u0010"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/modal/CustomModalViewContainer;", "Lcom/squareup/workflow1/ui/modal/ModalViewContainer;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyle", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "buildDialogForView", "Landroid/app/Dialog;", "view", "Landroid/view/View;", "Companion", "modal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class CustomModalViewContainer extends ModalViewContainer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ CustomModalViewContainer(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomModalViewContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.squareup.workflow1.p415ui.modal.ModalViewContainer
    public Dialog buildDialogForView(View view) {
        Object next;
        Intrinsics.checkNotNullParameter(view, "view");
        Dialog dialog = new Dialog(getContext(), R$style.Persona_Inquiry2_DialogFullscreen);
        Iterator<T> it = ViewUtils3.getAllChildren(view).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((View) next).getTag(R$id.pi2_background_color_hint) instanceof Integer) {
                break;
            }
        }
        View view2 = (View) next;
        Object tag = view2 != null ? view2.getTag(R$id.pi2_background_color_hint) : null;
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        dialog.setContentView(view);
        Window window = dialog.getWindow();
        if (window != null) {
            if (num != null) {
                WindowUtils2.updateUiColor(window, num.intValue());
            }
            window.setBackgroundDrawable(null);
            window.setLayout(-1, -1);
            WindowCompat.setDecorFitsSystemWindows(window, false);
            if (!InsetsUtils.getSupportsCustomNavigationBar()) {
                window.setNavigationBarColor(-16777216);
            }
        }
        return dialog;
    }

    /* compiled from: CustomModalViewContainer.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0001R\"\u0010\u000e\u001a\u0012\u0012\u000e\b\u0000\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/modal/CustomModalViewContainer$Companion;", "Lcom/squareup/workflow1/ui/ViewFactory;", "Lcom/withpersona/sdk2/inquiry/modal/ModalContainerScreen;", "<init>", "()V", "buildView", "Landroid/view/View;", "initialRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "contextForNewView", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "modal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion implements ViewFactory<ModalContainerScreen<?, ?>> {
        private final /* synthetic */ BuilderViewFactory<ModalContainerScreen<?, ?>> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public View buildView(ModalContainerScreen<?, ?> initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.$$delegate_0.buildView(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public KClass<? super ModalContainerScreen<?, ?>> getType() {
            return this.$$delegate_0.getType();
        }

        private Companion() {
            this.$$delegate_0 = new BuilderViewFactory<>(Reflection.getOrCreateKotlinClass(ModalContainerScreen.class), new Function4() { // from class: com.withpersona.sdk2.inquiry.modal.CustomModalViewContainer$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return CustomModalViewContainer.Companion.__delegate_0$lambda$1((ModalContainerScreen) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final View __delegate_0$lambda$1(ModalContainerScreen initialRendering, ViewEnvironment initialEnv, Context contextForNewView, ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialEnv, "initialEnv");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            CustomModalViewContainer customModalViewContainer = new CustomModalViewContainer(contextForNewView, null, 0, 0, 14, null);
            customModalViewContainer.setId(R$id.pi2_modal_container);
            customModalViewContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            ViewShowRendering.bindShowRendering(customModalViewContainer, initialRendering, initialEnv, new CustomModalViewContainer2(customModalViewContainer));
            return customModalViewContainer;
        }
    }
}
