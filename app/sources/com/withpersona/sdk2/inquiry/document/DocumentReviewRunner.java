package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.workflow1.p415ui.LayoutRunner;
import com.squareup.workflow1.p415ui.ViewBindingViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.databinding.Pi2DocumentReviewBinding;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling8;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.SnackBarState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationUtils2;
import com.withpersona.sdk2.inquiry.shared.p422ui.InsetsUtils;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiControllerUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.ButtonStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import com.withpersona.sdk2.inquiry.steps.p423ui.utils.StepStyleUtils;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: DocumentReviewRunner.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentReviewRunner;", "Lcom/squareup/workflow1/ui/LayoutRunner;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Screen$ReviewCaptures;", "binding", "Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentReviewBinding;", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentReviewBinding;)V", "showRendering", "", "rendering", "viewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "applyStyles", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Companion", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class DocumentReviewRunner implements LayoutRunner<DocumentWorkflow.Screen.ReviewCaptures> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Pi2DocumentReviewBinding binding;

    public DocumentReviewRunner(Pi2DocumentReviewBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        CoordinatorLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        InsetsUtils.applyInsetsAsPadding$default(root, false, false, false, false, 15, null);
    }

    @Override // com.squareup.workflow1.p415ui.LayoutRunner
    public void showRendering(final DocumentWorkflow.Screen.ReviewCaptures rendering, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
        DocumentTileAdapter documentTileAdapter;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Pi2DocumentReviewBinding pi2DocumentReviewBinding = this.binding;
        pi2DocumentReviewBinding.title.setText(rendering.getTitle());
        String prompt = rendering.getPrompt();
        if (prompt != null) {
            Markwon.create(this.binding.getRoot().getContext()).mo17580setMarkdown(pi2DocumentReviewBinding.body, prompt);
        }
        pi2DocumentReviewBinding.disclaimer.setText(rendering.getDisclaimer());
        if (pi2DocumentReviewBinding.reviewItemList.getAdapter() == null) {
            Context context = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            documentTileAdapter = new DocumentTileAdapter(context, rendering.getImageLoader(), rendering.getOpenUploadOptions(), rendering.getStyles());
            pi2DocumentReviewBinding.reviewItemList.setAdapter(documentTileAdapter);
        } else {
            RecyclerView.Adapter adapter = pi2DocumentReviewBinding.reviewItemList.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentTileAdapter");
            documentTileAdapter = (DocumentTileAdapter) adapter;
        }
        documentTileAdapter.update(!rendering.getDisabled() && rendering.getAddButtonEnabled(), rendering.getDocuments());
        documentTileAdapter.setRemoveDocument(new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentReviewRunner$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentReviewRunner.showRendering$lambda$6$lambda$2(rendering, (DocumentFile) obj);
            }
        });
        pi2DocumentReviewBinding.submitButton.setText(rendering.getSubmitButtonText());
        pi2DocumentReviewBinding.submitButton.setEnabled(rendering.getSubmitButtonEnabled());
        pi2DocumentReviewBinding.submitButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.document.DocumentReviewRunner$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DocumentReviewRunner.showRendering$lambda$6$lambda$3(rendering, view);
            }
        });
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentReviewRunner$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocumentReviewRunner.showRendering$lambda$6$lambda$4(rendering);
            }
        };
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentReviewRunner$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocumentReviewRunner.showRendering$lambda$6$lambda$5(rendering);
            }
        };
        Pi2NavigationBar navigationBar = pi2DocumentReviewBinding.navigationBar;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout root = pi2DocumentReviewBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        NavigationUtils2.applyNavigationState(navigationState, function0, function02, navigationBar, root);
        CoordinatorLayout root2 = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        SnackBarState.renderErrorSnackbarIfNeeded(root2, rendering.getError(), rendering.getOnErrorDismissed(), this.binding.submitButton, 4, 10000);
        applyStyles(rendering.getStyles(), viewEnvironment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showRendering$lambda$6$lambda$2(DocumentWorkflow.Screen.ReviewCaptures reviewCaptures, DocumentFile it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof DocumentFile.Remote) {
            reviewCaptures.getOnRemove().invoke(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$6$lambda$3(DocumentWorkflow.Screen.ReviewCaptures reviewCaptures, View view) {
        reviewCaptures.getOnSubmit().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$6$lambda$4(DocumentWorkflow.Screen.ReviewCaptures reviewCaptures) {
        reviewCaptures.getOnBack().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$6$lambda$5(DocumentWorkflow.Screen.ReviewCaptures reviewCaptures) {
        reviewCaptures.getOnCancel().invoke();
        return Unit.INSTANCE;
    }

    private final void applyStyles(StepStyles.DocumentStepStyle styles, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
        ButtonComponentStyling8 buttonPrimaryStyleValue;
        TextBasedComponentStyle disclaimerStyleValue;
        TextBasedComponentStyle textStyleValue;
        TextBasedComponentStyle titleStyleValue;
        Integer headerButtonColorValue;
        Integer backgroundColorValue;
        if (styles != null && (backgroundColorValue = styles.getBackgroundColorValue()) != null) {
            int iIntValue = backgroundColorValue.intValue();
            this.binding.getRoot().setBackgroundColor(iIntValue);
            SystemUiControllerUtils.updateSystemUiColor(viewEnvironment, iIntValue);
        }
        if (styles != null) {
            Context context = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Drawable drawableBackgroundImageDrawable = StepStyleUtils.backgroundImageDrawable(styles, context);
            if (drawableBackgroundImageDrawable != null) {
                this.binding.getRoot().setBackground(drawableBackgroundImageDrawable);
            }
        }
        if (styles != null && (headerButtonColorValue = styles.getHeaderButtonColorValue()) != null) {
            this.binding.navigationBar.setControlsColor(headerButtonColorValue.intValue());
        }
        if (styles != null && (titleStyleValue = styles.getTitleStyleValue()) != null) {
            TextView title = this.binding.title;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            TextStyling2.style$default(title, titleStyleValue, null, 2, null);
        }
        if (styles != null && (textStyleValue = styles.getTextStyleValue()) != null) {
            TextView body = this.binding.body;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            TextStyling2.style$default(body, textStyleValue, null, 2, null);
        }
        if (styles != null && (disclaimerStyleValue = styles.getDisclaimerStyleValue()) != null) {
            TextView disclaimer = this.binding.disclaimer;
            Intrinsics.checkNotNullExpressionValue(disclaimer, "disclaimer");
            TextStyling2.style$default(disclaimer, disclaimerStyleValue, null, 2, null);
        }
        if (styles == null || (buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue()) == null) {
            return;
        }
        Button submitButton = this.binding.submitButton;
        Intrinsics.checkNotNullExpressionValue(submitButton, "submitButton");
        ButtonStyling.style$default(submitButton, buttonPrimaryStyleValue, false, false, 6, null);
    }

    /* compiled from: DocumentReviewRunner.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0001R\u001a\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentReviewRunner$Companion;", "Lcom/squareup/workflow1/ui/ViewFactory;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Screen$ReviewCaptures;", "<init>", "()V", "buildView", "Landroid/view/View;", "initialRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "contextForNewView", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements ViewFactory<DocumentWorkflow.Screen.ReviewCaptures> {
        private final /* synthetic */ ViewFactory<DocumentWorkflow.Screen.ReviewCaptures> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public View buildView(DocumentWorkflow.Screen.ReviewCaptures initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.$$delegate_0.buildView(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public KClass<? super DocumentWorkflow.Screen.ReviewCaptures> getType() {
            return this.$$delegate_0.getType();
        }

        /* compiled from: DocumentReviewRunner.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.document.DocumentReviewRunner$Companion$1 */
        /* synthetic */ class C435661 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, Pi2DocumentReviewBinding> {
            public static final C435661 INSTANCE = new C435661();

            C435661() {
                super(3, Pi2DocumentReviewBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentReviewBinding;", 0);
            }

            public final Pi2DocumentReviewBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return Pi2DocumentReviewBinding.inflate(p0, viewGroup, z);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Pi2DocumentReviewBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return invoke(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        private Companion() {
            LayoutRunner.Companion companion = LayoutRunner.INSTANCE;
            this.$$delegate_0 = new ViewBindingViewFactory(Reflection.getOrCreateKotlinClass(DocumentWorkflow.Screen.ReviewCaptures.class), C435661.INSTANCE, C435672.INSTANCE);
        }

        /* compiled from: DocumentReviewRunner.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.document.DocumentReviewRunner$Companion$2 */
        /* synthetic */ class C435672 extends FunctionReferenceImpl implements Function1<Pi2DocumentReviewBinding, DocumentReviewRunner> {
            public static final C435672 INSTANCE = new C435672();

            C435672() {
                super(1, DocumentReviewRunner.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentReviewBinding;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DocumentReviewRunner invoke(Pi2DocumentReviewBinding p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new DocumentReviewRunner(p0);
            }
        }
    }
}
