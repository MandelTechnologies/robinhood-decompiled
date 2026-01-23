package com.robinhood.android.rollover401k.steps;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.models.retirement.p194db.Retirement401kRolloverViewModel;
import com.robinhood.android.rollover401k.Rollover401kContent;
import com.robinhood.android.rollover401k.Rollover401kGenericFragment;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Rollover401kQuestionsFragment.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/Rollover401kQuestionsFragment;", "Lcom/robinhood/android/rollover401k/Rollover401kGenericFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getContentData", "Lcom/robinhood/android/rollover401k/Rollover401kContent;", "viewModels", "Lcom/robinhood/android/models/retirement/db/Retirement401kRolloverViewModel$RolloverViewModels;", "Companion", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class Rollover401kQuestionsFragment extends Rollover401kGenericFragment {
    private final Screen eventScreen = new Screen(Screen.Name.RETIREMENT_401K_ROLLOVER_QUESTIONS, null, null, null, 14, null);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.rollover401k.Rollover401kGenericFragment
    public Rollover401kContent getContentData(Retirement401kRolloverViewModel.RolloverViewModels viewModels) {
        if (viewModels != null) {
            return new Rollover401kContent(viewModels.getQuestionsViewModel().getTitle(), viewModels.getQuestionsViewModel().getContent(), viewModels.getQuestionsViewModel().getFooter());
        }
        return null;
    }

    /* compiled from: Rollover401kQuestionsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/Rollover401kQuestionsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/android/rollover401k/steps/Rollover401kQuestionsFragment;", "<init>", "()V", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<Rollover401kQuestionsFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((Rollover401kQuestionsFragment) fragment);
        }

        public Void getArgs(Rollover401kQuestionsFragment rollover401kQuestionsFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, rollover401kQuestionsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public Rollover401kQuestionsFragment newInstance() {
            return (Rollover401kQuestionsFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public Rollover401kQuestionsFragment newInstance(Void r1) {
            return (Rollover401kQuestionsFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }
}
