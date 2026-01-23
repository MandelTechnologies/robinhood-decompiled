package com.robinhood.android.directdeposit.p101ui.prefilled;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.directdeposit.p101ui.prefilled.PreFilledFormIntroFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.identi.EmploymentStore;
import com.robinhood.models.api.identi.ApiEmploymentInfo;
import com.robinhood.models.p355ui.identi.UiEmploymentInfo;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import com.robinhood.utils.extensions.MaybesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.reactivex.Maybe;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: PreFilledFormIntroFragment.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0003*+,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016J\u0010\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u001fH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormIntroFragment;", "Lcom/robinhood/android/common/onboarding/ui/BaseScrollableFragment;", "<init>", "()V", "employmentStore", "Lcom/robinhood/librobinhood/data/store/identi/EmploymentStore;", "getEmploymentStore", "()Lcom/robinhood/librobinhood/data/store/identi/EmploymentStore;", "setEmploymentStore", "(Lcom/robinhood/librobinhood/data/store/identi/EmploymentStore;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "callbacks", "Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormIntroFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormIntroFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "formStepsAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormIntroRowView;", "Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormIntroFragment$FormStep;", "primaryButtonStringRes", "", "getPrimaryButtonStringRes", "()Ljava/lang/Integer;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onPrimaryBtnClicked", "logContinueButtonTap", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "onStart", "Callbacks", "FormStep", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class PreFilledFormIntroFragment extends BaseScrollableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public EmploymentStore employmentStore;
    public EventLogger eventLogger;
    private final GenericListAdapter<PreFilledFormIntroRowView, FormStep> formStepsAdapter;
    private final int primaryButtonStringRes;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PreFilledFormIntroFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormIntroFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PreFilledFormIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormIntroFragment$Callbacks;", "", "onConfirmEmployer", "", "employerName", "", "onUpdateEmployer", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onConfirmEmployer(String employerName);

        void onUpdateEmployer();
    }

    public PreFilledFormIntroFragment() {
        super(C14044R.layout.fragment_pre_filled_form_intro);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormIntroFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        int i = C14044R.layout.include_pre_filled_form_intro_row;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.formStepsAdapter = companion.m2985of(i, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormIntroFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PreFilledFormIntroFragment.formStepsAdapter$lambda$0((PreFilledFormIntroRowView) obj, (PreFilledFormIntroFragment.FormStep) obj2);
            }
        });
        this.primaryButtonStringRes = C11048R.string.general_label_continue;
    }

    public final EmploymentStore getEmploymentStore() {
        EmploymentStore employmentStore = this.employmentStore;
        if (employmentStore != null) {
            return employmentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("employmentStore");
        return null;
    }

    public final void setEmploymentStore(EmploymentStore employmentStore) {
        Intrinsics.checkNotNullParameter(employmentStore, "<set-?>");
        this.employmentStore = employmentStore;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit formStepsAdapter$lambda$0(PreFilledFormIntroRowView of, FormStep data) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(data, "data");
        of.getNumberTxt().setText(String.valueOf(data.getStep()));
        of.getTitleTxt().setText(data.getTitleRes());
        of.getDescriptionTxt().setText(data.getDescriptionRes());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment
    public Integer getPrimaryButtonStringRes() {
        return Integer.valueOf(this.primaryButtonStringRes);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C14044R.id.pre_filled_intro_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        int i = 0;
        recyclerView.setNestedScrollingEnabled(false);
        Intrinsics.checkNotNull(recyclerView);
        bindAdapter(recyclerView, this.formStepsAdapter);
        List listListOf = CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to(Integer.valueOf(C14044R.string.pre_filled_form_confirm_title), Integer.valueOf(C14044R.string.pre_filled_form_confirm_detail)), Tuples4.m3642to(Integer.valueOf(C14044R.string.pre_filled_form_amount_title), Integer.valueOf(C14044R.string.pre_filled_form_amount_detail)), Tuples4.m3642to(Integer.valueOf(C14044R.string.pre_filled_form_review_title), Integer.valueOf(C14044R.string.pre_filled_form_review_detail)), Tuples4.m3642to(Integer.valueOf(C14044R.string.pre_filled_form_submit_title), Integer.valueOf(C14044R.string.pre_filled_form_submit_detail))});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        for (Object obj : listListOf) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Tuples2 tuples2 = (Tuples2) obj;
            arrayList.add(new FormStep(i2, ((Number) tuples2.component1()).intValue(), ((Number) tuples2.component2()).intValue()));
            i = i2;
        }
        this.formStepsAdapter.submitList(arrayList);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        EmploymentStore.refreshEmployment$default(getEmploymentStore(), false, 1, null);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment
    public void onPrimaryBtnClicked() {
        Maybe<UiEmploymentInfo> maybeFirstElement = getEmploymentStore().streamEmploymentInfo().firstElement();
        Intrinsics.checkNotNullExpressionValue(maybeFirstElement, "firstElement(...)");
        LifecycleHost.DefaultImpls.bind$default(this, MaybesAndroid.observeOnMainThread(maybeFirstElement), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormIntroFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormIntroFragment.onPrimaryBtnClicked$lambda$3(this.f$0, (UiEmploymentInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPrimaryBtnClicked$lambda$3(PreFilledFormIntroFragment preFilledFormIntroFragment, UiEmploymentInfo uiEmploymentInfo) {
        String employerName;
        if (uiEmploymentInfo.getEmploymentStatus() == ApiEmploymentInfo.EmploymentStatus.EMPLOYED && (employerName = uiEmploymentInfo.getEmployerName()) != null && employerName.length() != 0) {
            preFilledFormIntroFragment.logContinueButtonTap(UserInteractionEventData.Action.VIEW_DD_CONFIRM_EMPLOYER);
            Callbacks callbacks = preFilledFormIntroFragment.getCallbacks();
            String employerName2 = uiEmploymentInfo.getEmployerName();
            Intrinsics.checkNotNull(employerName2);
            callbacks.onConfirmEmployer(employerName2);
        } else {
            preFilledFormIntroFragment.logContinueButtonTap(UserInteractionEventData.Action.VIEW_DD_UPDATE_EMPLOYER);
            preFilledFormIntroFragment.getCallbacks().onUpdateEmployer();
        }
        return Unit.INSTANCE;
    }

    private final void logContinueButtonTap(UserInteractionEventData.Action action) {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), action, new Screen(Screen.Name.DD_PREFILLED_INTRO, null, null, null, 14, null), new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, null, false, 56, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, new Screen(Screen.Name.DD_PREFILLED_INTRO, null, null, null, 14, null), null, null, null, 29, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PreFilledFormIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormIntroFragment$FormStep;", "", "step", "", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, OrderTypeEducationLearnMoreFragment.ARG_DESCRIPTION_RES, "<init>", "(III)V", "getStep", "()I", "getTitleRes", "getDescriptionRes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class FormStep {
        private final int descriptionRes;
        private final int step;
        private final int titleRes;

        public static /* synthetic */ FormStep copy$default(FormStep formStep, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = formStep.step;
            }
            if ((i4 & 2) != 0) {
                i2 = formStep.titleRes;
            }
            if ((i4 & 4) != 0) {
                i3 = formStep.descriptionRes;
            }
            return formStep.copy(i, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getStep() {
            return this.step;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        /* renamed from: component3, reason: from getter */
        public final int getDescriptionRes() {
            return this.descriptionRes;
        }

        public final FormStep copy(int step, int titleRes, int descriptionRes) {
            return new FormStep(step, titleRes, descriptionRes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormStep)) {
                return false;
            }
            FormStep formStep = (FormStep) other;
            return this.step == formStep.step && this.titleRes == formStep.titleRes && this.descriptionRes == formStep.descriptionRes;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.step) * 31) + Integer.hashCode(this.titleRes)) * 31) + Integer.hashCode(this.descriptionRes);
        }

        public String toString() {
            return "FormStep(step=" + this.step + ", titleRes=" + this.titleRes + ", descriptionRes=" + this.descriptionRes + ")";
        }

        public FormStep(int i, int i2, int i3) {
            this.step = i;
            this.titleRes = i2;
            this.descriptionRes = i3;
        }

        public final int getStep() {
            return this.step;
        }

        public final int getTitleRes() {
            return this.titleRes;
        }

        public final int getDescriptionRes() {
            return this.descriptionRes;
        }
    }

    /* compiled from: PreFilledFormIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormIntroFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormIntroFragment;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PreFilledFormIntroFragment newInstance() {
            return new PreFilledFormIntroFragment();
        }
    }
}
