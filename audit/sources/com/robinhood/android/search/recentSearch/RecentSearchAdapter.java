package com.robinhood.android.search.recentSearch;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.search.C27909R;
import com.robinhood.models.p320db.recentSearch.RecentSearch;
import com.robinhood.rosetta.converters.engagement.RecentSearchItem2;
import com.robinhood.rosetta.eventlogging.Article;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.DirectDepositContext;
import com.robinhood.rosetta.eventlogging.DirectDepositSwitcherContext;
import com.robinhood.rosetta.eventlogging.EducationHome;
import com.robinhood.rosetta.eventlogging.EducationSeries;
import com.robinhood.rosetta.eventlogging.EducationTour;
import com.robinhood.rosetta.eventlogging.EducationTourOutro;
import com.robinhood.rosetta.eventlogging.EducationTourOutroTooltip;
import com.robinhood.rosetta.eventlogging.EducationTourSection;
import com.robinhood.rosetta.eventlogging.Feedback;
import com.robinhood.rosetta.eventlogging.FundingContext;
import com.robinhood.rosetta.eventlogging.IAVContext;
import com.robinhood.rosetta.eventlogging.InAppComm;
import com.robinhood.rosetta.eventlogging.InAppSurvey;
import com.robinhood.rosetta.eventlogging.LearningAnswer;
import com.robinhood.rosetta.eventlogging.LearningLesson;
import com.robinhood.rosetta.eventlogging.LearningMatchingExercise;
import com.robinhood.rosetta.eventlogging.LearningMatchingExerciseBucket;
import com.robinhood.rosetta.eventlogging.LearningMatchingExerciseEntity;
import com.robinhood.rosetta.eventlogging.LearningSection;
import com.robinhood.rosetta.eventlogging.List;
import com.robinhood.rosetta.eventlogging.ListsContext;
import com.robinhood.rosetta.eventlogging.MAXTransferAccountSelectionContext;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.NetworkContext;
import com.robinhood.rosetta.eventlogging.NewsFeedItem;
import com.robinhood.rosetta.eventlogging.OrderKind;
import com.robinhood.rosetta.eventlogging.PlaidEventData;
import com.robinhood.rosetta.eventlogging.QueuedDepositContext;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.RewardContext;
import com.robinhood.rosetta.eventlogging.SafetyLabelInfoTag;
import com.robinhood.rosetta.eventlogging.SafetyLabelLesson;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.SearchResultItem;
import com.robinhood.rosetta.eventlogging.TransactionDisputeContext;
import com.robinhood.rosetta.eventlogging.TransferContext;
import com.robinhood.rosetta.eventlogging.URLComponents;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecentSearchAdapter.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/search/recentSearch/RecentSearchAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/models/db/recentSearch/RecentSearch;", "Lcom/robinhood/android/common/util/SimpleViewHolder;", "callbacks", "Lcom/robinhood/android/search/recentSearch/RecentSearchAdapter$Callbacks;", "<init>", "(Lcom/robinhood/android/search/recentSearch/RecentSearchAdapter$Callbacks;)V", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "bindHeader", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/models/db/recentSearch/RecentSearch$RecentSearchHeader;", "Callbacks", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RecentSearchAdapter extends ListAdapter<RecentSearch, SimpleViewHolder> {
    public static final int $stable = 8;
    private final Callbacks callbacks;

    /* compiled from: RecentSearchAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/search/recentSearch/RecentSearchAdapter$Callbacks;", "", "onRecentSearchClicked", "", "recentSearch", "Lcom/robinhood/models/db/recentSearch/RecentSearch$RecentSearchResult;", "onRecentSearchDeleted", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onRecentSearchClicked(RecentSearch.RecentSearchResult recentSearch);

        void onRecentSearchDeleted(RecentSearch.RecentSearchResult recentSearch);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentSearchAdapter(Callbacks callbacks) {
        super(DiffCallbacks.Equality.INSTANCE);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.callbacks = callbacks;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        RecentSearch item = getItem(position);
        if (item instanceof RecentSearch.RecentSearchResult) {
            return 1;
        }
        if (item instanceof RecentSearch.RecentSearchHeader) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(C27909R.layout.include_search_header_view, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new SimpleViewHolder(viewInflate);
        }
        if (viewType == 1) {
            RecentSearchRowView recentSearchRowViewInflate = RecentSearchRowView.INSTANCE.inflate(parent);
            recentSearchRowViewInflate.setCallbacks(this.callbacks);
            return new SimpleViewHolder(recentSearchRowViewInflate);
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
        throw new ExceptionsH();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        RecentSearch item = getItem(position);
        if (item instanceof RecentSearch.RecentSearchResult) {
            RecentSearch.RecentSearchResult recentSearchResult = (RecentSearch.RecentSearchResult) item;
            int i = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Context.ProductTag productTag = null;
            int i2 = 0;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            Screen screen = null;
            String str8 = null;
            Asset asset = null;
            List list = null;
            NewsFeedItem newsFeedItem = null;
            Feedback feedback = null;
            CXIssue cXIssue = null;
            InAppSurvey inAppSurvey = null;
            ListsContext listsContext = null;
            DirectDepositContext directDepositContext = null;
            DirectDepositSwitcherContext directDepositSwitcherContext = null;
            RecurringContext recurringContext = null;
            OrderKind orderKind = null;
            InAppComm inAppComm = null;
            LearningLesson learningLesson = null;
            LearningSection learningSection = null;
            LearningMatchingExercise learningMatchingExercise = null;
            LearningAnswer learningAnswer = null;
            LearningMatchingExerciseEntity learningMatchingExerciseEntity = null;
            LearningMatchingExerciseBucket learningMatchingExerciseBucket = null;
            SafetyLabelInfoTag safetyLabelInfoTag = null;
            SafetyLabelLesson safetyLabelLesson = null;
            String str9 = null;
            EducationTour educationTour = null;
            EducationTourSection educationTourSection = null;
            EducationTourOutroTooltip educationTourOutroTooltip = null;
            EducationTourOutro educationTourOutro = null;
            EducationSeries educationSeries = null;
            EducationHome educationHome = null;
            FundingContext fundingContext = null;
            URLComponents uRLComponents = null;
            Article article = null;
            TransactionDisputeContext transactionDisputeContext = null;
            NetworkContext networkContext = null;
            PlaidEventData plaidEventData = null;
            IAVContext iAVContext = null;
            TransferContext transferContext = null;
            MAXTransferContext mAXTransferContext = null;
            MAXTransferAccountSelectionContext mAXTransferAccountSelectionContext = null;
            QueuedDepositContext queuedDepositContext = null;
            RewardContext rewardContext = null;
            Context context = new Context(position + 1, getSize(), i, str, str2, str3, str4, productTag, i2, str5, str6, str7, screen, str8, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str9, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, new SearchResultItem(recentSearchResult.getId(), RecentSearchItem2.getSearchResultItemType(recentSearchResult.getItem()), recentSearchResult.getDisplayTitle(), null, 8, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4, -2097153, -1, -1, -1, -1, 16383, null);
            View view = holder.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.search.recentSearch.RecentSearchRowView");
            ((RecentSearchRowView) view).bind(recentSearchResult, context);
            return;
        }
        if (!(item instanceof RecentSearch.RecentSearchHeader)) {
            throw new NoWhenBranchMatchedException();
        }
        bindHeader(holder, (RecentSearch.RecentSearchHeader) item);
    }

    private final void bindHeader(SimpleViewHolder holder, RecentSearch.RecentSearchHeader item) {
        View view = holder.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.designsystem.text.RhTextView");
        RhTextView rhTextView = (RhTextView) view;
        rhTextView.setText(rhTextView.getResources().getString(item.getDisplayTitle()));
    }
}
