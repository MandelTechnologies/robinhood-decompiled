package com.robinhood.android.recommendations.retirement.p223ui.intro;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.data.store.recommendations.retirement.RecsRetirementIntroStore;
import com.robinhood.android.recommendations.retirement.p223ui.intro.RecsRetirementIntroFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.recommendations.retirement.models.p364ui.UiRecsRetirementIntro;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecsRetirementIntroDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/intro/RecsRetirementIntroDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/recommendations/retirement/ui/intro/RecsRetirementIntroViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "recsRetirementIntroStore", "Lcom/robinhood/android/data/store/recommendations/retirement/RecsRetirementIntroStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/data/store/recommendations/retirement/RecsRetirementIntroStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class RecsRetirementIntroDuxo extends OldBaseDuxo<RecsRetirementIntroViewState> implements HasSavedState {
    private final RecsRetirementIntroStore recsRetirementIntroStore;
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
    public RecsRetirementIntroDuxo(RecsRetirementIntroStore recsRetirementIntroStore, SavedStateHandle savedStateHandle) {
        super(new RecsRetirementIntroViewState(null, null, 3, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(recsRetirementIntroStore, "recsRetirementIntroStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.recsRetirementIntroStore = recsRetirementIntroStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.recsRetirementIntroStore.getIntro(((RecsRetirementIntroFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.intro.RecsRetirementIntroDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecsRetirementIntroDuxo.onStart$lambda$1(this.f$0, (UiRecsRetirementIntro) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.intro.RecsRetirementIntroDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecsRetirementIntroDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RecsRetirementIntroDuxo recsRetirementIntroDuxo, final UiRecsRetirementIntro intro) {
        Intrinsics.checkNotNullParameter(intro, "intro");
        recsRetirementIntroDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.intro.RecsRetirementIntroDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecsRetirementIntroDuxo.onStart$lambda$1$lambda$0(intro, (RecsRetirementIntroViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecsRetirementIntroViewState onStart$lambda$1$lambda$0(UiRecsRetirementIntro uiRecsRetirementIntro, RecsRetirementIntroViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecsRetirementIntroViewState.copy$default(applyMutation, uiRecsRetirementIntro, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(RecsRetirementIntroDuxo recsRetirementIntroDuxo, final Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        recsRetirementIntroDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.intro.RecsRetirementIntroDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecsRetirementIntroDuxo.onStart$lambda$3$lambda$2(t, (RecsRetirementIntroViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecsRetirementIntroViewState onStart$lambda$3$lambda$2(Throwable th, RecsRetirementIntroViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecsRetirementIntroViewState.copy$default(applyMutation, null, new UiEvent(th), 1, null);
    }

    /* compiled from: RecsRetirementIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/intro/RecsRetirementIntroDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/recommendations/retirement/ui/intro/RecsRetirementIntroDuxo;", "Lcom/robinhood/android/recommendations/retirement/ui/intro/RecsRetirementIntroFragment$Args;", "<init>", "()V", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RecsRetirementIntroDuxo, RecsRetirementIntroFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecsRetirementIntroFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RecsRetirementIntroFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecsRetirementIntroFragment.Args getArgs(RecsRetirementIntroDuxo recsRetirementIntroDuxo) {
            return (RecsRetirementIntroFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, recsRetirementIntroDuxo);
        }
    }
}
