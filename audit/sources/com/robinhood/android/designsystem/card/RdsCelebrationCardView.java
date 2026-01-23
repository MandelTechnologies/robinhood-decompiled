package com.robinhood.android.designsystem.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.sparkle.SparkleMaskView;
import com.robinhood.android.designsystem.sparkle.Sparkleable;
import com.robinhood.android.equitydetail.p123ui.statistics.StatisticsSection2;
import com.robinhood.android.graphics.Gradient;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ResourceValue;
import com.robinhood.scarlet.view.DefStyleProvider;
import com.robinhood.utils.extensions.KProperties2;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty3;

/* compiled from: RdsCelebrationCardView.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 T2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0002STB\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u0003H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR/\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010 \u001a\u0004\u0018\u00010!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R/\u0010)\u001a\u0004\u0018\u00010!2\b\u0010 \u001a\u0004\u0018\u00010!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010(\u001a\u0004\b*\u0010$\"\u0004\b+\u0010&R/\u0010-\u001a\u0004\u0018\u00010!2\b\u0010 \u001a\u0004\u0018\u00010!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010(\u001a\u0004\b.\u0010$\"\u0004\b/\u0010&R/\u00101\u001a\u0004\u0018\u00010!2\b\u0010 \u001a\u0004\u0018\u00010!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010(\u001a\u0004\b2\u0010$\"\u0004\b3\u0010&R/\u00105\u001a\u0004\u0018\u00010!2\b\u0010 \u001a\u0004\u0018\u00010!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010(\u001a\u0004\b6\u0010$\"\u0004\b7\u0010&R/\u00109\u001a\u0004\u0018\u00010!2\b\u0010 \u001a\u0004\u0018\u00010!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010(\u001a\u0004\b:\u0010$\"\u0004\b;\u0010&R/\u0010=\u001a\u0004\u0018\u00010!2\b\u0010 \u001a\u0004\u0018\u00010!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010(\u001a\u0004\b>\u0010$\"\u0004\b?\u0010&R$\u0010A\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER(\u0010G\u001a\u0004\u0018\u00010F2\b\u0010\u0019\u001a\u0004\u0018\u00010F8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR/\u0010L\u001a\u0004\u0018\u00010\u001a2\b\u0010 \u001a\u0004\u0018\u00010\u001a8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010(\u001a\u0004\bM\u0010\u001d\"\u0004\bN\u0010\u001f¨\u0006U"}, m3636d2 = {"Lcom/robinhood/android/designsystem/card/RdsCelebrationCardView;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/designsystem/card/RdsCelebrationCardView$Model;", "Lcom/robinhood/android/designsystem/sparkle/Sparkleable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sparkleMaskView", "Lcom/robinhood/android/designsystem/sparkle/SparkleMaskView;", "badgeImg", "Landroid/widget/ImageView;", "eyebrowTxt", "Landroid/widget/TextView;", "titleTxt", "bodyTxt", StatisticsSection2.DIVIDER, "Landroid/view/View;", "footerRow", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "backgroundSparkleMask", "Landroid/graphics/drawable/Drawable;", "value", "Landroid/content/res/ColorStateList;", "foregroundColor", "getForegroundColor", "()Landroid/content/res/ColorStateList;", "setForegroundColor", "(Landroid/content/res/ColorStateList;)V", "<set-?>", "", "eyebrowText", "getEyebrowText", "()Ljava/lang/CharSequence;", "setEyebrowText", "(Ljava/lang/CharSequence;)V", "eyebrowText$delegate", "Lkotlin/reflect/KMutableProperty0;", "titleText", "getTitleText", "setTitleText", "titleText$delegate", "bodyText", "getBodyText", "setBodyText", "bodyText$delegate", "footerPrimaryText", "getFooterPrimaryText", "setFooterPrimaryText", "footerPrimaryText$delegate", "footerSecondaryText", "getFooterSecondaryText", "setFooterSecondaryText", "footerSecondaryText$delegate", "footerMetadataPrimaryText", "getFooterMetadataPrimaryText", "setFooterMetadataPrimaryText", "footerMetadataPrimaryText$delegate", "footerMetadataSecondaryText", "getFooterMetadataSecondaryText", "setFooterMetadataSecondaryText", "footerMetadataSecondaryText$delegate", "model", "getModel", "()Lcom/robinhood/android/designsystem/card/RdsCelebrationCardView$Model;", "setModel", "(Lcom/robinhood/android/designsystem/card/RdsCelebrationCardView$Model;)V", "Lcom/robinhood/android/graphics/Gradient;", "sparkleGradient", "getSparkleGradient", "()Lcom/robinhood/android/graphics/Gradient;", "setSparkleGradient", "(Lcom/robinhood/android/graphics/Gradient;)V", "sparkleOverride", "getSparkleOverride", "setSparkleOverride", "sparkleOverride$delegate", "bind", "", "state", "Model", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class RdsCelebrationCardView extends FrameLayout implements Bindable<Model>, Sparkleable {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(RdsCelebrationCardView.class, "eyebrowText", "getEyebrowText()Ljava/lang/CharSequence;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RdsCelebrationCardView.class, "titleText", "getTitleText()Ljava/lang/CharSequence;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RdsCelebrationCardView.class, "bodyText", "getBodyText()Ljava/lang/CharSequence;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RdsCelebrationCardView.class, "footerPrimaryText", "getFooterPrimaryText()Ljava/lang/CharSequence;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RdsCelebrationCardView.class, "footerSecondaryText", "getFooterSecondaryText()Ljava/lang/CharSequence;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RdsCelebrationCardView.class, "footerMetadataPrimaryText", "getFooterMetadataPrimaryText()Ljava/lang/CharSequence;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RdsCelebrationCardView.class, "footerMetadataSecondaryText", "getFooterMetadataSecondaryText()Ljava/lang/CharSequence;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RdsCelebrationCardView.class, "sparkleOverride", "getSparkleOverride()Landroid/content/res/ColorStateList;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Drawable backgroundSparkleMask;
    private final ImageView badgeImg;

    /* renamed from: bodyText$delegate, reason: from kotlin metadata */
    private final KProperty3 bodyText;
    private final TextView bodyTxt;
    private final View divider;

    /* renamed from: eyebrowText$delegate, reason: from kotlin metadata */
    private final KProperty3 eyebrowText;
    private final TextView eyebrowTxt;

    /* renamed from: footerMetadataPrimaryText$delegate, reason: from kotlin metadata */
    private final KProperty3 footerMetadataPrimaryText;

    /* renamed from: footerMetadataSecondaryText$delegate, reason: from kotlin metadata */
    private final KProperty3 footerMetadataSecondaryText;

    /* renamed from: footerPrimaryText$delegate, reason: from kotlin metadata */
    private final KProperty3 footerPrimaryText;
    private final RdsRowView footerRow;

    /* renamed from: footerSecondaryText$delegate, reason: from kotlin metadata */
    private final KProperty3 footerSecondaryText;
    private ColorStateList foregroundColor;
    private final SparkleMaskView sparkleMaskView;

    /* renamed from: sparkleOverride$delegate, reason: from kotlin metadata */
    private final KProperty3 sparkleOverride;

    /* renamed from: titleText$delegate, reason: from kotlin metadata */
    private final KProperty3 titleText;
    private final TextView titleTxt;

    public /* synthetic */ RdsCelebrationCardView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RdsCelebrationCardView(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        Companion companion = INSTANCE;
        super(context, attributeSet, companion.getDefStyleAttr());
        View.inflate(context, C13997R.layout.merge_rds_celebration_card, this);
        View viewFindViewById = findViewById(C13997R.id.sparkle_mask);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final SparkleMaskView sparkleMaskView = (SparkleMaskView) viewFindViewById;
        this.sparkleMaskView = sparkleMaskView;
        View viewFindViewById2 = findViewById(C13997R.id.badge_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.badgeImg = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C13997R.id.eyebrow_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        final TextView textView = (TextView) viewFindViewById3;
        this.eyebrowTxt = textView;
        View viewFindViewById4 = findViewById(C13997R.id.title_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        final TextView textView2 = (TextView) viewFindViewById4;
        this.titleTxt = textView2;
        View viewFindViewById5 = findViewById(C13997R.id.body_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        final TextView textView3 = (TextView) viewFindViewById5;
        this.bodyTxt = textView3;
        View viewFindViewById6 = findViewById(C13997R.id.divider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.divider = viewFindViewById6;
        View viewFindViewById7 = findViewById(C13997R.id.footer_row);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        final RdsRowView rdsRowView = (RdsRowView) viewFindViewById7;
        this.footerRow = rdsRowView;
        this.backgroundSparkleMask = ViewsKt.getDrawable(this, C13997R.drawable.rds_celebration_card_sparkle_background_mask);
        this.eyebrowText = new MutablePropertyReference0Impl(textView) { // from class: com.robinhood.android.designsystem.card.RdsCelebrationCardView$eyebrowText$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((TextView) this.receiver).getText();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((TextView) this.receiver).setText((CharSequence) obj);
            }
        };
        this.titleText = new MutablePropertyReference0Impl(textView2) { // from class: com.robinhood.android.designsystem.card.RdsCelebrationCardView$titleText$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((TextView) this.receiver).getText();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((TextView) this.receiver).setText((CharSequence) obj);
            }
        };
        this.bodyText = new MutablePropertyReference0Impl(textView3) { // from class: com.robinhood.android.designsystem.card.RdsCelebrationCardView$bodyText$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return TextViewsKt.getVisibilityText((TextView) this.receiver);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                TextViewsKt.setVisibilityText((TextView) this.receiver, (CharSequence) obj);
            }
        };
        this.footerPrimaryText = new MutablePropertyReference0Impl(rdsRowView) { // from class: com.robinhood.android.designsystem.card.RdsCelebrationCardView$footerPrimaryText$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((RdsRowView) this.receiver).getPrimaryText();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((RdsRowView) this.receiver).setPrimaryText((CharSequence) obj);
            }
        };
        this.footerSecondaryText = new MutablePropertyReference0Impl(rdsRowView) { // from class: com.robinhood.android.designsystem.card.RdsCelebrationCardView$footerSecondaryText$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((RdsRowView) this.receiver).getSecondaryText();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((RdsRowView) this.receiver).setSecondaryText((CharSequence) obj);
            }
        };
        this.footerMetadataPrimaryText = new MutablePropertyReference0Impl(rdsRowView) { // from class: com.robinhood.android.designsystem.card.RdsCelebrationCardView$footerMetadataPrimaryText$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((RdsRowView) this.receiver).getMetadataPrimaryText();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((RdsRowView) this.receiver).setMetadataPrimaryText((CharSequence) obj);
            }
        };
        this.footerMetadataSecondaryText = new MutablePropertyReference0Impl(rdsRowView) { // from class: com.robinhood.android.designsystem.card.RdsCelebrationCardView$footerMetadataSecondaryText$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((RdsRowView) this.receiver).getMetadataSecondaryText();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((RdsRowView) this.receiver).setMetadataSecondaryText((CharSequence) obj);
            }
        };
        this.sparkleOverride = new MutablePropertyReference0Impl(sparkleMaskView) { // from class: com.robinhood.android.designsystem.card.RdsCelebrationCardView$sparkleOverride$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((SparkleMaskView) this.receiver).getSparkleOverride();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((SparkleMaskView) this.receiver).setSparkleOverride((ColorStateList) obj);
            }
        };
        int[] RdsCelebrationCardView = C13997R.styleable.RdsCelebrationCardView;
        Intrinsics.checkNotNullExpressionValue(RdsCelebrationCardView, "RdsCelebrationCardView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsCelebrationCardView, companion.getDefStyleAttr(), 0);
        setForegroundColor(typedArrayObtainStyledAttributes.getColorStateList(C13997R.styleable.RdsCelebrationCardView_cardForegroundColor));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final ColorStateList getForegroundColor() {
        return this.foregroundColor;
    }

    public final void setForegroundColor(ColorStateList colorStateList) {
        if (Intrinsics.areEqual(this.foregroundColor, colorStateList)) {
            return;
        }
        this.foregroundColor = colorStateList;
        ResourceValue resourceValue = new ResourceValue(ResourceType.COLOR_STATE_LIST.INSTANCE, colorStateList);
        ScarletManager2.overrideAttribute(this.badgeImg, R.attr.tint, resourceValue);
        ScarletManager2.overrideAttribute(this.eyebrowTxt, R.attr.textColor, resourceValue);
        ScarletManager2.overrideAttribute(this.titleTxt, R.attr.textColor, resourceValue);
        ScarletManager2.overrideAttribute(this.bodyTxt, R.attr.textColor, resourceValue);
        ScarletManager2.overrideAttribute(this.divider, R.attr.backgroundTint, resourceValue);
        RdsRowView rdsRowView = this.footerRow;
        rdsRowView.setPrimaryTextColor(resourceValue);
        rdsRowView.setSecondaryTextColor(resourceValue);
        rdsRowView.setPrimaryMetadataTextColor(resourceValue);
        rdsRowView.setSecondaryMetadataTextColor(resourceValue);
    }

    public final CharSequence getEyebrowText() {
        return (CharSequence) KProperties2.getValue(this.eyebrowText, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    public final void setEyebrowText(CharSequence charSequence) {
        KProperties2.setValue((KProperty3<CharSequence>) this.eyebrowText, this, (KProperty<?>) $$delegatedProperties[0], charSequence);
    }

    public final CharSequence getTitleText() {
        return (CharSequence) KProperties2.getValue(this.titleText, this, (KProperty<?>) $$delegatedProperties[1]);
    }

    public final void setTitleText(CharSequence charSequence) {
        KProperties2.setValue((KProperty3<CharSequence>) this.titleText, this, (KProperty<?>) $$delegatedProperties[1], charSequence);
    }

    public final CharSequence getBodyText() {
        return (CharSequence) KProperties2.getValue(this.bodyText, this, (KProperty<?>) $$delegatedProperties[2]);
    }

    public final void setBodyText(CharSequence charSequence) {
        KProperties2.setValue((KProperty3<CharSequence>) this.bodyText, this, (KProperty<?>) $$delegatedProperties[2], charSequence);
    }

    public final CharSequence getFooterPrimaryText() {
        return (CharSequence) KProperties2.getValue(this.footerPrimaryText, this, (KProperty<?>) $$delegatedProperties[3]);
    }

    public final void setFooterPrimaryText(CharSequence charSequence) {
        KProperties2.setValue((KProperty3<CharSequence>) this.footerPrimaryText, this, (KProperty<?>) $$delegatedProperties[3], charSequence);
    }

    public final CharSequence getFooterSecondaryText() {
        return (CharSequence) KProperties2.getValue(this.footerSecondaryText, this, (KProperty<?>) $$delegatedProperties[4]);
    }

    public final void setFooterSecondaryText(CharSequence charSequence) {
        KProperties2.setValue((KProperty3<CharSequence>) this.footerSecondaryText, this, (KProperty<?>) $$delegatedProperties[4], charSequence);
    }

    public final CharSequence getFooterMetadataPrimaryText() {
        return (CharSequence) KProperties2.getValue(this.footerMetadataPrimaryText, this, (KProperty<?>) $$delegatedProperties[5]);
    }

    public final void setFooterMetadataPrimaryText(CharSequence charSequence) {
        KProperties2.setValue((KProperty3<CharSequence>) this.footerMetadataPrimaryText, this, (KProperty<?>) $$delegatedProperties[5], charSequence);
    }

    public final CharSequence getFooterMetadataSecondaryText() {
        return (CharSequence) KProperties2.getValue(this.footerMetadataSecondaryText, this, (KProperty<?>) $$delegatedProperties[6]);
    }

    public final void setFooterMetadataSecondaryText(CharSequence charSequence) {
        KProperties2.setValue((KProperty3<CharSequence>) this.footerMetadataSecondaryText, this, (KProperty<?>) $$delegatedProperties[6], charSequence);
    }

    public final Model getModel() {
        return new Model(getEyebrowText(), getTitleText(), getBodyText(), getFooterPrimaryText(), getFooterSecondaryText(), getFooterMetadataPrimaryText(), getFooterMetadataSecondaryText());
    }

    public final void setModel(Model value) {
        Intrinsics.checkNotNullParameter(value, "value");
        bind(value);
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public Gradient getSparkleGradient() {
        return this.sparkleMaskView.getSparkleGradient();
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public void setSparkleGradient(Gradient gradient) {
        this.sparkleMaskView.setSparkleGradient(gradient);
        if (gradient != null) {
            if (Intrinsics.areEqual(this.sparkleMaskView.getBackground(), this.backgroundSparkleMask)) {
                return;
            }
            this.sparkleMaskView.setBackground(this.backgroundSparkleMask);
        } else if (this.sparkleMaskView.getBackground() != null) {
            this.sparkleMaskView.setBackground(null);
        }
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public ColorStateList getSparkleOverride() {
        return (ColorStateList) KProperties2.getValue(this.sparkleOverride, this, (KProperty<?>) $$delegatedProperties[7]);
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public void setSparkleOverride(ColorStateList colorStateList) {
        KProperties2.setValue((KProperty3<ColorStateList>) this.sparkleOverride, this, (KProperty<?>) $$delegatedProperties[7], colorStateList);
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(Model state) {
        Intrinsics.checkNotNullParameter(state, "state");
        setEyebrowText(state.getEyebrowText());
        setTitleText(state.getTitleText());
        setBodyText(state.getBodyText());
        setFooterPrimaryText(state.getFooterPrimaryText());
        setFooterSecondaryText(state.getFooterSecondaryText());
        setFooterMetadataPrimaryText(state.getFooterMetadataPrimaryText());
        setFooterMetadataSecondaryText(state.getFooterMetadataSecondaryText());
    }

    /* compiled from: RdsCelebrationCardView.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/designsystem/card/RdsCelebrationCardView$Model;", "", "eyebrowText", "", "titleText", "bodyText", "footerPrimaryText", "footerSecondaryText", "footerMetadataPrimaryText", "footerMetadataSecondaryText", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "getEyebrowText", "()Ljava/lang/CharSequence;", "getTitleText", "getBodyText", "getFooterPrimaryText", "getFooterSecondaryText", "getFooterMetadataPrimaryText", "getFooterMetadataSecondaryText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class Model {
        private final CharSequence bodyText;
        private final CharSequence eyebrowText;
        private final CharSequence footerMetadataPrimaryText;
        private final CharSequence footerMetadataSecondaryText;
        private final CharSequence footerPrimaryText;
        private final CharSequence footerSecondaryText;
        private final CharSequence titleText;

        public Model() {
            this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        }

        public static /* synthetic */ Model copy$default(Model model, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, CharSequence charSequence6, CharSequence charSequence7, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = model.eyebrowText;
            }
            if ((i & 2) != 0) {
                charSequence2 = model.titleText;
            }
            if ((i & 4) != 0) {
                charSequence3 = model.bodyText;
            }
            if ((i & 8) != 0) {
                charSequence4 = model.footerPrimaryText;
            }
            if ((i & 16) != 0) {
                charSequence5 = model.footerSecondaryText;
            }
            if ((i & 32) != 0) {
                charSequence6 = model.footerMetadataPrimaryText;
            }
            if ((i & 64) != 0) {
                charSequence7 = model.footerMetadataSecondaryText;
            }
            CharSequence charSequence8 = charSequence6;
            CharSequence charSequence9 = charSequence7;
            CharSequence charSequence10 = charSequence5;
            CharSequence charSequence11 = charSequence3;
            return model.copy(charSequence, charSequence2, charSequence11, charSequence4, charSequence10, charSequence8, charSequence9);
        }

        /* renamed from: component1, reason: from getter */
        public final CharSequence getEyebrowText() {
            return this.eyebrowText;
        }

        /* renamed from: component2, reason: from getter */
        public final CharSequence getTitleText() {
            return this.titleText;
        }

        /* renamed from: component3, reason: from getter */
        public final CharSequence getBodyText() {
            return this.bodyText;
        }

        /* renamed from: component4, reason: from getter */
        public final CharSequence getFooterPrimaryText() {
            return this.footerPrimaryText;
        }

        /* renamed from: component5, reason: from getter */
        public final CharSequence getFooterSecondaryText() {
            return this.footerSecondaryText;
        }

        /* renamed from: component6, reason: from getter */
        public final CharSequence getFooterMetadataPrimaryText() {
            return this.footerMetadataPrimaryText;
        }

        /* renamed from: component7, reason: from getter */
        public final CharSequence getFooterMetadataSecondaryText() {
            return this.footerMetadataSecondaryText;
        }

        public final Model copy(CharSequence eyebrowText, CharSequence titleText, CharSequence bodyText, CharSequence footerPrimaryText, CharSequence footerSecondaryText, CharSequence footerMetadataPrimaryText, CharSequence footerMetadataSecondaryText) {
            return new Model(eyebrowText, titleText, bodyText, footerPrimaryText, footerSecondaryText, footerMetadataPrimaryText, footerMetadataSecondaryText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Model)) {
                return false;
            }
            Model model = (Model) other;
            return Intrinsics.areEqual(this.eyebrowText, model.eyebrowText) && Intrinsics.areEqual(this.titleText, model.titleText) && Intrinsics.areEqual(this.bodyText, model.bodyText) && Intrinsics.areEqual(this.footerPrimaryText, model.footerPrimaryText) && Intrinsics.areEqual(this.footerSecondaryText, model.footerSecondaryText) && Intrinsics.areEqual(this.footerMetadataPrimaryText, model.footerMetadataPrimaryText) && Intrinsics.areEqual(this.footerMetadataSecondaryText, model.footerMetadataSecondaryText);
        }

        public int hashCode() {
            CharSequence charSequence = this.eyebrowText;
            int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.titleText;
            int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.bodyText;
            int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
            CharSequence charSequence4 = this.footerPrimaryText;
            int iHashCode4 = (iHashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
            CharSequence charSequence5 = this.footerSecondaryText;
            int iHashCode5 = (iHashCode4 + (charSequence5 == null ? 0 : charSequence5.hashCode())) * 31;
            CharSequence charSequence6 = this.footerMetadataPrimaryText;
            int iHashCode6 = (iHashCode5 + (charSequence6 == null ? 0 : charSequence6.hashCode())) * 31;
            CharSequence charSequence7 = this.footerMetadataSecondaryText;
            return iHashCode6 + (charSequence7 != null ? charSequence7.hashCode() : 0);
        }

        public String toString() {
            return "Model(eyebrowText=" + ((Object) this.eyebrowText) + ", titleText=" + ((Object) this.titleText) + ", bodyText=" + ((Object) this.bodyText) + ", footerPrimaryText=" + ((Object) this.footerPrimaryText) + ", footerSecondaryText=" + ((Object) this.footerSecondaryText) + ", footerMetadataPrimaryText=" + ((Object) this.footerMetadataPrimaryText) + ", footerMetadataSecondaryText=" + ((Object) this.footerMetadataSecondaryText) + ")";
        }

        public Model(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, CharSequence charSequence6, CharSequence charSequence7) {
            this.eyebrowText = charSequence;
            this.titleText = charSequence2;
            this.bodyText = charSequence3;
            this.footerPrimaryText = charSequence4;
            this.footerSecondaryText = charSequence5;
            this.footerMetadataPrimaryText = charSequence6;
            this.footerMetadataSecondaryText = charSequence7;
        }

        public /* synthetic */ Model(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, CharSequence charSequence6, CharSequence charSequence7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? null : charSequence3, (i & 8) != 0 ? null : charSequence4, (i & 16) != 0 ? null : charSequence5, (i & 32) != 0 ? null : charSequence6, (i & 64) != 0 ? null : charSequence7);
        }

        public final CharSequence getEyebrowText() {
            return this.eyebrowText;
        }

        public final CharSequence getTitleText() {
            return this.titleText;
        }

        public final CharSequence getBodyText() {
            return this.bodyText;
        }

        public final CharSequence getFooterPrimaryText() {
            return this.footerPrimaryText;
        }

        public final CharSequence getFooterSecondaryText() {
            return this.footerSecondaryText;
        }

        public final CharSequence getFooterMetadataPrimaryText() {
            return this.footerMetadataPrimaryText;
        }

        public final CharSequence getFooterMetadataSecondaryText() {
            return this.footerMetadataSecondaryText;
        }
    }

    /* compiled from: RdsCelebrationCardView.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/designsystem/card/RdsCelebrationCardView$Companion;", "Lcom/robinhood/scarlet/view/DefStyleProvider;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/designsystem/card/RdsCelebrationCardView;", "<init>", "()V", "defStyleAttr", "", "getDefStyleAttr", "()I", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion implements DefStyleProvider, Inflater<RdsCelebrationCardView> {
        private final /* synthetic */ Inflater<RdsCelebrationCardView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RdsCelebrationCardView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RdsCelebrationCardView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C13997R.layout.include_rds_celebration_card_view);
        }

        @Override // com.robinhood.scarlet.view.DefStyleProvider
        public int getDefStyleRes() {
            return DefStyleProvider.DefaultImpls.getDefStyleRes(this);
        }

        @Override // com.robinhood.scarlet.view.DefStyleProvider
        public int getDefStyleAttr() {
            return C20690R.attr.celebrationCardStyle;
        }
    }
}
