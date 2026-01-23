package com.truelayer.payments.p419ui.screens.formflows;

import android.content.Context;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModel2;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.experience.localisation.LocalisedText;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.core.domain.payments.RecentAdditionalInput;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.network.Network;
import com.truelayer.payments.core.network.experience.TranslationProvider;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.components.inputs.form.models.Field;
import com.truelayer.payments.p419ui.components.inputs.form.models.Fields3;
import com.truelayer.payments.p419ui.components.inputs.form.models.Fields4;
import com.truelayer.payments.p419ui.models.PaymentContext;
import com.truelayer.payments.p419ui.models.QueryState;
import com.truelayer.payments.p419ui.screens.FormInputWrapper;
import com.truelayer.payments.p419ui.screens.formflows.FormFlowScreen;
import com.truelayer.payments.p419ui.screens.formflows.model.FormScreensCreator;
import com.truelayer.payments.p419ui.utils.FieldIds;
import com.truelayer.payments.p419ui.utils.Navigation3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: FormCoordinatorViewModel.kt */
@Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ(\u0010D\u001a\u0004\u0018\u00010\u00112\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000206052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010E\u001a\u0004\u0018\u0001062\u0006\u0010F\u001a\u000206J.\u0010G\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u0002060I\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000206050H2\u0006\u0010J\u001a\u00020\u0011H\u0002JI\u0010K\u001a\u00020L2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000206052-\u0010M\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020605¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(>\u0012\u0004\u0012\u00020L0NJ0\u0010Q\u001a\u00020L2\u0006\u0010R\u001a\u00020S2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020U0I2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020705J\u0006\u0010V\u001a\u00020LJ\u0014\u0010W\u001a\u00020L2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020L0YJ2\u0010Z\u001a\u00020L2\u0006\u0010R\u001a\u00020S2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020U0I2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020705H\u0002R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR/\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R;\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010%2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010%8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u0018\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R+\u0010/\u001a\u00020.2\u0006\u0010\u0010\u001a\u00020.8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010\u0018\u001a\u0004\b0\u00101\"\u0004\b2\u00103RC\u00108\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000207052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000207058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010\u0018\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R&\u0010>\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002060?X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006["}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/formflows/FormCoordinatorViewModel;", "Landroidx/lifecycle/ViewModel;", "paymentContext", "Lcom/truelayer/payments/ui/models/PaymentContext;", "formViewData", "Lcom/truelayer/payments/ui/screens/formflows/FormViewData;", "api", "Lcom/truelayer/payments/core/network/Network;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/truelayer/payments/ui/models/PaymentContext;Lcom/truelayer/payments/ui/screens/formflows/FormViewData;Lcom/truelayer/payments/core/network/Network;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_error", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "getApi", "()Lcom/truelayer/payments/core/network/Network;", "<set-?>", "Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen;", "currentRoute", "getCurrentRoute", "()Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen;", "setCurrentRoute", "(Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen;)V", "currentRoute$delegate", "Landroidx/compose/runtime/MutableState;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "error", "Lkotlinx/coroutines/flow/StateFlow;", "getError", "()Lkotlinx/coroutines/flow/StateFlow;", "setError", "(Lkotlinx/coroutines/flow/StateFlow;)V", "formScreensCreator", "Lcom/truelayer/payments/ui/screens/formflows/model/FormScreensCreator;", "getFormViewData", "()Lcom/truelayer/payments/ui/screens/formflows/FormViewData;", "Lcom/truelayer/payments/ui/utils/FlowNavigator;", "navigator", "getNavigator", "()Lcom/truelayer/payments/ui/utils/FlowNavigator;", "setNavigator", "(Lcom/truelayer/payments/ui/utils/FlowNavigator;)V", "navigator$delegate", "getPaymentContext", "()Lcom/truelayer/payments/ui/models/PaymentContext;", "Lcom/truelayer/payments/ui/models/QueryState;", "query", "getQuery", "()Lcom/truelayer/payments/ui/models/QueryState;", "setQuery", "(Lcom/truelayer/payments/ui/models/QueryState;)V", "query$delegate", "", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "translations", "getTranslations", "()Ljava/util/Map;", "setTranslations", "(Ljava/util/Map;)V", "translations$delegate", "values", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "getValues", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "setValues", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "currentRouteWithUpdatedValues", "getValue", "id", "inputsToMeta", "Lkotlin/Pair;", "", "screen", "next", "", "onComplete", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "notifyChange", "context", "Landroid/content/Context;", "inputs", "Lcom/truelayer/payments/ui/screens/FormInputWrapper;", "notifyLocaleChange", "previous", "onAbort", "Lkotlin/Function0;", "updateFlow", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class FormCoordinatorViewModel extends ViewModel {
    public static final int $stable = 8;
    private StateFlow2<CoreError> _error;
    private final Network api;

    /* renamed from: currentRoute$delegate, reason: from kotlin metadata */
    private final SnapshotState currentRoute;
    private final CoroutineDispatcher dispatcher;
    private StateFlow<? extends CoreError> error;
    private FormScreensCreator formScreensCreator;
    private final FormViewData formViewData;

    /* renamed from: navigator$delegate, reason: from kotlin metadata */
    private final SnapshotState navigator;
    private final PaymentContext paymentContext;

    /* renamed from: query$delegate, reason: from kotlin metadata */
    private final SnapshotState query;

    /* renamed from: translations$delegate, reason: from kotlin metadata */
    private final SnapshotState translations;
    private SnapshotStateMap<String, String> values;

    public final PaymentContext getPaymentContext() {
        return this.paymentContext;
    }

    public final FormViewData getFormViewData() {
        return this.formViewData;
    }

    public /* synthetic */ FormCoordinatorViewModel(PaymentContext paymentContext, FormViewData formViewData, Network network, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentContext, formViewData, (i & 4) != 0 ? TrueLayerUI.INSTANCE.getCore$payments_ui_release().getNetwork() : network, (i & 8) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    public final Network getApi() {
        return this.api;
    }

    public final CoroutineDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public FormCoordinatorViewModel(PaymentContext paymentContext, FormViewData formViewData, Network api, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(paymentContext, "paymentContext");
        Intrinsics.checkNotNullParameter(formViewData, "formViewData");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.paymentContext = paymentContext;
        this.formViewData = formViewData;
        this.api = api;
        this.dispatcher = dispatcher;
        this.values = SnapshotStateKt.mutableStateMapOf();
        this.currentRoute = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.navigator = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        StateFlow2<CoreError> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
        this._error = stateFlow2MutableStateFlow;
        this.error = stateFlow2MutableStateFlow;
        this.query = SnapshotState3.mutableStateOf$default(QueryState.INSTANCE.mo27021default(), null, 2, null);
        this.translations = SnapshotState3.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C430871(null), 3, null);
    }

    public final SnapshotStateMap<String, String> getValues() {
        return this.values;
    }

    public final void setValues(SnapshotStateMap<String, String> snapshotStateMap) {
        Intrinsics.checkNotNullParameter(snapshotStateMap, "<set-?>");
        this.values = snapshotStateMap;
    }

    public final FormFlowScreen getCurrentRoute() {
        return (FormFlowScreen) this.currentRoute.getValue();
    }

    public final void setCurrentRoute(FormFlowScreen formFlowScreen) {
        this.currentRoute.setValue(formFlowScreen);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Navigation3<FormFlowScreen> getNavigator() {
        return (Navigation3) this.navigator.getValue();
    }

    public final void setNavigator(Navigation3<FormFlowScreen> navigation3) {
        this.navigator.setValue(navigation3);
    }

    public final StateFlow<CoreError> getError() {
        return this.error;
    }

    public final void setError(StateFlow<? extends CoreError> stateFlow) {
        Intrinsics.checkNotNullParameter(stateFlow, "<set-?>");
        this.error = stateFlow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final QueryState getQuery() {
        return (QueryState) this.query.getValue();
    }

    public final void setQuery(QueryState queryState) {
        Intrinsics.checkNotNullParameter(queryState, "<set-?>");
        this.query.setValue(queryState);
    }

    public final Map<String, LocalisedText> getTranslations() {
        return (Map) this.translations.getValue();
    }

    public final void setTranslations(Map<String, LocalisedText> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.translations.setValue(map);
    }

    /* compiled from: FormCoordinatorViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.formflows.FormCoordinatorViewModel$1", m3645f = "FormCoordinatorViewModel.kt", m3646l = {55}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.formflows.FormCoordinatorViewModel$1 */
    static final class C430871 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C430871(Continuation<? super C430871> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FormCoordinatorViewModel.this.new C430871(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C430871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<Outcome<Map<String, LocalisedText>, CoreError>> inputTranslations = FormCoordinatorViewModel.this.getApi().getTranslationProvider().getInputTranslations();
                final FormCoordinatorViewModel formCoordinatorViewModel = FormCoordinatorViewModel.this;
                FlowCollector<? super Outcome<Map<String, LocalisedText>, CoreError>> flowCollector = new FlowCollector() { // from class: com.truelayer.payments.ui.screens.formflows.FormCoordinatorViewModel.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Outcome<? extends Map<String, LocalisedText>, ? extends CoreError>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Outcome<? extends Map<String, LocalisedText>, ? extends CoreError> outcome, Continuation<? super Unit> continuation) {
                        FormCoordinatorViewModel formCoordinatorViewModel2 = formCoordinatorViewModel;
                        if (outcome instanceof Ok) {
                            formCoordinatorViewModel2.setTranslations((Map) ((Ok) outcome).getValue());
                        } else if (!(outcome instanceof Fail)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (inputTranslations.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    public final void notifyLocaleChange() {
        this.api.getTranslationProvider().updateInputs(this.paymentContext.intoDomain$payments_ui_release(), this.formViewData.getSelectedProvider().getCountryCode());
    }

    /* compiled from: FormCoordinatorViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.formflows.FormCoordinatorViewModel$notifyChange$1", m3645f = "FormCoordinatorViewModel.kt", m3646l = {70}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.ui.screens.formflows.FormCoordinatorViewModel$notifyChange$1 */
    static final class C430881 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ List<FormInputWrapper> $inputs;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C430881(Context context, List<? extends FormInputWrapper> list, Continuation<? super C430881> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$inputs = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FormCoordinatorViewModel.this.new C430881(this.$context, this.$inputs, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C430881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objEmptyMap;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TranslationProvider translationProvider = FormCoordinatorViewModel.this.getApi().getTranslationProvider();
                com.truelayer.payments.core.domain.payments.PaymentContext paymentContextIntoDomain$payments_ui_release = FormCoordinatorViewModel.this.getPaymentContext().intoDomain$payments_ui_release();
                String countryCode = FormCoordinatorViewModel.this.getFormViewData().getSelectedProvider().getCountryCode();
                this.label = 1;
                obj = translationProvider.updateInputsSync(paymentContextIntoDomain$payments_ui_release, countryCode, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Outcome outcome = (Outcome) obj;
            if (outcome instanceof Ok) {
                objEmptyMap = ((Ok) outcome).getValue();
            } else {
                if (!(outcome instanceof Fail)) {
                    throw new NoWhenBranchMatchedException();
                }
                objEmptyMap = MapsKt.emptyMap();
            }
            Map map = (Map) objEmptyMap;
            if (map.isEmpty()) {
                FormCoordinatorViewModel.this.updateFlow(this.$context, this.$inputs, map);
            }
            return Unit.INSTANCE;
        }
    }

    public final void notifyChange(Context context, List<? extends FormInputWrapper> inputs, Map<String, LocalisedText> translations) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(translations, "translations");
        if (translations.isEmpty()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C430881(context, inputs, null), 3, null);
        } else {
            updateFlow(context, inputs, translations);
        }
    }

    public final void next(Map<String, String> values, Function1<? super Map<String, String>, Unit> onComplete) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        FormFlowScreen currentRoute = getCurrentRoute();
        if (currentRoute != null) {
            Tuples2<List<String>, Map<String, String>> tuples2InputsToMeta = inputsToMeta(currentRoute);
            TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.AdditionalInputsContinueButtonClicked(tuples2InputsToMeta.component1(), tuples2InputsToMeta.component2(), null, 4, null));
        }
        this.values.putAll(values);
        Navigation3<FormFlowScreen> navigator = getNavigator();
        if (navigator != null) {
            navigator.updateCurrentRoute(currentRouteWithUpdatedValues(values, getCurrentRoute()));
            if (navigator.next() == null) {
                FormFlowScreen currentRoute2 = getCurrentRoute();
                if (currentRoute2 != null) {
                    Tuples2<List<String>, Map<String, String>> tuples2InputsToMeta2 = inputsToMeta(currentRoute2);
                    TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.AdditionalInputsSubmitted(tuples2InputsToMeta2.component1(), tuples2InputsToMeta2.component2(), null, 4, null));
                }
                onComplete.invoke(this.values.toMap());
            }
        }
    }

    public final void previous(Function0<Unit> onAbort) {
        Intrinsics.checkNotNullParameter(onAbort, "onAbort");
        Navigation3<FormFlowScreen> navigator = getNavigator();
        if (navigator != null) {
            navigator.updateCurrentRoute(getCurrentRoute());
            if (((FormFlowScreen) navigator.previous()) == null) {
                onAbort.invoke();
            }
        }
    }

    public final String getValue(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.values.get(id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FormFlowScreen currentRouteWithUpdatedValues(Map<String, String> values, FormFlowScreen currentRoute) {
        Field fieldCopy$default;
        if (currentRoute instanceof FormFlowScreen.Form) {
            FormFlowScreen.Form form = (FormFlowScreen.Form) currentRoute;
            List<Field> inputs = form.getInputs();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(inputs, 10));
            for (Field field : inputs) {
                String str = values.get(field.getId());
                if (str != null && (fieldCopy$default = Fields3.copy$default(field, null, null, null, null, null, field.validate(str, true), false, null, null, null, null, null, 4063, null)) != null) {
                    field = fieldCopy$default;
                }
                arrayList.add(field);
            }
            return FormFlowScreen.Form.copy$default(form, null, null, null, arrayList, 7, null);
        }
        if (currentRoute instanceof FormFlowScreen.RadioSelect) {
            FormFlowScreen.RadioSelect radioSelect = (FormFlowScreen.RadioSelect) currentRoute;
            String str2 = values.get(radioSelect.getInput().getId());
            if (str2 != null) {
                FormFlowScreen.RadioSelect radioSelectCopy$default = FormFlowScreen.RadioSelect.copy$default(radioSelect, null, null, null, Fields4.copy$default(radioSelect.getInput(), null, null, radioSelect.getInput().validate(str2, true), false, null, false, null, null, null, null, 1019, null), 7, null);
                if (radioSelectCopy$default != null) {
                    return radioSelectCopy$default;
                }
            }
            return radioSelect;
        }
        if (currentRoute instanceof FormFlowScreen.Select) {
            FormFlowScreen.Select select = (FormFlowScreen.Select) currentRoute;
            String str3 = values.get(select.getInput().getId());
            if (str3 != null) {
                FormFlowScreen.Select selectCopy$default = FormFlowScreen.Select.copy$default(select, null, null, null, null, Fields4.copy$default(select.getInput(), null, null, select.getInput().validate(str3, true), false, null, false, null, null, null, null, 1019, null), 15, null);
                if (selectCopy$default != null) {
                    return selectCopy$default;
                }
            }
            return select;
        }
        if (currentRoute instanceof FormFlowScreen.Empty) {
            return currentRoute;
        }
        if (currentRoute == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Tuples2<List<String>, Map<String, String>> inputsToMeta(FormFlowScreen screen) {
        List<Field> listEmptyList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (screen instanceof FormFlowScreen.Form) {
            listEmptyList = ((FormFlowScreen.Form) screen).getInputs();
        } else if (screen instanceof FormFlowScreen.RadioSelect) {
            FormFlowScreen.RadioSelect radioSelect = (FormFlowScreen.RadioSelect) screen;
            linkedHashMap.put(radioSelect.getInput().getId() + "-size", String.valueOf(radioSelect.getInput().getOptions().size()));
            listEmptyList = CollectionsKt.listOf(radioSelect.getInput());
        } else if (screen instanceof FormFlowScreen.Select) {
            FormFlowScreen.Select select = (FormFlowScreen.Select) screen;
            linkedHashMap.put(select.getInput().getId() + "-size", String.valueOf(select.getInput().getOptions().size()));
            listEmptyList = CollectionsKt.listOf(select.getInput());
        } else {
            if (!(screen instanceof FormFlowScreen.Empty)) {
                throw new NoWhenBranchMatchedException();
            }
            listEmptyList = CollectionsKt.emptyList();
        }
        List<Field> list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Field) it.next()).getId());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Field field : list) {
            Tuples2 tuples2M3642to = Tuples4.m3642to(field.getId(), field.getType());
            linkedHashMap2.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        linkedHashMap.putAll(linkedHashMap2);
        return new Tuples2<>(arrayList, linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateFlow(Context context, List<? extends FormInputWrapper> inputs, Map<String, LocalisedText> translations) {
        List<? extends FormInputWrapper> list;
        Object next;
        Unit unit = null;
        this._error.tryEmit(null);
        if (this.formScreensCreator == null || !Intrinsics.areEqual(this.formViewData.getInputs(), inputs)) {
            if (this.formViewData.getSelectedBranch() != null) {
                List<? extends FormInputWrapper> list2 = inputs;
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (Intrinsics.areEqual(((FormInputWrapper) next).getId(), FieldIds.BRANCH)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (((FormInputWrapper) next) != null) {
                    this.values.put(FieldIds.BRANCH, this.formViewData.getSelectedBranch().getId());
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (!Intrinsics.areEqual(((FormInputWrapper) obj).getId(), FieldIds.BRANCH)) {
                        arrayList.add(obj);
                    }
                }
                list = arrayList;
            } else {
                list = inputs;
            }
            PaymentContext paymentContext = this.paymentContext;
            List<RecentAdditionalInput> previouslyUsedValues = this.formViewData.getPreviouslyUsedValues();
            Context applicationContext = context.getApplicationContext();
            Network network = this.api;
            PaymentProvider selectedProvider = this.formViewData.getSelectedProvider();
            boolean zIsSignupPlus = this.formViewData.isSignupPlus();
            Intrinsics.checkNotNull(applicationContext);
            this.formScreensCreator = new FormScreensCreator(paymentContext, list, previouslyUsedValues, applicationContext, network, selectedProvider, zIsSignupPlus, translations, new Function2<String, String, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.FormCoordinatorViewModel.updateFlow.1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
                    invoke2(str, str2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String key, String url) {
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(url, "url");
                    TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.BannerHelpLinkTapped(key, url, FormCoordinatorViewModel.this.getFormViewData().getSelectedProvider().getId(), null, 8, null));
                }
            }, new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.FormCoordinatorViewModel.updateFlow.2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String url) {
                    Intrinsics.checkNotNullParameter(url, "url");
                    TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.LegalsOpened(url, null, 2, null));
                }
            });
        }
        FormScreensCreator formScreensCreator = this.formScreensCreator;
        if (formScreensCreator != null) {
            if (getNavigator() != null && Intrinsics.areEqual(this.formViewData.getInputs(), inputs)) {
                FormScreensCreator formScreensCreator2 = this.formScreensCreator;
                if (!Intrinsics.areEqual(formScreensCreator2 != null ? formScreensCreator2.getTranslationsMap() : null, translations)) {
                }
                unit = Unit.INSTANCE;
            } else {
                FormScreensCreator formScreensCreator3 = this.formScreensCreator;
                if (formScreensCreator3 != null) {
                    formScreensCreator3.setTranslationsMap(translations);
                }
                BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.dispatcher, null, new FormCoordinatorViewModel2(formScreensCreator, this, inputs, null), 2, null);
                unit = Unit.INSTANCE;
            }
        }
        if (unit == null) {
            TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.WTF(null, "FormScreensCreator is null", null, null, null, null, 61, null));
        }
    }
}
