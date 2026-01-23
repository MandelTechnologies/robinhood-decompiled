package com.withpersona.sdk2.inquiry.p424ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.squareup.workflow1.Sink;
import com.squareup.workflow1.Snapshot;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.StatefulWorkflow2;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.p415ui.SnapshotParcels;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import com.withpersona.sdk2.inquiry.nfc.NfcDataGroupType;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcStrings;
import com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker;
import com.withpersona.sdk2.inquiry.p424ui.CreateReusablePersonaWorker;
import com.withpersona.sdk2.inquiry.p424ui.UiState;
import com.withpersona.sdk2.inquiry.p424ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.p424ui.VerifyReusablePersonaWorker;
import com.withpersona.sdk2.inquiry.p424ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionsState;
import com.withpersona.sdk2.inquiry.permissions.PermissionsState2;
import com.withpersona.sdk2.inquiry.permissions.PermissionsUtils;
import com.withpersona.sdk2.inquiry.resources.R$string;
import com.withpersona.sdk2.inquiry.shared.ContextUtils3;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig2;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig3;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.CreatePersonaSheetComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.LoadingIndicatorComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.SubmitButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent3;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentGroup;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.GovernmentIdNfcData;
import com.withpersona.sdk2.inquiry.steps.p423ui.utils.StepStyleUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;

