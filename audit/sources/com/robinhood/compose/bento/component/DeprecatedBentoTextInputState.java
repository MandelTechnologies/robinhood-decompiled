package com.robinhood.compose.bento.component;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoTextInput.kt */
@Deprecated
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001:\u00018Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003J\t\u00101\u001a\u00020\u0012HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jy\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00104\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0010HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019¨\u00069"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/DeprecatedBentoTextInputState;", "", "size", "Lcom/robinhood/compose/bento/component/DeprecatedBentoTextInputState$Size;", "value", "", "placeholderText", "enabled", "", "readOnly", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "errorText", "<init>", "(Lcom/robinhood/compose/bento/component/DeprecatedBentoTextInputState$Size;Ljava/lang/String;Ljava/lang/String;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Ljava/lang/String;)V", "getSize", "()Lcom/robinhood/compose/bento/component/DeprecatedBentoTextInputState$Size;", "getValue", "()Ljava/lang/String;", "getPlaceholderText", "getEnabled", "()Z", "getReadOnly", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;", "getKeyboardActions", "()Landroidx/compose/foundation/text/KeyboardActions;", "getSingleLine", "getMaxLines", "()I", "getVisualTransformation", "()Landroidx/compose/ui/text/input/VisualTransformation;", "getErrorText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "Size", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeprecatedBentoTextInputState {
    public static final int $stable = 0;
    private final boolean enabled;
    private final String errorText;
    private final KeyboardActions keyboardActions;
    private final KeyboardOptions keyboardOptions;
    private final int maxLines;
    private final String placeholderText;
    private final boolean readOnly;
    private final boolean singleLine;
    private final Size size;
    private final String value;
    private final VisualTransformation visualTransformation;

    public static /* synthetic */ DeprecatedBentoTextInputState copy$default(DeprecatedBentoTextInputState deprecatedBentoTextInputState, Size size, String str, String str2, boolean z, boolean z2, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            size = deprecatedBentoTextInputState.size;
        }
        if ((i2 & 2) != 0) {
            str = deprecatedBentoTextInputState.value;
        }
        if ((i2 & 4) != 0) {
            str2 = deprecatedBentoTextInputState.placeholderText;
        }
        if ((i2 & 8) != 0) {
            z = deprecatedBentoTextInputState.enabled;
        }
        if ((i2 & 16) != 0) {
            z2 = deprecatedBentoTextInputState.readOnly;
        }
        if ((i2 & 32) != 0) {
            keyboardOptions = deprecatedBentoTextInputState.keyboardOptions;
        }
        if ((i2 & 64) != 0) {
            keyboardActions = deprecatedBentoTextInputState.keyboardActions;
        }
        if ((i2 & 128) != 0) {
            z3 = deprecatedBentoTextInputState.singleLine;
        }
        if ((i2 & 256) != 0) {
            i = deprecatedBentoTextInputState.maxLines;
        }
        if ((i2 & 512) != 0) {
            visualTransformation = deprecatedBentoTextInputState.visualTransformation;
        }
        if ((i2 & 1024) != 0) {
            str3 = deprecatedBentoTextInputState.errorText;
        }
        VisualTransformation visualTransformation2 = visualTransformation;
        String str4 = str3;
        boolean z4 = z3;
        int i3 = i;
        KeyboardOptions keyboardOptions2 = keyboardOptions;
        KeyboardActions keyboardActions2 = keyboardActions;
        boolean z5 = z2;
        String str5 = str2;
        return deprecatedBentoTextInputState.copy(size, str, str5, z, z5, keyboardOptions2, keyboardActions2, z4, i3, visualTransformation2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    /* renamed from: component10, reason: from getter */
    public final VisualTransformation getVisualTransformation() {
        return this.visualTransformation;
    }

    /* renamed from: component11, reason: from getter */
    public final String getErrorText() {
        return this.errorText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPlaceholderText() {
        return this.placeholderText;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getReadOnly() {
        return this.readOnly;
    }

    /* renamed from: component6, reason: from getter */
    public final KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    /* renamed from: component7, reason: from getter */
    public final KeyboardActions getKeyboardActions() {
        return this.keyboardActions;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getSingleLine() {
        return this.singleLine;
    }

    /* renamed from: component9, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    public final DeprecatedBentoTextInputState copy(Size size, String value, String placeholderText, boolean enabled, boolean readOnly, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, VisualTransformation visualTransformation, String errorText) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(placeholderText, "placeholderText");
        Intrinsics.checkNotNullParameter(keyboardOptions, "keyboardOptions");
        Intrinsics.checkNotNullParameter(keyboardActions, "keyboardActions");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        return new DeprecatedBentoTextInputState(size, value, placeholderText, enabled, readOnly, keyboardOptions, keyboardActions, singleLine, maxLines, visualTransformation, errorText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeprecatedBentoTextInputState)) {
            return false;
        }
        DeprecatedBentoTextInputState deprecatedBentoTextInputState = (DeprecatedBentoTextInputState) other;
        return this.size == deprecatedBentoTextInputState.size && Intrinsics.areEqual(this.value, deprecatedBentoTextInputState.value) && Intrinsics.areEqual(this.placeholderText, deprecatedBentoTextInputState.placeholderText) && this.enabled == deprecatedBentoTextInputState.enabled && this.readOnly == deprecatedBentoTextInputState.readOnly && Intrinsics.areEqual(this.keyboardOptions, deprecatedBentoTextInputState.keyboardOptions) && Intrinsics.areEqual(this.keyboardActions, deprecatedBentoTextInputState.keyboardActions) && this.singleLine == deprecatedBentoTextInputState.singleLine && this.maxLines == deprecatedBentoTextInputState.maxLines && Intrinsics.areEqual(this.visualTransformation, deprecatedBentoTextInputState.visualTransformation) && Intrinsics.areEqual(this.errorText, deprecatedBentoTextInputState.errorText);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.size.hashCode() * 31) + this.value.hashCode()) * 31) + this.placeholderText.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.readOnly)) * 31) + this.keyboardOptions.hashCode()) * 31) + this.keyboardActions.hashCode()) * 31) + Boolean.hashCode(this.singleLine)) * 31) + Integer.hashCode(this.maxLines)) * 31) + this.visualTransformation.hashCode()) * 31;
        String str = this.errorText;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DeprecatedBentoTextInputState(size=" + this.size + ", value=" + this.value + ", placeholderText=" + this.placeholderText + ", enabled=" + this.enabled + ", readOnly=" + this.readOnly + ", keyboardOptions=" + this.keyboardOptions + ", keyboardActions=" + this.keyboardActions + ", singleLine=" + this.singleLine + ", maxLines=" + this.maxLines + ", visualTransformation=" + this.visualTransformation + ", errorText=" + this.errorText + ")";
    }

    public DeprecatedBentoTextInputState(Size size, String value, String placeholderText, boolean z, boolean z2, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, String str) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(placeholderText, "placeholderText");
        Intrinsics.checkNotNullParameter(keyboardOptions, "keyboardOptions");
        Intrinsics.checkNotNullParameter(keyboardActions, "keyboardActions");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        this.size = size;
        this.value = value;
        this.placeholderText = placeholderText;
        this.enabled = z;
        this.readOnly = z2;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActions = keyboardActions;
        this.singleLine = z3;
        this.maxLines = i;
        this.visualTransformation = visualTransformation;
        this.errorText = str;
    }

    public final Size getSize() {
        return this.size;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getPlaceholderText() {
        return this.placeholderText;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public /* synthetic */ DeprecatedBentoTextInputState(Size size, String str, String str2, boolean z, boolean z2, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(size, str, str2, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions, (i2 & 64) != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions, (i2 & 128) != 0 ? true : z3, (i2 & 256) != 0 ? Integer.MAX_VALUE : i, (i2 & 512) != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation, (i2 & 1024) != 0 ? null : str3);
    }

    public final KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    public final KeyboardActions getKeyboardActions() {
        return this.keyboardActions;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final VisualTransformation getVisualTransformation() {
        return this.visualTransformation;
    }

    public final String getErrorText() {
        return this.errorText;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BentoTextInput.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B9\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0016\u0010\u000ej\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/DeprecatedBentoTextInputState$Size;", "", "horizontalInternalPadding", "Landroidx/compose/ui/unit/Dp;", "verticalInternalPadding", "minHeight", "shape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "errorTextSpacing", "<init>", "(Ljava/lang/String;IFFFLandroidx/compose/foundation/shape/RoundedCornerShape;Landroidx/compose/ui/Alignment;F)V", "getHorizontalInternalPadding-D9Ej5fM", "()F", "F", "getVerticalInternalPadding-D9Ej5fM", "getMinHeight-D9Ej5fM", "getShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "getContentAlignment", "()Landroidx/compose/ui/Alignment;", "getErrorTextSpacing-D9Ej5fM", "Standard", "Hero", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* loaded from: classes20.dex */
    public static final class Size {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size Hero;
        public static final Size Standard;
        private final Alignment contentAlignment;
        private final float errorTextSpacing;
        private final float horizontalInternalPadding;
        private final float minHeight;
        private final RoundedCornerShape shape;
        private final float verticalInternalPadding;

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{Standard, Hero};
        }

        public static EnumEntries<Size> getEntries() {
            return $ENTRIES;
        }

        private Size(String str, int i, float f, float f2, float f3, RoundedCornerShape roundedCornerShape, Alignment alignment, float f4) {
            this.horizontalInternalPadding = f;
            this.verticalInternalPadding = f2;
            this.minHeight = f3;
            this.shape = roundedCornerShape;
            this.contentAlignment = alignment;
            this.errorTextSpacing = f4;
        }

        /* renamed from: getHorizontalInternalPadding-D9Ej5fM, reason: not valid java name and from getter */
        public final float getHorizontalInternalPadding() {
            return this.horizontalInternalPadding;
        }

        /* renamed from: getVerticalInternalPadding-D9Ej5fM, reason: not valid java name and from getter */
        public final float getVerticalInternalPadding() {
            return this.verticalInternalPadding;
        }

        /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name and from getter */
        public final float getMinHeight() {
            return this.minHeight;
        }

        public final RoundedCornerShape getShape() {
            return this.shape;
        }

        public final Alignment getContentAlignment() {
            return this.contentAlignment;
        }

        /* renamed from: getErrorTextSpacing-D9Ej5fM, reason: not valid java name and from getter */
        public final float getErrorTextSpacing() {
            return this.errorTextSpacing;
        }

        static {
            float f = 16;
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(f);
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(10);
            float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(44);
            float f2 = 8;
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f2));
            Alignment.Companion companion = Alignment.INSTANCE;
            Standard = new Size("Standard", 0, fM7995constructorimpl, fM7995constructorimpl2, fM7995constructorimpl3, roundedCornerShapeM5327RoundedCornerShape0680j_4, companion.getCenterStart(), C2002Dp.m7995constructorimpl(4));
            Hero = new Size("Hero", 1, C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(14), C2002Dp.m7995constructorimpl(56), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f2)), companion.getCenter(), C2002Dp.m7995constructorimpl(f2));
            Size[] sizeArr$values = $values();
            $VALUES = sizeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sizeArr$values);
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }
}
