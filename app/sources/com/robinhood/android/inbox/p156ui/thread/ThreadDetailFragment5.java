package com.robinhood.android.inbox.p156ui.thread;

import com.robinhood.android.inbox.p156ui.thread.ThreadDetailViewState4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ThreadDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"messageId", "", "Lcom/robinhood/android/inbox/ui/thread/ViewType;", "getMessageId", "(Lcom/robinhood/android/inbox/ui/thread/ViewType;)Ljava/lang/String;", "messageConfigId", "getMessageConfigId", "internalAction", "Lcom/robinhood/android/inbox/ui/thread/InternalAction;", "getInternalAction", "(Lcom/robinhood/android/inbox/ui/thread/ViewType;)Lcom/robinhood/android/inbox/ui/thread/InternalAction;", "externalAction", "Lcom/robinhood/android/inbox/ui/thread/ExternalAction;", "getExternalAction", "(Lcom/robinhood/android/inbox/ui/thread/ViewType;)Lcom/robinhood/android/inbox/ui/thread/ExternalAction;", "feature-inbox_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.inbox.ui.thread.ThreadDetailFragmentKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class ThreadDetailFragment5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String getMessageId(ThreadDetailViewState4 threadDetailViewState4) {
        if (threadDetailViewState4 instanceof ThreadDetailViewState4.Text) {
            return ((ThreadDetailViewState4.Text) threadDetailViewState4).getMessageId();
        }
        if (threadDetailViewState4 instanceof ThreadDetailViewState4.Metadata) {
            return ((ThreadDetailViewState4.Metadata) threadDetailViewState4).getMessageId();
        }
        if (threadDetailViewState4 instanceof ThreadDetailViewState4.Response) {
            return ((ThreadDetailViewState4.Response) threadDetailViewState4).getMessageId();
        }
        if ((threadDetailViewState4 instanceof ThreadDetailViewState4.Timestamp) || (threadDetailViewState4 instanceof ThreadDetailViewState4.Date) || (threadDetailViewState4 instanceof ThreadDetailViewState4.ProgressBar)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getMessageConfigId(ThreadDetailViewState4 threadDetailViewState4) {
        if (threadDetailViewState4 instanceof ThreadDetailViewState4.Text) {
            return ((ThreadDetailViewState4.Text) threadDetailViewState4).getMessageConfigId();
        }
        if (threadDetailViewState4 instanceof ThreadDetailViewState4.Metadata) {
            return ((ThreadDetailViewState4.Metadata) threadDetailViewState4).getMessageConfigId();
        }
        if ((threadDetailViewState4 instanceof ThreadDetailViewState4.Response) || (threadDetailViewState4 instanceof ThreadDetailViewState4.Timestamp) || (threadDetailViewState4 instanceof ThreadDetailViewState4.Date) || (threadDetailViewState4 instanceof ThreadDetailViewState4.ProgressBar)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternalAction getInternalAction(ThreadDetailViewState4 threadDetailViewState4) {
        if (threadDetailViewState4 instanceof ThreadDetailViewState4.Text) {
            return ((ThreadDetailViewState4.Text) threadDetailViewState4).getInternalAction();
        }
        if (threadDetailViewState4 instanceof ThreadDetailViewState4.Metadata) {
            return ((ThreadDetailViewState4.Metadata) threadDetailViewState4).getInternalAction();
        }
        if ((threadDetailViewState4 instanceof ThreadDetailViewState4.Response) || (threadDetailViewState4 instanceof ThreadDetailViewState4.Timestamp) || (threadDetailViewState4 instanceof ThreadDetailViewState4.Date) || (threadDetailViewState4 instanceof ThreadDetailViewState4.ProgressBar)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExternalAction getExternalAction(ThreadDetailViewState4 threadDetailViewState4) {
        if (threadDetailViewState4 instanceof ThreadDetailViewState4.Text) {
            return ((ThreadDetailViewState4.Text) threadDetailViewState4).getExternalAction();
        }
        if (threadDetailViewState4 instanceof ThreadDetailViewState4.Metadata) {
            return ((ThreadDetailViewState4.Metadata) threadDetailViewState4).getExternalAction();
        }
        if ((threadDetailViewState4 instanceof ThreadDetailViewState4.Response) || (threadDetailViewState4 instanceof ThreadDetailViewState4.Timestamp) || (threadDetailViewState4 instanceof ThreadDetailViewState4.Date) || (threadDetailViewState4 instanceof ThreadDetailViewState4.ProgressBar)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
