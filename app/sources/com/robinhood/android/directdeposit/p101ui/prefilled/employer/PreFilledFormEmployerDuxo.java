package com.robinhood.android.directdeposit.p101ui.prefilled.employer;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.identi.EmploymentStore;
import com.robinhood.models.p355ui.identi.UiEmploymentInfo;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreFilledFormEmployerDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0014\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormEmployerDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormEmployerViewState;", "employmentStore", "Lcom/robinhood/librobinhood/data/store/identi/EmploymentStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/EmploymentStore;)V", "onResume", "", "bindEmployerInputChanges", "employerTextChanges", "Lio/reactivex/Observable;", "", "onContinueClick", "employerInput", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class PreFilledFormEmployerDuxo extends OldBaseDuxo<PreFilledFormEmployerViewState> {
    public static final int $stable = 8;
    private final EmploymentStore employmentStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreFilledFormEmployerDuxo(EmploymentStore employmentStore) {
        super(new PreFilledFormEmployerViewState(null, null, false, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(employmentStore, "employmentStore");
        this.employmentStore = employmentStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        EmploymentStore.refreshEmployment$default(this.employmentStore, false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.employmentStore.streamEmploymentInfo(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.employer.PreFilledFormEmployerDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormEmployerDuxo.onResume$lambda$1(this.f$0, (UiEmploymentInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(PreFilledFormEmployerDuxo preFilledFormEmployerDuxo, final UiEmploymentInfo userEmployment) {
        Intrinsics.checkNotNullParameter(userEmployment, "userEmployment");
        preFilledFormEmployerDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.employer.PreFilledFormEmployerDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormEmployerDuxo.onResume$lambda$1$lambda$0(userEmployment, (PreFilledFormEmployerViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreFilledFormEmployerViewState onResume$lambda$1$lambda$0(UiEmploymentInfo uiEmploymentInfo, PreFilledFormEmployerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PreFilledFormEmployerViewState.copy$default(applyMutation, null, uiEmploymentInfo, false, null, null, null, null, 125, null);
    }

    public final void bindEmployerInputChanges(Observable<CharSequence> employerTextChanges) {
        Intrinsics.checkNotNullParameter(employerTextChanges, "employerTextChanges");
        LifecycleHost.DefaultImpls.bind$default(this, employerTextChanges, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.employer.PreFilledFormEmployerDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormEmployerDuxo.bindEmployerInputChanges$lambda$3(this.f$0, (CharSequence) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindEmployerInputChanges$lambda$3(PreFilledFormEmployerDuxo preFilledFormEmployerDuxo, final CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        preFilledFormEmployerDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.employer.PreFilledFormEmployerDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormEmployerDuxo.bindEmployerInputChanges$lambda$3$lambda$2(text, (PreFilledFormEmployerViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreFilledFormEmployerViewState bindEmployerInputChanges$lambda$3$lambda$2(CharSequence charSequence, PreFilledFormEmployerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PreFilledFormEmployerViewState.copy$default(applyMutation, charSequence.toString(), null, false, null, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }

    public final void onContinueClick(final String employerInput) {
        Intrinsics.checkNotNullParameter(employerInput, "employerInput");
        applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.employer.PreFilledFormEmployerDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormEmployerDuxo.onContinueClick$lambda$4(employerInput, (PreFilledFormEmployerViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreFilledFormEmployerViewState onContinueClick$lambda$4(String str, PreFilledFormEmployerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.handleEmployerInput(str);
    }
}
