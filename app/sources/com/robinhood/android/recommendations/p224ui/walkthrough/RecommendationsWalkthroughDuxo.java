package com.robinhood.android.recommendations.p224ui.walkthrough;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.recommendations.p224ui.walkthrough.PortfolioBlocksDrawable;
import com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Lists4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecommendationsWalkthroughDuxo.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "startFlow", "", "nextPage", "prevPage", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecommendationsWalkthroughDuxo extends OldBaseDuxo<RecommendationsWalkthroughViewState> implements HasSavedState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendationsWalkthroughDuxo(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        List<RecommendationsWalkthroughPage> pages = ((RecommendationsWalkthroughFragment.Args) companion.getArgs(savedStateHandle)).getPages();
        List<PortfolioBlocksDrawable.Block> portfolioBlocks = ((RecommendationsWalkthroughFragment.Args) companion.getArgs(savedStateHandle)).getPortfolioBlocks();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(portfolioBlocks, 10));
        Iterator<T> it = portfolioBlocks.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((PortfolioBlocksDrawable.Block) it.next()).getWeight()));
        }
        super(new RecommendationsWalkthroughViewState(pages, null, null, null, null, null, false, 0, 0, arrayList, 510, null), null, 2, 0 == true ? 1 : 0);
        this.savedStateHandle = savedStateHandle;
    }

    public final void startFlow() {
        applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsWalkthroughDuxo.startFlow$lambda$0(this.f$0, (RecommendationsWalkthroughViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsWalkthroughViewState startFlow$lambda$0(RecommendationsWalkthroughDuxo recommendationsWalkthroughDuxo, RecommendationsWalkthroughViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecommendationsWalkthroughViewState.copy$default(applyMutation, null, ((RecommendationsWalkthroughFragment.Args) INSTANCE.getArgs((HasSavedState) recommendationsWalkthroughDuxo)).getPages().get(0), null, null, null, null, false, 0, 0, null, 1021, null);
    }

    public final void nextPage() {
        applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsWalkthroughDuxo.nextPage$lambda$1(this.f$0, (RecommendationsWalkthroughViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsWalkthroughViewState nextPage$lambda$1(RecommendationsWalkthroughDuxo recommendationsWalkthroughDuxo, RecommendationsWalkthroughViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        RecommendationsWalkthroughPage recommendationsWalkthroughPage = (RecommendationsWalkthroughPage) Lists4.getItemAfter(((RecommendationsWalkthroughFragment.Args) INSTANCE.getArgs((HasSavedState) recommendationsWalkthroughDuxo)).getPages(), applyMutation.getCurrentPage());
        if (recommendationsWalkthroughPage != null) {
            Unit unit = Unit.INSTANCE;
            return RecommendationsWalkthroughViewState.copy$default(applyMutation, null, recommendationsWalkthroughPage, null, null, new UiEvent(unit), new UiEvent(unit), false, recommendationsWalkthroughPage.getStartFrame(), recommendationsWalkthroughPage.getEndFrame(), null, 525, null);
        }
        return RecommendationsWalkthroughViewState.copy$default(applyMutation, null, null, null, new UiEvent(Unit.INSTANCE), null, null, false, 0, 0, null, 1015, null);
    }

    public final void prevPage() {
        applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsWalkthroughDuxo.prevPage$lambda$2(this.f$0, (RecommendationsWalkthroughViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsWalkthroughViewState prevPage$lambda$2(RecommendationsWalkthroughDuxo recommendationsWalkthroughDuxo, RecommendationsWalkthroughViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        RecommendationsWalkthroughPage currentPage = applyMutation.getCurrentPage();
        Companion companion = INSTANCE;
        if (Intrinsics.areEqual(currentPage, CollectionsKt.last((List) ((RecommendationsWalkthroughFragment.Args) companion.getArgs((HasSavedState) recommendationsWalkthroughDuxo)).getPages()))) {
            return RecommendationsWalkthroughViewState.copy$default(applyMutation, null, null, null, null, null, null, false, 0, 0, null, 1023, null);
        }
        RecommendationsWalkthroughPage recommendationsWalkthroughPage = (RecommendationsWalkthroughPage) Lists4.getItemBefore(((RecommendationsWalkthroughFragment.Args) companion.getArgs((HasSavedState) recommendationsWalkthroughDuxo)).getPages(), applyMutation.getCurrentPage());
        if (recommendationsWalkthroughPage != null) {
            Unit unit = Unit.INSTANCE;
            return RecommendationsWalkthroughViewState.copy$default(applyMutation, null, recommendationsWalkthroughPage, null, null, new UiEvent(unit), new UiEvent(unit), true, recommendationsWalkthroughPage.getStartFrame(), recommendationsWalkthroughPage.getEndFrame(), null, 525, null);
        }
        return RecommendationsWalkthroughViewState.copy$default(applyMutation, null, null, new UiEvent(Unit.INSTANCE), null, null, null, false, 0, 0, null, 1019, null);
    }

    /* compiled from: RecommendationsWalkthroughDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughDuxo;", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughFragment$Args;", "<init>", "()V", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RecommendationsWalkthroughDuxo, RecommendationsWalkthroughFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecommendationsWalkthroughFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RecommendationsWalkthroughFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecommendationsWalkthroughFragment.Args getArgs(RecommendationsWalkthroughDuxo recommendationsWalkthroughDuxo) {
            return (RecommendationsWalkthroughFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, recommendationsWalkthroughDuxo);
        }
    }
}
