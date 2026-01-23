package com.robinhood.android.settings.p254ui;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.android.settings.models.p253ui.TypedSettingsItem;
import com.robinhood.android.settings.p254ui.SettingsAdapter;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MarkdownView.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u001dB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/MarkdownView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$MarkdownItem;", "Lcom/robinhood/android/settings/ui/BaseSettingsView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "titleTxt", "Landroid/widget/TextView;", "bodyTxt", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "callbacks", "Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;)V", "bind", "", "state", "Companion", "feature-lib-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class MarkdownView extends Hammer_MarkdownView implements Bindable<TypedSettingsItem.MarkdownItem>, BaseSettingsView {
    private final TextView bodyTxt;
    private SettingsAdapter.Callbacks callbacks;
    public Markwon markwon;
    private final TextView titleTxt;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkdownView(Context context, AttributeSet attributeSet) {
        super(new ScarletContextWrapper(context, null, null, 6, null), attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        ViewGroups.inflate(this, C28356R.layout.merge_markdown_view, true);
        View viewFindViewById = findViewById(C28356R.id.markdown_title_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.titleTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C28356R.id.markdown_body_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.bodyTxt = (TextView) viewFindViewById2;
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.settings.p254ui.BaseSettingsView
    public SettingsAdapter.Callbacks getCallbacks() {
        return this.callbacks;
    }

    @Override // com.robinhood.android.settings.p254ui.BaseSettingsView
    public void setCallbacks(SettingsAdapter.Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(TypedSettingsItem.MarkdownItem state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AchromaticOverlay.INSTANCE, null, 2, null);
        TextViewsKt.setVisibilityText(this.titleTxt, state.getTitle());
        String titleServerColor = state.getTitleServerColor();
        if (titleServerColor != null) {
            ScarletManager2.overrideAttribute(this.titleTxt, R.attr.textColor, ServerToBentoColorMapper.INSTANCE.mapSimpleServerColor(titleServerColor));
        }
        getMarkwon().mo17580setMarkdown(this.bodyTxt, state.getMarkdownText().getRaw());
        String markdownServerColor = state.getMarkdownServerColor();
        if (markdownServerColor != null) {
            ScarletManager2.overrideAttribute(this.bodyTxt, R.attr.textColor, ServerToBentoColorMapper.INSTANCE.mapSimpleServerColor(markdownServerColor));
        }
        ScarletManager2.overrideAttribute(this.bodyTxt, R.attr.textColorLink, ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_1());
    }

    /* compiled from: MarkdownView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/MarkdownView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/settings/ui/MarkdownView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<MarkdownView> {
        private final /* synthetic */ Inflater<MarkdownView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public MarkdownView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (MarkdownView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C28356R.layout.include_markdown_view);
        }
    }
}
