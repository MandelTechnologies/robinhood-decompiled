package com.robinhood.android.common.mcduckling.p084ui;

import android.content.Context;
import android.util.AttributeSet;
import com.robinhood.android.common.mcduckling.C11257R;
import com.robinhood.android.common.p088ui.BindResourcesKt;
import com.robinhood.android.designsystem.text.RhTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: ObscuredTextView.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012J\u001a\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/ObscuredTextView;", "Lcom/robinhood/android/designsystem/text/RhTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "obscuringCharacter", "", "getObscuringCharacter", "()Ljava/lang/String;", "obscuringCharacter$delegate", "Lkotlin/properties/ReadOnlyProperty;", "setText", "", "text", "obscured", "", "obscureText", "visibleSuffixLength", "", "Companion", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ObscuredTextView extends RhTextView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ObscuredTextView.class, "obscuringCharacter", "getObscuringCharacter()Ljava/lang/String;", 0))};
    private static final int VISIBLE_SUFFIX_LENGTH = 4;

    /* renamed from: obscuringCharacter$delegate, reason: from kotlin metadata */
    private final Interfaces2 obscuringCharacter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObscuredTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.obscuringCharacter = BindResourcesKt.bindString(this, C11257R.string.account_number_obscuring_character);
    }

    private final String getObscuringCharacter() {
        return (String) this.obscuringCharacter.getValue(this, $$delegatedProperties[0]);
    }

    public final void setText(String text, boolean obscured) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (obscured) {
            text = obscureText$default(this, text, 0, 2, null);
        }
        setText(text);
    }

    static /* synthetic */ String obscureText$default(ObscuredTextView obscuredTextView, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        return obscuredTextView.obscureText(str, i);
    }

    private final String obscureText(String text, int visibleSuffixLength) {
        if (text.length() > visibleSuffixLength) {
            int length = text.length() - visibleSuffixLength;
            String strRepeat = StringsKt.repeat(getObscuringCharacter(), length);
            String strSubstring = text.substring(length);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strRepeat + strSubstring;
        }
        return StringsKt.repeat(getObscuringCharacter(), text.length());
    }
}
