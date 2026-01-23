package com.robinhood.shared.support.supportchat.extensions;

import android.net.Uri;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.models.api.p306v2.ActionType;
import com.robinhood.models.supportchat.api.ApiSupportChatAction2;
import com.robinhood.models.supportchat.p353db.SupportChatAction;
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatAction;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.logging.CrashReporter;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: SupportChatActions.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0002*\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¨\u0006\n"}, m3636d2 = {"toEventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatAction;", "inquiryId", "Ljava/util/UUID;", "messageId", "", "toUiChatAction", "Lcom/robinhood/models/supportchat/db/SupportChatAction;", "localId", "lib-support-chat_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.support.supportchat.extensions.SupportChatActionsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class SupportChatActions {

    /* compiled from: SupportChatActions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.support.supportchat.extensions.SupportChatActionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiSupportChatAction2.values().length];
            try {
                iArr[ApiSupportChatAction2.END_CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiSupportChatAction2.RESUME_CHAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final UserInteractionEventDescriptor toEventDescriptor(UiChatAction uiChatAction, UUID uuid, String str) {
        UserInteractionEventData.Action action;
        String serverValue;
        Uri uri;
        Intrinsics.checkNotNullParameter(uiChatAction, "<this>");
        boolean z = uiChatAction instanceof UiChatAction.ResumeChat;
        if (z || (uiChatAction instanceof UiChatAction.EndChat)) {
            action = UserInteractionEventData.Action.CHAT_ACTION;
        } else if ((uiChatAction instanceof UiChatAction.Escalate) || (uiChatAction instanceof UiChatAction.Cta)) {
            action = UserInteractionEventData.Action.CHATBOT_ACTION;
        } else {
            if (!(uiChatAction instanceof UiChatAction.Deeplink)) {
                throw new NoWhenBranchMatchedException();
            }
            action = UserInteractionEventData.Action.VIEW_DEEPLINK;
        }
        UserInteractionEventData.Action action2 = action;
        String host = null;
        if (z) {
            serverValue = ApiSupportChatAction2.RESUME_CHAT.getServerValue();
        } else if (uiChatAction instanceof UiChatAction.EndChat) {
            serverValue = ApiSupportChatAction2.END_CHAT.getServerValue();
        } else if (uiChatAction instanceof UiChatAction.Escalate) {
            serverValue = ActionType.ESCALATE.getServerValue();
        } else {
            if (!(uiChatAction instanceof UiChatAction.Cta) && !(uiChatAction instanceof UiChatAction.Deeplink)) {
                throw new NoWhenBranchMatchedException();
            }
            serverValue = null;
        }
        String stringOrEmpty = Uuids.toStringOrEmpty(uuid);
        String str2 = str == null ? "not available" : str;
        UiChatAction.Deeplink deeplink = uiChatAction instanceof UiChatAction.Deeplink ? (UiChatAction.Deeplink) uiChatAction : null;
        if (deeplink != null && (uri = deeplink.getUri()) != null) {
            host = uri.getHost();
        }
        return new UserInteractionEventDescriptor(null, null, action2, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new CXIssue(stringOrEmpty, null, null, null, null, null, null, host == null ? "" : host, null, 0, null, null, serverValue == null ? "" : serverValue, null, null, str2, null, 0, null, false, null, false, null, 8351614, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), null, null, 51, null);
    }

    public static /* synthetic */ UiChatAction toUiChatAction$default(SupportChatAction supportChatAction, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return toUiChatAction(supportChatAction, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final UiChatAction toUiChatAction(SupportChatAction supportChatAction, String str) {
        Uri uri;
        Uri deeplink;
        Intrinsics.checkNotNullParameter(supportChatAction, "<this>");
        boolean z = supportChatAction instanceof SupportChatAction.Deeplink;
        if (!z && !(supportChatAction instanceof SupportChatAction.UnifiedDeeplink)) {
            if (!(supportChatAction instanceof SupportChatAction.ChatAction)) {
                throw new NoWhenBranchMatchedException();
            }
            SupportChatAction.ChatAction chatAction = (SupportChatAction.ChatAction) supportChatAction;
            int i = WhenMappings.$EnumSwitchMapping$0[chatAction.getAction().getAction().ordinal()];
            if (i == 1) {
                return new UiChatAction.EndChat(str, chatAction.getTitle(), null, chatAction.getIcon(), null, true, false, chatAction.getAction().getIssueId());
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return new UiChatAction.ResumeChat(str, chatAction.getTitle(), null, chatAction.getIcon(), null, true, false, chatAction.getAction().getIssueId());
        }
        if (z) {
            deeplink = ((SupportChatAction.Deeplink) supportChatAction).getAction().getDeeplink();
        } else {
            if (!(supportChatAction instanceof SupportChatAction.UnifiedDeeplink)) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Throwable("Deeplink uri is not provided for the action " + Reflection.getOrCreateKotlinClass(supportChatAction.getClass()).getSimpleName()), false, null, 6, null);
                uri = null;
                if (uri == null) {
                    return new UiChatAction.Deeplink(str, supportChatAction.getTitle(), null, supportChatAction.getIcon(), null, true, false, uri);
                }
                return null;
            }
            deeplink = ((SupportChatAction.UnifiedDeeplink) supportChatAction).getAction().getDeeplink();
        }
        uri = deeplink;
        if (uri == null) {
        }
    }
}
