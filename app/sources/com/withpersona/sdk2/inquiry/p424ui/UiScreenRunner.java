package com.withpersona.sdk2.inquiry.p424ui;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.net.Uri2;
import androidx.core.view.ViewGroup2;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.squareup.workflow1.p415ui.BuilderViewFactory;
import com.squareup.workflow1.p415ui.LayoutRunner;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.squareup.workflow1.p415ui.ViewShowRendering;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.CreatePersonaSheet;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputNumber;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.p424ui.UiScreenRunner;
import com.withpersona.sdk2.inquiry.p424ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.p424ui.databinding.Pi2InquiryUiBinding;
import com.withpersona.sdk2.inquiry.p424ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.p424ui.network.ComponentParam2;
import com.withpersona.sdk2.inquiry.shared.ContextUtils3;
import com.withpersona.sdk2.inquiry.shared.ResTools;
import com.withpersona.sdk2.inquiry.shared.SnackBarState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationUtils2;
import com.withpersona.sdk2.inquiry.shared.p422ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.p422ui.InsetsUtils;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiControllerUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.ComponentView;
import com.withpersona.sdk2.inquiry.steps.p423ui.NestedUiStep;
import com.withpersona.sdk2.inquiry.steps.p423ui.R$id;
import com.withpersona.sdk2.inquiry.steps.p423ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.p423ui.UiStepUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.UiStepUtils6;
import com.withpersona.sdk2.inquiry.steps.p423ui.UiStepUtils7;
import com.withpersona.sdk2.inquiry.steps.p423ui.adapter.StyleableSelectArrayAdapter;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.ActionButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.BrandingComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.CancelButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.ClickableStackComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.CombinedStepButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.CompleteButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.ESignatureComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.FooterComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.GovernmentIdNfcScanComponent3;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.ImagePreviewComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputCheckboxComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputCheckboxGroupComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputConfirmationCodeComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputCurrencyComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputDateComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputInternationalDbComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputInternationalDbComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputMaskedTextComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputMultiSelectComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputNumberComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputPhoneNumberComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputPhoneNumberComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputRadioGroupComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputTextAreaComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputTextComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.LocalImageComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.MultiTextValueComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.PrivacyPolicyComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.QRCodeComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.RemoteImageComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.SheetComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.SpacerComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.SubmitButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.TextComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.TitleComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent3;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes3;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentGroup;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.CountryCodeUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.GovernmentIdNfcData;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.inputConfirmation.InputConfirmationComponentUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiAddressFieldBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiDateFieldBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiInputCheckboxBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiInputCheckboxGroupBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiInputPhoneNumberBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiInputRadioGroupBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiInternationalDbFieldBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiSignatureFieldBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.inputSelect.InputSelectBottomSheetController;
import com.withpersona.sdk2.inquiry.steps.p423ui.network.AddressAutocompleteResponse3;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.StackStyling2;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.AssociatedHideableView;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.ShadowedNestedScrollView;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.ViewUtils5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.FilesKt;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* compiled from: UiScreenRunner.kt */
@Metadata(m3635d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001RB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020(H\u0016J@\u0010)\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020(2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020+0\t2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020-0\tH\u0002JH\u0010.\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020(2\u0006\u0010/\u001a\u0002002\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020+0\t2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020-0\tH\u0002Jd\u00101\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u000b2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020+0\t2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020-0\t2\u0006\u0010'\u001a\u00020(2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\tH\u0002J0\u00103\u001a\u00020\u0016*\u00020\u000b2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020+0\t2\u0006\u0010/\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u001eH\u0002J(\u00105\u001a\u00020\u0016*\u00020\u000b2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020+0\t2\u0006\u0010/\u001a\u00020\u001aH\u0002J0\u00106\u001a\u00020\u0016*\u00020\u000b2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020+0\t2\u0006\u0010/\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u001eH\u0002J\u001e\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u0002092\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001a0;H\u0002J \u0010<\u001a\u00020\u00162\u0006\u00108\u001a\u0002092\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0002J \u0010A\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00022\u0006\u0010/\u001a\u00020B2\u0006\u00102\u001a\u00020CH\u0002J\"\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020E0\t2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020F0;H\u0002J>\u0010G\u001a\u00020\u00162\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020+0\t2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020E0J2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020F0;H\u0002J\f\u0010L\u001a\u00020M*\u00020\nH\u0002J\f\u0010L\u001a\u00020N*\u00020OH\u0002J\u0012\u0010L\u001a\u00020P*\b\u0012\u0004\u0012\u00020\n0;H\u0002J$\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020+0\t*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020E0\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R>\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00160\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00160!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00160!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006S"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiScreenRunner;", "Lcom/squareup/workflow1/ui/LayoutRunner;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Screen$EntryScreen;", "binding", "Lcom/withpersona/sdk2/inquiry/ui/databinding/Pi2InquiryUiBinding;", "initialRendering", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/databinding/Pi2InquiryUiBinding;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Screen$EntryScreen;)V", "componentNameToView", "", "", "Landroid/view/View;", "componentNameToConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "inputSelectBottomSheetController", "Lcom/withpersona/sdk2/inquiry/steps/ui/inputSelect/InputSelectBottomSheetController;", "signatureBottomSheetController", "Lcom/withpersona/sdk2/inquiry/ui/SignatureBottomSheetController;", "nestedUiBottomSheetController", "Lcom/withpersona/sdk2/inquiry/ui/NestedUiBottomSheetController;", "onComplete", "Lkotlin/Function0;", "", "onCancel", "onClick", "Lkotlin/Function2;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lkotlin/ParameterName;", "name", "tappedComponent", "", "isTappedComponentVisible", "launchNfcScan", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "onVerifyPersonaClick", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "showRendering", "rendering", "viewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "renderSheets", "componentParams", "", "errors", "Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;", "updateSheet", "component", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;", "updateRendering", "view", "applyComponentState", "isLoading", "applyHiddenState", "applyDisabledState", "attachFooter", "result", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiScreenGenerationResult;", "components", "", "setupFooterSheet", "firstBelowTheFoldChildIndex", "", "footerComponent", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;", "renderClickableStackForState", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getComponentsParams", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "Lcom/withpersona/sdk2/inquiry/steps/ui/ComponentView;", "parseComponentsParamsInto", "initialComponentValues", "outMap", "", "componentViews", "to", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;", "toComponentValues", "Companion", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SuppressLint({"ResourceType"})
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class UiScreenRunner implements LayoutRunner<UiWorkflow.Screen.EntryScreen> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Pi2InquiryUiBinding binding;
    private final Map<String, UiComponentConfig> componentNameToConfig;
    private final Map<String, View> componentNameToView;
    private final InputSelectBottomSheetController inputSelectBottomSheetController;
    private Function1<? super GovernmentIdNfcScanComponent, Unit> launchNfcScan;
    private final NestedUiBottomSheetController nestedUiBottomSheetController;
    private Function0<Unit> onCancel;
    private Function2<? super UiComponent, ? super Boolean, Unit> onClick;
    private Function0<Unit> onComplete;
    private Function1<? super VerifyPersonaButtonComponent, Unit> onVerifyPersonaClick;
    private final SignatureBottomSheetController signatureBottomSheetController;

    public UiScreenRunner(Pi2InquiryUiBinding binding, UiWorkflow.Screen.EntryScreen initialRendering) {
        Map<String, UiComponentConfig> map;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        this.binding = binding;
        CoordinatorLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.inputSelectBottomSheetController = new InputSelectBottomSheetController(root);
        CoordinatorLayout root2 = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        this.signatureBottomSheetController = new SignatureBottomSheetController(root2);
        CoordinatorLayout root3 = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
        this.nestedUiBottomSheetController = new NestedUiBottomSheetController(root3);
        this.onComplete = new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        };
        this.onCancel = new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        };
        this.onClick = new Function2() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return UiScreenRunner.onClick$lambda$2((UiComponent) obj, ((Boolean) obj2).booleanValue());
            }
        };
        this.launchNfcScan = new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiScreenRunner.launchNfcScan$lambda$3((GovernmentIdNfcScanComponent) obj);
            }
        };
        this.onVerifyPersonaClick = new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiScreenRunner.onVerifyPersonaClick$lambda$4((VerifyPersonaButtonComponent) obj);
            }
        };
        Context context = binding.getRoot().getContext();
        UiStepUtils uiStepUtils = UiStepUtils.INSTANCE;
        Intrinsics.checkNotNull(context);
        List<UiComponent> components = initialRendering.getComponents();
        List<UiComponentConfig> componentConfigs = initialRendering.getComponentConfigs();
        final UiStepUtils6 uiStepUtils6GenerateViewsFromUiScreen$default = UiStepUtils.generateViewsFromUiScreen$default(uiStepUtils, context, new UiComponentScreen(components, componentConfigs == null ? CollectionsKt.emptyList() : componentConfigs, initialRendering.getStyles()), initialRendering.getIsLoading(), false, false, 16, null);
        Integer backgroundColor = initialRendering.getBackgroundColor();
        if (backgroundColor != null) {
            binding.rootLayout.setBackgroundColor(backgroundColor.intValue());
        }
        Drawable drawableBackgroundImageDrawable = initialRendering.backgroundImageDrawable(context);
        if (drawableBackgroundImageDrawable != null) {
            binding.rootLayout.setBackground(drawableBackgroundImageDrawable);
            binding.footerContainer.setBackgroundColor(0);
        }
        Integer headerButtonColor = initialRendering.getHeaderButtonColor();
        if (headerButtonColor != null) {
            binding.navigationBar.setControlsColor(headerButtonColor.intValue());
        }
        List<UiComponentConfig> componentConfigs2 = initialRendering.getComponentConfigs();
        this.componentNameToConfig = (componentConfigs2 == null || (map = UiComponent3.toMap(componentConfigs2)) == null) ? MapsKt.emptyMap() : map;
        Set<Map.Entry<String, ComponentView>> setEntrySet = uiStepUtils6GenerateViewsFromUiScreen$default.getViewBindings().getComponentNameToComponentView().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to(entry.getKey(), ((ComponentView) entry.getValue()).getView());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        this.componentNameToView = linkedHashMap;
        this.binding.uiStepContainer.addView(uiStepUtils6GenerateViewsFromUiScreen$default.getContentView());
        if (initialRendering.getPageLevelVerticalAlignment() == StyleElements.PositionType.CENTER) {
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(this.binding.container);
            constraintSet.connect(this.binding.uiStepContainer.getId(), 4, this.binding.container.getId(), 4);
            constraintSet.applyTo(this.binding.container);
        }
        if (uiStepUtils6GenerateViewsFromUiScreen$default.getFooterView() != null) {
            attachFooter(uiStepUtils6GenerateViewsFromUiScreen$default, initialRendering.getComponents());
        }
        CoordinatorLayout root4 = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root4, "getRoot(...)");
        InsetsUtils.onInsetsChanged(root4, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiScreenRunner._init_$lambda$11(uiStepUtils6GenerateViewsFromUiScreen$default, this, (WindowInsetsCompat) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClick$lambda$2(UiComponent uiComponent, boolean z) {
        Intrinsics.checkNotNullParameter(uiComponent, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchNfcScan$lambda$3(GovernmentIdNfcScanComponent governmentIdNfcScanComponent) {
        Intrinsics.checkNotNullParameter(governmentIdNfcScanComponent, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onVerifyPersonaClick$lambda$4(VerifyPersonaButtonComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$11(UiStepUtils6 uiStepUtils6, UiScreenRunner uiScreenRunner, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insetsIgnoringVisibility = insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        int i = insets2.bottom;
        int i2 = insetsIgnoringVisibility.top;
        int iMax = Integer.max(insetsIgnoringVisibility.bottom, i);
        int i3 = insetsIgnoringVisibility.left;
        int i4 = insetsIgnoringVisibility.right;
        View footerView = uiStepUtils6.getFooterView();
        if (footerView == null) {
            uiScreenRunner.binding.nestedScroll.setPadding(i3, i2, i4, iMax);
        } else {
            ShadowedNestedScrollView nestedScroll = uiScreenRunner.binding.nestedScroll;
            Intrinsics.checkNotNullExpressionValue(nestedScroll, "nestedScroll");
            nestedScroll.setPadding(i3, i2, i4, nestedScroll.getPaddingBottom());
            footerView.setPadding(i3, footerView.getPaddingTop(), i4, iMax);
        }
        MaterialDivider footerDivider = uiScreenRunner.binding.footerDivider;
        Intrinsics.checkNotNullExpressionValue(footerDivider, "footerDivider");
        ViewGroup.LayoutParams layoutParams = footerDivider.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = insetsIgnoringVisibility.bottom;
            footerDivider.setLayoutParams(marginLayoutParams);
            CoordinatorLayout footerSheetCoordinatorLayout = uiScreenRunner.binding.footerSheetCoordinatorLayout;
            Intrinsics.checkNotNullExpressionValue(footerSheetCoordinatorLayout, "footerSheetCoordinatorLayout");
            footerSheetCoordinatorLayout.setPadding(i3, footerSheetCoordinatorLayout.getPaddingTop(), i4, iMax);
            return Unit.INSTANCE;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Override // com.squareup.workflow1.p415ui.LayoutRunner
    public void showRendering(final UiWorkflow.Screen.EntryScreen rendering, ViewEnvironment viewEnvironment) {
        int colorFromAttr$default;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Context context = this.binding.getRoot().getContext();
        List<UiComponent> components = rendering.getComponents();
        final ArrayList<ComponentView> arrayList = new ArrayList();
        for (UiComponent uiComponent : components) {
            View view = this.componentNameToView.get(uiComponent.getName());
            ComponentView componentView = view == null ? null : new ComponentView(uiComponent, view);
            if (componentView != null) {
                arrayList.add(componentView);
            }
        }
        Map<String, ComponentParam> componentsParams = getComponentsParams(arrayList);
        Map<String, Object> componentValues = toComponentValues(componentsParams);
        List<UiComponentError> componentErrors = rendering.getComponentErrors();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(componentErrors, 10)), 16));
        for (Object obj : componentErrors) {
            linkedHashMap.put(((UiComponentError) obj).getName(), obj);
        }
        Integer backgroundColor = rendering.getBackgroundColor();
        if (backgroundColor == null || backgroundColor.intValue() == 0) {
            Intrinsics.checkNotNull(context);
            colorFromAttr$default = ResTools.getColorFromAttr$default(context, R.attr.colorBackground, null, false, 6, null);
        } else {
            colorFromAttr$default = backgroundColor.intValue();
        }
        SystemUiControllerUtils.updateSystemUiColor(viewEnvironment, colorFromAttr$default);
        for (ComponentView componentView2 : arrayList) {
            updateRendering(rendering, componentView2.getComponent(), componentView2.getView(), componentValues, linkedHashMap, viewEnvironment, this.componentNameToConfig);
        }
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiScreenRunner.showRendering$lambda$15(this.f$0, rendering);
            }
        };
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiScreenRunner.showRendering$lambda$16(rendering);
            }
        };
        Pi2NavigationBar navigationBar = this.binding.navigationBar;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        NavigationUtils2.applyNavigationState(navigationState, function0, function02, navigationBar, root);
        CoordinatorLayout root2 = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        SnackBarState.renderErrorSnackbarIfNeeded$default(root2, rendering.getError(), rendering.getOnErrorDismissed(), null, 0, 0, 56, null);
        this.onComplete = rendering.getOnComplete();
        this.onCancel = rendering.getOnCancel();
        this.onClick = new Function2() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return UiScreenRunner.showRendering$lambda$17(rendering, this, arrayList, (UiComponent) obj2, ((Boolean) obj3).booleanValue());
            }
        };
        this.launchNfcScan = rendering.getLaunchNfcScan();
        this.onVerifyPersonaClick = new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return UiScreenRunner.showRendering$lambda$18(rendering, this, arrayList, (VerifyPersonaButtonComponent) obj2);
            }
        };
        UiWorkflow.Screen.EntryScreen.AutoSubmit autoSubmit = rendering.getAutoSubmit();
        if (autoSubmit != null) {
            if (autoSubmit.getIsReadyToSubmit()) {
                UiComponent2 component = autoSubmit.getComponent();
                if ((component instanceof ActionButtonComponent) || (component instanceof SubmitButtonComponent)) {
                    Function2<? super UiComponent, ? super Boolean, Unit> function2 = this.onClick;
                    View view2 = this.componentNameToView.get(component.getName());
                    boolean z = false;
                    if (view2 != null && view2.getVisibility() == 0) {
                        z = true;
                    }
                    function2.invoke(component, Boolean.valueOf(z));
                } else if (component instanceof CancelButtonComponent) {
                    this.onCancel.invoke();
                } else if (component instanceof CompleteButtonComponent) {
                    this.onComplete.invoke();
                }
            } else if (autoSubmit.getCountdownText() != null) {
                View view3 = this.componentNameToView.get(autoSubmit.getComponent().getName());
                if (view3 instanceof ButtonWithLoadingIndicator) {
                    ((ButtonWithLoadingIndicator) view3).setText(autoSubmit.getCountdownText());
                } else if (view3 instanceof MaterialButton) {
                    ((MaterialButton) view3).setText(autoSubmit.getCountdownText());
                }
            }
        }
        renderSheets(rendering, viewEnvironment, componentsParams, linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$15(UiScreenRunner uiScreenRunner, UiWorkflow.Screen.EntryScreen entryScreen) {
        if (!uiScreenRunner.inputSelectBottomSheetController.close() && !uiScreenRunner.signatureBottomSheetController.close()) {
            if (entryScreen.getNavigationState().getShowBackButton()) {
                entryScreen.getOnBack().invoke();
            } else {
                entryScreen.getOnCancel().invoke();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$16(UiWorkflow.Screen.EntryScreen entryScreen) {
        entryScreen.getOnCancel().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$17(UiWorkflow.Screen.EntryScreen entryScreen, UiScreenRunner uiScreenRunner, List list, UiComponent tappedComponent, boolean z) {
        Intrinsics.checkNotNullParameter(tappedComponent, "tappedComponent");
        entryScreen.getOnClick().invoke(tappedComponent, Boolean.valueOf(z), uiScreenRunner.getComponentsParams(list));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$18(UiWorkflow.Screen.EntryScreen entryScreen, UiScreenRunner uiScreenRunner, List list, VerifyPersonaButtonComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        entryScreen.getOnVerifyPersonaClick().invoke(it, uiScreenRunner.getComponentsParams(list));
        return Unit.INSTANCE;
    }

    private final void renderSheets(UiWorkflow.Screen.EntryScreen rendering, ViewEnvironment viewEnvironment, Map<String, ? extends Object> componentParams, Map<String, ? extends UiComponentError> errors) {
        Object next;
        List<UiComponent> components = rendering.getComponents();
        ArrayList arrayList = new ArrayList();
        for (Object obj : components) {
            if (obj instanceof SheetComponent) {
                arrayList.add(obj);
            }
        }
        SheetComponent currentSheetComponent = this.nestedUiBottomSheetController.getCurrentSheetComponent();
        if (currentSheetComponent != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.areEqual(((SheetComponent) next).getName(), currentSheetComponent.getName())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SheetComponent sheetComponent = (SheetComponent) next;
            if (sheetComponent != null && !sheetComponent.getShowing()) {
                this.nestedUiBottomSheetController.hide();
            }
        }
        if (this.nestedUiBottomSheetController.getCurrentSheetComponent() == null) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                SheetComponent sheetComponent2 = (SheetComponent) it2.next();
                if (!sheetComponent2.getShown()) {
                    sheetComponent2.setShowing(true);
                    this.nestedUiBottomSheetController.show(sheetComponent2, viewEnvironment);
                    break;
                }
            }
        }
        SheetComponent currentSheetComponent2 = this.nestedUiBottomSheetController.getCurrentSheetComponent();
        if (currentSheetComponent2 != null) {
            updateSheet(rendering, viewEnvironment, currentSheetComponent2, componentParams, errors);
        }
    }

    private final void updateSheet(final UiWorkflow.Screen.EntryScreen rendering, ViewEnvironment viewEnvironment, final SheetComponent component, Map<String, ? extends Object> componentParams, Map<String, ? extends UiComponentError> errors) {
        UiStepUtils7 viewBindings;
        Map<String, ComponentView> componentNameToComponentView;
        if (!(component instanceof CreatePersonaSheetComponent)) {
            throw new NoWhenBranchMatchedException();
        }
        CreatePersonaSheet.CardCtaPage.ComponentNameMapping componentNameMapping = ((CreatePersonaSheetComponent) component).getCtaCard().getComponentNameMapping();
        List<Tuples2<String, Function1<UiComponent, Unit>>> listBuild = new NestedUiStep.ComponentActionsBuilder().addAction(componentNameMapping != null ? componentNameMapping.getStartButton() : null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiScreenRunner.updateSheet$lambda$23(rendering, component, (UiComponent) obj);
            }
        }).addAction(componentNameMapping != null ? componentNameMapping.getDismissButton() : null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiScreenRunner.updateSheet$lambda$24(this.f$0, (UiComponent) obj);
            }
        }).build();
        UiStepUtils6 uiScreenGenerationResult = this.nestedUiBottomSheetController.getUiScreenGenerationResult();
        if (uiScreenGenerationResult == null || (viewBindings = uiScreenGenerationResult.getViewBindings()) == null || (componentNameToComponentView = viewBindings.getComponentNameToComponentView()) == null) {
            return;
        }
        for (Map.Entry<String, ComponentView> entry : componentNameToComponentView.entrySet()) {
            updateRendering(rendering, entry.getValue().getComponent(), entry.getValue().getView(), componentParams, errors, viewEnvironment, this.componentNameToConfig);
        }
        for (Tuples2<String, Function1<UiComponent, Unit>> tuples2 : listBuild) {
            String first = tuples2.getFirst();
            final Function1<UiComponent, Unit> second = tuples2.getSecond();
            final ComponentView componentView = componentNameToComponentView.get(first);
            if (componentView != null) {
                componentView.getView().setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda12
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        UiScreenRunner.updateSheet$lambda$28$lambda$27$lambda$26(second, componentView, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit updateSheet$lambda$23(UiWorkflow.Screen.EntryScreen entryScreen, SheetComponent sheetComponent, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        entryScreen.getOnCreateReusablePersonaClick().invoke(sheetComponent, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateSheet$lambda$24(UiScreenRunner uiScreenRunner, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        uiScreenRunner.nestedUiBottomSheetController.hide();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateSheet$lambda$28$lambda$27$lambda$26(Function1 function1, ComponentView componentView, View view) {
        function1.invoke(componentView.getComponent());
    }

    private final void updateRendering(final UiWorkflow.Screen.EntryScreen rendering, final UiComponent component, final View view, Map<String, ? extends Object> componentParams, Map<String, ? extends UiComponentError> errors, final ViewEnvironment viewEnvironment, Map<String, ? extends UiComponentConfig> componentNameToConfig) {
        InputTextBasedComponentStyle documentNumberStyle;
        InputTextBasedComponentStyle cardAccessNumberStyle;
        String placeholder;
        InputTextBasedComponentStyle styles;
        Map<String, ? extends UiComponentError> map;
        InputTextBasedComponentStyle inputTextStyle;
        InputTextBasedComponentStyle inputTextStyle2;
        Map<String, ? extends UiComponentError> map2 = errors;
        if (component instanceof CompleteButtonComponent) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.Button");
            ((Button) view).setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda13
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    UiScreenRunner.updateRendering$lambda$30$lambda$29(this.f$0, view2);
                }
            });
            applyComponentState(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof SubmitButtonComponent) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator");
            ButtonWithLoadingIndicator buttonWithLoadingIndicator = (ButtonWithLoadingIndicator) view;
            buttonWithLoadingIndicator.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda19
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    UiScreenRunner.updateRendering$lambda$32$lambda$31(this.f$0, component, view, view2);
                }
            });
            buttonWithLoadingIndicator.setIsLoading(rendering.getIsLoading() && ((SubmitButtonComponent) component).getWasTapped());
            applyComponentState(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof ActionButtonComponent) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator");
            ButtonWithLoadingIndicator buttonWithLoadingIndicator2 = (ButtonWithLoadingIndicator) view;
            buttonWithLoadingIndicator2.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    UiScreenRunner.updateRendering$lambda$34$lambda$33(this.f$0, component, view, view2);
                }
            });
            buttonWithLoadingIndicator2.setIsLoading(rendering.getIsLoading() && ((ActionButtonComponent) component).getWasTapped());
            applyComponentState(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof CancelButtonComponent) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.Button");
            ((Button) view).setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda21
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    UiScreenRunner.updateRendering$lambda$36$lambda$35(this.f$0, view2);
                }
            });
            applyComponentState(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof VerifyPersonaButtonComponent) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda22
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    UiScreenRunner.updateRendering$lambda$37(this.f$0, component, view2);
                }
            });
            ButtonWithLoadingIndicator buttonWithLoadingIndicator3 = view instanceof ButtonWithLoadingIndicator ? (ButtonWithLoadingIndicator) view : null;
            if (buttonWithLoadingIndicator3 != null) {
                buttonWithLoadingIndicator3.setIsLoading(rendering.getIsLoading() && ((VerifyPersonaButtonComponent) component).getWasTapped());
            }
            applyComponentState(view, componentParams, component, rendering.getIsLoading());
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (component instanceof InputTextComponent) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            TextInputLayout textInputLayout = (TextInputLayout) view;
            InputTextComponent inputTextComponent = (InputTextComponent) component;
            UiComponentError uiComponentError = map2.get(inputTextComponent.getName());
            UiComponentError.UiInputComponentError uiInputComponentError = uiComponentError instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError : null;
            ViewUtils5.setOrClearError(textInputLayout, uiInputComponentError != null ? uiInputComponentError.getMessage() : null, inputTextComponent.getErrorTextStyle());
            applyComponentState(view, componentParams, component, rendering.getIsLoading());
            Unit unit2 = Unit.INSTANCE;
            return;
        }
        if (component instanceof InputTextAreaComponent) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            TextInputLayout textInputLayout2 = (TextInputLayout) view;
            InputTextAreaComponent inputTextAreaComponent = (InputTextAreaComponent) component;
            UiComponentError uiComponentError2 = map2.get(inputTextAreaComponent.getName());
            UiComponentError.UiInputComponentError uiInputComponentError2 = uiComponentError2 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError2 : null;
            ViewUtils5.setOrClearError(textInputLayout2, uiInputComponentError2 != null ? uiInputComponentError2.getMessage() : null, inputTextAreaComponent.getErrorTextStyle());
            applyComponentState(view, componentParams, component, rendering.getIsLoading());
            Unit unit3 = Unit.INSTANCE;
            return;
        }
        if (component instanceof InputConfirmationCodeComponent) {
            ((InputConfirmationCodeComponent) component).getSubmitCodeHelper().setSubmitCode(new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UiScreenRunner.updateRendering$lambda$40(view, rendering, this);
                }
            });
            applyComponentState(view, componentParams, component, rendering.getIsLoading());
            Unit unit4 = Unit.INSTANCE;
            return;
        }
        if (component instanceof InputAddressComponent) {
            Object tag = view.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiAddressFieldBinding");
            Pi2UiAddressFieldBinding pi2UiAddressFieldBinding = (Pi2UiAddressFieldBinding) tag;
            List<View> listListOf = CollectionsKt.listOf((Object[]) new TextInputLayout[]{pi2UiAddressFieldBinding.addressFieldExpanded, pi2UiAddressFieldBinding.addressSuite, pi2UiAddressFieldBinding.addressCity, pi2UiAddressFieldBinding.addressSubdivision, pi2UiAddressFieldBinding.addressPostalCode});
            InputAddressComponent inputAddressComponent = (InputAddressComponent) component;
            UiComponentConfig uiComponentConfig = componentNameToConfig.get(inputAddressComponent.getName());
            Intrinsics.checkNotNull(uiComponentConfig, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress");
            InputAddress inputAddress = (InputAddress) uiComponentConfig;
            UiComponentError uiComponentError3 = map2.get(inputAddressComponent.getName());
            UiComponentError.UiInputAddressComponentError uiInputAddressComponentError = uiComponentError3 instanceof UiComponentError.UiInputAddressComponentError ? (UiComponentError.UiInputAddressComponentError) uiComponentError3 : null;
            inputAddressComponent.getTextControllerForAddressStreet1().setTextValue(inputAddressComponent.getStreet1());
            Unit unit5 = Unit.INSTANCE;
            inputAddressComponent.getTextControllerForAddressStreet2().setTextValue(inputAddressComponent.getStreet2());
            inputAddressComponent.getTextControllerForAddressCity().setTextValue(inputAddressComponent.getCity());
            inputAddressComponent.getTextControllerForAddressSubdivision().setTextValue(inputAddressComponent.getSubdivision());
            inputAddressComponent.getTextControllerForAddressPostalCode().setTextValue(inputAddressComponent.getPostalCode());
            List<AddressAutocompleteResponse3> searchResults = inputAddressComponent.getSearchResults();
            if (searchResults == null) {
                searchResults = CollectionsKt.emptyList();
            }
            List<AddressAutocompleteResponse3> list = searchResults;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            List<AddressAutocompleteResponse3> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AddressAutocompleteResponse3) it.next()).toString());
            }
            List list3 = CollectionsKt.toList(arrayList);
            InputAddress.AddressComponentStyle styles2 = inputAddress.getStyles();
            StyleableSelectArrayAdapter styleableSelectArrayAdapter = new StyleableSelectArrayAdapter(context, R.layout.simple_list_item_1, list3, (styles2 == null || (inputTextStyle2 = styles2.getInputTextStyle()) == null) ? null : inputTextStyle2.getFocusedTextBasedStyle());
            MaterialAutoCompleteTextView addressFieldExpandedTextView = pi2UiAddressFieldBinding.addressFieldExpandedTextView;
            Intrinsics.checkNotNullExpressionValue(addressFieldExpandedTextView, "addressFieldExpandedTextView");
            updateRendering$lambda$51$setupAddressAutoCompleteTextView(addressFieldExpandedTextView, styleableSelectArrayAdapter, listListOf, pi2UiAddressFieldBinding, rendering, component, list);
            MaterialAutoCompleteTextView addressFieldCollapsedTextView = pi2UiAddressFieldBinding.addressFieldCollapsedTextView;
            Intrinsics.checkNotNullExpressionValue(addressFieldCollapsedTextView, "addressFieldCollapsedTextView");
            updateRendering$lambda$51$setupAddressAutoCompleteTextView(addressFieldCollapsedTextView, styleableSelectArrayAdapter, listListOf, pi2UiAddressFieldBinding, rendering, component, list);
            if (Intrinsics.areEqual(inputAddressComponent.getIsAddressAutocompleteLoading(), Boolean.FALSE)) {
                Iterator it2 = listListOf.iterator();
                while (it2.hasNext()) {
                    ((TextInputLayout) it2.next()).setEnabled(true);
                }
                pi2UiAddressFieldBinding.progressIndicator.setVisibility(8);
            }
            if (uiInputAddressComponentError != null) {
                inputAddressComponent.setAddressComponentsCollapsed(Boolean.FALSE);
            }
            if (Intrinsics.areEqual(inputAddressComponent.getIsAddressComponentsCollapsed(), Boolean.FALSE)) {
                pi2UiAddressFieldBinding.addressFieldsCollapsed.setVisibility(8);
                pi2UiAddressFieldBinding.addressFieldsExpanded.setVisibility(0);
                pi2UiAddressFieldBinding.addressLabel.setLabelFor(pi2UiAddressFieldBinding.addressFieldsExpanded.getId());
            } else if (Intrinsics.areEqual(inputAddressComponent.getIsAddressComponentsCollapsed(), Boolean.TRUE) || inputAddressComponent.getIsAddressComponentsCollapsed() == null) {
                pi2UiAddressFieldBinding.addressFieldsCollapsed.setVisibility(0);
                pi2UiAddressFieldBinding.addressFieldsExpanded.setVisibility(8);
                pi2UiAddressFieldBinding.addressLabel.setLabelFor(pi2UiAddressFieldBinding.addressFieldsCollapsed.getId());
            }
            applyHiddenState(view, componentParams, component);
            for (View view2 : listListOf) {
                Intrinsics.checkNotNull(view2);
                applyDisabledState(view2, componentParams, component, rendering.getIsLoading());
            }
            InputAddress.AddressComponentStyle styles3 = inputAddress.getStyles();
            TextBasedComponentStyle errorTextStyle = (styles3 == null || (inputTextStyle = styles3.getInputTextStyle()) == null) ? null : inputTextStyle.getErrorTextStyle();
            TextInputLayout addressFieldCollapsed = pi2UiAddressFieldBinding.addressFieldCollapsed;
            Intrinsics.checkNotNullExpressionValue(addressFieldCollapsed, "addressFieldCollapsed");
            ViewUtils5.setOrClearError(addressFieldCollapsed, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("street_1") : null, errorTextStyle);
            TextInputLayout addressFieldExpanded = pi2UiAddressFieldBinding.addressFieldExpanded;
            Intrinsics.checkNotNullExpressionValue(addressFieldExpanded, "addressFieldExpanded");
            ViewUtils5.setOrClearError(addressFieldExpanded, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("street_1") : null, errorTextStyle);
            TextInputLayout addressSuite = pi2UiAddressFieldBinding.addressSuite;
            Intrinsics.checkNotNullExpressionValue(addressSuite, "addressSuite");
            ViewUtils5.setOrClearError(addressSuite, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("street_2") : null, errorTextStyle);
            TextInputLayout addressCity = pi2UiAddressFieldBinding.addressCity;
            Intrinsics.checkNotNullExpressionValue(addressCity, "addressCity");
            ViewUtils5.setOrClearError(addressCity, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("city") : null, errorTextStyle);
            TextInputLayout addressSubdivision = pi2UiAddressFieldBinding.addressSubdivision;
            Intrinsics.checkNotNullExpressionValue(addressSubdivision, "addressSubdivision");
            ViewUtils5.setOrClearError(addressSubdivision, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("subdivision") : null, errorTextStyle);
            TextInputLayout addressPostalCode = pi2UiAddressFieldBinding.addressPostalCode;
            Intrinsics.checkNotNullExpressionValue(addressPostalCode, "addressPostalCode");
            ViewUtils5.setOrClearError(addressPostalCode, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get(PlaceTypes.POSTAL_CODE) : null, errorTextStyle);
            Unit unit6 = Unit.INSTANCE;
            return;
        }
        if ((component instanceof InputSelectComponent) || (component instanceof InputMultiSelectComponent)) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            final TextInputLayout textInputLayout3 = (TextInputLayout) view;
            Intrinsics.checkNotNull(component, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent");
            final InputSelectBoxComponent inputSelectBoxComponent = (InputSelectBoxComponent) component;
            final MultiTextValueComponent multiTextValueComponent = (MultiTextValueComponent) component;
            textInputLayout3.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda24
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    UiScreenRunner.updateRendering$showInputSelectBottomSheet(this.f$0, textInputLayout3, inputSelectBoxComponent, multiTextValueComponent);
                }
            });
            EditText editText = textInputLayout3.getEditText();
            if (editText != null) {
                editText.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda25
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        UiScreenRunner.updateRendering$showInputSelectBottomSheet(this.f$0, textInputLayout3, inputSelectBoxComponent, multiTextValueComponent);
                    }
                });
                Unit unit7 = Unit.INSTANCE;
            }
            EditText editText2 = textInputLayout3.getEditText();
            if (editText2 != null) {
                editText2.setText(CollectionsKt.joinToString$default(multiTextValueComponent.getSelectedOptionsController().getValue(), "\n", null, null, 0, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UiScreenRunner.updateRendering$lambda$55((Option) obj);
                    }
                }, 30, null));
                Unit unit8 = Unit.INSTANCE;
            }
            UiComponentError uiComponentError4 = map2.get(component.getName());
            UiComponentError.UiInputComponentError uiInputComponentError3 = uiComponentError4 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError4 : null;
            String message = uiInputComponentError3 != null ? uiInputComponentError3.getMessage() : null;
            InputSelectBoxComponentStyle styles4 = inputSelectBoxComponent.getStyles();
            ViewUtils5.setOrClearError(textInputLayout3, message, styles4 != null ? styles4.getErrorTextStyle() : null);
            applyComponentState(view, componentParams, component, rendering.getIsLoading());
            Unit unit9 = Unit.INSTANCE;
            return;
        }
        if (component instanceof InputRadioGroupComponent) {
            Object tag2 = view.getTag();
            Intrinsics.checkNotNull(tag2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputRadioGroupBinding");
            Pi2UiInputRadioGroupBinding pi2UiInputRadioGroupBinding = (Pi2UiInputRadioGroupBinding) tag2;
            UiComponentError uiComponentError5 = map2.get(((InputRadioGroupComponent) component).getName());
            UiComponentError.UiInputComponentError uiInputComponentError4 = uiComponentError5 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError5 : null;
            String message2 = uiInputComponentError4 != null ? uiInputComponentError4.getMessage() : null;
            TextView radioGroupError = pi2UiInputRadioGroupBinding.radioGroupError;
            Intrinsics.checkNotNullExpressionValue(radioGroupError, "radioGroupError");
            if (message2 == null || StringsKt.isBlank(message2)) {
                radioGroupError.setVisibility(8);
                radioGroupError.setText("");
            } else {
                radioGroupError.setVisibility(0);
                radioGroupError.setText(message2);
            }
            applyComponentState(view, componentParams, component, rendering.getIsLoading());
            View viewFindViewById = view.findViewById(R$id.radio_button_container);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            Iterator<View> it3 = ViewGroup2.getChildren((ViewGroup) viewFindViewById).iterator2();
            while (it3.hasNext()) {
                applyDisabledState(it3.next(), componentParams, component, rendering.getIsLoading());
            }
            Unit unit10 = Unit.INSTANCE;
            return;
        }
        if (!(component instanceof UiComponentGroup)) {
            if (component instanceof UiComponent2) {
                view.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda27
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        UiScreenRunner.updateRendering$lambda$59(this.f$0, component, view, view3);
                    }
                });
                ButtonWithLoadingIndicator buttonWithLoadingIndicator4 = view instanceof ButtonWithLoadingIndicator ? (ButtonWithLoadingIndicator) view : null;
                if (buttonWithLoadingIndicator4 != null) {
                    buttonWithLoadingIndicator4.setIsLoading(rendering.getIsLoading() && ((UiComponent2) component).getWasTapped());
                }
                applyComponentState(view, componentParams, component, rendering.getIsLoading());
                Unit unit11 = Unit.INSTANCE;
                return;
            }
            if (component instanceof InputDateComponent) {
                Object tag3 = view.getTag();
                Intrinsics.checkNotNull(tag3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiDateFieldBinding");
                Pi2UiDateFieldBinding pi2UiDateFieldBinding = (Pi2UiDateFieldBinding) tag3;
                UiComponentError uiComponentError6 = map2.get(((InputDateComponent) component).getName());
                UiComponentError.UiInputComponentError uiInputComponentError5 = uiComponentError6 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError6 : null;
                if (uiInputComponentError5 != null) {
                    pi2UiDateFieldBinding.month.setError(uiInputComponentError5.getMessage());
                    pi2UiDateFieldBinding.day.setError(uiInputComponentError5.getMessage());
                    pi2UiDateFieldBinding.year.setError(uiInputComponentError5.getMessage());
                    pi2UiDateFieldBinding.errorLabel.setText(uiInputComponentError5.getMessage());
                    pi2UiDateFieldBinding.errorLabel.setVisibility(0);
                } else {
                    pi2UiDateFieldBinding.month.setError("");
                    pi2UiDateFieldBinding.day.setError("");
                    pi2UiDateFieldBinding.year.setError("");
                    pi2UiDateFieldBinding.errorLabel.setText("");
                    pi2UiDateFieldBinding.errorLabel.setVisibility(8);
                }
                applyHiddenState(view, componentParams, component);
                View month = pi2UiDateFieldBinding.month;
                Intrinsics.checkNotNullExpressionValue(month, "month");
                applyDisabledState(month, componentParams, component, rendering.getIsLoading());
                View day = pi2UiDateFieldBinding.day;
                Intrinsics.checkNotNullExpressionValue(day, "day");
                applyDisabledState(day, componentParams, component, rendering.getIsLoading());
                View year = pi2UiDateFieldBinding.year;
                Intrinsics.checkNotNullExpressionValue(year, "year");
                applyDisabledState(year, componentParams, component, rendering.getIsLoading());
                Unit unit12 = Unit.INSTANCE;
                return;
            }
            if (component instanceof InputInternationalDbComponent) {
                Object tag4 = view.getTag();
                Intrinsics.checkNotNull(tag4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInternationalDbFieldBinding");
                Pi2UiInternationalDbFieldBinding pi2UiInternationalDbFieldBinding = (Pi2UiInternationalDbFieldBinding) tag4;
                InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) component;
                UiComponentError uiComponentError7 = map2.get(inputInternationalDbComponent.getName());
                UiComponentError.UiInputInternationalDbComponentError uiInputInternationalDbComponentError = uiComponentError7 instanceof UiComponentError.UiInputInternationalDbComponentError ? (UiComponentError.UiInputInternationalDbComponentError) uiComponentError7 : null;
                Map<String, String> message3 = uiInputInternationalDbComponentError != null ? uiInputInternationalDbComponentError.getMessage() : null;
                InputInternationalDbComponent2.updateView(inputInternationalDbComponent, pi2UiInternationalDbFieldBinding, new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UiScreenRunner.updateRendering$lambda$68$lambda$65(component, this);
                    }
                }, new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UiScreenRunner.updateRendering$lambda$68$lambda$67(component, this);
                    }
                }, message3 != null ? message3.get("idb_country") : null, message3 != null ? message3.get("idb_type") : null, message3 != null ? message3.get("idb_value") : null);
                applyComponentState(view, componentParams, component, rendering.getIsLoading());
                Unit unit13 = Unit.INSTANCE;
                return;
            }
            if (component instanceof InputMaskedTextComponent) {
                InputMaskedTextComponent inputMaskedTextComponent = (InputMaskedTextComponent) component;
                UiComponentError uiComponentError8 = map2.get(inputMaskedTextComponent.getName());
                UiComponentError.UiInputComponentError uiInputComponentError6 = uiComponentError8 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError8 : null;
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
                TextInputLayout textInputLayout4 = (TextInputLayout) view;
                String message4 = uiInputComponentError6 != null ? uiInputComponentError6.getMessage() : null;
                InputTextBasedComponentStyle styles5 = inputMaskedTextComponent.getStyles();
                ViewUtils5.setOrClearError(textInputLayout4, message4, styles5 != null ? styles5.getErrorTextStyle() : null);
                applyComponentState(view, componentParams, component, rendering.getIsLoading());
                Unit unit14 = Unit.INSTANCE;
                return;
            }
            if (component instanceof InputPhoneNumberComponent) {
                Object tag5 = view.getTag();
                Intrinsics.checkNotNull(tag5, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputPhoneNumberBinding");
                Pi2UiInputPhoneNumberBinding pi2UiInputPhoneNumberBinding = (Pi2UiInputPhoneNumberBinding) tag5;
                InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) component;
                UiComponentError uiComponentError9 = map2.get(inputPhoneNumberComponent.getName());
                UiComponentError.UiInputComponentError uiInputComponentError7 = uiComponentError9 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError9 : null;
                TextInputLayout inputLayout = pi2UiInputPhoneNumberBinding.inputLayout;
                Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
                ViewUtils5.setOrClearError(inputLayout, uiInputComponentError7 != null ? uiInputComponentError7.getMessage() : null, inputPhoneNumberComponent.getErrorTextStyle());
                InputPhoneNumberComponent2.updateView(inputPhoneNumberComponent, pi2UiInputPhoneNumberBinding, new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UiScreenRunner.updateRendering$lambda$73$lambda$72(component, this);
                    }
                });
                applyComponentState(view, componentParams, component, rendering.getIsLoading());
                Unit unit15 = Unit.INSTANCE;
                return;
            }
            if (component instanceof InputNumberComponent) {
                InputNumberComponent inputNumberComponent = (InputNumberComponent) component;
                UiComponentError uiComponentError10 = map2.get(inputNumberComponent.getName());
                UiComponentError.UiInputComponentError uiInputComponentError8 = uiComponentError10 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError10 : null;
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
                TextInputLayout textInputLayout5 = (TextInputLayout) view;
                String message5 = uiInputComponentError8 != null ? uiInputComponentError8.getMessage() : null;
                UiComponentConfig uiComponentConfig2 = componentNameToConfig.get(inputNumberComponent.getName());
                InputNumber inputNumber = uiComponentConfig2 instanceof InputNumber ? (InputNumber) uiComponentConfig2 : null;
                ViewUtils5.setOrClearError(textInputLayout5, message5, (inputNumber == null || (styles = inputNumber.getStyles()) == null) ? null : styles.getErrorTextStyle());
                applyComponentState(view, componentParams, component, rendering.getIsLoading());
                Unit unit16 = Unit.INSTANCE;
                return;
            }
            if (component instanceof InputCurrencyComponent) {
                InputCurrencyComponent inputCurrencyComponent = (InputCurrencyComponent) component;
                UiComponentError uiComponentError11 = map2.get(inputCurrencyComponent.getName());
                UiComponentError.UiInputComponentError uiInputComponentError9 = uiComponentError11 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError11 : null;
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
                ViewUtils5.setOrClearError((TextInputLayout) view, uiInputComponentError9 != null ? uiInputComponentError9.getMessage() : null, inputCurrencyComponent.getErrorTextStyle());
                applyComponentState(view, componentParams, component, rendering.getIsLoading());
                Unit unit17 = Unit.INSTANCE;
                return;
            }
            if (component instanceof InputCheckboxComponent) {
                Object tag6 = view.getTag();
                Intrinsics.checkNotNull(tag6, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputCheckboxBinding");
                Pi2UiInputCheckboxBinding pi2UiInputCheckboxBinding = (Pi2UiInputCheckboxBinding) tag6;
                UiComponentError uiComponentError12 = map2.get(((InputCheckboxComponent) component).getName());
                UiComponentError.UiInputComponentError uiInputComponentError10 = uiComponentError12 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError12 : null;
                if (uiInputComponentError10 != null) {
                    pi2UiInputCheckboxBinding.checkboxError.setText(uiInputComponentError10.getMessage());
                    pi2UiInputCheckboxBinding.checkboxError.setVisibility(0);
                } else {
                    pi2UiInputCheckboxBinding.checkboxError.setText("");
                    pi2UiInputCheckboxBinding.checkboxError.setVisibility(8);
                }
                applyComponentState(view, componentParams, component, rendering.getIsLoading());
                Unit unit18 = Unit.INSTANCE;
                return;
            }
            if (component instanceof InputCheckboxGroupComponent) {
                Object tag7 = view.getTag();
                Intrinsics.checkNotNull(tag7, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputCheckboxGroupBinding");
                Pi2UiInputCheckboxGroupBinding pi2UiInputCheckboxGroupBinding = (Pi2UiInputCheckboxGroupBinding) tag7;
                UiComponentError uiComponentError13 = map2.get(((InputCheckboxGroupComponent) component).getName());
                UiComponentError.UiInputComponentError uiInputComponentError11 = uiComponentError13 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError13 : null;
                if (uiInputComponentError11 != null) {
                    pi2UiInputCheckboxGroupBinding.checkboxGroupError.setText(uiInputComponentError11.getMessage());
                    pi2UiInputCheckboxGroupBinding.checkboxGroupError.setVisibility(0);
                } else {
                    pi2UiInputCheckboxGroupBinding.checkboxGroupError.setText("");
                    pi2UiInputCheckboxGroupBinding.checkboxGroupError.setVisibility(8);
                }
                applyComponentState(view, componentParams, component, rendering.getIsLoading());
                View viewFindViewById2 = view.findViewById(R$id.checkbox_group_container);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                Iterator<View> it4 = ViewGroup2.getChildren((ViewGroup) viewFindViewById2).iterator2();
                while (it4.hasNext()) {
                    applyDisabledState(it4.next(), componentParams, component, rendering.getIsLoading());
                }
                Unit unit19 = Unit.INSTANCE;
                return;
            }
            if (component instanceof ESignatureComponent) {
                Object tag8 = view.getTag();
                Intrinsics.checkNotNull(tag8, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                Pi2UiSignatureFieldBinding pi2UiSignatureFieldBinding = (Pi2UiSignatureFieldBinding) tag8;
                ESignatureComponent eSignatureComponent = (ESignatureComponent) component;
                UiComponentConfig uiComponentConfig3 = componentNameToConfig.get(eSignatureComponent.getName());
                Intrinsics.checkNotNull(uiComponentConfig3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature");
                final ESignature eSignature = (ESignature) uiComponentConfig3;
                UiComponentError uiComponentError14 = map2.get(eSignatureComponent.getName());
                UiComponentError.UiInputComponentError uiInputComponentError12 = uiComponentError14 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError14 : null;
                if (uiInputComponentError12 != null) {
                    pi2UiSignatureFieldBinding.errorLabel.setText(uiInputComponentError12.getMessage());
                    pi2UiSignatureFieldBinding.errorLabel.setVisibility(0);
                } else {
                    pi2UiSignatureFieldBinding.errorLabel.setText("");
                    pi2UiSignatureFieldBinding.errorLabel.setVisibility(8);
                }
                ESignature.Attributes attributes = eSignature.getAttributes();
                if ((attributes != null ? attributes.getLabel() : null) != null) {
                    TextView textView = pi2UiSignatureFieldBinding.label;
                    ESignature.Attributes attributes2 = eSignature.getAttributes();
                    textView.setText(attributes2 != null ? attributes2.getLabel() : null);
                    pi2UiSignatureFieldBinding.label.setVisibility(0);
                } else {
                    pi2UiSignatureFieldBinding.label.setText("");
                    pi2UiSignatureFieldBinding.label.setVisibility(8);
                }
                Bitmap value = eSignatureComponent.getBitmapController().getValue();
                if (value == null) {
                    Object tag9 = view.getTag();
                    Intrinsics.checkNotNull(tag9, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                    ((Pi2UiSignatureFieldBinding) tag9).addSignatureLabel.setVisibility(0);
                    Object tag10 = view.getTag();
                    Intrinsics.checkNotNull(tag10, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                    TextView textView2 = ((Pi2UiSignatureFieldBinding) tag10).addSignatureLabel;
                    ESignature.Attributes attributes3 = eSignature.getAttributes();
                    if (attributes3 == null || (placeholder = attributes3.getPlaceholder()) == null) {
                        placeholder = "+ Add signature";
                    }
                    textView2.setText(placeholder);
                    Object tag11 = view.getTag();
                    Intrinsics.checkNotNull(tag11, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                    ((Pi2UiSignatureFieldBinding) tag11).signaturePreview.setVisibility(8);
                    Object tag12 = view.getTag();
                    Intrinsics.checkNotNull(tag12, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                    ((Pi2UiSignatureFieldBinding) tag12).editSignatureIcon.setVisibility(8);
                } else {
                    Object tag13 = view.getTag();
                    Intrinsics.checkNotNull(tag13, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                    ((Pi2UiSignatureFieldBinding) tag13).signaturePreview.setImageBitmap(value);
                    Object tag14 = view.getTag();
                    Intrinsics.checkNotNull(tag14, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                    ((Pi2UiSignatureFieldBinding) tag14).addSignatureLabel.setVisibility(8);
                    Object tag15 = view.getTag();
                    Intrinsics.checkNotNull(tag15, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                    ((Pi2UiSignatureFieldBinding) tag15).signaturePreview.setVisibility(0);
                    Object tag16 = view.getTag();
                    Intrinsics.checkNotNull(tag16, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                    ((Pi2UiSignatureFieldBinding) tag16).editSignatureIcon.setVisibility(0);
                }
                pi2UiSignatureFieldBinding.signatureContainer.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda17
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        UiScreenRunner.updateRendering$lambda$79$lambda$78(this.f$0, component, eSignature, rendering, viewEnvironment, view3);
                    }
                });
                applyHiddenState(view, componentParams, component);
                View signatureContainer = pi2UiSignatureFieldBinding.signatureContainer;
                Intrinsics.checkNotNullExpressionValue(signatureContainer, "signatureContainer");
                applyDisabledState(signatureContainer, componentParams, component, rendering.getIsLoading());
                Unit unit20 = Unit.INSTANCE;
                return;
            }
            if (component instanceof GovernmentIdNfcScanComponent) {
                Object tag17 = view.getTag();
                Intrinsics.checkNotNull(tag17, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanViewHolder");
                GovernmentIdNfcScanComponent3 governmentIdNfcScanComponent3 = (GovernmentIdNfcScanComponent3) tag17;
                ButtonWithLoadingIndicator launchButton = governmentIdNfcScanComponent3.getLaunchButton();
                launchButton.setIsLoading(rendering.getIsLoading() && ((GovernmentIdNfcScanComponent) component).getWasTapped());
                applyComponentState(launchButton, componentParams, component, rendering.getIsLoading());
                launchButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda18
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        UiScreenRunner.updateRendering$lambda$84$lambda$81$lambda$80(this.f$0, component, view3);
                    }
                });
                GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) component;
                UiComponentError uiComponentError15 = map2.get(governmentIdNfcScanComponent.getName());
                if (uiComponentError15 != null) {
                    if (uiComponentError15 instanceof UiComponentError.UiInputComponentError) {
                        TextView errorLabel = governmentIdNfcScanComponent3.getErrorLabel();
                        errorLabel.setText(((UiComponentError.UiInputComponentError) uiComponentError15).getMessage());
                        errorLabel.setVisibility(0);
                        return;
                    }
                    if (uiComponentError15 instanceof UiComponentError.UiGovernmentIdNfcScanComponentError) {
                        TextInputLayout cardAccessNumber = governmentIdNfcScanComponent3.getCardAccessNumber();
                        UiComponentError.UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError = (UiComponentError.UiGovernmentIdNfcScanComponentError) uiComponentError15;
                        String str = uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.cardAccessNumberName);
                        GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles6 = governmentIdNfcScanComponent.getConfig().getStyles();
                        ViewUtils5.setOrClearError(cardAccessNumber, str, (styles6 == null || (cardAccessNumberStyle = styles6.getCardAccessNumberStyle()) == null) ? null : cardAccessNumberStyle.getErrorTextStyle());
                        TextInputLayout documentNumber = governmentIdNfcScanComponent3.getDocumentNumber();
                        String str2 = uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.documentNumberName);
                        GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles7 = governmentIdNfcScanComponent.getConfig().getStyles();
                        ViewUtils5.setOrClearError(documentNumber, str2, (styles7 == null || (documentNumberStyle = styles7.getDocumentNumberStyle()) == null) ? null : documentNumberStyle.getErrorTextStyle());
                        governmentIdNfcScanComponent3.getDateOfBirthBinding().errorLabel.setText(uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.dateOfBirthName));
                        governmentIdNfcScanComponent3.getDateOfBirthBinding().errorLabel.setVisibility(0);
                        governmentIdNfcScanComponent3.getExpirationDateBinding().errorLabel.setText(uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.expirationDateName));
                        governmentIdNfcScanComponent3.getExpirationDateBinding().errorLabel.setVisibility(0);
                        Unit unit21 = Unit.INSTANCE;
                        return;
                    }
                    Unit unit22 = Unit.INSTANCE;
                    return;
                }
                return;
            }
            if (!(component instanceof CreatePersonaSheetComponent) && !(component instanceof ImagePreviewComponent) && !(component instanceof LocalImageComponent) && !(component instanceof PrivacyPolicyComponent) && !(component instanceof QRCodeComponent) && !(component instanceof RemoteImageComponent) && !(component instanceof SpacerComponent) && !(component instanceof TextComponent) && !(component instanceof TitleComponent) && !(component instanceof BrandingComponent)) {
                throw new NoWhenBranchMatchedException();
            }
            applyComponentState(view, componentParams, component, rendering.getIsLoading());
            Unit unit23 = Unit.INSTANCE;
            return;
        }
        for (UiComponent uiComponent : ((UiComponentGroup) component).getChildren()) {
            View view3 = this.componentNameToView.get(uiComponent.getName());
            if (view3 != null) {
                Map<String, ? extends UiComponentError> map3 = map2;
                updateRendering(rendering, uiComponent, view3, componentParams, map3, viewEnvironment, componentNameToConfig);
                map = map3;
            } else {
                map = map2;
            }
            map2 = map;
        }
        if ((component instanceof ClickableStackComponent) && (view instanceof ConstraintLayout)) {
            renderClickableStackForState(rendering, (ClickableStackComponent) component, (ConstraintLayout) view);
        }
        applyComponentState(view, componentParams, component, rendering.getIsLoading());
        Unit unit24 = Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateRendering$lambda$30$lambda$29(UiScreenRunner uiScreenRunner, View view) {
        uiScreenRunner.onComplete.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateRendering$lambda$32$lambda$31(UiScreenRunner uiScreenRunner, UiComponent uiComponent, View view, View view2) {
        uiScreenRunner.onClick.invoke(uiComponent, Boolean.valueOf(view.getVisibility() == 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateRendering$lambda$34$lambda$33(UiScreenRunner uiScreenRunner, UiComponent uiComponent, View view, View view2) {
        uiScreenRunner.onClick.invoke(uiComponent, Boolean.valueOf(view.getVisibility() == 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateRendering$lambda$36$lambda$35(UiScreenRunner uiScreenRunner, View view) {
        uiScreenRunner.onCancel.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateRendering$lambda$37(UiScreenRunner uiScreenRunner, UiComponent uiComponent, View view) {
        uiScreenRunner.onVerifyPersonaClick.invoke(uiComponent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateRendering$lambda$40(View view, UiWorkflow.Screen.EntryScreen entryScreen, UiScreenRunner uiScreenRunner) {
        if (InputConfirmationComponentUtils.INSTANCE.isDoneEnteringCode(view)) {
            SubmitButtonComponent submitButtonComponent = (SubmitButtonComponent) ExtensionsKt.findFirst(entryScreen.getComponents(), Reflection.getOrCreateKotlinClass(SubmitButtonComponent.class), new Function1<SubmitButtonComponent, Boolean>() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$updateRendering$lambda$40$$inlined$findFirst$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(SubmitButtonComponent it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            });
            if (submitButtonComponent != null) {
                uiScreenRunner.onClick.invoke(submitButtonComponent, Boolean.valueOf(view.getVisibility() == 0));
            }
        }
        return Unit.INSTANCE;
    }

    private static final void updateRendering$lambda$51$setupAddressAutoCompleteTextView(final MaterialAutoCompleteTextView materialAutoCompleteTextView, StyleableSelectArrayAdapter styleableSelectArrayAdapter, final List<? extends TextInputLayout> list, final Pi2UiAddressFieldBinding pi2UiAddressFieldBinding, final UiWorkflow.Screen.EntryScreen entryScreen, final UiComponent uiComponent, final List<AddressAutocompleteResponse3> list2) {
        materialAutoCompleteTextView.setAdapter(styleableSelectArrayAdapter);
        styleableSelectArrayAdapter.notifyDataSetChanged();
        materialAutoCompleteTextView.setThreshold(1);
        materialAutoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda35
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                UiScreenRunner.m3266xc2bc81ba(list, pi2UiAddressFieldBinding, materialAutoCompleteTextView, entryScreen, uiComponent, list2, adapterView, view, i, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: updateRendering$lambda$51$setupAddressAutoCompleteTextView$lambda$48 */
    public static final void m3266xc2bc81ba(List list, Pi2UiAddressFieldBinding pi2UiAddressFieldBinding, MaterialAutoCompleteTextView materialAutoCompleteTextView, UiWorkflow.Screen.EntryScreen entryScreen, UiComponent uiComponent, List list2, AdapterView adapterView, View view, int i, long j) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((TextInputLayout) it.next()).setEnabled(false);
        }
        pi2UiAddressFieldBinding.progressIndicator.setVisibility(0);
        Context context = materialAutoCompleteTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ContextUtils3.hideKeyboard(context);
        entryScreen.getOnSuggestionSelected().invoke(uiComponent, ((AddressAutocompleteResponse3) list2.get(i)).getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateRendering$showInputSelectBottomSheet(final UiScreenRunner uiScreenRunner, final TextInputLayout textInputLayout, InputSelectBoxComponent inputSelectBoxComponent, final MultiTextValueComponent<?> multiTextValueComponent) {
        uiScreenRunner.binding.navigationBar.getBackButton().setEnabled(false);
        textInputLayout.setEnabled(false);
        uiScreenRunner.binding.navigationBar.setImportantForAccessibility(4);
        uiScreenRunner.binding.uiStepContainer.setImportantForAccessibility(4);
        uiScreenRunner.inputSelectBottomSheetController.show(inputSelectBoxComponent, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiScreenRunner.updateRendering$showInputSelectBottomSheet$lambda$52(this.f$0, textInputLayout, multiTextValueComponent, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateRendering$showInputSelectBottomSheet$lambda$52(UiScreenRunner uiScreenRunner, TextInputLayout textInputLayout, MultiTextValueComponent multiTextValueComponent, List selectedItems) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        uiScreenRunner.binding.navigationBar.getBackButton().setEnabled(true);
        textInputLayout.setEnabled(true);
        textInputLayout.requestLayout();
        uiScreenRunner.binding.navigationBar.setImportantForAccessibility(1);
        uiScreenRunner.binding.uiStepContainer.setImportantForAccessibility(1);
        multiTextValueComponent.getSelectedOptionsController().setValue(selectedItems);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence updateRendering$lambda$55(Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateRendering$lambda$59(UiScreenRunner uiScreenRunner, UiComponent uiComponent, View view, View view2) {
        uiScreenRunner.onClick.invoke(uiComponent, Boolean.valueOf(view.getVisibility() == 0));
    }

    private static final void updateRendering$lambda$68$showInputSelectBottomSheet$63(final UiScreenRunner uiScreenRunner, InputSelectBoxComponent inputSelectBoxComponent, final Function1<? super List<Option>, Unit> function1) {
        if (inputSelectBoxComponent == null) {
            return;
        }
        uiScreenRunner.binding.navigationBar.getBackButton().setEnabled(false);
        uiScreenRunner.binding.navigationBar.setImportantForAccessibility(4);
        uiScreenRunner.binding.uiStepContainer.setImportantForAccessibility(4);
        uiScreenRunner.inputSelectBottomSheetController.show(inputSelectBoxComponent, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiScreenRunner.m3267x8fd21205(this.f$0, function1, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateRendering$lambda$68$showInputSelectBottomSheet$63$lambda$62 */
    public static final Unit m3267x8fd21205(UiScreenRunner uiScreenRunner, Function1 function1, List selectedItems) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        uiScreenRunner.binding.navigationBar.getBackButton().setEnabled(true);
        uiScreenRunner.binding.navigationBar.setImportantForAccessibility(1);
        uiScreenRunner.binding.uiStepContainer.setImportantForAccessibility(1);
        if (!selectedItems.isEmpty()) {
            function1.invoke(selectedItems);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateRendering$lambda$68$lambda$65(final UiComponent uiComponent, UiScreenRunner uiScreenRunner) {
        updateRendering$lambda$68$showInputSelectBottomSheet$63(uiScreenRunner, ((InputInternationalDbComponent) uiComponent).getCountrySelectComponent(), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiScreenRunner.updateRendering$lambda$68$lambda$65$lambda$64(uiComponent, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateRendering$lambda$68$lambda$65$lambda$64(UiComponent uiComponent, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) uiComponent;
        inputInternationalDbComponent.getCountryOptionsController().setValue(it);
        inputInternationalDbComponent.getIdTypeOptionsController().setValue(CollectionsKt.emptyList());
        inputInternationalDbComponent.getIdValueController().setTextValue("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateRendering$lambda$68$lambda$67(final UiComponent uiComponent, UiScreenRunner uiScreenRunner) {
        updateRendering$lambda$68$showInputSelectBottomSheet$63(uiScreenRunner, ((InputInternationalDbComponent) uiComponent).getIdTypeSelectComponent(), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiScreenRunner.updateRendering$lambda$68$lambda$67$lambda$66(uiComponent, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateRendering$lambda$68$lambda$67$lambda$66(UiComponent uiComponent, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) uiComponent;
        inputInternationalDbComponent.getIdTypeOptionsController().setValue(it);
        inputInternationalDbComponent.getIdValueController().setTextValue("");
        return Unit.INSTANCE;
    }

    private static final void updateRendering$lambda$73$showInputSelectBottomSheet$70(final UiScreenRunner uiScreenRunner, InputSelectBoxComponent inputSelectBoxComponent, final Function1<? super List<Option>, Unit> function1) {
        if (inputSelectBoxComponent == null) {
            return;
        }
        uiScreenRunner.binding.navigationBar.getBackButton().setEnabled(false);
        uiScreenRunner.binding.navigationBar.setImportantForAccessibility(4);
        uiScreenRunner.binding.uiStepContainer.setImportantForAccessibility(4);
        uiScreenRunner.inputSelectBottomSheetController.show(inputSelectBoxComponent, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiScreenRunner.m3268x2119fd42(this.f$0, function1, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateRendering$lambda$73$showInputSelectBottomSheet$70$lambda$69 */
    public static final Unit m3268x2119fd42(UiScreenRunner uiScreenRunner, Function1 function1, List selectedItems) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        uiScreenRunner.binding.navigationBar.getBackButton().setEnabled(true);
        uiScreenRunner.binding.navigationBar.setImportantForAccessibility(1);
        uiScreenRunner.binding.uiStepContainer.setImportantForAccessibility(1);
        if (!selectedItems.isEmpty()) {
            function1.invoke(selectedItems);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateRendering$lambda$73$lambda$72(final UiComponent uiComponent, UiScreenRunner uiScreenRunner) {
        updateRendering$lambda$73$showInputSelectBottomSheet$70(uiScreenRunner, ((InputPhoneNumberComponent) uiComponent).getCountryCodeSelectComponent(), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiScreenRunner.updateRendering$lambda$73$lambda$72$lambda$71(uiComponent, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateRendering$lambda$73$lambda$72$lambda$71(UiComponent uiComponent, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ((InputPhoneNumberComponent) uiComponent).getCountryCodeOptionsController().setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateRendering$lambda$79$lambda$78(final UiScreenRunner uiScreenRunner, final UiComponent uiComponent, ESignature eSignature, UiWorkflow.Screen.EntryScreen entryScreen, ViewEnvironment viewEnvironment, View view) {
        uiScreenRunner.binding.navigationBar.getBackButton().setEnabled(false);
        uiScreenRunner.binding.navigationBar.setImportantForAccessibility(4);
        uiScreenRunner.binding.uiStepContainer.setImportantForAccessibility(4);
        uiScreenRunner.signatureBottomSheetController.show((ESignatureComponent) uiComponent, eSignature, entryScreen.getStyles(), viewEnvironment, new Function2() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return UiScreenRunner.updateRendering$lambda$79$lambda$78$lambda$77(this.f$0, uiComponent, ((Boolean) obj).booleanValue(), (Bitmap) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateRendering$lambda$79$lambda$78$lambda$77(UiScreenRunner uiScreenRunner, UiComponent uiComponent, boolean z, Bitmap bitmap) {
        uiScreenRunner.binding.navigationBar.getBackButton().setEnabled(true);
        uiScreenRunner.binding.navigationBar.setImportantForAccessibility(1);
        uiScreenRunner.binding.uiStepContainer.setImportantForAccessibility(1);
        if (!z) {
            ((ESignatureComponent) uiComponent).getBitmapController().setValue(bitmap);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateRendering$lambda$84$lambda$81$lambda$80(UiScreenRunner uiScreenRunner, UiComponent uiComponent, View view) {
        uiScreenRunner.launchNfcScan.invoke(uiComponent);
    }

    private final void applyComponentState(View view, Map<String, ? extends Object> map, UiComponent uiComponent, boolean z) {
        applyHiddenState(view, map, uiComponent);
        applyDisabledState(view, map, uiComponent, z);
    }

    private final void applyHiddenState(View view, Map<String, ? extends Object> map, UiComponent uiComponent) {
        Boolean value;
        if (uiComponent instanceof UiComponentAttributes3) {
            UiComponentAttributes3 uiComponentAttributes3 = (UiComponentAttributes3) uiComponent;
            JsonLogicBoolean hidden = uiComponentAttributes3.getHidden();
            boolean zBooleanValue = (hidden == null || (value = hidden.getValue(map, map.get(uiComponent.getName()))) == null) ? false : value.booleanValue();
            view.setVisibility(zBooleanValue ? 8 : 0);
            Iterator<T> it = uiComponentAttributes3.getAssociatedViews().iterator();
            while (it.hasNext()) {
                ((AssociatedHideableView) it.next()).applyHiddenState(map, zBooleanValue);
            }
        }
    }

    private final void applyDisabledState(View view, Map<String, ? extends Object> map, UiComponent uiComponent, boolean z) {
        Boolean value;
        if (uiComponent instanceof UiComponentAttributes2) {
            JsonLogicBoolean disabled = ((UiComponentAttributes2) uiComponent).getDisabled();
            boolean z2 = false;
            boolean zBooleanValue = (disabled == null || (value = disabled.getValue(map, map.get(uiComponent.getName()))) == null) ? false : value.booleanValue();
            if (!z && !zBooleanValue) {
                z2 = true;
            }
            view.setEnabled(z2);
            view.requestLayout();
        }
    }

    private final void attachFooter(UiStepUtils6 result, List<? extends UiComponent> components) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : components) {
            if (obj instanceof FooterComponent) {
                arrayList.add(obj);
            }
        }
        FooterComponent footerComponent = (FooterComponent) CollectionsKt.firstOrNull((List) arrayList);
        if (footerComponent == null) {
            return;
        }
        Integer firstBelowTheFoldChildIndex = footerComponent.getFirstBelowTheFoldChildIndex();
        if (firstBelowTheFoldChildIndex != null) {
            setupFooterSheet(result, firstBelowTheFoldChildIndex.intValue(), footerComponent);
        } else {
            this.binding.footerContainer.addView(result.getFooterView());
        }
    }

    private final void setupFooterSheet(UiStepUtils6 result, int firstBelowTheFoldChildIndex, FooterComponent footerComponent) {
        this.binding.footerDivider.setVisibility(0);
        this.binding.footerSheetCoordinatorLayout.setVisibility(0);
        View footerView = result.getFooterView();
        Drawable background = footerView != null ? footerView.getBackground() : null;
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        int color = colorDrawable != null ? colorDrawable.getColor() : 0;
        Drawable background2 = this.binding.footerSheetScrollView.getBackground();
        LayerDrawable layerDrawable = background2 instanceof LayerDrawable ? (LayerDrawable) background2 : null;
        Drawable drawableFindDrawableByLayerId = layerDrawable != null ? layerDrawable.findDrawableByLayerId(R$id.footer_sheet_rectangle) : null;
        GradientDrawable gradientDrawable = drawableFindDrawableByLayerId instanceof GradientDrawable ? (GradientDrawable) drawableFindDrawableByLayerId : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(color);
        }
        this.binding.footerSheet.addView(result.getFooterView());
        UiComponent uiComponent = (UiComponent) CollectionsKt.getOrNull(footerComponent.getChildren(), firstBelowTheFoldChildIndex);
        final View view = this.componentNameToView.get(uiComponent != null ? uiComponent.getName() : null);
        final BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(this.binding.footerSheetScrollView);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
        this.binding.nestedScroll.setVerticalFadingEdgeEnabled(false);
        if (view != null) {
            this.binding.footerSheetGrabber.setVisibility(0);
            this.binding.footerSheet.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda28
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    UiScreenRunner.setupFooterSheet$lambda$86(this.f$0, view, bottomSheetBehaviorFrom, view2, i, i2, i3, i4, i5, i6, i7, i8);
                }
            });
        } else {
            this.binding.footerSheetGrabber.setVisibility(4);
            this.binding.footerSheet.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda29
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    UiScreenRunner.setupFooterSheet$lambda$87(this.f$0, bottomSheetBehaviorFrom, view2, i, i2, i3, i4, i5, i6, i7, i8);
                }
            });
        }
        bottomSheetBehaviorFrom.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner.setupFooterSheet.3
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View bottomSheet, int newState) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View bottomSheet, float slideOffset) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                UiScreenRunner.this.binding.nestedScroll.setPadding(UiScreenRunner.this.binding.nestedScroll.getPaddingLeft(), UiScreenRunner.this.binding.nestedScroll.getPaddingTop(), UiScreenRunner.this.binding.nestedScroll.getPaddingRight(), bottomSheetBehaviorFrom.getPeekHeight() + ((int) (slideOffset * (UiScreenRunner.this.binding.footerSheetScrollView.getHeight() - bottomSheetBehaviorFrom.getPeekHeight()))));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupFooterSheet$lambda$86(UiScreenRunner uiScreenRunner, View view, BottomSheetBehavior bottomSheetBehavior, View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int bottom = uiScreenRunner.binding.footerSheet.getBottom();
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        uiScreenRunner.binding.footerSheetScrollView.offsetDescendantRectToMyCoords(view, rect);
        int peekHeight = bottomSheetBehavior.getPeekHeight();
        bottomSheetBehavior.setPeekHeight(rect.top);
        if (peekHeight != bottomSheetBehavior.getPeekHeight()) {
            ShadowedNestedScrollView shadowedNestedScrollView = uiScreenRunner.binding.nestedScroll;
            shadowedNestedScrollView.setPadding(shadowedNestedScrollView.getPaddingLeft(), uiScreenRunner.binding.nestedScroll.getPaddingTop(), uiScreenRunner.binding.nestedScroll.getPaddingRight(), bottomSheetBehavior.getPeekHeight());
        }
        bottomSheetBehavior.setMaxHeight(bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupFooterSheet$lambda$87(UiScreenRunner uiScreenRunner, BottomSheetBehavior bottomSheetBehavior, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int bottom = uiScreenRunner.binding.footerSheet.getBottom();
        bottomSheetBehavior.setPeekHeight(bottom);
        bottomSheetBehavior.setMaxHeight(bottom);
        ShadowedNestedScrollView shadowedNestedScrollView = uiScreenRunner.binding.nestedScroll;
        shadowedNestedScrollView.setPadding(shadowedNestedScrollView.getPaddingLeft(), uiScreenRunner.binding.nestedScroll.getPaddingTop(), uiScreenRunner.binding.nestedScroll.getPaddingRight(), bottom);
    }

    private final void renderClickableStackForState(UiWorkflow.Screen.EntryScreen rendering, final ClickableStackComponent component, final ConstraintLayout view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda33
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UiScreenRunner.renderClickableStackForState$lambda$88(component, this, view, view2);
            }
        });
        if (component.getIsActive()) {
            StackStyling2.applyActiveClickableStackStyles(view, component.getStyles());
        } else if (rendering.getIsLoading()) {
            StackStyling2.applyDisabledClickableStackStyles(view, component.getStyles());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderClickableStackForState$lambda$88(ClickableStackComponent clickableStackComponent, UiScreenRunner uiScreenRunner, ConstraintLayout constraintLayout, View view) {
        clickableStackComponent.setActive(true);
        uiScreenRunner.onClick.invoke(clickableStackComponent, Boolean.valueOf(constraintLayout.getVisibility() == 0));
    }

    private final Map<String, ComponentParam> getComponentsParams(List<ComponentView> components) {
        LinkedHashMap linkedHashMap;
        Map<String, ? extends Object> mapEmptyMap = MapsKt.emptyMap();
        int i = 0;
        while (true) {
            linkedHashMap = new LinkedHashMap();
            parseComponentsParamsInto(mapEmptyMap, linkedHashMap, components);
            Map<String, ? extends Object> componentValues = toComponentValues(linkedHashMap);
            if (Intrinsics.areEqual(mapEmptyMap, componentValues) || i >= 20) {
                break;
            }
            i++;
            mapEmptyMap = componentValues;
        }
        return linkedHashMap;
    }

    private final void parseComponentsParamsInto(Map<String, ? extends Object> initialComponentValues, Map<String, ComponentParam> outMap, List<ComponentView> componentViews) {
        Boolean value;
        for (ComponentView componentView : componentViews) {
            UiComponent component = componentView.getComponent();
            componentView.getView();
            UiComponentAttributes3 uiComponentAttributes3 = component instanceof UiComponentAttributes3 ? (UiComponentAttributes3) component : null;
            JsonLogicBoolean hidden = uiComponentAttributes3 != null ? uiComponentAttributes3.getHidden() : null;
            if (!((hidden == null || (value = hidden.getValue(initialComponentValues, initialComponentValues.get(component.getName()))) == null) ? false : value.booleanValue())) {
                if (component instanceof InputTextComponent) {
                    InputTextComponent inputTextComponent = (InputTextComponent) component;
                    outMap.put(inputTextComponent.getName(), m3264to(inputTextComponent.getTextController().getTextValue()));
                } else if (component instanceof InputTextAreaComponent) {
                    InputTextAreaComponent inputTextAreaComponent = (InputTextAreaComponent) component;
                    outMap.put(inputTextAreaComponent.getName(), m3264to(inputTextAreaComponent.getTextController().getTextValue()));
                } else if (component instanceof InputPhoneNumberComponent) {
                    InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) component;
                    String prefix = CountryCodeUtils.INSTANCE.getPrefix((Option) CollectionsKt.first((List) inputPhoneNumberComponent.getCountryCodeOptionsController().getValue()));
                    outMap.put(inputPhoneNumberComponent.getName(), m3264to(prefix + PlaceholderUtils.XXShortPlaceholderText + inputPhoneNumberComponent.getTextController().getTextValue()));
                } else if (component instanceof InputConfirmationCodeComponent) {
                    InputConfirmationCodeComponent inputConfirmationCodeComponent = (InputConfirmationCodeComponent) component;
                    outMap.put(inputConfirmationCodeComponent.getName(), m3264to(inputConfirmationCodeComponent.getTextController().getTextValue()));
                } else if (component instanceof InputDateComponent) {
                    InputDateComponent inputDateComponent = (InputDateComponent) component;
                    outMap.put(inputDateComponent.getName(), m3264to(inputDateComponent.getDateController().getValue()));
                } else if (component instanceof InputInternationalDbComponent) {
                    InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) component;
                    outMap.put(inputInternationalDbComponent.getName(), new ComponentParam.InternationalDbParams(inputInternationalDbComponent.getSelectedCountry(), inputInternationalDbComponent.getSelectedIdType(), inputInternationalDbComponent.getIdValue()));
                } else if (component instanceof InputMaskedTextComponent) {
                    InputMaskedTextComponent inputMaskedTextComponent = (InputMaskedTextComponent) component;
                    outMap.put(inputMaskedTextComponent.getName(), m3264to(inputMaskedTextComponent.getTextController().getTextValue()));
                } else if (component instanceof InputSelectComponent) {
                    InputSelectComponent inputSelectComponent = (InputSelectComponent) component;
                    if (!inputSelectComponent.getSelectedOptions().isEmpty()) {
                        outMap.put(inputSelectComponent.getName(), m3264to(((Option) CollectionsKt.first((List) inputSelectComponent.getSelectedOptions())).getValue()));
                    }
                } else if (component instanceof InputMultiSelectComponent) {
                    InputMultiSelectComponent inputMultiSelectComponent = (InputMultiSelectComponent) component;
                    if (!inputMultiSelectComponent.getSelectedOptions().isEmpty()) {
                        String name = inputMultiSelectComponent.getName();
                        List<Option> selectedOptions = inputMultiSelectComponent.getSelectedOptions();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selectedOptions, 10));
                        Iterator<T> it = selectedOptions.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((Option) it.next()).getValue());
                        }
                        outMap.put(name, m3265to(arrayList));
                    }
                } else if (component instanceof InputAddressComponent) {
                    InputAddressComponent inputAddressComponent = (InputAddressComponent) component;
                    outMap.put(inputAddressComponent.getName(), new ComponentParam.Address(inputAddressComponent.getTextControllerForAddressStreet1().getTextValue(), inputAddressComponent.getTextControllerForAddressStreet2().getTextValue(), inputAddressComponent.getTextControllerForAddressCity().getTextValue(), inputAddressComponent.getTextControllerForAddressSubdivision().getTextValue(), inputAddressComponent.getTextControllerForAddressPostalCode().getTextValue()));
                } else if (component instanceof UiComponentGroup) {
                    List<UiComponent> children = ((UiComponentGroup) component).getChildren();
                    ArrayList arrayList2 = new ArrayList();
                    for (UiComponent uiComponent : children) {
                        View view = this.componentNameToView.get(uiComponent.getName());
                        ComponentView componentView2 = view == null ? null : new ComponentView(uiComponent, view);
                        if (componentView2 != null) {
                            arrayList2.add(componentView2);
                        }
                    }
                    parseComponentsParamsInto(initialComponentValues, outMap, arrayList2);
                } else if (component instanceof InputCheckboxComponent) {
                    InputCheckboxComponent inputCheckboxComponent = (InputCheckboxComponent) component;
                    outMap.put(inputCheckboxComponent.getName(), new ComponentParam.ComponentBoolean(inputCheckboxComponent.getTwoStateViewController().getValue()));
                } else if (component instanceof InputCheckboxGroupComponent) {
                    InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) component;
                    outMap.put(inputCheckboxGroupComponent.getName(), m3265to(CollectionsKt.toList(inputCheckboxGroupComponent.getValue())));
                } else if (component instanceof InputRadioGroupComponent) {
                    InputRadioGroupComponent inputRadioGroupComponent = (InputRadioGroupComponent) component;
                    outMap.put(inputRadioGroupComponent.getName(), new ComponentParam.ComponentString(inputRadioGroupComponent.getTextController().getTextValue()));
                } else if (component instanceof InputNumberComponent) {
                    InputNumberComponent inputNumberComponent = (InputNumberComponent) component;
                    Number value2 = inputNumberComponent.getNumberController().getValue();
                    if (value2 != null) {
                        outMap.put(inputNumberComponent.getName(), m3263to(value2));
                    }
                } else if (component instanceof InputCurrencyComponent) {
                    InputCurrencyComponent inputCurrencyComponent = (InputCurrencyComponent) component;
                    Number value3 = inputCurrencyComponent.getNumberController().getValue();
                    if (value3 != null) {
                        outMap.put(inputCurrencyComponent.getName(), m3263to(value3));
                    }
                } else if (component instanceof ESignatureComponent) {
                    ESignatureComponent eSignatureComponent = (ESignatureComponent) component;
                    Bitmap value4 = eSignatureComponent.getBitmapController().getValue();
                    outMap.put(eSignatureComponent.getName(), new ComponentParam.ESignature(value4 != null ? ExtensionsKt.toBase64Png(value4) : null));
                } else if (component instanceof GovernmentIdNfcScanComponent) {
                    GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) component;
                    GovernmentIdNfcData value5 = governmentIdNfcScanComponent.getNfcDataController().getValue();
                    if (value5 != null) {
                        outMap.put(governmentIdNfcScanComponent.getName(), new ComponentParam.GovernmentIdNfcScan(Base64.encodeToString(FilesKt.readBytes(Uri2.toFile(value5.getDg1Uri())), 0), Base64.encodeToString(FilesKt.readBytes(Uri2.toFile(value5.getDg2Uri())), 0), Base64.encodeToString(FilesKt.readBytes(Uri2.toFile(value5.getSodUri())), 0), value5.getChipAuthenticationStatus()));
                    }
                } else if (!(component instanceof ActionButtonComponent) && !(component instanceof CancelButtonComponent) && !(component instanceof CombinedStepButtonComponent) && !(component instanceof CompleteButtonComponent) && !(component instanceof SubmitButtonComponent) && !(component instanceof ImagePreviewComponent) && !(component instanceof LocalImageComponent) && !(component instanceof PrivacyPolicyComponent) && !(component instanceof QRCodeComponent) && !(component instanceof RemoteImageComponent) && !(component instanceof SpacerComponent) && !(component instanceof TextComponent) && !(component instanceof TitleComponent) && !(component instanceof BrandingComponent) && !(component instanceof CreatePersonaSheetComponent) && !(component instanceof VerifyPersonaButtonComponent)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    /* renamed from: to */
    private final ComponentParam.ComponentString m3264to(String str) {
        return new ComponentParam.ComponentString(str);
    }

    /* renamed from: to */
    private final ComponentParam.ComponentNumber m3263to(Number number) {
        return new ComponentParam.ComponentNumber(number);
    }

    /* renamed from: to */
    private final ComponentParam.ComponentStringList m3265to(List<String> list) {
        return new ComponentParam.ComponentStringList(list);
    }

    private final Map<String, Object> toComponentValues(Map<String, ? extends ComponentParam> map) {
        Set<Map.Entry<String, ? extends ComponentParam>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to(entry.getKey(), ComponentParam2.toValue((ComponentParam) entry.getValue()));
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        return linkedHashMap;
    }

    /* compiled from: UiScreenRunner.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0001R\u001a\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiScreenRunner$Companion;", "Lcom/squareup/workflow1/ui/ViewFactory;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Screen$EntryScreen;", "<init>", "()V", "buildView", "Landroid/view/View;", "initialRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "contextForNewView", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion implements ViewFactory<UiWorkflow.Screen.EntryScreen> {
        private final /* synthetic */ BuilderViewFactory<UiWorkflow.Screen.EntryScreen> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public View buildView(UiWorkflow.Screen.EntryScreen initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.$$delegate_0.buildView(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // com.squareup.workflow1.p415ui.ViewFactory
        public KClass<? super UiWorkflow.Screen.EntryScreen> getType() {
            return this.$$delegate_0.getType();
        }

        private Companion() {
            this.$$delegate_0 = new BuilderViewFactory<>(Reflection.getOrCreateKotlinClass(UiWorkflow.Screen.EntryScreen.class), new Function4() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return UiScreenRunner.Companion.__delegate_0$lambda$2((UiWorkflow.Screen.EntryScreen) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final View __delegate_0$lambda$2(UiWorkflow.Screen.EntryScreen initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
            Context context2;
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(context, "context");
            if (viewGroup == null || (context2 = viewGroup.getContext()) == null) {
                context2 = context;
            }
            Pi2InquiryUiBinding pi2InquiryUiBindingInflate = Pi2InquiryUiBinding.inflate(LayoutInflater.from(context2).cloneInContext(context));
            CoordinatorLayout root = pi2InquiryUiBindingInflate.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            Intrinsics.checkNotNull(pi2InquiryUiBindingInflate);
            ViewShowRendering.bindShowRendering(root, initialRendering, initialViewEnvironment, new UiScreenRunner2(new UiScreenRunner(pi2InquiryUiBindingInflate, initialRendering)));
            CoordinatorLayout root2 = pi2InquiryUiBindingInflate.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "let(...)");
            return root2;
        }
    }
}
