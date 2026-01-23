package com.robinhood.android.psp;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.psp.ShowPspDetailOnLaunchPref;
import com.robinhood.android.psp.ProgramDetailFragment;
import com.robinhood.android.psp.ProgramDetailViewState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.PspStore;
import com.robinhood.models.api.bonfire.ApiPspEnrollmentResponse;
import com.robinhood.models.p320db.bonfire.ProgramDetail;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProgramDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001dB#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0011J\u0006\u0010\u001c\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/psp/ProgramDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "pspStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PspStore;", "showPspDetailOnLaunchPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/PspStore;Lcom/robinhood/prefs/StringToBooleanMapPreference;Landroidx/lifecycle/SavedStateHandle;)V", "getShowPspDetailOnLaunchPref", "()Lcom/robinhood/prefs/StringToBooleanMapPreference;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "setHoldDownProgress", "holdDownProgress", "", "isDown", "", "advanceAnimation", "enrollProgram", "programId", "Ljava/util/UUID;", "setAnimationLoaded", "markFooterAnimationShown", "Companion", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ProgramDetailDuxo extends OldBaseDuxo<ProgramDetailViewState> implements HasSavedState {
    private final PspStore pspStore;
    private final SavedStateHandle savedStateHandle;
    private final StringToBooleanMapPreference showPspDetailOnLaunchPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final StringToBooleanMapPreference getShowPspDetailOnLaunchPref() {
        return this.showPspDetailOnLaunchPref;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProgramDetailDuxo(PspStore pspStore, @ShowPspDetailOnLaunchPref StringToBooleanMapPreference showPspDetailOnLaunchPref, SavedStateHandle savedStateHandle) {
        super(new ProgramDetailViewState(null, null, null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(pspStore, "pspStore");
        Intrinsics.checkNotNullParameter(showPspDetailOnLaunchPref, "showPspDetailOnLaunchPref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.pspStore = pspStore;
        this.showPspDetailOnLaunchPref = showPspDetailOnLaunchPref;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        StringToBooleanMapPreference stringToBooleanMapPreference = this.showPspDetailOnLaunchPref;
        Map<String, Boolean> values = stringToBooleanMapPreference.getValues();
        Companion companion = INSTANCE;
        stringToBooleanMapPreference.setValues(MapsKt.plus(values, Tuples4.m3642to(((ProgramDetailFragment.Args) companion.getArgs((HasSavedState) this)).getProgramId().toString(), Boolean.FALSE)));
        LifecycleHost.DefaultImpls.bind$default(this, this.pspStore.streamProgramDetail(((ProgramDetailFragment.Args) companion.getArgs((HasSavedState) this)).getProgramId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.psp.ProgramDetailDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProgramDetailDuxo.onCreate$lambda$1(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(ProgramDetailDuxo programDetailDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        final ProgramDetail programDetail = (ProgramDetail) optional.component1();
        if (programDetail != null) {
            programDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.psp.ProgramDetailDuxo$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProgramDetailDuxo.onCreate$lambda$1$lambda$0(programDetail, (ProgramDetailViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgramDetailViewState onCreate$lambda$1$lambda$0(ProgramDetail programDetail, ProgramDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProgramDetailViewState.copy$default(applyMutation, null, null, new ProgramDetailViewState.Result.Success(programDetail), new UiEvent(Unit.INSTANCE), null, false, false, 115, null);
    }

    public final void setHoldDownProgress(final float holdDownProgress, final boolean isDown) {
        applyMutation(new Function1() { // from class: com.robinhood.android.psp.ProgramDetailDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProgramDetailDuxo.setHoldDownProgress$lambda$2(holdDownProgress, isDown, (ProgramDetailViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgramDetailViewState setHoldDownProgress$lambda$2(float f, boolean z, ProgramDetailViewState applyMutation) {
        ProgramDetailViewState.AnimationSegment userInteractionSegment;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (f == 0.0f && !z) {
            userInteractionSegment = applyMutation.getEntryLoopSegment();
        } else {
            userInteractionSegment = applyMutation.getUserInteractionSegment();
        }
        return ProgramDetailViewState.copy$default(applyMutation, Float.valueOf(f), userInteractionSegment, null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
    }

    public final void advanceAnimation() {
        applyMutation(new Function1() { // from class: com.robinhood.android.psp.ProgramDetailDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProgramDetailDuxo.advanceAnimation$lambda$3((ProgramDetailViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgramDetailViewState advanceAnimation$lambda$3(ProgramDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProgramDetailViewState.copy$default(applyMutation, null, applyMutation.nextAnimationSegment(), null, null, null, false, false, 125, null);
    }

    public final void enrollProgram(final UUID programId) {
        Intrinsics.checkNotNullParameter(programId, "programId");
        applyMutation(new Function1() { // from class: com.robinhood.android.psp.ProgramDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProgramDetailDuxo.enrollProgram$lambda$4((ProgramDetailViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.pspStore.enrollProgram(programId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.psp.ProgramDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProgramDetailDuxo.enrollProgram$lambda$6(this.f$0, programId, (ApiPspEnrollmentResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.psp.ProgramDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProgramDetailDuxo.enrollProgram$lambda$8(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgramDetailViewState enrollProgram$lambda$4(ProgramDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProgramDetailViewState.copy$default(applyMutation, null, null, null, null, new UiEvent(ProgramDetailViewState.EnrollmentResult.Loading.INSTANCE), false, false, 111, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enrollProgram$lambda$6(ProgramDetailDuxo programDetailDuxo, final UUID uuid, final ApiPspEnrollmentResponse enrollmentResponse) {
        Intrinsics.checkNotNullParameter(enrollmentResponse, "enrollmentResponse");
        programDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.psp.ProgramDetailDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProgramDetailDuxo.enrollProgram$lambda$6$lambda$5(uuid, enrollmentResponse, (ProgramDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgramDetailViewState enrollProgram$lambda$6$lambda$5(UUID uuid, ApiPspEnrollmentResponse apiPspEnrollmentResponse, ProgramDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProgramDetailViewState.copy$default(applyMutation, null, null, null, null, new UiEvent(new ProgramDetailViewState.EnrollmentResult.Success(uuid, apiPspEnrollmentResponse)), false, false, 111, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enrollProgram$lambda$8(ProgramDetailDuxo programDetailDuxo, final Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        programDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.psp.ProgramDetailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProgramDetailDuxo.enrollProgram$lambda$8$lambda$7(it, (ProgramDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgramDetailViewState enrollProgram$lambda$8$lambda$7(Throwable th, ProgramDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProgramDetailViewState.copy$default(applyMutation, null, null, null, null, new UiEvent(new ProgramDetailViewState.EnrollmentResult.Error(th)), false, false, 111, null);
    }

    public final void setAnimationLoaded() {
        applyMutation(new Function1() { // from class: com.robinhood.android.psp.ProgramDetailDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProgramDetailDuxo.setAnimationLoaded$lambda$9((ProgramDetailViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgramDetailViewState setAnimationLoaded$lambda$9(ProgramDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProgramDetailViewState.copy$default(applyMutation, null, null, null, null, null, true, false, 95, null);
    }

    public final void markFooterAnimationShown() {
        applyMutation(new Function1() { // from class: com.robinhood.android.psp.ProgramDetailDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProgramDetailDuxo.markFooterAnimationShown$lambda$10((ProgramDetailViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgramDetailViewState markFooterAnimationShown$lambda$10(ProgramDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProgramDetailViewState.copy$default(applyMutation, null, null, null, null, null, false, true, 63, null);
    }

    /* compiled from: ProgramDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/psp/ProgramDetailDuxo;", "Lcom/robinhood/android/psp/ProgramDetailFragment$Args;", "<init>", "()V", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ProgramDetailDuxo, ProgramDetailFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ProgramDetailFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (ProgramDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ProgramDetailFragment.Args getArgs(ProgramDetailDuxo programDetailDuxo) {
            return (ProgramDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, programDetailDuxo);
        }
    }
}
