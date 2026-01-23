package com.robinhood.android.settings.p254ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.settings.models.p253ui.TypedSettingsItem;
import com.robinhood.android.settings.p254ui.SettingsAdapter;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SectionHeaderView.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u0019B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/SectionHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$SectionHeaderItem;", "Lcom/robinhood/android/settings/ui/BaseSettingsView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "titleTxt", "Landroid/widget/TextView;", "subtitleTxt", "iconImg", "Landroid/widget/ImageView;", "callbacks", "Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;)V", "bind", "", "state", "Companion", "feature-lib-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SectionHeaderView extends ConstraintLayout implements Bindable<TypedSettingsItem.SectionHeaderItem>, BaseSettingsView {
    private SettingsAdapter.Callbacks callbacks;
    private final ImageView iconImg;
    private final TextView subtitleTxt;
    private final TextView titleTxt;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ SectionHeaderView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C28356R.layout.merge_section_header_view, true);
        View viewFindViewById = findViewById(C28356R.id.header_title_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.titleTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C28356R.id.header_subtitle_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.subtitleTxt = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C28356R.id.header_icon_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.iconImg = (ImageView) viewFindViewById3;
    }

    @Override // com.robinhood.android.settings.p254ui.BaseSettingsView
    public SettingsAdapter.Callbacks getCallbacks() {
        return this.callbacks;
    }

    @Override // com.robinhood.android.settings.p254ui.BaseSettingsView
    public void setCallbacks(SettingsAdapter.Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(final TypedSettingsItem.SectionHeaderItem state) {
        int i;
        Intrinsics.checkNotNullParameter(state, "state");
        this.titleTxt.setText(state.getTitle());
        ThemedResourceReference themedResourceReference = new ThemedResourceReference(ResourceType.STYLE.INSTANCE, SectionHeaderView2.getTextAppearanceAttrResId(state.getStyle()));
        TextView textView = this.titleTxt;
        Resources.Theme theme = getContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        textView.setTextAppearance(((StyleResource) themedResourceReference.resolveOrThrow(theme)).getResId());
        ScarletManager2.overrideAttribute(this, R.attr.textAppearance, themedResourceReference);
        this.subtitleTxt.setText(state.getSubtitle());
        this.subtitleTxt.setVisibility(state.getSubtitle() != null ? 0 : 8);
        ServerToBentoAssetMapper2 icon = state.getIcon();
        if (icon != null) {
            this.iconImg.setImageResource(icon.getResourceId());
        }
        final GenericAction iconAction = state.getIconAction();
        if (iconAction != null) {
            OnClickListeners.onClick(this.iconImg, new Function0() { // from class: com.robinhood.android.settings.ui.SectionHeaderView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SectionHeaderView.bind$lambda$2$lambda$1(this.f$0, iconAction, state);
                }
            });
        }
        if (state.isFirstItem()) {
            i = C13997R.dimen.rds_spacing_medium;
        } else {
            i = C13997R.dimen.rds_spacing_xlarge;
        }
        setPadding(getPaddingLeft(), getResources().getDimensionPixelSize(i), getPaddingRight(), getPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2$lambda$1(SectionHeaderView sectionHeaderView, GenericAction genericAction, TypedSettingsItem.SectionHeaderItem sectionHeaderItem) {
        SettingsAdapter.Callbacks callbacks = sectionHeaderView.getCallbacks();
        if (callbacks != null) {
            callbacks.onSettingsActionTriggered(genericAction, sectionHeaderItem);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SectionHeaderView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/SectionHeaderView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/settings/ui/SectionHeaderView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SectionHeaderView> {
        private final /* synthetic */ Inflater<SectionHeaderView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SectionHeaderView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SectionHeaderView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C28356R.layout.include_section_header_view);
        }
    }
}
