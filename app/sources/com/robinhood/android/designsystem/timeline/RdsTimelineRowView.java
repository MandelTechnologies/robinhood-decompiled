package com.robinhood.android.designsystem.timeline;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ResourceValue;
import com.robinhood.scarlet.util.resource.StyleResource;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.TypedArrays3;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RdsTimelineRowView.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \\2\u00020\u0001:\u0004YZ[\\B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010J\u001a\u00020K2\u0006\u00106\u001a\u000205H\u0002J\u0010\u0010L\u001a\u00020K2\u0006\u0010<\u001a\u00020;H\u0002J\b\u0010M\u001a\u00020KH\u0002J\b\u0010N\u001a\u00020KH\u0002J\b\u0010O\u001a\u00020KH\u0002J\b\u0010P\u001a\u00020KH\u0002J\b\u0010Q\u001a\u00020KH\u0002J\b\u0010R\u001a\u00020KH\u0002J\b\u0010S\u001a\u00020KH\u0002J\u0014\u0010T\u001a\u00020K2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020K0VJ\u0014\u0010W\u001a\u00020K2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020K0VJ\u0014\u0010X\u001a\u00020K2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020K0VR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R(\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010 \u001a\u0004\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR(\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u0019\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010)\u001a\u0004\u0018\u00010#2\b\u0010\u0019\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R(\u0010,\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR(\u0010/\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u0010\u001fR(\u00102\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010\u001d\"\u0004\b4\u0010\u001fR$\u00106\u001a\u0002052\u0006\u0010\u0019\u001a\u000205@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010<\u001a\u00020;2\u0006\u0010\u0019\u001a\u00020;@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010B\u001a\u00020A2\u0006\u0010\u0019\u001a\u00020A@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR(\u0010G\u001a\u0004\u0018\u00010#2\b\u0010\u0019\u001a\u0004\u0018\u00010#@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010&\"\u0004\bI\u0010(¨\u0006]"}, m3636d2 = {"Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "primaryTextContainer", "Landroid/widget/LinearLayout;", "secondaryTextContainer", "primaryTextView", "Landroid/widget/TextView;", "metadataTextView", "timestampTextView", "helperButton", "ctaButton", "secondaryTextSeparator", "Landroid/view/View;", "statusImageView", "Landroid/widget/ImageView;", "topConnector", "bottomConnector", "primaryTextAppearance", "", "value", "", "primaryText", "getPrimaryText", "()Ljava/lang/CharSequence;", "setPrimaryText", "(Ljava/lang/CharSequence;)V", "metadataText", "getMetadataText", "setMetadataText", "Landroid/graphics/drawable/Drawable;", "primaryTextIcon", "getPrimaryTextIcon", "()Landroid/graphics/drawable/Drawable;", "setPrimaryTextIcon", "(Landroid/graphics/drawable/Drawable;)V", "metadataTextIcon", "getMetadataTextIcon", "setMetadataTextIcon", "timestampText", "getTimestampText", "setTimestampText", "helperButtonText", "getHelperButtonText", "setHelperButtonText", "ctaButtonText", "getCtaButtonText", "setCtaButtonText", "Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$State;", "state", "getState", "()Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$State;", "setState", "(Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$State;)V", "Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$Position;", "position", "getPosition", "()Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$Position;", "setPosition", "(Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$Position;)V", "Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$IconStyle;", "iconStyle", "getIconStyle", "()Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$IconStyle;", "setIconStyle", "(Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$IconStyle;)V", "iconDrawable", "getIconDrawable", "setIconDrawable", "updateState", "", "updatePosition", "showCompleteState", "showNextState", "showIncompleteState", "showInProgressState", "showErrorState", "updateStatusIcon", "updateSecondaryTextSeparatorVisibility", "onNormalTextClick", "action", "Lkotlin/Function0;", "onHelperButtonClick", "onCtaButtonClick", "State", "IconStyle", "Position", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RdsTimelineRowView extends ConstraintLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final View bottomConnector;
    private final TextView ctaButton;
    private final TextView helperButton;
    private Drawable iconDrawable;
    private IconStyle iconStyle;
    private final TextView metadataTextView;
    private Position position;
    private int primaryTextAppearance;
    private final LinearLayout primaryTextContainer;
    private final TextView primaryTextView;
    private final LinearLayout secondaryTextContainer;
    private final View secondaryTextSeparator;
    private State state;
    private final ImageView statusImageView;
    private final TextView timestampTextView;
    private final View topConnector;

    /* compiled from: RdsTimelineRowView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.NEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.INCOMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[State.IN_PROGRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[State.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Position.values().length];
            try {
                iArr2[Position.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Position.BETWEEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Position.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[IconStyle.values().length];
            try {
                iArr3[IconStyle.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[IconStyle.FILLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[IconStyle.OUTLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public /* synthetic */ RdsTimelineRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsTimelineRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C13997R.layout.merge_rds_timeline_row, this);
        View viewFindViewById = findViewById(C13997R.id.timeline_row_primary_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.primaryTextContainer = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(C13997R.id.timeline_row_secondary_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.secondaryTextContainer = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(C13997R.id.timeline_row_primary_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.primaryTextView = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C13997R.id.timeline_row_metadata_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.metadataTextView = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(C13997R.id.timeline_row_timestamp_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.timestampTextView = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(C13997R.id.timeline_row_helper_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.helperButton = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(C13997R.id.timeline_row_cta_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.ctaButton = (TextView) viewFindViewById7;
        View viewFindViewById8 = findViewById(C13997R.id.timeline_row_secondary_text_separator);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.secondaryTextSeparator = viewFindViewById8;
        View viewFindViewById9 = findViewById(C13997R.id.timeline_row_status_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.statusImageView = (ImageView) viewFindViewById9;
        View viewFindViewById10 = findViewById(C13997R.id.timeline_row_top_connector);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.topConnector = viewFindViewById10;
        View viewFindViewById11 = findViewById(C13997R.id.timeline_row_bottom_connector);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.bottomConnector = viewFindViewById11;
        this.primaryTextAppearance = C13997R.style.TextAppearance_Mobius_Capsule_Regular_Medium;
        this.state = State.COMPLETE;
        this.position = Position.BETWEEN;
        this.iconStyle = IconStyle.NONE;
        this.primaryTextAppearance = ((StyleResource) ScarletManager2.getScarletManager(this).getCurrentThemeNode().getResourceOrThrow(new ThemedResourceReference(ResourceType.STYLE.INSTANCE, C20690R.attr.timelineRowPrimaryTextAppearance))).getResId();
        int[] RdsTimelineRowView = C13997R.styleable.RdsTimelineRowView;
        Intrinsics.checkNotNullExpressionValue(RdsTimelineRowView, "RdsTimelineRowView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsTimelineRowView, 0, 0);
        setPrimaryText(typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsTimelineRowView_primaryText));
        setMetadataText(typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsTimelineRowView_metadataText));
        setTimestampText(typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsTimelineRowView_timestampText));
        setHelperButtonText(typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsTimelineRowView_helperButtonText));
        setCtaButtonText(typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsTimelineRowView_ctaButtonText));
        Integer intOrNull = TypedArrays3.getIntOrNull(typedArrayObtainStyledAttributes, C13997R.styleable.RdsTimelineRowView_state);
        if (intOrNull != null) {
            setState(State.values()[intOrNull.intValue()]);
        }
        Integer intOrNull2 = TypedArrays3.getIntOrNull(typedArrayObtainStyledAttributes, C13997R.styleable.RdsTimelineRowView_position);
        if (intOrNull2 != null) {
            setPosition(Position.values()[intOrNull2.intValue()]);
        }
        Integer intOrNull3 = TypedArrays3.getIntOrNull(typedArrayObtainStyledAttributes, C13997R.styleable.RdsTimelineRowView_iconStyle);
        if (intOrNull3 != null) {
            setIconStyle(IconStyle.values()[intOrNull3.intValue()]);
        }
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C13997R.styleable.RdsTimelineRowView_iconDrawable);
        if (drawable != null) {
            setIconDrawable(drawable);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final CharSequence getPrimaryText() {
        return this.primaryTextView.getText();
    }

    public final void setPrimaryText(CharSequence charSequence) {
        this.primaryTextView.setText(charSequence);
    }

    public final CharSequence getMetadataText() {
        return this.metadataTextView.getText();
    }

    public final void setMetadataText(CharSequence charSequence) {
        this.metadataTextView.setText(charSequence);
        updateSecondaryTextSeparatorVisibility();
        this.metadataTextView.setVisibility(charSequence != null && charSequence.length() != 0 ? 0 : 8);
    }

    public final Drawable getPrimaryTextIcon() {
        return TextViewsKt.getDrawableEnd(this.primaryTextView);
    }

    public final void setPrimaryTextIcon(Drawable drawable) {
        TextViewsKt.setDrawableEnd(this.primaryTextView, drawable);
    }

    public final Drawable getMetadataTextIcon() {
        return TextViewsKt.getDrawableEnd(this.metadataTextView);
    }

    public final void setMetadataTextIcon(Drawable drawable) {
        TextViewsKt.setDrawableEnd(this.metadataTextView, drawable);
    }

    public final CharSequence getTimestampText() {
        return this.timestampTextView.getText();
    }

    public final void setTimestampText(CharSequence charSequence) {
        this.timestampTextView.setText(charSequence);
        updateSecondaryTextSeparatorVisibility();
        this.timestampTextView.setVisibility(charSequence != null && charSequence.length() != 0 ? 0 : 8);
    }

    public final CharSequence getHelperButtonText() {
        return this.helperButton.getText();
    }

    public final void setHelperButtonText(CharSequence charSequence) {
        this.helperButton.setVisibility(charSequence != null ? 0 : 8);
        this.helperButton.setText(charSequence);
    }

    public final CharSequence getCtaButtonText() {
        return this.ctaButton.getText();
    }

    public final void setCtaButtonText(CharSequence charSequence) {
        this.ctaButton.setVisibility(charSequence != null ? 0 : 8);
        this.ctaButton.setText(charSequence);
    }

    public final State getState() {
        return this.state;
    }

    public final void setState(State value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.state = value;
        updateState(value);
    }

    public final Position getPosition() {
        return this.position;
    }

    public final void setPosition(Position value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.position = value;
        updatePosition(value);
    }

    public final IconStyle getIconStyle() {
        return this.iconStyle;
    }

    public final void setIconStyle(IconStyle value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.iconStyle = value;
        updateStatusIcon();
    }

    public final Drawable getIconDrawable() {
        return this.iconDrawable;
    }

    public final void setIconDrawable(Drawable drawable) {
        this.iconDrawable = drawable;
        updateStatusIcon();
    }

    private final void updateState(State state) {
        int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            showCompleteState();
            return;
        }
        if (i == 2) {
            showNextState();
            return;
        }
        if (i == 3) {
            showIncompleteState();
        } else if (i == 4) {
            showInProgressState();
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            showErrorState();
        }
    }

    private final void updatePosition(Position position) {
        int i = WhenMappings.$EnumSwitchMapping$1[position.ordinal()];
        if (i == 1) {
            this.topConnector.setVisibility(8);
            this.bottomConnector.setVisibility(0);
        } else if (i == 2) {
            this.topConnector.setVisibility(0);
            this.bottomConnector.setVisibility(0);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.topConnector.setVisibility(0);
            this.bottomConnector.setVisibility(8);
        }
    }

    private final void showCompleteState() {
        TextView textView = this.primaryTextView;
        ThemeAttributes themeAttributes = ThemeAttributes.INSTANCE;
        ScarletManager2.overrideAttribute(textView, R.attr.textColor, themeAttributes.getTEXT_COLOR_PRIMARY());
        ScarletManager2.overrideAttribute(this.primaryTextView, R.attr.drawableTint, themeAttributes.getTEXT_COLOR_PRIMARY());
        View view = this.topConnector;
        view.setBackgroundColor(view.getContext().getColor(C20690R.color.mobius_white));
        ViewsKt.setMarginBottom(view, 0);
        ScarletManager2.overrideAttribute(view, R.attr.backgroundTint, themeAttributes.getCOLOR_PRIMARY());
        ScarletManager2.overrideAttribute(this.bottomConnector, R.attr.backgroundTint, themeAttributes.getCOLOR_PRIMARY());
        setIconDrawable(ViewsKt.getDrawable(this, C20690R.drawable.ic_rds_checkmark_16dp));
        setIconStyle(IconStyle.FILLED);
    }

    private final void showNextState() {
        TextView textView = this.primaryTextView;
        ThemeAttributes themeAttributes = ThemeAttributes.INSTANCE;
        ScarletManager2.overrideAttribute(textView, R.attr.textColor, themeAttributes.getTEXT_COLOR_SECONDARY());
        ScarletManager2.overrideAttribute(this.primaryTextView, R.attr.drawableTint, themeAttributes.getTEXT_COLOR_SECONDARY());
        View view = this.topConnector;
        view.setBackgroundResource(C13997R.drawable.timeline_row_connector_rounded);
        ViewsKt.setMarginBottom(view, view.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_xxsmall));
        ScarletManager2.overrideAttribute(view, R.attr.backgroundTint, themeAttributes.getCOLOR_PRIMARY());
        ScarletManager2.overrideAttribute(this.bottomConnector, R.attr.backgroundTint, themeAttributes.getCOLOR_BACKGROUND_3());
        setIconDrawable(null);
        setIconStyle(IconStyle.NONE);
    }

    private final void showIncompleteState() {
        TextView textView = this.primaryTextView;
        ThemeAttributes themeAttributes = ThemeAttributes.INSTANCE;
        ScarletManager2.overrideAttribute(textView, R.attr.textColor, themeAttributes.getTEXT_COLOR_SECONDARY());
        ScarletManager2.overrideAttribute(this.primaryTextView, R.attr.drawableTint, themeAttributes.getTEXT_COLOR_SECONDARY());
        View view = this.topConnector;
        view.setBackgroundColor(view.getContext().getColor(C20690R.color.mobius_white));
        ViewsKt.setMarginBottom(view, 0);
        ScarletManager2.overrideAttribute(this.topConnector, R.attr.backgroundTint, themeAttributes.getCOLOR_BACKGROUND_3());
        ScarletManager2.overrideAttribute(this.bottomConnector, R.attr.backgroundTint, themeAttributes.getCOLOR_BACKGROUND_3());
        setIconDrawable(null);
        setIconStyle(IconStyle.NONE);
    }

    private final void showInProgressState() {
        TextView textView = this.primaryTextView;
        ThemeAttributes themeAttributes = ThemeAttributes.INSTANCE;
        ScarletManager2.overrideAttribute(textView, R.attr.textColor, themeAttributes.getTEXT_COLOR_PRIMARY());
        ScarletManager2.overrideAttribute(this.primaryTextView, R.attr.drawableTint, themeAttributes.getTEXT_COLOR_PRIMARY());
        View view = this.topConnector;
        view.setBackgroundColor(view.getContext().getColor(C20690R.color.mobius_white));
        ViewsKt.setMarginBottom(view, 0);
        ScarletManager2.overrideAttribute(view, R.attr.backgroundTint, themeAttributes.getCOLOR_PRIMARY());
        ScarletManager2.overrideAttribute(this.bottomConnector, R.attr.backgroundTint, themeAttributes.getCOLOR_PRIMARY());
        setIconDrawable(ViewsKt.getDrawable(this, C20690R.drawable.ic_rds_dot_16dp));
        setIconStyle(IconStyle.FILLED);
    }

    private final void showErrorState() {
        TextView textView = this.primaryTextView;
        ThemeAttributes themeAttributes = ThemeAttributes.INSTANCE;
        ScarletManager2.overrideAttribute(textView, R.attr.textColor, themeAttributes.getTEXT_COLOR_PRIMARY());
        ScarletManager2.overrideAttribute(this.primaryTextView, R.attr.drawableTint, themeAttributes.getTEXT_COLOR_PRIMARY());
        View view = this.topConnector;
        view.setBackgroundResource(C13997R.drawable.timeline_row_connector_rounded);
        ViewsKt.setMarginBottom(view, view.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_xxsmall));
        ScarletManager2.overrideAttribute(view, R.attr.backgroundTint, themeAttributes.getCOLOR_PRIMARY());
        ScarletManager2.overrideAttribute(this.bottomConnector, R.attr.backgroundTint, themeAttributes.getCOLOR_BACKGROUND_3());
        setIconDrawable(ViewsKt.getDrawable(this, C20690R.drawable.ic_rds_close_16dp));
        setIconStyle(IconStyle.OUTLINE);
        ScarletManager2.overrideAttribute(this.statusImageView, R.attr.tint, themeAttributes.getCOLOR_NEGATIVE());
        ScarletManager2.overrideAttribute(this.statusImageView, R.attr.backgroundTint, themeAttributes.getCOLOR_NEGATIVE());
    }

    private final void updateStatusIcon() {
        ImageView imageView = this.statusImageView;
        int i = WhenMappings.$EnumSwitchMapping$2[this.iconStyle.ordinal()];
        if (i == 1) {
            imageView.setImageResource(C13997R.drawable.timeline_row_incomplete_icon);
            ViewsKt.setPadding(imageView, 0);
            ScarletManager2.overrideAttribute(imageView, R.attr.backgroundTint, ResourceValue.INSTANCE.getEMPTY());
            ScarletManager2.overrideAttribute(imageView, R.attr.tint, ThemeAttributes.INSTANCE.getCOLOR_BACKGROUND_3());
            return;
        }
        if (i == 2) {
            imageView.setImageDrawable(this.iconDrawable);
            imageView.setBackgroundResource(C13997R.drawable.circle_background);
            ViewsKt.setPadding(imageView, imageView.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_xsmall));
            ThemeAttributes themeAttributes = ThemeAttributes.INSTANCE;
            ScarletManager2.overrideAttribute(imageView, R.attr.backgroundTint, themeAttributes.getCOLOR_PRIMARY());
            ScarletManager2.overrideAttribute(imageView, R.attr.tint, themeAttributes.getCOLOR_BACKGROUND_1());
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        imageView.setImageDrawable(this.iconDrawable);
        imageView.setBackgroundResource(C13997R.drawable.circle_outline);
        ViewsKt.setPadding(imageView, imageView.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_xsmall));
        ThemeAttributes themeAttributes2 = ThemeAttributes.INSTANCE;
        ScarletManager2.overrideAttribute(imageView, R.attr.backgroundTint, themeAttributes2.getCOLOR_PRIMARY());
        ScarletManager2.overrideAttribute(imageView, R.attr.tint, themeAttributes2.getCOLOR_PRIMARY());
    }

    private final void updateSecondaryTextSeparatorVisibility() {
        CharSequence timestampText;
        View view = this.secondaryTextSeparator;
        CharSequence metadataText = getMetadataText();
        view.setVisibility(metadataText != null && metadataText.length() != 0 && (timestampText = getTimestampText()) != null && timestampText.length() != 0 ? 0 : 8);
    }

    public final void onNormalTextClick(Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        OnClickListeners.onClick(this.primaryTextContainer, action);
        OnClickListeners.onClick(this.secondaryTextContainer, action);
    }

    public final void onHelperButtonClick(Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        OnClickListeners.onClick(this.helperButton, action);
    }

    public final void onCtaButtonClick(Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        OnClickListeners.onClick(this.ctaButton, action);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RdsTimelineRowView.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$State;", "", "<init>", "(Ljava/lang/String;I)V", "COMPLETE", "NEXT", "INCOMPLETE", "IN_PROGRESS", "ERROR", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State COMPLETE = new State("COMPLETE", 0);
        public static final State NEXT = new State("NEXT", 1);
        public static final State INCOMPLETE = new State("INCOMPLETE", 2);
        public static final State IN_PROGRESS = new State("IN_PROGRESS", 3);
        public static final State ERROR = new State("ERROR", 4);

        private static final /* synthetic */ State[] $values() {
            return new State[]{COMPLETE, NEXT, INCOMPLETE, IN_PROGRESS, ERROR};
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        private State(String str, int i) {
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateArr$values);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RdsTimelineRowView.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$IconStyle;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "FILLED", "OUTLINE", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class IconStyle {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IconStyle[] $VALUES;
        public static final IconStyle NONE = new IconStyle("NONE", 0);
        public static final IconStyle FILLED = new IconStyle("FILLED", 1);
        public static final IconStyle OUTLINE = new IconStyle("OUTLINE", 2);

        private static final /* synthetic */ IconStyle[] $values() {
            return new IconStyle[]{NONE, FILLED, OUTLINE};
        }

        public static EnumEntries<IconStyle> getEntries() {
            return $ENTRIES;
        }

        private IconStyle(String str, int i) {
        }

        static {
            IconStyle[] iconStyleArr$values = $values();
            $VALUES = iconStyleArr$values;
            $ENTRIES = EnumEntries2.enumEntries(iconStyleArr$values);
        }

        public static IconStyle valueOf(String str) {
            return (IconStyle) Enum.valueOf(IconStyle.class, str);
        }

        public static IconStyle[] values() {
            return (IconStyle[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RdsTimelineRowView.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$Position;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BETWEEN", "BOTTOM", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Position {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Position[] $VALUES;
        public static final Position TOP = new Position("TOP", 0);
        public static final Position BETWEEN = new Position("BETWEEN", 1);
        public static final Position BOTTOM = new Position("BOTTOM", 2);

        private static final /* synthetic */ Position[] $values() {
            return new Position[]{TOP, BETWEEN, BOTTOM};
        }

        public static EnumEntries<Position> getEntries() {
            return $ENTRIES;
        }

        private Position(String str, int i) {
        }

        static {
            Position[] positionArr$values = $values();
            $VALUES = positionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(positionArr$values);
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) $VALUES.clone();
        }
    }

    /* compiled from: RdsTimelineRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<RdsTimelineRowView> {
        private final /* synthetic */ Inflater<RdsTimelineRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RdsTimelineRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RdsTimelineRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C13997R.layout.include_rds_timeline_row_view);
        }
    }
}
