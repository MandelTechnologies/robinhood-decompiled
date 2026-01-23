package com.robinhood.android.shareholderexperience.questionlist;

import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.shareholderexperience.questionlist.QuestionListItem;
import kotlin.Metadata;

/* compiled from: QuestionListView.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0004J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001H&¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListView;", "T", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem;", "C", "", "bind", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "callbacks", "(Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem;Ljava/lang/Object;)V", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface QuestionListView<T extends QuestionListItem, C> {
    void bind(T item, C callbacks);
}
