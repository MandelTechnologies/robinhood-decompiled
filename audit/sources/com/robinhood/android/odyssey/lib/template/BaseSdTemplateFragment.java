package com.robinhood.android.odyssey.lib.template;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.text.PrecomputedTextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.FragmentContainerLayout;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.BaseFragments2;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.common.util.extensions.ScreenViewAnalyticables;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.android.odyssey.lib.Constants4;
import com.robinhood.android.odyssey.lib.SdLoggingUtil;
import com.robinhood.android.odyssey.lib.bottomsheet.SdBaseBottomSheet;
import com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment;
import com.robinhood.android.odyssey.lib.template.SdTemplateState;
import com.robinhood.android.odyssey.lib.template.SdTemplateState2;
import com.robinhood.android.odyssey.lib.template.address.SdAddressInputFragment;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.utils.ProgressBarUtils;
import com.robinhood.android.odyssey.lib.view.SdIconDrawableRes;
import com.robinhood.android.odyssey.lib.view.SdInitialPopupFragment;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.serverdrivenui.ApiSdComponentDataChangeResponse;
import com.robinhood.models.api.serverdrivenui.ApiSdResponse;
import com.robinhood.models.api.serverdrivenui.ApiSdSubmitPayloadRequest;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAction;
import com.robinhood.models.api.serverdrivenui.component.ApiSdActionListPage;
import com.robinhood.models.api.serverdrivenui.component.ApiSdBaseClickableComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdBaseIndividualComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdButtonComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdComponentDataChange;
import com.robinhood.models.api.serverdrivenui.component.ApiSdIcon;
import com.robinhood.models.api.serverdrivenui.component.ApiSdPopup;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.models.api.serverdrivenui.page.ApiSdAddressInputPage;
import com.robinhood.models.api.serverdrivenui.page.ApiSdGenericListPage;
import com.robinhood.models.api.serverdrivenui.page.ApiSdImagePage;
import com.robinhood.models.api.serverdrivenui.page.ApiSdInformationalListPage;
import com.robinhood.models.api.serverdrivenui.page.ApiSdInputsPage;
import com.robinhood.models.api.serverdrivenui.page.ApiSdLifecycleConfig;
import com.robinhood.models.api.serverdrivenui.page.ApiSdListOptionsPage;
import com.robinhood.models.api.serverdrivenui.page.ApiSdNavigationHeader;
import com.robinhood.models.api.serverdrivenui.page.ApiSdNavigationHeaderButtonConfig;
import com.robinhood.models.api.serverdrivenui.page.ApiSdPage;
import com.robinhood.models.api.serverdrivenui.page.ApiSdPollingConfig;
import com.robinhood.models.api.serverdrivenui.page.ApiSdPopupPage;
import com.robinhood.models.api.serverdrivenui.page.ApiSdQuestionPage;
import com.robinhood.models.api.serverdrivenui.page.ApiSdRadioGroupPage;
import com.robinhood.models.api.serverdrivenui.page.ApiSdScrollingMarkdownPage;
import com.robinhood.models.api.serverdrivenui.page.ApiSdSearchInputNewPage;
import com.robinhood.models.api.serverdrivenui.page.ApiSdSearchInputPage;
import com.robinhood.models.api.serverdrivenui.page.ApiSdSplashPage;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.Files;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.noties.markwon.Markwon;
import io.reactivex.Maybe;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: BaseSdTemplateFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 ¢\u0001*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0004¡\u0001¢\u0001B\u0011\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\u001a\u0010N\u001a\u00020K2\u0006\u0010O\u001a\u00020P2\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\b\u0010Q\u001a\u00020KH\u0016J\b\u0010R\u001a\u00020KH\u0016J\u0010\u0010S\u001a\u00020K2\u0006\u0010T\u001a\u00020UH\u0016J\b\u0010V\u001a\u000203H\u0016J\u0010\u0010W\u001a\u00020K2\u0006\u0010X\u001a\u000203H\u0014J\u0010\u0010Y\u001a\u00020K2\u0006\u0010Z\u001a\u00020[H\u0014J\u0010\u0010\\\u001a\u00020K2\u0006\u0010]\u001a\u00020^H\u0016J\u001a\u0010_\u001a\u00020K2\b\u0010`\u001a\u0004\u0018\u00010\u00182\u0006\u0010a\u001a\u00020bH\u0016J\u0015\u0010c\u001a\u00020K2\u0006\u0010'\u001a\u00028\u0000H$¢\u0006\u0002\u0010+J\u0010\u0010d\u001a\u00020K2\u0006\u0010e\u001a\u00020fH\u0002J\u0010\u0010g\u001a\u00020K2\u0006\u0010h\u001a\u00020iH\u0002J\u0010\u0010j\u001a\u00020K2\u0006\u0010h\u001a\u00020kH\u0002J\u0010\u0010l\u001a\u00020K2\u0006\u0010e\u001a\u00020mH\u0002J\u001a\u0010n\u001a\u0002032\u0006\u0010o\u001a\u00020\b2\b\u0010p\u001a\u0004\u0018\u00010MH\u0016J\u001a\u0010q\u001a\u0002032\u0006\u0010o\u001a\u00020\b2\b\u0010p\u001a\u0004\u0018\u00010MH\u0016J\b\u0010r\u001a\u00020KH\u0014J\u0010\u0010s\u001a\u00020K2\u0006\u0010a\u001a\u00020tH\u0016J\u0010\u0010u\u001a\u00020K2\u0006\u0010a\u001a\u00020vH\u0016J\u0010\u0010w\u001a\u00020K2\u0006\u0010x\u001a\u00020yH\u0016J+\u0010z\u001a\u00020K2\u0012\u0010{\u001a\u000e\u0012\u0004\u0012\u00020}\u0012\u0004\u0012\u00020~0|2\r\u0010\u007f\u001a\t\u0012\u0004\u0012\u00020}0\u0080\u0001H\u0014J,\u0010\u0081\u0001\u001a\u00020K2\u0012\u0010{\u001a\u000e\u0012\u0004\u0012\u00020}\u0012\u0004\u0012\u00020~0|2\r\u0010\u007f\u001a\t\u0012\u0004\u0012\u00020}0\u0080\u0001H\u0014J\t\u0010\u0082\u0001\u001a\u00020KH\u0014J\u001d\u0010\u0083\u0001\u001a\u00020K2\b\u0010\u0084\u0001\u001a\u00030\u0085\u00012\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0014J\u0013\u0010\u0088\u0001\u001a\u0002032\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001H\u0016J\u0013\u0010\u008b\u0001\u001a\u00020K2\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0014J\u0013\u0010\u008e\u0001\u001a\u0004\u0018\u00010~2\u0006\u0010`\u001a\u00020\u0018H\u0014R\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00188DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001d\u0010\u001aR\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b \u0010\u001aR\u001d\u0010\"\u001a\u0004\u0018\u00010#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0016\u001a\u0004\b$\u0010%R\u001c\u0010'\u001a\u00028\u0000X\u0084.¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001b\u0010-\u001a\u00020.8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0016\u001a\u0004\b/\u00100R\u0014\u00102\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u00106\u001a\u0004\u0018\u0001078DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R+\u0010;\u001a\u0002032\u0006\u0010:\u001a\u0002038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b;\u00105\"\u0004\b<\u0010=R\u000e\u0010@\u001a\u000203X\u0082\u000e¢\u0006\u0002\n\u0000R/\u0010B\u001a\u0004\u0018\u00010A2\b\u0010:\u001a\u0004\u0018\u00010A8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010?\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u001aR\u001e\u0010\u008f\u0001\u001a\u00020\u00188VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\u0016\u001a\u0005\b\u0090\u0001\u0010\u001aR \u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00188VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010\u0016\u001a\u0005\b\u0093\u0001\u0010\u001aR\u0018\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010\u001aR\u0018\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010\u001aR\u0018\u0010\u0099\u0001\u001a\u00030\u009a\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009e\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001¨\u0006£\u0001"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/BaseSdTemplateFragment;", "T", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdPage;", "Lcom/robinhood/android/odyssey/lib/template/BaseSdFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "Lcom/robinhood/android/odyssey/lib/bottomsheet/SdBaseBottomSheet$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "layoutRes", "", "<init>", "(I)V", "callbacks", "Lcom/robinhood/android/odyssey/lib/template/BaseSdTemplateFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/odyssey/lib/template/BaseSdTemplateFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "pageId", "Ljava/util/UUID;", "getPageId", "()Ljava/util/UUID;", "pageId$delegate", "Lkotlin/Lazy;", "pageKey", "", "getPageKey", "()Ljava/lang/String;", "pageKey$delegate", "phoneNumberOverride", "getPhoneNumberOverride", "phoneNumberOverride$delegate", "entryPointIdentifier", "getEntryPointIdentifier", "entryPointIdentifier$delegate", "productTag", "Lcom/robinhood/rosetta/eventlogging/Context$ProductTag;", "getProductTag", "()Lcom/robinhood/rosetta/eventlogging/Context$ProductTag;", "productTag$delegate", "pageData", "getPageData", "()Lcom/robinhood/models/api/serverdrivenui/page/ApiSdPage;", "setPageData", "(Lcom/robinhood/models/api/serverdrivenui/page/ApiSdPage;)V", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdPage;", "duxo", "Lcom/robinhood/android/odyssey/lib/template/SdTemplateDuxo;", "getDuxo", "()Lcom/robinhood/android/odyssey/lib/template/SdTemplateDuxo;", "duxo$delegate", "useFullScreenMode", "", "getUseFullScreenMode", "()Z", "progress", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdNavigationHeader$Progress;", "getProgress", "()Lcom/robinhood/models/api/serverdrivenui/page/ApiSdNavigationHeader$Progress;", "<set-?>", "isBounded", "setBounded", "(Z)V", "isBounded$delegate", "Lkotlin/properties/ReadWriteProperty;", "shouldLockBack", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdButtonComponent$ApiSdButtonComponentData;", "toolbarCtaComponentData", "getToolbarCtaComponentData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdButtonComponent$ApiSdButtonComponentData;", "setToolbarCtaComponentData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdButtonComponent$ApiSdButtonComponentData;)V", "toolbarCtaComponentData$delegate", "odysseyFlowId", "getOdysseyFlowId", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onResume", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "onLoading", "loading", "handleError", "error", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$Error;", "onComponentAppear", "component", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseIndividualComponentData;", "onComponentAction", "componentId", "action", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAction;", "bind", "bindState", "state", "Lcom/robinhood/android/odyssey/lib/template/SdoState;", "performUiEvent", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData;", "openDownloadedFile", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$FileDownloaded;", "renderMarkdowns", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData$LoadedContents;", "onPositiveButtonClicked", "id", "passthroughArgs", "onNegativeButtonClicked", "handleNext", "handleGoBackAction", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAction$GoBack;", "handleDownloadAction", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAction$Download;", "handleDismissAction", "dismissAction", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAction$Dismiss;", "validateValuesAndHandlePostRequest", "newEntities", "", "Lcom/robinhood/android/odyssey/lib/template/SdBackendMetadata;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue;", "toBeValidatedWithEndpoint", "", "validateValuesAndHandleDeferredPostRequest", "handleUpdatePostRequest", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "onComponentDataChangeTargetComponentNotFound", "change", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdComponentDataChange;", "alternateComponentOnSubmitValue", "screenName", "getScreenName", "screenName$delegate", "screenDescription", "getScreenDescription", "screenDescription$delegate", "screenSource", "getScreenSource", "screenTag", "getScreenTag", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "Callbacks", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public abstract class BaseSdTemplateFragment<T extends ApiSdPage> extends BaseSdFragment implements RhDialogFragment.OnClickListener, SdBaseBottomSheet.Callbacks, AutoLoggableFragment {
    private static final String ARG_SD_ENTRY_POINT_IDENTIFIER = "sdEntryPointIdentifier";
    private static final String ARG_SD_PAGE_ID = "sdPageId";
    private static final String ARG_SD_PAGE_KEY = "sdPageKey";
    private static final String ARG_SD_PHONE_NUMBER_OVERRIDE = "sdPhoneNumberOverride";
    private static final String ARG_SD_PRODUCT_TAG = "sdProductTag";
    private static final String ARG_SD_SCREEN_DESCRIPTION = "sdScreenDescription";
    private static final String ARG_SD_SCREEN_NAME = "sdScreenName";
    private static final String HEADER_BUTTON_ID = "headerButtonId";

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: entryPointIdentifier$delegate, reason: from kotlin metadata */
    private final Lazy entryPointIdentifier;

    /* renamed from: isBounded$delegate, reason: from kotlin metadata */
    private final Interfaces3 isBounded;
    protected T pageData;

    /* renamed from: pageId$delegate, reason: from kotlin metadata */
    private final Lazy pageId;

    /* renamed from: pageKey$delegate, reason: from kotlin metadata */
    private final Lazy pageKey;

    /* renamed from: phoneNumberOverride$delegate, reason: from kotlin metadata */
    private final Lazy phoneNumberOverride;

    /* renamed from: productTag$delegate, reason: from kotlin metadata */
    private final Lazy productTag;

    /* renamed from: screenDescription$delegate, reason: from kotlin metadata */
    private final Lazy screenDescription;

    /* renamed from: screenName$delegate, reason: from kotlin metadata */
    private final Lazy screenName;
    private boolean shouldLockBack;

    /* renamed from: toolbarCtaComponentData$delegate, reason: from kotlin metadata */
    private final Interfaces3 toolbarCtaComponentData;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BaseSdTemplateFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/odyssey/lib/template/BaseSdTemplateFragment$Callbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseSdTemplateFragment.class, "isBounded", "isBounded()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseSdTemplateFragment.class, "toolbarCtaComponentData", "getToolbarCtaComponentData()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdButtonComponent$ApiSdButtonComponentData;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    protected abstract void bind(T pageData);

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    public BaseSdTemplateFragment(int i) {
        super(i);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof BaseSdTemplateFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.pageId = Fragments2.argument(this, ARG_SD_PAGE_ID);
        this.pageKey = Fragments2.argument(this, ARG_SD_PAGE_KEY);
        this.phoneNumberOverride = Fragments2.argument(this, ARG_SD_PHONE_NUMBER_OVERRIDE);
        this.entryPointIdentifier = Fragments2.argument(this, ARG_SD_ENTRY_POINT_IDENTIFIER);
        this.productTag = Fragments2.argument(this, ARG_SD_PRODUCT_TAG);
        this.duxo = OldDuxos.oldDuxo(this, SdTemplateDuxo.class);
        Interfaces<Object, Interfaces3<Object, Boolean>> interfacesSavedBoolean = BindSavedState2.savedBoolean(this, false);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.isBounded = interfacesSavedBoolean.provideDelegate(this, kPropertyArr[1]);
        this.toolbarCtaComponentData = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, kPropertyArr[2]);
        this.screenName = Fragments2.argument(this, ARG_SD_SCREEN_NAME);
        this.screenDescription = Fragments2.argument(this, ARG_SD_SCREEN_DESCRIPTION);
    }

    /* compiled from: BaseSdTemplateFragment.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J2\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH&J&\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH&J\b\u0010\u0013\u001a\u00020\u000bH&J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0019H&J\u0014\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH&J\u001a\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001cH&J\u001a\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001e0\u001cH&J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$H&J\u0018\u0010%\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/BaseSdTemplateFragment$Callbacks;", "", "odysseyFlowId", "", "getOdysseyFlowId", "()Ljava/lang/String;", "getPage", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdPage;", "pageId", "Ljava/util/UUID;", "submitUpdateInfo", "", "newPagesBlock", "", "newEntities", "", "Lcom/robinhood/android/odyssey/lib/template/SdBackendMetadata;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue;", "submitNext", "submitExit", "submitBack", "submitGoBackAction", "action", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAction$GoBack;", "submitDismiss", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAction$Dismiss;", "getUpdatedEntitiesSinceLastCheckpoint", "getPostEndpoint", "Lkotlin/Function1;", "Lcom/robinhood/models/api/serverdrivenui/ApiSdSubmitPayloadRequest;", "Lio/reactivex/Maybe;", "Lcom/robinhood/models/api/serverdrivenui/ApiSdResponse;", "getValidationEndpoint", "Lcom/robinhood/models/api/serverdrivenui/ApiSdComponentDataChangeResponse;", "onDeeplinkReceived", "url", "Landroid/net/Uri;", "onExitDeeplinkReceived", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        String getOdysseyFlowId();

        ApiSdPage getPage(UUID pageId);

        Function1<ApiSdSubmitPayloadRequest, Maybe<ApiSdResponse>> getPostEndpoint();

        Map<SdBackendMetadata, ApiSdTypedValue> getUpdatedEntitiesSinceLastCheckpoint();

        Function1<ApiSdSubmitPayloadRequest, Maybe<ApiSdComponentDataChangeResponse>> getValidationEndpoint();

        void onDeeplinkReceived(Uri url);

        void onExitDeeplinkReceived(Uri url, String odysseyFlowId);

        void submitBack(UUID pageId);

        void submitDismiss(ApiSdAction.Dismiss action);

        void submitExit();

        void submitGoBackAction(ApiSdAction.GoBack action);

        void submitNext(UUID pageId, Map<SdBackendMetadata, ? extends ApiSdTypedValue> newEntities);

        void submitUpdateInfo(List<? extends ApiSdPage> newPagesBlock, UUID pageId, Map<SdBackendMetadata, ? extends ApiSdTypedValue> newEntities);

        /* compiled from: BaseSdTemplateFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ void submitNext$default(Callbacks callbacks, UUID uuid, Map map, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitNext");
                }
                if ((i & 2) != 0) {
                    map = MapsKt.emptyMap();
                }
                callbacks.submitNext(uuid, map);
            }
        }
    }

    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final UUID getPageId() {
        return (UUID) this.pageId.getValue();
    }

    protected final String getPageKey() {
        return (String) this.pageKey.getValue();
    }

    protected final String getPhoneNumberOverride() {
        return (String) this.phoneNumberOverride.getValue();
    }

    private final String getEntryPointIdentifier() {
        return (String) this.entryPointIdentifier.getValue();
    }

    private final Context.ProductTag getProductTag() {
        return (Context.ProductTag) this.productTag.getValue();
    }

    protected final T getPageData() {
        T t = this.pageData;
        if (t != null) {
            return t;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pageData");
        return null;
    }

    protected final void setPageData(T t) {
        Intrinsics.checkNotNullParameter(t, "<set-?>");
        this.pageData = t;
    }

    protected final SdTemplateDuxo getDuxo() {
        return (SdTemplateDuxo) this.duxo.getValue();
    }

    private final boolean getUseFullScreenMode() {
        ApiSdNavigationHeader navigation_header = getPageData().getNavigation_header();
        if (navigation_header != null) {
            return navigation_header.getUse_full_screen_mode();
        }
        return false;
    }

    protected final ApiSdNavigationHeader.Progress getProgress() {
        ApiSdNavigationHeader navigation_header = getPageData().getNavigation_header();
        if (navigation_header != null) {
            return navigation_header.getProgress();
        }
        return null;
    }

    private final boolean isBounded() {
        return ((Boolean) this.isBounded.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    private final void setBounded(boolean z) {
        this.isBounded.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    private final ApiSdButtonComponent.ApiSdButtonComponentData getToolbarCtaComponentData() {
        return (ApiSdButtonComponent.ApiSdButtonComponentData) this.toolbarCtaComponentData.getValue(this, $$delegatedProperties[2]);
    }

    private final void setToolbarCtaComponentData(ApiSdButtonComponent.ApiSdButtonComponentData apiSdButtonComponentData) {
        this.toolbarCtaComponentData.setValue(this, $$delegatedProperties[2], apiSdButtonComponentData);
    }

    @Override // com.robinhood.android.odyssey.lib.bottomsheet.SdBaseBottomSheet.Callbacks
    public String getOdysseyFlowId() {
        return getCallbacks().getOdysseyFlowId();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDuxo().setEndpoints(getCallbacks().getPostEndpoint(), getCallbacks().getValidationEndpoint());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApiSdPage page = getCallbacks().getPage(getPageId());
        Intrinsics.checkNotNull(page, "null cannot be cast to non-null type T of com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment");
        setPageData(page);
        ApiSdPollingConfig polling_config = getPageData().getPolling_config();
        if (polling_config != null) {
            getDuxo().configurePolling(getPageKey(), polling_config);
        }
        if (!isBounded()) {
            bind((BaseSdTemplateFragment<T>) getPageData());
            setBounded(true);
        }
        ApiSdButtonComponent.ApiSdButtonComponentData toolbarCtaComponentData = getToolbarCtaComponentData();
        if (toolbarCtaComponentData == null) {
            ApiSdButtonComponent toolbar_cta = getPageData().getComponents().getToolbar_cta();
            toolbarCtaComponentData = toolbar_cta != null ? toolbar_cta.getData() : null;
        }
        setToolbarCtaComponentData(toolbarCtaComponentData);
        setHasOptionsMenu(true);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C226442(this));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.robinhood.android.common.ui.view.FragmentContainerLayout.LayoutParams");
        ((FragmentContainerLayout.LayoutParams) layoutParams).setUnderneathToolbar(getUseFullScreenMode());
    }

    /* compiled from: BaseSdTemplateFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment$onViewCreated$2 */
    /* synthetic */ class C226442 extends FunctionReferenceImpl implements Function1<SdTemplateState, Unit> {
        C226442(Object obj) {
            super(1, obj, BaseSdTemplateFragment.class, "bindState", "bindState(Lcom/robinhood/android/odyssey/lib/template/SdoState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SdTemplateState sdTemplateState) throws Resources.NotFoundException {
            invoke2(sdTemplateState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SdTemplateState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((BaseSdTemplateFragment) this.receiver).bindState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (getUseFullScreenMode()) {
            BaseFragments2.setFullScreenWithSystemUiFlags(this);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        ApiSdAction on_reappear;
        super.onResume();
        ApiSdLifecycleConfig lifecycle_config = getPageData().getLifecycle_config();
        if (lifecycle_config == null || (on_reappear = lifecycle_config.getOn_reappear()) == null) {
            return;
        }
        super.onComponentAction(null, on_reappear);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        String title;
        ThemedColor back_button_color;
        Integer numResolve;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        ApiSdNavigationHeader.Progress progress = getProgress();
        if (progress != null) {
            ProgressBarUtils.updateProgress(toolbar.getProgressBar(), progress);
        }
        super.configureToolbar(toolbar);
        ActionBar supportActionBar = requireBaseActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(!getPageData().getDisableBack());
        }
        ApiSdNavigationHeader navigation_header = getPageData().getNavigation_header();
        Drawable drawable = null;
        final ApiSdNavigationHeaderButtonConfig header_button_config = navigation_header != null ? navigation_header.getHeader_button_config() : null;
        if (header_button_config != null) {
            Toolbar toolbar2 = toolbar.getToolbar();
            SdIconDrawableRes.Companion companion = SdIconDrawableRes.INSTANCE;
            ApiSdIcon icon = header_button_config.getIcon();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Drawable drawable2 = companion.getDrawable(icon, contextRequireContext);
            if (drawable2 != null) {
                android.content.Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                drawable2.setTint(ThemeColors.getThemeColor(contextRequireContext2, C20690R.attr.colorForeground1));
            } else {
                drawable2 = null;
            }
            toolbar2.setNavigationIcon(drawable2);
            toolbar.getToolbar().setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment.configureToolbar.3
                final /* synthetic */ BaseSdTemplateFragment<T> this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseSdTemplateFragment.super.onComponentAction(null, header_button_config.getOn_click());
                }
            });
        } else {
            Toolbar toolbar3 = toolbar.getToolbar();
            Drawable drawable3 = requireContext().getDrawable(C20690R.drawable.ic_rds_arrow_left_24dp);
            if (drawable3 != null) {
                android.content.Context contextRequireContext3 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                drawable3.setTint(ThemeColors.getThemeColor(contextRequireContext3, C20690R.attr.colorForeground1));
            } else {
                drawable3 = null;
            }
            toolbar3.setNavigationIcon(drawable3);
            toolbar.getToolbar().setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment.configureToolbar.5
                final /* synthetic */ BaseSdTemplateFragment<T> this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.this$0.requireBaseActivity().onBackPressed();
                }
            });
        }
        ApiSdNavigationHeader navigation_header2 = getPageData().getNavigation_header();
        if (navigation_header2 != null && (back_button_color = navigation_header2.getBack_button_color()) != null) {
            ResourceReferences4<Integer> resourceReferences4MapColor = ServerToBentoColorMapper.INSTANCE.mapColor(back_button_color);
            if (resourceReferences4MapColor != null) {
                Resources.Theme theme = requireContext().getTheme();
                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                numResolve = resourceReferences4MapColor.resolve(theme);
            } else {
                numResolve = null;
            }
            if (numResolve != null) {
                Toolbar toolbar4 = toolbar.getToolbar();
                Drawable navigationIcon = toolbar.getToolbar().getNavigationIcon();
                if (navigationIcon != null) {
                    navigationIcon.setTint(numResolve.intValue());
                    drawable = navigationIcon;
                }
                toolbar4.setNavigationIcon(drawable);
            }
        }
        ApiSdNavigationHeader navigation_header3 = getPageData().getNavigation_header();
        if (navigation_header3 != null && (title = navigation_header3.getTitle()) != null) {
            new MutablePropertyReference0Impl(toolbar) { // from class: com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment.configureToolbar.8
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((RhToolbar) this.receiver).getTitle();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                public void set(Object obj) {
                    ((RhToolbar) this.receiver).setTitle((CharSequence) obj);
                }
            }.set(title);
        }
        toolbar.getProgressBar().setVisibility(getProgress() != null ? 0 : 8);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        ApiSdNavigationHeader navigation_header = getPageData().getNavigation_header();
        ApiSdNavigationHeaderButtonConfig header_button_config = navigation_header != null ? navigation_header.getHeader_button_config() : null;
        if (this.shouldLockBack) {
            return true;
        }
        if (getPageData().getDisableBack()) {
            getCallbacks().submitExit();
            return true;
        }
        if (header_button_config != null) {
            super.onComponentAction(null, header_button_config.getOn_click());
            return true;
        }
        getCallbacks().submitBack(getPageData().getPageId());
        return super.onBackPressed();
    }

    protected void onLoading(boolean loading) {
        this.shouldLockBack = loading;
        requireBaseActivity().showProgressBar(loading);
    }

    protected void handleError(SdTemplateState2.Error error) {
        Intrinsics.checkNotNullParameter(error, "error");
        AbsErrorHandler.handleError$default(getActivityErrorHandler(), error.getThrowable(), false, 2, null);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView.Callbacks
    public void onComponentAppear(ApiSdBaseIndividualComponentData component) {
        String id;
        Intrinsics.checkNotNullParameter(component, "component");
        if (!(component instanceof ApiSdBaseClickableComponentData) || ((ApiSdBaseClickableComponentData) component).getOn_click() == null || (id = component.getId()) == null) {
            return;
        }
        AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(getAnalytics(), SdLoggingUtil.getScreenName(getPageData()), SdLoggingUtil.getButtonTitle(getPageData(), id), null, null, null, null, SdLoggingUtil.getScreenTag(this), null, 188, null);
        EventLogger.DefaultImpls.logUserInteractionEvent$default(getEventLogger(), UserInteractionEventData.copy$default(getScreenEventData(), UserInteractionEventData.EventType.APPEAR, null, new Component(null, SdLoggingUtil.getButtonTitle(getPageData(), id), null, 5, null), null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null), false, false, 6, null);
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdFragment, com.robinhood.android.odyssey.lib.view.SdBaseView.Callbacks
    public void onComponentAction(String componentId, ApiSdAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (componentId != null) {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), SdLoggingUtil.getScreenName(getPageData()), SdLoggingUtil.getButtonTitle(getPageData(), componentId), null, null, null, null, SdLoggingUtil.getScreenTag(this), null, 188, null);
            EventLogger.DefaultImpls.logUserInteractionEvent$default(getEventLogger(), UserInteractionEventData.copy$default(getScreenEventData(), UserInteractionEventData.EventType.TAP, null, new Component(null, SdLoggingUtil.getButtonTitle(getPageData(), componentId), null, 5, null), SdLoggingUtil.getEventAction(action), null, null, null, 114, null), false, false, 6, null);
        }
        super.onComponentAction(componentId, action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindState(SdTemplateState state) throws Resources.NotFoundException {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (state instanceof SdTemplateState.SdoUiEvent) {
            SdTemplateState.SdoUiEvent sdoUiEvent = (SdTemplateState.SdoUiEvent) state;
            sdoUiEvent.getEvent().consumeWith(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BaseSdTemplateFragment.bindState$lambda$9(booleanRef, this, (SdTemplateState2) obj);
                }
            });
            SdTemplateState2 sdTemplateState2Consume = sdoUiEvent.getEvent().consume();
            if (sdTemplateState2Consume != null) {
                performUiEvent(sdTemplateState2Consume);
            }
        }
        if (booleanRef.element) {
            return;
        }
        onLoading(state instanceof SdTemplateState.Loading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindState$lambda$9(Ref.BooleanRef booleanRef, BaseSdTemplateFragment baseSdTemplateFragment, SdTemplateState2 uiEventData) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiEventData, "uiEventData");
        booleanRef.element = uiEventData.getPreserveLoadingState();
        baseSdTemplateFragment.performUiEvent(uiEventData);
        return Unit.INSTANCE;
    }

    private final void performUiEvent(SdTemplateState2 data) throws Resources.NotFoundException {
        if (data instanceof SdTemplateState2.Error) {
            handleError((SdTemplateState2.Error) data);
            return;
        }
        if (data instanceof SdTemplateState2.CheckpointUpdate) {
            SdTemplateState2.CheckpointUpdate checkpointUpdate = (SdTemplateState2.CheckpointUpdate) data;
            getCallbacks().submitUpdateInfo(checkpointUpdate.getNewPages(), getPageData().getPageId(), checkpointUpdate.getNewEntities());
            return;
        }
        if (data instanceof SdTemplateState2.DeeplinkReceived) {
            getCallbacks().onDeeplinkReceived(((SdTemplateState2.DeeplinkReceived) data).getUrl());
            return;
        }
        if (data instanceof SdTemplateState2.ExitDeeplinkReceived) {
            getCallbacks().onExitDeeplinkReceived(((SdTemplateState2.ExitDeeplinkReceived) data).getUrl(), getCallbacks().getOdysseyFlowId());
            return;
        }
        if (data instanceof SdTemplateState2.LoadedContents) {
            renderMarkdowns((SdTemplateState2.LoadedContents) data);
            return;
        }
        if (data instanceof SdTemplateState2.DeferredPostValidationSuccess) {
            getCallbacks().submitNext(getPageData().getPageId(), ((SdTemplateState2.DeferredPostValidationSuccess) data).getNewEntities());
            return;
        }
        if (data instanceof SdTemplateState2.ComponentDataChange) {
            handleComponentDataChanges(((SdTemplateState2.ComponentDataChange) data).getChanges());
            return;
        }
        if (data instanceof SdTemplateState2.PopupReceived) {
            showPopup(((SdTemplateState2.PopupReceived) data).getPopup());
            return;
        }
        if (data instanceof SdTemplateState2.FileDownloaded) {
            openDownloadedFile((SdTemplateState2.FileDownloaded) data);
            return;
        }
        if (!(data instanceof SdTemplateState2.UpdatePage)) {
            throw new NoWhenBranchMatchedException();
        }
        ApiSdPage page = ((SdTemplateState2.UpdatePage) data).getPage();
        if (page == null) {
            page = null;
        }
        if (page != null) {
            bind((BaseSdTemplateFragment<T>) page);
        }
    }

    private final void openDownloadedFile(SdTemplateState2.FileDownloaded data) throws Resources.NotFoundException {
        File file = data.getFile();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Intent openOrShareIntent = Files.getOpenOrShareIntent(file, fragmentActivityRequireActivity, C20335R.string.odyssey_asset_export, data.getContentType());
        if (openOrShareIntent == null) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            ContextsUiExtensions.showShortToast(contextRequireContext, C11048R.string.general_error_no_browser_found);
            return;
        }
        startActivity(openOrShareIntent);
    }

    private final void renderMarkdowns(SdTemplateState2.LoadedContents state) {
        Iterator<T> it = state.getLoadedInfo().iterator();
        while (it.hasNext()) {
            Tuples2 tuples2 = (Tuples2) it.next();
            PrecomputedTextCompat precomputedTextCompat = (PrecomputedTextCompat) tuples2.component1();
            String str = (String) tuples2.component2();
            Markwon markwon = getMarkwon();
            Object objFindComponentByTag = findComponentByTag(str);
            Intrinsics.checkNotNull(objFindComponentByTag, "null cannot be cast to non-null type android.widget.TextView");
            markwon.setParsedMarkdown((TextView) objFindComponentByTag, precomputedTextCompat);
        }
        state.getOnFinishLoadingAction().invoke();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        ApiSdAction on_click;
        ApiSdPopup apiSdPopup = getRecentPopups().get(Integer.valueOf(id));
        if (apiSdPopup != null) {
            ApiSdButtonComponent primary_cta = apiSdPopup.getPrimary_cta();
            ApiSdButtonComponent.ApiSdButtonComponentData data = primary_cta != null ? primary_cta.getData() : null;
            if (data != null && (on_click = data.getOn_click()) != null) {
                onComponentAction(data.getId(), on_click);
                return true;
            }
            return super.onPositiveButtonClicked(id, passthroughArgs);
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        ApiSdAction on_click;
        ApiSdPopup apiSdPopup = getRecentPopups().get(Integer.valueOf(id));
        if (apiSdPopup != null) {
            ApiSdButtonComponent secondary_cta = apiSdPopup.getSecondary_cta();
            ApiSdButtonComponent.ApiSdButtonComponentData data = secondary_cta != null ? secondary_cta.getData() : null;
            if (data != null && (on_click = data.getOn_click()) != null) {
                onComponentAction(data.getId(), on_click);
                return true;
            }
            return super.onNegativeButtonClicked(id, passthroughArgs);
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdFragment
    protected void handleNext() {
        super.handleNext();
        Callbacks.DefaultImpls.submitNext$default(getCallbacks(), getPageData().getPageId(), null, 2, null);
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdFragment
    public void handleGoBackAction(ApiSdAction.GoBack action) {
        Intrinsics.checkNotNullParameter(action, "action");
        getCallbacks().submitGoBackAction(action);
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdFragment
    public void handleDownloadAction(ApiSdAction.Download action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ApiSdAction.Download.Payload payload = action.getPayload();
        SdTemplateDuxo duxo = getDuxo();
        String file_name = payload.getFile_name();
        String url = payload.getUrl();
        String content_type = payload.getContent_type();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        duxo.downloadFileContent(file_name, url, content_type, contextRequireContext);
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdFragment
    public void handleDismissAction(ApiSdAction.Dismiss dismissAction) {
        Intrinsics.checkNotNullParameter(dismissAction, "dismissAction");
        getCallbacks().submitDismiss(dismissAction);
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdFragment
    protected void validateValuesAndHandlePostRequest(Map<SdBackendMetadata, ? extends ApiSdTypedValue> newEntities, Set<SdBackendMetadata> toBeValidatedWithEndpoint) {
        Map mapEmptyMap;
        Intrinsics.checkNotNullParameter(newEntities, "newEntities");
        Intrinsics.checkNotNullParameter(toBeValidatedWithEndpoint, "toBeValidatedWithEndpoint");
        if (Intrinsics.areEqual(getPageKey(), Constants4.PAGE_KEY_CONFIRM_PHONE_NUMBER) && getPhoneNumberOverride() != null) {
            SdBackendMetadata sdBackendMetadata = new SdBackendMetadata(Constants4.ENTITY_FIELD_PHONE_NUMBER, Constants4.ENTITY_NAME_PROFILE_INFO);
            String phoneNumberOverride = getPhoneNumberOverride();
            Intrinsics.checkNotNull(phoneNumberOverride);
            mapEmptyMap = MapsKt.mapOf(Tuples4.m3642to(sdBackendMetadata, new ApiSdTypedValue.ApiSdString(phoneNumberOverride)));
        } else {
            mapEmptyMap = MapsKt.emptyMap();
        }
        getDuxo().validateValuesAndHandlePostRequest(MapsKt.plus(newEntities, mapEmptyMap), getCallbacks().getUpdatedEntitiesSinceLastCheckpoint(), toBeValidatedWithEndpoint);
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdFragment
    protected void validateValuesAndHandleDeferredPostRequest(Map<SdBackendMetadata, ? extends ApiSdTypedValue> newEntities, Set<SdBackendMetadata> toBeValidatedWithEndpoint) {
        Intrinsics.checkNotNullParameter(newEntities, "newEntities");
        Intrinsics.checkNotNullParameter(toBeValidatedWithEndpoint, "toBeValidatedWithEndpoint");
        getDuxo().validateValuesAndHandleDeferredPostRequest(newEntities, toBeValidatedWithEndpoint);
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdFragment
    protected void handleUpdatePostRequest() {
        getDuxo().handleUpdatePostRequest(getPageKey());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        menu.clear();
        ApiSdButtonComponent.ApiSdButtonComponentData toolbarCtaComponentData = getToolbarCtaComponentData();
        if (toolbarCtaComponentData != null) {
            String id = toolbarCtaComponentData.getId();
            MenuItem menuItemAdd = menu.add(0, id != null ? id.hashCode() : 0, 0, toolbarCtaComponentData.getText());
            ApiSdIcon icon = toolbarCtaComponentData.getIcon();
            if (icon != null) {
                SdIconDrawableRes.Companion companion = SdIconDrawableRes.INSTANCE;
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                menuItemAdd.setIcon(companion.getDrawable(icon, contextRequireContext));
            }
            menuItemAdd.setShowAsAction(1);
            menuItemAdd.setVisible(!Intrinsics.areEqual(toolbarCtaComponentData.getIs_visible(), Boolean.FALSE));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ApiSdButtonComponent.ApiSdButtonComponentData toolbarCtaComponentData = getToolbarCtaComponentData();
        String id = toolbarCtaComponentData != null ? toolbarCtaComponentData.getId() : null;
        if (id != null && item.getItemId() == id.hashCode()) {
            ApiSdButtonComponent.ApiSdButtonComponentData toolbarCtaComponentData2 = getToolbarCtaComponentData();
            ApiSdAction on_click = toolbarCtaComponentData2 != null ? toolbarCtaComponentData2.getOn_click() : null;
            Intrinsics.checkNotNull(on_click);
            onComponentAction(id, on_click);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdFragment
    protected void onComponentDataChangeTargetComponentNotFound(ApiSdComponentDataChange change) {
        Intrinsics.checkNotNullParameter(change, "change");
        if (change instanceof ApiSdComponentDataChange.Button) {
            ApiSdComponentDataChange.Button button = (ApiSdComponentDataChange.Button) change;
            String target_component_id = button.getTarget_component_id();
            ApiSdButtonComponent.ApiSdButtonComponentData toolbarCtaComponentData = getToolbarCtaComponentData();
            if (Intrinsics.areEqual(target_component_id, toolbarCtaComponentData != null ? toolbarCtaComponentData.getId() : null)) {
                setToolbarCtaComponentData((ApiSdButtonComponent.ApiSdButtonComponentData) MergePropertiesValues.mergePropertiesValues(getToolbarCtaComponentData(), Reflection.getOrCreateKotlinClass(ApiSdButtonComponent.ApiSdButtonComponentData.class), button.getData()));
                requireActivity().invalidateOptionsMenu();
                return;
            }
        }
        if (getComposeComponentIds().contains(change.getTarget_component_id())) {
            ApiSdBaseIndividualComponentData data = change.getData();
            if (data != null) {
                getComposeComponentDataChangeMap().put(change.getTarget_component_id(), data);
                return;
            }
            return;
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(change);
        throw new ExceptionsH();
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdFragment
    protected ApiSdTypedValue alternateComponentOnSubmitValue(String componentId) {
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        ApiSdButtonComponent.ApiSdButtonComponentData toolbarCtaComponentData = getToolbarCtaComponentData();
        if (Intrinsics.areEqual(componentId, toolbarCtaComponentData != null ? toolbarCtaComponentData.getId() : null)) {
            ApiSdButtonComponent.ApiSdButtonComponentData toolbarCtaComponentData2 = getToolbarCtaComponentData();
            if (toolbarCtaComponentData2 != null) {
                return toolbarCtaComponentData2.getTyped_value_object();
            }
            return null;
        }
        return getAlternateComponentOnSubmitValueMap().get(componentId);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return (String) this.screenName.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    /* renamed from: getScreenDescription */
    public String getProfileId() {
        return (String) this.screenDescription.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenSource() {
        return requireBaseActivity().getScreenSource();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenTag() {
        return SdLoggingUtil.getScreenTag(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return ScreenViewAnalyticables.getScreenData(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        Screen eventScreen = getEventScreen();
        String entryPointIdentifier = getEntryPointIdentifier();
        if (entryPointIdentifier == null) {
            entryPointIdentifier = "";
        }
        String str = entryPointIdentifier;
        Context.ProductTag productTag = getProductTag();
        if (productTag == null) {
            productTag = Context.ProductTag.PRODUCT_TAG_UNSPECIFIED;
        }
        return new UserInteractionEventData(null, eventScreen, null, null, new Context(0, 0, 0, null, null, null, null, productTag, 0, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1153, -1, -1, -1, -1, -1, 16383, null), null, null, 109, null);
    }

    /* compiled from: BaseSdTemplateFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/BaseSdTemplateFragment$Companion;", "", "<init>", "()V", "ARG_SD_PAGE_ID", "", "ARG_SD_PAGE_KEY", "ARG_SD_SCREEN_NAME", "ARG_SD_SCREEN_DESCRIPTION", "ARG_SD_PHONE_NUMBER_OVERRIDE", "ARG_SD_ENTRY_POINT_IDENTIFIER", "ARG_SD_PRODUCT_TAG", "HEADER_BUTTON_ID", "newInstance", "Lcom/robinhood/android/odyssey/lib/template/BaseSdTemplateFragment;", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdPage;", "apiPage", "phoneNumber", "entryPointIdentifier", "productTag", "Lcom/robinhood/rosetta/eventlogging/Context$ProductTag;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BaseSdTemplateFragment<? extends ApiSdPage> newInstance(ApiSdPage apiPage, String phoneNumber, String entryPointIdentifier, Context.ProductTag productTag) {
            BaseSdTemplateFragment<? extends ApiSdPage> sdActionListFragment;
            Intrinsics.checkNotNullParameter(apiPage, "apiPage");
            if (apiPage instanceof ApiSdAddressInputPage) {
                sdActionListFragment = new SdAddressInputFragment();
            } else if (apiPage instanceof ApiSdInputsPage) {
                sdActionListFragment = new SdInputsFragment();
            } else if (apiPage instanceof ApiSdInformationalListPage) {
                sdActionListFragment = new SdInformationalListFragment();
            } else if (apiPage instanceof ApiSdSearchInputPage) {
                sdActionListFragment = new SdSearchInputFragment();
            } else if (apiPage instanceof ApiSdSearchInputNewPage) {
                sdActionListFragment = new SdSearchInputNewFragment();
            } else if (apiPage instanceof ApiSdListOptionsPage) {
                sdActionListFragment = new SdSelectionFragment();
            } else if (apiPage instanceof ApiSdQuestionPage) {
                sdActionListFragment = new SdQuestionFragment();
            } else if (apiPage instanceof ApiSdScrollingMarkdownPage) {
                sdActionListFragment = new SdScrollingMarkdownFragment();
            } else if (apiPage instanceof ApiSdImagePage) {
                sdActionListFragment = new SdImageFragment();
            } else if (apiPage instanceof ApiSdPopupPage) {
                sdActionListFragment = new SdInitialPopupFragment();
            } else if (apiPage instanceof ApiSdSplashPage) {
                sdActionListFragment = new SdSplashFragment();
            } else if (apiPage instanceof ApiSdRadioGroupPage) {
                sdActionListFragment = new SdRadioGroupFragment();
            } else if (apiPage instanceof ApiSdGenericListPage) {
                sdActionListFragment = new SdGenericTemplateFragment();
            } else {
                if (!(apiPage instanceof ApiSdActionListPage)) {
                    Preconditions.INSTANCE.failUnexpectedItemKotlin(apiPage);
                    throw new ExceptionsH();
                }
                sdActionListFragment = new SdActionListFragment();
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable(BaseSdTemplateFragment.ARG_SD_PAGE_ID, apiPage.getPageId());
            bundle.putString(BaseSdTemplateFragment.ARG_SD_PAGE_KEY, apiPage.getPage_key());
            bundle.putString(BaseSdTemplateFragment.ARG_SD_SCREEN_NAME, SdLoggingUtil.getScreenName(apiPage));
            bundle.putString(BaseSdTemplateFragment.ARG_SD_SCREEN_DESCRIPTION, SdLoggingUtil.getScreenDescription(apiPage));
            bundle.putString(BaseSdTemplateFragment.ARG_SD_PHONE_NUMBER_OVERRIDE, phoneNumber);
            bundle.putString(BaseSdTemplateFragment.ARG_SD_ENTRY_POINT_IDENTIFIER, entryPointIdentifier);
            bundle.putSerializable(BaseSdTemplateFragment.ARG_SD_PRODUCT_TAG, productTag);
            sdActionListFragment.setArguments(bundle);
            return sdActionListFragment;
        }
    }
}
