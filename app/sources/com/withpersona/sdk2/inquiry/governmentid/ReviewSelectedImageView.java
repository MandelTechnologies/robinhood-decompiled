package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.compose.bento.component.BentoCurrencyPicker;
import com.squareup.workflow1.p415ui.AndroidViewRendering;
import com.squareup.workflow1.p415ui.LayoutRunner;
import com.squareup.workflow1.p415ui.ViewBindingViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidReviewSelectedImageBinding;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling3;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling8;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.SnackBarState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationUtils2;
import com.withpersona.sdk2.inquiry.shared.p422ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.p422ui.InsetsUtils;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiControllerUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.ButtonStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import com.withpersona.sdk2.inquiry.steps.p423ui.utils.StepStyleUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: ReviewSelectedImageView.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B³\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJO\u0010'\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u00182\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010*R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b7\u0010*R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b8\u0010*R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b9\u0010*R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b:\u0010*R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b;\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b<\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010?R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bA\u0010BR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bC\u0010BR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0012\u0010@\u001a\u0004\bD\u0010BR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bE\u0010BR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u00105\u001a\u0004\bF\u0010*R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\bG\u0010BR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010K\u001a\u0004\b\u0019\u0010LR \u0010N\u001a\b\u0012\u0004\u0012\u00020\u00000M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q¨\u0006R"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/ReviewSelectedImageView;", "Lcom/squareup/workflow1/ui/AndroidViewRendering;", "Lcoil/ImageLoader;", "imageLoader", "", "title", CarResultComposable2.BODY, "confirmButtonText", "chooseNewPhotoText", "fileToReviewPath", "fileMimeType", "fileName", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onUsePhotoClick", "onChooseNewPhotoClick", "onBack", "onCancel", "error", "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "", "isAutoClassifying", "<init>", "(Lcoil/ImageLoader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Z)V", "Landroid/view/View;", BentoCurrencyPicker.ROOT_TEST_TAG, "Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "navigationBar", "Landroid/widget/TextView;", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "usePhotoButton", "Landroid/widget/Button;", "chooseNewPhotoButton", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "viewEnvironment", "applyStyles", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;Landroid/widget/Button;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcoil/ImageLoader;", "getImageLoader", "()Lcoil/ImageLoader;", "Ljava/lang/String;", "getTitle", "getBody", "getConfirmButtonText", "getChooseNewPhotoText", "getFileToReviewPath", "getFileMimeType", "getFileName", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "getNavigationState", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Lkotlin/jvm/functions/Function0;", "getOnUsePhotoClick", "()Lkotlin/jvm/functions/Function0;", "getOnChooseNewPhotoClick", "getOnBack", "getOnCancel", "getError", "getOnErrorDismissed", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "Z", "()Z", "Lcom/squareup/workflow1/ui/ViewFactory;", "viewFactory", "Lcom/squareup/workflow1/ui/ViewFactory;", "getViewFactory", "()Lcom/squareup/workflow1/ui/ViewFactory;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final /* data */ class ReviewSelectedImageView implements AndroidViewRendering<ReviewSelectedImageView> {
    private final String body;
    private final String chooseNewPhotoText;
    private final String confirmButtonText;
    private final String error;
    private final String fileMimeType;
    private final String fileName;
    private final String fileToReviewPath;
    private final ImageLoader imageLoader;
    private final boolean isAutoClassifying;
    private final NavigationState navigationState;
    private final Function0<Unit> onBack;
    private final Function0<Unit> onCancel;
    private final Function0<Unit> onChooseNewPhotoClick;
    private final Function0<Unit> onErrorDismissed;
    private final Function0<Unit> onUsePhotoClick;
    private final StepStyles.GovernmentIdStepStyle styles;
    private final String title;
    private final ViewFactory<ReviewSelectedImageView> viewFactory;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewSelectedImageView)) {
            return false;
        }
        ReviewSelectedImageView reviewSelectedImageView = (ReviewSelectedImageView) other;
        return Intrinsics.areEqual(this.imageLoader, reviewSelectedImageView.imageLoader) && Intrinsics.areEqual(this.title, reviewSelectedImageView.title) && Intrinsics.areEqual(this.body, reviewSelectedImageView.body) && Intrinsics.areEqual(this.confirmButtonText, reviewSelectedImageView.confirmButtonText) && Intrinsics.areEqual(this.chooseNewPhotoText, reviewSelectedImageView.chooseNewPhotoText) && Intrinsics.areEqual(this.fileToReviewPath, reviewSelectedImageView.fileToReviewPath) && Intrinsics.areEqual(this.fileMimeType, reviewSelectedImageView.fileMimeType) && Intrinsics.areEqual(this.fileName, reviewSelectedImageView.fileName) && Intrinsics.areEqual(this.navigationState, reviewSelectedImageView.navigationState) && Intrinsics.areEqual(this.onUsePhotoClick, reviewSelectedImageView.onUsePhotoClick) && Intrinsics.areEqual(this.onChooseNewPhotoClick, reviewSelectedImageView.onChooseNewPhotoClick) && Intrinsics.areEqual(this.onBack, reviewSelectedImageView.onBack) && Intrinsics.areEqual(this.onCancel, reviewSelectedImageView.onCancel) && Intrinsics.areEqual(this.error, reviewSelectedImageView.error) && Intrinsics.areEqual(this.onErrorDismissed, reviewSelectedImageView.onErrorDismissed) && Intrinsics.areEqual(this.styles, reviewSelectedImageView.styles) && this.isAutoClassifying == reviewSelectedImageView.isAutoClassifying;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.imageLoader.hashCode() * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31) + this.confirmButtonText.hashCode()) * 31) + this.chooseNewPhotoText.hashCode()) * 31) + this.fileToReviewPath.hashCode()) * 31) + this.fileMimeType.hashCode()) * 31;
        String str = this.fileName;
        int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.navigationState.hashCode()) * 31) + this.onUsePhotoClick.hashCode()) * 31) + this.onChooseNewPhotoClick.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onCancel.hashCode()) * 31;
        String str2 = this.error;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.onErrorDismissed.hashCode()) * 31;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
        return ((iHashCode3 + (governmentIdStepStyle != null ? governmentIdStepStyle.hashCode() : 0)) * 31) + Boolean.hashCode(this.isAutoClassifying);
    }

    public String toString() {
        return "ReviewSelectedImageView(imageLoader=" + this.imageLoader + ", title=" + this.title + ", body=" + this.body + ", confirmButtonText=" + this.confirmButtonText + ", chooseNewPhotoText=" + this.chooseNewPhotoText + ", fileToReviewPath=" + this.fileToReviewPath + ", fileMimeType=" + this.fileMimeType + ", fileName=" + this.fileName + ", navigationState=" + this.navigationState + ", onUsePhotoClick=" + this.onUsePhotoClick + ", onChooseNewPhotoClick=" + this.onChooseNewPhotoClick + ", onBack=" + this.onBack + ", onCancel=" + this.onCancel + ", error=" + this.error + ", onErrorDismissed=" + this.onErrorDismissed + ", styles=" + this.styles + ", isAutoClassifying=" + this.isAutoClassifying + ")";
    }

    public ReviewSelectedImageView(ImageLoader imageLoader, String title, String body, String confirmButtonText, String chooseNewPhotoText, String fileToReviewPath, String fileMimeType, String str, NavigationState navigationState, Function0<Unit> onUsePhotoClick, Function0<Unit> onChooseNewPhotoClick, Function0<Unit> onBack, Function0<Unit> onCancel, String str2, Function0<Unit> onErrorDismissed, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, boolean z) {
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(confirmButtonText, "confirmButtonText");
        Intrinsics.checkNotNullParameter(chooseNewPhotoText, "chooseNewPhotoText");
        Intrinsics.checkNotNullParameter(fileToReviewPath, "fileToReviewPath");
        Intrinsics.checkNotNullParameter(fileMimeType, "fileMimeType");
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(onUsePhotoClick, "onUsePhotoClick");
        Intrinsics.checkNotNullParameter(onChooseNewPhotoClick, "onChooseNewPhotoClick");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Intrinsics.checkNotNullParameter(onErrorDismissed, "onErrorDismissed");
        this.imageLoader = imageLoader;
        this.title = title;
        this.body = body;
        this.confirmButtonText = confirmButtonText;
        this.chooseNewPhotoText = chooseNewPhotoText;
        this.fileToReviewPath = fileToReviewPath;
        this.fileMimeType = fileMimeType;
        this.fileName = str;
        this.navigationState = navigationState;
        this.onUsePhotoClick = onUsePhotoClick;
        this.onChooseNewPhotoClick = onChooseNewPhotoClick;
        this.onBack = onBack;
        this.onCancel = onCancel;
        this.error = str2;
        this.onErrorDismissed = onErrorDismissed;
        this.styles = governmentIdStepStyle;
        this.isAutoClassifying = z;
        LayoutRunner.Companion companion = LayoutRunner.INSTANCE;
        this.viewFactory = new ViewBindingViewFactory(Reflection.getOrCreateKotlinClass(ReviewSelectedImageView.class), ReviewSelectedImageView2.INSTANCE, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewSelectedImageView.viewFactory$lambda$10(this.f$0, (Pi2GovernmentidReviewSelectedImageBinding) obj);
            }
        });
    }

    @Override // com.squareup.workflow1.p415ui.AndroidViewRendering
    public ViewFactory<ReviewSelectedImageView> getViewFactory() {
        return this.viewFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutRunner viewFactory$lambda$10(final ReviewSelectedImageView reviewSelectedImageView, final Pi2GovernmentidReviewSelectedImageBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        CoordinatorLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        InsetsUtils.applyInsetsAsPadding$default(root, false, false, false, false, 15, null);
        return new LayoutRunner() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView$$ExternalSyntheticLambda1
            @Override // com.squareup.workflow1.p415ui.LayoutRunner
            public final void showRendering(Object obj, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
                ReviewSelectedImageView.viewFactory$lambda$10$lambda$9(binding, reviewSelectedImageView, (ReviewSelectedImageView) obj, viewEnvironment);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void viewFactory$lambda$10$lambda$9(Pi2GovernmentidReviewSelectedImageBinding pi2GovernmentidReviewSelectedImageBinding, final ReviewSelectedImageView reviewSelectedImageView, final ReviewSelectedImageView rendering, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        pi2GovernmentidReviewSelectedImageBinding.title.setText(rendering.title);
        pi2GovernmentidReviewSelectedImageBinding.body.setText(rendering.body);
        pi2GovernmentidReviewSelectedImageBinding.usePhotoButton.setText(reviewSelectedImageView.confirmButtonText);
        pi2GovernmentidReviewSelectedImageBinding.usePhotoButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewSelectedImageView.viewFactory$lambda$10$lambda$9$lambda$8$lambda$0(this.f$0, view);
            }
        });
        pi2GovernmentidReviewSelectedImageBinding.chooseNewPhotoButton.setText(reviewSelectedImageView.chooseNewPhotoText);
        pi2GovernmentidReviewSelectedImageBinding.chooseNewPhotoButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewSelectedImageView.viewFactory$lambda$10$lambda$9$lambda$8$lambda$1(this.f$0, view);
            }
        });
        File file = new File(reviewSelectedImageView.fileToReviewPath);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(reviewSelectedImageView.fileToReviewPath, options);
        if (StringsKt.startsWith$default(reviewSelectedImageView.fileMimeType, "image/", false, 2, (Object) null)) {
            ImageView imageView = pi2GovernmentidReviewSelectedImageBinding.imageView;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            ImageLoader imageLoader = reviewSelectedImageView.imageLoader;
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(file).target(imageView);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setSize(options.outWidth, options.outHeight);
            gradientDrawable.setColor(0);
            builderTarget.placeholder(gradientDrawable);
            imageLoader.enqueue(builderTarget.build());
        } else {
            pi2GovernmentidReviewSelectedImageBinding.imageView.setVisibility(8);
            pi2GovernmentidReviewSelectedImageBinding.fileIcon.setVisibility(0);
            pi2GovernmentidReviewSelectedImageBinding.fileNameTextview.setVisibility(0);
            pi2GovernmentidReviewSelectedImageBinding.fileNameTextview.setText(reviewSelectedImageView.fileName);
        }
        NavigationState navigationState = rendering.navigationState;
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReviewSelectedImageView.viewFactory$lambda$10$lambda$9$lambda$8$lambda$5(this.f$0);
            }
        };
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReviewSelectedImageView.viewFactory$lambda$10$lambda$9$lambda$8$lambda$6(this.f$0);
            }
        };
        Pi2NavigationBar navigationBar = pi2GovernmentidReviewSelectedImageBinding.navigationBar;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout root = pi2GovernmentidReviewSelectedImageBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        NavigationUtils2.applyNavigationState(navigationState, function0, function02, navigationBar, root);
        pi2GovernmentidReviewSelectedImageBinding.usePhotoButton.setIsLoading(rendering.isAutoClassifying);
        CoordinatorLayout root2 = pi2GovernmentidReviewSelectedImageBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        SnackBarState.renderErrorSnackbarIfNeeded$default(root2, rendering.error, rendering.onErrorDismissed, null, 0, 0, 56, null);
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = reviewSelectedImageView.styles;
        if (governmentIdStepStyle != null) {
            CoordinatorLayout root3 = pi2GovernmentidReviewSelectedImageBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
            Pi2NavigationBar navigationBar2 = pi2GovernmentidReviewSelectedImageBinding.navigationBar;
            Intrinsics.checkNotNullExpressionValue(navigationBar2, "navigationBar");
            TextView title = pi2GovernmentidReviewSelectedImageBinding.title;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            TextView body = pi2GovernmentidReviewSelectedImageBinding.body;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            ButtonWithLoadingIndicator usePhotoButton = pi2GovernmentidReviewSelectedImageBinding.usePhotoButton;
            Intrinsics.checkNotNullExpressionValue(usePhotoButton, "usePhotoButton");
            Button chooseNewPhotoButton = pi2GovernmentidReviewSelectedImageBinding.chooseNewPhotoButton;
            Intrinsics.checkNotNullExpressionValue(chooseNewPhotoButton, "chooseNewPhotoButton");
            reviewSelectedImageView.applyStyles(governmentIdStepStyle, root3, navigationBar2, title, body, usePhotoButton, chooseNewPhotoButton, viewEnvironment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void viewFactory$lambda$10$lambda$9$lambda$8$lambda$0(ReviewSelectedImageView reviewSelectedImageView, View view) {
        reviewSelectedImageView.onUsePhotoClick.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void viewFactory$lambda$10$lambda$9$lambda$8$lambda$1(ReviewSelectedImageView reviewSelectedImageView, View view) {
        reviewSelectedImageView.onChooseNewPhotoClick.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit viewFactory$lambda$10$lambda$9$lambda$8$lambda$5(ReviewSelectedImageView reviewSelectedImageView) {
        reviewSelectedImageView.onBack.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit viewFactory$lambda$10$lambda$9$lambda$8$lambda$6(ReviewSelectedImageView reviewSelectedImageView) {
        reviewSelectedImageView.onCancel.invoke();
        return Unit.INSTANCE;
    }

    private final void applyStyles(StepStyles.GovernmentIdStepStyle styles, View root, Pi2NavigationBar navigationBar, TextView title, TextView body, ButtonWithLoadingIndicator usePhotoButton, Button chooseNewPhotoButton, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            root.setBackgroundColor(iIntValue);
            SystemUiControllerUtils.updateSystemUiColor(viewEnvironment, iIntValue);
        }
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable drawableBackgroundImageDrawable = StepStyleUtils.backgroundImageDrawable(styles, context);
        if (drawableBackgroundImageDrawable != null) {
            root.setBackground(drawableBackgroundImageDrawable);
        }
        Integer headerButtonColorValue = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue != null) {
            navigationBar.setControlsColor(headerButtonColorValue.intValue());
        }
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextStyling2.style$default(title, titleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            TextStyling2.style$default(body, textStyleValue, null, 2, null);
        }
        ButtonComponentStyling8 buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue();
        if (buttonPrimaryStyleValue != null) {
            ButtonStyling.style(usePhotoButton, buttonPrimaryStyleValue);
        }
        ButtonComponentStyling3 buttonSecondaryStyleValue = styles.getButtonSecondaryStyleValue();
        if (buttonSecondaryStyleValue != null) {
            ButtonStyling.style$default(chooseNewPhotoButton, buttonSecondaryStyleValue, false, false, 6, null);
        }
    }
}
