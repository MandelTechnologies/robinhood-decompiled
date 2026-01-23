package com.robinhood.shared.support.supportchat;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.models.p355ui.pathfinder.messaging.ChatMode;
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.DirectDepositContext;
import com.robinhood.rosetta.eventlogging.InAppSurvey;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.shared.support.supportchat.databinding.MergeSupportChatThreadRowViewBinding;
import com.robinhood.time.android.format.RelativeTimeFormatter;
import com.robinhood.utils.datetime.PeriodDurations;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import org.threeten.extra.PeriodDuration;
import p479j$.time.LocalDate;
import p479j$.time.ZoneOffset;

/* compiled from: SupportChatThreadRowView.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/support/supportchat/SupportChatThreadRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "constraintSet", "Landroidx/constraintlayout/widget/ConstraintSet;", "inboxConstraintSet", "binding", "Lcom/robinhood/shared/support/supportchat/databinding/MergeSupportChatThreadRowViewBinding;", "getBinding", "()Lcom/robinhood/shared/support/supportchat/databinding/MergeSupportChatThreadRowViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/shared/support/supportchat/ChatListItem;", "bindUnreadBadge", "bindAlertBadge", "bindTitle", "bindSubtitle", "bindAvatar", "bindTimestamp", "Companion", "lib-support-chat_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class SupportChatThreadRowView extends ConstraintLayout {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final ConstraintSet constraintSet;
    private final ConstraintSet inboxConstraintSet;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SupportChatThreadRowView.class, "binding", "getBinding()Lcom/robinhood/shared/support/supportchat/databinding/MergeSupportChatThreadRowViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ SupportChatThreadRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportChatThreadRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ConstraintSet constraintSet = new ConstraintSet();
        this.constraintSet = constraintSet;
        ConstraintSet constraintSet2 = new ConstraintSet();
        this.inboxConstraintSet = constraintSet2;
        ViewGroups.inflate(this, C40042R.layout.merge_support_chat_thread_row_view, true);
        constraintSet.clone(this);
        constraintSet2.clone(context, C40042R.layout.merge_support_chat_thread_row_view_inbox);
        this.binding = ViewBinding5.viewBinding(this, SupportChatThreadRowView2.INSTANCE);
    }

    private final MergeSupportChatThreadRowViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeSupportChatThreadRowViewBinding) value;
    }

    public final void bind(final ChatListItem data) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.getDisplayAsInboxRow()) {
            this.inboxConstraintSet.applyTo(this);
        } else {
            this.constraintSet.applyTo(this);
        }
        bindUnreadBadge(data);
        bindAlertBadge(data);
        bindTitle(data);
        bindSubtitle(data);
        bindAvatar(data);
        bindTimestamp(data);
        ViewsKt.eventData$default(this, false, new Function0() { // from class: com.robinhood.shared.support.supportchat.SupportChatThreadRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SupportChatThreadRowView.bind$lambda$0(data);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bind$lambda$0(ChatListItem chatListItem) {
        UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_CX_CHAT_THREAD;
        Component component = new Component(Component.ComponentType.ROW, null, null, 6, null);
        String string2 = chatListItem.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        InAppSurvey inAppSurvey = null;
        DirectDepositContext directDepositContext = null;
        RecurringContext recurringContext = null;
        return new UserInteractionEventDescriptor(null, null, action, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new CXIssue(null, null, null, null, null, null, null, null, null, 0, null, string2, null, null, null, null, null, 0, null, false, null, false, null, 8386559, null), inAppSurvey, null, directDepositContext, null, recurringContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), component, null, 35, null);
    }

    private final void bindUnreadBadge(ChatListItem data) {
        ThemedResourceReference<ColorStateList> color_negative;
        if (data.getDisplayAsInboxRow()) {
            color_negative = ThemeAttributes.INSTANCE.getCOLOR_POSITIVE();
        } else {
            color_negative = ThemeAttributes.INSTANCE.getCOLOR_NEGATIVE();
        }
        View view = getBinding().supportChatUnreadBadge;
        Intrinsics.checkNotNull(view);
        ScarletManager2.overrideAttribute(view, android.R.attr.backgroundTint, color_negative);
        view.setVisibility(data.getHasUnreadMessage() ? 0 : 8);
    }

    private final void bindAlertBadge(ChatListItem data) {
        ImageView supportChatThreadRowAlertBadge = getBinding().supportChatThreadRowAlertBadge;
        Intrinsics.checkNotNullExpressionValue(supportChatThreadRowAlertBadge, "supportChatThreadRowAlertBadge");
        supportChatThreadRowAlertBadge.setVisibility(data.getDisplayAsInboxRow() && data.getHasUnreadMessage() ? 0 : 8);
    }

    private final void bindTitle(ChatListItem data) {
        int i;
        if (data.getHasUnreadMessage()) {
            i = C20690R.attr.textAppearanceRegularMediumBold;
        } else {
            i = C20690R.attr.textAppearanceRegularMedium;
        }
        RhTextView rhTextView = getBinding().supportChatThreadRowTitleText;
        Intrinsics.checkNotNull(rhTextView);
        TextViewsKt.setTextAppearanceAttr(rhTextView, i);
        StringResource chatTitle = data.getChatTitle();
        Resources resources = rhTextView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(chatTitle.getText(resources));
    }

    private final void bindSubtitle(ChatListItem data) throws Resources.NotFoundException {
        int i;
        ThemedResourceReference<Integer> color_foreground_2;
        CharSequence text;
        if (data.getHasUnreadMessage()) {
            i = C20690R.attr.textAppearanceRegularSmallBold;
        } else {
            i = C20690R.attr.textAppearanceRegularSmall;
        }
        if (data.getHasUnreadMessage()) {
            color_foreground_2 = ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_1();
        } else {
            color_foreground_2 = ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_2();
        }
        RhTextView rhTextView = getBinding().supportChatThreadRowSubtitleText;
        Intrinsics.checkNotNull(rhTextView);
        TextViewsKt.setTextAppearanceAttr(rhTextView, i);
        ScarletManager2.overrideAttribute(rhTextView, android.R.attr.textColor, color_foreground_2);
        StringResource chatPreview = data.getChatPreview();
        if (chatPreview != null) {
            Resources resources = rhTextView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = chatPreview.getText(resources);
        } else {
            text = null;
        }
        rhTextView.setText(text);
        rhTextView.setVisibility(data.getChatPreview() != null ? 0 : 4);
    }

    private final void bindAvatar(ChatListItem data) {
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3;
        ChatMode chatMode = data.getChatMode();
        if (chatMode instanceof ChatMode.ChatbotChat) {
            serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.ROBINHOOD;
        } else {
            if (!(chatMode instanceof ChatMode.AgentChat.SalesforceChat) && !(chatMode instanceof ChatMode.AgentChat.TwilioChat)) {
                throw new NoWhenBranchMatchedException();
            }
            serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.AGENT;
        }
        getBinding().supportChatThreadRowAvatar.setPictogram(com.robinhood.utils.extensions.ViewsKt.getDrawable(this, serverToBentoAssetMapper3.getResourceId()));
        getBinding().supportChatThreadRowAvatarSliver.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(data.getChatAvatarColor())));
    }

    private final void bindTimestamp(ChatListItem data) {
        int i;
        ThemedResourceReference<Integer> color_foreground_2;
        if (data.getDisplayAsInboxRow()) {
            RhTextView supportChatThreadRowTimestampText = getBinding().supportChatThreadRowTimestampText;
            Intrinsics.checkNotNullExpressionValue(supportChatThreadRowTimestampText, "supportChatThreadRowTimestampText");
            supportChatThreadRowTimestampText.setVisibility(8);
            return;
        }
        RhTextView supportChatThreadRowTimestampText2 = getBinding().supportChatThreadRowTimestampText;
        Intrinsics.checkNotNullExpressionValue(supportChatThreadRowTimestampText2, "supportChatThreadRowTimestampText");
        supportChatThreadRowTimestampText2.setVisibility(0);
        if (data.getHasUnreadMessage()) {
            i = C20690R.attr.textAppearanceRegularSmallBold;
        } else {
            i = C20690R.attr.textAppearanceRegularSmall;
        }
        if (data.getHasUnreadMessage()) {
            color_foreground_2 = ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_1();
        } else {
            color_foreground_2 = ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_2();
        }
        PeriodDuration periodDurationSince = PeriodDurations.since(data.getUpdated());
        RhTextView rhTextView = getBinding().supportChatThreadRowTimestampText;
        Intrinsics.checkNotNull(rhTextView);
        TextViewsKt.setTextAppearanceAttr(rhTextView, i);
        ScarletManager2.overrideAttribute(rhTextView, android.R.attr.textColor, color_foreground_2);
        LocalDate localDateMo3459a = data.getUpdated().atZone(ZoneOffset.UTC).mo3459a();
        Resources resources = rhTextView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Intrinsics.checkNotNull(localDateMo3459a);
        rhTextView.setText(RelativeTimeFormatter.formatNarrow(resources, periodDurationSince, localDateMo3459a));
        Resources resources2 = rhTextView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rhTextView.setContentDescription(RelativeTimeFormatter.formatWide(resources2, periodDurationSince, localDateMo3459a));
    }

    /* compiled from: SupportChatThreadRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/support/supportchat/SupportChatThreadRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/shared/support/supportchat/SupportChatThreadRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-support-chat_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SupportChatThreadRowView> {
        private final /* synthetic */ Inflater<SupportChatThreadRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SupportChatThreadRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SupportChatThreadRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C40042R.layout.include_support_chat_thread_row_view);
        }
    }
}
