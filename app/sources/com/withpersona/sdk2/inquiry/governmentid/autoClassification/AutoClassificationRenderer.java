package com.withpersona.sdk2.inquiry.governmentid.autoClassification;

import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.WorkflowAction4;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreen2;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState3;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtils;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfigForCountry;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureHelper;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.Option;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AutoClassificationRenderer.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JF\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2&\u0010\f\u001a\"0\rR\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000ej\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\u0013JF\u0010\u0014\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00162&\u0010\f\u001a\"0\rR\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000ej\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationRenderer;", "", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;", "<init>", "(Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;)V", "renderError", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/ErrorView;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderState", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;", "context", "Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;", "Lcom/squareup/workflow1/StatefulWorkflow;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Output;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "videoCaptureHelper", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureHelper;", "renderManualSelect", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$AutoClassificationSelectCountryAndIdClassScreen;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class AutoClassificationRenderer {
    private final NavigationStateManager navigationStateManager;

    /* compiled from: AutoClassificationRenderer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GovernmentIdState3.values().length];
            try {
                iArr[GovernmentIdState3.IdTypeRejected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GovernmentIdState3.UnableToClassify.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AutoClassificationRenderer(NavigationStateManager navigationStateManager) {
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        this.navigationStateManager = navigationStateManager;
    }

    public final ErrorView renderError(GovernmentIdWorkflow.Input renderProps, GovernmentIdState.AutoClassificationError renderState, final StatefulWorkflow<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.Output, ? extends Object>.RenderContext context, final VideoCaptureHelper videoCaptureHelper) {
        String idClassRejectedTitle;
        String idClassRejectedContinueButtonText;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        GovernmentIdState3 errorType = renderState.getErrorType();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[errorType.ordinal()];
        if (i == 1) {
            idClassRejectedTitle = renderProps.getStrings().getIdClassRejectedTitle();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            idClassRejectedTitle = renderProps.getStrings().getUnableToClassifyDocumentTitle();
        }
        int i2 = iArr[renderState.getErrorType().ordinal()];
        if (i2 == 1) {
            idClassRejectedContinueButtonText = renderProps.getStrings().getIdClassRejectedContinueButtonText();
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            idClassRejectedContinueButtonText = renderProps.getStrings().getUnableToClassifyDocumentContinueButtonText();
        }
        return new ErrorView(idClassRejectedTitle, idClassRejectedContinueButtonText, renderProps.getStyles(), this.navigationStateManager.getNavigationState(), new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationRenderer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AutoClassificationRenderer.renderError$lambda$1(context);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationRenderer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AutoClassificationRenderer.renderError$lambda$2(context, videoCaptureHelper);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationRenderer$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AutoClassificationRenderer.renderError$lambda$4(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderError$lambda$1(StatefulWorkflow.RenderContext renderContext) {
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationRenderer$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutoClassificationRenderer.renderError$lambda$1$lambda$0((WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderError$lambda$1$lambda$0(WorkflowAction.Updater action) {
        String countryCode;
        String str;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        GovernmentIdState.AutoClassificationError autoClassificationError = state instanceof GovernmentIdState.AutoClassificationError ? (GovernmentIdState.AutoClassificationError) state : null;
        if (autoClassificationError == null) {
            return Unit.INSTANCE;
        }
        if (autoClassificationError.getIdConfigsForCountry().size() == 1) {
            IdConfigForCountry idConfigForCountry = (IdConfigForCountry) CollectionsKt.first((List) autoClassificationError.getIdConfigsForCountry());
            String idClassKey = idConfigForCountry.getIds().size() == 1 ? ((IdConfig) CollectionsKt.first((List) idConfigForCountry.getIds())).getIdClassKey() : null;
            countryCode = idConfigForCountry.getCountryCode();
            str = idClassKey;
        } else {
            countryCode = null;
            str = null;
        }
        action.setState(new GovernmentIdState.AutoClassificationManualSelect(autoClassificationError.getCurrentPart(), autoClassificationError.getUploadingIds$government_id_release(), autoClassificationError.getParts$government_id_release(), autoClassificationError.getPartIndex(), GovernmentIdWorkflowUtils.createBackState(action, true), autoClassificationError.getCountryCode(), autoClassificationError.getCaptureFrames(), new CameraProperties(null, null, null, 0, 15, null), autoClassificationError.getIdConfigsForCountry(), countryCode, str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderError$lambda$2(StatefulWorkflow.RenderContext renderContext, VideoCaptureHelper videoCaptureHelper) {
        GovernmentIdWorkflowUtils.goBack(renderContext, videoCaptureHelper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderError$lambda$4(StatefulWorkflow.RenderContext renderContext) {
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationRenderer$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutoClassificationRenderer.renderError$lambda$4$lambda$3((WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderError$lambda$4$lambda$3(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(GovernmentIdWorkflow.Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GovernmentIdScreen2.AutoClassificationSelectCountryAndIdClassScreen renderManualSelect(final GovernmentIdWorkflow.Input renderProps, final GovernmentIdState.AutoClassificationManualSelect renderState, final StatefulWorkflow<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.Output, ? extends Object>.RenderContext context, final VideoCaptureHelper videoCaptureHelper) {
        Object next;
        List<IdConfig> listEmptyList;
        String idClassKey;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        InputSelectBoxComponent inputSelectBoxComponent = new InputSelectBoxComponent() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationRenderer$renderManualSelect$countrySelectComponent$1
            @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
            public boolean getCanSelectMultipleValues() {
                return false;
            }

            @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
            public String getLabel() {
                return null;
            }

            @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
            public InputSelectComponentStyle getStyles() {
                StepStyles.GovernmentIdStepInputSelectStyle inputSelectStyle;
                StepStyles.InputSelectStyleContainer base;
                StepStyles.GovernmentIdStepStyle styles = renderProps.getStyles();
                if (styles == null || (inputSelectStyle = styles.getInputSelectStyle()) == null || (base = inputSelectStyle.getBase()) == null) {
                    return null;
                }
                return base.getBase();
            }

            @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
            public List<Option> getOptions() {
                List<IdConfigForCountry> idConfigsForCountry = renderState.getIdConfigsForCountry();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(idConfigsForCountry, 10));
                for (IdConfigForCountry idConfigForCountry : idConfigsForCountry) {
                    arrayList.add(new Option(idConfigForCountry.getCountryName(), idConfigForCountry.getCountryCode()));
                }
                return arrayList;
            }

            @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
            public List<Option> getSelectedOptions() {
                Object next2;
                List<Option> listListOf;
                List<IdConfigForCountry> idConfigsForCountry = renderState.getIdConfigsForCountry();
                GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = renderState;
                Iterator<T> it = idConfigsForCountry.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                    if (Intrinsics.areEqual(((IdConfigForCountry) next2).getCountryCode(), autoClassificationManualSelect.getSelectedCountryCode())) {
                        break;
                    }
                }
                IdConfigForCountry idConfigForCountry = (IdConfigForCountry) next2;
                return (idConfigForCountry == null || (listListOf = CollectionsKt.listOf(new Option(idConfigForCountry.getCountryName(), idConfigForCountry.getCountryCode()))) == null) ? CollectionsKt.emptyList() : listListOf;
            }
        };
        final IdConfig idConfig = null;
        if (renderState.getSelectedCountryCode() == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            Iterator<T> it = renderState.getIdConfigsForCountry().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((IdConfigForCountry) next).getCountryCode(), renderState.getSelectedCountryCode())) {
                    break;
                }
            }
            IdConfigForCountry idConfigForCountry = (IdConfigForCountry) next;
            if (idConfigForCountry == null || (listEmptyList = idConfigForCountry.getIds()) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
        }
        List<IdConfig> list = listEmptyList;
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (IdConfig idConfig2 : list) {
            List<NextStep.GovernmentId.LocalizationOverride> localizationOverrides = renderProps.getStrings().getLocalizationOverrides();
            if ((localizationOverrides == null || (idClassKey = AutoClassificationRenderer4.getString(localizationOverrides, renderState.getSelectedCountryCode(), idConfig2.getIdClassKey(), "selectPage")) == null) && (idClassKey = renderProps.getStrings().getIdClassToName().get(idConfig2.getIdClassKey())) == null) {
                idClassKey = idConfig2.getIdClassKey();
            }
            arrayList.add(new Option(idClassKey, idConfig2.getIdClassKey()));
        }
        if (renderState.getSelectedIdClass() != null) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (Intrinsics.areEqual(((IdConfig) next2).getIdClassKey(), renderState.getSelectedIdClass())) {
                    idConfig = next2;
                    break;
                }
            }
            idConfig = idConfig;
        }
        return new GovernmentIdScreen2.AutoClassificationSelectCountryAndIdClassScreen(renderProps.getStrings().getManualClassificationTitle(), renderProps.getStyles(), inputSelectBoxComponent, new InputSelectBoxComponent() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationRenderer$renderManualSelect$idClassSelectComponent$1
            @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
            public boolean getCanSelectMultipleValues() {
                return false;
            }

            @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
            public String getLabel() {
                return null;
            }

            @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
            public InputSelectComponentStyle getStyles() {
                StepStyles.GovernmentIdStepInputSelectStyle inputSelectStyle;
                StepStyles.InputSelectStyleContainer base;
                StepStyles.GovernmentIdStepStyle styles = renderProps.getStyles();
                if (styles == null || (inputSelectStyle = styles.getInputSelectStyle()) == null || (base = inputSelectStyle.getBase()) == null) {
                    return null;
                }
                return base.getBase();
            }

            @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
            public List<Option> getOptions() {
                return arrayList;
            }

            @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
            public List<Option> getSelectedOptions() {
                List<Option> list2 = arrayList;
                GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = renderState;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list2) {
                    if (Intrinsics.areEqual(((Option) obj).getValue(), autoClassificationManualSelect.getSelectedIdClass())) {
                        arrayList2.add(obj);
                    }
                }
                return arrayList2;
            }
        }, renderProps.getStrings().getCountryInputTitle(), renderProps.getStrings().getIdClassInputTitle(), renderProps.getStrings().getManualClassificationContinueButtonText(), idConfig != null, this.navigationStateManager.getNavigationState(), new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationRenderer$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutoClassificationRenderer.renderManualSelect$lambda$9(context, (Option) obj);
            }
        }, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationRenderer$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutoClassificationRenderer.renderManualSelect$lambda$11(context, (Option) obj);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationRenderer$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AutoClassificationRenderer.renderManualSelect$lambda$12(idConfig, renderState, context, renderProps, videoCaptureHelper);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationRenderer$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AutoClassificationRenderer.renderManualSelect$lambda$13(context, videoCaptureHelper);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationRenderer$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AutoClassificationRenderer.renderManualSelect$lambda$15(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderManualSelect$lambda$9(StatefulWorkflow.RenderContext renderContext, final Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationRenderer$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutoClassificationRenderer.renderManualSelect$lambda$9$lambda$8(it, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderManualSelect$lambda$9$lambda$8(Option option, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = state instanceof GovernmentIdState.AutoClassificationManualSelect ? (GovernmentIdState.AutoClassificationManualSelect) state : null;
        if (autoClassificationManualSelect == null) {
            return Unit.INSTANCE;
        }
        action.setState(GovernmentIdState.AutoClassificationManualSelect.copy$default(autoClassificationManualSelect, null, null, null, 0, null, null, null, null, null, option.getValue(), null, 1535, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderManualSelect$lambda$11(StatefulWorkflow.RenderContext renderContext, final Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationRenderer$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutoClassificationRenderer.renderManualSelect$lambda$11$lambda$10(it, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderManualSelect$lambda$11$lambda$10(Option option, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = state instanceof GovernmentIdState.AutoClassificationManualSelect ? (GovernmentIdState.AutoClassificationManualSelect) state : null;
        if (autoClassificationManualSelect == null) {
            return Unit.INSTANCE;
        }
        action.setState(GovernmentIdState.AutoClassificationManualSelect.copy$default(autoClassificationManualSelect, null, null, null, 0, null, null, null, null, null, null, option.getValue(), 1023, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderManualSelect$lambda$12(IdConfig idConfig, GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect, StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow.Input input, VideoCaptureHelper videoCaptureHelper) {
        if (idConfig == null) {
            return Unit.INSTANCE;
        }
        GovernmentIdWorkflowUtils.moveToNextStep(autoClassificationManualSelect, renderContext, input, null, idConfig, videoCaptureHelper, autoClassificationManualSelect.getCameraProperties(), (3584 & 128) != 0, (3584 & 256) != 0 ? autoClassificationManualSelect.getParts$government_id_release() : idConfig.getParts(), (3584 & 512) != 0 ? autoClassificationManualSelect.getPartIndex() : -1, (3584 & 1024) != 0 ? null : null, (3584 & 2048) != 0 ? autoClassificationManualSelect.getCountryCode() : autoClassificationManualSelect.getSelectedCountryCode());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderManualSelect$lambda$13(StatefulWorkflow.RenderContext renderContext, VideoCaptureHelper videoCaptureHelper) {
        GovernmentIdWorkflowUtils.goBack(renderContext, videoCaptureHelper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderManualSelect$lambda$15(StatefulWorkflow.RenderContext renderContext) {
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationRenderer$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutoClassificationRenderer.renderManualSelect$lambda$15$lambda$14((WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderManualSelect$lambda$15$lambda$14(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(GovernmentIdWorkflow.Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }
}
