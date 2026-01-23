package com.robinhood.android.common.p088ui;

import android.content.Context;
import android.util.AttributeSet;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InboxBadgeStore;
import com.robinhood.models.p320db.InboxBadge;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.ViewsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TopNavInboxButtonView.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0014R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/ui/TopNavInboxButtonView;", "Lcom/robinhood/android/common/ui/view/TopNavButtonView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "inboxBadgeStore", "Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;", "getInboxBadgeStore", "()Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;", "setInboxBadgeStore", "(Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;)V", "onAttachedToWindow", "", "Companion", "lib-common-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class TopNavInboxButtonView extends Hammer_TopNavInboxButtonView {
    public ExperimentsStore experimentsStore;
    public InboxBadgeStore inboxBadgeStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int TAG_STRING_RES = C11048R.string.top_nav_inbox_button_tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopNavInboxButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        setTag(ViewsKt.getString(this, TAG_STRING_RES));
        setImageResource(C20690R.drawable.ic_rds_notification_24dp);
        setContentDescription(ViewsKt.getString(this, C11048R.string.top_nav_notifications_button_description));
        com.robinhood.android.autoeventlogging.ViewsKt.setLoggingConfig(this, new AutoLoggingConfig(false, false, 2, null));
        com.robinhood.android.autoeventlogging.ViewsKt.eventData$default(this, false, new Function0() { // from class: com.robinhood.android.common.ui.TopNavInboxButtonView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TopNavInboxButtonView._init_$lambda$0();
            }
        }, 1, null);
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    public final InboxBadgeStore getInboxBadgeStore() {
        InboxBadgeStore inboxBadgeStore = this.inboxBadgeStore;
        if (inboxBadgeStore != null) {
            return inboxBadgeStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("inboxBadgeStore");
        return null;
    }

    public final void setInboxBadgeStore(InboxBadgeStore inboxBadgeStore) {
        Intrinsics.checkNotNullParameter(inboxBadgeStore, "<set-?>");
        this.inboxBadgeStore = inboxBadgeStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor _init_$lambda$0() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.VIEW_INBOX, null, new Component(Component.ComponentType.BUTTON, "top_nav-inbox", null, 4, null), null, 43, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InboxBadge latestBadgeResult = getInboxBadgeStore().getLatestBadgeResult();
        if (latestBadgeResult != null) {
            maybeShowBadge(latestBadgeResult.getResult(), latestBadgeResult.getShouldCriticalBadge());
        }
    }

    /* compiled from: TopNavInboxButtonView.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/ui/TopNavInboxButtonView$Companion;", "", "<init>", "()V", "TAG_STRING_RES", "", "getTAG_STRING_RES", "()I", "lib-common-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getTAG_STRING_RES() {
            return TopNavInboxButtonView.TAG_STRING_RES;
        }
    }
}
