package com.withpersona.sdk2.inquiry.steps.p423ui;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.ActionButton;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.CancelButton;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.CombinedStepButton;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.CombinedStepImagePreview;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.CompleteButton;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.HorizontalStack;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputConfirmationCode;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputCurrency;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputGroup;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputGroup2;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputInternationalDb;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputMaskedText;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputMultiSelect;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputNumber;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputPhoneNumber;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputSelect;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputTextArea;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.PrivacyPolicy;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.QRCode;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.SubmitButton;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.VerifyPersonaButton;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ContextUtils3;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2GenericUiStepScreenBinding;
import com.withpersona.sdk2.inquiry.shared.p422ui.InsetsUtils;
import com.withpersona.sdk2.inquiry.shared.p422ui.ViewUtils3;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.ActionButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.ActionButtonComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.BrandingComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.BrandingComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.CancelButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.CancelButtonComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.ClickableStackComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.ClickableStackComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.CombinedStepButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.CombinedStepButtonComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.CompleteButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.CompleteButtonComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.CreatePersonaSheetComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.ESignatureComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.ESignatureComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.FooterComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.FooterComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.GovernmentIdNfcScanComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.HorizontalStackComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.HorizontalStackComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.ImagePreviewComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.ImagePreviewComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputAddressComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputCheckboxComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputCheckboxComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputCheckboxGroupComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputCheckboxGroupComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputConfirmationCodeComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputConfirmationCodeComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputCurrencyComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputCurrencyComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputDateComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputDateComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputInternationalDbComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputInternationalDbComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputMaskedTextComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputMaskedTextComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputMultiSelectComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputMultiSelectComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputNumberComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputNumberComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputPhoneNumberComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputPhoneNumberComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputRadioGroupComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputRadioGroupComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputTextAreaComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputTextAreaComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputTextComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputTextComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.LocalImageComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.LocalImageComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.PrivacyPolicyComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.PrivacyPolicyComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.QRCodeComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.QRCodeComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.RemoteImageComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.RemoteImageComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.SpacerComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.SpacerComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.SubmitButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.SubmitButtonComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.TextComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.TextComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.TitleComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.TitleComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent3;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentHelper;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.VerifyPersonaButtonComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiMainViewContainerBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: UiStepUtils.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014JW\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ]\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\"JU\u0010+\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020\u00062$\u0010&\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020%0$0#0\u001c2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020%0'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b+\u0010,JM\u00102\u001a\u0002012\u0006\u0010.\u001a\u00020-2\u0006\u0010\u0007\u001a\u00020\u00062&\u00100\u001a\"\u0012\u0004\u0012\u00020-\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0017\u0012\u0004\u0012\u00020%\u0018\u00010/2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b2\u00103J7\u00104\u001a\u0002012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b4\u00105J\u0015\u00108\u001a\u00020%2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109¨\u0006:"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/UiStepUtils;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "uiScreen", "", "isLoading", "", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/ComponentView;", "viewBindings", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "uiComponentHelper", "isModal", "shouldApplyFocus", "Landroid/view/View;", "generateMainScreen", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;ZLjava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;ZZ)Landroid/view/View;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;", "component", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentNameToComponent", "generateFooter", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;Ljava/util/Map;ZLjava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;)Landroid/view/View;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "components", "", "componentViews", "parseTreeView", "(Ljava/util/List;Ljava/util/Map;Landroid/content/Context;ZLjava/util/List;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;)Ljava/util/List;", "Lkotlin/Pair;", "Lkotlin/Function1;", "", "componentNamesToActions", "Lkotlin/Function0;", "onCancelled", "cancelButtonName", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiStepBottomSheet;", "getBottomSheetViewFor", "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/UiStepBottomSheet;", "Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;", "binding", "Lkotlin/Function2;", "initialRendering", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiScreenGenerationResult;", "setupViewsForNestedUiStep", "(Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lkotlin/jvm/functions/Function2;Z)Lcom/withpersona/sdk2/inquiry/steps/ui/UiScreenGenerationResult;", "generateViewsFromUiScreen", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;ZZZ)Lcom/withpersona/sdk2/inquiry/steps/ui/UiScreenGenerationResult;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "parentView", "applyFocus", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class UiStepUtils {
    public static final UiStepUtils INSTANCE = new UiStepUtils();

    private UiStepUtils() {
    }

    public final UiStepBottomSheet getBottomSheetViewFor(UiComponentScreen uiScreen, List<? extends Tuples2<String, ? extends Function1<? super UiComponent, Unit>>> componentNamesToActions, Function0<Unit> onCancelled, String cancelButtonName) {
        Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
        Intrinsics.checkNotNullParameter(componentNamesToActions, "componentNamesToActions");
        Intrinsics.checkNotNullParameter(onCancelled, "onCancelled");
        return new UiStepBottomSheet(uiScreen, componentNamesToActions, onCancelled, cancelButtonName, false, 16, null);
    }

    public final UiStepUtils6 setupViewsForNestedUiStep(Pi2GenericUiStepScreenBinding binding, UiComponentScreen uiScreen, Function2<? super Pi2GenericUiStepScreenBinding, ? super Map<String, ComponentView>, Unit> initialRendering, boolean shouldApplyFocus) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNull(context);
        UiStepUtils6 uiStepUtils6GenerateViewsFromUiScreen$default = generateViewsFromUiScreen$default(this, context, uiScreen, false, shouldApplyFocus, false, 16, null);
        if (uiScreen.getPageLevelVerticalAlignment() == StyleElements.PositionType.CENTER) {
            binding.contentScrollView.setFillViewport(true);
            uiStepUtils6GenerateViewsFromUiScreen$default.getContentView().setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            View contentView = uiStepUtils6GenerateViewsFromUiScreen$default.getContentView();
            ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 16;
                contentView.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        binding.contentContainer.addView(uiStepUtils6GenerateViewsFromUiScreen$default.getContentView());
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        InsetsUtils.applyInsetsAsPadding$default(root, false, false, false, false, 13, null);
        if (uiStepUtils6GenerateViewsFromUiScreen$default.getFooterView() != null) {
            binding.footerContainer.addView(uiStepUtils6GenerateViewsFromUiScreen$default.getFooterView());
            InsetsUtils.applyInsetsAsPadding$default(uiStepUtils6GenerateViewsFromUiScreen$default.getFooterView(), false, false, false, false, 2, null);
        }
        if (initialRendering != null) {
            initialRendering.invoke(binding, uiStepUtils6GenerateViewsFromUiScreen$default.getViewBindings().getComponentNameToComponentView());
        }
        Integer headerButtonColor = uiScreen.getHeaderButtonColor();
        if (headerButtonColor != null) {
            binding.navigationBar.setControlsColor(headerButtonColor.intValue());
        }
        return uiStepUtils6GenerateViewsFromUiScreen$default;
    }

    public static /* synthetic */ UiStepUtils6 generateViewsFromUiScreen$default(UiStepUtils uiStepUtils, Context context, UiComponentScreen uiStepUtils5, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 16) != 0) {
            z3 = true;
        }
        return uiStepUtils.generateViewsFromUiScreen(context, uiStepUtils5, z, z2, z3);
    }

    public final UiStepUtils6 generateViewsFromUiScreen(Context context, UiComponentScreen uiScreen, boolean isLoading, boolean isModal, boolean shouldApplyFocus) {
        FooterComponent footerComponent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        final UiComponentHelper uiComponentHelper = new UiComponentHelper(context);
        View viewGenerateMainScreen = generateMainScreen(context, uiScreen, isLoading, linkedHashMap, uiComponentHelper, isModal, shouldApplyFocus);
        List<UiComponent> components = uiScreen.getComponents();
        View viewGenerateFooter = null;
        if (components != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : components) {
                if (obj instanceof FooterComponent) {
                    arrayList.add(obj);
                }
            }
            footerComponent = (FooterComponent) CollectionsKt.firstOrNull((List) arrayList);
        } else {
            footerComponent = null;
        }
        if (footerComponent != null) {
            viewGenerateFooter = generateFooter(context, footerComponent, UiComponent3.toMap(uiScreen.getComponentConfigs()), isLoading, linkedHashMap, uiComponentHelper);
            linkedHashMap = linkedHashMap;
            uiComponentHelper = uiComponentHelper;
        }
        ViewUtils3.addOneShotPreDrawListenerAndDiscardFrame(viewGenerateMainScreen, new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.UiStepUtils$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiStepUtils.generateViewsFromUiScreen$lambda$2(uiComponentHelper);
            }
        });
        return new UiStepUtils6(new UiStepUtils7(linkedHashMap), viewGenerateMainScreen, viewGenerateFooter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateViewsFromUiScreen$lambda$2(UiComponentHelper uiComponentHelper) {
        uiComponentHelper.onLayout();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View generateMainScreen(Context context, UiComponentScreen uiScreen, boolean isLoading, Map<String, ComponentView> viewBindings, UiComponentHelper uiComponentHelper, boolean isModal, boolean shouldApplyFocus) {
        List<? extends UiComponent> listEmptyList;
        int i;
        ComponentView componentView;
        View view;
        Pi2UiMainViewContainerBinding pi2UiMainViewContainerBindingInflate = Pi2UiMainViewContainerBinding.inflate(uiComponentHelper.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(pi2UiMainViewContainerBindingInflate, "inflate(...)");
        ConstraintLayout root = pi2UiMainViewContainerBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        List<UiComponent> components = uiScreen.getComponents();
        if (components == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = new ArrayList<>();
            for (Object obj : components) {
                if (!(((UiComponent) obj) instanceof FooterComponent)) {
                    listEmptyList.add(obj);
                }
            }
        }
        List<? extends UiComponent> list = listEmptyList;
        ArrayList arrayList = new ArrayList();
        List<View> treeView = parseTreeView(list, UiComponent3.toMap(uiScreen.getComponentConfigs()), context, isLoading, arrayList, uiComponentHelper);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(root);
        Iterator<View> it = treeView.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            View next = it.next();
            next.setId(View.generateViewId());
            next.setSaveEnabled(false);
            root.addView(next);
            constraintSet.connect(next.getId(), 6, 0, 6);
            constraintSet.connect(next.getId(), 7, 0, 7);
            constraintSet.constrainHeight(next.getId(), -2);
            constraintSet.constrainDefaultWidth(next.getId(), 0);
            constraintSet.setVerticalBias(next.getId(), 0.5f);
        }
        for (Object obj2 : arrayList) {
            viewBindings.put(((ComponentView) obj2).getComponent().getName(), obj2);
        }
        if (treeView.size() > 1) {
            List<View> list2 = treeView;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((View) it2.next()).getId()));
            }
            constraintSet.createVerticalChain(0, 3, 0, 4, CollectionsKt.toIntArray(arrayList2), null, 3);
            if (uiScreen.getStyles() == null) {
                for (UiComponent uiComponent : list) {
                    int i2 = i + 1;
                    if (!(uiComponent instanceof SpacerComponent) && (componentView = (ComponentView) viewBindings.get(uiComponent.getName())) != null && (view = componentView.getView()) != null && i != CollectionsKt.getLastIndex(list)) {
                        constraintSet.setMargin(view.getId(), 4, (int) ExtensionsKt.getDpToPx(16.0d));
                    }
                    i = i2;
                }
            }
        }
        if (!isModal) {
            root.setPadding(root.getPaddingLeft(), root.getPaddingTop(), root.getPaddingRight(), (int) ExtensionsKt.getDpToPx(24.0d));
        }
        constraintSet.applyTo(root);
        Context context2 = pi2UiMainViewContainerBindingInflate.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (!ContextUtils3.isTalkbackEnabled(context2) && shouldApplyFocus) {
            applyFocus(root);
        }
        ConstraintLayout root2 = pi2UiMainViewContainerBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View generateFooter(Context context, FooterComponent component, Map<String, ? extends UiComponentConfig> componentNameToComponent, boolean isLoading, Map<String, ComponentView> viewBindings, UiComponentHelper uiComponentHelper) {
        ArrayList arrayList = new ArrayList();
        List<View> treeView = parseTreeView(CollectionsKt.listOf(component), componentNameToComponent, context, isLoading, arrayList, uiComponentHelper);
        for (Object obj : arrayList) {
            viewBindings.put(((ComponentView) obj).getComponent().getName(), obj);
        }
        return (View) CollectionsKt.first((List) treeView);
    }

    public final void applyFocus(ConstraintLayout parentView) {
        Object next;
        Editable text;
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        ArrayList<View> focusables = parentView.getFocusables(2);
        Intrinsics.checkNotNullExpressionValue(focusables, "getFocusables(...)");
        Iterator<T> it = focusables.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            View view = (View) next;
            if ((view instanceof EditText) && ((text = ((EditText) view).getText()) == null || StringsKt.isBlank(text))) {
                break;
            }
        }
        final View view2 = (View) next;
        if (view2 != null) {
            view2.requestFocus();
            view2.post(new Runnable() { // from class: com.withpersona.sdk2.inquiry.steps.ui.UiStepUtils$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UiStepUtils.applyFocus$lambda$10$lambda$9(view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyFocus$lambda$10$lambda$9(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }

    private final List<View> parseTreeView(List<? extends UiComponent> components, Map<String, ? extends UiComponentConfig> componentNameToComponent, Context context, boolean isLoading, List<ComponentView> componentViews, UiComponentHelper uiComponentHelper) {
        View viewMakeView;
        ArrayList arrayList = new ArrayList();
        for (UiComponent uiComponent : components) {
            if (uiComponent instanceof ActionButtonComponent) {
                ActionButtonComponent actionButtonComponent = (ActionButtonComponent) uiComponent;
                UiComponentConfig uiComponentConfig = componentNameToComponent.get(actionButtonComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.ActionButton");
                viewMakeView = ActionButtonComponent2.makeView(actionButtonComponent, uiComponentHelper, (ActionButton) uiComponentConfig);
            } else if (uiComponent instanceof CancelButtonComponent) {
                CancelButtonComponent cancelButtonComponent = (CancelButtonComponent) uiComponent;
                UiComponentConfig uiComponentConfig2 = componentNameToComponent.get(cancelButtonComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.CancelButton");
                viewMakeView = CancelButtonComponent2.makeView(cancelButtonComponent, uiComponentHelper, (CancelButton) uiComponentConfig2);
            } else if (uiComponent instanceof CombinedStepButtonComponent) {
                CombinedStepButtonComponent combinedStepButtonComponent = (CombinedStepButtonComponent) uiComponent;
                UiComponentConfig uiComponentConfig3 = componentNameToComponent.get(combinedStepButtonComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepButton");
                viewMakeView = CombinedStepButtonComponent2.makeView(combinedStepButtonComponent, uiComponentHelper, (CombinedStepButton) uiComponentConfig3);
            } else if (uiComponent instanceof CompleteButtonComponent) {
                CompleteButtonComponent completeButtonComponent = (CompleteButtonComponent) uiComponent;
                UiComponentConfig uiComponentConfig4 = componentNameToComponent.get(completeButtonComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.CompleteButton");
                viewMakeView = CompleteButtonComponent2.makeView(completeButtonComponent, uiComponentHelper, (CompleteButton) uiComponentConfig4);
            } else if (uiComponent instanceof SubmitButtonComponent) {
                SubmitButtonComponent submitButtonComponent = (SubmitButtonComponent) uiComponent;
                UiComponentConfig uiComponentConfig5 = componentNameToComponent.get(submitButtonComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig5, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.SubmitButton");
                viewMakeView = SubmitButtonComponent2.makeView(submitButtonComponent, uiComponentHelper, (SubmitButton) uiComponentConfig5);
            } else if (uiComponent instanceof ESignatureComponent) {
                ESignatureComponent eSignatureComponent = (ESignatureComponent) uiComponent;
                UiComponentConfig uiComponentConfig6 = componentNameToComponent.get(eSignatureComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig6, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature");
                viewMakeView = ESignatureComponent2.makeView(eSignatureComponent, uiComponentHelper, (ESignature) uiComponentConfig6);
            } else if (uiComponent instanceof GovernmentIdNfcScanComponent) {
                GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) uiComponent;
                UiComponentConfig uiComponentConfig7 = componentNameToComponent.get(governmentIdNfcScanComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig7, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan");
                viewMakeView = GovernmentIdNfcScanComponent2.makeView(governmentIdNfcScanComponent, uiComponentHelper, (GovernmentIdNfcScan) uiComponentConfig7);
            } else if (uiComponent instanceof ImagePreviewComponent) {
                ImagePreviewComponent imagePreviewComponent = (ImagePreviewComponent) uiComponent;
                UiComponentConfig uiComponentConfig8 = componentNameToComponent.get(imagePreviewComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig8, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepImagePreview");
                viewMakeView = ImagePreviewComponent2.makeView(imagePreviewComponent, uiComponentHelper, (CombinedStepImagePreview) uiComponentConfig8);
            } else if (uiComponent instanceof InputAddressComponent) {
                InputAddressComponent inputAddressComponent = (InputAddressComponent) uiComponent;
                UiComponentConfig uiComponentConfig9 = componentNameToComponent.get(inputAddressComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig9, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress");
                viewMakeView = InputAddressComponent2.makeView(inputAddressComponent, uiComponentHelper, (InputAddress) uiComponentConfig9);
            } else if (uiComponent instanceof InputCheckboxComponent) {
                InputCheckboxComponent inputCheckboxComponent = (InputCheckboxComponent) uiComponent;
                UiComponentConfig uiComponentConfig10 = componentNameToComponent.get(inputCheckboxComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig10, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox");
                viewMakeView = InputCheckboxComponent2.makeView(inputCheckboxComponent, uiComponentHelper, (InputCheckbox) uiComponentConfig10);
            } else if (uiComponent instanceof InputCheckboxGroupComponent) {
                InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) uiComponent;
                UiComponentConfig uiComponentConfig11 = componentNameToComponent.get(inputCheckboxGroupComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig11, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup");
                viewMakeView = InputCheckboxGroupComponent2.makeView(inputCheckboxGroupComponent, uiComponentHelper, (InputGroup) uiComponentConfig11);
            } else if (uiComponent instanceof InputConfirmationCodeComponent) {
                InputConfirmationCodeComponent inputConfirmationCodeComponent = (InputConfirmationCodeComponent) uiComponent;
                UiComponentConfig uiComponentConfig12 = componentNameToComponent.get(inputConfirmationCodeComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig12, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputConfirmationCode");
                viewMakeView = InputConfirmationCodeComponent2.makeView(inputConfirmationCodeComponent, uiComponentHelper, (InputConfirmationCode) uiComponentConfig12);
            } else if (uiComponent instanceof InputDateComponent) {
                InputDateComponent inputDateComponent = (InputDateComponent) uiComponent;
                UiComponentConfig uiComponentConfig13 = componentNameToComponent.get(inputDateComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig13, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate");
                viewMakeView = InputDateComponent2.makeView$default(inputDateComponent, uiComponentHelper, null, (InputDate) uiComponentConfig13, 2, null);
            } else if (uiComponent instanceof InputMaskedTextComponent) {
                InputMaskedTextComponent inputMaskedTextComponent = (InputMaskedTextComponent) uiComponent;
                UiComponentConfig uiComponentConfig14 = componentNameToComponent.get(inputMaskedTextComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig14, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMaskedText");
                viewMakeView = InputMaskedTextComponent2.makeView(inputMaskedTextComponent, uiComponentHelper, (InputMaskedText) uiComponentConfig14);
            } else if (uiComponent instanceof InputMultiSelectComponent) {
                InputMultiSelectComponent inputMultiSelectComponent = (InputMultiSelectComponent) uiComponent;
                UiComponentConfig uiComponentConfig15 = componentNameToComponent.get(inputMultiSelectComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig15, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMultiSelect");
                viewMakeView = InputMultiSelectComponent2.makeView(inputMultiSelectComponent, uiComponentHelper, (InputMultiSelect) uiComponentConfig15);
            } else if (uiComponent instanceof InputNumberComponent) {
                InputNumberComponent inputNumberComponent = (InputNumberComponent) uiComponent;
                UiComponentConfig uiComponentConfig16 = componentNameToComponent.get(inputNumberComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig16, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputNumber");
                viewMakeView = InputNumberComponent2.makeView(inputNumberComponent, uiComponentHelper, (InputNumber) uiComponentConfig16);
            } else if (uiComponent instanceof InputPhoneNumberComponent) {
                InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) uiComponent;
                UiComponentConfig uiComponentConfig17 = componentNameToComponent.get(inputPhoneNumberComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig17, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputPhoneNumber");
                viewMakeView = InputPhoneNumberComponent2.makeView(inputPhoneNumberComponent, uiComponentHelper, (InputPhoneNumber) uiComponentConfig17);
            } else if (uiComponent instanceof InputRadioGroupComponent) {
                InputRadioGroupComponent inputRadioGroupComponent = (InputRadioGroupComponent) uiComponent;
                UiComponentConfig uiComponentConfig18 = componentNameToComponent.get(inputRadioGroupComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig18, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup");
                viewMakeView = InputRadioGroupComponent2.makeView(inputRadioGroupComponent, uiComponentHelper, (InputGroup2) uiComponentConfig18);
            } else if (uiComponent instanceof InputSelectComponent) {
                InputSelectComponent inputSelectComponent = (InputSelectComponent) uiComponent;
                UiComponentConfig uiComponentConfig19 = componentNameToComponent.get(inputSelectComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig19, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputSelect");
                viewMakeView = InputSelectComponent2.makeView(inputSelectComponent, uiComponentHelper, (InputSelect) uiComponentConfig19);
            } else if (uiComponent instanceof InputTextComponent) {
                InputTextComponent inputTextComponent = (InputTextComponent) uiComponent;
                UiComponentConfig uiComponentConfig20 = componentNameToComponent.get(inputTextComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig20, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText");
                viewMakeView = InputTextComponent2.makeView$default(inputTextComponent, uiComponentHelper, (InputText) uiComponentConfig20, null, 4, null);
            } else if (uiComponent instanceof LocalImageComponent) {
                LocalImageComponent localImageComponent = (LocalImageComponent) uiComponent;
                UiComponentConfig uiComponentConfig21 = componentNameToComponent.get(localImageComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig21, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage");
                viewMakeView = LocalImageComponent2.makeView(localImageComponent, uiComponentHelper, (LocalImage) uiComponentConfig21);
            } else if (uiComponent instanceof PrivacyPolicyComponent) {
                PrivacyPolicyComponent privacyPolicyComponent = (PrivacyPolicyComponent) uiComponent;
                UiComponentConfig uiComponentConfig22 = componentNameToComponent.get(privacyPolicyComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig22, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.PrivacyPolicy");
                viewMakeView = PrivacyPolicyComponent2.makeView(privacyPolicyComponent, uiComponentHelper, (PrivacyPolicy) uiComponentConfig22);
            } else if (uiComponent instanceof QRCodeComponent) {
                QRCodeComponent qRCodeComponent = (QRCodeComponent) uiComponent;
                UiComponentConfig uiComponentConfig23 = componentNameToComponent.get(qRCodeComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig23, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.QRCode");
                viewMakeView = QRCodeComponent2.makeView(qRCodeComponent, uiComponentHelper, (QRCode) uiComponentConfig23);
            } else if (uiComponent instanceof RemoteImageComponent) {
                RemoteImageComponent remoteImageComponent = (RemoteImageComponent) uiComponent;
                UiComponentConfig uiComponentConfig24 = componentNameToComponent.get(remoteImageComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig24, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage");
                viewMakeView = RemoteImageComponent2.makeView(remoteImageComponent, uiComponentHelper, (RemoteImage) uiComponentConfig24);
            } else if (uiComponent instanceof SpacerComponent) {
                viewMakeView = SpacerComponent2.makeView((SpacerComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof TextComponent) {
                TextComponent textComponent = (TextComponent) uiComponent;
                UiComponentConfig uiComponentConfig25 = componentNameToComponent.get(textComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig25, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.Text");
                viewMakeView = TextComponent2.makeView(textComponent, uiComponentHelper, (Text) uiComponentConfig25);
            } else if (uiComponent instanceof TitleComponent) {
                TitleComponent titleComponent = (TitleComponent) uiComponent;
                UiComponentConfig uiComponentConfig26 = componentNameToComponent.get(titleComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig26, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.Title");
                viewMakeView = TitleComponent2.makeView(titleComponent, uiComponentHelper, (Title) uiComponentConfig26);
            } else if (uiComponent instanceof InputTextAreaComponent) {
                InputTextAreaComponent inputTextAreaComponent = (InputTextAreaComponent) uiComponent;
                UiComponentConfig uiComponentConfig27 = componentNameToComponent.get(inputTextAreaComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig27, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputTextArea");
                viewMakeView = InputTextAreaComponent2.makeView(inputTextAreaComponent, uiComponentHelper, (InputTextArea) uiComponentConfig27);
            } else if (uiComponent instanceof BrandingComponent) {
                viewMakeView = BrandingComponent2.makeView((BrandingComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof CreatePersonaSheetComponent) {
                viewMakeView = CreatePersonaSheetComponent2.makeView((CreatePersonaSheetComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof VerifyPersonaButtonComponent) {
                VerifyPersonaButtonComponent verifyPersonaButtonComponent = (VerifyPersonaButtonComponent) uiComponent;
                UiComponentConfig uiComponentConfig28 = componentNameToComponent.get(verifyPersonaButtonComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig28, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.VerifyPersonaButton");
                viewMakeView = VerifyPersonaButtonComponent2.makeView(verifyPersonaButtonComponent, uiComponentHelper, (VerifyPersonaButton) uiComponentConfig28);
            } else if (uiComponent instanceof ClickableStackComponent) {
                ClickableStackComponent clickableStackComponent = (ClickableStackComponent) uiComponent;
                List<View> treeView = INSTANCE.parseTreeView(clickableStackComponent.getChildren(), componentNameToComponent, context, isLoading, componentViews, uiComponentHelper);
                UiComponentConfig uiComponentConfig29 = componentNameToComponent.get(clickableStackComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig29, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack");
                viewMakeView = ClickableStackComponent2.makeView(clickableStackComponent, uiComponentHelper, componentViews, treeView, (ClickableStack) uiComponentConfig29);
            } else if (uiComponent instanceof HorizontalStackComponent) {
                HorizontalStackComponent horizontalStackComponent = (HorizontalStackComponent) uiComponent;
                List<View> treeView2 = INSTANCE.parseTreeView(horizontalStackComponent.getChildren(), componentNameToComponent, context, isLoading, componentViews, uiComponentHelper);
                UiComponentConfig uiComponentConfig30 = componentNameToComponent.get(horizontalStackComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig30, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.HorizontalStack");
                viewMakeView = HorizontalStackComponent2.makeView(horizontalStackComponent, uiComponentHelper, componentViews, treeView2, (HorizontalStack) uiComponentConfig30);
            } else if (uiComponent instanceof FooterComponent) {
                FooterComponent footerComponent = (FooterComponent) uiComponent;
                List<View> treeView3 = INSTANCE.parseTreeView(footerComponent.getChildren(), componentNameToComponent, context, isLoading, componentViews, uiComponentHelper);
                UiComponentConfig uiComponentConfig31 = componentNameToComponent.get(footerComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig31, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer");
                viewMakeView = FooterComponent2.makeView(footerComponent, uiComponentHelper, componentViews, treeView3, (Footer) uiComponentConfig31);
            } else if (uiComponent instanceof InputCurrencyComponent) {
                InputCurrencyComponent inputCurrencyComponent = (InputCurrencyComponent) uiComponent;
                UiComponentConfig uiComponentConfig32 = componentNameToComponent.get(inputCurrencyComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig32, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCurrency");
                viewMakeView = InputCurrencyComponent2.makeView(inputCurrencyComponent, uiComponentHelper, (InputCurrency) uiComponentConfig32);
            } else {
                if (!(uiComponent instanceof InputInternationalDbComponent)) {
                    throw new NoWhenBranchMatchedException();
                }
                InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) uiComponent;
                UiComponentConfig uiComponentConfig33 = componentNameToComponent.get(inputInternationalDbComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig33, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb");
                viewMakeView = InputInternationalDbComponent2.makeView(inputInternationalDbComponent, uiComponentHelper, (InputInternationalDb) uiComponentConfig33);
            }
            if (viewMakeView != null) {
                componentViews.add(new ComponentView(uiComponent, viewMakeView));
            }
            if (viewMakeView != null) {
                arrayList.add(viewMakeView);
            }
        }
        return arrayList;
    }
}
