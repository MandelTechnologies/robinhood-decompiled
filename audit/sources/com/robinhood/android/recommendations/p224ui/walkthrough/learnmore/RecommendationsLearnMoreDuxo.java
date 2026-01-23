package com.robinhood.android.recommendations.p224ui.walkthrough.learnmore;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.recommendations.p224ui.walkthrough.learnmore.RecommendationsLearnMoreDialogFragment;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.EtpDetailsStore;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsLearnMoreStore;
import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.recommendations.models.p362db.RecommendationsLearnMore;
import io.reactivex.rxkotlin.Observables;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsLearnMoreDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0012B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/RecommendationsLearnMoreDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/RecommendationsLearnMoreViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "learnMoreStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsLearnMoreStore;", "etpDetailsStore", "Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsLearnMoreStore;Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class RecommendationsLearnMoreDuxo extends BaseDuxo4<RecommendationsLearnMoreViewState> implements HasSavedState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final EtpDetailsStore etpDetailsStore;
    private final RecommendationsLearnMoreStore learnMoreStore;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RecommendationsLearnMoreDuxo(RecommendationsLearnMoreStore learnMoreStore, EtpDetailsStore etpDetailsStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(learnMoreStore, "learnMoreStore");
        Intrinsics.checkNotNullParameter(etpDetailsStore, "etpDetailsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new RecommendationsLearnMoreViewState(((RecommendationsLearnMoreDialogFragment.Args) companion.getArgs(savedStateHandle)).getInstrumentId(), ((RecommendationsLearnMoreDialogFragment.Args) companion.getArgs(savedStateHandle)).getEntryPoint(), null, null, ((RecommendationsLearnMoreDialogFragment.Args) companion.getArgs(savedStateHandle)).getWeight(), 12, null), duxoBundle);
        this.learnMoreStore = learnMoreStore;
        this.etpDetailsStore = etpDetailsStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Observables observables = Observables.INSTANCE;
        RecommendationsLearnMoreStore recommendationsLearnMoreStore = this.learnMoreStore;
        Companion companion = INSTANCE;
        LifecycleHost.DefaultImpls.bind$default(this, observables.combineLatest(recommendationsLearnMoreStore.streamLearnMore(((RecommendationsLearnMoreDialogFragment.Args) companion.getArgs((HasSavedState) this)).getInstrumentId(), ((RecommendationsLearnMoreDialogFragment.Args) companion.getArgs((HasSavedState) this)).getEntryPoint()), this.etpDetailsStore.getStreamEtpDetails().asObservable(((RecommendationsLearnMoreDialogFragment.Args) companion.getArgs((HasSavedState) this)).getInstrumentId())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.ui.walkthrough.learnmore.RecommendationsLearnMoreDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsLearnMoreDuxo.onStart$lambda$0(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(RecommendationsLearnMoreDuxo recommendationsLearnMoreDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        recommendationsLearnMoreDuxo.applyMutation(new RecommendationsLearnMoreDuxo2((RecommendationsLearnMore) tuples2.component1(), (EtpDetails) tuples2.component2(), null));
        return Unit.INSTANCE;
    }

    /* compiled from: RecommendationsLearnMoreDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/RecommendationsLearnMoreDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/RecommendationsLearnMoreDuxo;", "Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/RecommendationsLearnMoreDialogFragment$Args;", "<init>", "()V", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RecommendationsLearnMoreDuxo, RecommendationsLearnMoreDialogFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecommendationsLearnMoreDialogFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RecommendationsLearnMoreDialogFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecommendationsLearnMoreDialogFragment.Args getArgs(RecommendationsLearnMoreDuxo recommendationsLearnMoreDuxo) {
            return (RecommendationsLearnMoreDialogFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, recommendationsLearnMoreDuxo);
        }
    }
}
