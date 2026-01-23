package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.button.MaterialButton;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.compose.bento.component.BentoCurrencyPicker;
import com.squareup.workflow1.p415ui.AndroidViewRendering;
import com.squareup.workflow1.p415ui.LayoutRunner;
import com.squareup.workflow1.p415ui.ViewBindingViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidChooseCaptureMethodBinding;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling3;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling8;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.SnackBarState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationUtils2;
import com.withpersona.sdk2.inquiry.shared.p422ui.InsetsUtils;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p422ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiControllerUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.ButtonStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.ImageStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import com.withpersona.sdk2.inquiry.steps.p423ui.utils.RemoteImageUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.utils.StepStyleUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: ChooseCaptureMethodView.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B«\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ_\u0010)\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010,R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b9\u0010,R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b:\u0010,R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b;\u0010,R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010>R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010AR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\bB\u0010AR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\bC\u0010AR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\bD\u0010AR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u00107\u001a\u0004\bE\u0010,R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010?\u001a\u0004\bF\u0010AR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010M\u001a\u0004\bN\u0010.R\u0018\u0010O\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR \u0010R\u001a\b\u0012\u0004\u0012\u00020\u00000Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U¨\u0006V"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/ChooseCaptureMethodView;", "Lcom/squareup/workflow1/ui/AndroidViewRendering;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;", "captureOptions", "", "title", CarResultComposable2.BODY, "cameraText", "uploadButtonText", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onCameraCaptureClick", "onUploadClick", "onBack", "onCancel", "error", "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "pictographAsset", "", "localAsset", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;I)V", "Landroid/view/View;", BentoCurrencyPicker.ROOT_TEST_TAG, "Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "navigationBar", "Landroid/widget/TextView;", "Landroid/widget/Button;", "cameraButton", "uploadButton", "Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;", "idImage", "idImageContainer", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "viewEnvironment", "applyStyles", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Landroid/view/View;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCaptureOptions", "()Ljava/util/List;", "Ljava/lang/String;", "getTitle", "getBody", "getCameraText", "getUploadButtonText", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "getNavigationState", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Lkotlin/jvm/functions/Function0;", "getOnCameraCaptureClick", "()Lkotlin/jvm/functions/Function0;", "getOnUploadClick", "getOnBack", "getOnCancel", "getError", "getOnErrorDismissed", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getPictographAsset", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "I", "getLocalAsset", "currentPictographAssetView", "Landroid/view/View;", "Lcom/squareup/workflow1/ui/ViewFactory;", "viewFactory", "Lcom/squareup/workflow1/ui/ViewFactory;", "getViewFactory", "()Lcom/squareup/workflow1/ui/ViewFactory;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final /* data */ class ChooseCaptureMethodView implements AndroidViewRendering<ChooseCaptureMethodView> {
    private final String body;
    private final String cameraText;
    private final List<CaptureOptionNativeMobile> captureOptions;
    private View currentPictographAssetView;
    private final String error;
    private final int localAsset;
    private final NavigationState navigationState;
    private final Function0<Unit> onBack;
    private final Function0<Unit> onCameraCaptureClick;
    private final Function0<Unit> onCancel;
    private final Function0<Unit> onErrorDismissed;
    private final Function0<Unit> onUploadClick;
    private final RemoteImage pictographAsset;
    private final StepStyles.GovernmentIdStepStyle styles;
    private final String title;
    private final String uploadButtonText;
    private final ViewFactory<ChooseCaptureMethodView> viewFactory;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChooseCaptureMethodView)) {
            return false;
        }
        ChooseCaptureMethodView chooseCaptureMethodView = (ChooseCaptureMethodView) other;
        return Intrinsics.areEqual(this.captureOptions, chooseCaptureMethodView.captureOptions) && Intrinsics.areEqual(this.title, chooseCaptureMethodView.title) && Intrinsics.areEqual(this.body, chooseCaptureMethodView.body) && Intrinsics.areEqual(this.cameraText, chooseCaptureMethodView.cameraText) && Intrinsics.areEqual(this.uploadButtonText, chooseCaptureMethodView.uploadButtonText) && Intrinsics.areEqual(this.navigationState, chooseCaptureMethodView.navigationState) && Intrinsics.areEqual(this.onCameraCaptureClick, chooseCaptureMethodView.onCameraCaptureClick) && Intrinsics.areEqual(this.onUploadClick, chooseCaptureMethodView.onUploadClick) && Intrinsics.areEqual(this.onBack, chooseCaptureMethodView.onBack) && Intrinsics.areEqual(this.onCancel, chooseCaptureMethodView.onCancel) && Intrinsics.areEqual(this.error, chooseCaptureMethodView.error) && Intrinsics.areEqual(this.onErrorDismissed, chooseCaptureMethodView.onErrorDismissed) && Intrinsics.areEqual(this.styles, chooseCaptureMethodView.styles) && Intrinsics.areEqual(this.pictographAsset, chooseCaptureMethodView.pictographAsset) && this.localAsset == chooseCaptureMethodView.localAsset;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.captureOptions.hashCode() * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31) + this.cameraText.hashCode()) * 31) + this.uploadButtonText.hashCode()) * 31) + this.navigationState.hashCode()) * 31) + this.onCameraCaptureClick.hashCode()) * 31) + this.onUploadClick.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onCancel.hashCode()) * 31;
        String str = this.error;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.onErrorDismissed.hashCode()) * 31;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
        int iHashCode3 = (iHashCode2 + (governmentIdStepStyle == null ? 0 : governmentIdStepStyle.hashCode())) * 31;
        RemoteImage remoteImage = this.pictographAsset;
        return ((iHashCode3 + (remoteImage != null ? remoteImage.hashCode() : 0)) * 31) + Integer.hashCode(this.localAsset);
    }

    public String toString() {
        return "ChooseCaptureMethodView(captureOptions=" + this.captureOptions + ", title=" + this.title + ", body=" + this.body + ", cameraText=" + this.cameraText + ", uploadButtonText=" + this.uploadButtonText + ", navigationState=" + this.navigationState + ", onCameraCaptureClick=" + this.onCameraCaptureClick + ", onUploadClick=" + this.onUploadClick + ", onBack=" + this.onBack + ", onCancel=" + this.onCancel + ", error=" + this.error + ", onErrorDismissed=" + this.onErrorDismissed + ", styles=" + this.styles + ", pictographAsset=" + this.pictographAsset + ", localAsset=" + this.localAsset + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChooseCaptureMethodView(List<? extends CaptureOptionNativeMobile> captureOptions, String title, String body, String cameraText, String uploadButtonText, NavigationState navigationState, Function0<Unit> onCameraCaptureClick, Function0<Unit> onUploadClick, Function0<Unit> onBack, Function0<Unit> onCancel, String str, Function0<Unit> onErrorDismissed, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, RemoteImage remoteImage, int i) {
        Intrinsics.checkNotNullParameter(captureOptions, "captureOptions");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(cameraText, "cameraText");
        Intrinsics.checkNotNullParameter(uploadButtonText, "uploadButtonText");
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(onCameraCaptureClick, "onCameraCaptureClick");
        Intrinsics.checkNotNullParameter(onUploadClick, "onUploadClick");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Intrinsics.checkNotNullParameter(onErrorDismissed, "onErrorDismissed");
        this.captureOptions = captureOptions;
        this.title = title;
        this.body = body;
        this.cameraText = cameraText;
        this.uploadButtonText = uploadButtonText;
        this.navigationState = navigationState;
        this.onCameraCaptureClick = onCameraCaptureClick;
        this.onUploadClick = onUploadClick;
        this.onBack = onBack;
        this.onCancel = onCancel;
        this.error = str;
        this.onErrorDismissed = onErrorDismissed;
        this.styles = governmentIdStepStyle;
        this.pictographAsset = remoteImage;
        this.localAsset = i;
        LayoutRunner.Companion companion = LayoutRunner.INSTANCE;
        this.viewFactory = new ViewBindingViewFactory(Reflection.getOrCreateKotlinClass(ChooseCaptureMethodView.class), ChooseCaptureMethodView2.INSTANCE, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseCaptureMethodView.viewFactory$lambda$7(this.f$0, (Pi2GovernmentidChooseCaptureMethodBinding) obj);
            }
        });
    }

    @Override // com.squareup.workflow1.p415ui.AndroidViewRendering
    public ViewFactory<ChooseCaptureMethodView> getViewFactory() {
        return this.viewFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutRunner viewFactory$lambda$7(final ChooseCaptureMethodView chooseCaptureMethodView, final Pi2GovernmentidChooseCaptureMethodBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        CoordinatorLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        InsetsUtils.applyInsetsAsPadding$default(root, false, false, false, false, 15, null);
        return new LayoutRunner() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda1
            @Override // com.squareup.workflow1.p415ui.LayoutRunner
            public final void showRendering(Object obj, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
                ChooseCaptureMethodView.viewFactory$lambda$7$lambda$6(binding, chooseCaptureMethodView, (ChooseCaptureMethodView) obj, viewEnvironment);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void viewFactory$lambda$7$lambda$6(Pi2GovernmentidChooseCaptureMethodBinding pi2GovernmentidChooseCaptureMethodBinding, ChooseCaptureMethodView chooseCaptureMethodView, final ChooseCaptureMethodView rendering, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Context context = pi2GovernmentidChooseCaptureMethodBinding.getRoot().getContext();
        pi2GovernmentidChooseCaptureMethodBinding.title.setText(rendering.title);
        pi2GovernmentidChooseCaptureMethodBinding.body.setText(rendering.body);
        if (chooseCaptureMethodView.captureOptions.contains(CaptureOptionNativeMobile.MOBILE_CAMERA)) {
            if (!StringsKt.isBlank(chooseCaptureMethodView.cameraText)) {
                pi2GovernmentidChooseCaptureMethodBinding.cameraButton.setText(chooseCaptureMethodView.cameraText);
                pi2GovernmentidChooseCaptureMethodBinding.cameraButton.setIcon(null);
            } else {
                pi2GovernmentidChooseCaptureMethodBinding.cameraButton.setText((CharSequence) null);
                pi2GovernmentidChooseCaptureMethodBinding.cameraButton.setIcon(AppCompatResources.getDrawable(context, R$drawable.pi2_governmentid_cameraicon));
            }
            pi2GovernmentidChooseCaptureMethodBinding.cameraButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChooseCaptureMethodView.viewFactory$lambda$7$lambda$6$lambda$5$lambda$0(this.f$0, view);
                }
            });
        }
        if (chooseCaptureMethodView.captureOptions.contains(CaptureOptionNativeMobile.UPLOAD)) {
            pi2GovernmentidChooseCaptureMethodBinding.uploadButton.setText(rendering.uploadButtonText);
            pi2GovernmentidChooseCaptureMethodBinding.uploadButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChooseCaptureMethodView.viewFactory$lambda$7$lambda$6$lambda$5$lambda$1(this.f$0, view);
                }
            });
        }
        NavigationState navigationState = rendering.navigationState;
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChooseCaptureMethodView.viewFactory$lambda$7$lambda$6$lambda$5$lambda$2(this.f$0);
            }
        };
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChooseCaptureMethodView.viewFactory$lambda$7$lambda$6$lambda$5$lambda$3(this.f$0);
            }
        };
        Pi2NavigationBar navigationBar = pi2GovernmentidChooseCaptureMethodBinding.navigationBar;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout root = pi2GovernmentidChooseCaptureMethodBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        NavigationUtils2.applyNavigationState(navigationState, function0, function02, navigationBar, root);
        CoordinatorLayout root2 = pi2GovernmentidChooseCaptureMethodBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        SnackBarState.renderErrorSnackbarIfNeeded$default(root2, rendering.error, rendering.onErrorDismissed, null, 0, 0, 56, null);
        RemoteImage remoteImage = chooseCaptureMethodView.pictographAsset;
        if (remoteImage != null) {
            if (chooseCaptureMethodView.currentPictographAssetView == null) {
                ConstraintLayout imageViewContainer = pi2GovernmentidChooseCaptureMethodBinding.imageViewContainer;
                Intrinsics.checkNotNullExpressionValue(imageViewContainer, "imageViewContainer");
                chooseCaptureMethodView.currentPictographAssetView = RemoteImageUtils.renderToContainer$default(remoteImage, imageViewContainer, false, 2, null);
                pi2GovernmentidChooseCaptureMethodBinding.localImage.setVisibility(8);
            }
        } else {
            pi2GovernmentidChooseCaptureMethodBinding.idImage.setAnimation(chooseCaptureMethodView.localAsset);
        }
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = chooseCaptureMethodView.styles;
        if (governmentIdStepStyle != null) {
            CoordinatorLayout root3 = pi2GovernmentidChooseCaptureMethodBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
            Pi2NavigationBar navigationBar2 = pi2GovernmentidChooseCaptureMethodBinding.navigationBar;
            Intrinsics.checkNotNullExpressionValue(navigationBar2, "navigationBar");
            TextView title = pi2GovernmentidChooseCaptureMethodBinding.title;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            TextView body = pi2GovernmentidChooseCaptureMethodBinding.body;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            MaterialButton cameraButton = pi2GovernmentidChooseCaptureMethodBinding.cameraButton;
            Intrinsics.checkNotNullExpressionValue(cameraButton, "cameraButton");
            Button uploadButton = pi2GovernmentidChooseCaptureMethodBinding.uploadButton;
            Intrinsics.checkNotNullExpressionValue(uploadButton, "uploadButton");
            ThemeableLottieAnimationView idImage = pi2GovernmentidChooseCaptureMethodBinding.idImage;
            Intrinsics.checkNotNullExpressionValue(idImage, "idImage");
            View idImageContainer = pi2GovernmentidChooseCaptureMethodBinding.idImageContainer;
            Intrinsics.checkNotNullExpressionValue(idImageContainer, "idImageContainer");
            chooseCaptureMethodView.applyStyles(governmentIdStepStyle, root3, navigationBar2, title, body, cameraButton, uploadButton, idImage, idImageContainer, viewEnvironment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void viewFactory$lambda$7$lambda$6$lambda$5$lambda$0(ChooseCaptureMethodView chooseCaptureMethodView, View view) {
        chooseCaptureMethodView.onCameraCaptureClick.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void viewFactory$lambda$7$lambda$6$lambda$5$lambda$1(ChooseCaptureMethodView chooseCaptureMethodView, View view) {
        chooseCaptureMethodView.onUploadClick.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit viewFactory$lambda$7$lambda$6$lambda$5$lambda$2(ChooseCaptureMethodView chooseCaptureMethodView) {
        chooseCaptureMethodView.onBack.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit viewFactory$lambda$7$lambda$6$lambda$5$lambda$3(ChooseCaptureMethodView chooseCaptureMethodView) {
        chooseCaptureMethodView.onCancel.invoke();
        return Unit.INSTANCE;
    }

    private final void applyStyles(StepStyles.GovernmentIdStepStyle styles, View root, Pi2NavigationBar navigationBar, TextView title, TextView body, Button cameraButton, Button uploadButton, ThemeableLottieAnimationView idImage, View idImageContainer, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
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
            ButtonStyling.style$default(cameraButton, buttonPrimaryStyleValue, false, false, 6, null);
        }
        ButtonComponentStyling3 buttonSecondaryStyleValue = styles.getButtonSecondaryStyleValue();
        if (buttonSecondaryStyleValue != null) {
            ButtonStyling.style$default(uploadButton, buttonSecondaryStyleValue, false, false, 6, null);
        }
        Integer fillColorValue = styles.getFillColorValue();
        if (fillColorValue != null) {
            idImageContainer.setBackground(new ColorDrawable(fillColorValue.intValue()));
        }
        ImageStyling.replaceColors(idImage, styles.getStrokeColorValue(), styles.getFillColorValue(), null, new String[]{"#000000", "#190052", "#190051"}, new String[]{"#8751FF", "#AA85FF", "#AA84FF"}, new String[0]);
    }
}
