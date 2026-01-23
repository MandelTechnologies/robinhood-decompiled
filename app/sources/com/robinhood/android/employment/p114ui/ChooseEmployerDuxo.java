package com.robinhood.android.employment.p114ui;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.employment.p114ui.ChooseEmployerFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.identi.EmploymentStore;
import com.robinhood.models.api.identi.ApiEmploymentInfo;
import com.robinhood.models.p355ui.identi.UiEmploymentInfo;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChooseEmployerDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001fB)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014J(\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmployerDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/employment/ui/ChooseEmployerViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "employmentStore", "Lcom/robinhood/librobinhood/data/store/identi/EmploymentStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/EmploymentStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/app/type/AppType;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "updateEmployerName", "newEmployerName", "", "updateEmployerDescription", "newEmployerDescription", "updateEmployerIndustry", "newEmployerIndustry", "submitEmployment", "employmentStatus", "Lcom/robinhood/models/api/identi/ApiEmploymentInfo$EmploymentStatus;", "employerName", "employerDescription", "employerIndustry", "Companion", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ChooseEmployerDuxo extends OldBaseDuxo<ChooseEmployerViewState> implements HasSavedState {
    private final EmploymentStore employmentStore;
    private final ExperimentsStore experimentsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChooseEmployerDuxo(EmploymentStore employmentStore, ExperimentsStore experimentsStore, SavedStateHandle savedStateHandle, AppType appType) {
        super(new ChooseEmployerViewState(appType, null, null, null, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(employmentStore, "employmentStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.employmentStore = employmentStore;
        this.experimentsStore = experimentsStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{IncludeEmploymentAddressInSettingsExperiment.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.employment.ui.ChooseEmployerDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseEmployerDuxo.onStart$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(final ChooseEmployerDuxo chooseEmployerDuxo, final boolean z) {
        chooseEmployerDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.employment.ui.ChooseEmployerDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseEmployerDuxo.onStart$lambda$1$lambda$0(z, chooseEmployerDuxo, (ChooseEmployerViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChooseEmployerViewState onStart$lambda$1$lambda$0(boolean z, ChooseEmployerDuxo chooseEmployerDuxo, ChooseEmployerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ChooseEmployerViewState.copy$default(applyMutation, null, null, null, null, false, z && ((ChooseEmployerFragment.Args) INSTANCE.getArgs((HasSavedState) chooseEmployerDuxo)).getShouldRouteToEmployerAddressUpdate(), false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
    }

    public final void updateEmployerName(final String newEmployerName) {
        Intrinsics.checkNotNullParameter(newEmployerName, "newEmployerName");
        applyMutation(new Function1() { // from class: com.robinhood.android.employment.ui.ChooseEmployerDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseEmployerDuxo.updateEmployerName$lambda$2(newEmployerName, (ChooseEmployerViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChooseEmployerViewState updateEmployerName$lambda$2(String str, ChooseEmployerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ChooseEmployerViewState.copy$default(applyMutation, null, str, null, null, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
    }

    public final void updateEmployerDescription(final String newEmployerDescription) {
        applyMutation(new Function1() { // from class: com.robinhood.android.employment.ui.ChooseEmployerDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseEmployerDuxo.updateEmployerDescription$lambda$3(newEmployerDescription, (ChooseEmployerViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChooseEmployerViewState updateEmployerDescription$lambda$3(String str, ChooseEmployerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ChooseEmployerViewState.copy$default(applyMutation, null, null, str, null, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
    }

    public final void updateEmployerIndustry(final String newEmployerIndustry) {
        applyMutation(new Function1() { // from class: com.robinhood.android.employment.ui.ChooseEmployerDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseEmployerDuxo.updateEmployerIndustry$lambda$4(newEmployerIndustry, (ChooseEmployerViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChooseEmployerViewState updateEmployerIndustry$lambda$4(String str, ChooseEmployerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ChooseEmployerViewState.copy$default(applyMutation, null, null, null, str, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
    }

    public final void submitEmployment(ApiEmploymentInfo.EmploymentStatus employmentStatus, String employerName, String employerDescription, String employerIndustry) {
        Intrinsics.checkNotNullParameter(employmentStatus, "employmentStatus");
        Intrinsics.checkNotNullParameter(employerName, "employerName");
        Intrinsics.checkNotNullParameter(employerDescription, "employerDescription");
        if (employmentStatus == ApiEmploymentInfo.EmploymentStatus.EMPLOYED && employmentStatus == ApiEmploymentInfo.EmploymentStatus.SELF_EMPLOYED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        applyMutation(new Function1() { // from class: com.robinhood.android.employment.ui.ChooseEmployerDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseEmployerDuxo.submitEmployment$lambda$5((ChooseEmployerViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.employmentStore.updateEmploymentInfo(employmentStatus, employerDescription, employerName, employerIndustry), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.employment.ui.ChooseEmployerDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseEmployerDuxo.submitEmployment$lambda$7(this.f$0, (UiEmploymentInfo) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.employment.ui.ChooseEmployerDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseEmployerDuxo.submitEmployment$lambda$9(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChooseEmployerViewState submitEmployment$lambda$5(ChooseEmployerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ChooseEmployerViewState.copy$default(applyMutation, null, null, null, null, false, false, true, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitEmployment$lambda$7(ChooseEmployerDuxo chooseEmployerDuxo, UiEmploymentInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        chooseEmployerDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.employment.ui.ChooseEmployerDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseEmployerDuxo.submitEmployment$lambda$7$lambda$6((ChooseEmployerViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChooseEmployerViewState submitEmployment$lambda$7$lambda$6(ChooseEmployerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ChooseEmployerViewState.copy$default(applyMutation, null, null, null, null, true, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitEmployment$lambda$9(ChooseEmployerDuxo chooseEmployerDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        chooseEmployerDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.employment.ui.ChooseEmployerDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseEmployerDuxo.submitEmployment$lambda$9$lambda$8(throwable, (ChooseEmployerViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChooseEmployerViewState submitEmployment$lambda$9$lambda$8(Throwable th, ChooseEmployerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ChooseEmployerViewState.copy$default(applyMutation, null, null, null, null, false, false, false, new UiEvent(th), EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    /* compiled from: ChooseEmployerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmployerDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/employment/ui/ChooseEmployerDuxo;", "Lcom/robinhood/android/employment/ui/ChooseEmployerFragment$Args;", "<init>", "()V", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ChooseEmployerDuxo, ChooseEmployerFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ChooseEmployerFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (ChooseEmployerFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ChooseEmployerFragment.Args getArgs(ChooseEmployerDuxo chooseEmployerDuxo) {
            return (ChooseEmployerFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, chooseEmployerDuxo);
        }
    }
}
