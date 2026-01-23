package com.robinhood.scarlet.transition.attribute;

import android.content.res.ColorStateList;
import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultAttributeTransitions.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions$OfProgressBar$progressBackgroundTint$1 */
/* loaded from: classes21.dex */
/* synthetic */ class C37287xa755f139 extends FunctionReferenceImpl implements Function1<ProgressBar, ColorStateList> {
    public static final C37287xa755f139 INSTANCE = new C37287xa755f139();

    C37287xa755f139() {
        super(1, ProgressBar.class, "getProgressBackgroundTintList", "getProgressBackgroundTintList()Landroid/content/res/ColorStateList;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ColorStateList invoke(ProgressBar p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.getProgressBackgroundTintList();
    }
}