/* compiled from: UiWorkflow.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 62\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u00046789BI\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J<\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00032\"\u0010\u001f\u001a\u001e0 R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016J*\u0010!\u001a\u00020\"*\u00180#R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040$2\u0006\u0010\u001e\u001a\u00020%H\u0002J\u0018\u0010&\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0003H\u0002JD\u0010'\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020%2\"\u0010\u001f\u001a\u001e0 R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010(\u001a\u00020)H\u0002J<\u0010*\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020%2\"\u0010\u001f\u001a\u001e0 R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002J\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u0003H\u0016J&\u0010-\u001a\u00020\"*\b\u0012\u0004\u0012\u00020/0.2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\"01H\u0002J \u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020/2\u0006\u00104\u001a\u0002052\u0006\u0010\u001e\u001a\u00020%H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;", "Lcom/squareup/workflow1/StatefulWorkflow;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Output;", "", "applicationContext", "Landroid/content/Context;", "nfcScanWorkerFactory", "Lcom/withpersona/sdk2/inquiry/nfc/ScanNfcWorker$Factory;", "createReusablePersonaWorkerFactory", "Lcom/withpersona/sdk2/inquiry/ui/CreateReusablePersonaWorker$Factory;", "verifyReusablePersonaWorkerFactory", "Lcom/withpersona/sdk2/inquiry/ui/VerifyReusablePersonaWorker$Factory;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;", "permissionRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "componentWorkHelper", "Lcom/withpersona/sdk2/inquiry/ui/ComponentWorkHelper;", "externalEventLogger", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ExternalEventLogger;", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/nfc/ScanNfcWorker$Factory;Lcom/withpersona/sdk2/inquiry/ui/CreateReusablePersonaWorker$Factory;Lcom/withpersona/sdk2/inquiry/ui/VerifyReusablePersonaWorker$Factory;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/ui/ComponentWorkHelper;Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ExternalEventLogger;)V", "initialState", "props", "snapshot", "Lcom/squareup/workflow1/Snapshot;", "render", "renderProps", "renderState", "context", "Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;", "outputSubmit", "", "Lcom/squareup/workflow1/WorkflowAction$Updater;", "Lcom/squareup/workflow1/WorkflowAction;", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "logState", "runGovIdNfcWork", "nfcScan", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;", "handlePendingAction", "snapshotState", "state", "recurse", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "action", "Lkotlin/Function1;", "setTappedStates", "tappedUiComponent", "isTappedComponentVisible", "", "Companion", "Input", "Output", "Screen", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class UiWorkflow extends StatefulWorkflow<Input, UiState, Output, Object> {
    private final Context applicationContext;
    private final ComponentWorkHelper componentWorkHelper;
    private final CreateReusablePersonaWorker.Factory createReusablePersonaWorkerFactory;
    private final ExternalEventLogger externalEventLogger;
    private final NavigationStateManager navigationStateManager;
    private final ScanNfcWorker.Factory nfcScanWorkerFactory;
    private final PermissionRequestWorkflow permissionRequestWorkflow;
    private final VerifyReusablePersonaWorker.Factory verifyReusablePersonaWorkerFactory;

    /* compiled from: UiWorkflow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PermissionsState2.values().length];
            try {
                iArr[PermissionsState2.PermissionGranted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionsState2.PermissionRejected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PermissionsState2.SettingsLaunched.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GovernmentIdNfcScan.DataGroupTypes.values().length];
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg1.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg2.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg14.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Sod.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public UiState initialState(Input props, Snapshot snapshot) {
        List<UiComponent> listEmptyList;
        Intrinsics.checkNotNullParameter(props, "props");
        if (snapshot != null) {
            ByteString byteStringBytes = snapshot.bytes();
            Parcelable parcelable = null;
            if (byteStringBytes.size() <= 0) {
                byteStringBytes = null;
            }
            if (byteStringBytes != null) {
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                byte[] byteArray = byteStringBytes.toByteArray();
                parcelObtain.unmarshall(byteArray, 0, byteArray.length);
                parcelObtain.setDataPosition(0);
                parcelable = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.checkNotNull(parcelable);
                Intrinsics.checkNotNullExpressionValue(parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
            }
            UiState uiState = (UiState) parcelable;
            if (uiState != null) {
                return uiState;
            }
        }
        List<UiComponentConfig> components = props.getComponents();
        if (components == null || (listEmptyList = UiComponent3.m3260to(components)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<UiComponent> list = listEmptyList;
        String stepName = props.getStepName();
        StepStyles.UiStepStyle styles = props.getStyles();
        List<UiComponentError> serverComponentErrors = props.getServerComponentErrors();
        if (serverComponentErrors == null) {
            serverComponentErrors = CollectionsKt.emptyList();
        }
        return new UiState.Displaying(list, stepName, serverComponentErrors, styles, null, null, null, null, false, false, null, null, null, 8176, null);
    }

    public UiWorkflow(Context applicationContext, ScanNfcWorker.Factory nfcScanWorkerFactory, CreateReusablePersonaWorker.Factory createReusablePersonaWorkerFactory, VerifyReusablePersonaWorker.Factory verifyReusablePersonaWorkerFactory, NavigationStateManager navigationStateManager, PermissionRequestWorkflow permissionRequestWorkflow, ComponentWorkHelper componentWorkHelper, ExternalEventLogger externalEventLogger) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(nfcScanWorkerFactory, "nfcScanWorkerFactory");
        Intrinsics.checkNotNullParameter(createReusablePersonaWorkerFactory, "createReusablePersonaWorkerFactory");
        Intrinsics.checkNotNullParameter(verifyReusablePersonaWorkerFactory, "verifyReusablePersonaWorkerFactory");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        Intrinsics.checkNotNullParameter(componentWorkHelper, "componentWorkHelper");
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        this.applicationContext = applicationContext;
        this.nfcScanWorkerFactory = nfcScanWorkerFactory;
        this.createReusablePersonaWorkerFactory = createReusablePersonaWorkerFactory;
        this.verifyReusablePersonaWorkerFactory = verifyReusablePersonaWorkerFactory;
        this.navigationStateManager = navigationStateManager;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.componentWorkHelper = componentWorkHelper;
        this.externalEventLogger = externalEventLogger;
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public Object render(final Input renderProps, final UiState renderState, final StatefulWorkflow<? super Input, UiState, ? extends Output, ? extends Object>.RenderContext context) {
        final UiWorkflow uiWorkflow;
        final UiState uiState;
        Function3 function3;
        Function0 function0;
        Function0 function02;
        Screen.EntryScreen.AutoSubmit autoSubmit;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (renderProps.getIsRestoringState()) {
            return Unit.INSTANCE;
        }
        logState(renderProps, renderState);
        if (!(renderState instanceof UiState.Displaying)) {
            throw new NoWhenBranchMatchedException();
        }
        UiState.Displaying displaying = (UiState.Displaying) renderState;
        handlePendingAction(renderProps, displaying, context);
        this.navigationStateManager.setState(renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), displaying.getPendingAction() == null && !renderProps.getIsSubmitting());
        recurse(displaying.getComponents(), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.render$lambda$0(this.f$0, renderProps, renderState, context, (UiComponent) obj);
            }
        });
        if (displaying.getNfcScan() != null) {
            runGovIdNfcWork(renderProps, displaying, context, displaying.getNfcScan());
        }
        PermissionsState permissionsState = renderProps.getInquirySessionConfig().getGpsPrecisionRequirement() == InquirySessionConfig3.ROUGH ? PermissionsState.RoughLocation : PermissionsState.PreciseLocation;
        final boolean z = renderProps.getInquirySessionConfig().getGpsCollectionRequirement() == InquirySessionConfig2.OPTIONAL;
        String error = displaying.getError();
        if (error == null && renderProps.getTransitionError() != null) {
            error = this.applicationContext.getString(R$string.pi2_network_connection_error);
        }
        String str = error;
        if (displaying.getAutoSubmit() == null) {
            UiComponent2 uiComponent2 = (UiComponent2) ExtensionsKt.findFirst(displaying.getComponents(), Reflection.getOrCreateKotlinClass(UiComponent2.class), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(UiWorkflow.render$lambda$1((UiComponent2) obj));
                }
            });
            if (uiComponent2 != null) {
                context.runningSideEffect("begin_countdown", new UiWorkflow2(context, this, renderState, uiComponent2, null));
            }
        }
        UiState.Displaying.AutoSubmit autoSubmit2 = displaying.getAutoSubmit();
        if (autoSubmit2 == null || autoSubmit2.getCountdown() < 1) {
            uiWorkflow = this;
            uiState = renderState;
        } else {
            String str2 = "countdown_" + autoSubmit2.getCountdown();
            UiWorkflow3 uiWorkflow3 = new UiWorkflow3(context, this, autoSubmit2, renderState, null);
            uiWorkflow = this;
            uiState = renderState;
            context.runningSideEffect(str2, uiWorkflow3);
        }
        List<UiComponent> components = displaying.getComponents();
        List<UiComponentConfig> components2 = renderProps.getComponents();
        List<UiComponentError> componentErrors = displaying.getComponentErrors();
        List<UiComponentError> serverComponentErrors = renderProps.getServerComponentErrors();
        if (serverComponentErrors == null) {
            serverComponentErrors = CollectionsKt.emptyList();
        }
        List listPlus = CollectionsKt.plus((Collection) componentErrors, (Iterable) serverComponentErrors);
        NavigationState navigationState = uiWorkflow.navigationStateManager.getNavigationState();
        Function3 function32 = new Function3() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return UiWorkflow.render$lambda$6(this.f$0, uiState, renderProps, context, (UiComponent) obj, ((Boolean) obj2).booleanValue(), (Map) obj3);
            }
        };
        Function0 function03 = new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiWorkflow.render$lambda$8(context, uiWorkflow);
            }
        };
        Function0 function04 = new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiWorkflow.render$lambda$10(context, uiWorkflow, renderProps);
            }
        };
        Function1 function1 = new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.render$lambda$12(this.f$0, uiState, context, (GovernmentIdNfcScanComponent) obj);
            }
        };
        Function2 function2 = new Function2() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return UiWorkflow.render$lambda$14(this.f$0, uiState, context, (VerifyPersonaButtonComponent) obj, (Map) obj2);
            }
        };
        if (renderProps.getIsSubmitting() || displaying.getAutoSubmit() == null) {
            function3 = function32;
            function0 = function03;
            function02 = function04;
            autoSubmit = null;
        } else {
            function3 = function32;
            function0 = function03;
            function02 = function04;
            autoSubmit = new Screen.EntryScreen.AutoSubmit(displaying.getAutoSubmit().getComponent(), displaying.getAutoSubmit().getCountdownText(), displaying.getAutoSubmit().getCountdown() <= 0);
        }
        Screen.EntryScreen entryScreen = new Screen.EntryScreen(components, components2, listPlus, navigationState, function3, function0, function02, function1, function2, autoSubmit, new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiWorkflow.render$lambda$16(context, uiWorkflow);
            }
        }, new Function2() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return UiWorkflow.render$lambda$18(context, uiWorkflow, uiState, (InputAddressComponent) obj, (String) obj2);
            }
        }, displaying.getPendingAction() != null || renderProps.getIsSubmitting(), displaying.getStyles(), str, new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiWorkflow.render$lambda$20(context, uiWorkflow, uiState);
            }
        }, new Function2() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return UiWorkflow.render$lambda$23(context, uiWorkflow, uiState, (CreatePersonaSheetComponent) obj, (UiComponent) obj2);
            }
        });
        boolean isRequestingGpsPermissions = displaying.getIsRequestingGpsPermissions();
        String gpsPermissionsTitle = renderProps.getGpsPermissionsTitle();
        if (gpsPermissionsTitle == null) {
            gpsPermissionsTitle = "";
        }
        String str3 = gpsPermissionsTitle;
        String gpsPermissionsRationale = renderProps.getGpsPermissionsRationale();
        if (gpsPermissionsRationale == null) {
            gpsPermissionsRationale = "Gps permission are required to verify your identity";
        }
        Context context2 = uiWorkflow.applicationContext;
        String string2 = context2.getString(R$string.pi2_ui_gps_permission_denied_rationale, ContextUtils3.getApplicationName(context2));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String gpsFeatureModalPositiveButton = renderProps.getGpsFeatureModalPositiveButton();
        if (gpsFeatureModalPositiveButton == null) {
            gpsFeatureModalPositiveButton = uiWorkflow.applicationContext.getString(R$string.pi2_permissions_continue);
            Intrinsics.checkNotNullExpressionValue(gpsFeatureModalPositiveButton, "getString(...)");
        }
        String gpsPermissionsModalNegativeButton = renderProps.getGpsPermissionsModalNegativeButton();
        if (gpsPermissionsModalNegativeButton == null) {
            gpsPermissionsModalNegativeButton = uiWorkflow.applicationContext.getString(R$string.pi2_permissions_continue);
            Intrinsics.checkNotNullExpressionValue(gpsPermissionsModalNegativeButton, "getString(...)");
        }
        return PermissionsUtils.withRequestPermissionsIfNeeded(entryScreen, context, isRequestingGpsPermissions, permissionsState, z, str3, gpsPermissionsRationale, string2, gpsFeatureModalPositiveButton, gpsPermissionsModalNegativeButton, renderProps.getGpsFeatureTitle(), renderProps.getGpsFeatureRationale(), renderProps.getGpsPermissionsModalNegativeButton(), uiWorkflow.permissionRequestWorkflow, renderProps.getStyles(), displaying.getRequestPermissionKey(), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.render$lambda$29(this.f$0, context, z, uiState, (PermissionRequestWorkflow.Output) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$0(UiWorkflow uiWorkflow, Input input, UiState uiState, StatefulWorkflow.RenderContext renderContext, UiComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        uiWorkflow.componentWorkHelper.runComponentWorkers(input, (UiState.Displaying) uiState, renderContext, component);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean render$lambda$1(UiComponent2 component) {
        Intrinsics.checkNotNullParameter(component, "component");
        return component.getAutoSubmitIntervalSeconds() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$6(final UiWorkflow uiWorkflow, final UiState uiState, Input input, StatefulWorkflow.RenderContext renderContext, final UiComponent uiComponent, boolean z, final Map componentParams) {
        Intrinsics.checkNotNullParameter(uiComponent, "uiComponent");
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        uiWorkflow.setTappedStates(uiComponent, z, displaying);
        if (input.getInquirySessionConfig().getGpsCollectionRequirement() != InquirySessionConfig2.NONE && !displaying.getHasRequestedGpsPermissions()) {
            renderContext.getActionSink().send(StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.render$lambda$6$lambda$4(uiState, componentParams, uiComponent, (WorkflowAction.Updater) obj);
                }
            }, 1, null));
        } else {
            renderContext.getActionSink().send(StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.render$lambda$6$lambda$5(componentParams, uiComponent, uiWorkflow, (WorkflowAction.Updater) obj);
                }
            }, 1, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$6$lambda$4(UiState uiState, Map map, UiComponent uiComponent, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(UiState.Displaying.copy$default((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, false, true, map, uiComponent, null, 4607, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$6$lambda$5(Map map, UiComponent uiComponent, UiWorkflow uiWorkflow, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        UiState.Displaying displaying = state instanceof UiState.Displaying ? (UiState.Displaying) state : null;
        if (displaying == null) {
            return Unit.INSTANCE;
        }
        UiState.Displaying displayingCopy$default = UiState.Displaying.copy$default(displaying, null, null, null, null, null, null, null, null, false, false, map, uiComponent, null, 5119, null);
        action.setState(displayingCopy$default);
        uiWorkflow.outputSubmit(action, displayingCopy$default);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$8(StatefulWorkflow.RenderContext renderContext, UiWorkflow uiWorkflow) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.render$lambda$8$lambda$7((WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$8$lambda$7(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(Output.Completed.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$10(StatefulWorkflow.RenderContext renderContext, UiWorkflow uiWorkflow, final Input input) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.render$lambda$10$lambda$9(input, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$10$lambda$9(Input input, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(input.getFinalStep() ? Output.Completed.INSTANCE : Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$12(UiWorkflow uiWorkflow, final UiState uiState, StatefulWorkflow.RenderContext renderContext, final GovernmentIdNfcScanComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        uiWorkflow.setTappedStates(component, true, (UiState.Displaying) uiState);
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.render$lambda$12$lambda$11(uiState, component, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$12$lambda$11(UiState uiState, GovernmentIdNfcScanComponent governmentIdNfcScanComponent, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(UiState.Displaying.copy$default((UiState.Displaying) uiState, null, null, null, null, null, new UiState.Displaying.NfcScan(governmentIdNfcScanComponent), null, null, false, false, null, null, null, 8159, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$14(UiWorkflow uiWorkflow, final UiState uiState, StatefulWorkflow.RenderContext renderContext, final VerifyPersonaButtonComponent component, final Map componentParams) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        uiWorkflow.setTappedStates(component, true, (UiState.Displaying) uiState);
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.render$lambda$14$lambda$13(uiState, component, componentParams, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$14$lambda$13(UiState uiState, VerifyPersonaButtonComponent verifyPersonaButtonComponent, Map map, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(UiState.Displaying.copy$default((UiState.Displaying) uiState, null, null, null, null, null, null, null, new UiState.PendingAction.VerifyReusablePersona(verifyPersonaButtonComponent, map), false, false, null, null, null, 8063, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$16(StatefulWorkflow.RenderContext renderContext, UiWorkflow uiWorkflow) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.render$lambda$16$lambda$15((WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$16$lambda$15(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(Output.Back.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$18(StatefulWorkflow.RenderContext renderContext, UiWorkflow uiWorkflow, final UiState uiState, final InputAddressComponent component, final String addressId) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.render$lambda$18$lambda$17(uiState, component, addressId, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$18$lambda$17(UiState uiState, InputAddressComponent inputAddressComponent, String str, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), inputAddressComponent, inputAddressComponent.updateSelectedSearchResultId(str).updateIsAddressAutocompleteLoading(Boolean.TRUE)), null, null, null, null, null, null, null, false, false, null, null, null, 8190, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$20(StatefulWorkflow.RenderContext renderContext, UiWorkflow uiWorkflow, final UiState uiState) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.render$lambda$20$lambda$19(uiState, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$20$lambda$19(UiState uiState, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(UiState.Displaying.copy$default((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, false, false, null, null, null, 8175, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$23(StatefulWorkflow.RenderContext renderContext, UiWorkflow uiWorkflow, final UiState uiState, final CreatePersonaSheetComponent createReusablePersonaComponent, final UiComponent buttonClicked) {
        Intrinsics.checkNotNullParameter(createReusablePersonaComponent, "createReusablePersonaComponent");
        Intrinsics.checkNotNullParameter(buttonClicked, "buttonClicked");
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.render$lambda$23$lambda$22(uiState, createReusablePersonaComponent, buttonClicked, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$23$lambda$22(UiState uiState, CreatePersonaSheetComponent createPersonaSheetComponent, UiComponent uiComponent, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        List<UiComponent> components = displaying.getComponents();
        UiComponent2 uiComponent2 = uiComponent instanceof UiComponent2 ? (UiComponent2) uiComponent : null;
        if (uiComponent2 != null) {
            uiComponent2.setWasTapped(true);
        }
        Unit unit = Unit.INSTANCE;
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(components, createPersonaSheetComponent, CreatePersonaSheetComponent2.updateComponent(createPersonaSheetComponent, uiComponent, uiComponent)), null, null, null, null, null, null, new UiState.PendingAction.CreateReusablePersona(createPersonaSheetComponent), false, false, null, null, null, 8062, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction render$lambda$29(final UiWorkflow uiWorkflow, final StatefulWorkflow.RenderContext renderContext, final boolean z, final UiState uiState, final PermissionRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.render$lambda$29$lambda$28(it, renderContext, uiWorkflow, z, uiState, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$29$lambda$28(PermissionRequestWorkflow.Output output, StatefulWorkflow.RenderContext renderContext, final UiWorkflow uiWorkflow, boolean z, final UiState uiState, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i = WhenMappings.$EnumSwitchMapping$0[output.getPermissionState().getResult().ordinal()];
        if (i == 1) {
            renderContext.getActionSink().send(StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.render$lambda$29$lambda$28$lambda$24(this.f$0, (WorkflowAction.Updater) obj);
                }
            }, 1, null));
        } else if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            renderContext.getActionSink().send(StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.render$lambda$29$lambda$28$lambda$27(uiState, (WorkflowAction.Updater) obj);
                }
            }, 1, null));
        } else if (z) {
            renderContext.getActionSink().send(StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.render$lambda$29$lambda$28$lambda$25(this.f$0, (WorkflowAction.Updater) obj);
                }
            }, 1, null));
        } else {
            renderContext.getActionSink().send(StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.render$lambda$29$lambda$28$lambda$26(uiState, (WorkflowAction.Updater) obj);
                }
            }, 1, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$29$lambda$28$lambda$24(UiWorkflow uiWorkflow, WorkflowAction.Updater a) {
        Intrinsics.checkNotNullParameter(a, "$this$a");
        Object state = a.getState();
        UiState.Displaying displaying = state instanceof UiState.Displaying ? (UiState.Displaying) state : null;
        if (displaying == null) {
            return Unit.INSTANCE;
        }
        uiWorkflow.outputSubmit(a, displaying);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$29$lambda$28$lambda$25(UiWorkflow uiWorkflow, WorkflowAction.Updater a) {
        Intrinsics.checkNotNullParameter(a, "$this$a");
        Object state = a.getState();
        UiState.Displaying displaying = state instanceof UiState.Displaying ? (UiState.Displaying) state : null;
        if (displaying == null) {
            return Unit.INSTANCE;
        }
        uiWorkflow.outputSubmit(a, displaying);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$29$lambda$28$lambda$26(UiState uiState, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        action.setState(UiState.Displaying.copy$default(displaying, null, null, null, null, null, null, null, null, false, false, null, null, String.valueOf(Integer.parseInt(displaying.getRequestPermissionKey()) + 1), 3583, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$29$lambda$28$lambda$27(UiState uiState, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(UiState.Displaying.copy$default((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, false, false, null, null, null, 7679, null));
        return Unit.INSTANCE;
    }

    private final void outputSubmit(WorkflowAction<? super Input, UiState, ? extends Output>.Updater updater, UiState.Displaying displaying) {
        UiComponent triggeringComponent = displaying.getTriggeringComponent();
        Map<String, ComponentParam> componentParams = displaying.getComponentParams();
        if (triggeringComponent == null || componentParams == null) {
            return;
        }
        updater.setOutput(new Output.FinishedWithoutTransition(triggeringComponent, componentParams, displaying.getStepName()));
    }

    private final void logState(Input renderProps, UiState renderState) {
        InquiryPage c43753Ui;
        if (!(renderState instanceof UiState.Displaying)) {
            throw new NoWhenBranchMatchedException();
        }
        UiState.Displaying displaying = (UiState.Displaying) renderState;
        if (displaying.getPendingAction() != null) {
            UiState.PendingAction pendingAction = displaying.getPendingAction();
            if (pendingAction instanceof UiState.PendingAction.CreateReusablePersona) {
                c43753Ui = new InquiryPage.CreateReusablePersona(renderProps.getStepName());
            } else {
                if (!(pendingAction instanceof UiState.PendingAction.VerifyReusablePersona)) {
                    throw new NoWhenBranchMatchedException();
                }
                c43753Ui = new InquiryPage.VerifyReusablePersona(renderProps.getStepName());
            }
        } else if (displaying.getNfcScan() != null) {
            c43753Ui = new InquiryPage.ScanNfc(renderProps.getStepName());
        } else {
            c43753Ui = new InquiryPage.C43753Ui(renderProps.getStepName());
        }
        this.externalEventLogger.logPageChange(c43753Ui);
    }

    private final void runGovIdNfcWork(Input renderProps, final UiState.Displaying renderState, StatefulWorkflow<? super Input, UiState, ? extends Output, ? extends Object>.RenderContext context, final UiState.Displaying.NfcScan nfcScan) {
        List<? extends NfcDataGroupType> listListOf;
        String scanDocumentPrompt;
        String authenticating;
        String reading;
        String scanDocumentSuccess;
        String enableNfcPrompt;
        String scanDocumentError;
        String authenticationErrorPrompt;
        String scanDocumentError2;
        String connectionLostPrompt;
        List<GovernmentIdNfcScan.DataGroupTypes> enabledDataGroups;
        NfcDataGroupType nfcDataGroupType;
        final GovernmentIdNfcScanComponent component = nfcScan.getComponent();
        String textValue = component.getCardAccessNumberController().getTextValue();
        String textValue2 = component.getDocumentNumberController().getTextValue();
        Date dateValue = component.getDateOfBirthController().getDateValue();
        Date dateValue2 = component.getExpirationDateController().getDateValue();
        GovernmentIdNfcScan.Attributes attributes = component.getConfig().getAttributes();
        if (StringsKt.isBlank(textValue2) || dateValue == null || dateValue2 == null) {
            context.runningSideEffect("client_side_nfc_form_validation", new C437791(context, this, attributes, textValue2, dateValue, dateValue2, nfcScan, renderState, null));
            return;
        }
        MrzKey mrzKey = new MrzKey(textValue2, dateValue2, dateValue);
        if (attributes == null || (enabledDataGroups = attributes.getEnabledDataGroups()) == null) {
            listListOf = CollectionsKt.listOf((Object[]) new NfcDataGroupType[]{NfcDataGroupType.Dg1, NfcDataGroupType.Dg2, NfcDataGroupType.Sod});
        } else {
            listListOf = new ArrayList<>();
            Iterator<T> it = enabledDataGroups.iterator();
            while (it.hasNext()) {
                int i = WhenMappings.$EnumSwitchMapping$1[((GovernmentIdNfcScan.DataGroupTypes) it.next()).ordinal()];
                if (i == 1) {
                    nfcDataGroupType = NfcDataGroupType.Dg1;
                } else if (i == 2) {
                    nfcDataGroupType = NfcDataGroupType.Dg2;
                } else if (i == 3) {
                    nfcDataGroupType = NfcDataGroupType.Dg14;
                } else {
                    nfcDataGroupType = i != 4 ? null : NfcDataGroupType.Sod;
                }
                if (nfcDataGroupType != null) {
                    listListOf.add(nfcDataGroupType);
                }
            }
        }
        ScanNfcWorker.Factory factory = this.nfcScanWorkerFactory;
        if (attributes == null || (scanDocumentPrompt = attributes.getScanDocumentPrompt()) == null) {
            scanDocumentPrompt = "";
        }
        if (attributes == null || (authenticating = attributes.getAuthenticating()) == null) {
            authenticating = "";
        }
        if (attributes == null || (reading = attributes.getReading()) == null) {
            reading = "";
        }
        String string2 = this.applicationContext.getString(R$string.pi2_permissions_cancel);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        if (attributes == null || (scanDocumentSuccess = attributes.getScanDocumentSuccess()) == null) {
            scanDocumentSuccess = "";
        }
        if (attributes == null || (enableNfcPrompt = attributes.getEnableNfcPrompt()) == null) {
            enableNfcPrompt = "";
        }
        String string3 = this.applicationContext.getString(R$string.pi2_permissions_continue);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = this.applicationContext.getString(R$string.pi2_permissions_cancel);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        if (attributes == null || (connectionLostPrompt = attributes.getConnectionLostPrompt()) == null) {
            scanDocumentError = attributes != null ? attributes.getScanDocumentError() : null;
            if (scanDocumentError == null) {
                scanDocumentError = "";
            }
        } else {
            scanDocumentError = connectionLostPrompt;
        }
        String string5 = this.applicationContext.getString(R$string.pi2_retry);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        if (attributes == null || (authenticationErrorPrompt = attributes.getAuthenticationErrorPrompt()) == null) {
            authenticationErrorPrompt = "";
        }
        String str = authenticationErrorPrompt;
        String string6 = this.applicationContext.getString(R$string.pi2_retry);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        if (attributes == null || (scanDocumentError2 = attributes.getScanDocumentError()) == null) {
            scanDocumentError2 = "";
        }
        String string7 = this.applicationContext.getString(R$string.pi2_retry);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        Workflows.runningWorker(context, factory.create(textValue, mrzKey, new PassportNfcStrings(scanDocumentPrompt, authenticating, reading, string2, scanDocumentSuccess, enableNfcPrompt, string3, string4, scanDocumentError, string5, str, string6, scanDocumentError2, string7), listListOf, renderProps.getStyles(), null), Reflection.typeOf(ScanNfcWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.runGovIdNfcWork$lambda$35(this.f$0, renderState, nfcScan, component, (PassportNfcReaderOutput) obj);
            }
        });
    }

    /* compiled from: UiWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.ui.UiWorkflow$runGovIdNfcWork$1", m3645f = "UiWorkflow.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$runGovIdNfcWork$1 */
    static final class C437791 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GovernmentIdNfcScan.Attributes $attributes;
        final /* synthetic */ StatefulWorkflow<Input, UiState, Output, Object>.RenderContext $context;
        final /* synthetic */ Date $dateOfBirth;
        final /* synthetic */ String $documentNumber;
        final /* synthetic */ Date $expirationDate;
        final /* synthetic */ UiState.Displaying.NfcScan $nfcScan;
        final /* synthetic */ UiState.Displaying $renderState;
        int label;
        final /* synthetic */ UiWorkflow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C437791(StatefulWorkflow<? super Input, UiState, ? extends Output, ? extends Object>.RenderContext renderContext, UiWorkflow uiWorkflow, GovernmentIdNfcScan.Attributes attributes, String str, Date date, Date date2, UiState.Displaying.NfcScan nfcScan, UiState.Displaying displaying, Continuation<? super C437791> continuation) {
            super(2, continuation);
            this.$context = renderContext;
            this.this$0 = uiWorkflow;
            this.$attributes = attributes;
            this.$documentNumber = str;
            this.$dateOfBirth = date;
            this.$expirationDate = date2;
            this.$nfcScan = nfcScan;
            this.$renderState = displaying;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C437791(this.$context, this.this$0, this.$attributes, this.$documentNumber, this.$dateOfBirth, this.$expirationDate, this.$nfcScan, this.$renderState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C437791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Sink<WorkflowAction<? super Input, UiState, ? extends Output>> actionSink = this.$context.getActionSink();
            final UiWorkflow uiWorkflow = this.this$0;
            final GovernmentIdNfcScan.Attributes attributes = this.$attributes;
            final String str = this.$documentNumber;
            final Date date = this.$dateOfBirth;
            final Date date2 = this.$expirationDate;
            final UiState.Displaying.NfcScan nfcScan = this.$nfcScan;
            final UiState.Displaying displaying = this.$renderState;
            actionSink.send(StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$runGovIdNfcWork$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return UiWorkflow.C437791.invokeSuspend$lambda$0(attributes, uiWorkflow, str, date, date2, nfcScan, displaying, (WorkflowAction.Updater) obj2);
                }
            }, 1, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(GovernmentIdNfcScan.Attributes attributes, UiWorkflow uiWorkflow, String str, Date date, Date date2, UiState.Displaying.NfcScan nfcScan, UiState.Displaying displaying, WorkflowAction.Updater updater) {
            String string2;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (attributes == null || (string2 = attributes.getRequiredText()) == null) {
                string2 = uiWorkflow.applicationContext.getString(R$string.pi2_retry);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            }
            if (StringsKt.isBlank(str)) {
                linkedHashMap.put(GovernmentIdNfcScan.documentNumberName, string2);
            }
            if (date == null) {
                linkedHashMap.put(GovernmentIdNfcScan.dateOfBirthName, string2);
            }
            if (date2 == null) {
                linkedHashMap.put(GovernmentIdNfcScan.expirationDateName, string2);
            }
            updater.setState(UiState.Displaying.copy$default(displaying, null, null, CollectionsKt.listOf(new UiComponentError.UiGovernmentIdNfcScanComponentError(nfcScan.getComponent().getName(), null, linkedHashMap, 2, null)), null, null, null, null, null, false, false, null, null, null, 8155, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runGovIdNfcWork$lambda$35(UiWorkflow uiWorkflow, final UiState.Displaying displaying, final UiState.Displaying.NfcScan nfcScan, final GovernmentIdNfcScanComponent governmentIdNfcScanComponent, final PassportNfcReaderOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        if (Intrinsics.areEqual(output, PassportNfcReaderOutput.Cancel.INSTANCE)) {
            return StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.runGovIdNfcWork$lambda$35$lambda$31(displaying, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (output instanceof PassportNfcReaderOutput.Error) {
            return StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.runGovIdNfcWork$lambda$35$lambda$32(nfcScan, governmentIdNfcScanComponent, displaying, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (output instanceof PassportNfcReaderOutput.Success) {
            return StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.runGovIdNfcWork$lambda$35$lambda$34(nfcScan, output, displaying, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runGovIdNfcWork$lambda$35$lambda$31(UiState.Displaying displaying, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(UiState.Displaying.copy$default(displaying, null, null, null, null, null, null, null, null, false, false, null, null, null, 8159, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runGovIdNfcWork$lambda$35$lambda$32(UiState.Displaying.NfcScan nfcScan, GovernmentIdNfcScanComponent governmentIdNfcScanComponent, UiState.Displaying displaying, WorkflowAction.Updater action) {
        String scanDocumentError;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        String name = nfcScan.getComponent().getName();
        GovernmentIdNfcScan.Attributes attributes = governmentIdNfcScanComponent.getConfig().getAttributes();
        if (attributes == null || (scanDocumentError = attributes.getScanDocumentError()) == null) {
            scanDocumentError = "";
        }
        action.setState(UiState.Displaying.copy$default(displaying, null, null, CollectionsKt.listOf(new UiComponentError.UiInputComponentError(name, "", scanDocumentError)), null, null, null, null, null, false, false, null, null, null, 8155, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runGovIdNfcWork$lambda$35$lambda$34(UiState.Displaying.NfcScan nfcScan, PassportNfcReaderOutput passportNfcReaderOutput, UiState.Displaying displaying, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        PassportNfcReaderOutput.Success success = (PassportNfcReaderOutput.Success) passportNfcReaderOutput;
        nfcScan.getComponent().getNfcDataController().setValue(new GovernmentIdNfcData(success.getDg1Uri(), success.getDg2Uri(), success.getSodUri(), success.getChipAuthenticationStatus()));
        SubmitButtonComponent submitButtonComponent = (SubmitButtonComponent) ExtensionsKt.findFirst(displaying.getComponents(), Reflection.getOrCreateKotlinClass(SubmitButtonComponent.class), new Function1<SubmitButtonComponent, Boolean>() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$runGovIdNfcWork$lambda$35$lambda$34$$inlined$findFirst$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(SubmitButtonComponent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.TRUE;
            }
        });
        if (submitButtonComponent != null) {
            action.setState(UiState.Displaying.copy$default(displaying, null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(submitButtonComponent, 0, null), null, false, false, null, null, null, 8095, null));
        }
        return Unit.INSTANCE;
    }

    private final void handlePendingAction(Input renderProps, final UiState.Displaying renderState, StatefulWorkflow<? super Input, UiState, ? extends Output, ? extends Object>.RenderContext context) {
        final UiState.PendingAction pendingAction = renderState.getPendingAction();
        if (pendingAction instanceof UiState.PendingAction.CreateReusablePersona) {
            CreateReusablePersonaWorker.Factory factory = this.createReusablePersonaWorkerFactory;
            String sessionToken = renderProps.getSessionToken();
            String inquiryId = renderProps.getInquiryId();
            UiState.PendingAction.CreateReusablePersona createReusablePersona = (UiState.PendingAction.CreateReusablePersona) pendingAction;
            String url = createReusablePersona.getCreatePersonaSheetComponent().getUrl();
            if (url != null) {
                Workflows.runningWorker(context, factory.create(sessionToken, inquiryId, url, createReusablePersona.getCreatePersonaSheetComponent().getName()), Reflection.typeOf(CreateReusablePersonaWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UiWorkflow.handlePendingAction$lambda$39(pendingAction, this, renderState, (CreateReusablePersonaWorker.Output) obj);
                    }
                });
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (!(pendingAction instanceof UiState.PendingAction.VerifyReusablePersona)) {
            if (pendingAction != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        VerifyReusablePersonaWorker.Factory factory2 = this.verifyReusablePersonaWorkerFactory;
        String sessionToken2 = renderProps.getSessionToken();
        String inquiryId2 = renderProps.getInquiryId();
        UiState.PendingAction.VerifyReusablePersona verifyReusablePersona = (UiState.PendingAction.VerifyReusablePersona) pendingAction;
        String url2 = verifyReusablePersona.getVerifyPersonaButtonComponent().getUrl();
        if (url2 != null) {
            Workflows.runningWorker(context, factory2.create(sessionToken2, inquiryId2, url2, verifyReusablePersona.getVerifyPersonaButtonComponent().getName(), verifyReusablePersona.getComponentParams()), Reflection.typeOf(VerifyReusablePersonaWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.handlePendingAction$lambda$42(this.f$0, renderState, (VerifyReusablePersonaWorker.Output) obj);
                }
            });
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction handlePendingAction$lambda$39(final UiState.PendingAction pendingAction, final UiWorkflow uiWorkflow, final UiState.Displaying displaying, final CreateReusablePersonaWorker.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (((UiState.PendingAction.CreateReusablePersona) pendingAction).getCreatePersonaSheetComponent().getAutoCompleteOnDismiss()) {
            return StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.handlePendingAction$lambda$39$lambda$36((WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.areEqual(it, CreateReusablePersonaWorker.Output.Complete.INSTANCE)) {
            return StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.handlePendingAction$lambda$39$lambda$37(displaying, pendingAction, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof CreateReusablePersonaWorker.Output.Error) {
            return StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.handlePendingAction$lambda$39$lambda$38(it, displaying, uiWorkflow, pendingAction, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handlePendingAction$lambda$39$lambda$36(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(Output.Completed.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handlePendingAction$lambda$39$lambda$37(UiState.Displaying displaying, UiState.PendingAction pendingAction, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        UiState.PendingAction.CreateReusablePersona createReusablePersona = (UiState.PendingAction.CreateReusablePersona) pendingAction;
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), createReusablePersona.getCreatePersonaSheetComponent(), CreatePersonaSheetComponent.copy$default(createReusablePersona.getCreatePersonaSheetComponent(), null, null, null, false, true, false, false, null, EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE, null)), null, null, null, null, null, null, null, false, false, null, null, null, 8062, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handlePendingAction$lambda$39$lambda$38(CreateReusablePersonaWorker.Output output, UiState.Displaying displaying, UiWorkflow uiWorkflow, UiState.PendingAction pendingAction, WorkflowAction.Updater action) {
        UiState.Displaying displayingCopy$default;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (((CreateReusablePersonaWorker.Output.Error) output).getErrorInfo() instanceof InternalErrorInfo.NetworkErrorInfo) {
            displayingCopy$default = UiState.Displaying.copy$default(displaying, null, null, null, null, uiWorkflow.applicationContext.getString(R$string.pi2_network_connection_error), null, null, null, false, false, null, null, null, 8047, null);
        } else {
            UiState.PendingAction.CreateReusablePersona createReusablePersona = (UiState.PendingAction.CreateReusablePersona) pendingAction;
            displayingCopy$default = UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), createReusablePersona.getCreatePersonaSheetComponent(), CreatePersonaSheetComponent.copy$default(createReusablePersona.getCreatePersonaSheetComponent(), null, null, null, false, true, false, false, null, EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE, null)), null, null, null, null, null, null, null, false, false, null, null, null, 8062, null);
        }
        action.setState(displayingCopy$default);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction handlePendingAction$lambda$42(final UiWorkflow uiWorkflow, final UiState.Displaying displaying, final VerifyReusablePersonaWorker.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it, VerifyReusablePersonaWorker.Output.Complete.INSTANCE)) {
            return StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.handlePendingAction$lambda$42$lambda$40((WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof VerifyReusablePersonaWorker.Output.Error) {
            return StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UiWorkflow.handlePendingAction$lambda$42$lambda$41(it, uiWorkflow, displaying, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handlePendingAction$lambda$42$lambda$40(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(Output.FinishedWithTransition.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handlePendingAction$lambda$42$lambda$41(VerifyReusablePersonaWorker.Output output, UiWorkflow uiWorkflow, UiState.Displaying displaying, WorkflowAction.Updater action) {
        UiState.Displaying displayingCopy$default;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (((VerifyReusablePersonaWorker.Output.Error) output).getErrorInfo() instanceof InternalErrorInfo.NetworkErrorInfo) {
            displayingCopy$default = UiState.Displaying.copy$default(displaying, null, null, null, null, uiWorkflow.applicationContext.getString(R$string.pi2_network_connection_error), null, null, null, false, false, null, null, null, 8047, null);
        } else {
            displayingCopy$default = UiState.Displaying.copy$default(displaying, null, null, null, null, null, null, null, null, false, false, null, null, null, 8063, null);
        }
        action.setState(displayingCopy$default);
        return Unit.INSTANCE;
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public Snapshot snapshotState(UiState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return SnapshotParcels.toSnapshot(state);
    }

    /* compiled from: UiWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0005\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010!R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b2\u00101R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b3\u00101R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b7\u0010!R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b8\u0010!R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b9\u0010!R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b:\u0010!R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b;\u0010!R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b<\u0010!R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b=\u0010!R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010>\u001a\u0004\b?\u0010@R\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\bA\u0010-R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010/\u001a\u0004\b\u001a\u00101R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u001d\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010/\u001a\u0004\b\u001d\u00101¨\u0006E"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "", "", "sessionToken", "inquiryId", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "components", "stepName", "", "backStepEnabled", "cancelButtonEnabled", "finalStep", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "gpsPermissionsTitle", "gpsPermissionsRationale", "gpsPermissionsModalPositiveButton", "gpsPermissionsModalNegativeButton", "gpsFeatureTitle", "gpsFeatureRationale", "gpsFeatureModalPositiveButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;", "serverComponentErrors", "isSubmitting", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "transitionError", "isRestoringState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZLcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/util/List;ZLcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSessionToken", "getInquiryId", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "getStepName", "Z", "getBackStepEnabled", "()Z", "getCancelButtonEnabled", "getFinalStep", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "getInquirySessionConfig", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "getGpsPermissionsTitle", "getGpsPermissionsRationale", "getGpsPermissionsModalPositiveButton", "getGpsPermissionsModalNegativeButton", "getGpsFeatureTitle", "getGpsFeatureRationale", "getGpsFeatureModalPositiveButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getServerComponentErrors", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getTransitionError", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class Input {
        private final boolean backStepEnabled;
        private final boolean cancelButtonEnabled;
        private final List<UiComponentConfig> components;
        private final boolean finalStep;
        private final String gpsFeatureModalPositiveButton;
        private final String gpsFeatureRationale;
        private final String gpsFeatureTitle;
        private final String gpsPermissionsModalNegativeButton;
        private final String gpsPermissionsModalPositiveButton;
        private final String gpsPermissionsRationale;
        private final String gpsPermissionsTitle;
        private final String inquiryId;
        private final InquirySessionConfig inquirySessionConfig;
        private final boolean isRestoringState;
        private final boolean isSubmitting;
        private final List<UiComponentError> serverComponentErrors;
        private final String sessionToken;
        private final String stepName;
        private final StepStyles.UiStepStyle styles;
        private final InternalErrorInfo transitionError;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.areEqual(this.sessionToken, input.sessionToken) && Intrinsics.areEqual(this.inquiryId, input.inquiryId) && Intrinsics.areEqual(this.components, input.components) && Intrinsics.areEqual(this.stepName, input.stepName) && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && this.finalStep == input.finalStep && Intrinsics.areEqual(this.inquirySessionConfig, input.inquirySessionConfig) && Intrinsics.areEqual(this.gpsPermissionsTitle, input.gpsPermissionsTitle) && Intrinsics.areEqual(this.gpsPermissionsRationale, input.gpsPermissionsRationale) && Intrinsics.areEqual(this.gpsPermissionsModalPositiveButton, input.gpsPermissionsModalPositiveButton) && Intrinsics.areEqual(this.gpsPermissionsModalNegativeButton, input.gpsPermissionsModalNegativeButton) && Intrinsics.areEqual(this.gpsFeatureTitle, input.gpsFeatureTitle) && Intrinsics.areEqual(this.gpsFeatureRationale, input.gpsFeatureRationale) && Intrinsics.areEqual(this.gpsFeatureModalPositiveButton, input.gpsFeatureModalPositiveButton) && Intrinsics.areEqual(this.styles, input.styles) && Intrinsics.areEqual(this.serverComponentErrors, input.serverComponentErrors) && this.isSubmitting == input.isSubmitting && Intrinsics.areEqual(this.transitionError, input.transitionError) && this.isRestoringState == input.isRestoringState;
        }

        public int hashCode() {
            int iHashCode = ((this.sessionToken.hashCode() * 31) + this.inquiryId.hashCode()) * 31;
            List<UiComponentConfig> list = this.components;
            int iHashCode2 = (((((((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.stepName.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + Boolean.hashCode(this.finalStep)) * 31) + this.inquirySessionConfig.hashCode()) * 31;
            String str = this.gpsPermissionsTitle;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.gpsPermissionsRationale;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.gpsPermissionsModalPositiveButton;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.gpsPermissionsModalNegativeButton;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.gpsFeatureTitle;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.gpsFeatureRationale;
            int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.gpsFeatureModalPositiveButton;
            int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
            StepStyles.UiStepStyle uiStepStyle = this.styles;
            int iHashCode10 = (iHashCode9 + (uiStepStyle == null ? 0 : uiStepStyle.hashCode())) * 31;
            List<UiComponentError> list2 = this.serverComponentErrors;
            int iHashCode11 = (((iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31) + Boolean.hashCode(this.isSubmitting)) * 31;
            InternalErrorInfo internalErrorInfo = this.transitionError;
            return ((iHashCode11 + (internalErrorInfo != null ? internalErrorInfo.hashCode() : 0)) * 31) + Boolean.hashCode(this.isRestoringState);
        }

        public String toString() {
            return "Input(sessionToken=" + this.sessionToken + ", inquiryId=" + this.inquiryId + ", components=" + this.components + ", stepName=" + this.stepName + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", finalStep=" + this.finalStep + ", inquirySessionConfig=" + this.inquirySessionConfig + ", gpsPermissionsTitle=" + this.gpsPermissionsTitle + ", gpsPermissionsRationale=" + this.gpsPermissionsRationale + ", gpsPermissionsModalPositiveButton=" + this.gpsPermissionsModalPositiveButton + ", gpsPermissionsModalNegativeButton=" + this.gpsPermissionsModalNegativeButton + ", gpsFeatureTitle=" + this.gpsFeatureTitle + ", gpsFeatureRationale=" + this.gpsFeatureRationale + ", gpsFeatureModalPositiveButton=" + this.gpsFeatureModalPositiveButton + ", styles=" + this.styles + ", serverComponentErrors=" + this.serverComponentErrors + ", isSubmitting=" + this.isSubmitting + ", transitionError=" + this.transitionError + ", isRestoringState=" + this.isRestoringState + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Input(String sessionToken, String inquiryId, List<? extends UiComponentConfig> list, String stepName, boolean z, boolean z2, boolean z3, InquirySessionConfig inquirySessionConfig, String str, String str2, String str3, String str4, String str5, String str6, String str7, StepStyles.UiStepStyle uiStepStyle, List<? extends UiComponentError> list2, boolean z4, InternalErrorInfo internalErrorInfo, boolean z5) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.sessionToken = sessionToken;
            this.inquiryId = inquiryId;
            this.components = list;
            this.stepName = stepName;
            this.backStepEnabled = z;
            this.cancelButtonEnabled = z2;
            this.finalStep = z3;
            this.inquirySessionConfig = inquirySessionConfig;
            this.gpsPermissionsTitle = str;
            this.gpsPermissionsRationale = str2;
            this.gpsPermissionsModalPositiveButton = str3;
            this.gpsPermissionsModalNegativeButton = str4;
            this.gpsFeatureTitle = str5;
            this.gpsFeatureRationale = str6;
            this.gpsFeatureModalPositiveButton = str7;
            this.styles = uiStepStyle;
            this.serverComponentErrors = list2;
            this.isSubmitting = z4;
            this.transitionError = internalErrorInfo;
            this.isRestoringState = z5;
        }

        public final String getSessionToken() {
            return this.sessionToken;
        }

        public final String getInquiryId() {
            return this.inquiryId;
        }

        public final List<UiComponentConfig> getComponents() {
            return this.components;
        }

        public final String getStepName() {
            return this.stepName;
        }

        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        public final boolean getFinalStep() {
            return this.finalStep;
        }

        public final InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        public final String getGpsPermissionsTitle() {
            return this.gpsPermissionsTitle;
        }

        public final String getGpsPermissionsRationale() {
            return this.gpsPermissionsRationale;
        }

        public final String getGpsPermissionsModalNegativeButton() {
            return this.gpsPermissionsModalNegativeButton;
        }

        public final String getGpsFeatureTitle() {
            return this.gpsFeatureTitle;
        }

        public final String getGpsFeatureRationale() {
            return this.gpsFeatureRationale;
        }

        public final String getGpsFeatureModalPositiveButton() {
            return this.gpsFeatureModalPositiveButton;
        }

        public final StepStyles.UiStepStyle getStyles() {
            return this.styles;
        }

        public final List<UiComponentError> getServerComponentErrors() {
            return this.serverComponentErrors;
        }

        /* renamed from: isSubmitting, reason: from getter */
        public final boolean getIsSubmitting() {
            return this.isSubmitting;
        }

        public final InternalErrorInfo getTransitionError() {
            return this.transitionError;
        }

        /* renamed from: isRestoringState, reason: from getter */
        public final boolean getIsRestoringState() {
            return this.isRestoringState;
        }
    }

    /* compiled from: UiWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Output;", "", "Canceled", "FinishedWithoutTransition", "FinishedWithTransition", "Error", "Completed", "Back", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Output$Back;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Output$Canceled;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Output$Completed;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Output$Error;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Output$FinishedWithTransition;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Output$FinishedWithoutTransition;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Output {

        /* compiled from: UiWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Output$Canceled;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Output;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Canceled implements Output {
            public static final Canceled INSTANCE = new Canceled();

            public boolean equals(Object other) {
                return this == other || (other instanceof Canceled);
            }

            public int hashCode() {
                return -650975523;
            }

            public String toString() {
                return "Canceled";
            }

            private Canceled() {
            }
        }

        /* compiled from: UiWorkflow.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Output$FinishedWithoutTransition;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Output;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "fromComponent", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "fromStep", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "getFromComponent", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Ljava/util/Map;", "getComponentParams", "()Ljava/util/Map;", "Ljava/lang/String;", "getFromStep", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class FinishedWithoutTransition implements Output {
            private final Map<String, ComponentParam> componentParams;
            private final UiComponent fromComponent;
            private final String fromStep;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FinishedWithoutTransition)) {
                    return false;
                }
                FinishedWithoutTransition finishedWithoutTransition = (FinishedWithoutTransition) other;
                return Intrinsics.areEqual(this.fromComponent, finishedWithoutTransition.fromComponent) && Intrinsics.areEqual(this.componentParams, finishedWithoutTransition.componentParams) && Intrinsics.areEqual(this.fromStep, finishedWithoutTransition.fromStep);
            }

            public int hashCode() {
                return (((this.fromComponent.hashCode() * 31) + this.componentParams.hashCode()) * 31) + this.fromStep.hashCode();
            }

            public String toString() {
                return "FinishedWithoutTransition(fromComponent=" + this.fromComponent + ", componentParams=" + this.componentParams + ", fromStep=" + this.fromStep + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public FinishedWithoutTransition(UiComponent fromComponent, Map<String, ? extends ComponentParam> componentParams, String fromStep) {
                Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
                Intrinsics.checkNotNullParameter(componentParams, "componentParams");
                Intrinsics.checkNotNullParameter(fromStep, "fromStep");
                this.fromComponent = fromComponent;
                this.componentParams = componentParams;
                this.fromStep = fromStep;
            }

            public final UiComponent getFromComponent() {
                return this.fromComponent;
            }

            public final Map<String, ComponentParam> getComponentParams() {
                return this.componentParams;
            }

            public final String getFromStep() {
                return this.fromStep;
            }
        }

        /* compiled from: UiWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Output$FinishedWithTransition;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Output;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class FinishedWithTransition implements Output {
            public static final FinishedWithTransition INSTANCE = new FinishedWithTransition();

            public boolean equals(Object other) {
                return this == other || (other instanceof FinishedWithTransition);
            }

            public int hashCode() {
                return 1959736081;
            }

            public String toString() {
                return "FinishedWithTransition";
            }

            private FinishedWithTransition() {
            }
        }

        /* compiled from: UiWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Output$Error;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Output;", "message", "", "cause", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "getMessage", "()Ljava/lang/String;", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Error implements Output {
            private final InternalErrorInfo cause;
            private final String message;

            public Error(String str, InternalErrorInfo cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.message = str;
                this.cause = cause;
            }

            public final String getMessage() {
                return this.message;
            }

            public final InternalErrorInfo getCause() {
                return this.cause;
            }
        }

        /* compiled from: UiWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Output$Completed;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Output;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Completed implements Output {
            public static final Completed INSTANCE = new Completed();

            public boolean equals(Object other) {
                return this == other || (other instanceof Completed);
            }

            public int hashCode() {
                return -584917881;
            }

            public String toString() {
                return "Completed";
            }

            private Completed() {
            }
        }

        /* compiled from: UiWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Output$Back;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Output;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Back implements Output {
            public static final Back INSTANCE = new Back();

            public boolean equals(Object other) {
                return this == other || (other instanceof Back);
            }

            public int hashCode() {
                return 1353460011;
            }

            public String toString() {
                return "Back";
            }

            private Back() {
            }
        }
    }

    /* compiled from: UiWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Screen;", "", "<init>", "()V", "EntryScreen", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Screen$EntryScreen;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Screen {
        public /* synthetic */ Screen(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Screen() {
        }

        /* compiled from: UiWorkflow.kt */
        @Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001UBÓ\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u00129\u0010\u000b\u001a5\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0004\u0012\u00020\u00140\f\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140\u0019\u0012$\u0010\u001b\u001a \u0012\u0004\u0012\u00020\u001d\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0004\u0012\u00020\u00140\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u0016\u0012\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00140\u001c\u0012\u0006\u0010#\u001a\u00020\r\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016\u0012'\u0010(\u001a#\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00140\u001c¢\u0006\u0004\b+\u0010,J\u0010\u0010Q\u001a\u0004\u0018\u00010R2\u0006\u0010S\u001a\u00020TR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b1\u00102RD\u0010\u000b\u001a5\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0004\u0012\u00020\u00140\f¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016¢\u0006\b\n\u0000\u001a\u0004\b7\u00106R\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R/\u0010\u001b\u001a \u0012\u0004\u0012\u00020\u001d\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0004\u0012\u00020\u00140\u001c¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u0016¢\u0006\b\n\u0000\u001a\u0004\b>\u00106R#\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00140\u001c¢\u0006\b\n\u0000\u001a\u0004\b?\u0010;R\u0011\u0010#\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010@R\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010&\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016¢\u0006\b\n\u0000\u001a\u0004\bE\u00106R2\u0010(\u001a#\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00140\u001c¢\u0006\b\n\u0000\u001a\u0004\bF\u0010;R\u0013\u0010G\u001a\u0004\u0018\u00010H8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0013\u0010K\u001a\u0004\u0018\u00010H8F¢\u0006\u0006\u001a\u0004\bL\u0010JR\u0013\u0010M\u001a\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006V"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Screen$EntryScreen;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Screen;", "components", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "componentConfigs", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentErrors", "Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;", "navigationState", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "onClick", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "isTappedComponentVisible", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "onComplete", "Lkotlin/Function0;", "onCancel", "launchNfcScan", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "onVerifyPersonaClick", "Lkotlin/Function2;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "autoSubmit", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Screen$EntryScreen$AutoSubmit;", "onBack", "onSuggestionSelected", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "isLoading", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "error", "onErrorDismissed", "onCreateReusablePersonaClick", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "buttonClicked", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Screen$EntryScreen$AutoSubmit;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;ZLcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "getComponents", "()Ljava/util/List;", "getComponentConfigs", "getComponentErrors", "getNavigationState", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "getOnClick", "()Lkotlin/jvm/functions/Function3;", "getOnComplete", "()Lkotlin/jvm/functions/Function0;", "getOnCancel", "getLaunchNfcScan", "()Lkotlin/jvm/functions/Function1;", "getOnVerifyPersonaClick", "()Lkotlin/jvm/functions/Function2;", "getAutoSubmit", "()Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Screen$EntryScreen$AutoSubmit;", "getOnBack", "getOnSuggestionSelected", "()Z", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getError", "()Ljava/lang/String;", "getOnErrorDismissed", "getOnCreateReusablePersonaClick", "backgroundColor", "", "getBackgroundColor", "()Ljava/lang/Integer;", "headerButtonColor", "getHeaderButtonColor", "pageLevelVerticalAlignment", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "getPageLevelVerticalAlignment", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "backgroundImageDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "AutoSubmit", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class EntryScreen extends Screen {
            private final AutoSubmit autoSubmit;
            private final List<UiComponentConfig> componentConfigs;
            private final List<UiComponentError> componentErrors;
            private final List<UiComponent> components;
            private final String error;
            private final boolean isLoading;
            private final Function1<GovernmentIdNfcScanComponent, Unit> launchNfcScan;
            private final NavigationState navigationState;
            private final Function0<Unit> onBack;
            private final Function0<Unit> onCancel;
            private final Function3<UiComponent, Boolean, Map<String, ? extends ComponentParam>, Unit> onClick;
            private final Function0<Unit> onComplete;
            private final Function2<CreatePersonaSheetComponent, UiComponent, Unit> onCreateReusablePersonaClick;
            private final Function0<Unit> onErrorDismissed;
            private final Function2<InputAddressComponent, String, Unit> onSuggestionSelected;
            private final Function2<VerifyPersonaButtonComponent, Map<String, ? extends ComponentParam>, Unit> onVerifyPersonaClick;
            private final StepStyles.UiStepStyle styles;

            public final List<UiComponent> getComponents() {
                return this.components;
            }

            public final List<UiComponentConfig> getComponentConfigs() {
                return this.componentConfigs;
            }

            public final List<UiComponentError> getComponentErrors() {
                return this.componentErrors;
            }

            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            public final Function3<UiComponent, Boolean, Map<String, ? extends ComponentParam>, Unit> getOnClick() {
                return this.onClick;
            }

            public final Function0<Unit> getOnComplete() {
                return this.onComplete;
            }

            public final Function0<Unit> getOnCancel() {
                return this.onCancel;
            }

            public final Function1<GovernmentIdNfcScanComponent, Unit> getLaunchNfcScan() {
                return this.launchNfcScan;
            }

            public final Function2<VerifyPersonaButtonComponent, Map<String, ? extends ComponentParam>, Unit> getOnVerifyPersonaClick() {
                return this.onVerifyPersonaClick;
            }

            public final AutoSubmit getAutoSubmit() {
                return this.autoSubmit;
            }

            public final Function0<Unit> getOnBack() {
                return this.onBack;
            }

            public final Function2<InputAddressComponent, String, Unit> getOnSuggestionSelected() {
                return this.onSuggestionSelected;
            }

            /* renamed from: isLoading, reason: from getter */
            public final boolean getIsLoading() {
                return this.isLoading;
            }

            public final StepStyles.UiStepStyle getStyles() {
                return this.styles;
            }

            public final String getError() {
                return this.error;
            }

            public final Function0<Unit> getOnErrorDismissed() {
                return this.onErrorDismissed;
            }

            public final Function2<CreatePersonaSheetComponent, UiComponent, Unit> getOnCreateReusablePersonaClick() {
                return this.onCreateReusablePersonaClick;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public EntryScreen(List<? extends UiComponent> components, List<? extends UiComponentConfig> list, List<? extends UiComponentError> componentErrors, NavigationState navigationState, Function3<? super UiComponent, ? super Boolean, ? super Map<String, ? extends ComponentParam>, Unit> onClick, Function0<Unit> onComplete, Function0<Unit> onCancel, Function1<? super GovernmentIdNfcScanComponent, Unit> launchNfcScan, Function2<? super VerifyPersonaButtonComponent, ? super Map<String, ? extends ComponentParam>, Unit> onVerifyPersonaClick, AutoSubmit autoSubmit, Function0<Unit> onBack, Function2<? super InputAddressComponent, ? super String, Unit> onSuggestionSelected, boolean z, StepStyles.UiStepStyle uiStepStyle, String str, Function0<Unit> onErrorDismissed, Function2<? super CreatePersonaSheetComponent, ? super UiComponent, Unit> onCreateReusablePersonaClick) {
                super(null);
                Intrinsics.checkNotNullParameter(components, "components");
                Intrinsics.checkNotNullParameter(componentErrors, "componentErrors");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onClick, "onClick");
                Intrinsics.checkNotNullParameter(onComplete, "onComplete");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                Intrinsics.checkNotNullParameter(launchNfcScan, "launchNfcScan");
                Intrinsics.checkNotNullParameter(onVerifyPersonaClick, "onVerifyPersonaClick");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onSuggestionSelected, "onSuggestionSelected");
                Intrinsics.checkNotNullParameter(onErrorDismissed, "onErrorDismissed");
                Intrinsics.checkNotNullParameter(onCreateReusablePersonaClick, "onCreateReusablePersonaClick");
                this.components = components;
                this.componentConfigs = list;
                this.componentErrors = componentErrors;
                this.navigationState = navigationState;
                this.onClick = onClick;
                this.onComplete = onComplete;
                this.onCancel = onCancel;
                this.launchNfcScan = launchNfcScan;
                this.onVerifyPersonaClick = onVerifyPersonaClick;
                this.autoSubmit = autoSubmit;
                this.onBack = onBack;
                this.onSuggestionSelected = onSuggestionSelected;
                this.isLoading = z;
                this.styles = uiStepStyle;
                this.error = str;
                this.onErrorDismissed = onErrorDismissed;
                this.onCreateReusablePersonaClick = onCreateReusablePersonaClick;
            }

            public final Integer getBackgroundColor() {
                StepStyles.UiStepStyle uiStepStyle = this.styles;
                if (uiStepStyle != null) {
                    return uiStepStyle.getBackgroundColorValue();
                }
                return null;
            }

            public final Integer getHeaderButtonColor() {
                AttributeStyles.HeaderButtonColorStyle headerButtonColor;
                StyleElements.SimpleElementColor headerButton;
                StyleElements.SimpleElementColorValue base;
                StepStyles.UiStepStyle uiStepStyle = this.styles;
                if (uiStepStyle == null || (headerButtonColor = uiStepStyle.getHeaderButtonColor()) == null || (headerButton = headerButtonColor.getHeaderButton()) == null || (base = headerButton.getBase()) == null) {
                    return null;
                }
                return base.getValue();
            }

            public final StyleElements.PositionType getPageLevelVerticalAlignment() {
                StepStyles.UiStepStyle uiStepStyle = this.styles;
                if (uiStepStyle != null) {
                    return uiStepStyle.getPageLevelVerticalAlignment();
                }
                return null;
            }

            public final Drawable backgroundImageDrawable(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                StepStyles.UiStepStyle uiStepStyle = this.styles;
                if (uiStepStyle != null) {
                    return StepStyleUtils.backgroundImageDrawable(uiStepStyle, context);
                }
                return null;
            }

            /* compiled from: UiWorkflow.kt */
            @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0007\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Screen$EntryScreen$AutoSubmit;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "component", "", "countdownText", "", "isReadyToSubmit", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "getComponent", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "Ljava/lang/String;", "getCountdownText", "Z", "()Z", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final /* data */ class AutoSubmit {
                private final UiComponent2 component;
                private final String countdownText;
                private final boolean isReadyToSubmit;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof AutoSubmit)) {
                        return false;
                    }
                    AutoSubmit autoSubmit = (AutoSubmit) other;
                    return Intrinsics.areEqual(this.component, autoSubmit.component) && Intrinsics.areEqual(this.countdownText, autoSubmit.countdownText) && this.isReadyToSubmit == autoSubmit.isReadyToSubmit;
                }

                public int hashCode() {
                    int iHashCode = this.component.hashCode() * 31;
                    String str = this.countdownText;
                    return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isReadyToSubmit);
                }

                public String toString() {
                    return "AutoSubmit(component=" + this.component + ", countdownText=" + this.countdownText + ", isReadyToSubmit=" + this.isReadyToSubmit + ")";
                }

                public AutoSubmit(UiComponent2 component, String str, boolean z) {
                    Intrinsics.checkNotNullParameter(component, "component");
                    this.component = component;
                    this.countdownText = str;
                    this.isReadyToSubmit = z;
                }

                public final UiComponent2 getComponent() {
                    return this.component;
                }

                public final String getCountdownText() {
                    return this.countdownText;
                }

                /* renamed from: isReadyToSubmit, reason: from getter */
                public final boolean getIsReadyToSubmit() {
                    return this.isReadyToSubmit;
                }
            }
        }
    }

    private final void recurse(List<? extends UiComponent> list, final Function1<? super UiComponent, Unit> function1) {
        for (UiComponent uiComponent : list) {
            if (uiComponent instanceof UiComponentGroup) {
                recurse(((UiComponentGroup) uiComponent).getChildren(), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UiWorkflow.recurse$lambda$43(function1, (UiComponent) obj);
                    }
                });
            } else {
                function1.invoke(uiComponent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recurse$lambda$43(Function1 function1, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.INSTANCE;
    }

    private final void setTappedStates(final UiComponent tappedUiComponent, final boolean isTappedComponentVisible, UiState.Displaying renderState) {
        recurse(renderState.getComponents(), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiWorkflow.setTappedStates$lambda$44(isTappedComponentVisible, tappedUiComponent, (UiComponent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setTappedStates$lambda$44(boolean z, UiComponent uiComponent, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof LoadingIndicatorComponent) {
            ((LoadingIndicatorComponent) it).setWasTapped(z ? Intrinsics.areEqual(it.getName(), uiComponent.getName()) : true);
        }
        return Unit.INSTANCE;
    }
}
