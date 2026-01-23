package com.robinhood.android.inbox.p156ui.messages;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.inbox.p156ui.messages.ThreadRowView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreadListFragment.kt */
@Metadata(m3635d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001e\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0014J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m3636d2 = {"com/robinhood/android/inbox/ui/messages/ThreadListFragment$inboxThreadAdapter$1", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/inbox/ui/messages/ThreadRowView;", "Lcom/robinhood/android/inbox/ui/messages/MessageThread;", "onBindViewHolder", "", "holder", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "getItem", "position", "", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListFragment$inboxThreadAdapter$1, reason: use source file name */
/* loaded from: classes10.dex */
public final class ThreadListFragment3 extends GenericListAdapter<ThreadRowView, MessageThread> {
    final /* synthetic */ ThreadListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThreadListFragment3(ThreadListFragment threadListFragment, ThreadRowView.Companion companion, DiffUtil.ItemCallback<MessageThread> itemCallback) {
        super(companion, itemCallback);
        this.this$0 = threadListFragment;
    }

    @Override // com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(GenericViewHolder genericViewHolder, MessageThread messageThread) {
        onBindViewHolder2((GenericViewHolder<ThreadRowView>) genericViewHolder, messageThread);
    }

    /* renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
    protected void onBindViewHolder2(GenericViewHolder<ThreadRowView> holder, final MessageThread item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = holder.getView();
        final ThreadListFragment threadListFragment = this.this$0;
        final ThreadRowView threadRowView = (ThreadRowView) view;
        threadRowView.bind(item);
        OnClickListeners.onClick(threadRowView, new Function0() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment$inboxThreadAdapter$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThreadListFragment3.onBindViewHolder$lambda$2$lambda$0(threadListFragment, item, threadRowView);
            }
        });
        OnClickListeners.onLongClick(threadRowView, new Function1() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment$inboxThreadAdapter$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ThreadListFragment3.onBindViewHolder$lambda$2$lambda$1(threadListFragment, item, (View) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$2$lambda$0(ThreadListFragment threadListFragment, MessageThread messageThread, ThreadRowView threadRowView) {
        if (threadListFragment.isInSelectionMode) {
            threadListFragment.getDuxo().toggleThreadSelection(messageThread.getId());
        } else {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(threadListFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_THREADS_LIST, messageThread.getId(), threadListFragment.getAnalyticsThreadState(messageThread), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
            threadListFragment.getDuxo().markThreadsAsRead(CollectionsKt.listOf(messageThread.getId()));
            Navigator navigator = threadListFragment.getNavigator();
            Context context = threadRowView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, context, new LegacyFragmentKey.InboxThreadDetail(messageThread.getId()), false, false, false, null, false, null, false, false, null, null, 4092, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$2$lambda$1(ThreadListFragment threadListFragment, MessageThread messageThread, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        threadListFragment.getDuxo().toggleThreadSelection(messageThread.getId());
        return true;
    }

    @Override // com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter, androidx.recyclerview.widget.ListAdapter
    public MessageThread getItem(int position) {
        return (MessageThread) super.getItem(position);
    }
}
