package com.robinhood.android.designsystem.style;

import android.content.res.ColorStateList;
import com.robinhood.android.designsystem.selectioncontrol.RdsSwitch;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AttributeTransitions.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
/* synthetic */ class Defaults$switchTrackTint$1 extends FunctionReferenceImpl implements Function1<RdsSwitch, ColorStateList> {
    public static final Defaults$switchTrackTint$1 INSTANCE = new Defaults$switchTrackTint$1();

    Defaults$switchTrackTint$1() {
        super(1, RdsSwitch.class, "getTrackTintList", "getTrackTintList()Landroid/content/res/ColorStateList;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ColorStateList invoke(RdsSwitch p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.getTrackTintList();
    }
}
