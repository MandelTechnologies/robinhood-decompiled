package com.robinhood.android.designsystem.banner;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.extensions.TypedArrays;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: RdsInfoBannerView.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 G2\u00020\u0001:\u0001GB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0017J\b\u0010=\u001a\u00020#H\u0017J\u0016\u0010>\u001a\u00020:2\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010@J\n\u0010A\u001a\u0004\u0018\u00010BH\u0016J\u0012\u0010C\u001a\u00020:2\b\u0010D\u001a\u0004\u0018\u00010BH\u0016J\b\u0010E\u001a\u00020:H\u0002J\b\u0010F\u001a\u00020:H\u0003R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010 \u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR$\u0010$\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020#@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R0\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020*0)@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R0\u00100\u001a\b\u0012\u0004\u0012\u00020*0)2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020*0)@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R$\u00103\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010&\"\u0004\b5\u0010(R$\u00106\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020#8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b7\u0010&\"\u0004\b8\u0010(¨\u0006H"}, m3636d2 = {"Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "textView", "Landroid/widget/TextView;", "endSpace", "Landroid/widget/Space;", "iconImageView", "Landroid/widget/ImageView;", "arrowIconImageView", "closeIconImageView", "bannerContainer", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "dismissContainer", "value", "Landroid/graphics/drawable/Drawable;", "icon", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "", "text", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "ctaText", "getCtaText", "setCtaText", "", "centerText", "getCenterText", "()Z", "setCenterText", "(Z)V", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "", "textColor", "getTextColor", "()Lcom/robinhood/scarlet/util/resource/ResourceReference;", "setTextColor", "(Lcom/robinhood/scarlet/util/resource/ResourceReference;)V", "textColorLink", "getTextColorLink", "setTextColorLink", "arrowVisible", "getArrowVisible", "setArrowVisible", "canDismiss", "getCanDismiss", "setCanDismiss", "setOnClickListener", "", "listener", "Landroid/view/View$OnClickListener;", "hasOnClickListeners", "onDismiss", "action", "Lkotlin/Function0;", "getBackgroundTintList", "Landroid/content/res/ColorStateList;", "setBackgroundTintList", "tint", "updateText", "updateArrowIcon", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class RdsInfoBannerView extends ConstraintLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ImageView arrowIconImageView;
    private final RdsRippleContainerView bannerContainer;
    private boolean centerText;
    private final ImageView closeIconImageView;
    private CharSequence ctaText;
    private final RdsRippleContainerView dismissContainer;
    private final Space endSpace;
    private final ImageView iconImageView;
    private CharSequence text;
    private ResourceReferences4<Integer> textColor;
    private ResourceReferences4<Integer> textColorLink;
    private final TextView textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsInfoBannerView(Context context, AttributeSet attributeSet) {
        super(new ScarletContextWrapper(context, null, new ThemedResourceReference(ResourceType.STYLE.INSTANCE, C20690R.attr.surfaceTheme), 2, null), attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C13997R.layout.merge_rds_info_banner, this);
        View viewFindViewById = findViewById(C13997R.id.banner_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.textView = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C13997R.id.banner_end_space);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.endSpace = (Space) viewFindViewById2;
        View viewFindViewById3 = findViewById(C13997R.id.banner_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.iconImageView = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C13997R.id.banner_arrow_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.arrowIconImageView = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(C13997R.id.banner_close_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.closeIconImageView = (ImageView) viewFindViewById5;
        View viewFindViewById6 = findViewById(C13997R.id.banner_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.bannerContainer = (RdsRippleContainerView) viewFindViewById6;
        View viewFindViewById7 = findViewById(C13997R.id.banner_dismiss_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.dismissContainer = (RdsRippleContainerView) viewFindViewById7;
        ResourceType.COLOR color = ResourceType.COLOR.INSTANCE;
        this.textColor = new ThemedResourceReference(color, C13997R.attr.colorForegroundInfoBanner);
        this.textColorLink = new ThemedResourceReference(color, C13997R.attr.colorForegroundInfoBanner);
        int[] RdsInfoBannerView = C13997R.styleable.RdsInfoBannerView;
        Intrinsics.checkNotNullExpressionValue(RdsInfoBannerView, "RdsInfoBannerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsInfoBannerView, 0, 0);
        setIcon(TypedArrays.getDrawableCompat(typedArrayObtainStyledAttributes, context, C13997R.styleable.RdsInfoBannerView_icon));
        setText(typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsInfoBannerView_android_text));
        setCtaText(typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsInfoBannerView_ctaText));
        setCenterText(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsInfoBannerView_centerText, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final Drawable getIcon() {
        return this.iconImageView.getDrawable();
    }

    public final void setIcon(Drawable drawable) {
        ImageView imageView = this.iconImageView;
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(drawable != null ? 0 : 8);
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final void setText(CharSequence charSequence) {
        this.text = charSequence;
        updateText();
    }

    public final CharSequence getCtaText() {
        return this.ctaText;
    }

    public final void setCtaText(CharSequence charSequence) {
        this.ctaText = charSequence;
        updateText();
    }

    public final boolean getCenterText() {
        return this.centerText;
    }

    public final void setCenterText(boolean z) {
        this.centerText = z;
        this.textView.setGravity(z ? 17 : MaterialCardView.CHECKED_ICON_GRAVITY_TOP_START);
    }

    public final ResourceReferences4<Integer> getTextColor() {
        return this.textColor;
    }

    public final void setTextColor(ResourceReferences4<Integer> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.textColor = value;
        ScarletManager2.overrideAttribute(this.textView, R.attr.textColor, value);
        ScarletManager2.overrideAttribute(this.iconImageView, R.attr.tint, value);
        ScarletManager2.overrideAttribute(this.arrowIconImageView, R.attr.tint, value);
        ScarletManager2.overrideAttribute(this.closeIconImageView, R.attr.tint, value);
    }

    public final ResourceReferences4<Integer> getTextColorLink() {
        return this.textColorLink;
    }

    public final void setTextColorLink(ResourceReferences4<Integer> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.textColorLink = value;
        ScarletManager2.overrideAttribute(this.textView, R.attr.textColorLink, value);
    }

    public final boolean getArrowVisible() {
        return this.arrowIconImageView.getVisibility() == 0;
    }

    public final void setArrowVisible(boolean z) {
        this.arrowIconImageView.setVisibility(z ? 0 : 8);
    }

    private final boolean getCanDismiss() {
        return this.dismissContainer.getVisibility() == 0;
    }

    private final void setCanDismiss(boolean z) {
        int i;
        RdsRippleContainerView rdsRippleContainerView = this.bannerContainer;
        if (z) {
            i = C13997R.drawable.banner_background_left;
        } else {
            i = C13997R.drawable.banner_background;
        }
        rdsRippleContainerView.setBackground(ViewsKt.getDrawable(this, i));
        this.dismissContainer.setVisibility(z ? 0 : 8);
        updateArrowIcon();
    }

    @Override // android.view.View
    @Deprecated
    public void setOnClickListener(View.OnClickListener listener) {
        this.bannerContainer.setOnClickListener(listener);
        com.robinhood.android.autoeventlogging.ViewsKt.eventData$default(this.bannerContainer, false, new Function0() { // from class: com.robinhood.android.designsystem.banner.RdsInfoBannerView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.robinhood.android.autoeventlogging.ViewsKt.getEventData(this.f$0);
            }
        }, 1, null);
        updateArrowIcon();
    }

    @Override // android.view.View
    @Deprecated
    public boolean hasOnClickListeners() {
        return this.bannerContainer.hasOnClickListeners();
    }

    public final void onDismiss(Function0<Unit> action) {
        if (action == null) {
            setCanDismiss(false);
            this.dismissContainer.setOnClickListener(null);
        } else {
            setCanDismiss(true);
            OnClickListeners.onClick(this.dismissContainer, action);
            com.robinhood.android.autoeventlogging.ViewsKt.eventData$default(this.dismissContainer, false, new Function0() { // from class: com.robinhood.android.designsystem.banner.RdsInfoBannerView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RdsInfoBannerView.onDismiss$lambda$2(this.f$0);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onDismiss$lambda$2(RdsInfoBannerView rdsInfoBannerView) {
        UserInteractionEventDescriptor eventData = com.robinhood.android.autoeventlogging.ViewsKt.getEventData(rdsInfoBannerView);
        if (eventData != null) {
            return UserInteractionEventDescriptor.copy$default(eventData, null, null, UserInteractionEventData.Action.DISMISS, null, null, null, 59, null);
        }
        return null;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.bannerContainer.getBackgroundTintList();
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList tint) {
        this.bannerContainer.setBackgroundTintList(tint);
        this.dismissContainer.setBackgroundTintList(tint);
    }

    private final void updateText() {
        TextView textView = this.textView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequence = this.text;
        if (charSequence != null && charSequence.length() != 0) {
            spannableStringBuilder.append(this.text);
        }
        CharSequence charSequence2 = this.ctaText;
        if (charSequence2 != null && charSequence2.length() != 0) {
            spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
            UnderlineSpan underlineSpan = new UnderlineSpan();
            int length = spannableStringBuilder.length();
            StyleSpan styleSpan = new StyleSpan(1);
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append(this.ctaText);
            spannableStringBuilder.setSpan(styleSpan, length2, spannableStringBuilder.length(), 17);
            spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        }
        textView.setText(new SpannedString(spannableStringBuilder));
        CharSequence text = this.textView.getText();
        if (text == null || StringsKt.isBlank(text)) {
            return;
        }
        IdlingResourceCounters2.setBusy(IdlingResourceType.EQUITY_IPOA_PRICE_CHANGE_BANNER_VISIBLE, false);
    }

    @Deprecated
    private final void updateArrowIcon() {
        boolean canDismiss = getCanDismiss();
        boolean zHasOnClickListeners = hasOnClickListeners();
        this.arrowIconImageView.setVisibility(!canDismiss && zHasOnClickListeners ? 0 : 8);
        this.endSpace.setVisibility((canDismiss || zHasOnClickListeners) ? false : true ? 0 : 8);
    }

    /* compiled from: RdsInfoBannerView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<RdsInfoBannerView> {
        private final /* synthetic */ Inflater<RdsInfoBannerView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RdsInfoBannerView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RdsInfoBannerView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C13997R.layout.include_rds_info_banner);
        }
    }
}
