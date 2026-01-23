package com.robinhood.android.inbox.p156ui.messages;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.robinhood.android.common.p088ui.AvatarView;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.inbox.C18721R;
import com.robinhood.android.util.style.ThemeAttributes;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.time.android.format.RelativeTimeFormatter;
import com.robinhood.utils.datetime.PeriodDurations;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Lazy;
import kotlin.Metadata;
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

/* compiled from: ThreadRowView.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 42\u00020\u0001:\u00014B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200J\u0010\u00101\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00102\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00103\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0012\u0010\u000bR\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b\u001f\u0010\u0017R\u001b\u0010!\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b\"\u0010\u0017R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b+\u0010'¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/messages/ThreadRowView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "titleTxt", "Landroid/widget/TextView;", "getTitleTxt", "()Landroid/widget/TextView;", "titleTxt$delegate", "Lkotlin/properties/ReadOnlyProperty;", "subtitleTxt", "getSubtitleTxt", "subtitleTxt$delegate", "timeTxt", "getTimeTxt", "timeTxt$delegate", "selectedView", "Landroid/view/View;", "getSelectedView", "()Landroid/view/View;", "selectedView$delegate", "avatarView", "Lcom/robinhood/android/common/ui/AvatarView;", "getAvatarView", "()Lcom/robinhood/android/common/ui/AvatarView;", "avatarView$delegate", "avatarSliverView", "getAvatarSliverView", "avatarSliverView$delegate", "criticalBadgeView", "getCriticalBadgeView", "criticalBadgeView$delegate", "boldTypeface", "Landroid/graphics/Typeface;", "getBoldTypeface", "()Landroid/graphics/Typeface;", "boldTypeface$delegate", "Lkotlin/Lazy;", "regularTypeface", "getRegularTypeface", "regularTypeface$delegate", "bind", "", "thread", "Lcom/robinhood/android/inbox/ui/messages/MessageThread;", "bindAvatar", "bindTimeText", "bindCriticalBadge", "Companion", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class ThreadRowView extends FrameLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ThreadRowView.class, "titleTxt", "getTitleTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(ThreadRowView.class, "subtitleTxt", "getSubtitleTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(ThreadRowView.class, "timeTxt", "getTimeTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(ThreadRowView.class, "selectedView", "getSelectedView()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(ThreadRowView.class, "avatarView", "getAvatarView()Lcom/robinhood/android/common/ui/AvatarView;", 0)), Reflection.property1(new PropertyReference1Impl(ThreadRowView.class, "avatarSliverView", "getAvatarSliverView()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(ThreadRowView.class, "criticalBadgeView", "getCriticalBadgeView()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(ThreadRowView.class, "boldTypeface", "getBoldTypeface()Landroid/graphics/Typeface;", 0)), Reflection.property1(new PropertyReference1Impl(ThreadRowView.class, "regularTypeface", "getRegularTypeface()Landroid/graphics/Typeface;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: avatarSliverView$delegate, reason: from kotlin metadata */
    private final Interfaces2 avatarSliverView;

    /* renamed from: avatarView$delegate, reason: from kotlin metadata */
    private final Interfaces2 avatarView;

    /* renamed from: boldTypeface$delegate, reason: from kotlin metadata */
    private final Lazy boldTypeface;

    /* renamed from: criticalBadgeView$delegate, reason: from kotlin metadata */
    private final Interfaces2 criticalBadgeView;

    /* renamed from: regularTypeface$delegate, reason: from kotlin metadata */
    private final Lazy regularTypeface;

    /* renamed from: selectedView$delegate, reason: from kotlin metadata */
    private final Interfaces2 selectedView;

    /* renamed from: subtitleTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 subtitleTxt;

    /* renamed from: timeTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 timeTxt;

    /* renamed from: titleTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 titleTxt;

    public /* synthetic */ ThreadRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C18721R.layout.merge_thread_row_view, true);
        this.titleTxt = BindViewDelegate2.bindView$default(this, C18721R.id.thread_title_txt, null, 2, null);
        this.subtitleTxt = BindViewDelegate2.bindView$default(this, C18721R.id.thread_subtitle_txt, null, 2, null);
        this.timeTxt = BindViewDelegate2.bindView$default(this, C18721R.id.thread_time_txt, null, 2, null);
        this.selectedView = BindViewDelegate2.bindView$default(this, C18721R.id.thread_selected_view, null, 2, null);
        this.avatarView = BindViewDelegate2.bindView$default(this, C18721R.id.thread_avatar_view, null, 2, null);
        this.avatarSliverView = BindViewDelegate2.bindView$default(this, C18721R.id.thread_avatar_sliver, null, 2, null);
        this.criticalBadgeView = BindViewDelegate2.bindView$default(this, C18721R.id.thread_critical_img, null, 2, null);
        RhTypeface rhTypeface = RhTypeface.BOLD;
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.boldTypeface = rhTypeface.provideDelegate(this, kPropertyArr[7]);
        this.regularTypeface = RhTypeface.REGULAR.provideDelegate(this, kPropertyArr[8]);
    }

    private final TextView getTitleTxt() {
        return (TextView) this.titleTxt.getValue(this, $$delegatedProperties[0]);
    }

    private final TextView getSubtitleTxt() {
        return (TextView) this.subtitleTxt.getValue(this, $$delegatedProperties[1]);
    }

    private final TextView getTimeTxt() {
        return (TextView) this.timeTxt.getValue(this, $$delegatedProperties[2]);
    }

    private final View getSelectedView() {
        return (View) this.selectedView.getValue(this, $$delegatedProperties[3]);
    }

    private final AvatarView getAvatarView() {
        return (AvatarView) this.avatarView.getValue(this, $$delegatedProperties[4]);
    }

    private final View getAvatarSliverView() {
        return (View) this.avatarSliverView.getValue(this, $$delegatedProperties[5]);
    }

    private final View getCriticalBadgeView() {
        return (View) this.criticalBadgeView.getValue(this, $$delegatedProperties[6]);
    }

    private final Typeface getBoldTypeface() {
        return (Typeface) this.boldTypeface.getValue();
    }

    private final Typeface getRegularTypeface() {
        return (Typeface) this.regularTypeface.getValue();
    }

    public final void bind(MessageThread thread) {
        Typeface regularTypeface;
        Intrinsics.checkNotNullParameter(thread, "thread");
        getTitleTxt().setText(thread.getDisplayName());
        getSubtitleTxt().setText(thread.getMostRecentMessage());
        getSubtitleTxt().setVisibility(thread.getMostRecentMessage().length() > 0 ? 0 : 8);
        if (thread.isUnread()) {
            regularTypeface = getBoldTypeface();
        } else {
            regularTypeface = getRegularTypeface();
        }
        getTitleTxt().setTypeface(regularTypeface);
        getSubtitleTxt().setTypeface(regularTypeface);
        bindAvatar(thread);
        bindTimeText(thread);
        bindCriticalBadge(thread);
    }

    private final void bindAvatar(MessageThread thread) {
        getAvatarView().bind(thread.getAvatarText(), thread.getAvatarUrl());
        getSelectedView().setVisibility(thread.isSelected() ? 0 : 8);
        getAvatarSliverView().setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(thread.getMobiusAvatarColor())));
    }

    private final void bindTimeText(MessageThread thread) {
        if (thread.getUpdatedAt() != null) {
            PeriodDuration periodDurationSince = PeriodDurations.since(thread.getUpdatedAt());
            LocalDate localDateMo3459a = thread.getUpdatedAt().atZone(ZoneOffset.UTC).mo3459a();
            TextView timeTxt = getTimeTxt();
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            Intrinsics.checkNotNull(localDateMo3459a);
            timeTxt.setText(RelativeTimeFormatter.formatNarrow(resources, periodDurationSince, localDateMo3459a));
            TextView timeTxt2 = getTimeTxt();
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            timeTxt2.setContentDescription(RelativeTimeFormatter.formatWide(resources2, periodDurationSince, localDateMo3459a));
        } else {
            getTimeTxt().setText((CharSequence) null);
            getTimeTxt().setContentDescription(null);
        }
        if (thread.isUnread()) {
            TextView subtitleTxt = getSubtitleTxt();
            ThemeAttributes themeAttributes = ThemeAttributes.INSTANCE;
            ScarletManager2.overrideAttribute(subtitleTxt, R.attr.textColor, themeAttributes.getTEXT_COLOR_PRIMARY());
            ScarletManager2.overrideAttribute(getTimeTxt(), R.attr.textColor, themeAttributes.getTEXT_COLOR_PRIMARY());
            getTimeTxt().setTypeface(getBoldTypeface());
            return;
        }
        TextView subtitleTxt2 = getSubtitleTxt();
        ThemeAttributes themeAttributes2 = ThemeAttributes.INSTANCE;
        ScarletManager2.overrideAttribute(subtitleTxt2, R.attr.textColor, themeAttributes2.getTEXT_COLOR_SECONDARY());
        ScarletManager2.overrideAttribute(getTimeTxt(), R.attr.textColor, themeAttributes2.getTEXT_COLOR_SECONDARY());
        getTimeTxt().setTypeface(getRegularTypeface());
    }

    private final void bindCriticalBadge(MessageThread thread) {
        getCriticalBadgeView().setVisibility(thread.isCritical() ? 0 : 8);
    }

    /* compiled from: ThreadRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/messages/ThreadRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/inbox/ui/messages/ThreadRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<ThreadRowView> {
        private final /* synthetic */ Inflater<ThreadRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public ThreadRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (ThreadRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C18721R.layout.include_thread_row_view);
        }
    }
}
