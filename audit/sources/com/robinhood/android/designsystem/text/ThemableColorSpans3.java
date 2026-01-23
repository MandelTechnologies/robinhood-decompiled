package com.robinhood.android.designsystem.text;

import android.content.res.ColorStateList;
import android.text.TextPaint;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceReferences5;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThemableColorSpans.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0014¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/designsystem/text/ThemableForegroundColorSpan;", "Lcom/robinhood/android/designsystem/text/ThemableColorSpan;", "reference", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "", "<init>", "(Lcom/robinhood/scarlet/util/resource/ResourceReference;)V", "updateDrawState", "", "paint", "Landroid/text/TextPaint;", ResourceTypes.COLOR, "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.designsystem.text.ThemableForegroundColorSpan, reason: use source file name */
/* loaded from: classes2.dex */
public final class ThemableColorSpans3 extends ThemableColorSpans2 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemableColorSpans3(ResourceReferences4<Integer> reference) {
        super(reference);
        Intrinsics.checkNotNullParameter(reference, "reference");
    }

    @Override // com.robinhood.android.designsystem.text.ThemableColorSpans2
    protected void updateDrawState(TextPaint paint, int color) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.setColor(color);
    }

    /* compiled from: ThemableColorSpans.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\u0002¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/designsystem/text/ThemableForegroundColorSpan$Companion;", "", "<init>", "()V", "invoke", "Lcom/robinhood/android/designsystem/text/ThemableForegroundColorSpan;", "reference", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Landroid/content/res/ColorStateList;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.designsystem.text.ThemableForegroundColorSpan$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ThemableColorSpans3 invoke(ResourceReferences4<? extends ColorStateList> reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            return new ThemableColorSpans3(ResourceReferences5.toColor(reference));
        }
    }
}
