package com.robinhood.android.settings.p254ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.robinhood.android.settings.models.api.ApiSettingsPage;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SettingsHeaderView.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0014B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/SettingsHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/settings/models/api/ApiSettingsPage;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "contentGroup", "Landroidx/constraintlayout/widget/Group;", "backgroundImg", "Landroid/widget/ImageView;", "titleTxt", "Landroid/widget/TextView;", "subtitleTxt", "bind", "", "state", "Companion", "feature-lib-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SettingsHeaderView extends ConstraintLayout implements Bindable<ApiSettingsPage> {
    private final ImageView backgroundImg;
    private final Group contentGroup;
    private final TextView subtitleTxt;
    private final TextView titleTxt;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SettingsHeaderView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiSettingsPage.Header.Style.values().length];
            try {
                iArr[ApiSettingsPage.Header.Style.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiSettingsPage.Header.Style.HERO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C28356R.layout.merge_settings_header, true);
        View viewFindViewById = findViewById(C28356R.id.content_group);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.contentGroup = (Group) viewFindViewById;
        View viewFindViewById2 = findViewById(C28356R.id.header_background_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.backgroundImg = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C28356R.id.header_title_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.titleTxt = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C28356R.id.header_subtitle_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.subtitleTxt = (TextView) viewFindViewById4;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(ApiSettingsPage state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ApiSettingsPage.Header header = state.getHeader();
        ApiSettingsPage.Header.Style style = header != null ? header.getStyle() : null;
        int i = style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i == -1 || i == 1) {
            this.contentGroup.setVisibility(8);
            this.backgroundImg.setVisibility(8);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.contentGroup.setVisibility(0);
            this.backgroundImg.setVisibility(0);
            this.titleTxt.setText(header.getData().getTitle());
            TextViewsKt.setVisibilityText(this.subtitleTxt, header.getData().getSubtitle());
        }
    }

    /* compiled from: SettingsHeaderView.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/SettingsHeaderView$Companion;", "", "<init>", "()V", "inflater", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/settings/ui/SettingsHeaderView;", "onLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "feature-lib-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Inflater<SettingsHeaderView> inflater(final View.OnLayoutChangeListener onLayoutChangeListener) {
            Intrinsics.checkNotNullParameter(onLayoutChangeListener, "onLayoutChangeListener");
            return new Inflater() { // from class: com.robinhood.android.settings.ui.SettingsHeaderView$Companion$inflater$1
                @Override // com.robinhood.utils.p409ui.view.Inflater
                public final SettingsHeaderView inflate(ViewGroup parent) {
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    View viewInflate$default = ViewGroups.inflate$default(parent, C28356R.layout.include_settings_header_view, false, 2, null);
                    viewInflate$default.addOnLayoutChangeListener(onLayoutChangeListener);
                    Intrinsics.checkNotNull(viewInflate$default, "null cannot be cast to non-null type com.robinhood.android.settings.ui.SettingsHeaderView");
                    return (SettingsHeaderView) viewInflate$default;
                }
            };
        }
    }
}
