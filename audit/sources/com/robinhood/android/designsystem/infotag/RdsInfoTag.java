package com.robinhood.android.designsystem.infotag;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.sparkle.SparkleDrawable;
import com.robinhood.android.designsystem.sparkle.Sparkleable;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.graphics.Gradient;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ResourceValue;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.scarlet.view.DefStyleProvider;
import com.robinhood.utils.extensions.KProperties2;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.extensions.TypedArrays3;
import com.robinhood.utils.extensions.ViewsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty3;

/* compiled from: RdsInfoTag.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0016\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0002IJB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010<\u001a\u00020=2\b\b\u0001\u0010>\u001a\u00020?J\u0010\u0010@\u001a\u00020=2\b\b\u0001\u0010>\u001a\u00020?J\u0012\u0010A\u001a\u00020=2\b\u0010B\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010C\u001a\u00020=2\b\u0010B\u001a\u0004\u0018\u00010*H\u0016J\b\u0010D\u001a\u00020=H\u0004J\u0010\u0010E\u001a\u00020=2\u0006\u0010F\u001a\u000206H\u0016J\u001c\u0010G\u001a\u0004\u0018\u00010*2\u0006\u00101\u001a\u0002002\b\u0010H\u001a\u0004\u0018\u00010*H\u0002R\u0014\u0010\t\u001a\u00020\nX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00148V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R/\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001c8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u001b\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010%\u001a\u0004\u0018\u00010$2\b\u0010#\u001a\u0004\u0018\u00010$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u0010+\u001a\u0004\u0018\u00010*2\b\u0010#\u001a\u0004\u0018\u00010*8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00101\u001a\u0002002\u0006\u0010#\u001a\u000200@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00107\u001a\u0002062\u0006\u0010#\u001a\u000206@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u000e\u0010;\u001a\u000206X\u0082D¢\u0006\u0002\n\u0000¨\u0006K"}, m3636d2 = {"Lcom/robinhood/android/designsystem/infotag/RdsInfoTag;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "Lcom/robinhood/android/designsystem/sparkle/Sparkleable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "infoTagText", "Lcom/robinhood/android/designsystem/text/RhTextView;", "getInfoTagText", "()Lcom/robinhood/android/designsystem/text/RhTextView;", "infoTagIcon", "Landroid/widget/ImageView;", "getInfoTagIcon", "()Landroid/widget/ImageView;", "sparkleDrawable", "Lcom/robinhood/android/designsystem/sparkle/SparkleDrawable;", "<set-?>", "Lcom/robinhood/android/graphics/Gradient;", "sparkleGradient", "getSparkleGradient", "()Lcom/robinhood/android/graphics/Gradient;", "setSparkleGradient", "(Lcom/robinhood/android/graphics/Gradient;)V", "sparkleGradient$delegate", "Lkotlin/reflect/KMutableProperty0;", "Landroid/content/res/ColorStateList;", "sparkleOverride", "getSparkleOverride", "()Landroid/content/res/ColorStateList;", "setSparkleOverride", "(Landroid/content/res/ColorStateList;)V", "sparkleOverride$delegate", "value", "", "text", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "getIconDrawable", "()Landroid/graphics/drawable/Drawable;", "setIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Lcom/robinhood/android/designsystem/infotag/RdsInfoTag$TagType;", "tagType", "getTagType", "()Lcom/robinhood/android/designsystem/infotag/RdsInfoTag$TagType;", "setTagType", "(Lcom/robinhood/android/designsystem/infotag/RdsInfoTag$TagType;)V", "", "isIconVisible", "()Z", "setIconVisible", "(Z)V", "isInitialized", "setTextColor", "", ResourceTypes.COLOR, "", "overrideBackgroundColor", "setBackground", "background", "setBackgroundDrawable", "overrideStyles", "setEnabled", "enabled", "getTagDrawable", "declaredDrawable", "TagType", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class RdsInfoTag extends RdsRippleContainerView implements Sparkleable {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(RdsInfoTag.class, "sparkleGradient", "getSparkleGradient()Lcom/robinhood/android/graphics/Gradient;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RdsInfoTag.class, "sparkleOverride", "getSparkleOverride()Landroid/content/res/ColorStateList;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ImageView infoTagIcon;
    private final RhTextView infoTagText;
    private boolean isIconVisible;
    private final boolean isInitialized;
    private final SparkleDrawable sparkleDrawable;

    /* renamed from: sparkleGradient$delegate, reason: from kotlin metadata */
    private final KProperty3 sparkleGradient;

    /* renamed from: sparkleOverride$delegate, reason: from kotlin metadata */
    private final KProperty3 sparkleOverride;
    private TagType tagType;

    /* compiled from: RdsInfoTag.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TagType.values().length];
            try {
                iArr[TagType.ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TagType.INFORM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TagType.INLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TagType.GOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ RdsInfoTag(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsInfoTag(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, INSTANCE.getDefStyleAttr());
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C13997R.layout.merge_rds_info_tag, this);
        View viewFindViewById = findViewById(C13997R.id.info_tag_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.infoTagText = (RhTextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C13997R.id.info_tag_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.infoTagIcon = (ImageView) viewFindViewById2;
        float f = getResources().getDisplayMetrics().density * 100.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        final SparkleDrawable sparkleDrawable = new SparkleDrawable(this, new RoundRectShape(fArr, null, null), attributeSet, 0, 8, null);
        this.sparkleDrawable = sparkleDrawable;
        this.sparkleGradient = new MutablePropertyReference0Impl(sparkleDrawable) { // from class: com.robinhood.android.designsystem.infotag.RdsInfoTag$sparkleGradient$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((SparkleDrawable) this.receiver).getSparkleGradient();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((SparkleDrawable) this.receiver).setSparkleGradient((Gradient) obj);
            }
        };
        this.sparkleOverride = new MutablePropertyReference0Impl(sparkleDrawable) { // from class: com.robinhood.android.designsystem.infotag.RdsInfoTag$sparkleOverride$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((SparkleDrawable) this.receiver).getSparkleOverride();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((SparkleDrawable) this.receiver).setSparkleOverride((ColorStateList) obj);
            }
        };
        this.tagType = TagType.ALERT;
        this.isIconVisible = true;
        int[] RdsInfoTag = C13997R.styleable.RdsInfoTag;
        Intrinsics.checkNotNullExpressionValue(RdsInfoTag, "RdsInfoTag");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsInfoTag, 0, 0);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsInfoTag_android_enabled, isEnabled()));
        Integer intOrNull = TypedArrays3.getIntOrNull(typedArrayObtainStyledAttributes, C13997R.styleable.RdsInfoTag_tagType);
        TagType tagType = intOrNull != null ? TagType.values()[intOrNull.intValue()] : null;
        setTagType(tagType == null ? this.tagType : tagType);
        this.infoTagIcon.setImageDrawable(getTagDrawable(this.tagType, typedArrayObtainStyledAttributes.getDrawable(C13997R.styleable.RdsInfoTag_tagIcon)));
        this.infoTagText.setText(typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsInfoTag_android_text));
        typedArrayObtainStyledAttributes.recycle();
        overrideStyles();
        setBackground(sparkleDrawable);
        setClipChildren(false);
        setClipToPadding(false);
        this.isInitialized = true;
    }

    protected final RhTextView getInfoTagText() {
        return this.infoTagText;
    }

    protected final ImageView getInfoTagIcon() {
        return this.infoTagIcon;
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public Gradient getSparkleGradient() {
        return (Gradient) KProperties2.getValue(this.sparkleGradient, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public void setSparkleGradient(Gradient gradient) {
        KProperties2.setValue((KProperty3<Gradient>) this.sparkleGradient, this, (KProperty<?>) $$delegatedProperties[0], gradient);
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public ColorStateList getSparkleOverride() {
        return (ColorStateList) KProperties2.getValue(this.sparkleOverride, this, (KProperty<?>) $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public void setSparkleOverride(ColorStateList colorStateList) {
        KProperties2.setValue((KProperty3<ColorStateList>) this.sparkleOverride, this, (KProperty<?>) $$delegatedProperties[1], colorStateList);
    }

    public final CharSequence getText() {
        return this.infoTagText.getText();
    }

    public final void setText(CharSequence charSequence) {
        this.infoTagText.setText(charSequence);
    }

    public final Drawable getIconDrawable() {
        return this.infoTagIcon.getDrawable();
    }

    public final void setIconDrawable(Drawable drawable) {
        this.infoTagIcon.setImageDrawable(drawable);
    }

    public final TagType getTagType() {
        return this.tagType;
    }

    public final void setTagType(TagType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.tagType = value;
        overrideStyles();
    }

    /* renamed from: isIconVisible, reason: from getter */
    public final boolean getIsIconVisible() {
        return this.isIconVisible;
    }

    public final void setIconVisible(boolean z) {
        this.isIconVisible = z;
        this.infoTagIcon.setVisibility(z ? 0 : 8);
    }

    public final void setTextColor(int color) {
        ScarletManager2.overrideAttribute(this.infoTagText, R.attr.textColor, new ResourceValue(ResourceType.COLOR.INSTANCE, Integer.valueOf(color)));
    }

    public final void overrideBackgroundColor(int color) {
        ScarletManager2.overrideAttribute(this, C13997R.attr.sparkleOverride, new ResourceValue(ResourceType.COLOR.INSTANCE, Integer.valueOf(color)));
    }

    @Override // com.robinhood.android.designsystem.container.RdsRippleContainerView, android.view.View
    public void setBackground(Drawable background) {
        if (this.isInitialized) {
            return;
        }
        super.setBackground(background);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable background) {
        if (this.isInitialized) {
            return;
        }
        super.setBackgroundDrawable(background);
    }

    protected final void overrideStyles() {
        RhTextView rhTextView = this.infoTagText;
        ResourceType.STYLE style = ResourceType.STYLE.INSTANCE;
        ScarletManager2.overrideStyle$default(rhTextView, new ThemedResourceReference(style, this.tagType.getTextStyle()), false, 2, null);
        ScarletManager2.overrideStyle$default(this.infoTagIcon, new ThemedResourceReference(style, this.tagType.getIconStyle()), false, 2, null);
        ScarletManager2.overrideStyle(this, new ThemedResourceReference(style, this.tagType.getContainerStyle()), false);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.infoTagText.setEnabled(enabled);
        this.infoTagIcon.setEnabled(enabled);
    }

    private final Drawable getTagDrawable(TagType tagType, Drawable declaredDrawable) {
        int i = WhenMappings.$EnumSwitchMapping$0[tagType.ordinal()];
        if (i == 1) {
            return ViewsKt.getDrawable(this, C20690R.drawable.ic_rds_triangle_alert_16dp);
        }
        if (i == 2 || i == 3) {
            return declaredDrawable == null ? ViewsKt.getDrawable(this, C20690R.drawable.ic_rds_info_filled_16dp) : declaredDrawable;
        }
        if (i == 4) {
            return declaredDrawable;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RdsInfoTag.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/designsystem/infotag/RdsInfoTag$TagType;", "", "containerStyle", "", "textStyle", "iconStyle", "<init>", "(Ljava/lang/String;IIII)V", "getContainerStyle", "()I", "getTextStyle", "getIconStyle", "ALERT", "INFORM", "INLINE", "GOLD", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TagType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TagType[] $VALUES;
        private final int containerStyle;
        private final int iconStyle;
        private final int textStyle;
        public static final TagType ALERT = new TagType("ALERT", 0, C20690R.attr.alertInfoTagStyle, C20690R.attr.alertInfoTagTextStyle, C20690R.attr.alertInfoTagIconStyle);
        public static final TagType INFORM = new TagType("INFORM", 1, C20690R.attr.informInfoTagStyle, C20690R.attr.informInfoTagTextStyle, C20690R.attr.informInfoTagIconStyle);
        public static final TagType INLINE = new TagType("INLINE", 2, C20690R.attr.inlineInfoTagStyle, C20690R.attr.inlineInfoTagTextStyle, C20690R.attr.inlineInfoTagIconStyle);
        public static final TagType GOLD = new TagType("GOLD", 3, C20690R.attr.goldInfoTagStyle, C20690R.attr.goldInfoTagTextStyle, C20690R.attr.goldInfoTagIconStyle);

        private static final /* synthetic */ TagType[] $values() {
            return new TagType[]{ALERT, INFORM, INLINE, GOLD};
        }

        public static EnumEntries<TagType> getEntries() {
            return $ENTRIES;
        }

        private TagType(String str, int i, int i2, int i3, int i4) {
            this.containerStyle = i2;
            this.textStyle = i3;
            this.iconStyle = i4;
        }

        public final int getContainerStyle() {
            return this.containerStyle;
        }

        public final int getIconStyle() {
            return this.iconStyle;
        }

        public final int getTextStyle() {
            return this.textStyle;
        }

        static {
            TagType[] tagTypeArr$values = $values();
            $VALUES = tagTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(tagTypeArr$values);
        }

        public static TagType valueOf(String str) {
            return (TagType) Enum.valueOf(TagType.class, str);
        }

        public static TagType[] values() {
            return (TagType[]) $VALUES.clone();
        }
    }

    /* compiled from: RdsInfoTag.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/designsystem/infotag/RdsInfoTag$Companion;", "Lcom/robinhood/scarlet/view/DefStyleProvider;", "<init>", "()V", "defStyleAttr", "", "getDefStyleAttr", "()I", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DefStyleProvider {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.scarlet.view.DefStyleProvider
        public int getDefStyleRes() {
            return DefStyleProvider.DefaultImpls.getDefStyleRes(this);
        }

        @Override // com.robinhood.scarlet.view.DefStyleProvider
        public int getDefStyleAttr() {
            return C20690R.attr.infoTagStyle;
        }
    }
}
