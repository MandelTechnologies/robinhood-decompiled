package com.truelayer.payments.p419ui.screens.formflows;

import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.components.inputs.form.models.Field;
import com.truelayer.payments.p419ui.components.inputs.form.models.FieldState;
import com.truelayer.payments.p419ui.screens.FormInputWrapper;
import com.truelayer.payments.p419ui.screens.formflows.FormFlowScreen;
import com.truelayer.payments.p419ui.screens.formflows.model.FormScreensCreator;
import com.truelayer.payments.p419ui.utils.Navigation3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FormCoordinatorViewModel.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.formflows.FormCoordinatorViewModel$updateFlow$3$1", m3645f = "FormCoordinatorViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.formflows.FormCoordinatorViewModel$updateFlow$3$1, reason: use source file name */
/* loaded from: classes12.dex */
final class FormCoordinatorViewModel2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<FormInputWrapper> $inputs;
    final /* synthetic */ FormScreensCreator $it;
    int label;
    final /* synthetic */ FormCoordinatorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FormCoordinatorViewModel2(FormScreensCreator formScreensCreator, FormCoordinatorViewModel formCoordinatorViewModel, List<? extends FormInputWrapper> list, Continuation<? super FormCoordinatorViewModel2> continuation) {
        super(2, continuation);
        this.$it = formScreensCreator;
        this.this$0 = formCoordinatorViewModel;
        this.$inputs = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FormCoordinatorViewModel2(this.$it, this.this$0, this.$inputs, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FormCoordinatorViewModel2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FormScreensCreator formScreensCreator = this.$it;
            this.label = 1;
            obj = formScreensCreator.createSteps(this);
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
        FormCoordinatorViewModel formCoordinatorViewModel = this.this$0;
        boolean z = outcome instanceof Ok;
        if (!z) {
            if (outcome instanceof Fail) {
                CoreError coreError = (CoreError) ((Fail) outcome).getError();
                coreError.setUnderlyingError("Failed to create steps for form screen");
                formCoordinatorViewModel._error.tryEmit(coreError);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        final FormCoordinatorViewModel formCoordinatorViewModel2 = this.this$0;
        List<FormInputWrapper> list = this.$inputs;
        if (z) {
            List list2 = (List) ((Ok) outcome).getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                FormFlowScreen formFlowScreenCurrentRouteWithUpdatedValues = formCoordinatorViewModel2.currentRouteWithUpdatedValues(formCoordinatorViewModel2.getValues(), (FormFlowScreen) it.next());
                if (formFlowScreenCurrentRouteWithUpdatedValues != null) {
                    arrayList.add(formFlowScreenCurrentRouteWithUpdatedValues);
                }
            }
            Navigation3<FormFlowScreen> navigation3 = new Navigation3<>(arrayList, new Function1<FormFlowScreen, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.FormCoordinatorViewModel$updateFlow$3$1$2$newNavigator$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FormFlowScreen formFlowScreen) {
                    invoke2(formFlowScreen);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(FormFlowScreen value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Tuples2 tuples2InputsToMeta = formCoordinatorViewModel2.inputsToMeta(value);
                    TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.AdditionalInputsLoaded((List) tuples2InputsToMeta.component1(), (Map) tuples2InputsToMeta.component2(), null, 4, null));
                    formCoordinatorViewModel2.setCurrentRoute(value);
                }
            });
            for (T t : navigation3.getRoutes()) {
                if (t instanceof FormFlowScreen.Form) {
                    List<Field> inputs = ((FormFlowScreen.Form) t).getInputs();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : inputs) {
                        if (!(Field.validate$default((Field) obj2, null, false, 3, null) instanceof FieldState.Valid)) {
                            arrayList2.add(obj2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        navigation3.pretendMovingBackUpTo(t);
                        break;
                    }
                } else if (t instanceof FormFlowScreen.RadioSelect) {
                    if (!(Field.validate$default(((FormFlowScreen.RadioSelect) t).getInput(), null, false, 3, null) instanceof FieldState.Valid)) {
                        navigation3.pretendMovingBackUpTo(t);
                        break;
                    }
                } else if (t instanceof FormFlowScreen.Select) {
                    if (!(Field.validate$default(((FormFlowScreen.Select) t).getInput(), null, false, 3, null) instanceof FieldState.Valid)) {
                        navigation3.pretendMovingBackUpTo(t);
                        break;
                    }
                } else if (!(t instanceof FormFlowScreen.Empty)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            formCoordinatorViewModel2.getFormViewData().setInputs(list);
            formCoordinatorViewModel2.setNavigator(navigation3);
        } else if (!(outcome instanceof Fail)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
