package com.robinhood.android.jointaccounts.onboarding;

import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JointAccountCelebrationScreen.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/JointAccountCelebrationScreenTextStyleData;", "", "titleStyle", "Landroidx/compose/ui/text/TextStyle;", "titleAndBodySpacing", "Landroidx/compose/ui/unit/Dp;", "<init>", "(Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTitleStyle", "()Landroidx/compose/ui/text/TextStyle;", "getTitleAndBodySpacing-D9Ej5fM", "()F", "F", "component1", "component2", "component2-D9Ej5fM", "copy", "copy-3ABfNKs", "(Landroidx/compose/ui/text/TextStyle;F)Lcom/robinhood/android/jointaccounts/onboarding/JointAccountCelebrationScreenTextStyleData;", "equals", "", "other", "hashCode", "", "toString", "", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class JointAccountCelebrationScreenTextStyleData {
    public static final int $stable = 0;
    private final float titleAndBodySpacing;
    private final TextStyle titleStyle;

    public /* synthetic */ JointAccountCelebrationScreenTextStyleData(TextStyle textStyle, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(textStyle, f);
    }

    /* renamed from: copy-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ JointAccountCelebrationScreenTextStyleData m15760copy3ABfNKs$default(JointAccountCelebrationScreenTextStyleData jointAccountCelebrationScreenTextStyleData, TextStyle textStyle, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            textStyle = jointAccountCelebrationScreenTextStyleData.titleStyle;
        }
        if ((i & 2) != 0) {
            f = jointAccountCelebrationScreenTextStyleData.titleAndBodySpacing;
        }
        return jointAccountCelebrationScreenTextStyleData.m15762copy3ABfNKs(textStyle, f);
    }

    /* renamed from: component1, reason: from getter */
    public final TextStyle getTitleStyle() {
        return this.titleStyle;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTitleAndBodySpacing() {
        return this.titleAndBodySpacing;
    }

    /* renamed from: copy-3ABfNKs, reason: not valid java name */
    public final JointAccountCelebrationScreenTextStyleData m15762copy3ABfNKs(TextStyle titleStyle, float titleAndBodySpacing) {
        Intrinsics.checkNotNullParameter(titleStyle, "titleStyle");
        return new JointAccountCelebrationScreenTextStyleData(titleStyle, titleAndBodySpacing, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JointAccountCelebrationScreenTextStyleData)) {
            return false;
        }
        JointAccountCelebrationScreenTextStyleData jointAccountCelebrationScreenTextStyleData = (JointAccountCelebrationScreenTextStyleData) other;
        return Intrinsics.areEqual(this.titleStyle, jointAccountCelebrationScreenTextStyleData.titleStyle) && C2002Dp.m7997equalsimpl0(this.titleAndBodySpacing, jointAccountCelebrationScreenTextStyleData.titleAndBodySpacing);
    }

    public int hashCode() {
        return (this.titleStyle.hashCode() * 31) + C2002Dp.m7998hashCodeimpl(this.titleAndBodySpacing);
    }

    public String toString() {
        return "JointAccountCelebrationScreenTextStyleData(titleStyle=" + this.titleStyle + ", titleAndBodySpacing=" + C2002Dp.m7999toStringimpl(this.titleAndBodySpacing) + ")";
    }

    private JointAccountCelebrationScreenTextStyleData(TextStyle titleStyle, float f) {
        Intrinsics.checkNotNullParameter(titleStyle, "titleStyle");
        this.titleStyle = titleStyle;
        this.titleAndBodySpacing = f;
    }

    public final TextStyle getTitleStyle() {
        return this.titleStyle;
    }

    /* renamed from: getTitleAndBodySpacing-D9Ej5fM, reason: not valid java name */
    public final float m15763getTitleAndBodySpacingD9Ej5fM() {
        return this.titleAndBodySpacing;
    }
}
