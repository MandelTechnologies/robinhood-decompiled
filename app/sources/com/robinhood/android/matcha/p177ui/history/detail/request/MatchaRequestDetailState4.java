package com.robinhood.android.matcha.p177ui.history.detail.request;

import android.content.Context;
import android.content.res.Resources;
import com.robinhood.models.p320db.matcha.MatchaRequest;
import com.robinhood.p2p.common.ProfileAvatarState;
import com.robinhood.p2p.common.ProfileAvatars;
import com.robinhood.utils.datetime.format.InstantFormatter2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaRequestDetailState.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u0014H&J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0001\u0002\u001f ¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/request/RequestState;", "", "request", "Lcom/robinhood/models/db/matcha/MatchaRequest;", "<init>", "(Lcom/robinhood/models/db/matcha/MatchaRequest;)V", "getRequest", "()Lcom/robinhood/models/db/matcha/MatchaRequest;", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "primaryAction", "Lcom/robinhood/android/matcha/ui/history/detail/request/RequestState$ButtonAction;", "getPrimaryAction", "()Lcom/robinhood/android/matcha/ui/history/detail/request/RequestState$ButtonAction;", "secondaryAction", "getSecondaryAction", "getSummaryText", "context", "Landroid/content/Context;", "profileAvatarState", "Lcom/robinhood/p2p/common/ProfileAvatarState;", "getProfileAvatarState", "()Lcom/robinhood/p2p/common/ProfileAvatarState;", "getSubtitle", "", "resources", "Landroid/content/res/Resources;", "Action", "ButtonAction", "Lcom/robinhood/android/matcha/ui/history/detail/request/Receiver;", "Lcom/robinhood/android/matcha/ui/history/detail/request/Sender;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.history.detail.request.RequestState, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class MatchaRequestDetailState4 {
    public static final int $stable = 8;
    private final MatchaRequest request;

    public /* synthetic */ MatchaRequestDetailState4(MatchaRequest matchaRequest, DefaultConstructorMarker defaultConstructorMarker) {
        this(matchaRequest);
    }

    public abstract ButtonAction getPrimaryAction();

    public abstract ButtonAction getSecondaryAction();

    public abstract StringResource getSummaryText(Context context);

    public abstract StringResource getTitle();

    private MatchaRequestDetailState4(MatchaRequest matchaRequest) {
        this.request = matchaRequest;
    }

    public final MatchaRequest getRequest() {
        return this.request;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MatchaRequestDetailState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/request/RequestState$Action;", "", "<init>", "(Ljava/lang/String;I)V", "ACCEPT", "DECLINE", "CANCEL", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.history.detail.request.RequestState$Action */
    public static final class Action {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action ACCEPT = new Action("ACCEPT", 0);
        public static final Action DECLINE = new Action("DECLINE", 1);
        public static final Action CANCEL = new Action("CANCEL", 2);

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{ACCEPT, DECLINE, CANCEL};
        }

        public static EnumEntries<Action> getEntries() {
            return $ENTRIES;
        }

        private Action(String str, int i) {
        }

        static {
            Action[] actionArr$values = $values();
            $VALUES = actionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(actionArr$values);
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    /* compiled from: MatchaRequestDetailState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/request/RequestState$ButtonAction;", "", "action", "Lcom/robinhood/android/matcha/ui/history/detail/request/RequestState$Action;", "text", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/android/matcha/ui/history/detail/request/RequestState$Action;Lcom/robinhood/utils/resource/StringResource;)V", "getAction", "()Lcom/robinhood/android/matcha/ui/history/detail/request/RequestState$Action;", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.history.detail.request.RequestState$ButtonAction, reason: from toString */
    public static final /* data */ class ButtonAction {
        public static final int $stable = StringResource.$stable;
        private final Action action;
        private final StringResource text;

        public static /* synthetic */ ButtonAction copy$default(ButtonAction buttonAction, Action action, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                action = buttonAction.action;
            }
            if ((i & 2) != 0) {
                stringResource = buttonAction.text;
            }
            return buttonAction.copy(action, stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getText() {
            return this.text;
        }

        public final ButtonAction copy(Action action, StringResource text) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(text, "text");
            return new ButtonAction(action, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonAction)) {
                return false;
            }
            ButtonAction buttonAction = (ButtonAction) other;
            return this.action == buttonAction.action && Intrinsics.areEqual(this.text, buttonAction.text);
        }

        public int hashCode() {
            return (this.action.hashCode() * 31) + this.text.hashCode();
        }

        public String toString() {
            return "ButtonAction(action=" + this.action + ", text=" + this.text + ")";
        }

        public ButtonAction(Action action, StringResource text) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(text, "text");
            this.action = action;
            this.text = text;
        }

        public final Action getAction() {
            return this.action;
        }

        public final StringResource getText() {
            return this.text;
        }
    }

    public final ProfileAvatarState getProfileAvatarState() {
        return ProfileAvatars.getAvatar(this.request.getTransactor());
    }

    public final String getSubtitle(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return InstantFormatter2.formatRecent(this.request.getCreatedAt(), resources);
    }
}
