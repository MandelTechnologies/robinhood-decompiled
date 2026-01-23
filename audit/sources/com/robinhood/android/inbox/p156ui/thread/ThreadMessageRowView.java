package com.robinhood.android.inbox.p156ui.thread;

import android.R;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintSet;
import com.robinhood.android.common.p088ui.AvatarView;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.common.p088ui.RoundedImageView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.inbox.C18721R;
import com.robinhood.android.inbox.p156ui.TextAttributes;
import com.robinhood.android.inbox.p156ui.thread.ThreadDetailViewState4;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.mediaservice.MediaImageLoader;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.models.p320db.MediaMetadata;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ThreadMessageRowView.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 X2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002WXB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u0003H\u0016J\u0010\u0010O\u001a\u00020M2\u0006\u0010N\u001a\u00020\u0003H\u0002J\u0010\u0010P\u001a\u00020M2\u0006\u0010N\u001a\u00020\u0003H\u0002J\u0010\u0010Q\u001a\u00020M2\u0006\u0010N\u001a\u00020\u0003H\u0002J\u0010\u0010R\u001a\u00020M2\u0006\u0010N\u001a\u00020\u0003H\u0002J\u0010\u0010S\u001a\u00020M2\u0006\u0010N\u001a\u00020\u0003H\u0002J\u0010\u0010T\u001a\u00020M2\u0006\u0010N\u001a\u00020\u0003H\u0002J\u0010\u0010U\u001a\u00020M2\u0006\u0010N\u001a\u00020\u0003H\u0002J\u0010\u0010V\u001a\u00020M2\u0006\u0010N\u001a\u00020\u0003H\u0002R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b'\u0010(R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b+\u0010(R\u001b\u0010-\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b/\u00100R\u001b\u00102\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b4\u00105R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010$\u001a\u0004\b8\u00105R\u000e\u0010:\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010;\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010$\u001a\u0004\b<\u00105R\u000e\u0010>\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010?\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010$\u001a\u0004\b@\u00105R\u001b\u0010B\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010$\u001a\u0004\bD\u0010ER\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010$\u001a\u0004\bH\u0010ER\u000e\u0010J\u001a\u00020KX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Y"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadMessageRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/inbox/ui/thread/ViewType$Text;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/inbox/ui/thread/ThreadMessageRowView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/inbox/ui/thread/ThreadMessageRowView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/inbox/ui/thread/ThreadMessageRowView$Callbacks;)V", "mediaImageLoader", "Lcom/robinhood/android/mediaservice/MediaImageLoader;", "getMediaImageLoader", "()Lcom/robinhood/android/mediaservice/MediaImageLoader;", "setMediaImageLoader", "(Lcom/robinhood/android/mediaservice/MediaImageLoader;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "leftConstraintSet", "Landroidx/constraintlayout/widget/ConstraintSet;", "rightConstraintSet", "avatarView", "Lcom/robinhood/android/common/ui/AvatarView;", "getAvatarView", "()Lcom/robinhood/android/common/ui/AvatarView;", "avatarView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "avatarLayout", "Landroid/view/ViewGroup;", "getAvatarLayout", "()Landroid/view/ViewGroup;", "avatarLayout$delegate", "messageContainer", "getMessageContainer", "messageContainer$delegate", "messageImg", "Lcom/robinhood/android/common/ui/RoundedImageView;", "getMessageImg", "()Lcom/robinhood/android/common/ui/RoundedImageView;", "messageImg$delegate", "messageTxt", "Landroid/widget/TextView;", "getMessageTxt", "()Landroid/widget/TextView;", "messageTxt$delegate", "internalActionTxt", "getInternalActionTxt", "internalActionTxt$delegate", "externalActionContainer", "externalActionTxt", "getExternalActionTxt", "externalActionTxt$delegate", "externalActionUrlTxt", "messageStatusTxt", "getMessageStatusTxt", "messageStatusTxt$delegate", "errorImg", "Landroid/view/View;", "getErrorImg", "()Landroid/view/View;", "errorImg$delegate", "resendingView", "getResendingView", "resendingView$delegate", "imageCornerRadius", "", "bind", "", "state", "bindMessageText", "bindMessageContainer", "bindInternalAction", "bindExternalAction", "bindMessageImage", "bindAvatar", "bindMessageStatus", "bindRetry", "Callbacks", "Companion", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class ThreadMessageRowView extends Hammer_ThreadMessageRowView implements Bindable<ThreadDetailViewState4.Text> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ThreadMessageRowView.class, "avatarView", "getAvatarView()Lcom/robinhood/android/common/ui/AvatarView;", 0)), Reflection.property1(new PropertyReference1Impl(ThreadMessageRowView.class, "avatarLayout", "getAvatarLayout()Landroid/view/ViewGroup;", 0)), Reflection.property1(new PropertyReference1Impl(ThreadMessageRowView.class, "messageContainer", "getMessageContainer()Landroid/view/ViewGroup;", 0)), Reflection.property1(new PropertyReference1Impl(ThreadMessageRowView.class, "messageImg", "getMessageImg()Lcom/robinhood/android/common/ui/RoundedImageView;", 0)), Reflection.property1(new PropertyReference1Impl(ThreadMessageRowView.class, "messageTxt", "getMessageTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(ThreadMessageRowView.class, "internalActionTxt", "getInternalActionTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(ThreadMessageRowView.class, "externalActionTxt", "getExternalActionTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(ThreadMessageRowView.class, "messageStatusTxt", "getMessageStatusTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(ThreadMessageRowView.class, "errorImg", "getErrorImg()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(ThreadMessageRowView.class, "resendingView", "getResendingView()Landroid/view/View;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: avatarLayout$delegate, reason: from kotlin metadata */
    private final Interfaces2 avatarLayout;

    /* renamed from: avatarView$delegate, reason: from kotlin metadata */
    private final Interfaces2 avatarView;
    private Callbacks callbacks;

    /* renamed from: errorImg$delegate, reason: from kotlin metadata */
    private final Interfaces2 errorImg;
    private final ViewGroup externalActionContainer;

    /* renamed from: externalActionTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 externalActionTxt;
    private final TextView externalActionUrlTxt;
    private final float imageCornerRadius;

    /* renamed from: internalActionTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 internalActionTxt;
    private final ConstraintSet leftConstraintSet;
    public MediaImageLoader mediaImageLoader;

    /* renamed from: messageContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 messageContainer;

    /* renamed from: messageImg$delegate, reason: from kotlin metadata */
    private final Interfaces2 messageImg;

    /* renamed from: messageStatusTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 messageStatusTxt;

    /* renamed from: messageTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 messageTxt;
    public Navigator navigator;

    /* renamed from: resendingView$delegate, reason: from kotlin metadata */
    private final Interfaces2 resendingView;
    private final ConstraintSet rightConstraintSet;

    /* compiled from: ThreadMessageRowView.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadMessageRowView$Callbacks;", "", "onExternalActionClick", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/inbox/ui/thread/ViewType$Text;", "onInternalActionClick", "onRetryClick", "localMessageId", "Ljava/util/UUID;", "onAvatarClicked", "onImageClick", "mediaMetadata", "Lcom/robinhood/models/db/MediaMetadata;", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAvatarClicked(ThreadDetailViewState4.Text item);

        void onExternalActionClick(ThreadDetailViewState4.Text item);

        void onImageClick(MediaMetadata mediaMetadata);

        void onInternalActionClick(ThreadDetailViewState4.Text item);

        void onRetryClick(UUID localMessageId);
    }

    /* compiled from: ThreadMessageRowView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThreadDetailViewState4.Text.LocalMessageStatus.values().length];
            try {
                iArr[ThreadDetailViewState4.Text.LocalMessageStatus.SENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThreadDetailViewState4.Text.LocalMessageStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThreadDetailViewState4.Text.LocalMessageStatus.RESENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ ThreadMessageRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadMessageRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ConstraintSet constraintSet = new ConstraintSet();
        this.leftConstraintSet = constraintSet;
        ConstraintSet constraintSet2 = new ConstraintSet();
        this.rightConstraintSet = constraintSet2;
        ViewGroups.inflate(this, C18721R.layout.merge_thread_message_row_view, true);
        constraintSet.clone(this);
        constraintSet2.clone(context, C18721R.layout.merge_thread_message_row_view_right);
        constraintSet2.setGoneMargin(C18721R.id.inbox_thread_message_container, 7, ViewsKt.getDimensionPixelSize(this, C13997R.dimen.rds_spacing_medium));
        this.avatarView = BindViewDelegate2.bindView$default(this, C18721R.id.inbox_thread_message_avatar_view, null, 2, null);
        this.avatarLayout = BindViewDelegate2.bindView$default(this, C18721R.id.inbox_thread_message_avatar_layout, null, 2, null);
        this.messageContainer = BindViewDelegate2.bindView$default(this, C18721R.id.inbox_thread_message_container, null, 2, null);
        this.messageImg = BindViewDelegate2.bindView$default(this, C18721R.id.inbox_thread_message_img, null, 2, null);
        this.messageTxt = BindViewDelegate2.bindView$default(this, C18721R.id.inbox_thread_message_text_txt, null, 2, null);
        this.internalActionTxt = BindViewDelegate2.bindView$default(this, C18721R.id.inbox_thread_internal_action_txt, null, 2, null);
        View viewFindViewById = findViewById(C18721R.id.inbox_thread_external_action_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.externalActionContainer = (ViewGroup) viewFindViewById;
        this.externalActionTxt = BindViewDelegate2.bindView$default(this, C18721R.id.inbox_thread_external_action_txt, null, 2, null);
        View viewFindViewById2 = findViewById(C18721R.id.inbox_thread_external_action_url_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.externalActionUrlTxt = (TextView) viewFindViewById2;
        this.messageStatusTxt = BindViewDelegate2.bindView$default(this, C18721R.id.inbox_thread_message_text_status_txt, null, 2, null);
        this.errorImg = BindViewDelegate2.bindView$default(this, C18721R.id.inbox_thread_message_error_img, null, 2, null);
        this.resendingView = BindViewDelegate2.bindView$default(this, C18721R.id.inbox_thread_message_resending_view, null, 2, null);
        this.imageCornerRadius = ViewsKt.getDimension(this, C18721R.dimen.inbox_thread_message_corner_radius);
        getMessageImg().setClipToOutline(true);
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    public final MediaImageLoader getMediaImageLoader() {
        MediaImageLoader mediaImageLoader = this.mediaImageLoader;
        if (mediaImageLoader != null) {
            return mediaImageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mediaImageLoader");
        return null;
    }

    public final void setMediaImageLoader(MediaImageLoader mediaImageLoader) {
        Intrinsics.checkNotNullParameter(mediaImageLoader, "<set-?>");
        this.mediaImageLoader = mediaImageLoader;
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    private final AvatarView getAvatarView() {
        return (AvatarView) this.avatarView.getValue(this, $$delegatedProperties[0]);
    }

    private final ViewGroup getAvatarLayout() {
        return (ViewGroup) this.avatarLayout.getValue(this, $$delegatedProperties[1]);
    }

    private final ViewGroup getMessageContainer() {
        return (ViewGroup) this.messageContainer.getValue(this, $$delegatedProperties[2]);
    }

    private final RoundedImageView getMessageImg() {
        return (RoundedImageView) this.messageImg.getValue(this, $$delegatedProperties[3]);
    }

    private final TextView getMessageTxt() {
        return (TextView) this.messageTxt.getValue(this, $$delegatedProperties[4]);
    }

    private final TextView getInternalActionTxt() {
        return (TextView) this.internalActionTxt.getValue(this, $$delegatedProperties[5]);
    }

    private final TextView getExternalActionTxt() {
        return (TextView) this.externalActionTxt.getValue(this, $$delegatedProperties[6]);
    }

    private final TextView getMessageStatusTxt() {
        return (TextView) this.messageStatusTxt.getValue(this, $$delegatedProperties[7]);
    }

    private final View getErrorImg() {
        return (View) this.errorImg.getValue(this, $$delegatedProperties[8]);
    }

    private final View getResendingView() {
        return (View) this.resendingView.getValue(this, $$delegatedProperties[9]);
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(ThreadDetailViewState4.Text state) {
        int dimensionPixelSize;
        Intrinsics.checkNotNullParameter(state, "state");
        ConstraintSet constraintSet = new ConstraintSet();
        if (state.getFromUser()) {
            constraintSet.clone(this.rightConstraintSet);
            if (state.getShowRetry() || state.getShowResending()) {
                dimensionPixelSize = ViewsKt.getDimensionPixelSize(this, C18721R.dimen.inbox_thread_message_user_with_error_start_margin);
            } else {
                dimensionPixelSize = ViewsKt.getDimensionPixelSize(this, C18721R.dimen.inbox_thread_message_user_start_margin);
            }
            constraintSet.setMargin(C18721R.id.inbox_thread_message_container, 6, dimensionPixelSize);
            ViewGroup messageContainer = getMessageContainer();
            ThemeAttributes themeAttributes = ThemeAttributes.INSTANCE;
            ScarletManager2.overrideAttribute(messageContainer, R.attr.backgroundTint, themeAttributes.getCOLOR_POSITIVE());
            ScarletManager2.overrideAttribute(getMessageTxt(), R.attr.textColor, themeAttributes.getCOLOR_BACKGROUND_1());
            TextView messageTxt = getMessageTxt();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            messageTxt.setLinkTextColor(ThemeColors.getThemeColor(context, C20690R.attr.colorBackground1));
        } else {
            constraintSet.clone(this.leftConstraintSet);
            ViewGroup messageContainer2 = getMessageContainer();
            ThemeAttributes themeAttributes2 = ThemeAttributes.INSTANCE;
            ScarletManager2.overrideAttribute(messageContainer2, R.attr.backgroundTint, themeAttributes2.getCOLOR_BACKGROUND_2());
            ScarletManager2.overrideAttribute(getMessageTxt(), R.attr.textColor, themeAttributes2.getTEXT_COLOR_PRIMARY());
            TextView messageTxt2 = getMessageTxt();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            messageTxt2.setLinkTextColor(ThemeColors.getThemeColor(context2, C20690R.attr.colorPrimary));
        }
        bindMessageText(state);
        bindMessageContainer(state);
        bindInternalAction(state);
        bindExternalAction(state);
        bindMessageImage(state);
        bindAvatar(state);
        bindMessageStatus(state);
        bindRetry(state);
        getResendingView().setVisibility(state.getShowResending() ? 0 : 8);
        if (state.getInternalAction() != null || state.getExternalAction() != null || state.getMediaMetadata() != null) {
            constraintSet.constrainWidth(C18721R.id.inbox_thread_message_container, 0);
        } else {
            constraintSet.constrainWidth(C18721R.id.inbox_thread_message_container, -2);
        }
        int i = state.getShowAvatar() ? 0 : 4;
        int i2 = state.getShowStatusMessage() ? 0 : 8;
        int i3 = (state.getShowRetry() || state.getShowResending()) ? 0 : 8;
        constraintSet.setVisibility(C18721R.id.inbox_thread_message_avatar_layout, i);
        constraintSet.setVisibility(C18721R.id.inbox_thread_message_avatar_view, i);
        constraintSet.setVisibility(C18721R.id.inbox_thread_message_text_status_txt, i2);
        constraintSet.setVisibility(C18721R.id.inbox_thread_message_status_container, i3);
        constraintSet.applyTo(this);
    }

    private final void bindMessageText(ThreadDetailViewState4.Text state) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SpannableString spannableStringTextAsSpannableString = TextAttributes.textAsSpannableString(state, context);
        getMessageTxt().setVisibility(spannableStringTextAsSpannableString != null ? 0 : 8);
        getMessageTxt().setText(spannableStringTextAsSpannableString);
    }

    private final void bindMessageContainer(final ThreadDetailViewState4.Text state) {
        int i;
        if (state.getFromUser() && state.getLatest()) {
            i = C18721R.drawable.inbox_message_background_right_latest;
        } else if (!state.getFromUser() || state.getLatest()) {
            i = (state.getFromUser() || !state.getLatest()) ? C18721R.drawable.inbox_message_background_left : C18721R.drawable.inbox_message_background_left_latest;
        } else {
            i = C18721R.drawable.inbox_message_background_right;
        }
        getMessageContainer().setBackgroundResource(i);
        if (state.getShowRetry()) {
            OnClickListeners.onClick(getMessageContainer(), new Function0() { // from class: com.robinhood.android.inbox.ui.thread.ThreadMessageRowView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ThreadMessageRowView.bindMessageContainer$lambda$0(this.f$0, state);
                }
            });
        } else {
            getMessageContainer().setOnClickListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindMessageContainer$lambda$0(ThreadMessageRowView threadMessageRowView, ThreadDetailViewState4.Text text) {
        Callbacks callbacks = threadMessageRowView.callbacks;
        if (callbacks != null) {
            UUID localMessageId = text.getLocalMessageId();
            Intrinsics.checkNotNull(localMessageId);
            callbacks.onRetryClick(localMessageId);
        }
        return Unit.INSTANCE;
    }

    private final void bindInternalAction(final ThreadDetailViewState4.Text state) {
        InternalAction internalAction = state.getInternalAction();
        getInternalActionTxt().setVisibility(internalAction != null ? 0 : 8);
        getInternalActionTxt().setText(internalAction != null ? internalAction.getText() : null);
        if (getInternalActionTxt().getVisibility() == 0) {
            OnClickListeners.onClick(getInternalActionTxt(), new Function0() { // from class: com.robinhood.android.inbox.ui.thread.ThreadMessageRowView$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ThreadMessageRowView.bindInternalAction$lambda$1(this.f$0, state);
                }
            });
        } else {
            getInternalActionTxt().setOnClickListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindInternalAction$lambda$1(ThreadMessageRowView threadMessageRowView, ThreadDetailViewState4.Text text) {
        Callbacks callbacks = threadMessageRowView.callbacks;
        if (callbacks != null) {
            callbacks.onInternalActionClick(text);
        }
        return Unit.INSTANCE;
    }

    private final void bindExternalAction(final ThreadDetailViewState4.Text state) {
        this.externalActionContainer.setVisibility(state.getExternalAction() != null ? 0 : 8);
        TextView externalActionTxt = getExternalActionTxt();
        ExternalAction externalAction = state.getExternalAction();
        externalActionTxt.setText(externalAction != null ? externalAction.getText() : null);
        TextView textView = this.externalActionUrlTxt;
        ExternalAction externalAction2 = state.getExternalAction();
        textView.setText(externalAction2 != null ? externalAction2.getSubtitle() : null);
        if (this.externalActionContainer.getVisibility() == 0) {
            getMessageContainer().setAddStatesFromChildren(true);
            OnClickListeners.onClick(this.externalActionContainer, new Function0() { // from class: com.robinhood.android.inbox.ui.thread.ThreadMessageRowView$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ThreadMessageRowView.bindExternalAction$lambda$2(this.f$0, state);
                }
            });
        } else {
            getMessageContainer().setAddStatesFromChildren(false);
            this.externalActionContainer.setOnClickListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindExternalAction$lambda$2(ThreadMessageRowView threadMessageRowView, ThreadDetailViewState4.Text text) {
        Callbacks callbacks = threadMessageRowView.callbacks;
        if (callbacks != null) {
            callbacks.onExternalActionClick(text);
        }
        return Unit.INSTANCE;
    }

    private final void bindMessageImage(final ThreadDetailViewState4.Text state) {
        getMessageImg().setVisibility(state.getMediaMetadata() != null ? 0 : 8);
        if (state.getMediaMetadata() != null) {
            ImageLoader.ImageRequest.DefaultImpls.into$default(getMediaImageLoader().load(state.getMediaMetadata()).fit().centerInside(), getMessageImg(), null, null, 6, null);
            RoundedImageView messageImg = getMessageImg();
            if (state.getLatest()) {
                messageImg.setTopLeftRadius(this.imageCornerRadius);
                messageImg.setTopRightRadius(this.imageCornerRadius);
                if (state.getFromUser()) {
                    messageImg.setBottomLeftRadius(this.imageCornerRadius);
                    messageImg.setBottomRightRadius(0.0f);
                } else {
                    messageImg.setBottomRightRadius(this.imageCornerRadius);
                    messageImg.setBottomLeftRadius(0.0f);
                }
            } else {
                messageImg.setRadius(this.imageCornerRadius);
            }
            OnClickListeners.onClick(getMessageImg(), new Function0() { // from class: com.robinhood.android.inbox.ui.thread.ThreadMessageRowView$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ThreadMessageRowView.bindMessageImage$lambda$4(this.f$0, state);
                }
            });
            return;
        }
        getMediaImageLoader().cancelRequest(getMessageImg());
        getMessageImg().setImageDrawable(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindMessageImage$lambda$4(ThreadMessageRowView threadMessageRowView, ThreadDetailViewState4.Text text) {
        Callbacks callbacks = threadMessageRowView.callbacks;
        if (callbacks != null) {
            callbacks.onImageClick(text.getMediaMetadata());
        }
        return Unit.INSTANCE;
    }

    private final void bindAvatar(final ThreadDetailViewState4.Text state) {
        getAvatarView().bind(state.getAvatarText(), state.getAvatarUrl());
        String entityUrl = state.getEntityUrl();
        Uri uri = entityUrl != null ? Uri.parse(entityUrl) : null;
        if (uri != null && getNavigator().isDeepLinkSupported(uri)) {
            OnClickListeners.onClick(getAvatarLayout(), new Function0() { // from class: com.robinhood.android.inbox.ui.thread.ThreadMessageRowView$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ThreadMessageRowView.bindAvatar$lambda$5(this.f$0, state);
                }
            });
        } else {
            OnClickListeners.onClick(getAvatarLayout(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindAvatar$lambda$5(ThreadMessageRowView threadMessageRowView, ThreadDetailViewState4.Text text) {
        Callbacks callbacks = threadMessageRowView.callbacks;
        if (callbacks != null) {
            callbacks.onAvatarClicked(text);
        }
        return Unit.INSTANCE;
    }

    private final void bindMessageStatus(ThreadDetailViewState4.Text state) {
        String string2;
        TextView messageStatusTxt = getMessageStatusTxt();
        ThreadDetailViewState4.Text.LocalMessageStatus localMessageStatus = state.getLocalMessageStatus();
        int i = localMessageStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[localMessageStatus.ordinal()];
        if (i == -1) {
            string2 = null;
        } else if (i == 1) {
            string2 = ViewsKt.getString(this, C18721R.string.inbox_local_message_sending);
        } else if (i == 2) {
            string2 = ViewsKt.getString(this, C18721R.string.inbox_local_message_failed);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = ViewsKt.getString(this, C18721R.string.inbox_local_message_resending);
        }
        messageStatusTxt.setText(string2);
    }

    private final void bindRetry(final ThreadDetailViewState4.Text state) {
        getErrorImg().setVisibility(state.getShowRetry() ? 0 : 8);
        OnClickListeners.onClick(getErrorImg(), new Function0() { // from class: com.robinhood.android.inbox.ui.thread.ThreadMessageRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThreadMessageRowView.bindRetry$lambda$6(this.f$0, state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindRetry$lambda$6(ThreadMessageRowView threadMessageRowView, ThreadDetailViewState4.Text text) {
        Callbacks callbacks = threadMessageRowView.callbacks;
        if (callbacks != null) {
            UUID localMessageId = text.getLocalMessageId();
            Intrinsics.checkNotNull(localMessageId);
            callbacks.onRetryClick(localMessageId);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: ThreadMessageRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadMessageRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/inbox/ui/thread/ThreadMessageRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<ThreadMessageRowView> {
        private final /* synthetic */ Inflater<ThreadMessageRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public ThreadMessageRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (ThreadMessageRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C18721R.layout.include_thread_message_row_view);
        }
    }
}
