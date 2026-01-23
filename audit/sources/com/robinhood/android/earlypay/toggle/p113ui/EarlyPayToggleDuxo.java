package com.robinhood.android.earlypay.toggle.p113ui;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.EarlyPayEnrollmentStore;
import com.robinhood.models.api.bonfire.ApiEarlyPayEnrollment;
import com.robinhood.models.p320db.EarlyPayEnrollment;
import com.robinhood.models.p320db.EarlyPayEnrollment2;
import com.robinhood.udf.UiEvent;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EarlyPayToggleDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayToggleDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayToggleViewState;", "earlyPayEnrollmentStore", "Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;Lcom/robinhood/analytics/EventLogger;)V", "onStart", "", "onEarlyPayEnrollmentChanged", "enrolled", "", "onEarlyPayEnrollmentChangeConfirmed", "onEarlyPayEnrollmentChangeDismissed", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class EarlyPayToggleDuxo extends OldBaseDuxo<EarlyPayToggleViewState> {
    public static final int $stable = 8;
    private final EarlyPayEnrollmentStore earlyPayEnrollmentStore;
    private final EventLogger eventLogger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EarlyPayToggleDuxo(EarlyPayEnrollmentStore earlyPayEnrollmentStore, EventLogger eventLogger) {
        super(new EarlyPayToggleViewState(false, false, null, null, null, 31, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(earlyPayEnrollmentStore, "earlyPayEnrollmentStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.earlyPayEnrollmentStore = earlyPayEnrollmentStore;
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        this.earlyPayEnrollmentStore.refresh(false);
        LifecycleHost.DefaultImpls.bind$default(this, this.earlyPayEnrollmentStore.streamEnrollment(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.earlypay.toggle.ui.EarlyPayToggleDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayToggleDuxo.onStart$lambda$1(this.f$0, (EarlyPayEnrollment) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(EarlyPayToggleDuxo earlyPayToggleDuxo, final EarlyPayEnrollment earlyPayEnrollment) {
        Intrinsics.checkNotNullParameter(earlyPayEnrollment, "earlyPayEnrollment");
        earlyPayToggleDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.earlypay.toggle.ui.EarlyPayToggleDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayToggleDuxo.onStart$lambda$1$lambda$0(earlyPayEnrollment, (EarlyPayToggleViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EarlyPayToggleViewState onStart$lambda$1$lambda$0(EarlyPayEnrollment earlyPayEnrollment, EarlyPayToggleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EarlyPayToggleViewState.copy$default(applyMutation, true, false, null, earlyPayEnrollment, null, 22, null);
    }

    public final void onEarlyPayEnrollmentChanged(final boolean enrolled) {
        EventLoggers2.logEarlyPayEnrollmentChange(this.eventLogger, enrolled);
        applyMutation(new Function1() { // from class: com.robinhood.android.earlypay.toggle.ui.EarlyPayToggleDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayToggleDuxo.onEarlyPayEnrollmentChanged$lambda$2(enrolled, (EarlyPayToggleViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EarlyPayToggleViewState onEarlyPayEnrollmentChanged$lambda$2(boolean z, EarlyPayToggleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EarlyPayToggleViewState.copy$default(applyMutation, false, false, Boolean.valueOf(z), null, null, 26, null);
    }

    public final void onEarlyPayEnrollmentChangeConfirmed(final boolean enrolled) {
        applyMutation(new Function1() { // from class: com.robinhood.android.earlypay.toggle.ui.EarlyPayToggleDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayToggleDuxo.onEarlyPayEnrollmentChangeConfirmed$lambda$7(this.f$0, enrolled, (EarlyPayToggleViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EarlyPayToggleViewState onEarlyPayEnrollmentChangeConfirmed$lambda$7(final EarlyPayToggleDuxo earlyPayToggleDuxo, boolean z, EarlyPayToggleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Single singleDoOnDispose = earlyPayToggleDuxo.earlyPayEnrollmentStore.updateEnrollment(z).map(new Function() { // from class: com.robinhood.android.earlypay.toggle.ui.EarlyPayToggleDuxo$onEarlyPayEnrollmentChangeConfirmed$1$1
            @Override // io.reactivex.functions.Function
            public final EarlyPayEnrollment apply(ApiEarlyPayEnrollment p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return EarlyPayEnrollment2.toDbModel(p0);
            }
        }).doOnDispose(new EarlyPayToggleDuxo3(earlyPayToggleDuxo));
        Intrinsics.checkNotNullExpressionValue(singleDoOnDispose, "doOnDispose(...)");
        LifecycleHost.DefaultImpls.bind$default(earlyPayToggleDuxo, singleDoOnDispose, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.earlypay.toggle.ui.EarlyPayToggleDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayToggleDuxo.onEarlyPayEnrollmentChangeConfirmed$lambda$7$lambda$4(this.f$0, (EarlyPayEnrollment) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.earlypay.toggle.ui.EarlyPayToggleDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayToggleDuxo.onEarlyPayEnrollmentChangeConfirmed$lambda$7$lambda$6(this.f$0, (Throwable) obj);
            }
        });
        return EarlyPayToggleViewState.copy$default(applyMutation, false, true, Boolean.valueOf(z), null, null, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEarlyPayEnrollmentChangeConfirmed$lambda$7$lambda$4(EarlyPayToggleDuxo earlyPayToggleDuxo, final EarlyPayEnrollment earlyPayEnrollment) {
        earlyPayToggleDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.earlypay.toggle.ui.EarlyPayToggleDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayToggleDuxo.onEarlyPayEnrollmentChangeConfirmed$lambda$7$lambda$4$lambda$3(earlyPayEnrollment, (EarlyPayToggleViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EarlyPayToggleViewState onEarlyPayEnrollmentChangeConfirmed$lambda$7$lambda$4$lambda$3(EarlyPayEnrollment earlyPayEnrollment, EarlyPayToggleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EarlyPayToggleViewState.copy$default(applyMutation, true, false, null, earlyPayEnrollment, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEarlyPayEnrollmentChangeConfirmed$lambda$7$lambda$6(EarlyPayToggleDuxo earlyPayToggleDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        earlyPayToggleDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.earlypay.toggle.ui.EarlyPayToggleDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayToggleDuxo.onEarlyPayEnrollmentChangeConfirmed$lambda$7$lambda$6$lambda$5(throwable, (EarlyPayToggleViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EarlyPayToggleViewState onEarlyPayEnrollmentChangeConfirmed$lambda$7$lambda$6$lambda$5(Throwable th, EarlyPayToggleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EarlyPayToggleViewState.copy$default(applyMutation, true, false, null, null, new UiEvent(th), 8, null);
    }

    public final void onEarlyPayEnrollmentChangeDismissed() {
        applyMutation(new Function1() { // from class: com.robinhood.android.earlypay.toggle.ui.EarlyPayToggleDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayToggleDuxo.onEarlyPayEnrollmentChangeDismissed$lambda$8((EarlyPayToggleViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EarlyPayToggleViewState onEarlyPayEnrollmentChangeDismissed$lambda$8(EarlyPayToggleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EarlyPayToggleViewState.copy$default(applyMutation, true, false, null, null, null, 26, null);
    }
}
